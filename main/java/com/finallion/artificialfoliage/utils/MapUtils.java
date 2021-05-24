package com.finallion.artificialfoliage.utils;

import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseBlocks;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Map;

public class MapUtils {

    public static Map<Block, List<Block>> initMap(Map<Block, List<Block>> grassFeatures) {
        grassFeatures.put(ARFOBlocks.JUNGLE_GRASS_BLOCK, GrassFeatures.jungle);
        grassFeatures.put(ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, GrassFeatures.jungle_edge);
        grassFeatures.put(ARFOBlocks.BADLANDS_GRASS_BLOCK, GrassFeatures.badlands);
        grassFeatures.put(ARFOBlocks.SAVANNA_GRASS_BLOCK, GrassFeatures.savanna);
        grassFeatures.put(ARFOBlocks.FOREST_GRASS_BLOCK, GrassFeatures.forest);
        grassFeatures.put(ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, GrassFeatures.birch_forest);
        grassFeatures.put(ARFOBlocks.DARK_FOREST_GRASS_BLOCK, GrassFeatures.dark_forest);
        grassFeatures.put(ARFOBlocks.PLAINS_GRASS_BLOCK, GrassFeatures.plains);
        grassFeatures.put(ARFOBlocks.SWAMP_GRASS_BLOCK, GrassFeatures.swamp);
        grassFeatures.put(ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, GrassFeatures.lush_swamp);
        grassFeatures.put(ARFOBlocks.MOUNTAINS_GRASS_BLOCK, GrassFeatures.mountains);
        grassFeatures.put(ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, GrassFeatures.mushrooms_fields);
        grassFeatures.put(ARFOBlocks.TAIGA_GRASS_BLOCK, GrassFeatures.taiga);
        grassFeatures.put(ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, GrassFeatures.mega_taiga);
        grassFeatures.put(ARFOBlocks.SNOWY_GRASS_BLOCK, GrassFeatures.snowy_biomes);
        grassFeatures.put(ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, GrassFeatures.snowy_beach);
        grassFeatures.put(ARFOBlocks.WATERS_GRASS_BLOCK, GrassFeatures.waters);

        grassFeatures.put(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, GrassFeatures.arid_highlands);
        grassFeatures.put(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, GrassFeatures.autumnal_woods);
        grassFeatures.put(TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, GrassFeatures.cliffs);
        grassFeatures.put(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, GrassFeatures.snowy_cliffs);
        grassFeatures.put(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, GrassFeatures.coniferous_forest);
        grassFeatures.put(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, GrassFeatures.snowy_coniferous_forest);
        grassFeatures.put(TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, GrassFeatures.meadow);
        grassFeatures.put(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, GrassFeatures.rolling_hills);
        grassFeatures.put(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, GrassFeatures.traverse_lush_swamp);
        grassFeatures.put(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, GrassFeatures.plains_plateau);
        grassFeatures.put(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, GrassFeatures.wooded_island);
        grassFeatures.put(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, GrassFeatures.woodlands);

        return grassFeatures;
    }



    public static Map<Block, Block> initFernMap(Map<Block, Block> grassFeatures) {
        grassFeatures.put(ARFOBlocks.JUNGLE_FERN, ARFOBlocks.LARGE_JUNGLE_FERN);
        grassFeatures.put(ARFOBlocks.JUNGLE_EDGE_FERN, ARFOBlocks.LARGE_JUNGLE_EDGE_FERN);
        grassFeatures.put(ARFOBlocks.BADLANDS_FERN, ARFOBlocks.LARGE_BADLANDS_FERN);
        grassFeatures.put(ARFOBlocks.SAVANNA_FERN, ARFOBlocks.LARGE_SAVANNA_FERN);
        grassFeatures.put(ARFOBlocks.FOREST_FERN, ARFOBlocks.LARGE_FOREST_FERN);
        grassFeatures.put(ARFOBlocks.BIRCH_FOREST_FERN, ARFOBlocks.LARGE_BIRCH_FOREST_FERN);
        grassFeatures.put(ARFOBlocks.DARK_FOREST_FERN, ARFOBlocks.LARGE_DARK_FOREST_FERN);
        grassFeatures.put(ARFOBlocks.PLAINS_FERN, ARFOBlocks.LARGE_PLAINS_FERN);
        grassFeatures.put(ARFOBlocks.SWAMP_FERN, ARFOBlocks.LARGE_SWAMP_FERN);
        grassFeatures.put(ARFOBlocks.LUSH_SWAMP_FERN, ARFOBlocks.LARGE_LUSH_SWAMP_FERN);
        grassFeatures.put(ARFOBlocks.MOUNTAINS_FERN, ARFOBlocks.LARGE_MOUNTAINS_FERN);
        grassFeatures.put(ARFOBlocks.MUSHROOM_FIELDS_FERN, ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN);
        grassFeatures.put(ARFOBlocks.TAIGA_FERN, ARFOBlocks.LARGE_TAIGA_FERN);
        grassFeatures.put(ARFOBlocks.MEGA_TAIGA_FERN, ARFOBlocks.LARGE_MEGA_TAIGA_FERN);
        grassFeatures.put(ARFOBlocks.SNOWY_FERN, ARFOBlocks.LARGE_SNOWY_FERN);
        grassFeatures.put(ARFOBlocks.SNOWY_BEACH_FERN, ARFOBlocks.LARGE_SNOWY_BEACH_FERN);
        grassFeatures.put(ARFOBlocks.WATERS_FERN, ARFOBlocks.LARGE_WATERS_FERN);

        grassFeatures.put(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_FERN, TraverseBlocks.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseBlocks.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_CLIFFS_FERN, TraverseBlocks.LARGE_TRAVERSE_CLIFFS_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_FERN, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseBlocks.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_LUSH_SWAMP_FERN, TraverseBlocks.LARGE_TRAVERSE_LUSH_SWAMP_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_MEADOW_FERN, TraverseBlocks.LARGE_TRAVERSE_MEADOW_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_ROLLING_HILLS_FERN, TraverseBlocks.LARGE_TRAVERSE_ROLLING_HILLS_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_FERN, TraverseBlocks.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_WOODED_ISLAND_FERN, TraverseBlocks.LARGE_TRAVERSE_WOODED_ISLAND_FERN);
        grassFeatures.put(TraverseBlocks.TRAVERSE_WOODLANDS_FERN, TraverseBlocks.LARGE_TRAVERSE_WOODLANDS_FERN);

        return grassFeatures;
    }

