package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.block.blenderBlocks.BlenderBlockEntity;
import com.finallion.artificialfoliage.block.blenderBlocks.IBlenderBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WandOfImitation extends Item {

    public WandOfImitation(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        PlayerEntity playerEntity = context.getPlayer();

        if (block instanceof IBlenderBlock && playerEntity != null) {
            if (playerEntity.isSneaking()) {
                if (world.getBlockEntity(blockPos) != null) {
                    context.getStack().getOrCreateTag().putInt("color", ((BlenderBlockEntity) world.getBlockEntity(blockPos)).getColor());
                    playerEntity.playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_SET_SPAWN, 0.5F, 1);
                    return ActionResult.success(world.isClient());
                }
            } else {
                if (((IBlenderBlock) block).setColor(context, world, blockPos, context.getStack().getOrCreateTag().getInt("color"))) {
                    playerEntity.playSound(SoundEvents.BLOCK_GRASS_PLACE, 0.25F, 1);
                    return ActionResult.success(world.isClient());
                }

            }

        }
        return ActionResult.PASS;
    }
}
