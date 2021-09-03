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

@Mixin(NetherrackBlock.class)
public class MixinNetherrackBlock {
    @Inject(method = "grow", at = @At("TAIL"), cancellable = true)
    private void grow(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci) {

        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

        BlockState blockState = state;
        while (var7.hasNext()) {
            BlockPos blockPos = (BlockPos) var7.next();
            blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM) || blockState.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB)) {
                break;
            }
        }

        if (state.getBlock() != blockState.getBlock() && !(blockState.isOf(Blocks.AIR))) {
            if (blockState.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB) || blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
                world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 2);
            } else if (blockState.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 2);
            } else {
                world.setBlockState(pos, blockState.getBlock().getDefaultState(), 2);
            }
        }


    }

}
