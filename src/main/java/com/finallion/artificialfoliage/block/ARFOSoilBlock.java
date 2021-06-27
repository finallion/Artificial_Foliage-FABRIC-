package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class ARFOSoilBlock extends Block {


    public ARFOSoilBlock() {
        super(FabricBlockSettings.copyOf(Blocks.DIRT).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.GRASS));
    }

}
