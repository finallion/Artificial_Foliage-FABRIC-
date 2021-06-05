package com.finallion.artificialfoliage.block;


import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.utils.BlockMapping;
import com.finallion.artificialfoliage.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

import java.util.*;

public class ARFOSpreadableSlab extends SlabBlock implements Fertilizable {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;
    public static final BooleanProperty SNOWY;
    public static final EnumProperty<DoubleBlockHalf> HALF = net.minecraft.state.property.Properties.DOUBLE_BLOCK_HALF;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    public ARFOSpreadableSlab(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false).with(SNOWY, false));
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        return direction != Direction.UP ? super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom) : (BlockState)state.with(SNOWY, newState.isOf(Blocks.SNOW_BLOCK) || newState.isOf(Blocks.SNOW));
    }


    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        if (state.getBlock().is(ARFOBlocks.MYCELIUM_SLAB) || state.getBlock().is(ARFOBlocks.GRASS_SLAB) || state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
            return false;
        }
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        if (state.getBlock().is(ARFOBlocks.MYCELIUM_SLAB) || state.getBlock().is(ARFOBlocks.GRASS_SLAB) || state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
            return false;
        }
        return true;
    }


    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(pos);
        BlockState failState = Blocks.AIR.getDefaultState();
        MapUtils.initMap(grassFeatures);
        boolean large = false;
        List<Block> features = new ArrayList<>();

        for (Block b1 : BlockMapping.slabAndBlocks.keySet()) {
            if (BlockMapping.slabAndBlocks.get(b1).is(blockState.getBlock())) {
                features = grassFeatures.get(b1);
            }
        }


        label48:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!(world.getBlockState(blockPos2.down()).getBlock() instanceof ARFOSpreadableBlock) || world.getBlockState(blockPos2).isFullCube(world, blockPos2)) {
                    continue label48;
                }
            }
            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                ((ARFOSpreadableBlock)blockState.getBlock()).grow(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                if (blockState2.get(TYPE) != SlabType.BOTTOM) ((ARFOSpreadableBlock)blockState.getBlock()).grow(world, random, blockPos2, blockState2);
            }


            if (blockState2.isAir()) {
                BlockState blockState4 = failState;


                int rand = random.nextInt(80);
                if (rand < 10) {
                    blockState4 = features.get(0).getDefaultState();
                } else if (rand < 30) {
                    blockState4 = features.get(1).getDefaultState();
                } else if (rand < 35) {
                    if (world.getBlockState(blockPos2.up()).isAir()) {
                        blockState4 = features.get(2).getDefaultState().with(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 40) {
                    if (world.getBlockState(blockPos2.up()).isAir()) {
                        blockState4 = features.get(3).getDefaultState().with(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 45) {
                    blockState4 = features.get(random.nextInt(features.size() / 2) + 4).getDefaultState();
                }

                if (blockState4.canPlaceAt(world, blockPos2) && world.getBlockState(blockPos2).isAir()) {
                    world.setBlockState(blockPos2, blockState4, 3);
                    if (large) {
                        world.setBlockState(blockPos2.up(), blockState4.getBlock().getDefaultState().with(HALF, DoubleBlockHalf.UPPER), 3);
                    }
                    large = false;
                }
            }
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            setToDirt(world, pos);
        } else doTick(state, world, pos, random);
    }



    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos posUp = pos.up();
        BlockState stateUp = world.getBlockState(posUp);

        if (stateUp.getBlock() == Blocks.SNOW && (Integer) stateUp.get(SnowBlock.LAYERS) >= 1) {
            return false;
        } else if (state.getBlock() instanceof ARFOSpreadableSlab && (state.get(WATERLOGGED) && state.get(TYPE) != SlabType.TOP && world.getFluidState(posUp).isIn(FluidTags.WATER)) || stateUp.getFluidState().getLevel() == 8) {
            return false;
        } else if (state.getBlock() instanceof ARFOSpreadableSlab && !stateUp.getMaterial().isSolid() && state.get(TYPE) == SlabType.TOP) {
            return true;
        } else {
            if (stateUp.getBlock() instanceof ARFOLeavesCarpetBlock || stateUp.getBlock() instanceof LeavesBlock) {
                return true;
            }
            // dont know why non opaque leaves kill the grass
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, stateUp, posUp, Direction.UP, stateUp.getOpacity(world, posUp));
            return i < world.getMaxLightLevel();
        }
    }


    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        return canSurvive(state, world, pos) && !world.getFluidState(pos.up()).isIn(FluidTags.WATER) && !(state.getBlock() instanceof ARFOSpreadableSlab && state.get(WATERLOGGED) && state.get(TYPE) == SlabType.BOTTOM);
    }

    public static void setToDirt(World world, BlockPos pos){
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block instanceof ARFOSpreadableStoneSlab) {
            world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)), 3);
        } else if (block instanceof ARFOSpreadableNetherrackSlab) {
            world.setBlockState(pos, ARFOBlocks.NETHERRACK_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)), 3);
        } else if (block.is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
            world.setBlockState(pos, BYGBlocks.BYG_MEADOW_DIRT_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)), 3);
        } else if (block instanceof ARFOSpreadableGrassSlab) {
            world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)), 3);
        } else {
            world.setBlockState(pos, ARFOBlocks.DIRT_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED)), 3);
        }

    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canSurvive(state, world, pos)) {
            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);

                if (canSpread(state, world, newPos)) {


                    if (newState.isOf(Blocks.DIRT)) { // vanilla grass slab/mycelium to dirt
                        if ((state.getBlock().is(ARFOBlocks.GRASS_SLAB) || state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            world.setBlockState(newPos, Blocks.GRASS_BLOCK.getDefaultState(), 3);
                        } else if (state.getBlock().is(ARFOBlocks.MYCELIUM_SLAB)) {
                            world.setBlockState(newPos, Blocks.MYCELIUM.getDefaultState(), 3);
                        }

                    } else if (newState.isOf(ARFOBlocks.DIRT_SLAB)) { // grass slab/mycelium slab to dirt slab
                        if (state.getBlock().is(ARFOBlocks.GRASS_SLAB) && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            if (newState.get(TYPE) == SlabType.BOTTOM) {
                                if (!newState.get(WATERLOGGED)) world.setBlockState(newPos, ARFOBlocks.GRASS_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlockState(newPos, ARFOBlocks.GRASS_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                            }
                        }

                        if (state.getBlock() == ARFOBlocks.MYCELIUM_SLAB && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            if (newState.get(TYPE) == SlabType.BOTTOM) {
                                if (!newState.get(WATERLOGGED)) world.setBlockState(newPos, ARFOBlocks.MYCELIUM_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlockState(newPos, ARFOBlocks.MYCELIUM_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                            }
                        }

                    } else if (newState.isOf(BYGBlocks.BYG_MEADOW_DIRT_SLAB)) { // meadow grass slab to meadow dirt slab
                        if (state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB) && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            if (newState.get(TYPE) == SlabType.BOTTOM) {
                                if (!newState.get(WATERLOGGED)) world.setBlockState(newPos, BYGBlocks.BYG_MEADOW_GRASS_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlockState(newPos, BYGBlocks.BYG_MEADOW_GRASS_SLAB.getDefaultState().with(SlabBlock.TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                            }
                        }
                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_SOIL)) { // arfo grass slab to arfo dirt
                        if (state.getBlock() instanceof ARFOSpreadableGrassSlab && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (BlockMapping.slabAndBlocks.get(b).getDefaultState().getBlock() == state.getBlock()) {
                                    newState = b.getDefaultState();
                                    break;
                                }
                            }
                            world.setBlockState(newPos, newState, 3);
                        }
                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) { // arfo grass slab to arfo dirt slab
                        if (state.getBlock() instanceof ARFOSpreadableGrassSlab) {
                            world.setBlockState(newPos, state.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                        }
                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_STONE_SOIL)) { // arfo stone slab to arfo stone soil
                        if (state.getBlock() instanceof ARFOSpreadableStoneSlab && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (BlockMapping.slabAndBlocks.get(b).getDefaultState().getBlock() == state.getBlock()) {
                                    newState = b.getDefaultState();
                                    break;
                                }
                            }
                            world.setBlockState(newPos, newState, 3);
                        }

                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB)) { // arfo stone slab to arfo stone soil slab
                        if (state.getBlock() instanceof ARFOSpreadableStoneSlab) {
                            world.setBlockState(newPos, state.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                        }
                    } else if (newState.isOf(Blocks.NETHERRACK)) { // arfo overgrown netherrack slab to netherrack
                        if (state.getBlock() instanceof ARFOSpreadableNetherrackSlab && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (BlockMapping.slabAndBlocks.get(b).getDefaultState().getBlock() == state.getBlock()) {
                                    newState = b.getDefaultState();
                                    break;
                                }
                            }
                            world.setBlockState(newPos, newState, 3);
                        }

                    } else if (newState.isOf(ARFOBlocks.NETHERRACK_SLAB)) { // arfo overgrown netherrack slab to netherrack slab
                        if (state.getBlock() instanceof ARFOSpreadableNetherrackSlab) {
                            world.setBlockState(newPos, state.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                        }
                    }
                }
            }
        }
    }



    static {
        TYPE = Properties.SLAB_TYPE;
        SNOWY = Properties.SNOWY;
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
