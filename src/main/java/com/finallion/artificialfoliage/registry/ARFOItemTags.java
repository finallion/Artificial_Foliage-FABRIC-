package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.mixin.tag.extension.AccessorFluidTags;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagGroup;
import net.minecraft.util.Identifier;

public class ARFOItemTags {

    public static final Tag<Item> GRASS_BLOCKS = createTag("grass_blocks");
    public static final Tag<Item> ACACIA_LEAVES = createTag("acacia_leaves");
    public static final Tag<Item> OAK_LEAVES = createTag("oak_leaves");
    public static final Tag<Item> DARK_OAK_LEAVES = createTag("dark_oak_leaves");
    public static final Tag<Item> JUNGLE_LEAVES = createTag("jungle_leaves");

    public static final Tag<Item> LEAVES = createTag("leaves");

    public static final Tag<Item> VINES = createTag("vines");
    public static final Tag<Item> SUGAR_CANES = createTag("sugar_canes");
    public static final Tag<Item> GRASS = createTag("grass");
    public static final Tag<Item> TALL_GRASS = createTag("tall_grass");
    public static final Tag<Item> FERNS = createTag("ferns");
    public static final Tag<Item> LARGE_FERNS = createTag("large_ferns");
    public static final Tag<Item> GRASS_SLABS = createTag("grass_slabs");

    public static final Tag<Item> DYES = createTag("dyes");

    public static final Tag<Item> COLD_DYES = createTag("cold_dyes");
    public static final Tag<Item> FROZEN_DYES = createTag("frozen_dyes");
    public static final Tag<Item> SWAMP_DYES = createTag("swamp_dyes");
    public static final Tag<Item> WARM_DYES = createTag("warm_dyes");
    public static final Tag<Item> LUKEWARM_DYES = createTag("lukewarm_dyes");
    public static final Tag<Item> MODERATE_DYES = createTag("moderate_dyes");

    public static Tag<Item> createTag(String id) {
        return TagRegistry.item(new Identifier(ArtificialFoliage.MOD_ID, id));
    }



    public static void init() {
    }


}
