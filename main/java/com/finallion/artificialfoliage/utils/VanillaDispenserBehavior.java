package com.finallion.artificialfoliage.utils;

import com.finallion.artificialfoliage.item.ARFOGrassSeedItem;
import com.finallion.artificialfoliage.registry.ARFOItems;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class VanillaDispenserBehavior {
    public static void init() {
        DispenserBlock.registerBehavior(ARFOItems.GRASS_SEED, new FallibleItemDispenserBehavior() {
            protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
                this.setSuccess(true);
                World world = pointer.getWorld();
                BlockPos blockPos = pointer.getBlockPos().offset((Direction)pointer.getBlockState().get(DispenserBlock.FACING));
                if (!ARFOGrassSeedItem.useOnArtificialGrass(stack, world, blockPos)) {
                    this.setSuccess(false);
                } else if (!world.isClient) {
                    world.syncWorldEvent(2005, blockPos, 0);
                }

                return stack;
            }
        });

    }
}
