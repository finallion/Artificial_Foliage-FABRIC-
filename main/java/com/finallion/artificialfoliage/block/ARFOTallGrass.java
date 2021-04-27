package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ARFOTallGrass extends TallPlantBlock {

    public ARFOTallGrass() {
        super(FabricBlockSettings.copyOf(Blocks.TALL_GRASS).breakInstantly().nonOpaque().noCollision().sounds(BlockSoundGroup.GRASS));
    }
}
