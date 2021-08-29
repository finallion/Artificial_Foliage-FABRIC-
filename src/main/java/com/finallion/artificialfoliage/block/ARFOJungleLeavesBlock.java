package com.finallion.artificialfoliage.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.World;

import java.util.Objects;

public class ARFOJungleLeavesBlock extends LeavesBlock implements IReturnColor {

    public ARFOJungleLeavesBlock() {
        super(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).breakByTool(FabricToolTags.HOES).breakByTool(FabricToolTags.SHEARS).sounds(BlockSoundGroup.GRASS));
    }



}
