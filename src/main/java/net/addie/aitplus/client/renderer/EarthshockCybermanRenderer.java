
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.EarthshockCybermanEntity;
import net.addie.aitplus.client.model.Modelearthshock_cybermen;

public class EarthshockCybermanRenderer extends MobRenderer<EarthshockCybermanEntity, Modelearthshock_cybermen<EarthshockCybermanEntity>> {
	public EarthshockCybermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthshock_cybermen(context.bakeLayer(Modelearthshock_cybermen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EarthshockCybermanEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/earthshock_cybermen.png");
	}

}
