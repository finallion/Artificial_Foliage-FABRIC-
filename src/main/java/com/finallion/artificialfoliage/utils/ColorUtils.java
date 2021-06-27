package com.finallion.artificialfoliage.utils;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeEffects;

@Environment(EnvType.CLIENT)
public class ColorUtils {

    public static final RenderLayer GRASS_BLOCK_LAYER = RenderLayer.getCutoutMipped();
    public static final RenderLayer LEAVE_BLOCK_LAYER = RenderLayer.getTranslucent();
    public static final RenderLayer PLANT_BLOCK_LAYER = RenderLayer.getCutout();

    public static void registerGrassBlockColor(BlockColorProvider color, Block... block) {
        ColorProviderRegistry.BLOCK.register(color, block);
        BlockRenderLayerMap.INSTANCE.putBlocks(GRASS_BLOCK_LAYER, block);
    }

    public static void registerLeaveBlockColor(BlockColorProvider color, Block ... block) {
        ColorProviderRegistry.BLOCK.register(color, block);
        BlockRenderLayerMap.INSTANCE.putBlocks(LEAVE_BLOCK_LAYER, block);
    }

    public static void registerItemColor(ItemColorProvider color, Item... item) {
        ColorProviderRegistry.ITEM.register(color, item);
    }

    public static BlockColorProvider setDynamicBlockColorProvider(double temp, double humidity) {
        return (block, world, pos, layer) -> world != null && pos != null ?  GrassColors.getColor(temp, humidity) : BiomeColors.getGrassColor(world, pos);
    }

    public static BlockColorProvider setStaticBlockColorProvider(double x, double y, int color, BiomeEffects.GrassColorModifier modifier) {
        return (block, world, pos, layer) -> world != null && pos != null ?  modifier.getModifiedGrassColor(x, y, color) : BiomeColors.getGrassColor(world, pos);
    }

    public static BlockColorProvider setDynamicFoliageColorProvider(double temp, double humidity) {
        return (block, world, pos, layer) -> world != null && pos != null ?  FoliageColors.getColor(temp, humidity) : BiomeColors.getFoliageColor(world, pos);
    }


}
