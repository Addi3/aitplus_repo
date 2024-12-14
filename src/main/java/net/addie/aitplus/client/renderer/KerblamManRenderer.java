
package net.addie.aitplus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.addie.aitplus.entity.KerblamManEntity;
import net.addie.aitplus.client.model.Modelkerblam_man;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class KerblamManRenderer extends MobRenderer<KerblamManEntity, Modelkerblam_man<KerblamManEntity>> {
	public KerblamManRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkerblam_man(context.bakeLayer(Modelkerblam_man.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<KerblamManEntity, Modelkerblam_man<KerblamManEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("aitplus:textures/entities/kerblam_man_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KerblamManEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelkerblam_man(Minecraft.getInstance().getEntityModels().bakeLayer(Modelkerblam_man.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(KerblamManEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/kerblam_man.png");
	}

}
