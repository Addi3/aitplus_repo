
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

import net.addie.aitplus.entity.DavarosEntity;
import net.addie.aitplus.client.model.Modeldavaros;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DavarosRenderer extends MobRenderer<DavarosEntity, Modeldavaros<DavarosEntity>> {
	public DavarosRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldavaros(context.bakeLayer(Modeldavaros.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<DavarosEntity, Modeldavaros<DavarosEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("aitplus:textures/entities/davaros_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, DavarosEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modeldavaros(Minecraft.getInstance().getEntityModels().bakeLayer(Modeldavaros.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DavarosEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/davaros.png");
	}

}
