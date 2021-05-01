package com.finallion.artificialfoliage.block.blenderBlocks;

import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IBlenderBlock {
    default boolean setColor(ItemUsageContext ctx, World world, BlockPos pos, int color) {
        return false;
    }

}
