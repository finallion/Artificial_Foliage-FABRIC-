package com.finallion.artificialfoliage.block.models;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.render.model.*;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;

public class BlenderGrassBlockBakedModel extends BaseBakedModel {

    protected BakedModel grassBakedModel;
    protected Sprite sprite;
    private final SpriteIdentifier spriteId = new SpriteIdentifier(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, new Identifier(ArtificialFoliage.MOD_ID, "blocks/gray_grass"));

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
        grassBakedModel = loader.getOrLoadModel(new Identifier(ArtificialFoliage.MOD_ID, "block/blender_grass_block")).bake(loader, textureGetter, rotationContainer, modelId);
        sprite = textureGetter.apply(spriteId);
        return this;
    }
}

