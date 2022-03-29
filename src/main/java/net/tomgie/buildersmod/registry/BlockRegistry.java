package net.tomgie.buildersmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.tomgie.buildersmod.Util;
import net.tomgie.buildersmod.block.DeepslatePalladiumOreBlock;
import net.tomgie.buildersmod.block.PalladiumOreBlock;

public class BlockRegistry {

    public static final Block PALLADIUM_ORE = new PalladiumOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f));
    public static final Block DEEPSLATE_PALLADIUM_ORE = new DeepslatePalladiumOreBlock(FabricBlockSettings.copy(PALLADIUM_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE));

    public static void registerBlocks() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
    }

    private static void registerAndAdd(String id, Block item) {
        Registry.register(Registry.BLOCK, Util.id(id), item);
    }

}
