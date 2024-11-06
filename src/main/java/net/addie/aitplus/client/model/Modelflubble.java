package net.addie.aitplus.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelflubble<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aitplus", "modelflubble"), "main");
	public final ModelPart flubble;
	public final ModelPart legs;
	public final ModelPart leg6;
	public final ModelPart leg5;
	public final ModelPart leg4;
	public final ModelPart leg2;
	public final ModelPart leg;
	public final ModelPart leg3;
	public final ModelPart body;
	public final ModelPart head;

	public Modelflubble(ModelPart root) {
		this.flubble = root.getChild("flubble");
		this.legs = this.flubble.getChild("legs");
		this.leg6 = this.legs.getChild("leg6");
		this.leg5 = this.legs.getChild("leg5");
		this.leg4 = this.legs.getChild("leg4");
		this.leg2 = this.legs.getChild("leg2");
		this.leg = this.legs.getChild("leg");
		this.leg3 = this.legs.getChild("leg3");
		this.body = this.flubble.getChild("body");
		this.head = this.flubble.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition flubble = partdefinition.addOrReplaceChild("flubble", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 4.0F));
		PartDefinition legs = flubble.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg6 = legs.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, 1.0F));
		PartDefinition leg5 = legs.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, 1.0F));
		PartDefinition leg4 = legs.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, -5.0F));
		PartDefinition leg2 = legs.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -2.0F, -2.0F));
		PartDefinition leg = legs.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, -2.0F));
		PartDefinition leg3 = legs.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(16, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, -5.0F));
		PartDefinition body = flubble.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -6.0F, -6.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = flubble
				.addOrReplaceChild("head",
						CubeListBuilder.create().texOffs(0, 12).addBox(-3.5F, -3.0F, -4.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 5).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
								.addBox(2.5F, -4.0F, -2.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21).mirror().addBox(-5.5F, -4.0F, -2.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offset(0.5F, -5.0F, -6.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		flubble.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg5.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg6.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
