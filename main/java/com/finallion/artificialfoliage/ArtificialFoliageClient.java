package com.finallion.artificialfoliage;




import com.finallion.artificialfoliage.block.blenderBlocks.BlenderBlockEntity;
import com.finallion.artificialfoliage.block.blenderBlocks.IBlenderBlock;
import com.finallion.artificialfoliage.block.models.*;
import com.finallion.artificialfoliage.registry.ModBlocks;
import com.finallion.artificialfoliage.registry.ModFluids;
import com.finallion.artificialfoliage.registry.ModItems;
import com.finallion.artificialfoliage.utils.ColorProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;


@Environment(EnvType.CLIENT)
public class ArtificialFoliageClient implements ClientModInitializer {

    private void registerGrassBlockColor(BlockColorProvider color, Block ... block) {
        ColorProviderRegistry.BLOCK.register(color, block);
        BlockRenderLayerMap.INSTANCE.putBlocks(GRASS_BLOCK_LAYER, block);
    }

    private void registerFluidColor(int color, Fluid still, Fluid flow) {
        setupFluidRendering(still, flow, color);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), still, flow);
    }

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final int color) {
        final Identifier stillSpriteId = new Identifier("minecraft:block/water_still");
        final Identifier flowingSpriteId = new Identifier("minecraft:block/water_flow");

        final Identifier fluidId = Registry.FLUID.getId(still);
        final Identifier listenerId = new Identifier(fluidId.getNamespace(), fluidId.getPath() + "_reload_listener");

        final Sprite[] fluidSprites = { null, null };

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public Identifier getFabricId() {
                return listenerId;
            }

            @Override
            public void apply(ResourceManager resourceManager) {
                final Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE);
                fluidSprites[0] = atlas.apply(stillSpriteId);
                fluidSprites[1] = atlas.apply(flowingSpriteId);
            }
        });

        final FluidRenderHandler renderHandler = new FluidRenderHandler()
        {
            @Override
            public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state) {
                return fluidSprites;
            }

            @Override
            public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state) {
                return color;
            }
        };
        FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
    }

    private void registerLeaveBlockColor(BlockColorProvider color, Block ... block) {
        ColorProviderRegistry.BLOCK.register(color, block);
        BlockRenderLayerMap.INSTANCE.putBlocks(LEAVE_BLOCK_LAYER, block);
    }

    private void registerItemColor(ItemColorProvider color, BlockItem ... blockItem) {
        ColorProviderRegistry.ITEM.register(color, blockItem);
    }


    // renders for grass side overlay and opacity with leaves
    private static final RenderLayer GRASS_BLOCK_LAYER = RenderLayer.getCutoutMipped();
    private static final RenderLayer LEAVE_BLOCK_LAYER = RenderLayer.getTranslucent();
    private static final RenderLayer PLANT_BLOCK_LAYER = RenderLayer.getCutout();

    @Override
    public void onInitializeClient() {

        registerFluidColor(4020182, ModFluids.STILL_COLD_OCEAN_WATER, ModFluids.FLOWING_COLD_OCEAN_WATER);
        registerFluidColor(3750089, ModFluids.STILL_FROZEN_OCEAN_WATER, ModFluids.FLOWING_FROZEN_OCEAN_WATER);
        registerFluidColor(4566514, ModFluids.STILL_LUKEWARM_OCEAN_WATER, ModFluids.FLOWING_LUKEWARM_OCEAN_WATER);
        registerFluidColor(4445678, ModFluids.STILL_WARM_OCEAN_WATER, ModFluids.FLOWING_WARM_OCEAN_WATER);
        registerFluidColor(6388580, ModFluids.STILL_SWAMP_WATER, ModFluids.FLOWING_SWAMP_WATER);
        registerFluidColor(4159204, ModFluids.STILL_OCEAN_WATER, ModFluids.FLOWING_OCEAN_WATER);


        // blocks
        registerGrassBlockColor(ColorProvider.MUSHROOM_FIELDS_COLOR,
                ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK,
                ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB,
                ModBlocks.MUSHROOM_FIELDS_GRASS,
                ModBlocks.TALL_MUSHROOM_FIELDS_GRASS,
                ModBlocks.MUSHROOM_FIELDS_FERN,
                ModBlocks.LARGE_MUSHROOM_FIELDS_FERN,
                ModBlocks.MUSHROOM_FIELDS_SUGAR_CANE,
                ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK,
                ModBlocks.POTTED_MUSHROOM_FIELDS_FERN
        );

        registerLeaveBlockColor(ColorProvider.MUSHROOM_FIELDS_LEAVE_COLOR,
                ModBlocks.MUSHROOM_FIELDS_VINE,
                ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.JUNGLE_COLOR,
                ModBlocks.JUNGLE_GRASS_BLOCK,
                ModBlocks.JUNGLE_GRASS_SLAB,
                ModBlocks.JUNGLE_GRASS,
                ModBlocks.TALL_JUNGLE_GRASS,
                ModBlocks.JUNGLE_FERN,
                ModBlocks.LARGE_JUNGLE_FERN,
                ModBlocks.JUNGLE_SUGAR_CANE,
                ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK,
                ModBlocks.POTTED_JUNGLE_FERN
        );

        registerLeaveBlockColor(ColorProvider.JUNGLE_LEAVE_COLOR,
                ModBlocks.JUNGLE_VINE,
                ModBlocks.TROPICAL_ACACIA_LEAVES,
                ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET,
                ModBlocks.TROPICAL_DARK_OAK_LEAVES,
                ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ModBlocks.TROPICAL_JUNGLE_LEAVES,
                ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET,
                ModBlocks.TROPICAL_OAK_LEAVES,
                ModBlocks.TROPICAL_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.JUNGLE_EDGE_COLOR,
                ModBlocks.JUNGLE_EDGE_GRASS_BLOCK,
                ModBlocks.JUNGLE_EDGE_GRASS_SLAB,
                ModBlocks.JUNGLE_EDGE_GRASS,
                ModBlocks.TALL_JUNGLE_EDGE_GRASS,
                ModBlocks.JUNGLE_EDGE_FERN,
                ModBlocks.LARGE_JUNGLE_EDGE_FERN,
                ModBlocks.JUNGLE_EDGE_SUGAR_CANE,
                ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK,
                ModBlocks.POTTED_JUNGLE_EDGE_FERN
        );

        registerLeaveBlockColor(ColorProvider.JUNGLE_EDGE_LEAVE_COLOR,
                ModBlocks.JUNGLE_EDGE_VINE,
                ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES,
                ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES,
                ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ModBlocks.TROPICAL_EDGE_OAK_LEAVES,
                ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.PLAINS_COLOR,
                ModBlocks.PLAINS_GRASS_BLOCK,
                ModBlocks.PLAINS_GRASS_SLAB,
                ModBlocks.PLAINS_GRASS,
                ModBlocks.TALL_PLAINS_GRASS,
                ModBlocks.PLAINS_FERN,
                ModBlocks.LARGE_PLAINS_FERN,
                ModBlocks.PLAINS_SUGAR_CANE,
                ModBlocks.GLOWING_PLAINS_GRASS_BLOCK,
                ModBlocks.POTTED_PLAINS_FERN
        );


        registerLeaveBlockColor(ColorProvider.PLAINS_LEAVE_COLOR,
                ModBlocks.PLAINS_VINE,
                ModBlocks.PLAINS_ACACIA_LEAVES,
                ModBlocks.PLAINS_ACACIA_LEAVES_CARPET,
                ModBlocks.PLAINS_DARK_OAK_LEAVES,
                ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.PLAINS_JUNGLE_LEAVES,
                ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET,
                ModBlocks.PLAINS_OAK_LEAVES,
                ModBlocks.PLAINS_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.FOREST_COLOR,
                ModBlocks.FOREST_GRASS_BLOCK,
                ModBlocks.FOREST_GRASS_SLAB,
                ModBlocks.FOREST_GRASS,
                ModBlocks.TALL_FOREST_GRASS,
                ModBlocks.FOREST_FERN,
                ModBlocks.LARGE_FOREST_FERN,
                ModBlocks.FOREST_SUGAR_CANE,
                ModBlocks.GLOWING_FOREST_GRASS_BLOCK,
                ModBlocks.POTTED_FOREST_FERN
        );

        registerLeaveBlockColor(ColorProvider.FOREST_LEAVE_COLOR,
                ModBlocks.FOREST_VINE,
                ModBlocks.FOREST_ACACIA_LEAVES,
                ModBlocks.FOREST_ACACIA_LEAVES_CARPET,
                ModBlocks.FOREST_DARK_OAK_LEAVES,
                ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET,
                ModBlocks.FOREST_JUNGLE_LEAVES,
                ModBlocks.FOREST_JUNGLE_LEAVES_CARPET,
                ModBlocks.FOREST_OAK_LEAVES,
                ModBlocks.FOREST_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.BIRCH_FOREST_COLOR,
                ModBlocks.BIRCH_FOREST_GRASS_BLOCK,
                ModBlocks.BIRCH_FOREST_GRASS_SLAB,
                ModBlocks.BIRCH_FOREST_GRASS,
                ModBlocks.TALL_BIRCH_FOREST_GRASS,
                ModBlocks.BIRCH_FOREST_FERN,
                ModBlocks.LARGE_BIRCH_FOREST_FERN,
                ModBlocks.BIRCH_FOREST_SUGAR_CANE,
                ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK,
                ModBlocks.POTTED_BIRCH_FOREST_FERN
        );

        registerLeaveBlockColor(ColorProvider.BIRCH_FOREST_LEAVE_COLOR,
                ModBlocks.BIRCH_FOREST_VINE,
                ModBlocks.BIRCH_FOREST_ACACIA_LEAVES,
                ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES,
                ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES,
                ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ModBlocks.BIRCH_FOREST_OAK_LEAVES,
                ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.WATERS_COLOR,
                ModBlocks.WATERS_GRASS_BLOCK,
                ModBlocks.WATERS_GRASS_SLAB,
                ModBlocks.WATERS_GRASS,
                ModBlocks.TALL_WATERS_GRASS,
                ModBlocks.WATERS_FERN,
                ModBlocks.LARGE_WATERS_FERN,
                ModBlocks.WATERS_SUGAR_CANE,
                ModBlocks.GLOWING_WATERS_GRASS_BLOCK,
                ModBlocks.POTTED_WATERS_FERN
        );

        registerLeaveBlockColor(ColorProvider.WATERS_LEAVE_COLOR,
                ModBlocks.WATERS_VINE,
                ModBlocks.WATERS_ACACIA_LEAVES,
                ModBlocks.WATERS_ACACIA_LEAVES_CARPET,
                ModBlocks.WATERS_DARK_OAK_LEAVES,
                ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.WATERS_JUNGLE_LEAVES,
                ModBlocks.WATERS_JUNGLE_LEAVES_CARPET,
                ModBlocks.WATERS_OAK_LEAVES,
                ModBlocks.WATERS_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.MEGA_TAIGA_COLOR,
                ModBlocks.MEGA_TAIGA_GRASS_BLOCK,
                ModBlocks.MEGA_TAIGA_GRASS_SLAB,
                ModBlocks.MEGA_TAIGA_GRASS,
                ModBlocks.TALL_MEGA_TAIGA_GRASS,
                ModBlocks.MEGA_TAIGA_FERN,
                ModBlocks.LARGE_MEGA_TAIGA_FERN,
                ModBlocks.MEGA_TAIGA_SUGAR_CANE,
                ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK,
                ModBlocks.POTTED_MEGA_TAIGA_FERN
        );

        registerLeaveBlockColor(ColorProvider.MEGA_TAIGA_LEAVE_COLOR,
                ModBlocks.MEGA_TAIGA_VINE,
                ModBlocks.MEGA_TAIGA_ACACIA_LEAVES,
                ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES,
                ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES,
                ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ModBlocks.MEGA_TAIGA_OAK_LEAVES,
                ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET
        );


        registerGrassBlockColor(ColorProvider.TAIGA_COLOR,
                ModBlocks.TAIGA_GRASS_BLOCK,
                ModBlocks.TAIGA_GRASS_SLAB,
                ModBlocks.TAIGA_GRASS,
                ModBlocks.TALL_TAIGA_GRASS,
                ModBlocks.TAIGA_FERN,
                ModBlocks.LARGE_TAIGA_FERN,
                ModBlocks.TAIGA_SUGAR_CANE,
                ModBlocks.GLOWING_TAIGA_GRASS_BLOCK,
                ModBlocks.POTTED_TAIGA_FERN
        );

        registerLeaveBlockColor(ColorProvider.TAIGA_LEAVE_COLOR,
                ModBlocks.TAIGA_VINE,
                ModBlocks.TAIGA_ACACIA_LEAVES,
                ModBlocks.TAIGA_ACACIA_LEAVES_CARPET,
                ModBlocks.TAIGA_DARK_OAK_LEAVES,
                ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET,
                ModBlocks.TAIGA_JUNGLE_LEAVES,
                ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET,
                ModBlocks.TAIGA_OAK_LEAVES,
                ModBlocks.TAIGA_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.MOUNTAINS_COLOR,
                ModBlocks.MOUNTAINS_GRASS_BLOCK,
                ModBlocks.MOUNTAINS_GRASS_SLAB,
                ModBlocks.MOUNTAINS_GRASS,
                ModBlocks.TALL_MOUNTAINS_GRASS,
                ModBlocks.MOUNTAINS_FERN,
                ModBlocks.LARGE_MOUNTAINS_FERN,
                ModBlocks.MOUNTAINS_SUGAR_CANE,
                ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK,
                ModBlocks.POTTED_MOUNTAINS_FERN
        );

        registerLeaveBlockColor(ColorProvider.MOUNTAINS_LEAVE_COLOR,
                ModBlocks.MOUNTAINS_VINE,
                ModBlocks.MOUNTAINS_ACACIA_LEAVES,
                ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ModBlocks.MOUNTAINS_DARK_OAK_LEAVES,
                ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.MOUNTAINS_JUNGLE_LEAVES,
                ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ModBlocks.MOUNTAINS_OAK_LEAVES,
                ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.SNOWY_COLOR,
                ModBlocks.SNOWY_GRASS_BLOCK,
                ModBlocks.SNOWY_GRASS_SLAB,
                ModBlocks.SNOWY_GRASS,
                ModBlocks.TALL_SNOWY_GRASS,
                ModBlocks.SNOWY_FERN,
                ModBlocks.LARGE_SNOWY_FERN,
                ModBlocks.SNOWY_SUGAR_CANE,
                ModBlocks.GLOWING_SNOWY_GRASS_BLOCK,
                ModBlocks.POTTED_SNOWY_FERN
        );

        registerLeaveBlockColor(ColorProvider.SNOWY_LEAVE_COLOR,
                ModBlocks.SNOWY_VINE,
                ModBlocks.SNOWY_ACACIA_LEAVES,
                ModBlocks.SNOWY_ACACIA_LEAVES_CARPET,
                ModBlocks.SNOWY_DARK_OAK_LEAVES,
                ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SNOWY_JUNGLE_LEAVES,
                ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET,
                ModBlocks.SNOWY_OAK_LEAVES,
                ModBlocks.SNOWY_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.SNOWY_BEACH_COLOR,
                ModBlocks.SNOWY_BEACH_GRASS_BLOCK,
                ModBlocks.SNOWY_BEACH_GRASS_SLAB,
                ModBlocks.SNOWY_BEACH_GRASS,
                ModBlocks.TALL_SNOWY_BEACH_GRASS,
                ModBlocks.SNOWY_BEACH_FERN,
                ModBlocks.LARGE_SNOWY_BEACH_FERN,
                ModBlocks.SNOWY_BEACH_SUGAR_CANE,
                ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK,
                ModBlocks.POTTED_SNOWY_BEACH_FERN
        );

        registerLeaveBlockColor(ColorProvider.SNOWY_BEACH_LEAVE_COLOR,
                ModBlocks.SNOWY_BEACH_VINE,
                ModBlocks.SNOWY_BEACH_ACACIA_LEAVES,
                ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES,
                ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES,
                ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ModBlocks.SNOWY_BEACH_OAK_LEAVES,
                ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.DARK_FOREST_COLOR,
                ModBlocks.DARK_FOREST_GRASS_BLOCK,
                ModBlocks.DARK_FOREST_GRASS_SLAB,
                ModBlocks.DARK_FOREST_GRASS,
                ModBlocks.TALL_DARK_FOREST_GRASS,
                ModBlocks.DARK_FOREST_FERN,
                ModBlocks.LARGE_DARK_FOREST_FERN,
                ModBlocks.DARK_FOREST_SUGAR_CANE,
                ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK,
                ModBlocks.POTTED_DARK_FOREST_FERN
        );

        registerLeaveBlockColor(ColorProvider.DARK_FOREST_LEAVE_COLOR,
                ModBlocks.DARK_FOREST_VINE,
                ModBlocks.DARK_FOREST_ACACIA_LEAVES,
                ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ModBlocks.DARK_FOREST_DARK_OAK_LEAVES,
                ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ModBlocks.DARK_FOREST_JUNGLE_LEAVES,
                ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ModBlocks.DARK_FOREST_OAK_LEAVES,
                ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.LUSH_SWAMP_COLOR,
                ModBlocks.LUSH_SWAMP_GRASS_BLOCK,
                ModBlocks.LUSH_SWAMP_GRASS_SLAB,
                ModBlocks.LUSH_SWAMP_GRASS,
                ModBlocks.TALL_LUSH_SWAMP_GRASS,
                ModBlocks.LUSH_SWAMP_FERN,
                ModBlocks.LARGE_LUSH_SWAMP_FERN,
                ModBlocks.LUSH_SWAMP_SUGAR_CANE,
                ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK,
                ModBlocks.POTTED_LUSH_SWAMP_FERN
        );

        registerLeaveBlockColor(ColorProvider.LUSH_SWAMP_LEAVE_COLOR,
                ModBlocks.LUSH_SWAMP_VINE,
                ModBlocks.LUSH_SWAMP_ACACIA_LEAVES,
                ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES,
                ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES,
                ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ModBlocks.LUSH_SWAMP_OAK_LEAVES,
                ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.SWAMP_COLOR,
                ModBlocks.SWAMP_GRASS_BLOCK,
                ModBlocks.SWAMP_GRASS_SLAB,
                ModBlocks.SWAMP_GRASS,
                ModBlocks.TALL_SWAMP_GRASS,
                ModBlocks.SWAMP_FERN,
                ModBlocks.LARGE_SWAMP_FERN,
                ModBlocks.SWAMP_SUGAR_CANE,
                ModBlocks.GLOWING_SWAMP_GRASS_BLOCK,
                ModBlocks.POTTED_SWAMP_FERN
        );

        registerLeaveBlockColor(ColorProvider.SWAMP_LEAVE_COLOR,
                ModBlocks.SWAMP_VINE,
                ModBlocks.SWAMP_ACACIA_LEAVES,
                ModBlocks.SWAMP_ACACIA_LEAVES_CARPET,
                ModBlocks.SWAMP_DARK_OAK_LEAVES,
                ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SWAMP_JUNGLE_LEAVES,
                ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET,
                ModBlocks.SWAMP_OAK_LEAVES,
                ModBlocks.SWAMP_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.SAVANNA_COLOR,
                ModBlocks.SAVANNA_GRASS_BLOCK,
                ModBlocks.SAVANNA_GRASS_SLAB,
                ModBlocks.SAVANNA_GRASS,
                ModBlocks.TALL_SAVANNA_GRASS,
                ModBlocks.SAVANNA_FERN,
                ModBlocks.LARGE_SAVANNA_FERN,
                ModBlocks.SAVANNA_SUGAR_CANE,
                ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK,
                ModBlocks.POTTED_SAVANNA_FERN
        );
        registerLeaveBlockColor(ColorProvider.SAVANNA_LEAVE_COLOR,
                ModBlocks.SAVANNA_VINE,
                ModBlocks.SAVANNA_ACACIA_LEAVES,
                ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET,
                ModBlocks.SAVANNA_DARK_OAK_LEAVES,
                ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SAVANNA_JUNGLE_LEAVES,
                ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET,
                ModBlocks.SAVANNA_OAK_LEAVES,
                ModBlocks.SAVANNA_OAK_LEAVES_CARPET
        );

        registerGrassBlockColor(ColorProvider.BADLANDS_COLOR,
                ModBlocks.BADLANDS_GRASS_BLOCK,
                ModBlocks.BADLANDS_GRASS_SLAB,
                ModBlocks.BADLANDS_GRASS,
                ModBlocks.TALL_BADLANDS_GRASS,
                ModBlocks.BADLANDS_FERN,
                ModBlocks.LARGE_BADLANDS_FERN,
                ModBlocks.BADLANDS_SUGAR_CANE,
                ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK,
                ModBlocks.POTTED_BADLANDS_FERN
        );

        registerLeaveBlockColor(ColorProvider.BADLANDS_LEAVE_COLOR,
                ModBlocks.BADLANDS_VINE,
                ModBlocks.BADLANDS_ACACIA_LEAVES,
                ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET,
                ModBlocks.BADLANDS_DARK_OAK_LEAVES,
                ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.BADLANDS_JUNGLE_LEAVES,
                ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET,
                ModBlocks.BADLANDS_OAK_LEAVES,
                ModBlocks.BADLANDS_OAK_LEAVES_CARPET
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(PLANT_BLOCK_LAYER,
                ModBlocks.POTTED_MUSHROOM_FIELDS_FERN,
                ModBlocks.POTTED_JUNGLE_FERN,
                ModBlocks.POTTED_JUNGLE_EDGE_FERN,
                ModBlocks.POTTED_FOREST_FERN,
                ModBlocks.POTTED_BIRCH_FOREST_FERN,
                ModBlocks.POTTED_DARK_FOREST_FERN,
                ModBlocks.POTTED_PLAINS_FERN,
                ModBlocks.POTTED_SWAMP_FERN,
                ModBlocks.POTTED_LUSH_SWAMP_FERN,
                ModBlocks.POTTED_MOUNTAINS_FERN,
                ModBlocks.POTTED_SNOWY_FERN,
                ModBlocks.POTTED_SNOWY_BEACH_FERN,
                ModBlocks.POTTED_WATERS_FERN,
                ModBlocks.POTTED_TAIGA_FERN,
                ModBlocks.POTTED_MEGA_TAIGA_FERN
        );


        // block items
        registerItemColor(ColorProvider.MUSHROOM_FIELDS_ITEM_COLOR,
                ModItems.MUSHROOM_FIELDS_GRASS_BLOCK,
                ModItems.MUSHROOM_FIELDS_GRASS_SLAB,
                ModItems.MUSHROOM_FIELDS_GRASS,
                ModItems.TALL_MUSHROOM_FIELDS_GRASS,
                ModItems.MUSHROOM_FIELDS_FERN,
                ModItems.LARGE_MUSHROOM_FIELDS_FERN,
                ModItems.MUSHROOM_FIELDS_VINE,
                ModItems.MUSHROOM_FIELDS_SUGAR_CANE,
                ModItems.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ModItems.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ModItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ModItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ModItems.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ModItems.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ModItems.MUSHROOM_FIELDS_OAK_LEAVES,
                ModItems.MUSHROOM_FIELDS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.JUNGLE_ITEM_COLOR,
                ModItems.JUNGLE_GRASS_BLOCK,
                ModItems.JUNGLE_GRASS_SLAB,
                ModItems.JUNGLE_GRASS,
                ModItems.TALL_JUNGLE_GRASS,
                ModItems.JUNGLE_FERN,
                ModItems.LARGE_JUNGLE_FERN,
                ModItems.JUNGLE_VINE,
                ModItems.JUNGLE_SUGAR_CANE,
                ModItems.TROPICAL_ACACIA_LEAVES,
                ModItems.TROPICAL_ACACIA_LEAVES_CARPET,
                ModItems.TROPICAL_DARK_OAK_LEAVES,
                ModItems.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ModItems.TROPICAL_JUNGLE_LEAVES,
                ModItems.TROPICAL_JUNGLE_LEAVES_CARPET,
                ModItems.TROPICAL_OAK_LEAVES,
                ModItems.TROPICAL_OAK_LEAVES_CARPET,
                ModItems.GLOWING_JUNGLE_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.JUNGLE_EDGE_ITEM_COLOR,
                ModItems.JUNGLE_EDGE_GRASS_BLOCK,
                ModItems.JUNGLE_EDGE_GRASS_SLAB,
                ModItems.JUNGLE_EDGE_GRASS,
                ModItems.TALL_JUNGLE_EDGE_GRASS,
                ModItems.JUNGLE_EDGE_FERN,
                ModItems.LARGE_JUNGLE_EDGE_FERN,
                ModItems.JUNGLE_EDGE_VINE,
                ModItems.JUNGLE_EDGE_SUGAR_CANE,
                ModItems.TROPICAL_EDGE_ACACIA_LEAVES,
                ModItems.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ModItems.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ModItems.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ModItems.TROPICAL_EDGE_JUNGLE_LEAVES,
                ModItems.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ModItems.TROPICAL_EDGE_OAK_LEAVES,
                ModItems.TROPICAL_EDGE_OAK_LEAVES_CARPET,
                ModItems.GLOWING_JUNGLE_EDGE_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.PLAINS_ITEM_COLOR,
                ModItems.PLAINS_GRASS_BLOCK,
                ModItems.PLAINS_GRASS_SLAB,
                ModItems.PLAINS_GRASS,
                ModItems.TALL_PLAINS_GRASS,
                ModItems.PLAINS_FERN,
                ModItems.LARGE_PLAINS_FERN,
                ModItems.PLAINS_VINE,
                ModItems.PLAINS_SUGAR_CANE,
                ModItems.PLAINS_ACACIA_LEAVES,
                ModItems.PLAINS_ACACIA_LEAVES_CARPET,
                ModItems.PLAINS_DARK_OAK_LEAVES,
                ModItems.PLAINS_DARK_OAK_LEAVES_CARPET,
                ModItems.PLAINS_JUNGLE_LEAVES,
                ModItems.PLAINS_JUNGLE_LEAVES_CARPET,
                ModItems.PLAINS_OAK_LEAVES,
                ModItems.PLAINS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_PLAINS_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.FOREST_ITEM_COLOR,
                ModItems.FOREST_GRASS_BLOCK,
                ModItems.FOREST_GRASS_SLAB,
                ModItems.FOREST_GRASS,
                ModItems.TALL_FOREST_GRASS,
                ModItems.FOREST_FERN,
                ModItems.LARGE_FOREST_FERN,
                ModItems.FOREST_VINE,
                ModItems.FOREST_SUGAR_CANE,
                ModItems.FOREST_ACACIA_LEAVES,
                ModItems.FOREST_ACACIA_LEAVES_CARPET,
                ModItems.FOREST_DARK_OAK_LEAVES,
                ModItems.FOREST_DARK_OAK_LEAVES_CARPET,
                ModItems.FOREST_JUNGLE_LEAVES,
                ModItems.FOREST_JUNGLE_LEAVES_CARPET,
                ModItems.FOREST_OAK_LEAVES,
                ModItems.FOREST_OAK_LEAVES_CARPET,
                ModItems.GLOWING_FOREST_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.BIRCH_FOREST_ITEM_COLOR,
                ModItems.BIRCH_FOREST_GRASS_BLOCK,
                ModItems.BIRCH_FOREST_GRASS_SLAB,
                ModItems.BIRCH_FOREST_GRASS,
                ModItems.TALL_BIRCH_FOREST_GRASS,
                ModItems.BIRCH_FOREST_FERN,
                ModItems.LARGE_BIRCH_FOREST_FERN,
                ModItems.BIRCH_FOREST_VINE,
                ModItems.BIRCH_FOREST_SUGAR_CANE,
                ModItems.BIRCH_FOREST_ACACIA_LEAVES,
                ModItems.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ModItems.BIRCH_FOREST_DARK_OAK_LEAVES,
                ModItems.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ModItems.BIRCH_FOREST_JUNGLE_LEAVES,
                ModItems.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ModItems.BIRCH_FOREST_OAK_LEAVES,
                ModItems.BIRCH_FOREST_OAK_LEAVES_CARPET,
                ModItems.GLOWING_BIRCH_FOREST_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.WATERS_ITEM_COLOR,
                ModItems.WATERS_GRASS_BLOCK,
                ModItems.WATERS_GRASS_SLAB,
                ModItems.WATERS_GRASS,
                ModItems.TALL_WATERS_GRASS,
                ModItems.WATERS_FERN,
                ModItems.LARGE_WATERS_FERN,
                ModItems.WATERS_VINE,
                ModItems.WATERS_SUGAR_CANE,
                ModItems.WATERS_ACACIA_LEAVES,
                ModItems.WATERS_ACACIA_LEAVES_CARPET,
                ModItems.WATERS_DARK_OAK_LEAVES,
                ModItems.WATERS_DARK_OAK_LEAVES_CARPET,
                ModItems.WATERS_JUNGLE_LEAVES,
                ModItems.WATERS_JUNGLE_LEAVES_CARPET,
                ModItems.WATERS_OAK_LEAVES,
                ModItems.WATERS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_WATERS_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.WATERS_ITEM_COLOR,
                ModItems.WATERS_GRASS_BLOCK,
                ModItems.WATERS_GRASS_SLAB,
                ModItems.WATERS_GRASS,
                ModItems.TALL_WATERS_GRASS,
                ModItems.WATERS_FERN,
                ModItems.LARGE_WATERS_FERN,
                ModItems.WATERS_VINE,
                ModItems.WATERS_SUGAR_CANE,
                ModItems.WATERS_ACACIA_LEAVES,
                ModItems.WATERS_ACACIA_LEAVES_CARPET,
                ModItems.WATERS_DARK_OAK_LEAVES,
                ModItems.WATERS_DARK_OAK_LEAVES_CARPET,
                ModItems.WATERS_JUNGLE_LEAVES,
                ModItems.WATERS_JUNGLE_LEAVES_CARPET,
                ModItems.WATERS_OAK_LEAVES,
                ModItems.WATERS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_WATERS_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.MEGA_TAIGA_ITEM_COLOR,
                ModItems.MEGA_TAIGA_GRASS_BLOCK,
                ModItems.MEGA_TAIGA_GRASS_SLAB,
                ModItems.MEGA_TAIGA_GRASS,
                ModItems.TALL_MEGA_TAIGA_GRASS,
                ModItems.MEGA_TAIGA_FERN,
                ModItems.LARGE_MEGA_TAIGA_FERN,
                ModItems.MEGA_TAIGA_VINE,
                ModItems.MEGA_TAIGA_SUGAR_CANE,
                ModItems.MEGA_TAIGA_ACACIA_LEAVES,
                ModItems.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ModItems.MEGA_TAIGA_DARK_OAK_LEAVES,
                ModItems.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ModItems.MEGA_TAIGA_JUNGLE_LEAVES,
                ModItems.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ModItems.MEGA_TAIGA_OAK_LEAVES,
                ModItems.MEGA_TAIGA_OAK_LEAVES_CARPET,
                ModItems.GLOWING_MEGA_TAIGA_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.TAIGA_ITEM_COLOR,
                ModItems.TAIGA_GRASS_BLOCK,
                ModItems.TAIGA_GRASS_SLAB,
                ModItems.TAIGA_GRASS,
                ModItems.TALL_TAIGA_GRASS,
                ModItems.TAIGA_FERN,
                ModItems.LARGE_TAIGA_FERN,
                ModItems.TAIGA_VINE,
                ModItems.TAIGA_SUGAR_CANE,
                ModItems.TAIGA_ACACIA_LEAVES,
                ModItems.TAIGA_ACACIA_LEAVES_CARPET,
                ModItems.TAIGA_DARK_OAK_LEAVES,
                ModItems.TAIGA_DARK_OAK_LEAVES_CARPET,
                ModItems.TAIGA_JUNGLE_LEAVES,
                ModItems.TAIGA_JUNGLE_LEAVES_CARPET,
                ModItems.TAIGA_OAK_LEAVES,
                ModItems.TAIGA_OAK_LEAVES_CARPET,
                ModItems.GLOWING_TAIGA_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.MOUNTAINS_ITEM_COLOR,
                ModItems.MOUNTAINS_GRASS_BLOCK,
                ModItems.MOUNTAINS_GRASS_SLAB,
                ModItems.MOUNTAINS_GRASS,
                ModItems.TALL_MOUNTAINS_GRASS,
                ModItems.MOUNTAINS_FERN,
                ModItems.LARGE_MOUNTAINS_FERN,
                ModItems.MOUNTAINS_VINE,
                ModItems.MOUNTAINS_SUGAR_CANE,
                ModItems.MOUNTAINS_ACACIA_LEAVES,
                ModItems.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ModItems.MOUNTAINS_DARK_OAK_LEAVES,
                ModItems.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ModItems.MOUNTAINS_JUNGLE_LEAVES,
                ModItems.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ModItems.MOUNTAINS_OAK_LEAVES,
                ModItems.MOUNTAINS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_MOUNTAINS_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.SNOWY_ITEM_COLOR,
                ModItems.SNOWY_GRASS_BLOCK,
                ModItems.SNOWY_GRASS_SLAB,
                ModItems.SNOWY_GRASS,
                ModItems.TALL_SNOWY_GRASS,
                ModItems.SNOWY_FERN,
                ModItems.LARGE_SNOWY_FERN,
                ModItems.SNOWY_VINE,
                ModItems.SNOWY_SUGAR_CANE,
                ModItems.SNOWY_ACACIA_LEAVES,
                ModItems.SNOWY_ACACIA_LEAVES_CARPET,
                ModItems.SNOWY_DARK_OAK_LEAVES,
                ModItems.SNOWY_DARK_OAK_LEAVES_CARPET,
                ModItems.SNOWY_JUNGLE_LEAVES,
                ModItems.SNOWY_JUNGLE_LEAVES_CARPET,
                ModItems.SNOWY_OAK_LEAVES,
                ModItems.SNOWY_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SNOWY_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.SNOWY_BEACH_ITEM_COLOR,
                ModItems.SNOWY_BEACH_GRASS_BLOCK,
                ModItems.SNOWY_BEACH_GRASS_SLAB,
                ModItems.SNOWY_BEACH_GRASS,
                ModItems.TALL_SNOWY_BEACH_GRASS,
                ModItems.SNOWY_BEACH_FERN,
                ModItems.LARGE_SNOWY_BEACH_FERN,
                ModItems.SNOWY_BEACH_VINE,
                ModItems.SNOWY_BEACH_SUGAR_CANE,
                ModItems.SNOWY_BEACH_ACACIA_LEAVES,
                ModItems.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ModItems.SNOWY_BEACH_DARK_OAK_LEAVES,
                ModItems.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ModItems.SNOWY_BEACH_JUNGLE_LEAVES,
                ModItems.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ModItems.SNOWY_BEACH_OAK_LEAVES,
                ModItems.SNOWY_BEACH_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SNOWY_BEACH_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.DARK_FOREST_ITEM_COLOR,
                ModItems.DARK_FOREST_GRASS_BLOCK,
                ModItems.DARK_FOREST_GRASS_SLAB,
                ModItems.DARK_FOREST_GRASS,
                ModItems.TALL_DARK_FOREST_GRASS,
                ModItems.DARK_FOREST_FERN,
                ModItems.LARGE_DARK_FOREST_FERN,
                ModItems.DARK_FOREST_VINE,
                ModItems.DARK_FOREST_SUGAR_CANE,
                ModItems.DARK_FOREST_ACACIA_LEAVES,
                ModItems.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ModItems.DARK_FOREST_DARK_OAK_LEAVES,
                ModItems.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ModItems.DARK_FOREST_JUNGLE_LEAVES,
                ModItems.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ModItems.DARK_FOREST_OAK_LEAVES,
                ModItems.DARK_FOREST_OAK_LEAVES_CARPET,
                ModItems.GLOWING_DARK_FOREST_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.LUSH_SWAMP_ITEM_COLOR,
                ModItems.LUSH_SWAMP_GRASS_BLOCK,
                ModItems.LUSH_SWAMP_GRASS_SLAB,
                ModItems.LUSH_SWAMP_GRASS,
                ModItems.TALL_LUSH_SWAMP_GRASS,
                ModItems.LUSH_SWAMP_FERN,
                ModItems.LARGE_LUSH_SWAMP_FERN,
                ModItems.LUSH_SWAMP_VINE,
                ModItems.LUSH_SWAMP_SUGAR_CANE,
                ModItems.LUSH_SWAMP_ACACIA_LEAVES,
                ModItems.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ModItems.LUSH_SWAMP_DARK_OAK_LEAVES,
                ModItems.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ModItems.LUSH_SWAMP_JUNGLE_LEAVES,
                ModItems.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ModItems.LUSH_SWAMP_OAK_LEAVES,
                ModItems.LUSH_SWAMP_OAK_LEAVES_CARPET,
                ModItems.GLOWING_LUSH_SWAMP_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.SWAMP_ITEM_COLOR,
                ModItems.SWAMP_GRASS_BLOCK,
                ModItems.SWAMP_GRASS_SLAB,
                ModItems.SWAMP_GRASS,
                ModItems.TALL_SWAMP_GRASS,
                ModItems.SWAMP_FERN,
                ModItems.LARGE_SWAMP_FERN,
                ModItems.SWAMP_VINE,
                ModItems.SWAMP_SUGAR_CANE,
                ModItems.SWAMP_ACACIA_LEAVES,
                ModItems.SWAMP_ACACIA_LEAVES_CARPET,
                ModItems.SWAMP_DARK_OAK_LEAVES,
                ModItems.SWAMP_DARK_OAK_LEAVES_CARPET,
                ModItems.SWAMP_JUNGLE_LEAVES,
                ModItems.SWAMP_JUNGLE_LEAVES_CARPET,
                ModItems.SWAMP_OAK_LEAVES,
                ModItems.SWAMP_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SWAMP_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.SAVANNA_ITEM_COLOR,
                ModItems.SAVANNA_GRASS_BLOCK,
                ModItems.SAVANNA_GRASS_SLAB,
                ModItems.SAVANNA_GRASS,
                ModItems.TALL_SAVANNA_GRASS,
                ModItems.SAVANNA_FERN,
                ModItems.LARGE_SAVANNA_FERN,
                ModItems.SAVANNA_VINE,
                ModItems.SAVANNA_SUGAR_CANE,
                ModItems.SAVANNA_ACACIA_LEAVES,
                ModItems.SAVANNA_ACACIA_LEAVES_CARPET,
                ModItems.SAVANNA_DARK_OAK_LEAVES,
                ModItems.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ModItems.SAVANNA_JUNGLE_LEAVES,
                ModItems.SAVANNA_JUNGLE_LEAVES_CARPET,
                ModItems.SAVANNA_OAK_LEAVES,
                ModItems.SAVANNA_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SAVANNA_GRASS_BLOCK
        );

        registerItemColor(ColorProvider.BADLANDS_ITEM_COLOR,
                ModItems.BADLANDS_GRASS_BLOCK,
                ModItems.BADLANDS_GRASS_SLAB,
                ModItems.BADLANDS_GRASS,
                ModItems.TALL_BADLANDS_GRASS,
                ModItems.BADLANDS_FERN,
                ModItems.LARGE_BADLANDS_FERN,
                ModItems.BADLANDS_VINE,
                ModItems.BADLANDS_SUGAR_CANE,
                ModItems.BADLANDS_ACACIA_LEAVES,
                ModItems.BADLANDS_ACACIA_LEAVES_CARPET,
                ModItems.BADLANDS_DARK_OAK_LEAVES,
                ModItems.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ModItems.BADLANDS_JUNGLE_LEAVES,
                ModItems.BADLANDS_JUNGLE_LEAVES_CARPET,
                ModItems.BADLANDS_OAK_LEAVES,
                ModItems.BADLANDS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_BADLANDS_GRASS_BLOCK
        );

        // spruce and birch color
        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                return world != null && pos != null ? FoliageColors.getSpruceColor() : FoliageColors.getColor(0.5D, 1.0D);
            }
        }, ModBlocks.SPRUCE_LEAVES_CARPET);

        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                return world != null && pos != null ? FoliageColors.getBirchColor() : FoliageColors.getColor(0.5D, 1.0D);
            }
        }, ModBlocks.BIRCH_LEAVES_CARPET);

        ColorProviderRegistry.ITEM.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return FoliageColors.getSpruceColor();
            }
        }, ModBlocks.SPRUCE_LEAVES_CARPET);

        ColorProviderRegistry.ITEM.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return FoliageColors.getBirchColor();
            }
        }, ModBlocks.BIRCH_LEAVES_CARPET);

        // vanilla grass slab and vanilla grass block
        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                if(tintIndex == 1) return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5D, 1.0D);

                return -1;
            }
        }, ModBlocks.GRASS_SLAB);
        ColorProviderRegistry.ITEM.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.getColor(0.5D, 1.0D);
            }
        }, ModBlocks.GRASS_SLAB);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASS_SLAB, GRASS_BLOCK_LAYER);


        // blender blocks ability to change color
        // blender blocks particle color based on blender block color
        BaseBakedModel blenderGrassBlockBakedModel = new BlenderGrassBlockBakedModel();
        BaseBakedModel blenderOakLeavesBakedModel = new BlenderOakLeavesBakedModel();
        BaseBakedModel blenderDarkOakLeavesBakedModel = new BlenderDarkOakLeavesBakedModel();
        BaseBakedModel blenderJungleLeavesBakedModel = new BlenderJungleLeavesBakedModel();
        BaseBakedModel blenderAcaciaLeavesBakedModel = new BlenderAcaciaLeavesBakedModel();

        BlockRenderLayerMap.INSTANCE.putBlocks(LEAVE_BLOCK_LAYER,
                ModBlocks.ALPHA_LEAVES,
                ModBlocks.BLENDER_OAK_LEAVES_BLOCK,
                ModBlocks.BLENDER_DARK_OAK_LEAVES_BLOCK,
                ModBlocks.BLENDER_JUNGLE_LEAVES_BLOCK,
                ModBlocks.BLENDER_ACACIA_LEAVES_BLOCK,
                ModBlocks.SPRUCE_LEAVES_CARPET,
                ModBlocks.BIRCH_LEAVES_CARPET);

        ModelLoadingRegistry.INSTANCE.registerVariantProvider((res) -> (modelId, ctx) -> {
            if (modelId.getNamespace().equals("arfo") && modelId.getPath().equals("blender_grass_block")) {
                return blenderGrassBlockBakedModel;
            } else if (modelId.getNamespace().equals("arfo") && modelId.getPath().equals("blender_oak_leaves_block")) {
                return blenderOakLeavesBakedModel;
            } else if (modelId.getNamespace().equals("arfo") && modelId.getPath().equals("blender_dark_oak_leaves_block")) {
                return blenderDarkOakLeavesBakedModel;
            } else if (modelId.getNamespace().equals("arfo") && modelId.getPath().equals("blender_jungle_leaves_block")) {
                return blenderJungleLeavesBakedModel;
            } else if (modelId.getNamespace().equals("arfo") && modelId.getPath().equals("blender_acacia_leaves_block")) {
                return blenderAcaciaLeavesBakedModel;
            }
            return null;
        });

        // particle coloring
        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                if (state.getBlock() instanceof IBlenderBlock && world != null) {
                    BlockEntity blockEntity = world.getBlockEntity(pos);
                    if (blockEntity instanceof BlenderBlockEntity) {
                        return ((BlenderBlockEntity) blockEntity).getColor();
                    } else {
                        blockEntity = world.getBlockEntity(MinecraftClient.getInstance().player.getBlockPos().down());
                        if (blockEntity instanceof BlenderBlockEntity) {
                            return ((BlenderBlockEntity) blockEntity).getColor();
                        }
                    }
                }
                return 0;
            }
        }, ModBlocks.BLENDER_GRASS_BLOCK,
                ModBlocks.BLENDER_OAK_LEAVES_BLOCK,
                ModBlocks.BLENDER_DARK_OAK_LEAVES_BLOCK,
                ModBlocks.BLENDER_JUNGLE_LEAVES_BLOCK,
                ModBlocks.BLENDER_ACACIA_LEAVES_BLOCK);
    }


}
