package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.registry.ARFOBlockTags;
import com.finallion.artificialfoliage.registry.ARFOItemTags;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
public class MixinFeature {

    @Inject(at = @At("HEAD"), method = "isSoil(Lnet/minecraft/block/Block;)Z", cancellable = true)
    private static void isSoil(Block block, CallbackInfoReturnable<Boolean> info) {
        if (block.isIn(ARFOBlockTags.DIRT))
            info.setReturnValue(true);
    }
}
