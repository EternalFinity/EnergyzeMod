package net.eternal.energyze.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.eternal.energyze.Energyze;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup STAMINITE;

    public static void registerItemGroups() {

        STAMINITE = FabricItemGroup.builder(new Identifier(Energyze.MOD_ID, "staminite"))
                .displayName(Text.literal("Staminite Items"))
                .icon(() -> new ItemStack(ModItems.STAMINITE_SHARD)).build();


    }

}
