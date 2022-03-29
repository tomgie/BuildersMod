package net.tomgie.buildersmod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;
import net.tomgie.buildersmod.item.DeepslatePalladiumOreItem;
import net.tomgie.buildersmod.item.PalladiumOreItem;

public class ItemRegistry {

    public static final Item PALLADIUM_ORE = new PalladiumOreItem(BlockRegistry.PALLADIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_PALLADIUM_ORE = new DeepslatePalladiumOreItem(BlockRegistry.DEEPSLATE_PALLADIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
    }

    private static void registerAndAdd(String id, Item item) {
        Registry.register(Registry.ITEM, Util.id(id), item);
    }

}
