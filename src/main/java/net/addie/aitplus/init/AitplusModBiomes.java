
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;

import net.addie.aitplus.AitplusMod;

public class AitplusModBiomes {
	public static ResourceKey<Biome> GALLIFREY_DRYLANDS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "gallifrey_drylands"));
	public static ResourceKey<Biome> GALLIFREY_PLAINS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "gallifrey_plains"));
	public static ResourceKey<Biome> GALLIFREY_MOUNTAINS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "gallifrey_mountains"));
	public static ResourceKey<Biome> TRENZALORE_WASTES = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "trenzalore_wastes"));
	public static ResourceKey<Biome> PETRIFIED_JUNGLE = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "petrified_jungle"));
	public static ResourceKey<Biome> IRRADIATED_SWAMP = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "irradiated_swamp"));
	public static ResourceKey<Biome> MONDASIAN_SNOWLANDS = ResourceKey.create(Registries.BIOME, new ResourceLocation(AitplusMod.MODID, "mondasian_snowlands"));

	public static void loadEndBiomes() {
	}

	public static void load(MinecraftServer server) {
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();

		}
	}
}
