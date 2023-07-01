package net.eternal.energyze.item;

import net.eternal.energyze.Energyze;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STAMINITE_SHARD = registerItem("staminite_shard",
            new Item(new FabricItemSettings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Energyze.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, STAMINITE_SHARD);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

    }

    public static void registerModItems() {
        Energyze.LOGGER.info("registering Mod Items for " + Energyze.MOD_ID);

        addItemsToItemGroup();
    }
}

