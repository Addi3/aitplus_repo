package net.addie.aitplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import net.addie.aitplus.init.AitplusModSounds;

public class DoorsOnRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), AitplusModSounds.CLASSIC_DOOR, SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, AitplusModSounds.CLASSIC_DOOR, SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
