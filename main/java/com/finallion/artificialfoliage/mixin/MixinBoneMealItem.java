package com.finallion.artificialfoliage.mixin;


import com.finallion.artificialfoliage.block.ARFOFernBlock;
import com.finallion.artificialfoliage.block.ARFOGlowingGrassBlock;
import com.finallion.artificialfoliage.block.ARFOGrass;
import com.finallion.artificialfoliage.block.ARFONetherSlabBlock;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (BoneMealItem.class)
public class MixinBoneMealItem {
    @Inject(method = "useOnBlock", at = @At("TAIL"), cancellable = true)
    void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> info) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState blockState = world.getBlockState(pos);
        ItemStack stack = context.getStack();
        boolean success = false;

        if (!world.isClient()) {
            if (blockState.isOf(ARFOBlocks.NETHERRACK_SLAB)) {
                ARFONetherSlabBlock netherSlab = (ARFONetherSlabBlock) blockState.getBlock();
                netherSlab.spread(world, world.random, pos, blockState);
                success = true;

            } else if (blockState.isOf(ARFOBlocks.WARPED_NYLIUM_SLAB) || blockState.isOf(ARFOBlocks.CRIMSON_NYLIUM_SLAB)) {
                ARFONetherSlabBlock netherSlab = (ARFONetherSlabBlock) blockState.getBlock();
                netherSlab.grow((ServerWorld)world, world.random, pos, blockState);
                success = true;

            } else if (blockState.isOf(ARFOBlocks.GLOWING_WARPED_NYLIUM) || blockState.isOf(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                ARFOGlowingGrassBlock block = (ARFOGlowingGrassBlock) blockState.getBlock();
                block.growNetherGrass((ServerWorld)world, world.random, pos, blockState);
                success = true;

            } else if (blockState.isOf(Blocks.NETHERRACK)) {
                NetherrackBlock netherrack = (NetherrackBlock) blockState.getBlock();
                netherrack.grow((ServerWorld) world, world.random, pos, blockState);
                success = true;

            } else if (blockState.getBlock() instanceof ARFOGrass) {
                ARFOGrass grass = (ARFOGrass) blockState.getBlock();
                grass.grow((ServerWorld) world, world.random, pos, blockState);
                success = true;

            } else if (blockState.getBlock() instanceof ARFOFernBlock) {
                ARFOFernBlock fern = (ARFOFernBlock) blockState.getBlock();
                fern.grow((ServerWorld) world, world.random, pos, blockState);
                success = true;
            }

            if (success) {
                stack.decrement(1);
                info.setReturnValue(ActionResult.SUCCESS);
            }
        }
    }
}
