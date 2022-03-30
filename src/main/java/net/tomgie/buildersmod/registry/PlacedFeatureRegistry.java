package net.tomgie.buildersmod.registry;

import java.util.Arrays;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.tomgie.buildersmod.Util;

public class PlacedFeatureRegistry {

    public static PlacedFeature PALLADIUM_ORE = new PlacedFeature(RegistryEntry.of(ConfiguredFeatureRegistry.PALLADIUM_ORE), Arrays.asList(CountPlacementModifier.of(2), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(64))));
    public static PlacedFeature DEEPSLATE_PALLADIUM_ORE = new PlacedFeature(RegistryEntry.of(ConfiguredFeatureRegistry.DEEPSLATE_PALLADIUM_ORE), Arrays.asList(CountPlacementModifier.of(4), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(24))));

    public static void registerPlacedFeatures() {
        registerAndAdd("palladium_ore", PALLADIUM_ORE);
        registerAndAdd("deepslate_palladium_ore", DEEPSLATE_PALLADIUM_ORE);
    }

    private static void registerAndAdd(String id, PlacedFeature placedFeature) {
        Registry.register(BuiltinRegistries.PLACED_FEATURE, Util.id(id), placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, Util.id(id)));
    }

}
