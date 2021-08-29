package com.finallion.artificialfoliage.blockentities;

import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IGiveColor {

    default boolean setColor(ItemUsageContext ctx, World world, BlockPos pos, int color) {
        return false;
    }

}
