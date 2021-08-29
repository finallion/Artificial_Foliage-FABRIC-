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

public class WandOfChaosColors extends WandItem {

    public WandOfChaosColors(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        PlayerEntity playerEntity = context.getPlayer();
        Random random = new Random();
        int color = random.nextInt(16711680);

        if (block instanceof IGiveColor && playerEntity != null) {
            if (((IGiveColor) block).setColor(context, world, blockPos, color)) {
                playerEntity.playSound(SoundEvents.BLOCK_GRASS_PLACE, 0.25F, 1);
                return ActionResult.success(world.isClient());
            }
        }
        return ActionResult.PASS;
    }


}
