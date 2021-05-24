package com.finallion.artificialfoliage.utils;

import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseBlocks;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class GrassFeatures {


    public static List<Block> jungle = new ArrayList<Block>() {
        {
            add(ARFOBlocks.JUNGLE_FERN);
            add(ARFOBlocks.JUNGLE_GRASS);
            add(ARFOBlocks.TALL_JUNGLE_GRASS);
            add(ARFOBlocks.LARGE_JUNGLE_FERN);
            add(ARFOBlocks.TROPICAL_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.TROPICAL_OAK_LEAVES_CARPET);
            add(ARFOBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.TROPICAL_ACACIA_LEAVES_CARPET);
        }

    };
    public static List<Block> jungle_edge = new ArrayList<Block>() {
        {
            add(ARFOBlocks.JUNGLE_EDGE_FERN);
            add(ARFOBlocks.JUNGLE_EDGE_GRASS);
            add(ARFOBlocks.TALL_JUNGLE_EDGE_GRASS);
            add(ARFOBlocks.LARGE_JUNGLE_EDGE_FERN);
            add(ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET);
            add(ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> badlands = new ArrayList<Block>() {
        {
            add(ARFOBlocks.BADLANDS_FERN);
            add(ARFOBlocks.BADLANDS_GRASS);
            add(ARFOBlocks.TALL_BADLANDS_GRASS);
            add(ARFOBlocks.LARGE_BADLANDS_FERN);
            add(ARFOBlocks.BADLANDS_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.BADLANDS_OAK_LEAVES_CARPET);
            add(ARFOBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.BADLANDS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> savanna = new ArrayList<Block>(){
        {
            add(ARFOBlocks.SAVANNA_FERN);
            add(ARFOBlocks.SAVANNA_GRASS);
            add(ARFOBlocks.TALL_SAVANNA_GRASS);
            add(ARFOBlocks.LARGE_SAVANNA_FERN);
            add(ARFOBlocks.SAVANNA_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.SAVANNA_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SAVANNA_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> forest = new ArrayList<Block>() {
        {
            add(ARFOBlocks.FOREST_FERN);
            add(ARFOBlocks.FOREST_GRASS);
            add(ARFOBlocks.TALL_FOREST_GRASS);
            add(ARFOBlocks.LARGE_FOREST_FERN);
            add(ARFOBlocks.FOREST_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.FOREST_OAK_LEAVES_CARPET);
            add(ARFOBlocks.FOREST_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.FOREST_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> birch_forest = new ArrayList<Block>() {
        {
            add(ARFOBlocks.BIRCH_FOREST_FERN);
            add(ARFOBlocks.BIRCH_FOREST_GRASS);
            add(ARFOBlocks.TALL_BIRCH_FOREST_GRASS);
            add(ARFOBlocks.LARGE_BIRCH_FOREST_FERN);
            add(ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET);
            add(ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> dark_forest = new ArrayList<Block>() {
        {
            add(ARFOBlocks.DARK_FOREST_FERN);
            add(ARFOBlocks.DARK_FOREST_GRASS);
            add(ARFOBlocks.TALL_DARK_FOREST_GRASS);
            add(ARFOBlocks.LARGE_DARK_FOREST_FERN);
            add(ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.DARK_FOREST_OAK_LEAVES_CARPET);
            add(ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> plains = new ArrayList<Block>() {
        {
            add(ARFOBlocks.PLAINS_FERN);
            add(ARFOBlocks.PLAINS_GRASS);
            add(ARFOBlocks.TALL_PLAINS_GRASS);
            add(ARFOBlocks.LARGE_PLAINS_FERN);
            add(ARFOBlocks.PLAINS_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.PLAINS_OAK_LEAVES_CARPET);
            add(ARFOBlocks.PLAINS_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.PLAINS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> swamp = new ArrayList<Block>() {
        {
            add(ARFOBlocks.SWAMP_FERN);
            add(ARFOBlocks.SWAMP_GRASS);
            add(ARFOBlocks.TALL_SWAMP_GRASS);
            add(ARFOBlocks.LARGE_SWAMP_FERN);
            add(ARFOBlocks.SWAMP_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.SWAMP_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SWAMP_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SWAMP_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> lush_swamp = new ArrayList<Block>() {
        {
            add(ARFOBlocks.LUSH_SWAMP_FERN);
            add(ARFOBlocks.LUSH_SWAMP_GRASS);
            add(ARFOBlocks.TALL_LUSH_SWAMP_GRASS);
            add(ARFOBlocks.LARGE_LUSH_SWAMP_FERN);
            add(ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET);
            add(ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> mountains = new ArrayList<Block>() {
        {
            add(ARFOBlocks.MOUNTAINS_FERN);
            add(ARFOBlocks.MOUNTAINS_GRASS);
            add(ARFOBlocks.TALL_MOUNTAINS_GRASS);
            add(ARFOBlocks.LARGE_MOUNTAINS_FERN);
            add(ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.MOUNTAINS_OAK_LEAVES_CARPET);
            add(ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> mushrooms_fields = new ArrayList<Block>() {
        {
            add(ARFOBlocks.MUSHROOM_FIELDS_FERN);
            add(ARFOBlocks.MUSHROOM_FIELDS_GRASS);
            add(ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS);
            add(ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN);
            add(ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET);
            add(ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> taiga = new ArrayList<Block>() {
        {
            add(ARFOBlocks.TAIGA_FERN);
            add(ARFOBlocks.TAIGA_GRASS);
            add(ARFOBlocks.TALL_TAIGA_GRASS);
            add(ARFOBlocks.LARGE_TAIGA_FERN);
            add(ARFOBlocks.TAIGA_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.TAIGA_OAK_LEAVES_CARPET);
            add(ARFOBlocks.TAIGA_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.TAIGA_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> mega_taiga = new ArrayList<Block>() {
        {
            add(ARFOBlocks.MEGA_TAIGA_FERN);
            add(ARFOBlocks.MEGA_TAIGA_GRASS);
            add(ARFOBlocks.TALL_MEGA_TAIGA_GRASS);
            add(ARFOBlocks.LARGE_MEGA_TAIGA_FERN);
            add(ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET);
            add(ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> snowy_biomes = new ArrayList<Block>() {
        {
            add(ARFOBlocks.SNOWY_FERN);
            add(ARFOBlocks.SNOWY_GRASS);
            add(ARFOBlocks.TALL_SNOWY_GRASS);
            add(ARFOBlocks.LARGE_SNOWY_FERN);
            add(ARFOBlocks.SNOWY_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.SNOWY_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SNOWY_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SNOWY_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> snowy_beach = new ArrayList<Block>() {
        {
            add(ARFOBlocks.SNOWY_BEACH_FERN);
            add(ARFOBlocks.SNOWY_BEACH_GRASS);
            add(ARFOBlocks.TALL_SNOWY_BEACH_GRASS);
            add(ARFOBlocks.LARGE_SNOWY_BEACH_FERN);
            add(ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET);
        }
    };
    public static List<Block> waters = new ArrayList<Block>() {
        {
            add(ARFOBlocks.WATERS_FERN);
            add(ARFOBlocks.WATERS_GRASS);
            add(ARFOBlocks.TALL_WATERS_GRASS);
            add(ARFOBlocks.LARGE_WATERS_FERN);
            add(ARFOBlocks.WATERS_JUNGLE_LEAVES_CARPET);
            add(ARFOBlocks.WATERS_OAK_LEAVES_CARPET);
            add(ARFOBlocks.WATERS_DARK_OAK_LEAVES_CARPET);
            add(ARFOBlocks.WATERS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> arid_highlands = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_FERN);
            add(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN);
            add(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> autumnal_woods = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_FERN);
            add(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN);
            add(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> cliffs = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_CLIFFS_FERN);
            add(TraverseBlocks.TRAVERSE_CLIFFS_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_CLIFFS_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_CLIFFS_FERN);
            add(TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> snowy_cliffs = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_FERN);
            add(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN);
            add(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> coniferous_forest = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_FERN);
            add(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN);
            add(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> snowy_coniferous_forest = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN);
            add(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN);
            add(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> meadow = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_MEADOW_FERN);
            add(TraverseBlocks.TRAVERSE_MEADOW_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_MEADOW_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_MEADOW_FERN);
            add(TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> plains_plateau = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_FERN);
            add(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN);
            add(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> traverse_lush_swamp = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_LUSH_SWAMP_FERN);
            add(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_LUSH_SWAMP_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_LUSH_SWAMP_FERN);
            add(TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> rolling_hills = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_ROLLING_HILLS_FERN);
            add(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_ROLLING_HILLS_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_ROLLING_HILLS_FERN);
            add(TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> wooded_island = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_WOODED_ISLAND_FERN);
            add(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_WOODED_ISLAND_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_WOODED_ISLAND_FERN);
            add(TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> woodlands = new ArrayList<Block>() {
        {
            add(TraverseBlocks.TRAVERSE_WOODLANDS_FERN);
            add(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS);
            add(TraverseBlocks.TALL_TRAVERSE_WOODLANDS_GRASS);
            add(TraverseBlocks.LARGE_TRAVERSE_WOODLANDS_FERN);
            add(TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET);
            add(TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET);
        }
    };
}
