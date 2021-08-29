package com.finallion.artificialfoliage.blockentities.models;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.ModelBakeSettings;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class ColorableDarkOakLeavesBlockModel extends ColorableBakedModel {

    protected BakedModel grassBakedModel;
    protected Sprite sprite;
    private final SpriteIdentifier spriteId = new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_dark_oak_leaves"));

    @Override
    public BakedModel getBaseBakedModel() {
        return grassBakedModel;
    }

    @Override
    public Sprite getSprite() {
        return sprite;
    }

    @Override
    public Collection<SpriteIdentifier> getTextureDependencies(Function<Identifier, UnbakedModel> unbakedModelGetter, Set<Pair<String, String>> unresolvedTextureReferences) {
        return Collections.singleton(spriteId);
    }

    @Override
    public @Nullable BakedModel bake(ModelLoader loader, Function<SpriteIdentifier, Sprite> textureGetter, ModelBakeSettings rotationContainer, Identifier modelId) {
        grassBakedModel = loader.getOrLoadModel(new Identifier(ArtificialFoliage.MOD_ID, "block/colorable_dark_oak_leaves")).bake(loader, textureGetter, rotationContainer, modelId);
        sprite = textureGetter.apply(spriteId);
        return this;
    }
}
