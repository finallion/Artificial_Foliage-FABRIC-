package com.finallion.artificialfoliage.utils;

import com.finallion.artificialfoliage.registry.ModBlocks;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrassFeatures {

    public static List<Block> jungle = new ArrayList<Block>() {
        {
            add(ModBlocks.JUNGLE_FERN);
            add(ModBlocks.JUNGLE_GRASS);
            add(ModBlocks.TALL_JUNGLE_GRASS);
            add(ModBlocks.LARGE_JUNGLE_FERN);
            add(ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.TROPICAL_OAK_LEAVES_CARPET);
            add(ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET);
        }

    };
    public static List<Block> jungle_edge = new ArrayList<Block>() {
        {
            add(ModBlocks.JUNGLE_EDGE_FERN);
            add(ModBlocks.JUNGLE_EDGE_GRASS);
            add(ModBlocks.TALL_JUNGLE_EDGE_GRASS);
            add(ModBlocks.LARGE_JUNGLE_EDGE_FERN);
            add(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET);
            add(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> badlands = new ArrayList<Block>() {
        {
            add(ModBlocks.BADLANDS_FERN);
            add(ModBlocks.BADLANDS_GRASS);
            add(ModBlocks.TALL_BADLANDS_GRASS);
            add(ModBlocks.LARGE_BADLANDS_FERN);
            add(ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.BADLANDS_OAK_LEAVES_CARPET);
            add(ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> savanna = new ArrayList<Block>(){
        {
            add(ModBlocks.SAVANNA_FERN);
            add(ModBlocks.SAVANNA_GRASS);
            add(ModBlocks.TALL_SAVANNA_GRASS);
            add(ModBlocks.LARGE_SAVANNA_FERN);
            add(ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.SAVANNA_OAK_LEAVES_CARPET);
            add(ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> forest = new ArrayList<Block>() {
        {
            add(ModBlocks.FOREST_FERN);
            add(ModBlocks.FOREST_GRASS);
            add(ModBlocks.TALL_FOREST_GRASS);
            add(ModBlocks.LARGE_FOREST_FERN);
            add(ModBlocks.FOREST_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.FOREST_OAK_LEAVES_CARPET);
            add(ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.FOREST_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> birch_forest = new ArrayList<Block>() {
        {
            add(ModBlocks.BIRCH_FOREST_FERN);
            add(ModBlocks.BIRCH_FOREST_GRASS);
            add(ModBlocks.TALL_BIRCH_FOREST_GRASS);
            add(ModBlocks.LARGE_BIRCH_FOREST_FERN);
            add(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET);
            add(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> dark_forest = new ArrayList<Block>() {
        {
            add(ModBlocks.DARK_FOREST_FERN);
            add(ModBlocks.DARK_FOREST_GRASS);
            add(ModBlocks.TALL_DARK_FOREST_GRASS);
            add(ModBlocks.LARGE_DARK_FOREST_FERN);
            add(ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET);
            add(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> plains = new ArrayList<Block>() {
        {
            add(ModBlocks.PLAINS_FERN);
            add(ModBlocks.PLAINS_GRASS);
            add(ModBlocks.TALL_PLAINS_GRASS);
            add(ModBlocks.LARGE_PLAINS_FERN);
            add(ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.PLAINS_OAK_LEAVES_CARPET);
            add(ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.PLAINS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> swamp = new ArrayList<Block>() {
        {
            add(ModBlocks.SWAMP_FERN);
            add(ModBlocks.SWAMP_GRASS);
            add(ModBlocks.TALL_SWAMP_GRASS);
            add(ModBlocks.LARGE_SWAMP_FERN);
            add(ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.SWAMP_OAK_LEAVES_CARPET);
            add(ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.SWAMP_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> lush_swamp = new ArrayList<Block>() {
        {
            add(ModBlocks.LUSH_SWAMP_FERN);
            add(ModBlocks.LUSH_SWAMP_GRASS);
            add(ModBlocks.TALL_LUSH_SWAMP_GRASS);
            add(ModBlocks.LARGE_LUSH_SWAMP_FERN);
            add(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET);
            add(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> mountains = new ArrayList<Block>() {
        {
            add(ModBlocks.MOUNTAINS_FERN);
            add(ModBlocks.MOUNTAINS_GRASS);
            add(ModBlocks.TALL_MOUNTAINS_GRASS);
            add(ModBlocks.LARGE_MOUNTAINS_FERN);
            add(ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET);
            add(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> mushrooms_fields = new ArrayList<Block>() {
        {
            add(ModBlocks.MUSHROOM_FIELDS_FERN);
            add(ModBlocks.MUSHROOM_FIELDS_GRASS);
            add(ModBlocks.TALL_MUSHROOM_FIELDS_GRASS);
            add(ModBlocks.LARGE_MUSHROOM_FIELDS_FERN);
            add(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET);
            add(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> taiga = new ArrayList<Block>() {
        {
            add(ModBlocks.TAIGA_FERN);
            add(ModBlocks.TAIGA_GRASS);
            add(ModBlocks.TALL_TAIGA_GRASS);
            add(ModBlocks.LARGE_TAIGA_FERN);
            add(ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.TAIGA_OAK_LEAVES_CARPET);
            add(ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.TAIGA_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> mega_taiga = new ArrayList<Block>() {
        {
            add(ModBlocks.MEGA_TAIGA_FERN);
            add(ModBlocks.MEGA_TAIGA_GRASS);
            add(ModBlocks.TALL_MEGA_TAIGA_GRASS);
            add(ModBlocks.LARGE_MEGA_TAIGA_FERN);
            add(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET);
            add(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> snowy_biomes = new ArrayList<Block>() {
        {
            add(ModBlocks.SNOWY_FERN);
            add(ModBlocks.SNOWY_GRASS);
            add(ModBlocks.TALL_SNOWY_GRASS);
            add(ModBlocks.LARGE_SNOWY_FERN);
            add(ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.SNOWY_OAK_LEAVES_CARPET);
            add(ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.SNOWY_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> snowy_beach = new ArrayList<Block>() {
        {
            add(ModBlocks.SNOWY_BEACH_FERN);
            add(ModBlocks.SNOWY_BEACH_GRASS);
            add(ModBlocks.TALL_SNOWY_BEACH_GRASS);
            add(ModBlocks.LARGE_SNOWY_BEACH_FERN);
            add(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET);
            add(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> waters = new ArrayList<Block>() {
        {
            add(ModBlocks.WATERS_FERN);
            add(ModBlocks.WATERS_GRASS);
            add(ModBlocks.TALL_WATERS_GRASS);
            add(ModBlocks.LARGE_WATERS_FERN);
            add(ModBlocks.WATERS_JUNGLE_LEAVES_CARPET);
            add(ModBlocks.WATERS_OAK_LEAVES_CARPET);
            add(ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET);
            add(ModBlocks.WATERS_ACACIA_LEAVES_CARPET);
        }
    };

}
