package net.addie.aitplus.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.addie.aitplus.init.AitplusModSounds;
import net.addie.aitplus.init.AitplusModBlocks;

public class KerblamManRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AitplusModBlocks.KERBLAM_BOX));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.GLOW, x, y, z, 25, 0.5, 3, 0.5, 1);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"execute as @e[type=aitplus:kerblam_man] run tellraw @p {\"text\":\"Remember, if you want it Kerblam it!\",\"color\":\"green\"}");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), AitplusModSounds.DELIVERY_FULFILLED, SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, AitplusModSounds.DELIVERY_FULFILLED, SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
