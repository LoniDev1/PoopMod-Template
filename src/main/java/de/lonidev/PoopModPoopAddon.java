package de.lonidev;

import de.lonidev.block.ModBlocks;
import de.lonidev.item.Moditems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoopModPoopAddon implements ModInitializer {
	public static final String MOD_ID = "poop-mod-poop-addon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//Register your Items...
		Moditems.registerModItems();
		ModBlocks.registerBlocks();


		//That's how you add Items to the existing Poopmod Item Group
		RegistryKey<ItemGroup> PoopModItemGroup = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier("poopmod", "poop_mod"));

		ItemGroupEvents.modifyEntriesEvent(PoopModItemGroup).register(entries -> {
			//Here are you're items
			entries.add(Moditems.STINKYPOOP);
		});
	}
}