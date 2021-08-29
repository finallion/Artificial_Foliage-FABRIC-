package com.finallion.artificialfoliage.compatibilty;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.compatibilty.BOP.BOPItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CompatItemGroup {

    public static ItemGroup addons = FabricItemGroupBuilder.create(
            new Identifier(ArtificialFoliage.MOD_ID, "addons"))
            .icon(() -> new ItemStack(BOPItems.BOP_GROVE_DYE)).build();


    public static void init() {

    }

}
