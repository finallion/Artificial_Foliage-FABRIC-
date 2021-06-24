package com.finallion.artificialfoliage.compatibilty;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGItems;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseItems;
import com.finallion.artificialfoliage.registry.ARFOItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class CompatItemGroup {

    public static ItemGroup addons = FabricItemGroupBuilder.create(
            new Identifier(ArtificialFoliage.MOD_ID, "addons"))
            .icon(() -> new ItemStack(BYGItems.BYG_NETHER_DYE)).build();


    public static void init() {

    }

}
