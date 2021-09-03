package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;

public class ARFOGlowingGrassBlock extends ARFOSpreadableBlock {


    public ARFOGlowingGrassBlock() {
        super(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).breakByTool(FabricToolTags.SHOVELS).luminance(15));
    }


}
