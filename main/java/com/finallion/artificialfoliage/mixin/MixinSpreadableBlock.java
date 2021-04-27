package com.finallion.artificialfoliage.mixin;


import com.finallion.artificialfoliage.block.ARFOSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin (SpreadableBlock.class)
public class MixinSpreadableBlock {

    @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo info) {
        // allows vanilla grass blocks to spread to ARFO slabs
        ARFOSlabBlock.doTick(state, world, pos, random);
    }
}
