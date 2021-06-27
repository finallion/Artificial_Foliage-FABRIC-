package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;


public class ARFOSpreadableStoneSlab extends ARFOSpreadableSlab {


    public ARFOSpreadableStoneSlab() {
        super(FabricBlockSettings
                .copyOf(Blocks.GRASS_BLOCK)
                .breakByTool(FabricToolTags.PICKAXES)
                .sounds(BlockSoundGroup.STONE));
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false).with(SNOWY, false));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

}
