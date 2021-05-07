package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.item.*;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;

import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;


public class ModItems {


    // block items
    public static final BlockItem ARTIFICIAL_SOIL = initBlockItem(ModBlocks.ARTIFICIAL_SOIL);
    public static final BlockItem JUNGLE_GRASS_BLOCK = initBlockItem(ModBlocks.JUNGLE_GRASS_BLOCK);
    public static final BlockItem BADLANDS_GRASS_BLOCK = initBlockItem(ModBlocks.BADLANDS_GRASS_BLOCK);
    public static final BlockItem SAVANNA_GRASS_BLOCK = initBlockItem(ModBlocks.SAVANNA_GRASS_BLOCK);
    public static final BlockItem JUNGLE_EDGE_GRASS_BLOCK = initBlockItem(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK);
    public static final BlockItem FOREST_GRASS_BLOCK = initBlockItem(ModBlocks.FOREST_GRASS_BLOCK);
    public static final BlockItem BIRCH_FOREST_GRASS_BLOCK = initBlockItem(ModBlocks.BIRCH_FOREST_GRASS_BLOCK);
    public static final BlockItem DARK_FOREST_GRASS_BLOCK = initBlockItem(ModBlocks.DARK_FOREST_GRASS_BLOCK);
    public static final BlockItem LUSH_SWAMP_GRASS_BLOCK = initBlockItem(ModBlocks.LUSH_SWAMP_GRASS_BLOCK);
    public static final BlockItem SWAMP_GRASS_BLOCK = initBlockItem(ModBlocks.SWAMP_GRASS_BLOCK);
    public static final BlockItem PLAINS_GRASS_BLOCK = initBlockItem(ModBlocks.PLAINS_GRASS_BLOCK);
    public static final BlockItem WATERS_GRASS_BLOCK = initBlockItem(ModBlocks.WATERS_GRASS_BLOCK);
    public static final BlockItem MUSHROOM_FIELDS_GRASS_BLOCK = initBlockItem(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK);
    public static final BlockItem MOUNTAINS_GRASS_BLOCK = initBlockItem(ModBlocks.MOUNTAINS_GRASS_BLOCK);
    public static final BlockItem SNOWY_BEACH_GRASS_BLOCK = initBlockItem(ModBlocks.SNOWY_BEACH_GRASS_BLOCK);
    public static final BlockItem MEGA_TAIGA_GRASS_BLOCK = initBlockItem(ModBlocks.MEGA_TAIGA_GRASS_BLOCK);
    public static final BlockItem TAIGA_GRASS_BLOCK = initBlockItem(ModBlocks.TAIGA_GRASS_BLOCK);
    public static final BlockItem SNOWY_GRASS_BLOCK = initBlockItem(ModBlocks.SNOWY_GRASS_BLOCK);

    public static final BlockItem ALPHA_GRASS_BLOCK = initBlockItem(ModBlocks.ALPHA_GRASS_BLOCK);
    public static final BlockItem ALPHA_LEAVES = initBlockItem(ModBlocks.ALPHA_LEAVES);

    public static final BlockItem TROPICAL_JUNGLE_LEAVES = initBlockItem(ModBlocks.TROPICAL_JUNGLE_LEAVES);
    public static final BlockItem BADLANDS_JUNGLE_LEAVES = initBlockItem(ModBlocks.BADLANDS_JUNGLE_LEAVES);
    public static final BlockItem SAVANNA_JUNGLE_LEAVES = initBlockItem(ModBlocks.SAVANNA_JUNGLE_LEAVES);
    public static final BlockItem TROPICAL_EDGE_JUNGLE_LEAVES = initBlockItem(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES);
    public static final BlockItem FOREST_JUNGLE_LEAVES = initBlockItem(ModBlocks.FOREST_JUNGLE_LEAVES);
    public static final BlockItem BIRCH_FOREST_JUNGLE_LEAVES = initBlockItem(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES);
    public static final BlockItem SWAMP_JUNGLE_LEAVES = initBlockItem(ModBlocks.SWAMP_JUNGLE_LEAVES);
    public static final BlockItem PLAINS_JUNGLE_LEAVES = initBlockItem(ModBlocks.PLAINS_JUNGLE_LEAVES);
    public static final BlockItem WATERS_JUNGLE_LEAVES = initBlockItem(ModBlocks.WATERS_JUNGLE_LEAVES);
    public static final BlockItem MOUNTAINS_JUNGLE_LEAVES = initBlockItem(ModBlocks.MOUNTAINS_JUNGLE_LEAVES);
    public static final BlockItem MUSHROOM_FIELDS_JUNGLE_LEAVES = initBlockItem(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES);
    public static final BlockItem TAIGA_JUNGLE_LEAVES = initBlockItem(ModBlocks.TAIGA_JUNGLE_LEAVES);
    public static final BlockItem SNOWY_JUNGLE_LEAVES = initBlockItem(ModBlocks.SNOWY_JUNGLE_LEAVES);
    public static final BlockItem MEGA_TAIGA_JUNGLE_LEAVES = initBlockItem(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES);
    public static final BlockItem SNOWY_BEACH_JUNGLE_LEAVES = initBlockItem(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES);

    public static final BlockItem TROPICAL_OAK_LEAVES = initBlockItem(ModBlocks.TROPICAL_OAK_LEAVES);
    public static final BlockItem BADLANDS_OAK_LEAVES = initBlockItem(ModBlocks.BADLANDS_OAK_LEAVES);
    public static final BlockItem SAVANNA_OAK_LEAVES = initBlockItem(ModBlocks.SAVANNA_OAK_LEAVES);
    public static final BlockItem TROPICAL_EDGE_OAK_LEAVES = initBlockItem(ModBlocks.TROPICAL_EDGE_OAK_LEAVES);
    public static final BlockItem FOREST_OAK_LEAVES = initBlockItem(ModBlocks.FOREST_OAK_LEAVES);
    public static final BlockItem BIRCH_FOREST_OAK_LEAVES = initBlockItem(ModBlocks.BIRCH_FOREST_OAK_LEAVES);
    public static final BlockItem SWAMP_OAK_LEAVES = initBlockItem(ModBlocks.SWAMP_OAK_LEAVES);
    public static final BlockItem PLAINS_OAK_LEAVES = initBlockItem(ModBlocks.PLAINS_OAK_LEAVES);
    public static final BlockItem WATERS_OAK_LEAVES = initBlockItem(ModBlocks.WATERS_OAK_LEAVES);
    public static final BlockItem MOUNTAINS_OAK_LEAVES = initBlockItem(ModBlocks.MOUNTAINS_OAK_LEAVES);
    public static final BlockItem MUSHROOM_FIELDS_OAK_LEAVES = initBlockItem(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES);
    public static final BlockItem TAIGA_OAK_LEAVES = initBlockItem(ModBlocks.TAIGA_OAK_LEAVES);
    public static final BlockItem MEGA_TAIGA_OAK_LEAVES = initBlockItem(ModBlocks.MEGA_TAIGA_OAK_LEAVES);
    public static final BlockItem SNOWY_OAK_LEAVES = initBlockItem(ModBlocks.SNOWY_OAK_LEAVES);
    public static final BlockItem SNOWY_BEACH_OAK_LEAVES = initBlockItem(ModBlocks.SNOWY_BEACH_OAK_LEAVES);

    public static final BlockItem TROPICAL_DARK_OAK_LEAVES = initBlockItem(ModBlocks.TROPICAL_DARK_OAK_LEAVES);
    public static final BlockItem BADLANDS_DARK_OAK_LEAVES = initBlockItem(ModBlocks.BADLANDS_DARK_OAK_LEAVES);
    public static final BlockItem SAVANNA_DARK_OAK_LEAVES = initBlockItem(ModBlocks.SAVANNA_DARK_OAK_LEAVES);
    public static final BlockItem TROPICAL_EDGE_DARK_OAK_LEAVES = initBlockItem(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES);
    public static final BlockItem FOREST_DARK_OAK_LEAVES = initBlockItem(ModBlocks.FOREST_DARK_OAK_LEAVES);
    public static final BlockItem BIRCH_FOREST_DARK_OAK_LEAVES = initBlockItem(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES);
    public static final BlockItem SWAMP_DARK_OAK_LEAVES = initBlockItem(ModBlocks.SWAMP_DARK_OAK_LEAVES);
    public static final BlockItem PLAINS_DARK_OAK_LEAVES = initBlockItem(ModBlocks.PLAINS_DARK_OAK_LEAVES);
    public static final BlockItem WATERS_DARK_OAK_LEAVES = initBlockItem(ModBlocks.WATERS_DARK_OAK_LEAVES);
    public static final BlockItem MOUNTAINS_DARK_OAK_LEAVES = initBlockItem(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES);
    public static final BlockItem MUSHROOM_FIELDS_DARK_OAK_LEAVES = initBlockItem(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES);
    public static final BlockItem TAIGA_DARK_OAK_LEAVES = initBlockItem(ModBlocks.TAIGA_DARK_OAK_LEAVES);
    public static final BlockItem MEGA_TAIGA_DARK_OAK_LEAVES = initBlockItem(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES);
    public static final BlockItem SNOWY_DARK_OAK_LEAVES = initBlockItem(ModBlocks.SNOWY_DARK_OAK_LEAVES);
    public static final BlockItem SNOWY_BEACH_DARK_OAK_LEAVES = initBlockItem(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES);

