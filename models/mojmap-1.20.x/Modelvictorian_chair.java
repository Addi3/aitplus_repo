// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvictorian_chair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "victorian_chair"), "main");
	private final ModelPart body;
	private final ModelPart legs;
	private final ModelPart back;
	private final ModelPart chair;
	private final ModelPart arms;

	public Modelvictorian_chair(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = this.body.getChild("legs");
		this.back = this.body.getChild("back");
		this.chair = this.body.getChild("chair");
		this.arms = this.body.getChild("arms");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(16, 55)
						.addBox(5.75F, 3.5F, -6.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 55)
						.addBox(-7.75F, 3.5F, -6.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(5.75F, 0.5F, 4.75F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 55)
						.addBox(-7.75F, 0.5F, 4.75F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back = body.addOrReplaceChild("back",
				CubeListBuilder.create().texOffs(33, 39)
						.addBox(-5.0F, 11.0F, -7.75F, 16.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-5.0F, 11.0F, -7.55F, 16.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-1.0F, 4.5F, -8.25F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(-2.0F, 3.0F, -7.25F, 10.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 50)
						.addBox(-3.0F, 25.0F, -19.625F, 12.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -21.0F, 13.0F));

		PartDefinition chair = body.addOrReplaceChild("chair",
				CubeListBuilder.create().texOffs(0, 38)
						.addBox(-6.0F, -9.5F, 3.75F, 14.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 5.0F, -8.5F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -5.0F, 1.0F));

		PartDefinition arms = body.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(6.0F, 3.0F, -8.25F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(32, 18)
						.addBox(-9.0F, 3.0F, -8.25F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}