
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

import net.addie.aitplus.entity.ClassicDalekEntity;
import net.addie.aitplus.client.model.Modelold_dalek;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ClassicDalekRenderer extends MobRenderer<ClassicDalekEntity, Modelold_dalek<ClassicDalekEntity>> {
	public ClassicDalekRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelold_dalek(context.bakeLayer(Modelold_dalek.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ClassicDalekEntity, Modelold_dalek<ClassicDalekEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("aitplus:textures/entities/old_dalek_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ClassicDalekEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modelold_dalek(Minecraft.getInstance().getEntityModels().bakeLayer(Modelold_dalek.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ClassicDalekEntity entity) {
		return new ResourceLocation("aitplus:textures/entities/old_dalek.png");
	}

}
