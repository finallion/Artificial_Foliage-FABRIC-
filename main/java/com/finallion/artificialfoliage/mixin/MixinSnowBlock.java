package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.block.ARFOSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (SnowBlock.class)
public class MixinSnowBlock {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        BlockState stateDown = world.getBlockState(pos.down());
        if (stateDown.getBlock() instanceof ARFOSlabBlock) {
            if (stateDown.get(Properties.SLAB_TYPE) == SlabType.DOUBLE || stateDown.get(Properties.SLAB_TYPE) == SlabType.TOP || stateDown.get(Properties.SLAB_TYPE) == SlabType.BOTTOM) {
                info.setReturnValue(true);
            }
        }
    }
}
