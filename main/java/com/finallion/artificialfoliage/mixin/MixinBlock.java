package com.finallion.artificialfoliage.mixin;

import com.finallion.artificialfoliage.block.blenderBlocks.BlenderBlockEntity;
import com.finallion.artificialfoliage.block.blenderBlocks.IBlenderBlock;
import net.fabricmc.fabric.api.block.entity.BlockEntityClientSerializable;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Block.class)
public class MixinBlock implements IBlenderBlock {

    @Override
    public boolean setColor(ItemUsageContext ctx, World world, BlockPos pos, int color) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof BlenderBlockEntity) {
            ((BlenderBlockEntity) blockEntity).setColor(color);
        } else {
            return false;
        }
        blockEntity.markDirty();

        if (!world.isClient()) {
            ((BlockEntityClientSerializable) blockEntity).sync();
        }

        return true;
    }
}
