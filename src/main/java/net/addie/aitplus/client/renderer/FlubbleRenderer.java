
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.FlubbleEntity;
import net.addie.aitplus.client.model.Modelflubble;

public class FlubbleRenderer extends MobRenderer<FlubbleEntity, Modelflubble<FlubbleEntity>> {
	public FlubbleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflubble(context.bakeLayer(Modelflubble.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlubbleEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/flubble.png");
	}

}
