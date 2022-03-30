package net.tomgie.buildersmod.item;

import org.jetbrains.annotations.Nullable;

import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.resourcepack.PolymerArmorModel;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.tomgie.buildersmod.Util;

public class PolymerArmorItem extends ArmorItem implements PolymerItem {

    private final PolymerModelData modelData;
    private final PolymerArmorModel armorModel;

    public PolymerArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
        this.modelData = PolymerRPUtils.requestModel(getItemFor(slot), Util.id("item/" + material.getName() + "_" + getStringFor(slot)));
        this.armorModel = PolymerRPUtils.requestArmor(Util.id(material.getName()));
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return modelData.item();
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return modelData.value();
    }

    @Override
    public int getPolymerArmorColor(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return this.armorModel.value();
    }

    private static Item getItemFor(EquipmentSlot slot) {
        return switch (slot) {
        case HEAD -> Items.LEATHER_HELMET;
        case CHEST -> Items.LEATHER_CHESTPLATE;
        case LEGS -> Items.LEATHER_LEGGINGS;
        case FEET -> Items.LEATHER_BOOTS;
        default -> Items.AIR;
        };
    }

    private static String getStringFor(EquipmentSlot slot) {
        return switch (slot) {
        case HEAD -> "helmet";
        case CHEST -> "chestplate";
        case LEGS -> "leggings";
        case FEET -> "boots";
        default -> "";
        };
    }

}
