
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.CoralChairEntity;
import net.addie.aitplus.client.model.Modelcoral_chair;

public class CoralChairRenderer extends MobRenderer<CoralChairEntity, Modelcoral_chair<CoralChairEntity>> {
	public CoralChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoral_chair(context.bakeLayer(Modelcoral_chair.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoralChairEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/coral_chair.png");
	}

}
