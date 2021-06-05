package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;


public class ARFOStoneSoilBlock extends Block {

    public ARFOStoneSoilBlock() {
        super(FabricBlockSettings.copyOf(Blocks.DIRT).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
    }


}
