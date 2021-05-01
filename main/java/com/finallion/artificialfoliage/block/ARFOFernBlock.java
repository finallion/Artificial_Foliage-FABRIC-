package com.finallion.artificialfoliage.block;


import com.finallion.artificialfoliage.registry.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ARFOFernBlock extends FernBlock implements Fertilizable {
    private static final Map<Block, Block> grassFeatures = new HashMap<>();

    public ARFOFernBlock() {
        super(FabricBlockSettings.copyOf(Blocks.FERN).breakInstantly().sounds(BlockSoundGroup.GRASS).noCollision());
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        initMap();
        TallPlantBlock tallPlantBlock = (TallPlantBlock) Blocks.LARGE_FERN;
        for (Block block : grassFeatures.keySet()) {
            if (state.isOf(block)) {
                tallPlantBlock = (TallPlantBlock) grassFeatures.get(block);
            }
        }

        if (tallPlantBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
            tallPlantBlock.placeAt(world, pos, 2);
        }

    }

    private void initMap() {
        grassFeatures.put(ModBlocks.JUNGLE_FERN, ModBlocks.LARGE_JUNGLE_FERN);
        grassFeatures.put(ModBlocks.JUNGLE_EDGE_FERN, ModBlocks.LARGE_JUNGLE_EDGE_FERN);
        grassFeatures.put(ModBlocks.BADLANDS_FERN, ModBlocks.LARGE_BADLANDS_FERN);
        grassFeatures.put(ModBlocks.SAVANNA_FERN, ModBlocks.LARGE_SAVANNA_FERN);
        grassFeatures.put(ModBlocks.FOREST_FERN, ModBlocks.LARGE_FOREST_FERN);
        grassFeatures.put(ModBlocks.BIRCH_FOREST_FERN, ModBlocks.LARGE_BIRCH_FOREST_FERN);
        grassFeatures.put(ModBlocks.DARK_FOREST_FERN, ModBlocks.LARGE_DARK_FOREST_FERN);
        grassFeatures.put(ModBlocks.PLAINS_FERN, ModBlocks.LARGE_PLAINS_FERN);
        grassFeatures.put(ModBlocks.SWAMP_FERN, ModBlocks.LARGE_SWAMP_FERN);
        grassFeatures.put(ModBlocks.LUSH_SWAMP_FERN, ModBlocks.LARGE_LUSH_SWAMP_FERN);
        grassFeatures.put(ModBlocks.MOUNTAINS_FERN, ModBlocks.LARGE_MOUNTAINS_FERN);
        grassFeatures.put(ModBlocks.MUSHROOM_FIELDS_FERN, ModBlocks.LARGE_MUSHROOM_FIELDS_FERN);
        grassFeatures.put(ModBlocks.TAIGA_FERN, ModBlocks.LARGE_TAIGA_FERN);
        grassFeatures.put(ModBlocks.MEGA_TAIGA_FERN, ModBlocks.LARGE_MEGA_TAIGA_FERN);
        grassFeatures.put(ModBlocks.SNOWY_FERN, ModBlocks.LARGE_SNOWY_FERN);
        grassFeatures.put(ModBlocks.SNOWY_BEACH_FERN, ModBlocks.LARGE_SNOWY_BEACH_FERN);
        grassFeatures.put(ModBlocks.WATERS_FERN, ModBlocks.LARGE_WATERS_FERN);
    }
}
