// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelearthshock_cybermen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "earthshock_cybermen"), "main");
	private final ModelPart player;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart body;
	private final ModelPart head;

	public Modelearthshock_cybermen(ModelPart root) {
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

		PartDefinition player = partdefinition.addOrReplaceChild("player", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = player.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(48, 24)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = player.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(16, 33)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition right_arm = player.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(32, 33)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(48, 40)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition left_arm = player.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(48, 8)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition left_sleeve_r1 = left_arm.addOrReplaceChild(
				"left_sleeve_r1", CubeListBuilder.create().texOffs(32, 33).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 12.0F,
						4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = player.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(24, 17)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition head = player.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
						.addBox(-2.0F, -11.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
						.addBox(-6.0F, -11.0F, 0.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		player.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}