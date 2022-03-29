package net.tomgie.buildersmod.registry;

import java.util.HashMap;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;
import net.tomgie.buildersmod.block.PalladiumOreBlock;

public class BlockRegistry {

    public static final HashMap<String, Block> BLOCKS = new HashMap<>();

    public static final Block PALLADIUM_ORE = new PalladiumOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f));

    public static void registerBlocks() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
    }

    private static void registerAndAdd(String id, Block item) {
        BLOCKS.put(id, item);
        Registry.register(Registry.BLOCK, Util.id(id), item);
    }

}
