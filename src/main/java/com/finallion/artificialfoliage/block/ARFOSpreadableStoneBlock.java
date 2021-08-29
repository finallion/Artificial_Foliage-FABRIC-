package com.finallion.artificialfoliage.block;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;


public class ARFOSpreadableStoneBlock extends ARFOSpreadableBlock {

    public ARFOSpreadableStoneBlock() {
        super(FabricBlockSettings
                .copyOf(Blocks.GRASS_BLOCK)
                .breakByTool(FabricToolTags.PICKAXES)
                .sounds(BlockSoundGroup.STONE));

    }
}
