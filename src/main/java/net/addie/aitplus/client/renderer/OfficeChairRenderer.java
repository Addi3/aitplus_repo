
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.OfficeChairEntity;
import net.addie.aitplus.client.model.Modeloffice_chair;

public class OfficeChairRenderer extends MobRenderer<OfficeChairEntity, Modeloffice_chair<OfficeChairEntity>> {
	public OfficeChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloffice_chair(context.bakeLayer(Modeloffice_chair.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(OfficeChairEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/chair2.png");
	}

}
