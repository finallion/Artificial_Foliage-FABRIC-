package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ARFODarkOakLeavesBlock extends LeavesBlock {

    public ARFODarkOakLeavesBlock() {
        super(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES).breakByTool(FabricToolTags.HOES).breakByTool(FabricToolTags.SHEARS).sounds(BlockSoundGroup.GRASS));
    }
}
