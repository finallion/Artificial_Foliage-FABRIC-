package com.finallion.artificialfoliage.blockentities;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.block.entity.BlockEntityClientSerializable;
import net.fabricmc.fabric.api.rendering.data.v1.RenderAttachmentBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class ColorableBlockEntity extends BlockEntity implements BlockEntityClientSerializable {

    private int color = -1;

    public ColorableBlockEntity(BlockPos pos, BlockState state) {
        super(ARFOBlocks.COLORABLE_BLOCK_ENTITY_TYPE, pos, state);
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        markDirty();
        //this.world.scheduleBlockRerenderIfNeeded(pos, null, null);

        /*
        if (world.isClient()) {
            MinecraftClient.getInstance().worldRenderer.updateBlock(world, pos, null, null, 8);
        }

         */


    }


    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.color = nbt.getInt("color");
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putInt("color", color);
        return super.writeNbt(nbt);
    }

    @Override
    public void fromClientTag(NbtCompound tag) {
        this.color = tag.getInt("color");
        MinecraftClient.getInstance().worldRenderer.updateBlock(world, pos, null, null, 8);

    }

    @Override
    public NbtCompound toClientTag(NbtCompound tag) {
        tag.putInt("color", color);
        return tag;
    }

}
