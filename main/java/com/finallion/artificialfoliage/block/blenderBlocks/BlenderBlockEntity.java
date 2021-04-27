package com.finallion.artificialfoliage.block.blenderBlocks;

import com.finallion.artificialfoliage.registry.ModBlocks;
import net.fabricmc.fabric.api.block.entity.BlockEntityClientSerializable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.nbt.CompoundTag;

public class BlenderBlockEntity extends BlockEntity implements BlockEntityClientSerializable {

    private int color;

    public BlenderBlockEntity() {
        super(ModBlocks.BLENDER_BLOCK_ENTITY_TYPE);
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
        markDirty();
    }


    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        this.color = tag.getInt("color");
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        tag.putInt("color", color);
        return super.toTag(tag);
    }

    @Override
    public void fromClientTag(CompoundTag tag) {
        this.color = tag.getInt("color");
        MinecraftClient.getInstance().worldRenderer.updateBlock(world, pos, null, null, 8);

    }

    @Override
    public CompoundTag toClientTag(CompoundTag tag) {
        tag.putInt("color", color);
        return tag;
    }
}
