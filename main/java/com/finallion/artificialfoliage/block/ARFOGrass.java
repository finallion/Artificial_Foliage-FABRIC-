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

public class ARFOGrass extends PlantBlock implements Fertilizable {
    private static final Map<Block, Block> grassFeatures = new HashMap<>();

    public ARFOGrass() {
        super(FabricBlockSettings.copyOf(Blocks.GRASS).breakInstantly().noCollision().nonOpaque().sounds(BlockSoundGroup.GRASS));
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
        TallPlantBlock tallPlantBlock = (TallPlantBlock)Blocks.TALL_GRASS;
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
        grassFeatures.put(ModBlocks.JUNGLE_GRASS, ModBlocks.TALL_JUNGLE_GRASS);
        grassFeatures.put(ModBlocks.JUNGLE_EDGE_GRASS, ModBlocks.TALL_JUNGLE_EDGE_GRASS);
        grassFeatures.put(ModBlocks.BADLANDS_GRASS, ModBlocks.TALL_BADLANDS_GRASS);
        grassFeatures.put(ModBlocks.SAVANNA_GRASS, ModBlocks.TALL_SAVANNA_GRASS);
        grassFeatures.put(ModBlocks.FOREST_GRASS, ModBlocks.TALL_FOREST_GRASS);
        grassFeatures.put(ModBlocks.BIRCH_FOREST_GRASS, ModBlocks.TALL_BIRCH_FOREST_GRASS);
        grassFeatures.put(ModBlocks.DARK_FOREST_GRASS, ModBlocks.TALL_DARK_FOREST_GRASS);
        grassFeatures.put(ModBlocks.PLAINS_GRASS, ModBlocks.TALL_PLAINS_GRASS);
        grassFeatures.put(ModBlocks.SWAMP_GRASS, ModBlocks.TALL_SWAMP_GRASS);
        grassFeatures.put(ModBlocks.LUSH_SWAMP_GRASS, ModBlocks.TALL_LUSH_SWAMP_GRASS);
        grassFeatures.put(ModBlocks.MOUNTAINS_GRASS, ModBlocks.TALL_MOUNTAINS_GRASS);
        grassFeatures.put(ModBlocks.MUSHROOM_FIELDS_GRASS, ModBlocks.TALL_MUSHROOM_FIELDS_GRASS);
        grassFeatures.put(ModBlocks.TAIGA_GRASS, ModBlocks.TALL_TAIGA_GRASS);
        grassFeatures.put(ModBlocks.MEGA_TAIGA_GRASS, ModBlocks.TALL_MEGA_TAIGA_GRASS);
        grassFeatures.put(ModBlocks.SNOWY_GRASS, ModBlocks.TALL_SNOWY_GRASS);
        grassFeatures.put(ModBlocks.SNOWY_BEACH_GRASS, ModBlocks.TALL_SNOWY_BEACH_GRASS);
        grassFeatures.put(ModBlocks.WATERS_GRASS, ModBlocks.TALL_WATERS_GRASS);
    }
}
