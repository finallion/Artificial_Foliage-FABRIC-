package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.block.ARFOGlowingGrassBlock;
import com.finallion.artificialfoliage.block.ARFOSpreadableBlock;
import com.finallion.artificialfoliage.block.ARFOSpreadableGrassBlock;
import com.finallion.artificialfoliage.block.ARFOSpreadableGrassSlab;
import com.finallion.artificialfoliage.block.blenderBlocks.BlenderGrassBlock;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShovelItem.class)
public class MixinShovelItem {

    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    private void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> info){
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        BlockState newState = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        boolean success = false;
        Block block = world.getBlockState(pos).getBlock();

        if (block instanceof ARFOSpreadableGrassSlab || block.is(ARFOBlocks.DIRT_SLAB) || block.is(ARFOBlocks.COARSE_DIRT_SLAB) || block.is(ARFOBlocks.PODZOL_SLAB) || block.is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) {
            EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
            SlabType slabType = state.get(ARFOSpreadableGrassSlab.TYPE);

            if (slabType == SlabType.BOTTOM) {
                newState = ARFOBlocks.GRASS_PATH_SLAB.getDefaultState().with(TYPE, SlabType.BOTTOM);
            } else if (slabType == SlabType.TOP) {
                newState = ARFOBlocks.GRASS_PATH_SLAB.getDefaultState().with(TYPE, SlabType.TOP);
            } else {
                newState = Blocks.GRASS_PATH.getDefaultState();
            }

            success = true;

        } else if (block instanceof ARFOSpreadableGrassBlock || block instanceof BlenderGrassBlock || block.is(ARFOBlocks.ARTIFICIAL_SOIL)) {
            newState = Blocks.GRASS_PATH.getDefaultState();
            success = true;
        }

        if (success) {
            if (!world.isClient()) {
                world.setBlockState(pos, newState);
                if (player != null) {
                    context.getStack().damage(1, player, ((playerEntity) -> (playerEntity).sendToolBreakStatus(context.getHand())));
                }
            } else {
                world.playSound(player, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1, 1);
            }

            info.setReturnValue(ActionResult.SUCCESS);
        }



    }

}
