package net.tomgie.buildersmod;

import net.fabricmc.api.ModInitializer;
import net.tomgie.buildersmod.registry.BlockRegistry;
import net.tomgie.buildersmod.registry.ItemRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;

public class BuildersMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("buildersmod");

	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
		ItemRegistry.registerItems();

		PolymerRPUtils.addAssetSource("buildersmod");
	}
}
