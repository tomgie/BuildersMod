package net.tomgie.buildersmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;
import net.tomgie.buildersmod.block.PolymerOreBlock;

public class BlockRegistry {

    public static final Block PALLADIUM_ORE = new PolymerOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), "palladium_ore");
    public static final Block DEEPSLATE_PALLADIUM_ORE = new PolymerOreBlock(FabricBlockSettings.copy(PALLADIUM_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), "deepslate_palladium_ore");

    public static void registerBlocks() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
    }

    private static void registerAndAdd(String id, Block item) {
        Registry.register(Registry.BLOCK, Util.id(id), item);
    }

}
