package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.block.ARFOGlowingGrassBlock;
import com.finallion.artificialfoliage.block.ARFOGrassBlock;
import com.finallion.artificialfoliage.block.blenderBlocks.BlenderGrassBlock;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Feature.class)
public class MixinFeature {

    @Inject(method = "isSoil", at = @At("HEAD"), cancellable = true)
    private static void isSoil(Block block, CallbackInfoReturnable<Boolean> info) {
        if (block instanceof ARFOGrassBlock || block instanceof BlenderGrassBlock || block instanceof ARFOGlowingGrassBlock) info.setReturnValue(true);
    }
}
