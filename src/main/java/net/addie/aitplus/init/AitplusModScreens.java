
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.addie.aitplus.client.gui.RoundelTableGuiScreen;

public class AitplusModScreens {
	public static void load() {
		MenuScreens.register(AitplusModMenus.ROUNDEL_TABLE_GUI, RoundelTableGuiScreen::new);
	}
}
