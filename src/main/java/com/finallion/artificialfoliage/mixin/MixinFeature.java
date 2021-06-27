package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.registry.ARFOBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
public class MixinFeature {

    @Inject(at = @At("HEAD"), method = "isSoil(Lnet/minecraft/block/BlockState;)Z", cancellable = true)
    private static void isSoil(BlockState block, CallbackInfoReturnable<Boolean> info) {
        if (block.isIn(ARFOBlockTags.DIRT))
            info.setReturnValue(true);
    }
}
