package com.finallion.artificialfoliage.block.blenderBlocks;

import com.finallion.artificialfoliage.block.IARFOLeaves;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BlenderAcaciaLeavesBlock extends Block implements BlockEntityProvider, IBlenderBlock, IBlenderLeavesBlock, IARFOLeaves {

    public BlenderAcaciaLeavesBlock() {
        super(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES));
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof BlenderBlockEntity) {
            ((BlenderBlockEntity) blockEntity).setColor(16383998);
            blockEntity.markDirty();
            if (!world.isClient()) {
                ((BlenderBlockEntity) blockEntity).sync();
            }
        }
    }


    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new BlenderBlockEntity();
    }
}
