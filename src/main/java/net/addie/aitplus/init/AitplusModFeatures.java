
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.addie.aitplus.block.VargaPlantBlock;
import net.addie.aitplus.block.SchlenkBlossomsBlock;
import net.addie.aitplus.block.RedPetaledOrchidBlock;
import net.addie.aitplus.block.PreservedFlowerBlock;
import net.addie.aitplus.block.MoonlightBloomBlock;
import net.addie.aitplus.block.IridescentVelvetRedMadeviniaAridosaBlock;
import net.addie.aitplus.block.FlowerOfRemeberanceBlock;
import net.addie.aitplus.block.DalekaniumOreBlock;
import net.addie.aitplus.block.ArkytiorBlock;
import net.addie.aitplus.AitplusMod;

import java.util.function.Predicate;

public class AitplusModFeatures {
	public static void load() {
		register("dalekanium_ore", new OreFeature(OreConfiguration.CODEC), DalekaniumOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("arkytior", new RandomPatchFeature(RandomPatchConfiguration.CODEC), ArkytiorBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("flower_of_remeberance", new RandomPatchFeature(RandomPatchConfiguration.CODEC), FlowerOfRemeberanceBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("iridescent_velvet_red_madevinia_aridosa", new RandomPatchFeature(RandomPatchConfiguration.CODEC), IridescentVelvetRedMadeviniaAridosaBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("moonlight_bloom", new RandomPatchFeature(RandomPatchConfiguration.CODEC), MoonlightBloomBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("red_petaled_orchid", new RandomPatchFeature(RandomPatchConfiguration.CODEC), RedPetaledOrchidBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("schlenk_blossoms", new RandomPatchFeature(RandomPatchConfiguration.CODEC), SchlenkBlossomsBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("varga_plant", new RandomPatchFeature(RandomPatchConfiguration.CODEC), VargaPlantBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("preserved_flower", new RandomPatchFeature(RandomPatchConfiguration.CODEC), PreservedFlowerBlock.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
	}

	public static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(AitplusMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(AitplusMod.MODID, registryName)));
	}
}
