package com.finallion.artificialfoliage.blockentities;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ColorableOakLeavesBlock extends Block implements BlockEntityProvider, IGiveColor {

    public ColorableOakLeavesBlock() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ColorableBlockEntity) {
            ((ColorableBlockEntity) blockEntity).setColor(16383998);
            blockEntity.markDirty();
            if (!world.isClient()) {
                ((ColorableBlockEntity) blockEntity).sync();
            }
        }
    }


    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ColorableBlockEntity(pos, state);
    }
}
