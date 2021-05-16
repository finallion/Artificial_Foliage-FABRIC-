package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.NetherForestVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVinesFeature;

import java.util.Iterator;
import java.util.Random;

public class ARFONetherSlabBlock extends SlabBlock {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;

    public ARFONetherSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false));
    }

    // netherrack block method
    public void spread(World world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;
        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ModBlocks.WARPED_NYLIUM_SLAB) || blockState.isOf(Blocks.WARPED_NYLIUM)) {
                bl2 = true;
            }

            if (blockState.isOf(ModBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(Blocks.CRIMSON_NYLIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (state.isOf(this)) {
            if (bl2 && bl) {
                world.setBlockState(pos, random.nextBoolean() ? ModBlocks.WARPED_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)) : ModBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl2) {
                world.setBlockState(pos, ModBlocks.WARPED_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            } else if (bl) {
                world.setBlockState(pos, ModBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED)), 3);
            }
        } else {
            if (bl2 && bl) {
                world.setBlockState(pos, random.nextBoolean() ? Blocks.WARPED_NYLIUM.getDefaultState() : Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
            } else if (bl2) {
                world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
            } else if (bl) {
                world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
            }
        }

    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockState blockState = world.getBlockState(pos);
        BlockPos blockPos = pos.up();
        if (blockState.isOf(ModBlocks.CRIMSON_NYLIUM_SLAB)) {
            if (blockState.get(TYPE) != SlabType.BOTTOM) {
                NetherForestVegetationFeature.generate(world, random, blockPos, ConfiguredFeatures.Configs.CRIMSON_ROOTS_CONFIG, 1, 1);
            }
        } else if (blockState.isOf(ModBlocks.WARPED_NYLIUM_SLAB)) {
            if (blockState.get(TYPE) != SlabType.BOTTOM) {
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
