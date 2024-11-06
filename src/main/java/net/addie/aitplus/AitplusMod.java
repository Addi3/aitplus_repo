/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.addie.aitplus;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.api.ModInitializer;

import net.addie.aitplus.init.AitplusModTabs;
import net.addie.aitplus.init.AitplusModSounds;
import net.addie.aitplus.init.AitplusModProcedures;
import net.addie.aitplus.init.AitplusModMenus;
import net.addie.aitplus.init.AitplusModItems;
import net.addie.aitplus.init.AitplusModFeatures;
import net.addie.aitplus.init.AitplusModEntities;
import net.addie.aitplus.init.AitplusModBlocks;
import net.addie.aitplus.init.AitplusModBlockEntities;
import net.addie.aitplus.init.AitplusModBiomes;

public class AitplusMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "aitplus";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing AitplusMod");

		AitplusModTabs.load();

		AitplusModEntities.load();
		AitplusModBlocks.load();
		AitplusModItems.load();
		AitplusModBlockEntities.load();
		AitplusModFeatures.load();

		AitplusModProcedures.load();

		AitplusModMenus.load();

		AitplusModSounds.load();

		AitplusModBiomes.loadEndBiomes();
		ServerLifecycleEvents.SERVER_STARTING.register((server) -> {
			AitplusModBiomes.load(server);
		});
	}
}
