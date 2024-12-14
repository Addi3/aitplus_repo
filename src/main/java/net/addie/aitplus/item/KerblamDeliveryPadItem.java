
package net.addie.aitplus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.addie.aitplus.procedures.KerblamDeliveryPadRightclickedProcedure;
import net.addie.aitplus.init.AitplusModTabs;

import java.util.List;

public class KerblamDeliveryPadItem extends Item {
	public KerblamDeliveryPadItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AIT_PLUS_ITEMS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Kerblam man will appear 5 blocks infront of you"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		KerblamDeliveryPadRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}
