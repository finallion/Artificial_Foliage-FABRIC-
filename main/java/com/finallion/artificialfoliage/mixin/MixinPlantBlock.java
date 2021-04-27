package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.block.ARFOGlowingGrassBlock;
import com.finallion.artificialfoliage.block.ARFOGrassBlock;
import com.finallion.artificialfoliage.block.ARFOSlabBlock;
import com.finallion.artificialfoliage.block.blenderBlocks.BlenderGrassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (PlantBlock.class)
public class MixinPlantBlock {
    private EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;

    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        Block block = world.getBlockState(pos.down()).getBlock();

        if (block instanceof ARFOGrassBlock || block instanceof BlenderGrassBlock || block instanceof ARFOGlowingGrassBlock) {
            info.setReturnValue(true);
        } else if (block instanceof ARFOSlabBlock) {
            if (world.getBlockState(pos.down()).get(TYPE) != SlabType.BOTTOM) info.setReturnValue(true);
        }
        // gives nice world gen in desert
        //else if (world.getBlockState(pos.down()).isFullCube(world, pos.down())) {
        // info.setReturnValue(true);
        //}
    }
}
