package com.finallion.artificialfoliage.utils;

import com.finallion.artificialfoliage.registry.ModBlocks;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Map;

public class BlockMapping {

    public static final Map<Block, Block> slabAndBlocks = new HashMap<Block, Block>() {
        {
            put(ModBlocks.JUNGLE_GRASS_BLOCK, ModBlocks.JUNGLE_GRASS_SLAB);
            put(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK, ModBlocks.JUNGLE_EDGE_GRASS_SLAB);
            put(ModBlocks.BADLANDS_GRASS_BLOCK, ModBlocks.BADLANDS_GRASS_SLAB);
            put(ModBlocks.SAVANNA_GRASS_BLOCK, ModBlocks.SAVANNA_GRASS_SLAB);
            put(ModBlocks.FOREST_GRASS_BLOCK, ModBlocks.FOREST_GRASS_SLAB);
            put(ModBlocks.BIRCH_FOREST_GRASS_BLOCK, ModBlocks.BIRCH_FOREST_GRASS_SLAB);
            put(ModBlocks.DARK_FOREST_GRASS_BLOCK, ModBlocks.DARK_FOREST_GRASS_SLAB);
            put(ModBlocks.PLAINS_GRASS_BLOCK, ModBlocks.PLAINS_GRASS_SLAB);
            put(ModBlocks.SWAMP_GRASS_BLOCK, ModBlocks.SWAMP_GRASS_SLAB);
            put(ModBlocks.LUSH_SWAMP_GRASS_BLOCK, ModBlocks.LUSH_SWAMP_GRASS_SLAB);
            put(ModBlocks.MOUNTAINS_GRASS_BLOCK, ModBlocks.MOUNTAINS_GRASS_SLAB);
            put(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB);
            put(ModBlocks.TAIGA_GRASS_BLOCK, ModBlocks.TAIGA_GRASS_SLAB);
            put(ModBlocks.MEGA_TAIGA_GRASS_BLOCK, ModBlocks.MEGA_TAIGA_GRASS_SLAB);
            put(ModBlocks.SNOWY_GRASS_BLOCK, ModBlocks.SNOWY_GRASS_SLAB);
            put(ModBlocks.SNOWY_BEACH_GRASS_BLOCK, ModBlocks.SNOWY_BEACH_GRASS_SLAB);
            put(ModBlocks.WATERS_GRASS_BLOCK, ModBlocks.WATERS_GRASS_SLAB);
        }
    };

    public static final Map<Block, Block> glowingBlocks = new HashMap<Block, Block>() {
        {
            put(ModBlocks.JUNGLE_GRASS_BLOCK, ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK);
            put(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK, ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK);
            put(ModBlocks.BADLANDS_GRASS_BLOCK, ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK);
            put(ModBlocks.SAVANNA_GRASS_BLOCK, ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK);
            put(ModBlocks.FOREST_GRASS_BLOCK, ModBlocks.GLOWING_FOREST_GRASS_BLOCK);
            put(ModBlocks.BIRCH_FOREST_GRASS_BLOCK, ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK);
            put(ModBlocks.DARK_FOREST_GRASS_BLOCK, ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK);
            put(ModBlocks.PLAINS_GRASS_BLOCK, ModBlocks.GLOWING_PLAINS_GRASS_BLOCK);
            put(ModBlocks.SWAMP_GRASS_BLOCK, ModBlocks.GLOWING_SWAMP_GRASS_BLOCK);
            put(ModBlocks.LUSH_SWAMP_GRASS_BLOCK, ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK);
            put(ModBlocks.MOUNTAINS_GRASS_BLOCK, ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK);
            put(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK);
            put(ModBlocks.TAIGA_GRASS_BLOCK, ModBlocks.GLOWING_TAIGA_GRASS_BLOCK);
            put(ModBlocks.MEGA_TAIGA_GRASS_BLOCK, ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK);
            put(ModBlocks.SNOWY_GRASS_BLOCK, ModBlocks.GLOWING_SNOWY_GRASS_BLOCK);
            put(ModBlocks.SNOWY_BEACH_GRASS_BLOCK, ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK);
            put(ModBlocks.WATERS_GRASS_BLOCK, ModBlocks.GLOWING_WATERS_GRASS_BLOCK);
        }
    };


}
