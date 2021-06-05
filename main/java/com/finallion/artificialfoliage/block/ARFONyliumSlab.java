package com.finallion.artificialfoliage.block;



import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.fluid.FluidState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.NetherForestVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVinesFeature;

import java.util.Iterator;
import java.util.Random;

public class ARFONyliumSlab extends SlabBlock implements Fertilizable {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;

    public ARFONyliumSlab() {
        super(FabricBlockSettings
                .copyOf(Blocks.CRIMSON_NYLIUM)
                .breakByTool(FabricToolTags.PICKAXES));
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false));

    }

    private static boolean canBeNylium(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockpos = pos.up();
        BlockState aboveState = world.getBlockState(blockpos);
        if (aboveState.getBlock() == Blocks.SNOW && (Integer) aboveState.get(SnowBlock.LAYERS) > 1) {
            return false;
        } else if (state.getBlock() instanceof ARFONyliumSlab && state.get(TYPE) == SlabType.TOP && !aboveState.getMaterial().isSolid()) {
            return true;
        }
        int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, aboveState, blockpos, Direction.UP, aboveState.getOpacity(world, blockpos));
        return i < world.getMaxLightLevel();
    }



    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random r) {
        if (!canBeNylium(state, world, pos)) {
            if (state.isOf(BYGBlocks.BYG_EMBUR_NYLIUM_SLAB)) {
                world.setBlockState(pos, BYGBlocks.BYG_BLUE_NETHERRACK_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)));
            } else {
                world.setBlockState(pos, ARFOBlocks.NETHERRACK_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)));
            }
        }
    }



    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;

        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB) || blockState.isOf(Blocks.WARPED_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
                bl = true;
            }

            if (blockState.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(Blocks.CRIMSON_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                bl2 = true;
            }


            if (blockState.isOf(BYGBlocks.BYG_EMBUR_NYLIUM_SLAB)) {
                bl3 = true;
                //break;
            }
            if (blockState.isOf(BYGBlocks.BYG_SYTHIAN_NYLIUM_SLAB)) {
                bl4 = true;
                //break;
            }
            if (blockState.isOf(BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB)) {
                bl5 = true;
                //break;
            }
            if (blockState.isOf(BYGBlocks.BYG_MYCELIUM_NETHERRACK_SLAB)) {
                bl6 = true;
                //break;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (state.getBlock().is(ARFOBlocks.NETHERRACK_SLAB)) {
            if (bl2 && bl) {
                world.setBlockState(pos, random.nextBoolean() ? ARFOBlocks.WARPED_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)) : ARFOBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl) {
                world.setBlockState(pos, ARFOBlocks.WARPED_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl2) {
                world.setBlockState(pos, ARFOBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl3) {
                world.setBlockState(pos, BYGBlocks.BYG_EMBUR_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl4) {
                world.setBlockState(pos, BYGBlocks.BYG_SYTHIAN_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl5) {
                world.setBlockState(pos, BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl6) {
                world.setBlockState(pos, BYGBlocks.BYG_MYCELIUM_NETHERRACK_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            }
        } else if (state.isOf(BYGBlocks.BYG_BLUE_NETHERRACK_SLAB) && bl3) {
            world.setBlockState(pos, BYGBlocks.BYG_EMBUR_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
        } else if (state.isOf(this)) {
            if (state.get(TYPE) != SlabType.BOTTOM) {
                growNetherGrass(world, random, pos, state);
            }
        }
    }


    public void growNetherGrass(ServerWorld world, Random random, BlockPos blockPos, BlockState state) {
        BlockState blockstate = world.getBlockState(blockPos);
        BlockPos blockpos = blockPos.up();
        if (blockstate.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockstate.isOf(BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB)) {
            if (blockstate.get(TYPE) != SlabType.BOTTOM) {
                NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.CRIMSON_ROOTS_CONFIG, 1, 1);
            }
        } else if (blockstate.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB)) {
            if (blockstate.get(TYPE) != SlabType.BOTTOM) {
                NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.WARPED_ROOTS_CONFIG, 1, 1);
                NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.NETHER_SPROUTS_CONFIG, 1, 1);
                if (random.nextInt(8) == 0) {
                    TwistingVinesFeature.method_26265(world, random, blockPos, 1, 1, 2);
                }
            }
        }

    }


    static {
        TYPE = Properties.SLAB_TYPE;
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
