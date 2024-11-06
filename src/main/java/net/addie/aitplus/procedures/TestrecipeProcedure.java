package net.addie.aitplus.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.addie.aitplus.init.AitplusModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class TestrecipeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem ? _plrSlotItem.containerMenu.getSlot(0).getItem().getCount() : 0) >= 1
				&& (entity instanceof ServerPlayer _plrSlotItem ? _plrSlotItem.containerMenu.getSlot(0).getItem() : ItemStack.EMPTY).is(TagKey.create(Registries.ITEM, new ResourceLocation("aitplus:stained_glass_crafting")))) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(AitplusModBlocks.STRIPPED_DARK_OAK_LOG_STAINED_ROUNDEL);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
