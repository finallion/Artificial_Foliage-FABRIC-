package com.finallion.artificialfoliage.block;


import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;


public class ARFOSlab extends SlabBlock {

    public ARFOSlab(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false));
    }





}
