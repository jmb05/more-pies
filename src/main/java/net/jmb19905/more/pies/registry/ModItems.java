package net.jmb19905.more.pies.registry;

import net.jmb19905.more.pies.MorePies;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PUMPKIN_PIE));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(MorePies.MOD_ID, "apple_pie"), APPLE_PIE);
    }

}
