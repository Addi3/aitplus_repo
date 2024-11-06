package net.addie.aitplus.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import net.addie.aitplus.init.AitplusModSounds;
import net.addie.aitplus.init.AitplusModBlocks;

import java.util.Map;

public class ChalkBoardAltOnblockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockState _bs = AitplusModBlocks.CHALK_BOARD.defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), AitplusModSounds.CHALK_USE, SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, AitplusModSounds.CHALK_USE, SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
