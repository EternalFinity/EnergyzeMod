package net.eternal.energyze.block;

import net.eternal.energyze.Energyze;
import net.eternal.energyze.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static final Block STAMINITE_ORE = registerBlock("staminite_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.NATURAL);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
    registerBlockItem(name, block, group);
    return Registry.register(Registries.BLOCK, new Identifier(Energyze.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Energyze.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks()  {
        Energyze.LOGGER.info("Registering ModBlocks for " + Energyze.MOD_ID);
    }
}
