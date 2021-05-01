package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.sound.BlockSoundGroup;


public class ARFOLargeFernBlock extends TallPlantBlock {

    public ARFOLargeFernBlock() {
        super(FabricBlockSettings.copyOf(Blocks.LARGE_FERN).breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque().noCollision());
    }

}
