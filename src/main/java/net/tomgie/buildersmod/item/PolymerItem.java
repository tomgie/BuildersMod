package net.tomgie.buildersmod.item;

import org.jetbrains.annotations.Nullable;

import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.tomgie.buildersmod.Util;

public class PolymerItem extends Item implements eu.pb4.polymer.api.item.PolymerItem {

    private final PolymerModelData modelData;

    public PolymerItem(Settings settings, String id) {
        super(settings);
        this.modelData = PolymerRPUtils.requestModel(Items.PAPER, Util.id("item/" + id));
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
