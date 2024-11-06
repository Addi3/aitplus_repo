
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.addie.aitplus.entity.VictorianChairEntity;
import net.addie.aitplus.client.model.Modelvictorian_chair;

public class VictorianChairRenderer extends MobRenderer<VictorianChairEntity, Modelvictorian_chair<VictorianChairEntity>> {
	public VictorianChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvictorian_chair(context.bakeLayer(Modelvictorian_chair.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(VictorianChairEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/chair.png");
	}

}
