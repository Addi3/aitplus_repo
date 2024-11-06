
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.RevengeCyberLeaderEntity;
import net.addie.aitplus.client.model.Modelcyber_leader_classic;

public class RevengeCyberLeaderRenderer extends MobRenderer<RevengeCyberLeaderEntity, Modelcyber_leader_classic<RevengeCyberLeaderEntity>> {
	public RevengeCyberLeaderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcyber_leader_classic(context.bakeLayer(Modelcyber_leader_classic.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RevengeCyberLeaderEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/cyber_leader_classic.png");
	}

}
