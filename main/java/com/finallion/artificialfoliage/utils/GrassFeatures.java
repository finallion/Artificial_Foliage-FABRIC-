package com.finallion.artificialfoliage.utils;


import com.finallion.artificialfoliage.compatibilty.BOP.BOPBlocks;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
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

    public static List<Block> ancient_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ANCIENT_FOREST_FERN);
            add(BYGBlocks.BYG_ANCIENT_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_ANCIENT_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_ANCIENT_FOREST_FERN);
            add(BYGBlocks.BYG_ANCIENT_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ANCIENT_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ANCIENT_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ANCIENT_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> aspen_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ASPEN_FOREST_FERN);
            add(BYGBlocks.BYG_ASPEN_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_ASPEN_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_ASPEN_FOREST_FERN);
            add(BYGBlocks.BYG_ASPEN_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ASPEN_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ASPEN_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ASPEN_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> araucaria_savanna = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ARAUCARIA_SAVANNA_FERN);
            add(BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS);
            add(BYGBlocks.TALL_BYG_ARAUCARIA_SAVANNA_GRASS);
            add(BYGBlocks.LARGE_BYG_ARAUCARIA_SAVANNA_FERN);
            add(BYGBlocks.BYG_ARAUCARIA_SAVANNA_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ARAUCARIA_SAVANNA_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ARAUCARIA_SAVANNA_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ARAUCARIA_SAVANNA_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> autumnal_valley = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_AUTUMNAL_VALLEY_FERN);
            add(BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS);
            add(BYGBlocks.TALL_BYG_AUTUMNAL_VALLEY_GRASS);
            add(BYGBlocks.LARGE_BYG_AUTUMNAL_VALLEY_FERN);
            add(BYGBlocks.BYG_AUTUMNAL_VALLEY_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_AUTUMNAL_VALLEY_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_AUTUMNAL_VALLEY_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_AUTUMNAL_VALLEY_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> basalt_barrera = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_BASALT_BARRERA_FERN);
            add(BYGBlocks.BYG_BASALT_BARRERA_GRASS);
            add(BYGBlocks.TALL_BYG_BASALT_BARRERA_GRASS);
            add(BYGBlocks.LARGE_BYG_BASALT_BARRERA_FERN);
            add(BYGBlocks.BYG_BASALT_BARRERA_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_BASALT_BARRERA_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_BASALT_BARRERA_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_BASALT_BARRERA_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bayou = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_BAYOU_FERN);
            add(BYGBlocks.BYG_BAYOU_GRASS);
            add(BYGBlocks.TALL_BYG_BAYOU_GRASS);
            add(BYGBlocks.LARGE_BYG_BAYOU_FERN);
            add(BYGBlocks.BYG_BAYOU_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_BAYOU_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_BAYOU_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_BAYOU_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bluff_steeps = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_BLUFF_STEEPS_FERN);
            add(BYGBlocks.BYG_BLUFF_STEEPS_GRASS);
            add(BYGBlocks.TALL_BYG_BLUFF_STEEPS_GRASS);
            add(BYGBlocks.LARGE_BYG_BLUFF_STEEPS_FERN);
            add(BYGBlocks.BYG_BLUFF_STEEPS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_BLUFF_STEEPS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_BLUFF_STEEPS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_BLUFF_STEEPS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> cherry_blossom_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_FERN);
            add(BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_CHERRY_BLOSSOM_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_CHERRY_BLOSSOM_FOREST_FERN);
            add(BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> cika_woods = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_CIKA_WOODS_FERN);
            add(BYGBlocks.BYG_CIKA_WOODS_GRASS);
            add(BYGBlocks.TALL_BYG_CIKA_WOODS_GRASS);
            add(BYGBlocks.LARGE_BYG_CIKA_WOODS_FERN);
            add(BYGBlocks.BYG_CIKA_WOODS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_CIKA_WOODS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CIKA_WOODS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CIKA_WOODS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> cold_swamplands = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_COLD_SWAMPLANDS_FERN);
            add(BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS);
            add(BYGBlocks.TALL_BYG_COLD_SWAMPLANDS_GRASS);
            add(BYGBlocks.LARGE_BYG_COLD_SWAMPLANDS_FERN);
            add(BYGBlocks.BYG_COLD_SWAMPLANDS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_COLD_SWAMPLANDS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_COLD_SWAMPLANDS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_COLD_SWAMPLANDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> byg_coniferous_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_CONIFEROUS_FOREST_FERN);
            add(BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_CONIFEROUS_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_CONIFEROUS_FOREST_FERN);
            add(BYGBlocks.BYG_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_CONIFEROUS_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> crag_gardens = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_CRAG_GARDENS_FERN);
            add(BYGBlocks.BYG_CRAG_GARDENS_GRASS);
            add(BYGBlocks.TALL_BYG_CRAG_GARDENS_GRASS);
            add(BYGBlocks.LARGE_BYG_CRAG_GARDENS_FERN);
            add(BYGBlocks.BYG_CRAG_GARDENS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_CRAG_GARDENS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CRAG_GARDENS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CRAG_GARDENS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> crimson_gardens = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_CRIMSON_GARDENS_FERN);
            add(BYGBlocks.BYG_CRIMSON_GARDENS_GRASS);
            add(BYGBlocks.TALL_BYG_CRIMSON_GARDENS_GRASS);
            add(BYGBlocks.LARGE_BYG_CRIMSON_GARDENS_FERN);
            add(BYGBlocks.BYG_CRIMSON_GARDENS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_CRIMSON_GARDENS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CRIMSON_GARDENS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CRIMSON_GARDENS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> cypress_swampland = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_CYPRESS_SWAMPLAND_FERN);
            add(BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS);
            add(BYGBlocks.TALL_BYG_CYPRESS_SWAMPLAND_GRASS);
            add(BYGBlocks.LARGE_BYG_CYPRESS_SWAMPLAND_FERN);
            add(BYGBlocks.BYG_CYPRESS_SWAMPLAND_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_CYPRESS_SWAMPLAND_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CYPRESS_SWAMPLAND_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_CYPRESS_SWAMPLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> deciduous_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_DECIDUOUS_FOREST_FERN);
            add(BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_DECIDUOUS_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_DECIDUOUS_FOREST_FERN);
            add(BYGBlocks.BYG_DECIDUOUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_DECIDUOUS_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_DECIDUOUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_DECIDUOUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> enchanted_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ENCHANTED_FOREST_FERN);
            add(BYGBlocks.BYG_ENCHANTED_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_ENCHANTED_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_ENCHANTED_FOREST_FERN);
            add(BYGBlocks.BYG_ENCHANTED_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ENCHANTED_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ENCHANTED_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ENCHANTED_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> fresh_water_lake = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_FRESH_WATER_LAKE_FERN);
            add(BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS);
            add(BYGBlocks.TALL_BYG_FRESH_WATER_LAKE_GRASS);
            add(BYGBlocks.LARGE_BYG_FRESH_WATER_LAKE_FERN);
            add(BYGBlocks.BYG_FRESH_WATER_LAKE_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_FRESH_WATER_LAKE_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_FRESH_WATER_LAKE_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_FRESH_WATER_LAKE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> glowstone_gardens = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_GLOWSTONE_GARDENS_FERN);
            add(BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS);
            add(BYGBlocks.TALL_BYG_GLOWSTONE_GARDENS_GRASS);
            add(BYGBlocks.LARGE_BYG_GLOWSTONE_GARDENS_FERN);
            add(BYGBlocks.BYG_GLOWSTONE_GARDENS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_GLOWSTONE_GARDENS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GLOWSTONE_GARDENS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GLOWSTONE_GARDENS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> grass_land_plateau = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_GRASS_LAND_PLATEAU_FERN);
            add(BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS);
            add(BYGBlocks.TALL_BYG_GRASS_LAND_PLATEAU_GRASS);
            add(BYGBlocks.LARGE_BYG_GRASS_LAND_PLATEAU_FERN);
            add(BYGBlocks.BYG_GRASS_LAND_PLATEAU_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_GRASS_LAND_PLATEAU_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GRASS_LAND_PLATEAU_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GRASS_LAND_PLATEAU_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> great_lakes = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_GREAT_LAKES_FERN);
            add(BYGBlocks.BYG_GREAT_LAKES_GRASS);
            add(BYGBlocks.TALL_BYG_GREAT_LAKES_GRASS);
            add(BYGBlocks.LARGE_BYG_GREAT_LAKES_FERN);
            add(BYGBlocks.BYG_GREAT_LAKES_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_GREAT_LAKES_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GREAT_LAKES_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GREAT_LAKES_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> grove = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_GROVE_FERN);
            add(BYGBlocks.BYG_GROVE_GRASS);
            add(BYGBlocks.TALL_BYG_GROVE_GRASS);
            add(BYGBlocks.LARGE_BYG_GROVE_FERN);
            add(BYGBlocks.BYG_GROVE_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_GROVE_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GROVE_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GROVE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> guiana_shield = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_GUIANA_SHIELD_FERN);
            add(BYGBlocks.BYG_GUIANA_SHIELD_GRASS);
            add(BYGBlocks.TALL_BYG_GUIANA_SHIELD_GRASS);
            add(BYGBlocks.LARGE_BYG_GUIANA_SHIELD_FERN);
            add(BYGBlocks.BYG_GUIANA_SHIELD_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_GUIANA_SHIELD_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GUIANA_SHIELD_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_GUIANA_SHIELD_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> jacaranda_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_JACARANDA_FOREST_FERN);
            add(BYGBlocks.BYG_JACARANDA_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_JACARANDA_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_JACARANDA_FOREST_FERN);
            add(BYGBlocks.BYG_JACARANDA_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_JACARANDA_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_JACARANDA_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_JACARANDA_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> lush_tundra = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_LUSH_TUNDRA_FERN);
            add(BYGBlocks.BYG_LUSH_TUNDRA_GRASS);
            add(BYGBlocks.TALL_BYG_LUSH_TUNDRA_GRASS);
            add(BYGBlocks.LARGE_BYG_LUSH_TUNDRA_FERN);
            add(BYGBlocks.BYG_LUSH_TUNDRA_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_LUSH_TUNDRA_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_LUSH_TUNDRA_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_LUSH_TUNDRA_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> orchard = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ORCHARD_FERN);
            add(BYGBlocks.BYG_ORCHARD_GRASS);
            add(BYGBlocks.TALL_BYG_ORCHARD_GRASS);
            add(BYGBlocks.LARGE_BYG_ORCHARD_FERN);
            add(BYGBlocks.BYG_ORCHARD_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ORCHARD_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ORCHARD_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ORCHARD_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> polluted_lake = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_POLLUTED_LAKE_FERN);
            add(BYGBlocks.BYG_POLLUTED_LAKE_GRASS);
            add(BYGBlocks.TALL_BYG_POLLUTED_LAKE_GRASS);
            add(BYGBlocks.LARGE_BYG_POLLUTED_LAKE_FERN);
            add(BYGBlocks.BYG_POLLUTED_LAKE_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_POLLUTED_LAKE_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_POLLUTED_LAKE_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_POLLUTED_LAKE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> prairie = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_PRAIRIE_FERN);
            add(BYGBlocks.BYG_PRAIRIE_GRASS);
            add(BYGBlocks.TALL_BYG_PRAIRIE_GRASS);
            add(BYGBlocks.LARGE_BYG_PRAIRIE_FERN);
            add(BYGBlocks.BYG_PRAIRIE_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_PRAIRIE_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_PRAIRIE_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_PRAIRIE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> red_oak_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_RED_OAK_FOREST_FERN);
            add(BYGBlocks.BYG_RED_OAK_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_RED_OAK_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_RED_OAK_FOREST_FERN);
            add(BYGBlocks.BYG_RED_OAK_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_RED_OAK_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_RED_OAK_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_RED_OAK_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> red_rock_mountains = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_RED_ROCK_MOUNTAINS_FERN);
            add(BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS);
            add(BYGBlocks.TALL_BYG_RED_ROCK_MOUNTAINS_GRASS);
            add(BYGBlocks.LARGE_BYG_RED_ROCK_MOUNTAINS_FERN);
            add(BYGBlocks.BYG_RED_ROCK_MOUNTAINS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_RED_ROCK_MOUNTAINS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_RED_ROCK_MOUNTAINS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> redwood_tropics = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_REDWOOD_TROPICS_FERN);
            add(BYGBlocks.BYG_REDWOOD_TROPICS_GRASS);
            add(BYGBlocks.TALL_BYG_REDWOOD_TROPICS_GRASS);
            add(BYGBlocks.LARGE_BYG_REDWOOD_TROPICS_FERN);
            add(BYGBlocks.BYG_REDWOOD_TROPICS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_REDWOOD_TROPICS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_REDWOOD_TROPICS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_REDWOOD_TROPICS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> rose_fields = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ROSE_FIELDS_FERN);
            add(BYGBlocks.BYG_ROSE_FIELDS_GRASS);
            add(BYGBlocks.TALL_BYG_ROSE_FIELDS_GRASS);
            add(BYGBlocks.LARGE_BYG_ROSE_FIELDS_FERN);
            add(BYGBlocks.BYG_ROSE_FIELDS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ROSE_FIELDS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ROSE_FIELDS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ROSE_FIELDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> seasonal_deciduous_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_FERN);
            add(BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_SEASONAL_DECIDUOUS_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_SEASONAL_DECIDUOUS_FOREST_FERN);
            add(BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> shrub_lands = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_SHRUB_LANDS_FERN);
            add(BYGBlocks.BYG_SHRUB_LANDS_GRASS);
            add(BYGBlocks.TALL_BYG_SHRUB_LANDS_GRASS);
            add(BYGBlocks.LARGE_BYG_SHRUB_LANDS_FERN);
            add(BYGBlocks.BYG_SHRUB_LANDS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_SHRUB_LANDS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SHRUB_LANDS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SHRUB_LANDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> skyris_highlands = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_SKYRIS_HIGHLANDS_FERN);
            add(BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS);
            add(BYGBlocks.TALL_BYG_SKYRIS_HIGHLANDS_GRASS);
            add(BYGBlocks.LARGE_BYG_SKYRIS_HIGHLANDS_FERN);
            add(BYGBlocks.BYG_SKYRIS_HIGHLANDS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_SKYRIS_HIGHLANDS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SKYRIS_HIGHLANDS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SKYRIS_HIGHLANDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> snowy_deciduous_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_FERN);
            add(BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_SNOWY_DECIDUOUS_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_SNOWY_DECIDUOUS_FOREST_FERN);
            add(BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> sythian_torrids = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_SYTHIAN_TORRIDS_FERN);
            add(BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS);
            add(BYGBlocks.TALL_BYG_SYTHIAN_TORRIDS_GRASS);
            add(BYGBlocks.LARGE_BYG_SYTHIAN_TORRIDS_FERN);
            add(BYGBlocks.BYG_SYTHIAN_TORRIDS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_SYTHIAN_TORRIDS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SYTHIAN_TORRIDS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_SYTHIAN_TORRIDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> tropical_rain_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_TROPICAL_RAIN_FOREST_FERN);
            add(BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_TROPICAL_RAIN_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_TROPICAL_RAIN_FOREST_FERN);
            add(BYGBlocks.BYG_TROPICAL_RAIN_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_TROPICAL_RAIN_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_TROPICAL_RAIN_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> volcano = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_VOLCANO_FERN);
            add(BYGBlocks.BYG_VOLCANO_GRASS);
            add(BYGBlocks.TALL_BYG_VOLCANO_GRASS);
            add(BYGBlocks.LARGE_BYG_VOLCANO_FERN);
            add(BYGBlocks.BYG_VOLCANO_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_VOLCANO_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_VOLCANO_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_VOLCANO_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> wailing_garth = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_WAILING_GARTH_FERN);
            add(BYGBlocks.BYG_WAILING_GARTH_GRASS);
            add(BYGBlocks.TALL_BYG_WAILING_GARTH_GRASS);
            add(BYGBlocks.LARGE_BYG_WAILING_GARTH_FERN);
            add(BYGBlocks.BYG_WAILING_GARTH_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_WAILING_GARTH_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WAILING_GARTH_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WAILING_GARTH_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> weeping_mire = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_WEEPING_MIRE_FERN);
            add(BYGBlocks.BYG_WEEPING_MIRE_GRASS);
            add(BYGBlocks.TALL_BYG_WEEPING_MIRE_GRASS);
            add(BYGBlocks.LARGE_BYG_WEEPING_MIRE_FERN);
            add(BYGBlocks.BYG_WEEPING_MIRE_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_WEEPING_MIRE_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WEEPING_MIRE_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WEEPING_MIRE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> withering_woods = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_WITHERING_WOODS_FERN);
            add(BYGBlocks.BYG_WITHERING_WOODS_GRASS);
            add(BYGBlocks.TALL_BYG_WITHERING_WOODS_GRASS);
            add(BYGBlocks.LARGE_BYG_WITHERING_WOODS_FERN);
            add(BYGBlocks.BYG_WITHERING_WOODS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_WITHERING_WOODS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WITHERING_WOODS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WITHERING_WOODS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> byg_woodlands = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_WOODLANDS_FERN);
            add(BYGBlocks.BYG_WOODLANDS_GRASS);
            add(BYGBlocks.TALL_BYG_WOODLANDS_GRASS);
            add(BYGBlocks.LARGE_BYG_WOODLANDS_FERN);
            add(BYGBlocks.BYG_WOODLANDS_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_WOODLANDS_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WOODLANDS_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_WOODLANDS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> zelkova_forest = new ArrayList<Block>() {
        {
            add(BYGBlocks.BYG_ZELKOVA_FOREST_FERN);
            add(BYGBlocks.BYG_ZELKOVA_FOREST_GRASS);
            add(BYGBlocks.TALL_BYG_ZELKOVA_FOREST_GRASS);
            add(BYGBlocks.LARGE_BYG_ZELKOVA_FOREST_FERN);
            add(BYGBlocks.BYG_ZELKOVA_FOREST_JUNGLE_LEAVES_CARPET);
            add(BYGBlocks.BYG_ZELKOVA_FOREST_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ZELKOVA_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BYGBlocks.BYG_ZELKOVA_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    /*


    BOP


     */



    public static List<Block> bamboo_blossom_grove = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_FERN);
            add(BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_GRASS);
            add(BOPBlocks.TALL_BOP_BAMBOO_BLOSSOM_GROVE_GRASS);
            add(BOPBlocks.LARGE_BOP_BAMBOO_BLOSSOM_GROVE_FERN);
            add(BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_bayou = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_BAYOU_FERN);
            add(BOPBlocks.BOP_BAYOU_GRASS);
            add(BOPBlocks.TALL_BOP_BAYOU_GRASS);
            add(BOPBlocks.LARGE_BOP_BAYOU_FERN);
            add(BOPBlocks.BOP_BAYOU_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_BAYOU_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_BAYOU_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_BAYOU_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> cherry_blossom_grove = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_FERN);
            add(BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_GRASS);
            add(BOPBlocks.TALL_BOP_CHERRY_BLOSSOM_GROVE_GRASS);
            add(BOPBlocks.LARGE_BOP_CHERRY_BLOSSOM_GROVE_FERN);
            add(BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> burnt_forest = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_BURNT_FOREST_FERN);
            add(BOPBlocks.BOP_BURNT_FOREST_GRASS);
            add(BOPBlocks.TALL_BOP_BURNT_FOREST_GRASS);
            add(BOPBlocks.LARGE_BOP_BURNT_FOREST_FERN);
            add(BOPBlocks.BOP_BURNT_FOREST_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_BURNT_FOREST_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_BURNT_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_BURNT_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_coniferous_forest = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_CONIFEROUS_FOREST_FERN);
            add(BOPBlocks.BOP_CONIFEROUS_FOREST_GRASS);
            add(BOPBlocks.TALL_BOP_CONIFEROUS_FOREST_GRASS);
            add(BOPBlocks.LARGE_BOP_CONIFEROUS_FOREST_FERN);
            add(BOPBlocks.BOP_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_CONIFEROUS_FOREST_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> dead_forest = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_DEAD_FOREST_FERN);
            add(BOPBlocks.BOP_DEAD_FOREST_GRASS);
            add(BOPBlocks.TALL_BOP_DEAD_FOREST_GRASS);
            add(BOPBlocks.LARGE_BOP_DEAD_FOREST_FERN);
            add(BOPBlocks.BOP_DEAD_FOREST_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_DEAD_FOREST_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_DEAD_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_DEAD_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> woodland = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_WOODLAND_FERN);
            add(BOPBlocks.BOP_WOODLAND_GRASS);
            add(BOPBlocks.TALL_BOP_WOODLAND_GRASS);
            add(BOPBlocks.LARGE_BOP_WOODLAND_FERN);
            add(BOPBlocks.BOP_WOODLAND_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_WOODLAND_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_WOODLAND_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_WOODLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> dryland = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_DRYLAND_FERN);
            add(BOPBlocks.BOP_DRYLAND_GRASS);
            add(BOPBlocks.TALL_BOP_DRYLAND_GRASS);
            add(BOPBlocks.LARGE_BOP_DRYLAND_FERN);
            add(BOPBlocks.BOP_DRYLAND_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_DRYLAND_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_DRYLAND_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_DRYLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> fungal_field = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_FUNGAL_FIELD_FERN);
            add(BOPBlocks.BOP_FUNGAL_FIELD_GRASS);
            add(BOPBlocks.TALL_BOP_FUNGAL_FIELD_GRASS);
            add(BOPBlocks.LARGE_BOP_FUNGAL_FIELD_FERN);
            add(BOPBlocks.BOP_FUNGAL_FIELD_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_FUNGAL_FIELD_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_FUNGAL_FIELD_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_FUNGAL_FIELD_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> fungal_field_variant = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_FERN);
            add(BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_GRASS);
            add(BOPBlocks.TALL_BOP_FUNGAL_FIELD_VARIANT_GRASS);
            add(BOPBlocks.LARGE_BOP_FUNGAL_FIELD_VARIANT_FERN);
            add(BOPBlocks.BOP_FUNGAL_FIELD_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_FUNGAL_FIELD_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_FUNGAL_FIELD_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_FUNGAL_FIELD_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> gravel_beach = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_GRAVEL_BEACH_FERN);
            add(BOPBlocks.BOP_GRAVEL_BEACH_GRASS);
            add(BOPBlocks.TALL_BOP_GRAVEL_BEACH_GRASS);
            add(BOPBlocks.LARGE_BOP_GRAVEL_BEACH_FERN);
            add(BOPBlocks.BOP_GRAVEL_BEACH_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_GRAVEL_BEACH_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_GRAVEL_BEACH_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_GRAVEL_BEACH_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_grove = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_GROVE_FERN);
            add(BOPBlocks.BOP_GROVE_GRASS);
            add(BOPBlocks.TALL_BOP_GROVE_GRASS);
            add(BOPBlocks.LARGE_BOP_GROVE_FERN);
            add(BOPBlocks.BOP_GROVE_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_GROVE_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_GROVE_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_GROVE_ACACIA_LEAVES_CARPET);
        }
    };


    public static List<Block> jade_cliffs = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_JADE_CLIFFS_FERN);
            add(BOPBlocks.BOP_JADE_CLIFFS_GRASS);
            add(BOPBlocks.TALL_BOP_JADE_CLIFFS_GRASS);
            add(BOPBlocks.LARGE_BOP_JADE_CLIFFS_FERN);
            add(BOPBlocks.BOP_JADE_CLIFFS_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_JADE_CLIFFS_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_JADE_CLIFFS_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_JADE_CLIFFS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> lavender_field = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_LAVENDER_FIELD_FERN);
            add(BOPBlocks.BOP_LAVENDER_FIELD_GRASS);
            add(BOPBlocks.TALL_BOP_LAVENDER_FIELD_GRASS);
            add(BOPBlocks.LARGE_BOP_LAVENDER_FIELD_FERN);
            add(BOPBlocks.BOP_LAVENDER_FIELD_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_LAVENDER_FIELD_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_LAVENDER_FIELD_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_LAVENDER_FIELD_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> lush_desert = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_LUSH_DESERT_FERN);
            add(BOPBlocks.BOP_LUSH_DESERT_GRASS);
            add(BOPBlocks.TALL_BOP_LUSH_DESERT_GRASS);
            add(BOPBlocks.LARGE_BOP_LUSH_DESERT_FERN);
            add(BOPBlocks.BOP_LUSH_DESERT_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_LUSH_DESERT_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_LUSH_DESERT_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_LUSH_DESERT_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> marsh = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_MARSH_FERN);
            add(BOPBlocks.BOP_MARSH_GRASS);
            add(BOPBlocks.TALL_BOP_MARSH_GRASS);
            add(BOPBlocks.LARGE_BOP_MARSH_FERN);
            add(BOPBlocks.BOP_MARSH_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_MARSH_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MARSH_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MARSH_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_meadow = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_MEADOW_FERN);
            add(BOPBlocks.BOP_MEADOW_GRASS);
            add(BOPBlocks.TALL_BOP_MEADOW_GRASS);
            add(BOPBlocks.LARGE_BOP_MEADOW_FERN);
            add(BOPBlocks.BOP_MEADOW_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_MEADOW_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MEADOW_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MEADOW_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> muskeg = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_MUSKEG_FERN);
            add(BOPBlocks.BOP_MUSKEG_GRASS);
            add(BOPBlocks.TALL_BOP_MUSKEG_GRASS);
            add(BOPBlocks.LARGE_BOP_MUSKEG_FERN);
            add(BOPBlocks.BOP_MUSKEG_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_MUSKEG_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MUSKEG_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MUSKEG_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> ominous_woods = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_OMINOUS_WOODS_FERN);
            add(BOPBlocks.BOP_OMINOUS_WOODS_GRASS);
            add(BOPBlocks.TALL_BOP_OMINOUS_WOODS_GRASS);
            add(BOPBlocks.LARGE_BOP_OMINOUS_WOODS_FERN);
            add(BOPBlocks.BOP_OMINOUS_WOODS_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_OMINOUS_WOODS_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_OMINOUS_WOODS_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_OMINOUS_WOODS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> mystic_grove = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_MYSTIC_GROVE_FERN);
            add(BOPBlocks.BOP_MYSTIC_GROVE_GRASS);
            add(BOPBlocks.TALL_BOP_MYSTIC_GROVE_GRASS);
            add(BOPBlocks.LARGE_BOP_MYSTIC_GROVE_FERN);
            add(BOPBlocks.BOP_MYSTIC_GROVE_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_MYSTIC_GROVE_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MYSTIC_GROVE_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_MYSTIC_GROVE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_orchard = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_ORCHARD_FERN);
            add(BOPBlocks.BOP_ORCHARD_GRASS);
            add(BOPBlocks.TALL_BOP_ORCHARD_GRASS);
            add(BOPBlocks.LARGE_BOP_ORCHARD_FERN);
            add(BOPBlocks.BOP_ORCHARD_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_ORCHARD_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_ORCHARD_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_ORCHARD_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> origin_valley = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_ORIGIN_VALLEY_FERN);
            add(BOPBlocks.BOP_ORIGIN_VALLEY_GRASS);
            add(BOPBlocks.TALL_BOP_ORIGIN_VALLEY_GRASS);
            add(BOPBlocks.LARGE_BOP_ORIGIN_VALLEY_FERN);
            add(BOPBlocks.BOP_ORIGIN_VALLEY_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_ORIGIN_VALLEY_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_ORIGIN_VALLEY_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_ORIGIN_VALLEY_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> rainbow_hills = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_RAINBOW_HILLS_FERN);
            add(BOPBlocks.BOP_RAINBOW_HILLS_GRASS);
            add(BOPBlocks.TALL_BOP_RAINBOW_HILLS_GRASS);
            add(BOPBlocks.LARGE_BOP_RAINBOW_HILLS_FERN);
            add(BOPBlocks.BOP_RAINBOW_HILLS_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_RAINBOW_HILLS_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_RAINBOW_HILLS_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_RAINBOW_HILLS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> redwood_forest = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_REDWOOD_FOREST_FERN);
            add(BOPBlocks.BOP_REDWOOD_FOREST_GRASS);
            add(BOPBlocks.TALL_BOP_REDWOOD_FOREST_GRASS);
            add(BOPBlocks.LARGE_BOP_REDWOOD_FOREST_FERN);
            add(BOPBlocks.BOP_REDWOOD_FOREST_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_REDWOOD_FOREST_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_REDWOOD_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_REDWOOD_FOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_prairie = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_PRAIRIE_FERN);
            add(BOPBlocks.BOP_PRAIRIE_GRASS);
            add(BOPBlocks.TALL_BOP_PRAIRIE_GRASS);
            add(BOPBlocks.LARGE_BOP_PRAIRIE_FERN);
            add(BOPBlocks.BOP_PRAIRIE_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_PRAIRIE_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_PRAIRIE_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_PRAIRIE_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> scrubland = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_SCRUBLAND_FERN);
            add(BOPBlocks.BOP_SCRUBLAND_GRASS);
            add(BOPBlocks.TALL_BOP_SCRUBLAND_GRASS);
            add(BOPBlocks.LARGE_BOP_SCRUBLAND_FERN);
            add(BOPBlocks.BOP_SCRUBLAND_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_SCRUBLAND_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_SCRUBLAND_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_SCRUBLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> shrubland = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_SHRUBLAND_FERN);
            add(BOPBlocks.BOP_SHRUBLAND_GRASS);
            add(BOPBlocks.TALL_BOP_SHRUBLAND_GRASS);
            add(BOPBlocks.LARGE_BOP_SHRUBLAND_FERN);
            add(BOPBlocks.BOP_SHRUBLAND_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_SHRUBLAND_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_SHRUBLAND_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_SHRUBLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> seasonal_forest = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_SEASONAL_FOREST_FERN);
            add(BOPBlocks.BOP_SEASONAL_FOREST_GRASS);
            add(BOPBlocks.TALL_BOP_SEASONAL_FOREST_GRASS);
            add(BOPBlocks.LARGE_BOP_SEASONAL_FOREST_FERN);
            add(BOPBlocks.BOP_SEASONAL_FOREST_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_SEASONAL_FOREST_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_SEASONAL_FOREST_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_SEASONAL_FOREST_ACACIA_LEAVES_CARPET);
        }
    };


    public static List<Block> tropics = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_TROPICS_FERN);
            add(BOPBlocks.BOP_TROPICS_GRASS);
            add(BOPBlocks.TALL_BOP_TROPICS_GRASS);
            add(BOPBlocks.LARGE_BOP_TROPICS_FERN);
            add(BOPBlocks.BOP_TROPICS_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_TROPICS_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_TROPICS_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_TROPICS_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> tundra = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_TUNDRA_FERN);
            add(BOPBlocks.BOP_TUNDRA_GRASS);
            add(BOPBlocks.TALL_BOP_TUNDRA_GRASS);
            add(BOPBlocks.LARGE_BOP_TUNDRA_FERN);
            add(BOPBlocks.BOP_TUNDRA_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_TUNDRA_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_TUNDRA_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_TUNDRA_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> wasteland = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_WASTELAND_FERN);
            add(BOPBlocks.BOP_WASTELAND_GRASS);
            add(BOPBlocks.TALL_BOP_WASTELAND_GRASS);
            add(BOPBlocks.LARGE_BOP_WASTELAND_FERN);
            add(BOPBlocks.BOP_WASTELAND_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_WASTELAND_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_WASTELAND_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_WASTELAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> wetland = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_WETLAND_FERN);
            add(BOPBlocks.BOP_WETLAND_GRASS);
            add(BOPBlocks.TALL_BOP_WETLAND_GRASS);
            add(BOPBlocks.LARGE_BOP_WETLAND_FERN);
            add(BOPBlocks.BOP_WETLAND_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_WETLAND_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_WETLAND_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_WETLAND_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> rainforest = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_RAINFOREST_FERN);
            add(BOPBlocks.BOP_RAINFOREST_GRASS);
            add(BOPBlocks.TALL_BOP_RAINFOREST_GRASS);
            add(BOPBlocks.LARGE_BOP_RAINFOREST_FERN);
            add(BOPBlocks.BOP_RAINFOREST_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_RAINFOREST_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_RAINFOREST_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_RAINFOREST_ACACIA_LEAVES_CARPET);
        }
    };

    public static List<Block> bop_volcano = new ArrayList<Block>() {
        {
            add(BOPBlocks.BOP_VOLCANO_FERN);
            add(BOPBlocks.BOP_VOLCANO_GRASS);
            add(BOPBlocks.TALL_BOP_VOLCANO_GRASS);
            add(BOPBlocks.LARGE_BOP_VOLCANO_FERN);
            add(BOPBlocks.BOP_VOLCANO_JUNGLE_LEAVES_CARPET);
            add(BOPBlocks.BOP_VOLCANO_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_VOLCANO_DARK_OAK_LEAVES_CARPET);
            add(BOPBlocks.BOP_VOLCANO_ACACIA_LEAVES_CARPET);
        }
    };



}
