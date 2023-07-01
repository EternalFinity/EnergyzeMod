package net.eternal.energyze;

import net.eternal.energyze.block.ModBlocks;
import net.eternal.energyze.item.ModItemGroup;
import net.eternal.energyze.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Energyze implements ModInitializer {

	public static final String MOD_ID = "energyze";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
