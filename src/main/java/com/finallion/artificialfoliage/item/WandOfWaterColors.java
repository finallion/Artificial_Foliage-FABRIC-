package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.block.blenderBlocks.IBlenderBlock;
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

public class WandOfWaterColors extends Item {

    public WandOfWaterColors(Item.Settings settings) {
        super(settings);
    }

    private static int getColor() {
        Random random = new Random();
        int red = random.nextInt(175);
        int blue = 255;
        int green = random.nextInt(256);

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


        if (block instanceof IBlenderBlock && playerEntity != null) {
            if (((IBlenderBlock) block).setColor(context, world, blockPos, getColor())) {
                playerEntity.playSound(SoundEvents.ITEM_BUCKET_FILL, 0.5F, 1);
                return ActionResult.success(world.isClient());
            }
        }


        return ActionResult.PASS;
    }
}
