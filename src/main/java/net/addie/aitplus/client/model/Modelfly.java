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
public class Modelfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aitplus", "modelfly"), "main");
	public final ModelPart Fly;
	public final ModelPart Wing1;
	public final ModelPart Wing2;

	public Modelfly(ModelPart root) {
		this.Fly = root.getChild("Fly");
		this.Wing1 = root.getChild("Wing1");
		this.Wing2 = root.getChild("Wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Fly = partdefinition.addOrReplaceChild("Fly", CubeListBuilder.create().texOffs(2, 2).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Wing1 = partdefinition.addOrReplaceChild("Wing1", CubeListBuilder.create().texOffs(-3, 0).mirror().addBox(0.0F, 0.0F, -1.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, 22.0F, -0.5F));
		PartDefinition Wing2 = partdefinition.addOrReplaceChild("Wing2", CubeListBuilder.create().texOffs(-3, 0).addBox(-2.0F, 0.0F, -1.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 22.0F, -0.5F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Fly.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wing1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Wing2.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Wing1.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
