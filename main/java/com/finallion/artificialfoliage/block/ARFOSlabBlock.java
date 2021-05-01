package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ModBlocks;
import com.finallion.artificialfoliage.utils.BlockMapping;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.Random;

public class ARFOSlabBlock extends SlabBlock {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;
    public static final BooleanProperty SNOWY;


    public ARFOSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false).with(SNOWY, false));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            setToDirt(world, pos);
        } else doTick(state, world, pos, random);
    }

    public static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos posUp = pos.up();
        BlockState stateUp = world.getBlockState(posUp);

        if (stateUp.getBlock() == Blocks.SNOW && (Integer) stateUp.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else if (state.getBlock() instanceof ARFOSlabBlock && !stateUp.isOpaque() && state.get(TYPE) == SlabType.TOP) {
            return true;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, stateUp, posUp, Direction.UP, stateUp.getOpacity(world, posUp));

            return i < world.getMaxLightLevel();
        }
    }

    public static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        return canSurvive(state, world, pos) && !world.getFluidState(pos.up()).isIn(FluidTags.WATER) && !(state.getBlock() instanceof ARFOSlabBlock && state.get(WATERLOGGED) && state.get(TYPE) == SlabType.BOTTOM);
    }

    public static void setToDirt(World world, BlockPos pos){
        BlockState state = world.getBlockState(pos);

        if (state.getBlock().getClass() == ARFOSlabBlock.class) world.setBlockState(pos, ModBlocks.DIRT_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)));
        else if (state.getBlock() instanceof ARFOGrassBlockSlab) world.setBlockState(pos, ModBlocks.ARTIFICIAL_SOIL_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)));
        else if (state.getBlock() instanceof ARFOGrassBlock || state.getBlock() instanceof ARFOGlowingGrassBlock) world.setBlockState(pos, ModBlocks.ARTIFICIAL_SOIL.getDefaultState());
        else {
            world.setBlockState(pos, Blocks.DIRT.getDefaultState());
        }
    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canSurvive(state, world, pos) && world.getLightLevel(pos.up()) >= 9) {
            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);

                if (ARFOSlabBlock.canSpread(state, world, newPos)) {
                    if (state.getBlock().getClass() == ARFOGrassBlockSlab.class && newState.isOf(ModBlocks.ARTIFICIAL_SOIL)) {
                        for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                            if (BlockMapping.slabAndBlocks.get(b).getDefaultState().getBlock() == state.getBlock()) {
                                newState = b.getDefaultState();
                            }
                        }
                        if (!world.getBlockState(newPos.up()).isOpaque()) world.setBlockState(newPos, newState);
                    } else if (state.getBlock() == ModBlocks.GRASS_SLAB && newState.isOf(Blocks.DIRT)) {
                        if (!world.getBlockState(newPos.up()).isOpaque()) world.setBlockState(newPos, Blocks.GRASS_BLOCK.getDefaultState());
                    } else if (state.getBlock() == ModBlocks.MYCELIUM_SLAB && newState.isOf(Blocks.DIRT)) {
                        if (!world.getBlockState(newPos.up()).isOpaque()) world.setBlockState(newPos, Blocks.MYCELIUM.getDefaultState());
                    } else if ((state.getBlock() instanceof ARFOGrassBlock || state.getBlock().getClass() == ARFOGrassBlockSlab.class) && newState.isOf(ModBlocks.ARTIFICIAL_SOIL_SLAB)) {
                        BlockState matchingSlabState = newState;
                        for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                            if (BlockMapping.slabAndBlocks.get(b).getDefaultState().getBlock() == state.getBlock())
                                matchingSlabState = BlockMapping.slabAndBlocks.get(b).getDefaultState();
                        }

                        // spreadable to top and double slabs which are waterlogged
                        if (!world.getBlockState(newPos.up()).isOpaque()) {
                            if (newState.get(TYPE) == SlabType.BOTTOM) {
                                if (!newState.get(WATERLOGGED)) world.setBlockState(newPos, matchingSlabState.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)));
                            } else {
                                world.setBlockState(newPos, matchingSlabState.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)));
                            }

                        }

                    } else if ((state.getBlock() == Blocks.GRASS_BLOCK || state.getBlock() == ModBlocks.GRASS_SLAB) && newState.isOf(ModBlocks.DIRT_SLAB)) {

                        if (!world.getBlockState(newPos.up()).isOpaque()) {
                            if (newState.get(TYPE) == SlabType.BOTTOM) {
                                if (!newState.get(WATERLOGGED)) world.setBlockState(newPos, ModBlocks.GRASS_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)));
                            } else {
                                world.setBlockState(newPos, ModBlocks.GRASS_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)));
                            }

                        }


                    } else if ((state.getBlock() == Blocks.MYCELIUM || state.getBlock() == ModBlocks.MYCELIUM_SLAB) && newState.isOf(ModBlocks.DIRT_SLAB)) {
                        if (!world.getBlockState(newPos.up()).isOpaque()) {
                            if (newState.get(TYPE) == SlabType.BOTTOM) {
                                if (!newState.get(WATERLOGGED)) world.setBlockState(newPos, ModBlocks.MYCELIUM_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)));
                            } else {
                                world.setBlockState(newPos, ModBlocks.MYCELIUM_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)));
                            }

                        }
                    }
                }
            }
        }
    }


    // SnowyBlock method
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        return direction != Direction.UP ? super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom) : (BlockState)state.with(SNOWY, newState.isOf(Blocks.SNOW_BLOCK) || newState.isOf(Blocks.SNOW));
    }


    // SlabBlock method
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx);
    }


    // netherrack method
    public void grow(World world, Random random, BlockPos pos, BlockState state) {
        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();
        boolean found = false;
        BlockState blockState = world.getBlockState(pos);
        BlockState changeState = world.getBlockState(pos);

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            changeState = world.getBlockState(blockPos);
            if (changeState.getBlock() instanceof ARFOGrassBlockSlab) {
                found = true;
                break;
            }
        }
        if (!world.isClient() && found) {
            world.setBlockState(pos, changeState.with(TYPE, blockState.get(SlabBlock.TYPE)), 3);
        }

    }




    static {
        TYPE = Properties.SLAB_TYPE;
        WATERLOGGED = Properties.WATERLOGGED;
        SNOWY = Properties.SNOWY;
    }
}
