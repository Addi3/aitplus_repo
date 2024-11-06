
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.client.model.Modelvictorian_chair;
import net.addie.aitplus.client.model.Modelsilence;
import net.addie.aitplus.client.model.Modelreconnaissance_dalek;
import net.addie.aitplus.client.model.Modelold_dalek;
import net.addie.aitplus.client.model.Modeloffice_chair;
import net.addie.aitplus.client.model.Modelnew_dalek;
import net.addie.aitplus.client.model.Modelmondasian_cybermen;
import net.addie.aitplus.client.model.Modellazer;
import net.addie.aitplus.client.model.Modelfly;
import net.addie.aitplus.client.model.Modelflutterwing;
import net.addie.aitplus.client.model.Modelflubble;
import net.addie.aitplus.client.model.Modelearthshock_cybermen;
import net.addie.aitplus.client.model.Modeldavaros_chair;
import net.addie.aitplus.client.model.Modeldavaros;
import net.addie.aitplus.client.model.Modelcyber_leader_classic;
import net.addie.aitplus.client.model.Modelcoral_chair;

@Environment(EnvType.CLIENT)
public class AitplusModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modellazer.LAYER_LOCATION, Modellazer::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modeloffice_chair.LAYER_LOCATION, Modeloffice_chair::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelmondasian_cybermen.LAYER_LOCATION, Modelmondasian_cybermen::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflutterwing.LAYER_LOCATION, Modelflutterwing::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelreconnaissance_dalek.LAYER_LOCATION, Modelreconnaissance_dalek::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modeldavaros.LAYER_LOCATION, Modeldavaros::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelvictorian_chair.LAYER_LOCATION, Modelvictorian_chair::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelflubble.LAYER_LOCATION, Modelflubble::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelold_dalek.LAYER_LOCATION, Modelold_dalek::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modeldavaros_chair.LAYER_LOCATION, Modeldavaros_chair::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelearthshock_cybermen.LAYER_LOCATION, Modelearthshock_cybermen::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelnew_dalek.LAYER_LOCATION, Modelnew_dalek::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelsilence.LAYER_LOCATION, Modelsilence::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelcoral_chair.LAYER_LOCATION, Modelcoral_chair::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelfly.LAYER_LOCATION, Modelfly::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelcyber_leader_classic.LAYER_LOCATION, Modelcyber_leader_classic::createBodyLayer);
	}
}
