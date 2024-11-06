
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.SilenceEntity;
import net.addie.aitplus.client.model.Modelsilence;

public class SilenceRenderer extends MobRenderer<SilenceEntity, Modelsilence<SilenceEntity>> {
	public SilenceRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsilence(context.bakeLayer(Modelsilence.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SilenceEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/silence.png");
	}

}