    public static Map<Block, Block> initGrassMap(Map<Block, Block> grassFeatures) {
        grassFeatures.put(ARFOBlocks.JUNGLE_GRASS, ARFOBlocks.TALL_JUNGLE_GRASS);
        grassFeatures.put(ARFOBlocks.JUNGLE_EDGE_GRASS, ARFOBlocks.TALL_JUNGLE_EDGE_GRASS);
        grassFeatures.put(ARFOBlocks.BADLANDS_GRASS, ARFOBlocks.TALL_BADLANDS_GRASS);
        grassFeatures.put(ARFOBlocks.SAVANNA_GRASS, ARFOBlocks.TALL_SAVANNA_GRASS);
        grassFeatures.put(ARFOBlocks.FOREST_GRASS, ARFOBlocks.TALL_FOREST_GRASS);
        grassFeatures.put(ARFOBlocks.BIRCH_FOREST_GRASS, ARFOBlocks.TALL_BIRCH_FOREST_GRASS);
        grassFeatures.put(ARFOBlocks.DARK_FOREST_GRASS, ARFOBlocks.TALL_DARK_FOREST_GRASS);
        grassFeatures.put(ARFOBlocks.PLAINS_GRASS, ARFOBlocks.TALL_PLAINS_GRASS);
        grassFeatures.put(ARFOBlocks.SWAMP_GRASS, ARFOBlocks.TALL_SWAMP_GRASS);
        grassFeatures.put(ARFOBlocks.LUSH_SWAMP_GRASS, ARFOBlocks.TALL_LUSH_SWAMP_GRASS);
        grassFeatures.put(ARFOBlocks.MOUNTAINS_GRASS, ARFOBlocks.TALL_MOUNTAINS_GRASS);
        grassFeatures.put(ARFOBlocks.MUSHROOM_FIELDS_GRASS, ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS);
        grassFeatures.put(ARFOBlocks.TAIGA_GRASS, ARFOBlocks.TALL_TAIGA_GRASS);
        grassFeatures.put(ARFOBlocks.MEGA_TAIGA_GRASS, ARFOBlocks.TALL_MEGA_TAIGA_GRASS);
        grassFeatures.put(ARFOBlocks.SNOWY_GRASS, ARFOBlocks.TALL_SNOWY_GRASS);
        grassFeatures.put(ARFOBlocks.SNOWY_BEACH_GRASS, ARFOBlocks.TALL_SNOWY_BEACH_GRASS);
        grassFeatures.put(ARFOBlocks.WATERS_GRASS, ARFOBlocks.TALL_WATERS_GRASS);

        grassFeatures.put(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseBlocks.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseBlocks.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_CLIFFS_GRASS, TraverseBlocks.TALL_TRAVERSE_CLIFFS_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseBlocks.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TALL_TRAVERSE_LUSH_SWAMP_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_MEADOW_GRASS, TraverseBlocks.TALL_TRAVERSE_MEADOW_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS, TraverseBlocks.TALL_TRAVERSE_ROLLING_HILLS_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseBlocks.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS, TraverseBlocks.TALL_TRAVERSE_WOODED_ISLAND_GRASS);
        grassFeatures.put(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS, TraverseBlocks.TALL_TRAVERSE_WOODLANDS_GRASS);

        return grassFeatures;
    }


}
