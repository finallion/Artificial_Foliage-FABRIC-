package com.finallion.artificialfoliage.utils;

import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.level.ColorResolver;


public class ColorProvider {

    private static BlockColorProvider setDynamicBlockColorProvider(double temp, double humidity) {
        return (block, world, pos, layer) -> world != null && pos != null ?  GrassColors.getColor(temp, humidity) : BiomeColors.getGrassColor(world, pos);
    }

    private static BlockColorProvider setStaticBlockColorProvider(double x, double y, int color, BiomeEffects.GrassColorModifier modifier) {
        return (block, world, pos, layer) -> world != null && pos != null ?  modifier.getModifiedGrassColor(x, y, color) : BiomeColors.getGrassColor(world, pos);
    }

    private static BlockColorProvider setDynamicFoliageColorProvider(double temp, double humidity) {
        return (block, world, pos, layer) -> world != null && pos != null ?  FoliageColors.getColor(temp, humidity) : BiomeColors.getFoliageColor(world, pos);
    }


    // dynamic grass block colors
    public static final BlockColorProvider JUNGLE_COLOR = setDynamicBlockColorProvider(0.95, 0.9);
    public static final BlockColorProvider SAVANNA_COLOR = setDynamicBlockColorProvider(1.0, 0.0);
    public static final BlockColorProvider JUNGLE_EDGE_COLOR = setDynamicBlockColorProvider(0.95, 0.8);
    public static final BlockColorProvider FOREST_COLOR = setDynamicBlockColorProvider(0.7, 0.8);
    public static final BlockColorProvider BIRCH_FOREST_COLOR = setDynamicBlockColorProvider(0.6, 0.6);
    public static final BlockColorProvider PLAINS_COLOR = setDynamicBlockColorProvider(0.8, 0.4);
    public static final BlockColorProvider WATERS_COLOR = setDynamicBlockColorProvider(0.5, 0.5);
    public static final BlockColorProvider MOUNTAINS_COLOR = setDynamicBlockColorProvider(0.2, 0.3);
    public static final BlockColorProvider MUSHROOM_FIELDS_COLOR = setDynamicBlockColorProvider(0.9, 1.0);
    public static final BlockColorProvider SNOWY_COLOR = setDynamicBlockColorProvider(0.0, 0.5);
    public static final BlockColorProvider MEGA_TAIGA_COLOR = setDynamicBlockColorProvider(0.3, 0.8);
    public static final BlockColorProvider TAIGA_COLOR = setDynamicBlockColorProvider(0.25, 0.8);
    public static final BlockColorProvider SNOWY_BEACH_COLOR = setDynamicBlockColorProvider(0.05, 0.3);

    // hardcoded grass block colors
    public static final BlockColorProvider SWAMP_COLOR = setStaticBlockColorProvider(0.5, 0.5,6975545, BiomeEffects.GrassColorModifier.SWAMP);
    public static final BlockColorProvider LUSH_SWAMP_COLOR = setStaticBlockColorProvider(0.5, 0.5,5011004, BiomeEffects.GrassColorModifier.NONE);
    public static final BlockColorProvider DARK_FOREST_COLOR = (block, world, pos, layer) -> world != null && pos != null ?  BiomeEffects.GrassColorModifier.DARK_FOREST.getModifiedGrassColor(0.1, 0.1, GrassColors.getColor(0.7, 0.8)) : BiomeColors.getGrassColor(world, pos);
    public static final BlockColorProvider BADLANDS_COLOR = setStaticBlockColorProvider(0.5, 0.5,9470285, BiomeEffects.GrassColorModifier.NONE);

