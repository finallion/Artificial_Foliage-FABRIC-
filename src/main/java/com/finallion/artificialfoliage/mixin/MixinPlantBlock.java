package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.block.*;
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
        Block plant = state.getBlock();

        if (block instanceof ARFOSpreadableBlock || block instanceof BlenderGrassBlock || block instanceof ARFOGlowingNyliumBlock || block instanceof ARFOSoilBlock || block instanceof ARFOStoneSoilBlock) {
            info.setReturnValue(true);
        } else if (block instanceof ARFOSpreadableSlab || block instanceof ARFONyliumSlab || block instanceof ARFOSlab) {
            if (world.getBlockState(pos.down()).get(TYPE) != SlabType.BOTTOM) {
                info.setReturnValue(true);
            } else if (plant instanceof ARFOFernBlock || plant instanceof ARFOGrass || plant instanceof ARFOTallGrass || plant instanceof ARFOLargeFernBlock) {
                info.setReturnValue(true);
            }

            //if (world.getBlockState(pos.down()).get(TYPE) != SlabType.BOTTOM) {
                //info.setReturnValue(true);
            //}
        }
    }
}
