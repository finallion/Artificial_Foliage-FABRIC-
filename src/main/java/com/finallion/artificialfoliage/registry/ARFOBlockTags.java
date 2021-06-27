package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

public class ARFOBlockTags {
    public static final Tag<Block> DIRT = TagRegistry.block(new Identifier("c", "dirt"));
    public static final Tag<Fluid> WATER = TagRegistry.fluid(new Identifier("minecraft", "water"));

    public static final Tag<Block> GRASS_BLOCKS = createTag("grass_blocks");
    public static final Tag<Block> ACACIA_LEAVES = createTag("acacia_leaves");
    public static final Tag<Block> OAK_LEAVES = createTag("oak_leaves");
    public static final Tag<Block> DARK_OAK_LEAVES = createTag("dark_oak_leaves");
    public static final Tag<Block> JUNGLE_LEAVES = createTag("jungle_leaves");

    public static Tag<Block> createTag(String id) {
        return TagRegistry.block(new Identifier(ArtificialFoliage.MOD_ID, id));
    }


}