    // dynamic grass item color
    public static final ItemColorProvider JUNGLE_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.95, 0.9);
    public static final ItemColorProvider SAVANNA_ITEM_COLOR = (item, layer) -> GrassColors.getColor(1.0, 0.0);
    public static final ItemColorProvider JUNGLE_EDGE_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.95, 0.8);
    public static final ItemColorProvider FOREST_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.7, 0.8);
    public static final ItemColorProvider BIRCH_FOREST_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.6, 0.6);
    public static final ItemColorProvider PLAINS_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.8, 0.4);
    public static final ItemColorProvider WATERS_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.5, 0.5);
    public static final ItemColorProvider MOUNTAINS_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.2, 0.3);
    public static final ItemColorProvider MUSHROOM_FIELDS_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.9, 1.0);
    public static final ItemColorProvider SNOWY_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.0, 0.5);
    public static final ItemColorProvider MEGA_TAIGA_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.3, 0.8);
    public static final ItemColorProvider TAIGA_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.25, 0.8);
    public static final ItemColorProvider SNOWY_BEACH_ITEM_COLOR = (item, layer) -> GrassColors.getColor(0.05, 0.3);

    // hardcoded grass item color
    public static final ItemColorProvider SWAMP_ITEM_COLOR = (item, layer) -> BiomeEffects.GrassColorModifier.SWAMP.getModifiedGrassColor(0.8, 0.9, 6975545);
    public static final ItemColorProvider LUSH_SWAMP_ITEM_COLOR = (item, layer) -> BiomeEffects.GrassColorModifier.NONE.getModifiedGrassColor(0.8, 0.9, 5011004);
    public static final ItemColorProvider DARK_FOREST_ITEM_COLOR = (item, layer) -> BiomeEffects.GrassColorModifier.DARK_FOREST.getModifiedGrassColor(0.7, 0.8, GrassColors.getColor(0.7, 0.8));
    public static final ItemColorProvider BADLANDS_ITEM_COLOR = (item, layer) -> BiomeEffects.GrassColorModifier.NONE.getModifiedGrassColor(0.5, 0.5, 9470285);


    // dynamic foliage block colors
    public static final BlockColorProvider JUNGLE_LEAVE_COLOR = setDynamicFoliageColorProvider(0.95, 0.9);
    public static final BlockColorProvider SAVANNA_LEAVE_COLOR = setDynamicFoliageColorProvider(1.0, 0.0);
    public static final BlockColorProvider JUNGLE_EDGE_LEAVE_COLOR = setDynamicFoliageColorProvider(0.95, 0.8);
    public static final BlockColorProvider FOREST_LEAVE_COLOR = setDynamicFoliageColorProvider(0.7, 0.8);
    public static final BlockColorProvider BIRCH_FOREST_LEAVE_COLOR = setDynamicFoliageColorProvider(0.6, 0.6);
    public static final BlockColorProvider PLAINS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.8, 0.4);
    public static final BlockColorProvider WATERS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.5, 0.5);
    public static final BlockColorProvider MOUNTAINS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.2, 0.3);
    public static final BlockColorProvider MUSHROOM_FIELDS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.9, 1.0);
    public static final BlockColorProvider SNOWY_LEAVE_COLOR = setDynamicFoliageColorProvider(0.0, 0.5);
    public static final BlockColorProvider MEGA_TAIGA_LEAVE_COLOR = setDynamicFoliageColorProvider(0.3, 0.8);
    public static final BlockColorProvider TAIGA_LEAVE_COLOR = setDynamicFoliageColorProvider(0.25, 0.8);
    public static final BlockColorProvider SNOWY_BEACH_LEAVE_COLOR = setDynamicFoliageColorProvider(0.05, 0.3);

    // hardcoded foliage block colors
    public static final BlockColorProvider SWAMP_LEAVE_COLOR = setStaticBlockColorProvider(0.5, 0.5,6975545, BiomeEffects.GrassColorModifier.SWAMP);
    public static final BlockColorProvider LUSH_SWAMP_LEAVE_COLOR = setStaticBlockColorProvider(0.5, 0.5,5011004, BiomeEffects.GrassColorModifier.NONE);
    public static final BlockColorProvider DARK_FOREST_LEAVE_COLOR = (block, world, pos, layer) -> world != null && pos != null ?  BiomeEffects.GrassColorModifier.DARK_FOREST.getModifiedGrassColor(0.1, 0.1, FoliageColors.getColor(0.7, 0.8)) : BiomeColors.getFoliageColor(world, pos);
    public static final BlockColorProvider BADLANDS_LEAVE_COLOR = setStaticBlockColorProvider(0.5, 0.5,10387789, BiomeEffects.GrassColorModifier.NONE);


}
