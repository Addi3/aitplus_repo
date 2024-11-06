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
public class Modeloffice_chair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aitplus", "modeloffice_chair"), "main");
	public final ModelPart body;
	public final ModelPart legs;
	public final ModelPart back;
	public final ModelPart chair;
	public final ModelPart arms;

	public Modeloffice_chair(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = this.body.getChild("legs");
		this.back = this.body.getChild("back");
		this.chair = this.body.getChild("chair");
		this.arms = this.body.getChild("arms");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 16.4F, 0.0F));
		PartDefinition legs = body.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(12, 53).addBox(5.75F, 2.5F, -6.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56).addBox(7.95F, 5.5F, -6.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56)
						.addBox(5.55F, 5.5F, -6.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56).mirror().addBox(-7.95F, 5.5F, -6.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 56).mirror()
						.addBox(-5.55F, 5.5F, -6.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 56).mirror().addBox(-7.95F, 5.5F, 4.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 56).mirror()
						.addBox(-5.55F, 5.5F, 4.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 56).addBox(5.55F, 5.5F, 4.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56)
						.addBox(7.95F, 5.5F, 4.75F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 53).addBox(-7.75F, 2.5F, -6.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(5.75F, 0.5F, 4.75F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 44).addBox(-7.75F, 0.5F, 4.75F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = legs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(14, 56).addBox(1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56).addBox(-1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.75F, 6.5F, 5.75F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = legs.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 56).mirror()
				.addBox(1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.75F, 6.5F, 5.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r3 = legs.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 56).mirror()
				.addBox(1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.75F, 6.5F, -5.75F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r4 = legs.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(14, 56).addBox(1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56).addBox(-1.2F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.75F, 6.5F, -5.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 37).addBox(-3.0F, 1.5F, -8.25F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -21.0F, 13.0F));
		PartDefinition chair = body.addOrReplaceChild("chair",
				CubeListBuilder.create().texOffs(0, 17).addBox(-6.0F, -12.5F, 3.75F, 14.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(-6.0F, -12.5F, 0.75F, 0.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 44)
						.addBox(8.0F, -12.5F, 0.75F, 0.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 5.0F, -7.5F, 14.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-6.0F, 6.0F, -7.7F, 14.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -5.0F, 1.0F));
		PartDefinition arms = body.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(32, 17).addBox(6.0F, 3.0F, -6.25F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 35).addBox(-9.0F, 3.0F, -6.25F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -6.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
