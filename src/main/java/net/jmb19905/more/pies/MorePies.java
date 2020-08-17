package net.jmb19905.more.pies;

import net.fabricmc.api.ModInitializer;
import net.jmb19905.more.pies.registry.ModItems;

public class MorePies implements ModInitializer {

    public static final String MOD_ID = "morepies";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        System.out.println("More PIES has LOADED!");
    }

}
