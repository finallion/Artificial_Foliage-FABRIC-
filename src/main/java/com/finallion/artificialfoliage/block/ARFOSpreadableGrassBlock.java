package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;


public class ARFOSpreadableGrassBlock extends ARFOSpreadableBlock {

    public ARFOSpreadableGrassBlock() {
        super(FabricBlockSettings
                .copyOf(Blocks.GRASS_BLOCK)
                .breakByTool(FabricToolTags.SHOVELS)
                .sounds(BlockSoundGroup.GRASS));
    }

}
