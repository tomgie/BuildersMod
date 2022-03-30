package net.tomgie.buildersmod.item;

import javax.annotation.Nullable;

import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.network.ServerPlayerEntity;
import net.tomgie.buildersmod.Util;

public class PolymerSwordItem extends SwordItem implements PolymerItem {

    private final PolymerModelData modelData;

    public PolymerSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, String id) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.modelData = PolymerRPUtils.requestModel(Items.DIAMOND_SWORD, Util.id("item/" + id));
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return modelData.item();
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return modelData.value();
    }

}