    public static final BlockItem TROPICAL_ACACIA_LEAVES = initBlockItem(ModBlocks.TROPICAL_ACACIA_LEAVES);
    public static final BlockItem BADLANDS_ACACIA_LEAVES = initBlockItem(ModBlocks.BADLANDS_ACACIA_LEAVES);
    public static final BlockItem SAVANNA_ACACIA_LEAVES = initBlockItem(ModBlocks.SAVANNA_ACACIA_LEAVES);
    public static final BlockItem TROPICAL_EDGE_ACACIA_LEAVES = initBlockItem(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES);
    public static final BlockItem FOREST_ACACIA_LEAVES = initBlockItem(ModBlocks.FOREST_ACACIA_LEAVES);
    public static final BlockItem BIRCH_FOREST_ACACIA_LEAVES = initBlockItem(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES);
    public static final BlockItem SWAMP_ACACIA_LEAVES = initBlockItem(ModBlocks.SWAMP_ACACIA_LEAVES);
    public static final BlockItem PLAINS_ACACIA_LEAVES = initBlockItem(ModBlocks.PLAINS_ACACIA_LEAVES);
    public static final BlockItem WATERS_ACACIA_LEAVES = initBlockItem(ModBlocks.WATERS_ACACIA_LEAVES);
    public static final BlockItem MOUNTAINS_ACACIA_LEAVES = initBlockItem(ModBlocks.MOUNTAINS_ACACIA_LEAVES);
    public static final BlockItem MUSHROOM_FIELDS_ACACIA_LEAVES = initBlockItem(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES);
    public static final BlockItem TAIGA_ACACIA_LEAVES = initBlockItem(ModBlocks.TAIGA_ACACIA_LEAVES);
    public static final BlockItem MEGA_TAIGA_ACACIA_LEAVES = initBlockItem(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES);
    public static final BlockItem SNOWY_ACACIA_LEAVES = initBlockItem(ModBlocks.SNOWY_ACACIA_LEAVES);
    public static final BlockItem SNOWY_BEACH_ACACIA_LEAVES = initBlockItem(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES);

