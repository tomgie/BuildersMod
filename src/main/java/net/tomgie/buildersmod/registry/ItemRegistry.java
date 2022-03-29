package net.tomgie.buildersmod.registry;

import java.util.HashMap;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;

public class ItemRegistry {

    public static final HashMap<String, Item> ITEMS = new HashMap<>();

    // public static final Item DEEPSLATE_PALLADIUM_ORE

    public static void registerItems() {

    }

    private static void registerAndAdd(String id, Item item) {
        ITEMS.put(id, item);
        Registry.register(Registry.ITEM, Util.id(id), item);
    }

}
