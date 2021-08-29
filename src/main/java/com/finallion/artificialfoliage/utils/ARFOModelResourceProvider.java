package com.finallion.artificialfoliage.utils;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.blockentities.models.*;
import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.fabricmc.fabric.api.client.model.ModelVariantProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class ARFOModelResourceProvider implements ModelVariantProvider {

    @Override
    public @Nullable UnbakedModel loadModelVariant(ModelIdentifier modelId, ModelProviderContext context) throws ModelProviderException {

        if (modelId.getNamespace().equals("arfo") && modelId.getPath().equals("colorable_grass_block")) {
            return new ColorableBasicModel(new Identifier(ArtificialFoliage.MOD_ID, "block/colorable_grass_block"), new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_grass")));
        } else if(modelId.getNamespace().equals("arfo") && modelId.getPath().equals("colorable_oak_leaves")) {
            return new ColorableBasicModel(new Identifier(ArtificialFoliage.MOD_ID, "block/colorable_oak_leaves"), new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_oak_leaves")));
        } else if(modelId.getNamespace().equals("arfo") && modelId.getPath().equals("colorable_dark_oak_leaves")) {
            return new ColorableBasicModel(new Identifier(ArtificialFoliage.MOD_ID, "block/colorable_dark_oak_leaves"), new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_dark_oak_leaves")));
        } else if(modelId.getNamespace().equals("arfo") && modelId.getPath().equals("colorable_acacia_leaves")) {
            return new ColorableBasicModel(new Identifier(ArtificialFoliage.MOD_ID, "block/colorable_acacia_leaves"), new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_acacia_leaves")));
        } else if(modelId.getNamespace().equals("arfo") && modelId.getPath().equals("colorable_jungle_leaves")) {
            return new ColorableBasicModel(new Identifier(ArtificialFoliage.MOD_ID, "block/colorable_jungle_leaves"), new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_jungle_leaves")));
        } else {
            return null;
        }
    }
}
