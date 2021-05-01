package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ARFOSugarCaneBlock extends SugarCaneBlock {

    public ARFOSugarCaneBlock() {
        super(FabricBlockSettings.copyOf(Blocks.SUGAR_CANE).breakInstantly().noCollision().nonOpaque().sounds(BlockSoundGroup.GRASS));
    }
}
