package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.NyliumBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.NetherForestVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVinesFeature;

import java.util.Iterator;
import java.util.Random;

public class ARFOGlowingNyliumBlock extends NyliumBlock {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;

    public ARFOGlowingNyliumBlock() {
        super(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM).luminance(15));
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return super.isFertilizable(world, pos, state, isClient);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;
        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

        while (var7.hasNext()) {
            BlockPos blockPos = (BlockPos) var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB) || blockState.isOf(Blocks.WARPED_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
                bl2 = true;
            }

            if (blockState.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(Blocks.CRIMSON_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (state.getBlock().is(ARFOBlocks.NETHERRACK_SLAB)) {
            if (bl2 && bl) {
                world.setBlockState(pos, random.nextBoolean() ? ARFOBlocks.WARPED_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)) : ARFOBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl2) {
                world.setBlockState(pos, ARFOBlocks.WARPED_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl) {
                world.setBlockState(pos, ARFOBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            }
        } else if (state.isOf(this)) {
            growNetherGrass(world, random, pos, state);
        }
    }

    public void growNetherGrass(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockState blockState = world.getBlockState(pos);
        BlockPos blockPos = pos.up();
        if (blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
            NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.CRIMSON_ROOTS_CONFIG, 1, 1);

        } else if (blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
            NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.WARPED_ROOTS_CONFIG, 1, 1);
            NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.NETHER_SPROUTS_CONFIG, 1, 1);
            if (random.nextInt(8) == 0) {
                TwistingVinesFeature.method_26265(world, random, blockPos, 1, 1, 2);
            }

        }

    }

    static {
        TYPE = Properties.SLAB_TYPE;
        WATERLOGGED = Properties.WATERLOGGED;
    }

}