    public static final BlockItem TROPICAL_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_OAK_LEAVES_CARPET);
    public static final BlockItem BADLANDS_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.BADLANDS_OAK_LEAVES_CARPET);
    public static final BlockItem SAVANNA_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SAVANNA_OAK_LEAVES_CARPET);
    public static final BlockItem TROPICAL_EDGE_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET);
    public static final BlockItem FOREST_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.FOREST_OAK_LEAVES_CARPET);
    public static final BlockItem BIRCH_FOREST_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET);
    public static final BlockItem SWAMP_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SWAMP_OAK_LEAVES_CARPET);
    public static final BlockItem PLAINS_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.PLAINS_OAK_LEAVES_CARPET);
    public static final BlockItem WATERS_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.WATERS_OAK_LEAVES_CARPET);
    public static final BlockItem MOUNTAINS_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET);
    public static final BlockItem MUSHROOM_FIELDS_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET);
    public static final BlockItem TAIGA_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.TAIGA_OAK_LEAVES_CARPET);
    public static final BlockItem MEGA_TAIGA_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET);
    public static final BlockItem SNOWY_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_OAK_LEAVES_CARPET);
    public static final BlockItem SNOWY_BEACH_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET);

    public static final BlockItem TROPICAL_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET);
    public static final BlockItem BADLANDS_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET);
    public static final BlockItem SAVANNA_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET);
    public static final BlockItem TROPICAL_EDGE_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET);
    public static final BlockItem FOREST_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.FOREST_JUNGLE_LEAVES_CARPET);
    public static final BlockItem BIRCH_FOREST_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET);
    public static final BlockItem SWAMP_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET);
    public static final BlockItem PLAINS_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET);
    public static final BlockItem WATERS_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.WATERS_JUNGLE_LEAVES_CARPET);
    public static final BlockItem MOUNTAINS_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET);
    public static final BlockItem MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET);
    public static final BlockItem TAIGA_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET);
    public static final BlockItem SNOWY_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET);
    public static final BlockItem MEGA_TAIGA_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET);
    public static final BlockItem SNOWY_BEACH_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET);

    public static final BlockItem TROPICAL_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem BADLANDS_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem SAVANNA_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem FOREST_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem BIRCH_FOREST_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem SWAMP_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem PLAINS_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem WATERS_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem MOUNTAINS_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem TAIGA_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem MEGA_TAIGA_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem SNOWY_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem SNOWY_BEACH_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET);

    public static final BlockItem TROPICAL_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET);
    public static final BlockItem BADLANDS_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET);
    public static final BlockItem SAVANNA_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET);
    public static final BlockItem TROPICAL_EDGE_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET);
    public static final BlockItem FOREST_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.FOREST_ACACIA_LEAVES_CARPET);
    public static final BlockItem BIRCH_FOREST_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET);
    public static final BlockItem SWAMP_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.SWAMP_ACACIA_LEAVES_CARPET);
    public static final BlockItem PLAINS_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.PLAINS_ACACIA_LEAVES_CARPET);
    public static final BlockItem WATERS_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.WATERS_ACACIA_LEAVES_CARPET);
    public static final BlockItem MOUNTAINS_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET);
    public static final BlockItem MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET);
    public static final BlockItem TAIGA_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.TAIGA_ACACIA_LEAVES_CARPET);
    public static final BlockItem MEGA_TAIGA_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET);
    public static final BlockItem SNOWY_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_ACACIA_LEAVES_CARPET);
    public static final BlockItem SNOWY_BEACH_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET);

    public static final BlockItem DARK_FOREST_OAK_LEAVES = initBlockItem(ModBlocks.DARK_FOREST_OAK_LEAVES);
    public static final BlockItem DARK_FOREST_DARK_OAK_LEAVES = initBlockItem(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES);
    public static final BlockItem DARK_FOREST_JUNGLE_LEAVES = initBlockItem(ModBlocks.DARK_FOREST_JUNGLE_LEAVES);
    public static final BlockItem DARK_FOREST_ACACIA_LEAVES = initBlockItem(ModBlocks.DARK_FOREST_ACACIA_LEAVES);
    public static final BlockItem LUSH_SWAMP_OAK_LEAVES = initBlockItem(ModBlocks.LUSH_SWAMP_OAK_LEAVES);
    public static final BlockItem LUSH_SWAMP_DARK_OAK_LEAVES = initBlockItem(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES);
    public static final BlockItem LUSH_SWAMP_JUNGLE_LEAVES = initBlockItem(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES);
    public static final BlockItem LUSH_SWAMP_ACACIA_LEAVES = initBlockItem(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES);
    public static final BlockItem DARK_FOREST_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET);
    public static final BlockItem DARK_FOREST_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem DARK_FOREST_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET);
    public static final BlockItem DARK_FOREST_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET);
    public static final BlockItem LUSH_SWAMP_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET);
    public static final BlockItem LUSH_SWAMP_DARK_OAK_LEAVES_CARPET = initBlockItem(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET);
    public static final BlockItem LUSH_SWAMP_JUNGLE_LEAVES_CARPET = initBlockItem(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET);
    public static final BlockItem LUSH_SWAMP_ACACIA_LEAVES_CARPET = initBlockItem(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET);

    public static final BlockItem SPRUCE_LEAVES_CARPET = initBlockItem(ModBlocks.SPRUCE_LEAVES_CARPET);
    public static final BlockItem BIRCH_LEAVES_CARPET = initBlockItem(ModBlocks.BIRCH_LEAVES_CARPET);

    // ferns and large ferns
    public static final BlockItem JUNGLE_FERN = initBlockItem(ModBlocks.JUNGLE_FERN);
    public static final BlockItem LARGE_JUNGLE_FERN = initBlockItem(ModBlocks.LARGE_JUNGLE_FERN);
    public static final BlockItem JUNGLE_EDGE_FERN = initBlockItem(ModBlocks.JUNGLE_EDGE_FERN);
    public static final BlockItem LARGE_JUNGLE_EDGE_FERN = initBlockItem(ModBlocks.LARGE_JUNGLE_EDGE_FERN);
    public static final BlockItem BADLANDS_FERN = initBlockItem(ModBlocks.BADLANDS_FERN);
    public static final BlockItem LARGE_BADLANDS_FERN = initBlockItem(ModBlocks.LARGE_BADLANDS_FERN);
    public static final BlockItem SAVANNA_FERN = initBlockItem(ModBlocks.SAVANNA_FERN);
    public static final BlockItem LARGE_SAVANNA_FERN = initBlockItem(ModBlocks.LARGE_SAVANNA_FERN);
    public static final BlockItem FOREST_FERN = initBlockItem(ModBlocks.FOREST_FERN);
    public static final BlockItem LARGE_FOREST_FERN = initBlockItem(ModBlocks.LARGE_FOREST_FERN);
    public static final BlockItem BIRCH_FOREST_FERN = initBlockItem(ModBlocks.BIRCH_FOREST_FERN);
    public static final BlockItem LARGE_BIRCH_FOREST_FERN = initBlockItem(ModBlocks.LARGE_BIRCH_FOREST_FERN);
    public static final BlockItem DARK_FOREST_FERN = initBlockItem(ModBlocks.DARK_FOREST_FERN);
    public static final BlockItem LARGE_DARK_FOREST_FERN = initBlockItem(ModBlocks.LARGE_DARK_FOREST_FERN);
    public static final BlockItem PLAINS_FERN = initBlockItem(ModBlocks.PLAINS_FERN);
    public static final BlockItem LARGE_PLAINS_FERN = initBlockItem(ModBlocks.LARGE_PLAINS_FERN);
    public static final BlockItem SWAMP_FERN = initBlockItem(ModBlocks.SWAMP_FERN);
    public static final BlockItem LARGE_SWAMP_FERN = initBlockItem(ModBlocks.LARGE_SWAMP_FERN);
    public static final BlockItem LUSH_SWAMP_FERN = initBlockItem(ModBlocks.LUSH_SWAMP_FERN);
    public static final BlockItem LARGE_LUSH_SWAMP_FERN = initBlockItem(ModBlocks.LARGE_LUSH_SWAMP_FERN);
    public static final BlockItem MOUNTAINS_FERN = initBlockItem(ModBlocks.MOUNTAINS_FERN);
    public static final BlockItem LARGE_MOUNTAINS_FERN = initBlockItem(ModBlocks.LARGE_MOUNTAINS_FERN);
    public static final BlockItem MUSHROOM_FIELDS_FERN = initBlockItem(ModBlocks.MUSHROOM_FIELDS_FERN);
    public static final BlockItem LARGE_MUSHROOM_FIELDS_FERN = initBlockItem(ModBlocks.LARGE_MUSHROOM_FIELDS_FERN);
    public static final BlockItem TAIGA_FERN = initBlockItem(ModBlocks.TAIGA_FERN);
    public static final BlockItem LARGE_TAIGA_FERN = initBlockItem(ModBlocks.LARGE_TAIGA_FERN);
    public static final BlockItem MEGA_TAIGA_FERN = initBlockItem(ModBlocks.MEGA_TAIGA_FERN);
    public static final BlockItem LARGE_MEGA_TAIGA_FERN = initBlockItem(ModBlocks.LARGE_MEGA_TAIGA_FERN);
    public static final BlockItem SNOWY_FERN = initBlockItem(ModBlocks.SNOWY_FERN);
    public static final BlockItem LARGE_SNOWY_FERN = initBlockItem(ModBlocks.LARGE_SNOWY_FERN);
    public static final BlockItem SNOWY_BEACH_FERN = initBlockItem(ModBlocks.SNOWY_BEACH_FERN);
    public static final BlockItem LARGE_SNOWY_BEACH_FERN = initBlockItem(ModBlocks.LARGE_SNOWY_BEACH_FERN);
    public static final BlockItem WATERS_FERN = initBlockItem(ModBlocks.WATERS_FERN);
    public static final BlockItem LARGE_WATERS_FERN = initBlockItem(ModBlocks.LARGE_WATERS_FERN);

    // grass and tall grass
    public static final BlockItem JUNGLE_GRASS = initBlockItem(ModBlocks.JUNGLE_GRASS);
    public static final BlockItem TALL_JUNGLE_GRASS = initBlockItem(ModBlocks.TALL_JUNGLE_GRASS);
    public static final BlockItem JUNGLE_EDGE_GRASS = initBlockItem(ModBlocks.JUNGLE_EDGE_GRASS);
    public static final BlockItem TALL_JUNGLE_EDGE_GRASS = initBlockItem(ModBlocks.TALL_JUNGLE_EDGE_GRASS);
    public static final BlockItem BADLANDS_GRASS = initBlockItem(ModBlocks.BADLANDS_GRASS);
    public static final BlockItem TALL_BADLANDS_GRASS = initBlockItem(ModBlocks.TALL_BADLANDS_GRASS);
    public static final BlockItem SAVANNA_GRASS = initBlockItem(ModBlocks.SAVANNA_GRASS);
    public static final BlockItem TALL_SAVANNA_GRASS = initBlockItem(ModBlocks.TALL_SAVANNA_GRASS);
    public static final BlockItem FOREST_GRASS = initBlockItem(ModBlocks.FOREST_GRASS);
    public static final BlockItem TALL_FOREST_GRASS = initBlockItem(ModBlocks.TALL_FOREST_GRASS);
    public static final BlockItem BIRCH_FOREST_GRASS = initBlockItem(ModBlocks.BIRCH_FOREST_GRASS);
    public static final BlockItem TALL_BIRCH_FOREST_GRASS = initBlockItem(ModBlocks.TALL_BIRCH_FOREST_GRASS);
    public static final BlockItem DARK_FOREST_GRASS = initBlockItem(ModBlocks.DARK_FOREST_GRASS);
    public static final BlockItem TALL_DARK_FOREST_GRASS = initBlockItem(ModBlocks.TALL_DARK_FOREST_GRASS);
    public static final BlockItem PLAINS_GRASS = initBlockItem(ModBlocks.PLAINS_GRASS);
    public static final BlockItem TALL_PLAINS_GRASS = initBlockItem(ModBlocks.TALL_PLAINS_GRASS);
    public static final BlockItem SWAMP_GRASS = initBlockItem(ModBlocks.SWAMP_GRASS);
    public static final BlockItem TALL_SWAMP_GRASS = initBlockItem(ModBlocks.TALL_SWAMP_GRASS);
    public static final BlockItem LUSH_SWAMP_GRASS = initBlockItem(ModBlocks.LUSH_SWAMP_GRASS);
    public static final BlockItem TALL_LUSH_SWAMP_GRASS = initBlockItem(ModBlocks.TALL_LUSH_SWAMP_GRASS);
    public static final BlockItem MOUNTAINS_GRASS = initBlockItem(ModBlocks.MOUNTAINS_GRASS);
    public static final BlockItem TALL_MOUNTAINS_GRASS = initBlockItem(ModBlocks.TALL_MOUNTAINS_GRASS);
    public static final BlockItem MUSHROOM_FIELDS_GRASS = initBlockItem(ModBlocks.MUSHROOM_FIELDS_GRASS);
    public static final BlockItem TALL_MUSHROOM_FIELDS_GRASS = initBlockItem(ModBlocks.TALL_MUSHROOM_FIELDS_GRASS);
    public static final BlockItem TAIGA_GRASS = initBlockItem(ModBlocks.TAIGA_GRASS);
    public static final BlockItem TALL_TAIGA_GRASS = initBlockItem(ModBlocks.TALL_TAIGA_GRASS);
    public static final BlockItem MEGA_TAIGA_GRASS = initBlockItem(ModBlocks.MEGA_TAIGA_GRASS);
    public static final BlockItem TALL_MEGA_TAIGA_GRASS = initBlockItem(ModBlocks.TALL_MEGA_TAIGA_GRASS);
    public static final BlockItem SNOWY_GRASS = initBlockItem(ModBlocks.SNOWY_GRASS);
    public static final BlockItem TALL_SNOWY_GRASS = initBlockItem(ModBlocks.TALL_SNOWY_GRASS);
    public static final BlockItem SNOWY_BEACH_GRASS = initBlockItem(ModBlocks.SNOWY_BEACH_GRASS);
    public static final BlockItem TALL_SNOWY_BEACH_GRASS = initBlockItem(ModBlocks.TALL_SNOWY_BEACH_GRASS);
    public static final BlockItem WATERS_GRASS = initBlockItem(ModBlocks.WATERS_GRASS);
    public static final BlockItem TALL_WATERS_GRASS = initBlockItem(ModBlocks.TALL_WATERS_GRASS);

    // sugar cane
    public static final BlockItem JUNGLE_SUGAR_CANE = initBlockItem(ModBlocks.JUNGLE_SUGAR_CANE);
    public static final BlockItem JUNGLE_EDGE_SUGAR_CANE = initBlockItem(ModBlocks.JUNGLE_EDGE_SUGAR_CANE);
    public static final BlockItem BADLANDS_SUGAR_CANE = initBlockItem(ModBlocks.BADLANDS_SUGAR_CANE);
    public static final BlockItem SAVANNA_SUGAR_CANE = initBlockItem(ModBlocks.SAVANNA_SUGAR_CANE);
    public static final BlockItem FOREST_SUGAR_CANE = initBlockItem(ModBlocks.FOREST_SUGAR_CANE);
    public static final BlockItem BIRCH_FOREST_SUGAR_CANE = initBlockItem(ModBlocks.BIRCH_FOREST_SUGAR_CANE);
    public static final BlockItem DARK_FOREST_SUGAR_CANE = initBlockItem(ModBlocks.DARK_FOREST_SUGAR_CANE);
    public static final BlockItem PLAINS_SUGAR_CANE = initBlockItem(ModBlocks.PLAINS_SUGAR_CANE);
    public static final BlockItem SWAMP_SUGAR_CANE = initBlockItem(ModBlocks.SWAMP_SUGAR_CANE);
    public static final BlockItem LUSH_SWAMP_SUGAR_CANE = initBlockItem(ModBlocks.LUSH_SWAMP_SUGAR_CANE);
    public static final BlockItem MOUNTAINS_SUGAR_CANE = initBlockItem(ModBlocks.MOUNTAINS_SUGAR_CANE);
    public static final BlockItem MUSHROOM_FIELDS_SUGAR_CANE = initBlockItem(ModBlocks.MUSHROOM_FIELDS_SUGAR_CANE);
    public static final BlockItem TAIGA_SUGAR_CANE = initBlockItem(ModBlocks.TAIGA_SUGAR_CANE);
    public static final BlockItem MEGA_TAIGA_SUGAR_CANE = initBlockItem(ModBlocks.MEGA_TAIGA_SUGAR_CANE);
    public static final BlockItem SNOWY_SUGAR_CANE = initBlockItem(ModBlocks.SNOWY_SUGAR_CANE);
    public static final BlockItem SNOWY_BEACH_SUGAR_CANE = initBlockItem(ModBlocks.SNOWY_BEACH_SUGAR_CANE);
    public static final BlockItem WATERS_SUGAR_CANE = initBlockItem(ModBlocks.WATERS_SUGAR_CANE);


    // vine
    public static final BlockItem JUNGLE_VINE = initBlockItem(ModBlocks.JUNGLE_VINE);
    public static final BlockItem JUNGLE_EDGE_VINE = initBlockItem(ModBlocks.JUNGLE_EDGE_VINE);
    public static final BlockItem BADLANDS_VINE = initBlockItem(ModBlocks.BADLANDS_VINE);
    public static final BlockItem SAVANNA_VINE = initBlockItem(ModBlocks.SAVANNA_VINE);
    public static final BlockItem FOREST_VINE = initBlockItem(ModBlocks.FOREST_VINE);
    public static final BlockItem BIRCH_FOREST_VINE = initBlockItem(ModBlocks.BIRCH_FOREST_VINE);
    public static final BlockItem DARK_FOREST_VINE = initBlockItem(ModBlocks.DARK_FOREST_VINE);
    public static final BlockItem PLAINS_VINE = initBlockItem(ModBlocks.PLAINS_VINE);
    public static final BlockItem SWAMP_VINE = initBlockItem(ModBlocks.SWAMP_VINE);
    public static final BlockItem LUSH_SWAMP_VINE = initBlockItem(ModBlocks.LUSH_SWAMP_VINE);
    public static final BlockItem MOUNTAINS_VINE = initBlockItem(ModBlocks.MOUNTAINS_VINE);
    public static final BlockItem MUSHROOM_FIELDS_VINE = initBlockItem(ModBlocks.MUSHROOM_FIELDS_VINE);
    public static final BlockItem TAIGA_VINE = initBlockItem(ModBlocks.TAIGA_VINE);
    public static final BlockItem MEGA_TAIGA_VINE = initBlockItem(ModBlocks.MEGA_TAIGA_VINE);
    public static final BlockItem SNOWY_VINE = initBlockItem(ModBlocks.SNOWY_VINE);
    public static final BlockItem SNOWY_BEACH_VINE = initBlockItem(ModBlocks.SNOWY_BEACH_VINE);
    public static final BlockItem WATERS_VINE = initBlockItem(ModBlocks.WATERS_VINE);


    // slabs
    public static final BlockItem JUNGLE_GRASS_SLAB = initBlockItem(ModBlocks.JUNGLE_GRASS_SLAB);
    public static final BlockItem JUNGLE_EDGE_GRASS_SLAB = initBlockItem(ModBlocks.JUNGLE_EDGE_GRASS_SLAB);
    public static final BlockItem SAVANNA_GRASS_SLAB = initBlockItem(ModBlocks.SAVANNA_GRASS_SLAB);
    public static final BlockItem BADLANDS_GRASS_SLAB = initBlockItem(ModBlocks.BADLANDS_GRASS_SLAB);
    public static final BlockItem FOREST_GRASS_SLAB = initBlockItem(ModBlocks.FOREST_GRASS_SLAB);
    public static final BlockItem BIRCH_FOREST_GRASS_SLAB = initBlockItem(ModBlocks.BIRCH_FOREST_GRASS_SLAB);
    public static final BlockItem DARK_FOREST_GRASS_SLAB = initBlockItem(ModBlocks.DARK_FOREST_GRASS_SLAB);
    public static final BlockItem PLAINS_GRASS_SLAB = initBlockItem(ModBlocks.PLAINS_GRASS_SLAB);
    public static final BlockItem SWAMP_GRASS_SLAB = initBlockItem(ModBlocks.SWAMP_GRASS_SLAB);
    public static final BlockItem LUSH_SWAMP_GRASS_SLAB = initBlockItem(ModBlocks.LUSH_SWAMP_GRASS_SLAB);
    public static final BlockItem MOUNTAINS_GRASS_SLAB = initBlockItem(ModBlocks.MOUNTAINS_GRASS_SLAB);
    public static final BlockItem MUSHROOM_FIELDS_GRASS_SLAB = initBlockItem(ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB);
    public static final BlockItem TAIGA_GRASS_SLAB = initBlockItem(ModBlocks.TAIGA_GRASS_SLAB);
    public static final BlockItem MEGA_TAIGA_GRASS_SLAB = initBlockItem(ModBlocks.MEGA_TAIGA_GRASS_SLAB);
    public static final BlockItem SNOWY_GRASS_SLAB = initBlockItem(ModBlocks.SNOWY_GRASS_SLAB);
    public static final BlockItem SNOWY_BEACH_GRASS_SLAB = initBlockItem(ModBlocks.SNOWY_BEACH_GRASS_SLAB);
    public static final BlockItem WATERS_GRASS_SLAB = initBlockItem(ModBlocks.WATERS_GRASS_SLAB);

    public static final BlockItem GRASS_SLAB = initBlockItem(ModBlocks.GRASS_SLAB);
    public static final BlockItem DIRT_SLAB = initBlockItem(ModBlocks.DIRT_SLAB);
    public static final BlockItem COARSE_DIRT_SLAB = initBlockItem(ModBlocks.COARSE_DIRT_SLAB);
    public static final BlockItem PODZOL_SLAB = initBlockItem(ModBlocks.PODZOL_SLAB);
    public static final BlockItem MYCELIUM_SLAB = initBlockItem(ModBlocks.MYCELIUM_SLAB);
    public static final BlockItem ARTIFICIAL_SOIL_SLAB = initBlockItem(ModBlocks.ARTIFICIAL_SOIL_SLAB);
    public static final BlockItem GRASS_PATH_SLAB = initBlockItem(ModBlocks.GRASS_PATH_SLAB);
    public static final BlockItem NETHERRACK_SLAB = initBlockItem(ModBlocks.NETHERRACK_SLAB);
    public static final BlockItem CRIMSON_NYLIUM_SLAB = initBlockItem(ModBlocks.CRIMSON_NYLIUM_SLAB);
    public static final BlockItem WARPED_NYLIUM_SLAB = initBlockItem(ModBlocks.WARPED_NYLIUM_SLAB);

    public static final BlockItem BLENDER_GRASS_BLOCK = initBlockItem(ModBlocks.BLENDER_GRASS_BLOCK);
    public static final BlockItem BLENDER_OAK_LEAVES_BLOCK = initBlockItem(ModBlocks.BLENDER_OAK_LEAVES_BLOCK);
    public static final BlockItem BLENDER_DARK_OAK_LEAVES_BLOCK = initBlockItem(ModBlocks.BLENDER_DARK_OAK_LEAVES_BLOCK);
    public static final BlockItem BLENDER_JUNGLE_LEAVES_BLOCK = initBlockItem(ModBlocks.BLENDER_JUNGLE_LEAVES_BLOCK);
    public static final BlockItem BLENDER_ACACIA_LEAVES_BLOCK = initBlockItem(ModBlocks.BLENDER_ACACIA_LEAVES_BLOCK);

    public static final Item WAND_OF_NATURE_COLORS = new WandOfNatureColors(new Item.Settings());
    public static final Item WAND_OF_WATER_COLORS = new WandOfWaterColors(new Item.Settings());
    public static final Item WAND_OF_NETHER_COLORS = new WandOfNetherColors(new Item.Settings());
    public static final Item WAND_OF_SNOW = new WandOfSnow(new Item.Settings());
    public static final Item WAND_OF_CHAOS_COLORS = new WandOfChaosColors(new Item.Settings());
    public static final Item WAND_OF_IMITATION = new WandOfImitation(new Item.Settings());

    public static final Item JUNGLE_DYE = new ARFODyeItem();
    public static final Item JUNGLE_EDGE_DYE = new ARFODyeItem();
    public static final Item BADLANDS_DYE = new ARFODyeItem();
    public static final Item SAVANNA_DYE = new ARFODyeItem();
    public static final Item FOREST_DYE = new ARFODyeItem();
    public static final Item BIRCH_FOREST_DYE = new ARFODyeItem();
    public static final Item DARK_FOREST_DYE = new ARFODyeItem();
    public static final Item PLAINS_DYE = new ARFODyeItem();
    public static final Item SWAMP_DYE = new ARFODyeItem();
    public static final Item LUSH_SWAMP_DYE = new ARFODyeItem();
    public static final Item MOUNTAINS_DYE = new ARFODyeItem();
    public static final Item MUSHROOM_FIELDS_DYE = new ARFODyeItem();
    public static final Item TAIGA_DYE = new ARFODyeItem();
    public static final Item MEGA_TAIGA_DYE = new ARFODyeItem();
    public static final Item SNOWY_DYE = new ARFODyeItem();
    public static final Item SNOWY_BEACH_DYE = new ARFODyeItem();
    public static final Item WATERS_DYE = new ARFODyeItem();


    public static final BlockItem GLOWING_JUNGLE_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK);
    public static final BlockItem GLOWING_JUNGLE_EDGE_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK);
    public static final BlockItem GLOWING_BADLANDS_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK);
    public static final BlockItem GLOWING_SAVANNA_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK);
    public static final BlockItem GLOWING_FOREST_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_FOREST_GRASS_BLOCK);
    public static final BlockItem GLOWING_BIRCH_FOREST_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK);
    public static final BlockItem GLOWING_DARK_FOREST_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK);
    public static final BlockItem GLOWING_PLAINS_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_PLAINS_GRASS_BLOCK);
    public static final BlockItem GLOWING_SWAMP_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_SWAMP_GRASS_BLOCK);
    public static final BlockItem GLOWING_LUSH_SWAMP_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK);
    public static final BlockItem GLOWING_MOUNTAINS_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK);
    public static final BlockItem GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK);
    public static final BlockItem GLOWING_TAIGA_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_TAIGA_GRASS_BLOCK);
    public static final BlockItem GLOWING_MEGA_TAIGA_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK);
    public static final BlockItem GLOWING_SNOWY_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_SNOWY_GRASS_BLOCK);
    public static final BlockItem GLOWING_SNOWY_BEACH_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK);
    public static final BlockItem GLOWING_WATERS_GRASS_BLOCK = initBlockItem(ModBlocks.GLOWING_WATERS_GRASS_BLOCK);


    public static final BucketItem COLD_OCEAN_WATER_BUCKET = new BucketItem(ModFluids.STILL_COLD_OCEAN_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    public static final BucketItem FROZEN_OCEAN_WATER_BUCKET = new BucketItem(ModFluids.STILL_FROZEN_OCEAN_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    public static final BucketItem LUKEWARM_OCEAN_WATER_BUCKET = new BucketItem(ModFluids.STILL_LUKEWARM_OCEAN_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    public static final BucketItem WARM_OCEAN_WATER_BUCKET = new BucketItem(ModFluids.STILL_WARM_OCEAN_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    public static final BucketItem SWAMP_WATER_BUCKET = new BucketItem(ModFluids.STILL_SWAMP_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    public static final BucketItem OCEAN_WATER_BUCKET = new BucketItem(ModFluids.STILL_OCEAN_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));


    public static final Item GRASS_SEED = new ARFOGrassSeedItem(new Item.Settings());

    private static BlockItem initBlockItem(Block block) {
        return new BlockItem(block, new Item.Settings());
    }


    public static void registerItems() {



        init("artificial_soil", ARTIFICIAL_SOIL);
        init("jungle_grass_block", JUNGLE_GRASS_BLOCK);
        init("badlands_grass_block", BADLANDS_GRASS_BLOCK);
        init("savanna_grass_block", SAVANNA_GRASS_BLOCK);
        init("jungle_edge_grass_block", JUNGLE_EDGE_GRASS_BLOCK);
        init("forest_grass_block", FOREST_GRASS_BLOCK);
        init("birch_forest_grass_block", BIRCH_FOREST_GRASS_BLOCK);
        init("dark_forest_grass_block", DARK_FOREST_GRASS_BLOCK);
        init("lush_swamp_grass_block", LUSH_SWAMP_GRASS_BLOCK);
        init("swamp_grass_block", SWAMP_GRASS_BLOCK);
        init("plains_grass_block", PLAINS_GRASS_BLOCK);
        init("waters_grass_block", WATERS_GRASS_BLOCK);
        init("mushroom_fields_grass_block", MUSHROOM_FIELDS_GRASS_BLOCK);
        init("mountains_grass_block", MOUNTAINS_GRASS_BLOCK);
        init("snowy_beach_grass_block", SNOWY_BEACH_GRASS_BLOCK);
        init("mega_taiga_grass_block", MEGA_TAIGA_GRASS_BLOCK);
        init("taiga_grass_block", TAIGA_GRASS_BLOCK);
        init("snowy_grass_block", SNOWY_GRASS_BLOCK);

        init("tropical_jungle_leaves", TROPICAL_JUNGLE_LEAVES);
        init("badlands_jungle_leaves", BADLANDS_JUNGLE_LEAVES);
        init("savanna_jungle_leaves", SAVANNA_JUNGLE_LEAVES);
        init("tropical_edge_jungle_leaves", TROPICAL_EDGE_JUNGLE_LEAVES);
        init("forest_jungle_leaves", FOREST_JUNGLE_LEAVES);
        init("birch_forest_jungle_leaves", BIRCH_FOREST_JUNGLE_LEAVES);
        init("swamp_jungle_leaves", SWAMP_JUNGLE_LEAVES);
        init("plains_jungle_leaves", PLAINS_JUNGLE_LEAVES);
        init("waters_jungle_leaves", WATERS_JUNGLE_LEAVES);
        init("mountains_jungle_leaves", MOUNTAINS_JUNGLE_LEAVES);
        init("mushroom_fields_jungle_leaves", MUSHROOM_FIELDS_JUNGLE_LEAVES);
        init("taiga_jungle_leaves", TAIGA_JUNGLE_LEAVES);
        init("mega_taiga_jungle_leaves", MEGA_TAIGA_JUNGLE_LEAVES);
        init("snowy_jungle_leaves", SNOWY_JUNGLE_LEAVES);
        init("snowy_beach_jungle_leaves", SNOWY_BEACH_JUNGLE_LEAVES);

        init("tropical_oak_leaves", TROPICAL_OAK_LEAVES);
        init("badlands_oak_leaves", BADLANDS_OAK_LEAVES);
        init("savanna_oak_leaves", SAVANNA_OAK_LEAVES);
        init("tropical_edge_oak_leaves", TROPICAL_EDGE_OAK_LEAVES);
        init("forest_oak_leaves", FOREST_OAK_LEAVES);
        init("birch_forest_oak_leaves", BIRCH_FOREST_OAK_LEAVES);
        init("swamp_oak_leaves", SWAMP_OAK_LEAVES);
        init("plains_oak_leaves", PLAINS_OAK_LEAVES);
        init("waters_oak_leaves", WATERS_OAK_LEAVES);
        init("mountains_oak_leaves", MOUNTAINS_OAK_LEAVES);
        init("mushroom_fields_oak_leaves", MUSHROOM_FIELDS_OAK_LEAVES);
        init("taiga_oak_leaves", TAIGA_OAK_LEAVES);
        init("mega_taiga_oak_leaves", MEGA_TAIGA_OAK_LEAVES);
        init("snowy_oak_leaves", SNOWY_OAK_LEAVES);
        init("snowy_beach_oak_leaves", SNOWY_BEACH_OAK_LEAVES);

        init("tropical_dark_oak_leaves", TROPICAL_DARK_OAK_LEAVES);
        init("badlands_dark_oak_leaves", BADLANDS_DARK_OAK_LEAVES);
        init("savanna_dark_oak_leaves", SAVANNA_DARK_OAK_LEAVES);
        init("tropical_edge_dark_oak_leaves", TROPICAL_EDGE_DARK_OAK_LEAVES);
        init("forest_dark_oak_leaves", FOREST_DARK_OAK_LEAVES);
        init("birch_forest_dark_oak_leaves", BIRCH_FOREST_DARK_OAK_LEAVES);
        init("swamp_dark_oak_leaves", SWAMP_DARK_OAK_LEAVES);
        init("plains_dark_oak_leaves", PLAINS_DARK_OAK_LEAVES);
        init("waters_dark_oak_leaves", WATERS_DARK_OAK_LEAVES);
        init("mountains_dark_oak_leaves", MOUNTAINS_DARK_OAK_LEAVES);
        init("mushroom_fields_dark_oak_leaves", MUSHROOM_FIELDS_DARK_OAK_LEAVES);
        init("taiga_dark_oak_leaves", TAIGA_DARK_OAK_LEAVES);
        init("mega_taiga_dark_oak_leaves", MEGA_TAIGA_DARK_OAK_LEAVES);
        init("snowy_dark_oak_leaves", SNOWY_DARK_OAK_LEAVES);
        init("snowy_beach_dark_oak_leaves", SNOWY_BEACH_DARK_OAK_LEAVES);

        init("tropical_acacia_leaves", TROPICAL_ACACIA_LEAVES);
        init("badlands_acacia_leaves", BADLANDS_ACACIA_LEAVES);
        init("savanna_acacia_leaves", SAVANNA_ACACIA_LEAVES);
        init("tropical_edge_acacia_leaves", TROPICAL_EDGE_ACACIA_LEAVES);
        init("forest_acacia_leaves", FOREST_ACACIA_LEAVES);
        init("birch_forest_acacia_leaves", BIRCH_FOREST_ACACIA_LEAVES);
        init("swamp_acacia_leaves", SWAMP_ACACIA_LEAVES);
        init("waters_acacia_leaves", WATERS_ACACIA_LEAVES);
        init("mountains_acacia_leaves", MOUNTAINS_ACACIA_LEAVES);
        init("mushroom_fields_acacia_leaves", MUSHROOM_FIELDS_ACACIA_LEAVES);
        init("plains_acacia_leaves", PLAINS_ACACIA_LEAVES);
        init("taiga_acacia_leaves", TAIGA_ACACIA_LEAVES);
        init("mega_taiga_acacia_leaves", MEGA_TAIGA_ACACIA_LEAVES);
        init("snowy_acacia_leaves", SNOWY_ACACIA_LEAVES);
        init("snowy_beach_acacia_leaves", SNOWY_BEACH_ACACIA_LEAVES);

        init("alpha_grass_block", ALPHA_GRASS_BLOCK);
        init("alpha_leaves", ALPHA_LEAVES);

        init("tropical_oak_leaves_carpet", TROPICAL_OAK_LEAVES_CARPET);
        init("tropical_dark_oak_leaves_carpet", TROPICAL_DARK_OAK_LEAVES_CARPET);
        init("tropical_jungle_leaves_carpet", TROPICAL_JUNGLE_LEAVES_CARPET);
        init("tropical_acacia_leaves_carpet", TROPICAL_ACACIA_LEAVES_CARPET);
        init("tropical_edge_oak_leaves_carpet", TROPICAL_EDGE_OAK_LEAVES_CARPET);
        init("tropical_edge_dark_oak_leaves_carpet", TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET);
        init("tropical_edge_jungle_leaves_carpet", TROPICAL_EDGE_JUNGLE_LEAVES_CARPET);
        init("tropical_edge_acacia_leaves_carpet", TROPICAL_EDGE_ACACIA_LEAVES_CARPET);
        init("badlands_oak_leaves_carpet", BADLANDS_OAK_LEAVES_CARPET);
        init("badlands_dark_oak_leaves_carpet", BADLANDS_DARK_OAK_LEAVES_CARPET);
        init("badlands_jungle_leaves_carpet", BADLANDS_JUNGLE_LEAVES_CARPET);
        init("badlands_acacia_leaves_carpet", BADLANDS_ACACIA_LEAVES_CARPET);
        init("savanna_oak_leaves_carpet", SAVANNA_OAK_LEAVES_CARPET);
        init("savanna_dark_oak_leaves_carpet", SAVANNA_DARK_OAK_LEAVES_CARPET);
        init("savanna_jungle_leaves_carpet", SAVANNA_JUNGLE_LEAVES_CARPET);
        init("savanna_acacia_leaves_carpet", SAVANNA_ACACIA_LEAVES_CARPET);
        init("forest_oak_leaves_carpet", FOREST_OAK_LEAVES_CARPET);
        init("forest_dark_oak_leaves_carpet", FOREST_DARK_OAK_LEAVES_CARPET);
        init("forest_jungle_leaves_carpet", FOREST_JUNGLE_LEAVES_CARPET);
        init("forest_acacia_leaves_carpet", FOREST_ACACIA_LEAVES_CARPET);
        init("birch_forest_oak_leaves_carpet", BIRCH_FOREST_OAK_LEAVES_CARPET);
        init("birch_forest_dark_oak_leaves_carpet", BIRCH_FOREST_DARK_OAK_LEAVES_CARPET);
        init("birch_forest_jungle_leaves_carpet", BIRCH_FOREST_JUNGLE_LEAVES_CARPET);
        init("birch_forest_acacia_leaves_carpet", BIRCH_FOREST_ACACIA_LEAVES_CARPET);
        init("swamp_oak_leaves_carpet", SWAMP_OAK_LEAVES_CARPET);
        init("swamp_dark_oak_leaves_carpet", SWAMP_DARK_OAK_LEAVES_CARPET);
        init("swamp_jungle_leaves_carpet", SWAMP_JUNGLE_LEAVES_CARPET);
        init("swamp_acacia_leaves_carpet", SWAMP_ACACIA_LEAVES_CARPET);
        init("waters_oak_leaves_carpet", WATERS_OAK_LEAVES_CARPET);
        init("waters_dark_oak_leaves_carpet", WATERS_DARK_OAK_LEAVES_CARPET);
        init("waters_jungle_leaves_carpet", WATERS_JUNGLE_LEAVES_CARPET);
        init("waters_acacia_leaves_carpet", WATERS_ACACIA_LEAVES_CARPET);
        init("mountains_oak_leaves_carpet", MOUNTAINS_OAK_LEAVES_CARPET);
        init("mountains_dark_oak_leaves_carpet", MOUNTAINS_DARK_OAK_LEAVES_CARPET);
        init("mountains_jungle_leaves_carpet", MOUNTAINS_JUNGLE_LEAVES_CARPET);
        init("mountains_acacia_leaves_carpet", MOUNTAINS_ACACIA_LEAVES_CARPET);
        init("mushroom_fields_oak_leaves_carpet", MUSHROOM_FIELDS_OAK_LEAVES_CARPET);
        init("mushroom_fields_dark_oak_leaves_carpet", MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET);
        init("mushroom_fields_jungle_leaves_carpet", MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET);
        init("mushroom_fields_acacia_leaves_carpet", MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET);
        init("taiga_oak_leaves_carpet", TAIGA_OAK_LEAVES_CARPET);
        init("taiga_dark_oak_leaves_carpet", TAIGA_DARK_OAK_LEAVES_CARPET);
        init("taiga_jungle_leaves_carpet", TAIGA_JUNGLE_LEAVES_CARPET);
        init("taiga_acacia_leaves_carpet", TAIGA_ACACIA_LEAVES_CARPET);
        init("plains_oak_leaves_carpet", PLAINS_OAK_LEAVES_CARPET);
        init("plains_dark_oak_leaves_carpet", PLAINS_DARK_OAK_LEAVES_CARPET);
        init("plains_jungle_leaves_carpet", PLAINS_JUNGLE_LEAVES_CARPET);
        init("plains_acacia_leaves_carpet", PLAINS_ACACIA_LEAVES_CARPET);
        init("mega_taiga_oak_leaves_carpet", MEGA_TAIGA_OAK_LEAVES_CARPET);
        init("mega_taiga_dark_oak_leaves_carpet", MEGA_TAIGA_DARK_OAK_LEAVES_CARPET);
        init("mega_taiga_jungle_leaves_carpet", MEGA_TAIGA_JUNGLE_LEAVES_CARPET);
        init("mega_taiga_acacia_leaves_carpet", MEGA_TAIGA_ACACIA_LEAVES_CARPET);
        init("snowy_oak_leaves_carpet", SNOWY_OAK_LEAVES_CARPET);
        init("snowy_dark_oak_leaves_carpet", SNOWY_DARK_OAK_LEAVES_CARPET);
        init("snowy_jungle_leaves_carpet", SNOWY_JUNGLE_LEAVES_CARPET);
        init("snowy_acacia_leaves_carpet", SNOWY_ACACIA_LEAVES_CARPET);
        init("snowy_beach_oak_leaves_carpet", SNOWY_BEACH_OAK_LEAVES_CARPET);
        init("snowy_beach_dark_oak_leaves_carpet", SNOWY_BEACH_DARK_OAK_LEAVES_CARPET);
        init("snowy_beach_jungle_leaves_carpet", SNOWY_BEACH_JUNGLE_LEAVES_CARPET);
        init("snowy_beach_acacia_leaves_carpet", SNOWY_BEACH_ACACIA_LEAVES_CARPET);

        init("lush_swamp_oak_leaves", LUSH_SWAMP_OAK_LEAVES);
        init("lush_swamp_oak_leaves_carpet", LUSH_SWAMP_OAK_LEAVES_CARPET);
        init("lush_swamp_dark_oak_leaves", LUSH_SWAMP_DARK_OAK_LEAVES);
        init("lush_swamp_dark_oak_leaves_carpet", LUSH_SWAMP_DARK_OAK_LEAVES_CARPET);
        init("lush_swamp_jungle_leaves", LUSH_SWAMP_JUNGLE_LEAVES);
        init("lush_swamp_jungle_leaves_carpet", LUSH_SWAMP_JUNGLE_LEAVES_CARPET);
        init("lush_swamp_acacia_leaves", LUSH_SWAMP_ACACIA_LEAVES);
        init("lush_swamp_acacia_leaves_carpet", LUSH_SWAMP_ACACIA_LEAVES_CARPET);
        init("dark_forest_oak_leaves", DARK_FOREST_OAK_LEAVES);
        init("dark_forest_oak_leaves_carpet", DARK_FOREST_OAK_LEAVES_CARPET);
        init("dark_forest_dark_oak_leaves", DARK_FOREST_DARK_OAK_LEAVES);
        init("dark_forest_dark_oak_leaves_carpet", DARK_FOREST_DARK_OAK_LEAVES_CARPET);
        init("dark_forest_jungle_leaves", DARK_FOREST_JUNGLE_LEAVES);
        init("dark_forest_jungle_leaves_carpet", DARK_FOREST_JUNGLE_LEAVES_CARPET);
        init("dark_forest_acacia_leaves", DARK_FOREST_ACACIA_LEAVES);
        init("dark_forest_acacia_leaves_carpet", DARK_FOREST_ACACIA_LEAVES_CARPET);

        init("spruce_leaves_carpet", SPRUCE_LEAVES_CARPET);
        init("birch_leaves_carpet", BIRCH_LEAVES_CARPET);

        // ferns and large ferns
        init("jungle_fern", JUNGLE_FERN);
        init("large_jungle_fern", LARGE_JUNGLE_FERN);
        init("jungle_edge_fern", JUNGLE_EDGE_FERN);
        init("large_jungle_edge_fern", LARGE_JUNGLE_EDGE_FERN);
        init("badlands_fern", BADLANDS_FERN);
        init("large_badlands_fern", LARGE_BADLANDS_FERN);
        init("savanna_fern", SAVANNA_FERN);
        init("large_savanna_fern", LARGE_SAVANNA_FERN);
        init("forest_fern", FOREST_FERN);
        init("large_forest_fern", LARGE_FOREST_FERN);
        init("birch_forest_fern", BIRCH_FOREST_FERN);
        init("large_birch_forest_fern", LARGE_BIRCH_FOREST_FERN);
        init("dark_forest_fern", DARK_FOREST_FERN);
        init("large_dark_forest_fern", LARGE_DARK_FOREST_FERN);
        init("plains_fern", PLAINS_FERN);
        init("large_plains_fern", LARGE_PLAINS_FERN);
        init("swamp_fern", SWAMP_FERN);
        init("large_swamp_fern", LARGE_SWAMP_FERN);
        init("lush_swamp_fern", LUSH_SWAMP_FERN);
        init("large_lush_swamp_fern", LARGE_LUSH_SWAMP_FERN);
        init("mountains_fern", MOUNTAINS_FERN);
        init("large_mountains_fern", LARGE_MOUNTAINS_FERN);
        init("mushroom_fields_fern", MUSHROOM_FIELDS_FERN);
        init("large_mushroom_fields_fern", LARGE_MUSHROOM_FIELDS_FERN);
        init("taiga_fern", TAIGA_FERN);
        init("large_taiga_fern", LARGE_TAIGA_FERN);
        init("mega_taiga_fern", MEGA_TAIGA_FERN);
        init("large_mega_taiga_fern", LARGE_MEGA_TAIGA_FERN);
        init("snowy_fern", SNOWY_FERN);
        init("large_snowy_fern", LARGE_SNOWY_FERN);
        init("snowy_beach_fern", SNOWY_BEACH_FERN);
        init("large_snowy_beach_fern", LARGE_SNOWY_BEACH_FERN);
        init("waters_fern", WATERS_FERN);
        init("large_waters_fern", LARGE_WATERS_FERN);


        // grass and tall grass
        init("jungle_grass", JUNGLE_GRASS);
        init("tall_jungle_grass", TALL_JUNGLE_GRASS);
        init("jungle_edge_grass", JUNGLE_EDGE_GRASS);
        init("tall_jungle_edge_grass", TALL_JUNGLE_EDGE_GRASS);
        init("badlands_grass", BADLANDS_GRASS);
        init("tall_badlands_grass", TALL_BADLANDS_GRASS);
        init("savanna_grass", SAVANNA_GRASS);
        init("tall_savanna_grass", TALL_SAVANNA_GRASS);
        init("forest_grass", FOREST_GRASS);
        init("tall_forest_grass", TALL_FOREST_GRASS);
        init("birch_forest_grass", BIRCH_FOREST_GRASS);
        init("tall_birch_forest_grass", TALL_BIRCH_FOREST_GRASS);
        init("dark_forest_grass", DARK_FOREST_GRASS);
        init("tall_dark_forest_grass", TALL_DARK_FOREST_GRASS);
        init("plains_grass", PLAINS_GRASS);
        init("tall_plains_grass", TALL_PLAINS_GRASS);
        init("swamp_grass", SWAMP_GRASS);
        init("tall_swamp_grass", TALL_SWAMP_GRASS);
        init("lush_swamp_grass", LUSH_SWAMP_GRASS);
        init("tall_lush_swamp_grass", TALL_LUSH_SWAMP_GRASS);
        init("mountains_grass", MOUNTAINS_GRASS);
        init("tall_mountains_grass", TALL_MOUNTAINS_GRASS);
        init("mushroom_fields_grass", MUSHROOM_FIELDS_GRASS);
        init("tall_mushroom_fields_grass", TALL_MUSHROOM_FIELDS_GRASS);
        init("taiga_grass", TAIGA_GRASS);
        init("tall_taiga_grass", TALL_TAIGA_GRASS);
        init("mega_taiga_grass", MEGA_TAIGA_GRASS);
        init("tall_mega_taiga_grass", TALL_MEGA_TAIGA_GRASS);
        init("snowy_grass", SNOWY_GRASS);
        init("tall_snowy_grass", TALL_SNOWY_GRASS);
        init("snowy_beach_grass", SNOWY_BEACH_GRASS);
        init("tall_snowy_beach_grass", TALL_SNOWY_BEACH_GRASS);
        init("waters_grass", WATERS_GRASS);
        init("tall_waters_grass", TALL_WATERS_GRASS);

        // sugar cane
        init("jungle_sugar_cane", JUNGLE_SUGAR_CANE);
        init("jungle_edge_sugar_cane", JUNGLE_EDGE_SUGAR_CANE);
        init("badlands_sugar_cane", BADLANDS_SUGAR_CANE);
        init("savanna_sugar_cane", SAVANNA_SUGAR_CANE);
        init("forest_sugar_cane", FOREST_SUGAR_CANE);
        init("birch_forest_sugar_cane", BIRCH_FOREST_SUGAR_CANE);
        init("dark_forest_sugar_cane", DARK_FOREST_SUGAR_CANE);
        init("plains_sugar_cane", PLAINS_SUGAR_CANE);
        init("swamp_sugar_cane", SWAMP_SUGAR_CANE);
        init("lush_swamp_sugar_cane", LUSH_SWAMP_SUGAR_CANE);
        init("mountains_sugar_cane", MOUNTAINS_SUGAR_CANE);
        init("mushroom_fields_sugar_cane", MUSHROOM_FIELDS_SUGAR_CANE);
        init("taiga_sugar_cane", TAIGA_SUGAR_CANE);
        init("mega_taiga_sugar_cane", MEGA_TAIGA_SUGAR_CANE);
        init("snowy_sugar_cane", SNOWY_SUGAR_CANE);
        init("snowy_beach_sugar_cane", SNOWY_BEACH_SUGAR_CANE);
        init("waters_sugar_cane", WATERS_SUGAR_CANE);

        // vine
        init("jungle_vine", JUNGLE_VINE);
        init("jungle_edge_vine", JUNGLE_EDGE_VINE);
        init("badlands_vine", BADLANDS_VINE);
        init("savanna_vine", SAVANNA_VINE);
        init("forest_vine", FOREST_VINE);
        init("birch_forest_vine", BIRCH_FOREST_VINE);
        init("dark_forest_vine", DARK_FOREST_VINE);
        init("plains_vine", PLAINS_VINE);
        init("swamp_vine", SWAMP_VINE);
        init("lush_swamp_vine", LUSH_SWAMP_VINE);
        init("mountains_vine", MOUNTAINS_VINE);
        init("mushroom_fields_vine", MUSHROOM_FIELDS_VINE);
        init("taiga_vine", TAIGA_VINE);
        init("mega_taiga_vine", MEGA_TAIGA_VINE);
        init("snowy_vine", SNOWY_VINE);
        init("snowy_beach_vine", SNOWY_BEACH_VINE);
        init("waters_vine", WATERS_VINE);

        // slabs
        init("jungle_grass_slab", JUNGLE_GRASS_SLAB);
        init("jungle_edge_grass_slab", JUNGLE_EDGE_GRASS_SLAB);
        init("badlands_grass_slab", BADLANDS_GRASS_SLAB);
        init("savanna_grass_slab", SAVANNA_GRASS_SLAB);
        init("forest_grass_slab", FOREST_GRASS_SLAB);
        init("birch_forest_grass_slab", BIRCH_FOREST_GRASS_SLAB);
        init("dark_forest_grass_slab", DARK_FOREST_GRASS_SLAB);
        init("plains_grass_slab", PLAINS_GRASS_SLAB);
        init("swamp_grass_slab", SWAMP_GRASS_SLAB);
        init("lush_swamp_grass_slab", LUSH_SWAMP_GRASS_SLAB);
        init("mountains_grass_slab", MOUNTAINS_GRASS_SLAB);
        init("mushroom_fields_grass_slab", MUSHROOM_FIELDS_GRASS_SLAB);
        init("taiga_grass_slab", TAIGA_GRASS_SLAB);
        init("mega_taiga_grass_slab", MEGA_TAIGA_GRASS_SLAB);
        init("snowy_grass_slab", SNOWY_GRASS_SLAB);
        init("snowy_beach_grass_slab", SNOWY_BEACH_GRASS_SLAB);
        init("waters_grass_slab", WATERS_GRASS_SLAB);

        init("grass_slab", GRASS_SLAB);
        init("dirt_slab", DIRT_SLAB);
        init("coarse_dirt_slab", COARSE_DIRT_SLAB);
        init("podzol_slab", PODZOL_SLAB);
        init("mycelium_slab", MYCELIUM_SLAB);
        init("artificial_soil_slab", ARTIFICIAL_SOIL_SLAB);
        init("grass_path_slab", GRASS_PATH_SLAB);
        init("netherrack_slab", NETHERRACK_SLAB);
        init("crimson_nylium_slab", CRIMSON_NYLIUM_SLAB);
        init("warped_nylium_slab", WARPED_NYLIUM_SLAB);

        init("blender_grass_block", BLENDER_GRASS_BLOCK);
        init("blender_oak_leaves_block", BLENDER_OAK_LEAVES_BLOCK);
        init("blender_dark_oak_leaves_block", BLENDER_DARK_OAK_LEAVES_BLOCK);
        init("blender_jungle_leaves_block", BLENDER_JUNGLE_LEAVES_BLOCK);
        init("blender_acacia_leaves_block", BLENDER_ACACIA_LEAVES_BLOCK);

        init("glowing_jungle_grass_block", GLOWING_JUNGLE_GRASS_BLOCK);
        init("glowing_jungle_edge_grass_block", GLOWING_JUNGLE_EDGE_GRASS_BLOCK);
        init("glowing_badlands_grass_block", GLOWING_BADLANDS_GRASS_BLOCK);
        init("glowing_savanna_grass_block", GLOWING_SAVANNA_GRASS_BLOCK);
        init("glowing_forest_grass_block", GLOWING_FOREST_GRASS_BLOCK);
        init("glowing_birch_forest_grass_block", GLOWING_BIRCH_FOREST_GRASS_BLOCK);
        init("glowing_dark_forest_grass_block", GLOWING_DARK_FOREST_GRASS_BLOCK);
        init("glowing_plains_grass_block", GLOWING_PLAINS_GRASS_BLOCK);
        init("glowing_swamp_grass_block", GLOWING_SWAMP_GRASS_BLOCK);
        init("glowing_lush_swamp_grass_block", GLOWING_LUSH_SWAMP_GRASS_BLOCK);
        init("glowing_mountains_grass_block", GLOWING_MOUNTAINS_GRASS_BLOCK);
        init("glowing_mushroom_fields_grass_block", GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK);
        init("glowing_taiga_grass_block", GLOWING_TAIGA_GRASS_BLOCK);
        init("glowing_mega_taiga_grass_block", GLOWING_MEGA_TAIGA_GRASS_BLOCK);
        init("glowing_snowy_grass_block", GLOWING_SNOWY_GRASS_BLOCK);
        init("glowing_snowy_beach_grass_block", GLOWING_SNOWY_BEACH_GRASS_BLOCK);
        init("glowing_waters_grass_block", GLOWING_WATERS_GRASS_BLOCK);


        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "jungle_dye"), JUNGLE_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "jungle_edge_dye"), JUNGLE_EDGE_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "badlands_dye"), BADLANDS_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "savanna_dye"), SAVANNA_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "forest_dye"), FOREST_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "birch_forest_dye"), BIRCH_FOREST_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "dark_forest_dye"), DARK_FOREST_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "plains_dye"), PLAINS_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "swamp_dye"), SWAMP_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "lush_swamp_dye"), LUSH_SWAMP_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "mountains_dye"), MOUNTAINS_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "mushroom_fields_dye"), MUSHROOM_FIELDS_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "taiga_dye"), TAIGA_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "mega_taiga_dye"), MEGA_TAIGA_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "snowy_dye"), SNOWY_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "snowy_beach_dye"), SNOWY_BEACH_DYE);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "waters_dye"), WATERS_DYE);

        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "grass_seed"), GRASS_SEED);

        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "wand_of_nature_colors"), WAND_OF_NATURE_COLORS);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "wand_of_water_colors"), WAND_OF_WATER_COLORS);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "wand_of_nether_colors"), WAND_OF_NETHER_COLORS);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "wand_of_snow"), WAND_OF_SNOW);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "wand_of_chaos_colors"), WAND_OF_CHAOS_COLORS);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "wand_of_imitation"), WAND_OF_IMITATION);

        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "cold_ocean_water_bucket"), COLD_OCEAN_WATER_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "frozen_ocean_water_bucket"), FROZEN_OCEAN_WATER_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "lukewarm_ocean_water_bucket"), LUKEWARM_OCEAN_WATER_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "warm_ocean_water_bucket"), WARM_OCEAN_WATER_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "swamp_water_bucket"), SWAMP_WATER_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, "ocean_water_bucket"), OCEAN_WATER_BUCKET);
    }

    private static void init(String path, BlockItem blockItem) {
        Registry.register(Registry.ITEM, new Identifier(ArtificialFoliage.MOD_ID, path), blockItem);
    }






}
