
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import net.addie.aitplus.world.inventory.RoundelTableGuiMenu;
import net.addie.aitplus.AitplusMod;

public class AitplusModMenus {
	public static MenuType<RoundelTableGuiMenu> ROUNDEL_TABLE_GUI;

	public static void load() {
		ROUNDEL_TABLE_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(AitplusMod.MODID, "roundel_table_gui"), new ExtendedScreenHandlerType<>(RoundelTableGuiMenu::new));
		RoundelTableGuiMenu.screenInit();
	}
}
