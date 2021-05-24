package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ARFOBlockTags {
    public static final Tag<Block> DIRT = TagRegistry.block(new Identifier("c", "dirt"));

    public static final Tag<Block> GRASS_BLOCKS = createTag("grass_blocks");
    public static final Tag<Block> ACACIA_LEAVES = createTag("acacia_leaves");
    public static final Tag<Block> OAK_LEAVES = createTag("oak_leaves");
    public static final Tag<Block> DARK_OAK_LEAVES = createTag("dark_oak_leaves");
    public static final Tag<Block> JUNGLE_LEAVES = createTag("jungle_leaves");

    /*
    public static final Tag<Block> LEAVES = createTag("leaves");

    public static final Tag<Block> VINES = createTag("vines");
    public static final Tag<Block> SUGAR_CANES = createTag("sugar_canes");
    public static final Tag<Block> GRASS = createTag("grass");
    public static final Tag<Block> TALL_GRASS = createTag("tall_grass");
    public static final Tag<Block> FERNS = createTag("ferns");
    public static final Tag<Block> LARGE_FERNS = createTag("large_ferns");
    public static final Tag<Block> GRASS_SLABS = createTag("grass_slabs");

    public static final Tag<Block> DYES = createTag("dyes");

    public static final Tag<Block> COLD_DYES = createTag("cold_dyes");
    public static final Tag<Block> FROZEN_DYES = createTag("frozen_dyes");
    public static final Tag<Block> SWAMP_DYES = createTag("swamp_dyes");
    public static final Tag<Block> WARM_DYES = createTag("warm_dyes");
    public static final Tag<Block> LUKEWARM_DYES = createTag("lukewarm_dyes");
    public static final Tag<Block> MODERATE_DYES = createTag("moderate_dyes");

     */

    public static Tag<Block> createTag(String id) {
        return TagRegistry.block(new Identifier(ArtificialFoliage.MOD_ID, id));
    }
}
