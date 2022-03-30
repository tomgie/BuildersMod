package net.tomgie.buildersmod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;
import net.tomgie.buildersmod.item.PolymerArmorItem;
import net.tomgie.buildersmod.item.PolymerAxeItem;
import net.tomgie.buildersmod.item.PolymerBlockItem;
import net.tomgie.buildersmod.item.PolymerHoeItem;
import net.tomgie.buildersmod.item.PolymerItem;
import net.tomgie.buildersmod.item.PolymerPickaxeItem;
import net.tomgie.buildersmod.item.PolymerShovelItem;
import net.tomgie.buildersmod.item.PolymerSwordItem;
import net.tomgie.buildersmod.material.PalladiumArmorMaterial;
import net.tomgie.buildersmod.material.PalladiumToolMaterial;

public class ItemRegistry {

    public static final Item PALLADIUM_ORE = new PolymerBlockItem(BlockRegistry.PALLADIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS), "palladium_ore");
    public static final Item DEEPSLATE_PALLADIUM_ORE = new PolymerBlockItem(BlockRegistry.DEEPSLATE_PALLADIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS), "deepslate_palladium_ore");
    public static final Item RAW_PALLADIUM = new PolymerItem(new FabricItemSettings().group(ItemGroup.MISC), "raw_palladium");
    public static final Item PALLADIUM_INGOT = new PolymerItem(new FabricItemSettings().group(ItemGroup.MISC), "palladium_ingot");
    public static final Item PALLADIUM_BLOCK = new PolymerBlockItem(BlockRegistry.PALLADIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS), "palladium_block");
    public static final Item PALLADIUM_HELMET = new PolymerArmorItem(PalladiumArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PALLADIUM_CHESTPLATE = new PolymerArmorItem(PalladiumArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PALLADIUM_LEGGINGS = new PolymerArmorItem(PalladiumArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PALLADIUM_BOOTS = new PolymerArmorItem(PalladiumArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item PALLADIUM_SWORD = new PolymerSwordItem(PalladiumToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(ItemGroup.COMBAT), "palladium_sword");
    public static final Item PALLADIUM_PICKAXE = new PolymerPickaxeItem(PalladiumToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(ItemGroup.TOOLS), "palladium_pickaxe");
    public static final Item PALLADIUM_AXE = new PolymerAxeItem(PalladiumToolMaterial.INSTANCE, 5.5f, -3.0f, new FabricItemSettings().group(ItemGroup.TOOLS), "palladium_axe");
    public static final Item PALLADIUM_SHOVEL = new PolymerShovelItem(PalladiumToolMaterial.INSTANCE, 1.5f, -3.0f, new FabricItemSettings().group(ItemGroup.TOOLS), "palladium_shovel");
    public static final Item PALLADIUM_HOE = new PolymerHoeItem(PalladiumToolMaterial.INSTANCE, -3, -0.5f, new FabricItemSettings().group(ItemGroup.TOOLS), "palladium_hoe");

    public static void registerItems() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
        registerAndAdd("raw_palladium", RAW_PALLADIUM);
        registerAndAdd("palladium_ingot", PALLADIUM_INGOT);
        registerAndAdd("palladium_block", PALLADIUM_BLOCK);
        registerAndAdd("palladium_helmet", PALLADIUM_HELMET);
        registerAndAdd("palladium_chestplate", PALLADIUM_CHESTPLATE);
        registerAndAdd("palladium_leggings", PALLADIUM_LEGGINGS);
        registerAndAdd("palladium_boots", PALLADIUM_BOOTS);
        registerAndAdd("palladium_sword", PALLADIUM_SWORD);
        registerAndAdd("palladium_pickaxe", PALLADIUM_PICKAXE);
        registerAndAdd("palladium_axe", PALLADIUM_AXE);
        registerAndAdd("palladium_shovel", PALLADIUM_SHOVEL);
        registerAndAdd("palladium_hoe", PALLADIUM_HOE);
    }

    private static void registerAndAdd(String id, Item item) {
        Registry.register(Registry.ITEM, Util.id(id), item);
    }

}
