package net.addie.aitplus.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.addie.aitplus.init.AitplusModSounds;
import net.addie.aitplus.init.AitplusModEntities;
import net.addie.aitplus.AitplusMod;

public class MondasianCybermanEntity extends Monster implements RangedAttackMob {
	public MondasianCybermanEntity(EntityType<MondasianCybermanEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 10;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Villager.class, true, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ClassicDalekEntity.class, true, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DavarosEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, TimeWarDalekEntity.class, true, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, RenegadeDalekEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ReconnaissanceDalekEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ImperialDalekEntity.class, true, true));
		this.goalSelector.addGoal(9, new RandomStrollGoal(this, 0.4));
		this.targetSelector.addGoal(10, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(11, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(12, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(AitplusModSounds.CYBERMAN_MOVE, 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return AitplusModSounds.CYBERMAN_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		CyberLazerEntity.shoot(this, target);
	}

	public static void init() {
		BiomeModifications.create(new ResourceLocation(AitplusMod.MODID, "mondasiancyberman_entity_spawn")).add(ModificationPhase.ADDITIONS,
				BiomeSelectors.includeByKey(ResourceKey.create(Registries.BIOME, new ResourceLocation("aitplus:mondasian_snowlands")), ResourceKey.create(Registries.BIOME, new ResourceLocation("aitplus:deleted_mod_element"))),
				ctx -> ctx.getSpawnSettings().addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(AitplusModEntities.MONDASIAN_CYBERMAN, 15, 2, 4)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
