
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import net.addie.aitplus.entity.VictorianChairEntity;
import net.addie.aitplus.entity.TimeWarDalekEntity;
import net.addie.aitplus.entity.SilenceEntity;
import net.addie.aitplus.entity.RevengeCyberLeaderEntity;
import net.addie.aitplus.entity.RenegadeDalekEntity;
import net.addie.aitplus.entity.ReconnaissanceDalekEntity;
import net.addie.aitplus.entity.OfficeChairEntity;
import net.addie.aitplus.entity.MondasianCybermanEntity;
import net.addie.aitplus.entity.LazerEntity;
import net.addie.aitplus.entity.ImperialDalekEntity;
import net.addie.aitplus.entity.FlyEntity;
import net.addie.aitplus.entity.FlutterwingEntity;
import net.addie.aitplus.entity.FlubbleEntity;
import net.addie.aitplus.entity.EarthshockCybermanEntity;
import net.addie.aitplus.entity.DavarosEntity;
import net.addie.aitplus.entity.CyberLazerEntity;
import net.addie.aitplus.entity.CoralChairEntity;
import net.addie.aitplus.entity.ClassicDalekEntity;
import net.addie.aitplus.AitplusMod;

public class AitplusModEntities {
	public static EntityType<VictorianChairEntity> VICTORIAN_CHAIR;
	public static EntityType<OfficeChairEntity> OFFICE_CHAIR;
	public static EntityType<CoralChairEntity> CORAL_CHAIR;
	public static EntityType<FlutterwingEntity> FLUTTERWING;
	public static EntityType<FlyEntity> FLY;
	public static EntityType<FlubbleEntity> FLUBBLE;
	public static EntityType<ClassicDalekEntity> CLASSIC_DALEK;
	public static EntityType<ImperialDalekEntity> IMPERIAL_DALEK;
	public static EntityType<RenegadeDalekEntity> RENEGADE_DALEK;
	public static EntityType<TimeWarDalekEntity> TIME_WAR_DALEK;
	public static EntityType<ReconnaissanceDalekEntity> RECONNAISSANCE_DALEK;
	public static EntityType<DavarosEntity> DAVAROS;
	public static EntityType<MondasianCybermanEntity> MONDASIAN_CYBERMAN;
	public static EntityType<EarthshockCybermanEntity> EARTHSHOCK_CYBERMAN;
	public static EntityType<RevengeCyberLeaderEntity> REVENGE_CYBER_LEADER;
	public static EntityType<SilenceEntity> SILENCE;
	public static EntityType<LazerEntity> LAZER;
	public static EntityType<CyberLazerEntity> CYBER_LAZER;

	public static void load() {
		VICTORIAN_CHAIR = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "victorian_chair"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, VictorianChairEntity::new).dimensions(new EntityDimensions(0.8f, 1.8f, true)).trackRangeBlocks(1).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		VictorianChairEntity.init();
		FabricDefaultAttributeRegistry.register(VICTORIAN_CHAIR, VictorianChairEntity.createAttributes());
		OFFICE_CHAIR = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "office_chair"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, OfficeChairEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(1).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		OfficeChairEntity.init();
		FabricDefaultAttributeRegistry.register(OFFICE_CHAIR, OfficeChairEntity.createAttributes());
		CORAL_CHAIR = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "coral_chair"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CoralChairEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(1).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CoralChairEntity.init();
		FabricDefaultAttributeRegistry.register(CORAL_CHAIR, CoralChairEntity.createAttributes());
		FLUTTERWING = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "flutterwing"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, FlutterwingEntity::new).dimensions(new EntityDimensions(0.7f, 0.6f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		FlutterwingEntity.init();
		FabricDefaultAttributeRegistry.register(FLUTTERWING, FlutterwingEntity.createAttributes());
		FLY = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "fly"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, FlyEntity::new).dimensions(new EntityDimensions(0.4f, 0.4f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		FlyEntity.init();
		FabricDefaultAttributeRegistry.register(FLY, FlyEntity.createAttributes());
		FLUBBLE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "flubble"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, FlubbleEntity::new).dimensions(new EntityDimensions(0.6f, 0.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		FlubbleEntity.init();
		FabricDefaultAttributeRegistry.register(FLUBBLE, FlubbleEntity.createAttributes());
		CLASSIC_DALEK = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "classic_dalek"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, ClassicDalekEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ClassicDalekEntity.init();
		FabricDefaultAttributeRegistry.register(CLASSIC_DALEK, ClassicDalekEntity.createAttributes());
		IMPERIAL_DALEK = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "imperial_dalek"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, ImperialDalekEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ImperialDalekEntity.init();
		FabricDefaultAttributeRegistry.register(IMPERIAL_DALEK, ImperialDalekEntity.createAttributes());
		RENEGADE_DALEK = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "renegade_dalek"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, RenegadeDalekEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		RenegadeDalekEntity.init();
		FabricDefaultAttributeRegistry.register(RENEGADE_DALEK, RenegadeDalekEntity.createAttributes());
		TIME_WAR_DALEK = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "time_war_dalek"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, TimeWarDalekEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		TimeWarDalekEntity.init();
		FabricDefaultAttributeRegistry.register(TIME_WAR_DALEK, TimeWarDalekEntity.createAttributes());
		RECONNAISSANCE_DALEK = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "reconnaissance_dalek"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, ReconnaissanceDalekEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ReconnaissanceDalekEntity.init();
		FabricDefaultAttributeRegistry.register(RECONNAISSANCE_DALEK, ReconnaissanceDalekEntity.createAttributes());
		DAVAROS = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "davaros"),
				FabricEntityTypeBuilder.create(MobCategory.MISC, DavarosEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DavarosEntity.init();
		FabricDefaultAttributeRegistry.register(DAVAROS, DavarosEntity.createAttributes());
		MONDASIAN_CYBERMAN = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "mondasian_cyberman"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, MondasianCybermanEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		MondasianCybermanEntity.init();
		FabricDefaultAttributeRegistry.register(MONDASIAN_CYBERMAN, MondasianCybermanEntity.createAttributes());
		EARTHSHOCK_CYBERMAN = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "earthshock_cyberman"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, EarthshockCybermanEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		EarthshockCybermanEntity.init();
		FabricDefaultAttributeRegistry.register(EARTHSHOCK_CYBERMAN, EarthshockCybermanEntity.createAttributes());
		REVENGE_CYBER_LEADER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "revenge_cyber_leader"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, RevengeCyberLeaderEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		RevengeCyberLeaderEntity.init();
		FabricDefaultAttributeRegistry.register(REVENGE_CYBER_LEADER, RevengeCyberLeaderEntity.createAttributes());
		SILENCE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "silence"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SilenceEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SilenceEntity.init();
		FabricDefaultAttributeRegistry.register(SILENCE, SilenceEntity.createAttributes());
		LAZER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "lazer"), createArrowEntityType(LazerEntity::new));
		CYBER_LAZER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "cyber_lazer"), createArrowEntityType(CyberLazerEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
