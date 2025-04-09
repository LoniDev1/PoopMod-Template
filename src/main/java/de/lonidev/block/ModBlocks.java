package de.lonidev.block;

import de.lonidev.PoopModPoopAddon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block STINKYPOOPORE = registerBlock("stinky_poop_ore", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.5f)));
    public static final Block STINKYPOOBLOCK = registerBlock("stinky_poop_block", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.5f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PoopModPoopAddon.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(PoopModPoopAddon.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        PoopModPoopAddon.LOGGER.info("Register Blocks for " + PoopModPoopAddon.MOD_ID);
    }
}
