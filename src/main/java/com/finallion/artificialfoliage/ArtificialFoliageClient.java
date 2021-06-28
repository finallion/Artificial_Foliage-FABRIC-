package com.finallion.artificialfoliage;


import com.finallion.artificialfoliage.compatibilty.BOP.BOPColorProvider;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGColorProvider;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGItems;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseColorProvider;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import com.finallion.artificialfoliage.registry.ARFOItems;
import com.finallion.artificialfoliage.utils.ColorProvider;
import com.finallion.artificialfoliage.utils.ColorUtils;
import com.finallion.artificialfoliage.utils.FluidUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;


@Environment(EnvType.CLIENT)
public class ArtificialFoliageClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // mod compat client side = renders and colors
        TraverseColorProvider.init();
        BYGColorProvider.init();
        BOPColorProvider.init();

        FluidUtils.registerFluidColor(4020182, ARFOFluids.STILL_COLD_OCEAN_WATER, ARFOFluids.FLOWING_COLD_OCEAN_WATER);
        FluidUtils.registerFluidColor(3750089, ARFOFluids.STILL_FROZEN_OCEAN_WATER, ARFOFluids.FLOWING_FROZEN_OCEAN_WATER);
        FluidUtils.registerFluidColor(4566514, ARFOFluids.STILL_LUKEWARM_OCEAN_WATER, ARFOFluids.FLOWING_LUKEWARM_OCEAN_WATER);
        FluidUtils.registerFluidColor(4445678, ARFOFluids.STILL_WARM_OCEAN_WATER, ARFOFluids.FLOWING_WARM_OCEAN_WATER);
        FluidUtils.registerFluidColor(6388580, ARFOFluids.STILL_SWAMP_WATER, ARFOFluids.FLOWING_SWAMP_WATER);
        FluidUtils.registerFluidColor(4159204, ARFOFluids.STILL_OCEAN_WATER, ARFOFluids.FLOWING_OCEAN_WATER);

        BlockRenderLayerMap.INSTANCE.putBlock(ARFOBlocks.ARTIFICIAL_CORAL_SAPLING, ColorUtils.PLANT_BLOCK_LAYER);
        BlockRenderLayerMap.INSTANCE.putBlock(ARFOBlocks.GLOW_BERRY_BUSH, ColorUtils.PLANT_BLOCK_LAYER);
        BlockRenderLayerMap.INSTANCE.putBlock(ARFOBlocks.POTTED_GLOW_BERRY_BUSH, ColorUtils.PLANT_BLOCK_LAYER);
        BlockRenderLayerMap.INSTANCE.putBlock(ARFOBlocks.GLOW_BERRY_LEAVES_CARPET, ColorUtils.LEAVE_BLOCK_LAYER);
        BlockRenderLayerMap.INSTANCE.putBlock(ARFOBlocks.GLOW_BERRY_LEAVES, ColorUtils.LEAVE_BLOCK_LAYER);


        // blocks
        ColorUtils.registerGrassBlockColor(ColorProvider.MUSHROOM_FIELDS_COLOR,
                ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK,
                ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB,
                ARFOBlocks.MUSHROOM_FIELDS_GRASS,
                ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS,
                ARFOBlocks.MUSHROOM_FIELDS_FERN,
                ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN,
                ARFOBlocks.MUSHROOM_FIELDS_SUGAR_CANE,
                ARFOBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK,
                ARFOBlocks.POTTED_MUSHROOM_FIELDS_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.MUSHROOM_FIELDS_LEAVE_COLOR,
                ARFOBlocks.MUSHROOM_FIELDS_VINE,
                ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.JUNGLE_COLOR,
                ARFOBlocks.JUNGLE_GRASS_BLOCK,
                ARFOBlocks.JUNGLE_GRASS_SLAB,
                ARFOBlocks.JUNGLE_GRASS,
                ARFOBlocks.TALL_JUNGLE_GRASS,
                ARFOBlocks.JUNGLE_FERN,
                ARFOBlocks.LARGE_JUNGLE_FERN,
                ARFOBlocks.JUNGLE_SUGAR_CANE,
                ARFOBlocks.GLOWING_JUNGLE_GRASS_BLOCK,
                ARFOBlocks.POTTED_JUNGLE_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.JUNGLE_LEAVE_COLOR,
                ARFOBlocks.JUNGLE_VINE,
                ARFOBlocks.TROPICAL_ACACIA_LEAVES,
                ARFOBlocks.TROPICAL_ACACIA_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_DARK_OAK_LEAVES,
                ARFOBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_JUNGLE_LEAVES,
                ARFOBlocks.TROPICAL_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_OAK_LEAVES,
                ARFOBlocks.TROPICAL_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.JUNGLE_EDGE_COLOR,
                ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK,
                ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB,
                ARFOBlocks.JUNGLE_EDGE_GRASS,
                ARFOBlocks.TALL_JUNGLE_EDGE_GRASS,
                ARFOBlocks.JUNGLE_EDGE_FERN,
                ARFOBlocks.LARGE_JUNGLE_EDGE_FERN,
                ARFOBlocks.JUNGLE_EDGE_SUGAR_CANE,
                ARFOBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK,
                ARFOBlocks.POTTED_JUNGLE_EDGE_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.JUNGLE_EDGE_LEAVE_COLOR,
                ARFOBlocks.JUNGLE_EDGE_VINE,
                ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.PLAINS_COLOR,
                ARFOBlocks.PLAINS_GRASS_BLOCK,
                ARFOBlocks.PLAINS_GRASS_SLAB,
                ARFOBlocks.PLAINS_GRASS,
                ARFOBlocks.TALL_PLAINS_GRASS,
                ARFOBlocks.PLAINS_FERN,
                ARFOBlocks.LARGE_PLAINS_FERN,
                ARFOBlocks.PLAINS_SUGAR_CANE,
                ARFOBlocks.GLOWING_PLAINS_GRASS_BLOCK,
                ARFOBlocks.POTTED_PLAINS_FERN
        );


        ColorUtils.registerLeaveBlockColor(ColorProvider.PLAINS_LEAVE_COLOR,
                ARFOBlocks.PLAINS_VINE,
                ARFOBlocks.PLAINS_ACACIA_LEAVES,
                ARFOBlocks.PLAINS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.PLAINS_DARK_OAK_LEAVES,
                ARFOBlocks.PLAINS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.PLAINS_JUNGLE_LEAVES,
                ARFOBlocks.PLAINS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.PLAINS_OAK_LEAVES,
                ARFOBlocks.PLAINS_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.FOREST_COLOR,
                ARFOBlocks.FOREST_GRASS_BLOCK,
                ARFOBlocks.FOREST_GRASS_SLAB,
                ARFOBlocks.FOREST_GRASS,
                ARFOBlocks.TALL_FOREST_GRASS,
                ARFOBlocks.FOREST_FERN,
                ARFOBlocks.LARGE_FOREST_FERN,
                ARFOBlocks.FOREST_SUGAR_CANE,
                ARFOBlocks.GLOWING_FOREST_GRASS_BLOCK,
                ARFOBlocks.POTTED_FOREST_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.FOREST_LEAVE_COLOR,
                ARFOBlocks.FOREST_VINE,
                ARFOBlocks.FOREST_ACACIA_LEAVES,
                ARFOBlocks.FOREST_ACACIA_LEAVES_CARPET,
                ARFOBlocks.FOREST_DARK_OAK_LEAVES,
                ARFOBlocks.FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.FOREST_JUNGLE_LEAVES,
                ARFOBlocks.FOREST_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.FOREST_OAK_LEAVES,
                ARFOBlocks.FOREST_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.BIRCH_FOREST_COLOR,
                ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK,
                ARFOBlocks.BIRCH_FOREST_GRASS_SLAB,
                ARFOBlocks.BIRCH_FOREST_GRASS,
                ARFOBlocks.TALL_BIRCH_FOREST_GRASS,
                ARFOBlocks.BIRCH_FOREST_FERN,
                ARFOBlocks.LARGE_BIRCH_FOREST_FERN,
                ARFOBlocks.BIRCH_FOREST_SUGAR_CANE,
                ARFOBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK,
                ARFOBlocks.POTTED_BIRCH_FOREST_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.BIRCH_FOREST_LEAVE_COLOR,
                ARFOBlocks.BIRCH_FOREST_VINE,
                ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES,
                ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES,
                ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES,
                ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.BIRCH_FOREST_OAK_LEAVES,
                ARFOBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.WATERS_COLOR,
                ARFOBlocks.WATERS_GRASS_BLOCK,
                ARFOBlocks.WATERS_GRASS_SLAB,
                ARFOBlocks.WATERS_GRASS,
                ARFOBlocks.TALL_WATERS_GRASS,
                ARFOBlocks.WATERS_FERN,
                ARFOBlocks.LARGE_WATERS_FERN,
                ARFOBlocks.WATERS_SUGAR_CANE,
                ARFOBlocks.GLOWING_WATERS_GRASS_BLOCK,
                ARFOBlocks.POTTED_WATERS_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.WATERS_LEAVE_COLOR,
                ARFOBlocks.WATERS_VINE,
                ARFOBlocks.WATERS_ACACIA_LEAVES,
                ARFOBlocks.WATERS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.WATERS_DARK_OAK_LEAVES,
                ARFOBlocks.WATERS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.WATERS_JUNGLE_LEAVES,
                ARFOBlocks.WATERS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.WATERS_OAK_LEAVES,
                ARFOBlocks.WATERS_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.MEGA_TAIGA_COLOR,
                ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK,
                ARFOBlocks.MEGA_TAIGA_GRASS_SLAB,
                ARFOBlocks.MEGA_TAIGA_GRASS,
                ARFOBlocks.TALL_MEGA_TAIGA_GRASS,
                ARFOBlocks.MEGA_TAIGA_FERN,
                ARFOBlocks.LARGE_MEGA_TAIGA_FERN,
                ARFOBlocks.MEGA_TAIGA_SUGAR_CANE,
                ARFOBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK,
                ARFOBlocks.POTTED_MEGA_TAIGA_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.MEGA_TAIGA_LEAVE_COLOR,
                ARFOBlocks.MEGA_TAIGA_VINE,
                ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES,
                ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES,
                ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES,
                ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.MEGA_TAIGA_OAK_LEAVES,
                ARFOBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET
        );


        ColorUtils.registerGrassBlockColor(ColorProvider.TAIGA_COLOR,
                ARFOBlocks.TAIGA_GRASS_BLOCK,
                ARFOBlocks.TAIGA_GRASS_SLAB,
                ARFOBlocks.TAIGA_GRASS,
                ARFOBlocks.TALL_TAIGA_GRASS,
                ARFOBlocks.TAIGA_FERN,
                ARFOBlocks.LARGE_TAIGA_FERN,
                ARFOBlocks.TAIGA_SUGAR_CANE,
                ARFOBlocks.GLOWING_TAIGA_GRASS_BLOCK,
                ARFOBlocks.POTTED_TAIGA_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.TAIGA_LEAVE_COLOR,
                ARFOBlocks.TAIGA_VINE,
                ARFOBlocks.TAIGA_ACACIA_LEAVES,
                ARFOBlocks.TAIGA_ACACIA_LEAVES_CARPET,
                ARFOBlocks.TAIGA_DARK_OAK_LEAVES,
                ARFOBlocks.TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.TAIGA_JUNGLE_LEAVES,
                ARFOBlocks.TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.TAIGA_OAK_LEAVES,
                ARFOBlocks.TAIGA_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.MOUNTAINS_COLOR,
                ARFOBlocks.MOUNTAINS_GRASS_BLOCK,
                ARFOBlocks.MOUNTAINS_GRASS_SLAB,
                ARFOBlocks.MOUNTAINS_GRASS,
                ARFOBlocks.TALL_MOUNTAINS_GRASS,
                ARFOBlocks.MOUNTAINS_FERN,
                ARFOBlocks.LARGE_MOUNTAINS_FERN,
                ARFOBlocks.MOUNTAINS_SUGAR_CANE,
                ARFOBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK,
                ARFOBlocks.POTTED_MOUNTAINS_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.MOUNTAINS_LEAVE_COLOR,
                ARFOBlocks.MOUNTAINS_VINE,
                ARFOBlocks.MOUNTAINS_ACACIA_LEAVES,
                ARFOBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES,
                ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES,
                ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.MOUNTAINS_OAK_LEAVES,
                ARFOBlocks.MOUNTAINS_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.SNOWY_COLOR,
                ARFOBlocks.SNOWY_GRASS_BLOCK,
                ARFOBlocks.SNOWY_GRASS_SLAB,
                ARFOBlocks.SNOWY_GRASS,
                ARFOBlocks.TALL_SNOWY_GRASS,
                ARFOBlocks.SNOWY_FERN,
                ARFOBlocks.LARGE_SNOWY_FERN,
                ARFOBlocks.SNOWY_SUGAR_CANE,
                ARFOBlocks.GLOWING_SNOWY_GRASS_BLOCK,
                ARFOBlocks.POTTED_SNOWY_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.SNOWY_LEAVE_COLOR,
                ARFOBlocks.SNOWY_VINE,
                ARFOBlocks.SNOWY_ACACIA_LEAVES,
                ARFOBlocks.SNOWY_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SNOWY_DARK_OAK_LEAVES,
                ARFOBlocks.SNOWY_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SNOWY_JUNGLE_LEAVES,
                ARFOBlocks.SNOWY_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SNOWY_OAK_LEAVES,
                ARFOBlocks.SNOWY_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.SNOWY_BEACH_COLOR,
                ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK,
                ARFOBlocks.SNOWY_BEACH_GRASS_SLAB,
                ARFOBlocks.SNOWY_BEACH_GRASS,
                ARFOBlocks.TALL_SNOWY_BEACH_GRASS,
                ARFOBlocks.SNOWY_BEACH_FERN,
                ARFOBlocks.LARGE_SNOWY_BEACH_FERN,
                ARFOBlocks.SNOWY_BEACH_SUGAR_CANE,
                ARFOBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK,
                ARFOBlocks.POTTED_SNOWY_BEACH_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.SNOWY_BEACH_LEAVE_COLOR,
                ARFOBlocks.SNOWY_BEACH_VINE,
                ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES,
                ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES,
                ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES,
                ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SNOWY_BEACH_OAK_LEAVES,
                ARFOBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.DARK_FOREST_COLOR,
                ARFOBlocks.DARK_FOREST_GRASS_BLOCK,
                ARFOBlocks.DARK_FOREST_GRASS_SLAB,
                ARFOBlocks.DARK_FOREST_GRASS,
                ARFOBlocks.TALL_DARK_FOREST_GRASS,
                ARFOBlocks.DARK_FOREST_FERN,
                ARFOBlocks.LARGE_DARK_FOREST_FERN,
                ARFOBlocks.DARK_FOREST_SUGAR_CANE,
                ARFOBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK,
                ARFOBlocks.POTTED_DARK_FOREST_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.DARK_FOREST_LEAVE_COLOR,
                ARFOBlocks.DARK_FOREST_VINE,
                ARFOBlocks.DARK_FOREST_ACACIA_LEAVES,
                ARFOBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES,
                ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES,
                ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.DARK_FOREST_OAK_LEAVES,
                ARFOBlocks.DARK_FOREST_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.LUSH_SWAMP_COLOR,
                ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK,
                ARFOBlocks.LUSH_SWAMP_GRASS_SLAB,
                ARFOBlocks.LUSH_SWAMP_GRASS,
                ARFOBlocks.TALL_LUSH_SWAMP_GRASS,
                ARFOBlocks.LUSH_SWAMP_FERN,
                ARFOBlocks.LARGE_LUSH_SWAMP_FERN,
                ARFOBlocks.LUSH_SWAMP_SUGAR_CANE,
                ARFOBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK,
                ARFOBlocks.POTTED_LUSH_SWAMP_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.LUSH_SWAMP_LEAVE_COLOR,
                ARFOBlocks.LUSH_SWAMP_VINE,
                ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES,
                ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES,
                ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES,
                ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.LUSH_SWAMP_OAK_LEAVES,
                ARFOBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.SWAMP_COLOR,
                ARFOBlocks.SWAMP_GRASS_BLOCK,
                ARFOBlocks.SWAMP_GRASS_SLAB,
                ARFOBlocks.SWAMP_GRASS,
                ARFOBlocks.TALL_SWAMP_GRASS,
                ARFOBlocks.SWAMP_FERN,
                ARFOBlocks.LARGE_SWAMP_FERN,
                ARFOBlocks.SWAMP_SUGAR_CANE,
                ARFOBlocks.GLOWING_SWAMP_GRASS_BLOCK,
                ARFOBlocks.POTTED_SWAMP_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.SWAMP_LEAVE_COLOR,
                ARFOBlocks.SWAMP_VINE,
                ARFOBlocks.SWAMP_ACACIA_LEAVES,
                ARFOBlocks.SWAMP_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SWAMP_DARK_OAK_LEAVES,
                ARFOBlocks.SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SWAMP_JUNGLE_LEAVES,
                ARFOBlocks.SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SWAMP_OAK_LEAVES,
                ARFOBlocks.SWAMP_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.SAVANNA_COLOR,
                ARFOBlocks.SAVANNA_GRASS_BLOCK,
                ARFOBlocks.SAVANNA_GRASS_SLAB,
                ARFOBlocks.SAVANNA_GRASS,
                ARFOBlocks.TALL_SAVANNA_GRASS,
                ARFOBlocks.SAVANNA_FERN,
                ARFOBlocks.LARGE_SAVANNA_FERN,
                ARFOBlocks.SAVANNA_SUGAR_CANE,
                ARFOBlocks.GLOWING_SAVANNA_GRASS_BLOCK,
                ARFOBlocks.POTTED_SAVANNA_FERN
        );
        ColorUtils.registerLeaveBlockColor(ColorProvider.SAVANNA_LEAVE_COLOR,
                ARFOBlocks.SAVANNA_VINE,
                ARFOBlocks.SAVANNA_ACACIA_LEAVES,
                ARFOBlocks.SAVANNA_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SAVANNA_DARK_OAK_LEAVES,
                ARFOBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SAVANNA_JUNGLE_LEAVES,
                ARFOBlocks.SAVANNA_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SAVANNA_OAK_LEAVES,
                ARFOBlocks.SAVANNA_OAK_LEAVES_CARPET
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.BADLANDS_COLOR,
                ARFOBlocks.BADLANDS_GRASS_BLOCK,
                ARFOBlocks.BADLANDS_GRASS_SLAB,
                ARFOBlocks.BADLANDS_GRASS,
                ARFOBlocks.TALL_BADLANDS_GRASS,
                ARFOBlocks.BADLANDS_FERN,
                ARFOBlocks.LARGE_BADLANDS_FERN,
                ARFOBlocks.BADLANDS_SUGAR_CANE,
                ARFOBlocks.GLOWING_BADLANDS_GRASS_BLOCK,
                ARFOBlocks.POTTED_BADLANDS_FERN
        );

        ColorUtils.registerLeaveBlockColor(ColorProvider.BADLANDS_LEAVE_COLOR,
                ARFOBlocks.BADLANDS_VINE,
                ARFOBlocks.BADLANDS_ACACIA_LEAVES,
                ARFOBlocks.BADLANDS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.BADLANDS_DARK_OAK_LEAVES,
                ARFOBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.BADLANDS_JUNGLE_LEAVES,
                ARFOBlocks.BADLANDS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.BADLANDS_OAK_LEAVES,
                ARFOBlocks.BADLANDS_OAK_LEAVES_CARPET
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(ColorUtils.PLANT_BLOCK_LAYER,
                ARFOBlocks.POTTED_MUSHROOM_FIELDS_FERN,
                ARFOBlocks.POTTED_JUNGLE_FERN,
                ARFOBlocks.POTTED_JUNGLE_EDGE_FERN,
                ARFOBlocks.POTTED_FOREST_FERN,
                ARFOBlocks.POTTED_BIRCH_FOREST_FERN,
                ARFOBlocks.POTTED_DARK_FOREST_FERN,
                ARFOBlocks.POTTED_PLAINS_FERN,
                ARFOBlocks.POTTED_SWAMP_FERN,
                ARFOBlocks.POTTED_LUSH_SWAMP_FERN,
                ARFOBlocks.POTTED_MOUNTAINS_FERN,
                ARFOBlocks.POTTED_SNOWY_FERN,
                ARFOBlocks.POTTED_SNOWY_BEACH_FERN,
                ARFOBlocks.POTTED_WATERS_FERN,
                ARFOBlocks.POTTED_TAIGA_FERN,
                ARFOBlocks.POTTED_MEGA_TAIGA_FERN
        );

        ColorUtils.registerGrassBlockColor(ColorProvider.JUNGLE_COLOR, ARFOBlocks.JUNGLE_OVERGROWN_STONE, ARFOBlocks.JUNGLE_OVERGROWN_STONE_SLAB, ARFOBlocks.JUNGLE_OVERGROWN_DACITE, ARFOBlocks.JUNGLE_OVERGROWN_DACITE_SLAB, ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK, ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.JUNGLE_EDGE_COLOR, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE_SLAB, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE_SLAB, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.BADLANDS_COLOR, ARFOBlocks.BADLANDS_OVERGROWN_STONE, ARFOBlocks.BADLANDS_OVERGROWN_STONE_SLAB, ARFOBlocks.BADLANDS_OVERGROWN_DACITE, ARFOBlocks.BADLANDS_OVERGROWN_DACITE_SLAB, ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK, ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.SAVANNA_COLOR, ARFOBlocks.SAVANNA_OVERGROWN_STONE, ARFOBlocks.SAVANNA_OVERGROWN_STONE_SLAB, ARFOBlocks.SAVANNA_OVERGROWN_DACITE, ARFOBlocks.SAVANNA_OVERGROWN_DACITE_SLAB, ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK, ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.FOREST_COLOR, ARFOBlocks.FOREST_OVERGROWN_STONE, ARFOBlocks.FOREST_OVERGROWN_STONE_SLAB, ARFOBlocks.FOREST_OVERGROWN_DACITE, ARFOBlocks.FOREST_OVERGROWN_DACITE_SLAB, ARFOBlocks.FOREST_OVERGROWN_NETHERRACK, ARFOBlocks.FOREST_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.BIRCH_FOREST_COLOR, ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE, ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE_SLAB, ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE, ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE_SLAB, ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK, ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.DARK_FOREST_COLOR, ARFOBlocks.DARK_FOREST_OVERGROWN_STONE, ARFOBlocks.DARK_FOREST_OVERGROWN_STONE_SLAB, ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE, ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE_SLAB, ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK, ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.PLAINS_COLOR, ARFOBlocks.PLAINS_OVERGROWN_STONE, ARFOBlocks.PLAINS_OVERGROWN_STONE_SLAB, ARFOBlocks.PLAINS_OVERGROWN_DACITE, ARFOBlocks.PLAINS_OVERGROWN_DACITE_SLAB, ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK, ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.SWAMP_COLOR, ARFOBlocks.SWAMP_OVERGROWN_STONE, ARFOBlocks.SWAMP_OVERGROWN_STONE_SLAB, ARFOBlocks.SWAMP_OVERGROWN_DACITE, ARFOBlocks.SWAMP_OVERGROWN_DACITE_SLAB, ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK, ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.LUSH_SWAMP_COLOR, ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE, ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE_SLAB, ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE, ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE_SLAB, ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK, ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.MOUNTAINS_COLOR, ARFOBlocks.MOUNTAINS_OVERGROWN_STONE, ARFOBlocks.MOUNTAINS_OVERGROWN_STONE_SLAB, ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE, ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE_SLAB, ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK, ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.MUSHROOM_FIELDS_COLOR, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE_SLAB, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE_SLAB, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.TAIGA_COLOR, ARFOBlocks.TAIGA_OVERGROWN_STONE, ARFOBlocks.TAIGA_OVERGROWN_STONE_SLAB, ARFOBlocks.TAIGA_OVERGROWN_DACITE, ARFOBlocks.TAIGA_OVERGROWN_DACITE_SLAB, ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK, ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.MEGA_TAIGA_COLOR, ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE, ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE_SLAB, ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE, ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE_SLAB, ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK, ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.SNOWY_COLOR, ARFOBlocks.SNOWY_OVERGROWN_STONE, ARFOBlocks.SNOWY_OVERGROWN_STONE_SLAB, ARFOBlocks.SNOWY_OVERGROWN_DACITE, ARFOBlocks.SNOWY_OVERGROWN_DACITE_SLAB, ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK, ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.SNOWY_BEACH_COLOR, ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE, ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE_SLAB, ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE, ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE_SLAB, ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK, ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerGrassBlockColor(ColorProvider.WATERS_COLOR, ARFOBlocks.WATERS_OVERGROWN_STONE, ARFOBlocks.WATERS_OVERGROWN_STONE_SLAB, ARFOBlocks.WATERS_OVERGROWN_DACITE, ARFOBlocks.WATERS_OVERGROWN_DACITE_SLAB, ARFOBlocks.WATERS_OVERGROWN_NETHERRACK, ARFOBlocks.WATERS_OVERGROWN_NETHERRACK_SLAB);



        // block items
        ColorUtils.registerItemColor(ColorProvider.MUSHROOM_FIELDS_ITEM_COLOR,
                ARFOItems.MUSHROOM_FIELDS_GRASS_BLOCK,
                ARFOItems.MUSHROOM_FIELDS_GRASS_SLAB,
                ARFOItems.MUSHROOM_FIELDS_GRASS,
                ARFOItems.TALL_MUSHROOM_FIELDS_GRASS,
                ARFOItems.MUSHROOM_FIELDS_FERN,
                ARFOItems.LARGE_MUSHROOM_FIELDS_FERN,
                ARFOItems.MUSHROOM_FIELDS_VINE,
                ARFOItems.MUSHROOM_FIELDS_SUGAR_CANE,
                ARFOItems.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ARFOItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ARFOItems.MUSHROOM_FIELDS_OAK_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.JUNGLE_ITEM_COLOR,
                ARFOItems.JUNGLE_GRASS_BLOCK,
                ARFOItems.JUNGLE_GRASS_SLAB,
                ARFOItems.JUNGLE_GRASS,
                ARFOItems.TALL_JUNGLE_GRASS,
                ARFOItems.JUNGLE_FERN,
                ARFOItems.LARGE_JUNGLE_FERN,
                ARFOItems.JUNGLE_VINE,
                ARFOItems.JUNGLE_SUGAR_CANE,
                ARFOItems.TROPICAL_ACACIA_LEAVES,
                ARFOItems.TROPICAL_ACACIA_LEAVES_CARPET,
                ARFOItems.TROPICAL_DARK_OAK_LEAVES,
                ARFOItems.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ARFOItems.TROPICAL_JUNGLE_LEAVES,
                ARFOItems.TROPICAL_JUNGLE_LEAVES_CARPET,
                ARFOItems.TROPICAL_OAK_LEAVES,
                ARFOItems.TROPICAL_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_JUNGLE_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.JUNGLE_EDGE_ITEM_COLOR,
                ARFOItems.JUNGLE_EDGE_GRASS_BLOCK,
                ARFOItems.JUNGLE_EDGE_GRASS_SLAB,
                ARFOItems.JUNGLE_EDGE_GRASS,
                ARFOItems.TALL_JUNGLE_EDGE_GRASS,
                ARFOItems.JUNGLE_EDGE_FERN,
                ARFOItems.LARGE_JUNGLE_EDGE_FERN,
                ARFOItems.JUNGLE_EDGE_VINE,
                ARFOItems.JUNGLE_EDGE_SUGAR_CANE,
                ARFOItems.TROPICAL_EDGE_ACACIA_LEAVES,
                ARFOItems.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ARFOItems.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ARFOItems.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ARFOItems.TROPICAL_EDGE_JUNGLE_LEAVES,
                ARFOItems.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ARFOItems.TROPICAL_EDGE_OAK_LEAVES,
                ARFOItems.TROPICAL_EDGE_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_JUNGLE_EDGE_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.PLAINS_ITEM_COLOR,
                ARFOItems.PLAINS_GRASS_BLOCK,
                ARFOItems.PLAINS_GRASS_SLAB,
                ARFOItems.PLAINS_GRASS,
                ARFOItems.TALL_PLAINS_GRASS,
                ARFOItems.PLAINS_FERN,
                ARFOItems.LARGE_PLAINS_FERN,
                ARFOItems.PLAINS_VINE,
                ARFOItems.PLAINS_SUGAR_CANE,
                ARFOItems.PLAINS_ACACIA_LEAVES,
                ARFOItems.PLAINS_ACACIA_LEAVES_CARPET,
                ARFOItems.PLAINS_DARK_OAK_LEAVES,
                ARFOItems.PLAINS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.PLAINS_JUNGLE_LEAVES,
                ARFOItems.PLAINS_JUNGLE_LEAVES_CARPET,
                ARFOItems.PLAINS_OAK_LEAVES,
                ARFOItems.PLAINS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_PLAINS_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.FOREST_ITEM_COLOR,
                ARFOItems.FOREST_GRASS_BLOCK,
                ARFOItems.FOREST_GRASS_SLAB,
                ARFOItems.FOREST_GRASS,
                ARFOItems.TALL_FOREST_GRASS,
                ARFOItems.FOREST_FERN,
                ARFOItems.LARGE_FOREST_FERN,
                ARFOItems.FOREST_VINE,
                ARFOItems.FOREST_SUGAR_CANE,
                ARFOItems.FOREST_ACACIA_LEAVES,
                ARFOItems.FOREST_ACACIA_LEAVES_CARPET,
                ARFOItems.FOREST_DARK_OAK_LEAVES,
                ARFOItems.FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOItems.FOREST_JUNGLE_LEAVES,
                ARFOItems.FOREST_JUNGLE_LEAVES_CARPET,
                ARFOItems.FOREST_OAK_LEAVES,
                ARFOItems.FOREST_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_FOREST_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.BIRCH_FOREST_ITEM_COLOR,
                ARFOItems.BIRCH_FOREST_GRASS_BLOCK,
                ARFOItems.BIRCH_FOREST_GRASS_SLAB,
                ARFOItems.BIRCH_FOREST_GRASS,
                ARFOItems.TALL_BIRCH_FOREST_GRASS,
                ARFOItems.BIRCH_FOREST_FERN,
                ARFOItems.LARGE_BIRCH_FOREST_FERN,
                ARFOItems.BIRCH_FOREST_VINE,
                ARFOItems.BIRCH_FOREST_SUGAR_CANE,
                ARFOItems.BIRCH_FOREST_ACACIA_LEAVES,
                ARFOItems.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ARFOItems.BIRCH_FOREST_DARK_OAK_LEAVES,
                ARFOItems.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOItems.BIRCH_FOREST_JUNGLE_LEAVES,
                ARFOItems.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOItems.BIRCH_FOREST_OAK_LEAVES,
                ARFOItems.BIRCH_FOREST_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_BIRCH_FOREST_GRASS_BLOCK
        );


        ColorUtils.registerItemColor(ColorProvider.WATERS_ITEM_COLOR,
                ARFOItems.WATERS_GRASS_BLOCK,
                ARFOItems.WATERS_GRASS_SLAB,
                ARFOItems.WATERS_GRASS,
                ARFOItems.TALL_WATERS_GRASS,
                ARFOItems.WATERS_FERN,
                ARFOItems.LARGE_WATERS_FERN,
                ARFOItems.WATERS_VINE,
                ARFOItems.WATERS_SUGAR_CANE,
                ARFOItems.WATERS_ACACIA_LEAVES,
                ARFOItems.WATERS_ACACIA_LEAVES_CARPET,
                ARFOItems.WATERS_DARK_OAK_LEAVES,
                ARFOItems.WATERS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.WATERS_JUNGLE_LEAVES,
                ARFOItems.WATERS_JUNGLE_LEAVES_CARPET,
                ARFOItems.WATERS_OAK_LEAVES,
                ARFOItems.WATERS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_WATERS_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.MEGA_TAIGA_ITEM_COLOR,
                ARFOItems.MEGA_TAIGA_GRASS_BLOCK,
                ARFOItems.MEGA_TAIGA_GRASS_SLAB,
                ARFOItems.MEGA_TAIGA_GRASS,
                ARFOItems.TALL_MEGA_TAIGA_GRASS,
                ARFOItems.MEGA_TAIGA_FERN,
                ARFOItems.LARGE_MEGA_TAIGA_FERN,
                ARFOItems.MEGA_TAIGA_VINE,
                ARFOItems.MEGA_TAIGA_SUGAR_CANE,
                ARFOItems.MEGA_TAIGA_ACACIA_LEAVES,
                ARFOItems.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ARFOItems.MEGA_TAIGA_DARK_OAK_LEAVES,
                ARFOItems.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOItems.MEGA_TAIGA_JUNGLE_LEAVES,
                ARFOItems.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOItems.MEGA_TAIGA_OAK_LEAVES,
                ARFOItems.MEGA_TAIGA_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_MEGA_TAIGA_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.TAIGA_ITEM_COLOR,
                ARFOItems.TAIGA_GRASS_BLOCK,
                ARFOItems.TAIGA_GRASS_SLAB,
                ARFOItems.TAIGA_GRASS,
                ARFOItems.TALL_TAIGA_GRASS,
                ARFOItems.TAIGA_FERN,
                ARFOItems.LARGE_TAIGA_FERN,
                ARFOItems.TAIGA_VINE,
                ARFOItems.TAIGA_SUGAR_CANE,
                ARFOItems.TAIGA_ACACIA_LEAVES,
                ARFOItems.TAIGA_ACACIA_LEAVES_CARPET,
                ARFOItems.TAIGA_DARK_OAK_LEAVES,
                ARFOItems.TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOItems.TAIGA_JUNGLE_LEAVES,
                ARFOItems.TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOItems.TAIGA_OAK_LEAVES,
                ARFOItems.TAIGA_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_TAIGA_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.MOUNTAINS_ITEM_COLOR,
                ARFOItems.MOUNTAINS_GRASS_BLOCK,
                ARFOItems.MOUNTAINS_GRASS_SLAB,
                ARFOItems.MOUNTAINS_GRASS,
                ARFOItems.TALL_MOUNTAINS_GRASS,
                ARFOItems.MOUNTAINS_FERN,
                ARFOItems.LARGE_MOUNTAINS_FERN,
                ARFOItems.MOUNTAINS_VINE,
                ARFOItems.MOUNTAINS_SUGAR_CANE,
                ARFOItems.MOUNTAINS_ACACIA_LEAVES,
                ARFOItems.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ARFOItems.MOUNTAINS_DARK_OAK_LEAVES,
                ARFOItems.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.MOUNTAINS_JUNGLE_LEAVES,
                ARFOItems.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ARFOItems.MOUNTAINS_OAK_LEAVES,
                ARFOItems.MOUNTAINS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_MOUNTAINS_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.SNOWY_ITEM_COLOR,
                ARFOItems.SNOWY_GRASS_BLOCK,
                ARFOItems.SNOWY_GRASS_SLAB,
                ARFOItems.SNOWY_GRASS,
                ARFOItems.TALL_SNOWY_GRASS,
                ARFOItems.SNOWY_FERN,
                ARFOItems.LARGE_SNOWY_FERN,
                ARFOItems.SNOWY_VINE,
                ARFOItems.SNOWY_SUGAR_CANE,
                ARFOItems.SNOWY_ACACIA_LEAVES,
                ARFOItems.SNOWY_ACACIA_LEAVES_CARPET,
                ARFOItems.SNOWY_DARK_OAK_LEAVES,
                ARFOItems.SNOWY_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SNOWY_JUNGLE_LEAVES,
                ARFOItems.SNOWY_JUNGLE_LEAVES_CARPET,
                ARFOItems.SNOWY_OAK_LEAVES,
                ARFOItems.SNOWY_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SNOWY_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.SNOWY_BEACH_ITEM_COLOR,
                ARFOItems.SNOWY_BEACH_GRASS_BLOCK,
                ARFOItems.SNOWY_BEACH_GRASS_SLAB,
                ARFOItems.SNOWY_BEACH_GRASS,
                ARFOItems.TALL_SNOWY_BEACH_GRASS,
                ARFOItems.SNOWY_BEACH_FERN,
                ARFOItems.LARGE_SNOWY_BEACH_FERN,
                ARFOItems.SNOWY_BEACH_VINE,
                ARFOItems.SNOWY_BEACH_SUGAR_CANE,
                ARFOItems.SNOWY_BEACH_ACACIA_LEAVES,
                ARFOItems.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ARFOItems.SNOWY_BEACH_DARK_OAK_LEAVES,
                ARFOItems.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SNOWY_BEACH_JUNGLE_LEAVES,
                ARFOItems.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ARFOItems.SNOWY_BEACH_OAK_LEAVES,
                ARFOItems.SNOWY_BEACH_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SNOWY_BEACH_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.DARK_FOREST_ITEM_COLOR,
                ARFOItems.DARK_FOREST_GRASS_BLOCK,
                ARFOItems.DARK_FOREST_GRASS_SLAB,
                ARFOItems.DARK_FOREST_GRASS,
                ARFOItems.TALL_DARK_FOREST_GRASS,
                ARFOItems.DARK_FOREST_FERN,
                ARFOItems.LARGE_DARK_FOREST_FERN,
                ARFOItems.DARK_FOREST_VINE,
                ARFOItems.DARK_FOREST_SUGAR_CANE,
                ARFOItems.DARK_FOREST_ACACIA_LEAVES,
                ARFOItems.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ARFOItems.DARK_FOREST_DARK_OAK_LEAVES,
                ARFOItems.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOItems.DARK_FOREST_JUNGLE_LEAVES,
                ARFOItems.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOItems.DARK_FOREST_OAK_LEAVES,
                ARFOItems.DARK_FOREST_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_DARK_FOREST_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.LUSH_SWAMP_ITEM_COLOR,
                ARFOItems.LUSH_SWAMP_GRASS_BLOCK,
                ARFOItems.LUSH_SWAMP_GRASS_SLAB,
                ARFOItems.LUSH_SWAMP_GRASS,
                ARFOItems.TALL_LUSH_SWAMP_GRASS,
                ARFOItems.LUSH_SWAMP_FERN,
                ARFOItems.LARGE_LUSH_SWAMP_FERN,
                ARFOItems.LUSH_SWAMP_VINE,
                ARFOItems.LUSH_SWAMP_SUGAR_CANE,
                ARFOItems.LUSH_SWAMP_ACACIA_LEAVES,
                ARFOItems.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ARFOItems.LUSH_SWAMP_DARK_OAK_LEAVES,
                ARFOItems.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOItems.LUSH_SWAMP_JUNGLE_LEAVES,
                ARFOItems.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOItems.LUSH_SWAMP_OAK_LEAVES,
                ARFOItems.LUSH_SWAMP_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_LUSH_SWAMP_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.SWAMP_ITEM_COLOR,
                ARFOItems.SWAMP_GRASS_BLOCK,
                ARFOItems.SWAMP_GRASS_SLAB,
                ARFOItems.SWAMP_GRASS,
                ARFOItems.TALL_SWAMP_GRASS,
                ARFOItems.SWAMP_FERN,
                ARFOItems.LARGE_SWAMP_FERN,
                ARFOItems.SWAMP_VINE,
                ARFOItems.SWAMP_SUGAR_CANE,
                ARFOItems.SWAMP_ACACIA_LEAVES,
                ARFOItems.SWAMP_ACACIA_LEAVES_CARPET,
                ARFOItems.SWAMP_DARK_OAK_LEAVES,
                ARFOItems.SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SWAMP_JUNGLE_LEAVES,
                ARFOItems.SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOItems.SWAMP_OAK_LEAVES,
                ARFOItems.SWAMP_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SWAMP_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.SAVANNA_ITEM_COLOR,
                ARFOItems.SAVANNA_GRASS_BLOCK,
                ARFOItems.SAVANNA_GRASS_SLAB,
                ARFOItems.SAVANNA_GRASS,
                ARFOItems.TALL_SAVANNA_GRASS,
                ARFOItems.SAVANNA_FERN,
                ARFOItems.LARGE_SAVANNA_FERN,
                ARFOItems.SAVANNA_VINE,
                ARFOItems.SAVANNA_SUGAR_CANE,
                ARFOItems.SAVANNA_ACACIA_LEAVES,
                ARFOItems.SAVANNA_ACACIA_LEAVES_CARPET,
                ARFOItems.SAVANNA_DARK_OAK_LEAVES,
                ARFOItems.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SAVANNA_JUNGLE_LEAVES,
                ARFOItems.SAVANNA_JUNGLE_LEAVES_CARPET,
                ARFOItems.SAVANNA_OAK_LEAVES,
                ARFOItems.SAVANNA_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SAVANNA_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.BADLANDS_ITEM_COLOR,
                ARFOItems.BADLANDS_GRASS_BLOCK,
                ARFOItems.BADLANDS_GRASS_SLAB,
                ARFOItems.BADLANDS_GRASS,
                ARFOItems.TALL_BADLANDS_GRASS,
                ARFOItems.BADLANDS_FERN,
                ARFOItems.LARGE_BADLANDS_FERN,
                ARFOItems.BADLANDS_VINE,
                ARFOItems.BADLANDS_SUGAR_CANE,
                ARFOItems.BADLANDS_ACACIA_LEAVES,
                ARFOItems.BADLANDS_ACACIA_LEAVES_CARPET,
                ARFOItems.BADLANDS_DARK_OAK_LEAVES,
                ARFOItems.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.BADLANDS_JUNGLE_LEAVES,
                ARFOItems.BADLANDS_JUNGLE_LEAVES_CARPET,
                ARFOItems.BADLANDS_OAK_LEAVES,
                ARFOItems.BADLANDS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_BADLANDS_GRASS_BLOCK
        );

        ColorUtils.registerItemColor(ColorProvider.JUNGLE_ITEM_COLOR, ARFOItems.JUNGLE_OVERGROWN_STONE, ARFOItems.JUNGLE_OVERGROWN_STONE_SLAB, ARFOItems.JUNGLE_OVERGROWN_DACITE, ARFOItems.JUNGLE_OVERGROWN_DACITE_SLAB, ARFOItems.JUNGLE_OVERGROWN_NETHERRACK, ARFOItems.JUNGLE_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.JUNGLE_EDGE_ITEM_COLOR, ARFOItems.JUNGLE_EDGE_OVERGROWN_STONE, ARFOItems.JUNGLE_EDGE_OVERGROWN_STONE_SLAB, ARFOItems.JUNGLE_EDGE_OVERGROWN_DACITE, ARFOItems.JUNGLE_EDGE_OVERGROWN_DACITE_SLAB, ARFOItems.JUNGLE_EDGE_OVERGROWN_NETHERRACK, ARFOItems.JUNGLE_EDGE_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.BADLANDS_ITEM_COLOR, ARFOItems.BADLANDS_OVERGROWN_STONE, ARFOItems.BADLANDS_OVERGROWN_STONE_SLAB, ARFOItems.BADLANDS_OVERGROWN_DACITE, ARFOItems.BADLANDS_OVERGROWN_DACITE_SLAB, ARFOItems.BADLANDS_OVERGROWN_NETHERRACK, ARFOItems.BADLANDS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.SAVANNA_ITEM_COLOR, ARFOItems.SAVANNA_OVERGROWN_STONE, ARFOItems.SAVANNA_OVERGROWN_STONE_SLAB, ARFOItems.SAVANNA_OVERGROWN_DACITE, ARFOItems.SAVANNA_OVERGROWN_DACITE_SLAB, ARFOItems.SAVANNA_OVERGROWN_NETHERRACK, ARFOItems.SAVANNA_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.FOREST_ITEM_COLOR, ARFOItems.FOREST_OVERGROWN_STONE, ARFOItems.FOREST_OVERGROWN_STONE_SLAB, ARFOItems.FOREST_OVERGROWN_DACITE, ARFOItems.FOREST_OVERGROWN_DACITE_SLAB, ARFOItems.FOREST_OVERGROWN_NETHERRACK, ARFOItems.FOREST_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.BIRCH_FOREST_ITEM_COLOR, ARFOItems.BIRCH_FOREST_OVERGROWN_STONE, ARFOItems.BIRCH_FOREST_OVERGROWN_STONE_SLAB, ARFOItems.BIRCH_FOREST_OVERGROWN_DACITE, ARFOItems.BIRCH_FOREST_OVERGROWN_DACITE_SLAB, ARFOItems.BIRCH_FOREST_OVERGROWN_NETHERRACK, ARFOItems.BIRCH_FOREST_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.DARK_FOREST_ITEM_COLOR, ARFOItems.DARK_FOREST_OVERGROWN_STONE, ARFOItems.DARK_FOREST_OVERGROWN_STONE_SLAB, ARFOItems.DARK_FOREST_OVERGROWN_DACITE, ARFOItems.DARK_FOREST_OVERGROWN_DACITE_SLAB, ARFOItems.DARK_FOREST_OVERGROWN_NETHERRACK, ARFOItems.DARK_FOREST_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.PLAINS_ITEM_COLOR, ARFOItems.PLAINS_OVERGROWN_STONE, ARFOItems.PLAINS_OVERGROWN_STONE_SLAB, ARFOItems.PLAINS_OVERGROWN_DACITE, ARFOItems.PLAINS_OVERGROWN_DACITE_SLAB, ARFOItems.PLAINS_OVERGROWN_NETHERRACK, ARFOItems.PLAINS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.SWAMP_ITEM_COLOR, ARFOItems.SWAMP_OVERGROWN_STONE, ARFOItems.SWAMP_OVERGROWN_STONE_SLAB, ARFOItems.SWAMP_OVERGROWN_DACITE, ARFOItems.SWAMP_OVERGROWN_DACITE_SLAB, ARFOItems.SWAMP_OVERGROWN_NETHERRACK, ARFOItems.SWAMP_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.LUSH_SWAMP_ITEM_COLOR, ARFOItems.LUSH_SWAMP_OVERGROWN_STONE, ARFOItems.LUSH_SWAMP_OVERGROWN_STONE_SLAB, ARFOItems.LUSH_SWAMP_OVERGROWN_DACITE, ARFOItems.LUSH_SWAMP_OVERGROWN_DACITE_SLAB, ARFOItems.LUSH_SWAMP_OVERGROWN_NETHERRACK, ARFOItems.LUSH_SWAMP_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.MOUNTAINS_ITEM_COLOR, ARFOItems.MOUNTAINS_OVERGROWN_STONE, ARFOItems.MOUNTAINS_OVERGROWN_STONE_SLAB, ARFOItems.MOUNTAINS_OVERGROWN_DACITE, ARFOItems.MOUNTAINS_OVERGROWN_DACITE_SLAB, ARFOItems.MOUNTAINS_OVERGROWN_NETHERRACK, ARFOItems.MOUNTAINS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.MUSHROOM_FIELDS_ITEM_COLOR, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_STONE, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_STONE_SLAB, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_DACITE, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_DACITE_SLAB, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.TAIGA_ITEM_COLOR, ARFOItems.TAIGA_OVERGROWN_STONE, ARFOItems.TAIGA_OVERGROWN_STONE_SLAB, ARFOItems.TAIGA_OVERGROWN_DACITE, ARFOItems.TAIGA_OVERGROWN_DACITE_SLAB, ARFOItems.TAIGA_OVERGROWN_NETHERRACK, ARFOItems.TAIGA_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.MEGA_TAIGA_ITEM_COLOR, ARFOItems.MEGA_TAIGA_OVERGROWN_STONE, ARFOItems.MEGA_TAIGA_OVERGROWN_STONE_SLAB, ARFOItems.MEGA_TAIGA_OVERGROWN_DACITE, ARFOItems.MEGA_TAIGA_OVERGROWN_DACITE_SLAB, ARFOItems.MEGA_TAIGA_OVERGROWN_NETHERRACK, ARFOItems.MEGA_TAIGA_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.SNOWY_ITEM_COLOR, ARFOItems.SNOWY_OVERGROWN_STONE, ARFOItems.SNOWY_OVERGROWN_STONE_SLAB, ARFOItems.SNOWY_OVERGROWN_DACITE, ARFOItems.SNOWY_OVERGROWN_DACITE_SLAB, ARFOItems.SNOWY_OVERGROWN_NETHERRACK, ARFOItems.SNOWY_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.SNOWY_BEACH_ITEM_COLOR, ARFOItems.SNOWY_BEACH_OVERGROWN_STONE, ARFOItems.SNOWY_BEACH_OVERGROWN_STONE_SLAB, ARFOItems.SNOWY_BEACH_OVERGROWN_DACITE, ARFOItems.SNOWY_BEACH_OVERGROWN_DACITE_SLAB, ARFOItems.SNOWY_BEACH_OVERGROWN_NETHERRACK, ARFOItems.SNOWY_BEACH_OVERGROWN_NETHERRACK_SLAB);
        ColorUtils.registerItemColor(ColorProvider.WATERS_ITEM_COLOR, ARFOItems.WATERS_OVERGROWN_STONE, ARFOItems.WATERS_OVERGROWN_STONE_SLAB, ARFOItems.WATERS_OVERGROWN_DACITE, ARFOItems.WATERS_OVERGROWN_DACITE_SLAB, ARFOItems.WATERS_OVERGROWN_NETHERRACK, ARFOItems.WATERS_OVERGROWN_NETHERRACK_SLAB);


        // spruce and birch color
        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                return world != null && pos != null ? FoliageColors.getSpruceColor() : FoliageColors.getColor(0.5D, 1.0D);
            }
        }, ARFOBlocks.SPRUCE_LEAVES_CARPET);

        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                return world != null && pos != null ? FoliageColors.getBirchColor() : FoliageColors.getColor(0.5D, 1.0D);
            }
        }, ARFOBlocks.BIRCH_LEAVES_CARPET);

        ColorProviderRegistry.ITEM.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return FoliageColors.getSpruceColor();
            }
        }, ARFOBlocks.SPRUCE_LEAVES_CARPET);

        ColorProviderRegistry.ITEM.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return FoliageColors.getBirchColor();
            }
        }, ARFOBlocks.BIRCH_LEAVES_CARPET);

        // vanilla grass slab and vanilla grass block
        ColorProviderRegistry.BLOCK.register(new BlockColorProvider() {
            @Override
            public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
                if(tintIndex == 1) return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5D, 1.0D);

                return -1;
            }
        }, ARFOBlocks.GRASS_SLAB, BYGBlocks.BYG_MEADOW_GRASS_SLAB);
        ColorProviderRegistry.ITEM.register(new ItemColorProvider() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.getColor(0.5D, 1.0D);
            }
        }, ARFOItems.GRASS_SLAB, BYGItems.BYG_MEADOW_GRASS_SLAB);

        BlockRenderLayerMap.INSTANCE.putBlock(ARFOBlocks.GRASS_SLAB, ColorUtils.GRASS_BLOCK_LAYER);
        BlockRenderLayerMap.INSTANCE.putBlock(BYGBlocks.BYG_MEADOW_GRASS_SLAB, ColorUtils.GRASS_BLOCK_LAYER);


        BlockRenderLayerMap.INSTANCE.putBlocks(ColorUtils.LEAVE_BLOCK_LAYER,
                ARFOBlocks.ALPHA_LEAVES,
                ARFOBlocks.SPRUCE_LEAVES_CARPET,
                ARFOBlocks.BIRCH_LEAVES_CARPET,
                ARFOBlocks.AZALEA_LEAVES_CARPET,
                ARFOBlocks.FLOWERING_AZALEA_LEAVES_CARPET
        );


    }


}
