package com.finallion.artificialfoliage.compatibilty;

import com.finallion.artificialfoliage.compatibilty.BOP.BOPBlocks;
import com.finallion.artificialfoliage.compatibilty.BOP.BOPFluids;
import com.finallion.artificialfoliage.compatibilty.BOP.BOPItems;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGFluids;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGItems;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseBlocks;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseFluids;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseItems;

public class ModCompat {

    public static void init() {
        CompatItemGroup.init();

        TraverseBlocks.registerBlocks();
        TraverseFluids.registerFluids();
        TraverseItems.registerItems();

        BYGBlocks.registerBlocks();
        BYGFluids.registerFluids();
        BYGItems.registerItems();

        BOPBlocks.registerBlocks();
        BOPFluids.registerFluids();
        BOPItems.registerItems();


    }
}
