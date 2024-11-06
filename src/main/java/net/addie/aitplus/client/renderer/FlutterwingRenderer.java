
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.FlutterwingEntity;
import net.addie.aitplus.client.model.Modelflutterwing;

public class FlutterwingRenderer extends MobRenderer<FlutterwingEntity, Modelflutterwing<FlutterwingEntity>> {
	public FlutterwingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflutterwing(context.bakeLayer(Modelflutterwing.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlutterwingEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/flutterwing.png");
	}

}
