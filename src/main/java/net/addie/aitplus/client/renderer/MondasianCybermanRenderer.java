
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

import net.addie.aitplus.entity.MondasianCybermanEntity;
import net.addie.aitplus.client.model.Modelmondasian_cybermen;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MondasianCybermanRenderer extends MobRenderer<MondasianCybermanEntity, Modelmondasian_cybermen<MondasianCybermanEntity>> {
	public MondasianCybermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmondasian_cybermen(context.bakeLayer(Modelmondasian_cybermen.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<MondasianCybermanEntity, Modelmondasian_cybermen<MondasianCybermanEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("aitplus:textures/entities/mondasian_cybermen_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MondasianCybermanEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelmondasian_cybermen(Minecraft.getInstance().getEntityModels().bakeLayer(Modelmondasian_cybermen.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MondasianCybermanEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/mondasian_cybermen.png");
	}

}
