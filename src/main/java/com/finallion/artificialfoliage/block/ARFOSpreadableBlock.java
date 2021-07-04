package com.finallion.artificialfoliage.block;


import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.utils.BlockMapping;
import com.finallion.artificialfoliage.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

import java.util.*;

public class ARFOSpreadableBlock extends SpreadableBlock implements Fertilizable {
    public static final EnumProperty<DoubleBlockHalf> HALF;
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty SNOWY;
    public static final BooleanProperty WATERLOGGED;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    protected ARFOSpreadableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        if (state.isOf(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
            return false;
        }
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        if (state.isOf(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
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

        for (Block b2 : grassFeatures.keySet()) {
            if (blockState.isOf(b2)) features = grassFeatures.get(b2);
        }

        label48:
        for (int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!(world.getBlockState(blockPos2.down()).getBlock() instanceof ARFOSpreadableBlock) || world.getBlockState(blockPos2).isFullCube(world, blockPos2)) {
                    continue label48;
                }
            }
            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                ((ARFOSpreadableBlock) blockState.getBlock()).grow(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                if (blockState2.get(TYPE) != SlabType.BOTTOM) {
                    ((ARFOSpreadableBlock) blockState.getBlock()).grow(world, random, blockPos2, blockState2);
                }
            }


            if (blockState2.isOf(Blocks.AIR)) {
                BlockState blockState4 = failState;
                int rand = random.nextInt(80);
                if (rand < 10) {
                    blockState4 = features.get(0).getDefaultState();
                } else if (rand < 30) {
                    blockState4 = features.get(1).getDefaultState();
                } else if (rand < 35) {
                    if (world.getBlockState(blockPos2.up()).isOf(Blocks.AIR)) {
                        blockState4 = features.get(2).getDefaultState().with(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 40) {
                    if (world.getBlockState(blockPos2.up()).isOf(Blocks.AIR)) {
                        blockState4 = features.get(3).getDefaultState().with(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                // TODO: increase leaf carpets spawn when recipes got removed
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

    public static void setToDirt(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block instanceof ARFOSpreadableGrassBlock|| block instanceof ARFOGlowingGrassBlock) {
            world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_SOIL.getDefaultState(), 3);
        } else if (block instanceof ARFOSpreadableStoneBlock) {
            world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_STONE_SOIL.getDefaultState(), 3);
        } else if (block instanceof ARFOSpreadableNetherrackBlock) {
            world.setBlockState(pos, Blocks.NETHERRACK.getDefaultState(), 3);
        } else {
            world.setBlockState(pos, Blocks.DIRT.getDefaultState(), 3);
        }
    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canSurvive(state, world, pos)) {

            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);

                if (canSpread(state, world, newPos)) {
                    if (newState.isOf(ARFOBlocks.ARTIFICIAL_SOIL)) { // arfo grass block to arfo dirt
                        if ((state.getBlock() instanceof ARFOSpreadableGrassBlock || state.getBlock() instanceof ARFOGlowingGrassBlock) && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            world.setBlockState(newPos, state.getBlock().getDefaultState(), 3);
                        }
                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) { // arfo grass block to arfo dirt slab
                        BlockState matchingSlab = newState;

                        if ((state.getBlock() instanceof ARFOSpreadableGrassBlock || state.getBlock() instanceof ARFOGlowingGrassBlock) && !state.isOf(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (b == state.getBlock()) {
                                    matchingSlab = BlockMapping.slabAndBlocks.get(b).getDefaultState();
                                }
                            }

                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                                if (newState.get(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.get(WATERLOGGED))
                                        world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        }
                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_STONE_SOIL)) { // arfo stone to arfo stone soil
                        if (state.getBlock() instanceof ARFOSpreadableStoneBlock && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            world.setBlockState(newPos, state.getBlock().getDefaultState(), 3);
                        }

                    } else if (newState.isOf(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB)) { // arfo stone to arfo stone soil slab
                        BlockState matchingSlab = newState;


                        if (state.getBlock() instanceof ARFOSpreadableStoneBlock) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (b == state.getBlock()) {
                                    matchingSlab = BlockMapping.slabAndBlocks.get(b).getDefaultState();
                                }
                            }

                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                                if (newState.get(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.get(WATERLOGGED))
                                        world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        }
                    } else if (newState.isOf(Blocks.NETHERRACK)) { // arfo overgrown netherrack to netherrack
                        if (state.getBlock() instanceof ARFOSpreadableNetherrackBlock && !world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                            world.setBlockState(newPos, state.getBlock().getDefaultState(), 3);
                        }

                    } else if (newState.isOf(ARFOBlocks.NETHERRACK_SLAB)) { // arfo overgrown netherrack to netherrack slab
                        BlockState matchingSlab = newState;

                        if (state.getBlock() instanceof ARFOSpreadableNetherrackBlock) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (b == state.getBlock()) {
                                    matchingSlab = BlockMapping.slabAndBlocks.get(b).getDefaultState();
                                }
                            }

                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                                if (newState.get(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.get(WATERLOGGED))
                                        world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        }
                    } else if (newState.isOf(ARFOBlocks.DIRT_SLAB)) { // vanilla grass block mixin to arfo dirt slab
                        if (state.isOf(Blocks.GRASS_BLOCK)) {
                            BlockState matchingSlab = ARFOBlocks.GRASS_SLAB.getDefaultState();
                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                                if (newState.get(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.get(WATERLOGGED))
                                        world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        } else if (state.isOf(Blocks.MYCELIUM)) {
                            BlockState matchingSlab = ARFOBlocks.MYCELIUM_SLAB.getDefaultState();
                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.up()).getMaterial().isSolid()) {
                                if (newState.get(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.get(WATERLOGGED))
                                        world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlockState(newPos, matchingSlab.with(TYPE, newState.get(SlabBlock.TYPE)).with(SNOWY, world.getBlockState(newPos.up()).isOf(Blocks.SNOW)).with(SlabBlock.WATERLOGGED, newState.get(SlabBlock.WATERLOGGED)), 3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    private static boolean canSurvive(BlockState state, WorldView worldView, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = worldView.getBlockState(blockPos);
        if (blockState.isOf(Blocks.SNOW) && (Integer) blockState.get(SnowBlock.LAYERS) >= 1) {
            return false;
        } else if (blockState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(worldView, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(worldView, blockPos));
            return i < worldView.getMaxLightLevel();
        }
    }

    private static boolean canSpread(BlockState state, WorldView worldView, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return canSurvive(state, worldView, pos) && !worldView.getFluidState(blockPos).isIn(FluidTags.WATER);
    }


    static {
        TYPE = Properties.SLAB_TYPE;
        HALF = Properties.DOUBLE_BLOCK_HALF;
        SNOWY = Properties.SNOWY;
        WATERLOGGED = Properties.WATERLOGGED;
    }

}
