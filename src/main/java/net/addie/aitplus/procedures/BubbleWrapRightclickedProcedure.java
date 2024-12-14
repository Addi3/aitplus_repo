package net.addie.aitplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import net.addie.aitplus.init.AitplusModSounds;
import net.addie.aitplus.init.AitplusModItems;

public class BubbleWrapRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), AitplusModSounds.BUBBLE_WRAP_POP, SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, AitplusModSounds.BUBBLE_WRAP_POP, SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(AitplusModItems.BUBBLE_WRAP);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
