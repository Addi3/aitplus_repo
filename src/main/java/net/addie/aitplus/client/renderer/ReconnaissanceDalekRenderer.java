
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

import net.addie.aitplus.entity.ReconnaissanceDalekEntity;
import net.addie.aitplus.client.model.Modelreconnaissance_dalek;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ReconnaissanceDalekRenderer extends MobRenderer<ReconnaissanceDalekEntity, Modelreconnaissance_dalek<ReconnaissanceDalekEntity>> {
	public ReconnaissanceDalekRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreconnaissance_dalek(context.bakeLayer(Modelreconnaissance_dalek.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ReconnaissanceDalekEntity, Modelreconnaissance_dalek<ReconnaissanceDalekEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("aitplus:textures/entities/reconnaissance_dalek_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ReconnaissanceDalekEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelreconnaissance_dalek(Minecraft.getInstance().getEntityModels().bakeLayer(Modelreconnaissance_dalek.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ReconnaissanceDalekEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/reconnaissance_dalek.png");
	}

}
