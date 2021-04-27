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


    public void grow(World world, Random random, BlockPos pos, BlockState state) {
        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();
        boolean found = false;
        BlockState blockState = world.getBlockState(pos);

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            blockState = world.getBlockState(blockPos);
            if (blockState.getBlock() instanceof ARFOGrassBlock) {
                found = true;
                break;
            }
        }

        if (!world.isClient() && found) {
            world.setBlockState(pos, blockState, 3);
        }

    }
}
