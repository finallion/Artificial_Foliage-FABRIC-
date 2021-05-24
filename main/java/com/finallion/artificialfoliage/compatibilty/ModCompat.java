package com.finallion.artificialfoliage.compatibilty;

import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseBlocks;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseFluids;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseItems;

public class ModCompat {

    public static void init() {
        TraverseBlocks.registerBlocks();
        TraverseFluids.registerFluids();
        TraverseItems.registerItems();


        CompatItemGroup.init();

    }
}
