package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.block.*;
import com.finallion.artificialfoliage.block.blenderBlocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {


    private static void init(String path, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(ArtificialFoliage.MOD_ID, path), block);
    }

    public static final Block ARTIFICIAL_SOIL = new ARFOSoilBlock();

    public static final Block JUNGLE_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block BADLANDS_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block SAVANNA_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block JUNGLE_EDGE_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block FOREST_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block BIRCH_FOREST_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block DARK_FOREST_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block LUSH_SWAMP_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block SWAMP_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block PLAINS_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block WATERS_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block MUSHROOM_FIELDS_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block MOUNTAINS_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block SNOWY_BEACH_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block MEGA_TAIGA_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block TAIGA_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block SNOWY_GRASS_BLOCK = new ARFOGrassBlock();

    public static final Block ALPHA_GRASS_BLOCK = new ARFOGrassBlock();
    public static final Block ALPHA_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).breakByTool(FabricToolTags.HOES).breakByTool(FabricToolTags.SHEARS).nonOpaque().sounds(BlockSoundGroup.GRASS));

    public static final Block TROPICAL_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block BADLANDS_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block SAVANNA_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block TROPICAL_EDGE_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block FOREST_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block BIRCH_FOREST_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block SWAMP_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block PLAINS_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block WATERS_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block MOUNTAINS_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block MUSHROOM_FIELDS_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block TAIGA_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block SNOWY_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block MEGA_TAIGA_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block SNOWY_BEACH_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block LUSH_SWAMP_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();
    public static final Block DARK_FOREST_JUNGLE_LEAVES = new ARFOJungleLeavesBlock();

    public static final Block TROPICAL_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block BADLANDS_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block SAVANNA_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block TROPICAL_EDGE_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block FOREST_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block BIRCH_FOREST_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block SWAMP_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block PLAINS_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block WATERS_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block MOUNTAINS_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block MUSHROOM_FIELDS_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block TAIGA_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block MEGA_TAIGA_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block SNOWY_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block SNOWY_BEACH_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block LUSH_SWAMP_OAK_LEAVES = new ARFOOakLeavesBlock();
    public static final Block DARK_FOREST_OAK_LEAVES = new ARFOOakLeavesBlock();

    public static final Block TROPICAL_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block BADLANDS_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block SAVANNA_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block TROPICAL_EDGE_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block FOREST_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block BIRCH_FOREST_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block SWAMP_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block PLAINS_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block WATERS_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block MOUNTAINS_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block MUSHROOM_FIELDS_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block TAIGA_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block MEGA_TAIGA_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block SNOWY_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block SNOWY_BEACH_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block LUSH_SWAMP_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();
    public static final Block DARK_FOREST_DARK_OAK_LEAVES = new ARFODarkOakLeavesBlock();


    public static final Block TROPICAL_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block BADLANDS_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block SAVANNA_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block TROPICAL_EDGE_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block FOREST_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block BIRCH_FOREST_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block SWAMP_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block PLAINS_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block WATERS_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block MOUNTAINS_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block MUSHROOM_FIELDS_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block TAIGA_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block MEGA_TAIGA_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block SNOWY_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block SNOWY_BEACH_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block LUSH_SWAMP_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();
    public static final Block DARK_FOREST_ACACIA_LEAVES = new ARFOAcaciaLeavesBlock();

    public static final Block TROPICAL_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_EDGE_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_EDGE_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TROPICAL_EDGE_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BADLANDS_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BADLANDS_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BADLANDS_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BADLANDS_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SAVANNA_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SAVANNA_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SAVANNA_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SAVANNA_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block FOREST_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block FOREST_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block FOREST_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block FOREST_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BIRCH_FOREST_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BIRCH_FOREST_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BIRCH_FOREST_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BIRCH_FOREST_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SWAMP_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SWAMP_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SWAMP_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SWAMP_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block WATERS_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block WATERS_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block WATERS_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block WATERS_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MOUNTAINS_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MOUNTAINS_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MOUNTAINS_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MOUNTAINS_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MUSHROOM_FIELDS_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TAIGA_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TAIGA_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TAIGA_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block TAIGA_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block PLAINS_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block PLAINS_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block PLAINS_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block PLAINS_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MEGA_TAIGA_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MEGA_TAIGA_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MEGA_TAIGA_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block MEGA_TAIGA_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_BEACH_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_BEACH_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_BEACH_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block SNOWY_BEACH_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block DARK_FOREST_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block DARK_FOREST_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block DARK_FOREST_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block DARK_FOREST_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block LUSH_SWAMP_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block LUSH_SWAMP_DARK_OAK_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block LUSH_SWAMP_JUNGLE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block LUSH_SWAMP_ACACIA_LEAVES_CARPET = new ARFOLeavesCarpetBlock();

    public static final Block SPRUCE_LEAVES_CARPET = new ARFOLeavesCarpetBlock();
    public static final Block BIRCH_LEAVES_CARPET = new ARFOLeavesCarpetBlock();

    // fern and large ferns
    public static final Block JUNGLE_FERN = new ARFOFernBlock();
    public static final Block LARGE_JUNGLE_FERN = new ARFOLargeFernBlock();
    public static final Block JUNGLE_EDGE_FERN = new ARFOFernBlock();
    public static final Block LARGE_JUNGLE_EDGE_FERN = new ARFOLargeFernBlock();
    public static final Block BADLANDS_FERN = new ARFOFernBlock();
    public static final Block LARGE_BADLANDS_FERN = new ARFOLargeFernBlock();
    public static final Block SAVANNA_FERN = new ARFOFernBlock();
    public static final Block LARGE_SAVANNA_FERN = new ARFOLargeFernBlock();
    public static final Block FOREST_FERN = new ARFOFernBlock();
    public static final Block LARGE_FOREST_FERN = new ARFOLargeFernBlock();
    public static final Block BIRCH_FOREST_FERN = new ARFOFernBlock();
    public static final Block LARGE_BIRCH_FOREST_FERN = new ARFOLargeFernBlock();
    public static final Block DARK_FOREST_FERN = new ARFOFernBlock();
    public static final Block LARGE_DARK_FOREST_FERN = new ARFOLargeFernBlock();
    public static final Block PLAINS_FERN = new ARFOFernBlock();
    public static final Block LARGE_PLAINS_FERN = new ARFOLargeFernBlock();
    public static final Block SWAMP_FERN = new ARFOFernBlock();
    public static final Block LARGE_SWAMP_FERN = new ARFOLargeFernBlock();
    public static final Block LUSH_SWAMP_FERN = new ARFOFernBlock();
    public static final Block LARGE_LUSH_SWAMP_FERN = new ARFOLargeFernBlock();
    public static final Block MOUNTAINS_FERN = new ARFOFernBlock();
    public static final Block LARGE_MOUNTAINS_FERN = new ARFOLargeFernBlock();
    public static final Block MUSHROOM_FIELDS_FERN = new ARFOFernBlock();
    public static final Block LARGE_MUSHROOM_FIELDS_FERN = new ARFOLargeFernBlock();
    public static final Block TAIGA_FERN = new ARFOFernBlock();
    public static final Block LARGE_TAIGA_FERN = new ARFOLargeFernBlock();
    public static final Block MEGA_TAIGA_FERN = new ARFOFernBlock();
    public static final Block LARGE_MEGA_TAIGA_FERN = new ARFOLargeFernBlock();
    public static final Block SNOWY_FERN = new ARFOFernBlock();
    public static final Block LARGE_SNOWY_FERN = new ARFOLargeFernBlock();
    public static final Block SNOWY_BEACH_FERN = new ARFOFernBlock();
    public static final Block LARGE_SNOWY_BEACH_FERN = new ARFOLargeFernBlock();
    public static final Block WATERS_FERN = new ARFOFernBlock();
    public static final Block LARGE_WATERS_FERN = new ARFOLargeFernBlock();

    // grass and tall grass
    public static final Block JUNGLE_GRASS = new ARFOGrass();
    public static final Block TALL_JUNGLE_GRASS = new ARFOTallGrass();
    public static final Block JUNGLE_EDGE_GRASS = new ARFOGrass();
    public static final Block TALL_JUNGLE_EDGE_GRASS = new ARFOTallGrass();
    public static final Block BADLANDS_GRASS = new ARFOGrass();
    public static final Block TALL_BADLANDS_GRASS = new ARFOTallGrass();
    public static final Block SAVANNA_GRASS = new ARFOGrass();
    public static final Block TALL_SAVANNA_GRASS = new ARFOTallGrass();
    public static final Block FOREST_GRASS = new ARFOGrass();
    public static final Block TALL_FOREST_GRASS = new ARFOTallGrass();
    public static final Block BIRCH_FOREST_GRASS = new ARFOGrass();
    public static final Block TALL_BIRCH_FOREST_GRASS = new ARFOTallGrass();
    public static final Block DARK_FOREST_GRASS = new ARFOGrass();
    public static final Block TALL_DARK_FOREST_GRASS = new ARFOTallGrass();
    public static final Block PLAINS_GRASS = new ARFOGrass();
    public static final Block TALL_PLAINS_GRASS = new ARFOTallGrass();
    public static final Block SWAMP_GRASS = new ARFOGrass();
    public static final Block TALL_SWAMP_GRASS = new ARFOTallGrass();
    public static final Block LUSH_SWAMP_GRASS = new ARFOGrass();
    public static final Block TALL_LUSH_SWAMP_GRASS = new ARFOTallGrass();
    public static final Block MOUNTAINS_GRASS = new ARFOGrass();
    public static final Block TALL_MOUNTAINS_GRASS = new ARFOTallGrass();
    public static final Block MUSHROOM_FIELDS_GRASS = new ARFOGrass();
    public static final Block TALL_MUSHROOM_FIELDS_GRASS = new ARFOTallGrass();
    public static final Block TAIGA_GRASS = new ARFOGrass();
    public static final Block TALL_TAIGA_GRASS = new ARFOTallGrass();
    public static final Block MEGA_TAIGA_GRASS = new ARFOGrass();
    public static final Block TALL_MEGA_TAIGA_GRASS = new ARFOTallGrass();
    public static final Block SNOWY_GRASS = new ARFOGrass();
    public static final Block TALL_SNOWY_GRASS = new ARFOTallGrass();
    public static final Block SNOWY_BEACH_GRASS = new ARFOGrass();
    public static final Block TALL_SNOWY_BEACH_GRASS = new ARFOTallGrass();
    public static final Block WATERS_GRASS = new ARFOGrass();
    public static final Block TALL_WATERS_GRASS = new ARFOTallGrass();

    // sugar cane blocks
    public static final Block JUNGLE_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block JUNGLE_EDGE_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block BADLANDS_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block SAVANNA_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block FOREST_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block BIRCH_FOREST_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block DARK_FOREST_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block PLAINS_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block SWAMP_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block LUSH_SWAMP_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block MOUNTAINS_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block MUSHROOM_FIELDS_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block TAIGA_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block MEGA_TAIGA_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block SNOWY_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block SNOWY_BEACH_SUGAR_CANE = new ARFOSugarCaneBlock();
    public static final Block WATERS_SUGAR_CANE = new ARFOSugarCaneBlock();

    // vine blocks
    public static final Block JUNGLE_VINE = new ARFOVinesBlock();
    public static final Block JUNGLE_EDGE_VINE = new ARFOVinesBlock();
    public static final Block BADLANDS_VINE= new ARFOVinesBlock();
    public static final Block SAVANNA_VINE = new ARFOVinesBlock();
    public static final Block FOREST_VINE = new ARFOVinesBlock();
    public static final Block BIRCH_FOREST_VINE = new ARFOVinesBlock();
    public static final Block DARK_FOREST_VINE = new ARFOVinesBlock();
    public static final Block PLAINS_VINE = new ARFOVinesBlock();
    public static final Block SWAMP_VINE = new ARFOVinesBlock();
    public static final Block LUSH_SWAMP_VINE = new ARFOVinesBlock();
    public static final Block MOUNTAINS_VINE = new ARFOVinesBlock();
    public static final Block MUSHROOM_FIELDS_VINE = new ARFOVinesBlock();
    public static final Block TAIGA_VINE = new ARFOVinesBlock();
    public static final Block MEGA_TAIGA_VINE = new ARFOVinesBlock();
    public static final Block SNOWY_VINE = new ARFOVinesBlock();
    public static final Block SNOWY_BEACH_VINE = new ARFOVinesBlock();
    public static final Block WATERS_VINE = new ARFOVinesBlock();

    // slabs
    public static final Block JUNGLE_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block JUNGLE_EDGE_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block BADLANDS_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block SAVANNA_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block FOREST_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block BIRCH_FOREST_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block DARK_FOREST_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block PLAINS_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block SWAMP_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block LUSH_SWAMP_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block MOUNTAINS_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block MUSHROOM_FIELDS_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block TAIGA_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block MEGA_TAIGA_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block SNOWY_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block SNOWY_BEACH_GRASS_SLAB = new ARFOGrassBlockSlab();
    public static final Block WATERS_GRASS_SLAB = new ARFOGrassBlockSlab();

    public static final Block GRASS_SLAB = new ARFOSlabBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).breakByTool(FabricToolTags.SHOVELS));
    public static final Block DIRT_SLAB = new ARFOSlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT).breakByTool(FabricToolTags.SHOVELS));
    public static final Block COARSE_DIRT_SLAB = new ARFOSlabBlock(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT).breakByTool(FabricToolTags.SHOVELS));
    public static final Block PODZOL_SLAB = new ARFOSlabBlock(FabricBlockSettings.copyOf(Blocks.PODZOL).breakByTool(FabricToolTags.SHOVELS));
    public static final Block MYCELIUM_SLAB = new ARFOSlabBlock(FabricBlockSettings.copyOf(Blocks.MYCELIUM).breakByTool(FabricToolTags.SHOVELS));
    public static final Block ARTIFICIAL_SOIL_SLAB = new ARFOSlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT).breakByTool(FabricToolTags.SHOVELS));
    public static final Block GRASS_PATH_SLAB = new ARFOSmallerSlabBlock(FabricBlockSettings.copyOf(Blocks.GRASS_PATH).breakByTool(FabricToolTags.SHOVELS));
    public static final Block NETHERRACK_SLAB = new ARFONetherSlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).breakByTool(FabricToolTags.PICKAXES));
    public static final Block CRIMSON_NYLIUM_SLAB = new ARFONetherSlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM).breakByTool(FabricToolTags.PICKAXES));
    public static final Block WARPED_NYLIUM_SLAB = new ARFONetherSlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM).breakByTool(FabricToolTags.PICKAXES));

    public static final Block GLOWING_JUNGLE_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_JUNGLE_EDGE_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_BADLANDS_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_SAVANNA_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_FOREST_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_BIRCH_FOREST_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_DARK_FOREST_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_PLAINS_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_SWAMP_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_LUSH_SWAMP_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_MOUNTAINS_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_TAIGA_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_MEGA_TAIGA_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_SNOWY_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_SNOWY_BEACH_GRASS_BLOCK = new ARFOGlowingGrassBlock();
    public static final Block GLOWING_WATERS_GRASS_BLOCK = new ARFOGlowingGrassBlock();


    // flower pot for ferns
    public static final Block POTTED_JUNGLE_FERN = new FlowerPotBlock(JUNGLE_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_JUNGLE_EDGE_FERN = new FlowerPotBlock(JUNGLE_EDGE_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_BADLANDS_FERN = new FlowerPotBlock(BADLANDS_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_SAVANNA_FERN = new FlowerPotBlock(SAVANNA_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_FOREST_FERN = new FlowerPotBlock(FOREST_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_BIRCH_FOREST_FERN = new FlowerPotBlock(BIRCH_FOREST_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_DARK_FOREST_FERN = new FlowerPotBlock(DARK_FOREST_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_PLAINS_FERN = new FlowerPotBlock(PLAINS_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_SWAMP_FERN = new FlowerPotBlock(SWAMP_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_LUSH_SWAMP_FERN = new FlowerPotBlock(LUSH_SWAMP_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_MOUNTAINS_FERN = new FlowerPotBlock(MOUNTAINS_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_MUSHROOM_FIELDS_FERN = new FlowerPotBlock(MUSHROOM_FIELDS_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_TAIGA_FERN = new FlowerPotBlock(TAIGA_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_MEGA_TAIGA_FERN = new FlowerPotBlock(MEGA_TAIGA_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_SNOWY_FERN = new FlowerPotBlock(SNOWY_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());
    public static final Block POTTED_SNOWY_BEACH_FERN = new FlowerPotBlock(SNOWY_BEACH_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());;
    public static final Block POTTED_WATERS_FERN = new FlowerPotBlock(WATERS_FERN, FabricBlockSettings.of(Material.SUPPORTED).breakInstantly().nonOpaque());


    // blender blocks and block entities
    public static final Block BLENDER_GRASS_BLOCK = new BlenderGrassBlock();
    public static final Block BLENDER_OAK_LEAVES_BLOCK = new BlenderOakLeavesBlock();
    public static final Block BLENDER_DARK_OAK_LEAVES_BLOCK = new BlenderDarkOakLeavesBlock();
    public static final Block BLENDER_JUNGLE_LEAVES_BLOCK = new BlenderJungleLeavesBlock();
    public static final Block BLENDER_ACACIA_LEAVES_BLOCK = new BlenderAcaciaLeavesBlock();
    public static final BlockEntityType<BlenderBlockEntity> BLENDER_BLOCK_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ArtificialFoliage.MOD_ID, "color"),
            BlockEntityType.Builder.create(BlenderBlockEntity::new, BLENDER_GRASS_BLOCK, BLENDER_OAK_LEAVES_BLOCK, BLENDER_DARK_OAK_LEAVES_BLOCK, BLENDER_JUNGLE_LEAVES_BLOCK, BLENDER_ACACIA_LEAVES_BLOCK).build(null));



    public static void registerBlocks() {
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


        // grass blocks
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

        init("alpha_grass_block", ALPHA_GRASS_BLOCK);
        init("alpha_leaves", ALPHA_LEAVES);

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

        // sugar cane blocks
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


        // vine blocks
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
        init("grass_path_slab", GRASS_PATH_SLAB);
        init("artificial_soil_slab", ARTIFICIAL_SOIL_SLAB);
        init("netherrack_slab", NETHERRACK_SLAB);
        init("crimson_nylium_slab", CRIMSON_NYLIUM_SLAB);
        init("warped_nylium_slab", WARPED_NYLIUM_SLAB);

        // glowing grass blocks
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


        // potted fern
        init("potted_jungle_fern", POTTED_JUNGLE_FERN);
        init("potted_jungle_edge_fern", POTTED_JUNGLE_EDGE_FERN);
        init("potted_badlands_fern", POTTED_BADLANDS_FERN);
        init("potted_savanna_fern", POTTED_SAVANNA_FERN);
        init("potted_forest_fern", POTTED_FOREST_FERN);
        init("potted_birch_forest_fern", POTTED_BIRCH_FOREST_FERN);
        init("potted_dark_forest_fern", POTTED_DARK_FOREST_FERN);
        init("potted_plains_fern", POTTED_PLAINS_FERN);
        init("potted_swamp_fern", POTTED_SWAMP_FERN);
        init("potted_lush_swamp_fern", POTTED_LUSH_SWAMP_FERN);
        init("potted_mountains_fern", POTTED_MOUNTAINS_FERN);
        init("potted_mushroom_fields_fern", POTTED_MUSHROOM_FIELDS_FERN);
        init("potted_taiga_fern", POTTED_TAIGA_FERN);
        init("potted_mega_taiga_fern", POTTED_MEGA_TAIGA_FERN);
        init("potted_snowy_fern", POTTED_SNOWY_FERN);
        init("potted_snowy_beach_fern", POTTED_SNOWY_BEACH_FERN);
        init("potted_waters_fern", POTTED_WATERS_FERN);



        init("blender_grass_block", BLENDER_GRASS_BLOCK);
        init("blender_oak_leaves_block", BLENDER_OAK_LEAVES_BLOCK);
        init("blender_dark_oak_leaves_block", BLENDER_DARK_OAK_LEAVES_BLOCK);
        init("blender_jungle_leaves_block", BLENDER_JUNGLE_LEAVES_BLOCK);
        init("blender_acacia_leaves_block", BLENDER_ACACIA_LEAVES_BLOCK);

    }





}
