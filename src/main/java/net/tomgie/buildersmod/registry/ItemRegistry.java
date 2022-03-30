package net.tomgie.buildersmod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;
import net.tomgie.buildersmod.item.PolymerBlockItem;
import net.tomgie.buildersmod.item.PolymerItem;

public class ItemRegistry {

    public static final Item PALLADIUM_ORE = new PolymerBlockItem(BlockRegistry.PALLADIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS), "palladium_ore");
    public static final Item DEEPSLATE_PALLADIUM_ORE = new PolymerBlockItem(BlockRegistry.DEEPSLATE_PALLADIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS), "deepslate_palladium_ore");
    public static final Item RAW_PALLADIUM = new PolymerItem(new FabricItemSettings().group(ItemGroup.MISC), "raw_palladium");

    public static void registerItems() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
        registerAndAdd("raw_palladium", RAW_PALLADIUM);
    }

    private static void registerAndAdd(String id, Item item) {
        Registry.register(Registry.ITEM, Util.id(id), item);
    }

}
