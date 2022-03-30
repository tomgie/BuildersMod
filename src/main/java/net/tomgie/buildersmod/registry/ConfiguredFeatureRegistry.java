package net.tomgie.buildersmod.registry;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.tomgie.buildersmod.Util;

public class ConfiguredFeatureRegistry {

    public static ConfiguredFeature<?, ?> PALLADIUM_ORE = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.PALLADIUM_ORE.getDefaultState(), 9));
    public static ConfiguredFeature<?, ?> DEEPSLATE_PALLADIUM_ORE = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_PALLADIUM_ORE.getDefaultState(), 9));

    public static void registerConfiguredFeatures() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
    }

    private static void registerAndAdd(String id, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, Util.id(id), configuredFeature);
    }

}
