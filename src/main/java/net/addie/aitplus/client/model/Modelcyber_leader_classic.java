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
public class Modelcyber_leader_classic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aitplus", "modelcyber_leader_classic"), "main");
	public final ModelPart player;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart body;
	public final ModelPart head;

	public Modelcyber_leader_classic(ModelPart root) {
		this.player = root.getChild("player");
		this.right_leg = this.player.getChild("right_leg");
		this.left_leg = this.player.getChild("left_leg");
		this.right_arm = this.player.getChild("right_arm");
		this.left_arm = this.player.getChild("left_arm");
		this.body = this.player.getChild("body");
		this.head = this.player.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition player = partdefinition.addOrReplaceChild("player", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg = player.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(1, 60).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));
		PartDefinition left_leg = player.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(16, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, -12.0F, 0.0F));
		PartDefinition right_arm = player.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(48, 59).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -22.0F, 0.0F));
		PartDefinition right_sleeve_r1 = right_arm.addOrReplaceChild("right_sleeve_r1", CubeListBuilder.create().texOffs(32, 42).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition left_arm = player.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(48, 42).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 42).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, -22.0F, 0.0F));
		PartDefinition body = player.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(32, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 50)
						.addBox(-3.0F, 1.0F, -4.0F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 5).addBox(-1.0F, 1.0F, -4.2F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-3.0F, 8.0F, -4.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 12).addBox(-1.5F, 8.0F, -4.2F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 25)
						.addBox(-3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 20).addBox(1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition head = player.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
				.addBox(-6.0F, -11.0F, 0.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 8).addBox(-2.0F, -11.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		player.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
