package net.addie.aitplus.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelcoral_chair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aitplus", "modelcoral_chair"), "main");
	public final ModelPart bb_main;

	public Modelcoral_chair(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(36, 38).addBox(-2.5F, -2.3F, -4.0F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 0).addBox(-1.0F, -9.1F, 2.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-3.0F, -0.2F, 0.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 11).addBox(-0.5F, -2.2F, -1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 34)
						.addBox(-2.5F, -2.2F, -4.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 15).addBox(-2.6F, -2.2F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(2.6F, -2.2F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 14).addBox(-2.5F, -2.2F, -0.9F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-6.0F, -11.2F, -1.0F, 12.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 38).addBox(-4.0F, -9.7F, -3.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-9.0F, -9.1F, 2.0F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -11.0F, 7.9F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.25F, -4.5487F, -3.8485F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.25F, -12.033F, 5.2938F, -1.8326F, 0.1309F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-3.25F, 0.833F, -7.2938F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.25F, -12.033F, 6.2938F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 24).mirror().addBox(-3.25F, -2.6168F, -5.3309F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.25F, -13.033F, 6.2938F, -1.8326F, 0.1309F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 34).addBox(-0.75F, -4.5487F, -3.8485F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.25F, -12.033F, 5.2938F, -1.8326F, -0.1309F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 41).addBox(-4.75F, -2.6168F, -5.3309F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.25F, -13.033F, 6.2938F, -1.8326F, -0.1309F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 47).addBox(-4.75F, 0.833F, -7.2938F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.25F, -12.033F, 6.2938F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -6.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.9F, 8.2F, -1.8326F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
