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
public class Modelnew_dalek<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aitplus", "modelnew_dalek"), "main");
	public final ModelPart Skirt;
	public final ModelPart bulbs;
	public final ModelPart Torso;
	public final ModelPart GunArm;
	public final ModelPart SuctionArm;
	public final ModelPart ClawArm;
	public final ModelPart FlameThrowerArm;
	public final ModelPart Neck;
	public final ModelPart Head;
	public final ModelPart Eye;
	public final ModelPart LightLeft;
	public final ModelPart LightRight;

	public Modelnew_dalek(ModelPart root) {
		this.Skirt = root.getChild("Skirt");
		this.bulbs = this.Skirt.getChild("bulbs");
		this.Torso = root.getChild("Torso");
		this.GunArm = this.Torso.getChild("GunArm");
		this.SuctionArm = this.Torso.getChild("SuctionArm");
		this.ClawArm = this.Torso.getChild("ClawArm");
		this.FlameThrowerArm = this.Torso.getChild("FlameThrowerArm");
		this.Neck = root.getChild("Neck");
		this.Head = root.getChild("Head");
		this.Eye = this.Head.getChild("Eye");
		this.LightLeft = this.Head.getChild("LightLeft");
		this.LightRight = this.Head.getChild("LightRight");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt", CubeListBuilder.create().texOffs(0, 81).addBox(-6.5F, 11.0F, -8.5F, 13.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
				.addBox(-5.5F, 0.0F, -6.0F, 11.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-5.5F, 5.0F, -7.0F, 11.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition bulbs = Skirt.addOrReplaceChild("bulbs",
				CubeListBuilder.create().texOffs(0, 63).addBox(-6.0F, 1.5F, -3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, 1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-6.0F, 1.5F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, 1.5F, 5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-6.0F, -3.5F, -3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, -3.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-6.0F, -3.5F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, -3.5F, 5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).mirror()
						.addBox(5.0F, -3.5F, -3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, -3.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror()
						.addBox(5.0F, -3.5F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, -3.5F, 5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror()
						.addBox(5.0F, 1.5F, -3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, 1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror()
						.addBox(5.0F, 1.5F, 2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, 1.5F, 5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 5.5F, -1.5F));
		PartDefinition cube_r1 = bulbs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 63).addBox(-6.0F, 1.5F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, 1.5F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-6.0F, 1.5F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, 1.5F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = bulbs.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 63).addBox(-6.0F, -3.5F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, -3.5F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-6.0F, -3.5F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-6.0F, -3.5F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r3 = bulbs.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 63).mirror().addBox(5.0F, 1.5F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, 1.5F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 63).mirror().addBox(5.0F, 1.5F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, 1.5F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 63).mirror().addBox(5.0F, -3.5F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, -3.5F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 63).mirror().addBox(5.0F, -3.5F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63).mirror().addBox(5.0F, -3.5F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -6.0F, -4.5F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 22).addBox(-5.5F, -6.0F, -5.0F, 11.0F, 6.0F, 11.0F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition GunArm = Torso.addOrReplaceChild("GunArm", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 47)
				.addBox(-1.0F, 0.0F, -6.5F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 47).addBox(0.0F, -1.0F, -6.5F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -2.5F, -4.5F));
		PartDefinition SuctionArm = Torso.addOrReplaceChild("SuctionArm", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 25)
				.addBox(-1.5F, -1.5F, -10.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 29).addBox(-1.0F, -1.0F, -9.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.5F, -4.5F));
		PartDefinition ClawArm = Torso.addOrReplaceChild("ClawArm", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.5F, -4.5F));
		PartDefinition FlameThrowerArm = Torso.addOrReplaceChild("FlameThrowerArm",
				CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 47).addBox(-1.5F, 0.0F, -6.5F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 47)
						.addBox(0.0F, -1.5F, -6.5F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 40).addBox(-1.0F, -1.0F, -11.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -2.5F, -4.5F));
		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 0).addBox(-4.5F, -3.0F, -4.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-4.5F, -2.0F, -4.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(55, 10).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 1.5F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 0).addBox(-4.5F, -3.0F, -4.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-3.5F, -5.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-1.5F, -5.0F, -4.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 1.5F));
		PartDefinition Eye = Head.addOrReplaceChild("Eye",
				CubeListBuilder.create().texOffs(3, 12).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.5F, -4.5F));
		PartDefinition LightLeft = Head.addOrReplaceChild("LightLeft", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0736F, -2.3192F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition LightRight = Head.addOrReplaceChild("LightRight", CubeListBuilder.create().texOffs(21, 3).addBox(0.0736F, -2.3192F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -3.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Eye.xRot = headPitch / (180F / (float) Math.PI);
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.GunArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.SuctionArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
