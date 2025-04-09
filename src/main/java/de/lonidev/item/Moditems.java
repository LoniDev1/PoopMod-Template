package de.lonidev.item;


import de.lonidev.PoopModPoopAddon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item STINKYPOOP =  registerItem("stinky_poop", new Item(new FabricItemSettings()));
    public static final Item RAWSTINKYPOOPORE =  registerItem("raw_stinky_poop_ore", new Item(new FabricItemSettings()));
    public static final Item STINKYPOOPINGOT =  registerItem("stinky_poop_ingot", new Item(new FabricItemSettings()));


    private static void addItemsToIngedientTabItemGroup(FabricItemGroupEntries entries) {
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PoopModPoopAddon.MOD_ID, name), item);
    }


    public static void registerModItems() {
        PoopModPoopAddon.LOGGER.info("Registering Mod Items for " + PoopModPoopAddon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngedientTabItemGroup);
    }
}
