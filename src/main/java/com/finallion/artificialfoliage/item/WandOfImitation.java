package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.block.IReturnColor;
import com.finallion.artificialfoliage.blockentities.IGiveColor;
import com.finallion.artificialfoliage.blockentities.ColorableBlockEntity;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WandOfImitation extends WandItem {
    public static final Identifier COLOR_CONSTANT = new Identifier(ArtificialFoliage.MOD_ID, "color_packet");
    public static final Identifier POS_BLOCK_CONSTANT = new Identifier(ArtificialFoliage.MOD_ID, "pos_packet");



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
        ItemStack stack = context.getStack();
        //if (world.isClient()) return super.useOnBlock(context);

        if (block instanceof IGiveColor && playerEntity != null) {
            if (playerEntity.isSneaking()) {
                if (world.getBlockEntity(blockPos) != null) {
                    context.getStack().getOrCreateTag().putInt("color", ((ColorableBlockEntity) world.getBlockEntity(blockPos)).getColor());
                    playerEntity.playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_SET_SPAWN, 0.5F, 1);
                    return ActionResult.success(world.isClient());
                }
            } else {
                if (((IGiveColor) block).setColor(context, world, blockPos, context.getStack().getOrCreateTag().getInt("color"))) {
                    playerEntity.playSound(SoundEvents.BLOCK_GRASS_PLACE, 0.25F, 1);
                    return ActionResult.success(world.isClient());
                }

            }

        }

        if (block instanceof IReturnColor && playerEntity != null) {
            BlockState state = block.getDefaultState();

            // no colored blocks
            if (state.isOf(ARFOBlocks.ALPHA_GRASS_BLOCK) || state.isOf(ARFOBlocks.MYCELIUM_SLAB) || state.isOf(ARFOBlocks.GRASS_SLAB) || state.isOf(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
                return ActionResult.PASS;
            }

            if (playerEntity.isSneaking()) {
                // send blockPos to client

                if (!world.isClient()) {
                    PacketByteBuf pos = PacketByteBufs.create();
                    pos.writeBlockPos(blockPos);
                    ServerPlayNetworking.send((ServerPlayerEntity) playerEntity, POS_BLOCK_CONSTANT, pos);
                }



                playerEntity.playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_SET_SPAWN, 0.5F, 1);
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }



}
