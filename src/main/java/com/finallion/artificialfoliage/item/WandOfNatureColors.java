package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.blockentities.IGiveColor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class WandOfNatureColors extends WandItem {


    public WandOfNatureColors(Settings settings) {
        super(settings);
    }


    private static int getColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int blue = random.nextInt(175);
        int green = 255;

        double fraction = random.nextDouble();
        if (fraction < 0.3) fraction += 0.7;

        return 65536 * (int)(red * fraction) + 256 * (int)(green * fraction) + (int)(blue * fraction);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        PlayerEntity playerEntity = context.getPlayer();

        if (block instanceof IGiveColor && playerEntity != null) {
            if (((IGiveColor) block).setColor(context, world, blockPos, getColor())) {
                playerEntity.playSound(SoundEvents.BLOCK_GRASS_PLACE, 0.5F, 1);
                return ActionResult.success(world.isClient());
            }
        }


        return ActionResult.PASS;
    }



}
