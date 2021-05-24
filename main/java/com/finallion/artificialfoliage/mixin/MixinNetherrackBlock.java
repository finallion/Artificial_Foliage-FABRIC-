package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Iterator;
import java.util.Random;

@Mixin (NetherrackBlock.class)
public class MixinNetherrackBlock {
    @Inject(method = "grow", at = @At("HEAD"), cancellable = true)
    void grow(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo info) {
        if (!world.isClient()) {
            boolean bl = false;
            boolean bl2 = false;
            Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

            while(var7.hasNext()) {
                BlockPos blockPos = (BlockPos)var7.next();
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB) || blockState.isOf(Blocks.WARPED_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
                    bl2 = true;
                }

                if (blockState.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(Blocks.CRIMSON_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                    bl = true;
                }

                if (bl2 && bl) {
                    break;
                }
            }

            if (bl2 && bl) {
                world.setBlockState(pos, random.nextBoolean() ? Blocks.WARPED_NYLIUM.getDefaultState() : Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
            } else if (bl2) {
                world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
            } else if (bl) {
                world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
            }
        }
    }
}
