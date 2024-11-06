// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelold_dalek<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "old_dalek"), "main");
	private final ModelPart Skirt;
	private final ModelPart bulbs;
	private final ModelPart Torso;
	private final ModelPart GunArm;
	private final ModelPart SuctionArm;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Eye;
	private final ModelPart LightLeft;
	private final ModelPart LightRight;

	public Modelold_dalek(ModelPart root) {
		this.Skirt = root.getChild("Skirt");
		this.bulbs = this.Skirt.getChild("bulbs");
		this.Torso = root.getChild("Torso");
		this.GunArm = this.Torso.getChild("GunArm");
		this.SuctionArm = this.Torso.getChild("SuctionArm");
		this.Neck = root.getChild("Neck");
		this.Head = root.getChild("Head");
		this.Eye = this.Head.getChild("Eye");
		this.LightLeft = this.Head.getChild("LightLeft");
		this.LightRight = this.Head.getChild("LightRight");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt",
				CubeListBuilder.create().texOffs(0, 81)
						.addBox(-6.5F, 11.0F, -8.0F, 13.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-5.5F, 5.0F, -7.0F, 11.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-5.5F, 0.0F, -6.0F, 11.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 1.0F));

		PartDefinition bulbs = Skirt.addOrReplaceChild("bulbs", CubeListBuilder.create().texOffs(0, 63)
				.addBox(-12.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-12.0F, -2.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-12.0F, -2.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-12.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-11.9F, -7.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-11.9F, -7.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-11.9F, -7.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-11.9F, -7.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63).mirror()
				.addBox(-1.0F, -2.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63)
				.mirror().addBox(-1.1F, -7.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 63).mirror().addBox(-1.1F, -7.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 63).mirror()
				.addBox(-1.0F, -2.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63)
				.mirror().addBox(-1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 63).mirror().addBox(-1.1F, -7.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 63).mirror()
				.addBox(-1.1F, -7.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 63)
				.mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(6.0F, 9.0F, -4.0F));

		PartDefinition cube_r1 = bulbs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 63)
						.addBox(-0.5F, -1.0F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -6.0F, -1.7F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = bulbs.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 63)
						.addBox(-0.5F, -1.0F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, 4.0F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, 4.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, 4.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, 4.0F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -6.0F, 9.8F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bulbs.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 63)
						.addBox(-0.5F, -1.0F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -1.0F, 3.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -1.0F, -2.9F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-5.0F, -7.0F, -4.5F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 23)
						.addBox(-5.5F, -6.0F, -5.0F, 11.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, 1.0F));

		PartDefinition GunArm = Torso.addOrReplaceChild("GunArm",
				CubeListBuilder.create().texOffs(34, 39)
						.addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 47)
						.addBox(-1.0F, 0.0F, -6.5F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 39)
						.addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 41)
						.addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 47)
						.addBox(0.0F, -1.0F, -6.5F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -3.5F, -4.5F));

		PartDefinition SuctionArm = Torso.addOrReplaceChild("SuctionArm",
				CubeListBuilder.create().texOffs(21, 16)
						.addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 25)
						.addBox(-1.5F, -1.5F, -10.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 29)
						.addBox(-1.0F, -1.0F, -9.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -3.5F, -4.5F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-3.5F, -5.0F, -3.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-4.5F, -2.0F, -4.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(55, 10)
						.addBox(-4.5F, -4.0F, -4.0F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(55, 10)
						.addBox(-4.5F, -3.0F, -4.0F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 1.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(19, 0)
						.addBox(-4.5F, -4.0F, -4.0F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -6.0F, -3.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 1.0F));

		PartDefinition Eye = Head.addOrReplaceChild("Eye",
				CubeListBuilder.create().texOffs(0, 13)
						.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5F, -3.0F));

		PartDefinition LightLeft = Head.addOrReplaceChild("LightLeft", CubeListBuilder.create().texOffs(21, 0).addBox(
				-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -4.0F, 0.5F));

		PartDefinition LightRight = Head.addOrReplaceChild("LightRight", CubeListBuilder.create().texOffs(21, 2).addBox(
				-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -4.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Eye.xRot = headPitch / (180F / (float) Math.PI);
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.GunArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.SuctionArm.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}