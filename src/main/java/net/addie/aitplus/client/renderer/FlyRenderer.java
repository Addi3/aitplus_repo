
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.FlyEntity;
import net.addie.aitplus.client.model.Modelfly;

public class FlyRenderer extends MobRenderer<FlyEntity, Modelfly<FlyEntity>> {
	public FlyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfly(context.bakeLayer(Modelfly.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/fly.png");
	}

}
