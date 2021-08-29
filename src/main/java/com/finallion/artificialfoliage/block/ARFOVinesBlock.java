package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ARFOVinesBlock extends VineBlock {

    public ARFOVinesBlock() {
        super(FabricBlockSettings.copyOf(Blocks.VINE).breakByTool(FabricToolTags.SHEARS).noCollision().nonOpaque().sounds(BlockSoundGroup.GRASS));
    }
}
