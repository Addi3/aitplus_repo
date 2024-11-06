// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelflutterwing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flutterwing"), "main");
	private final ModelPart Flutterwing;
	private final ModelPart Head;
	private final ModelPart Wings;
	private final ModelPart Wing1;
	private final ModelPart Wing2;

	public Modelflutterwing(ModelPart root) {
		this.Flutterwing = root.getChild("Flutterwing");
		this.Head = this.Flutterwing.getChild("Head");
		this.Wings = this.Flutterwing.getChild("Wings");
		this.Wing1 = this.Wings.getChild("Wing1");
		this.Wing2 = this.Wings.getChild("Wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Flutterwing = partdefinition
				.addOrReplaceChild("Flutterwing",
						CubeListBuilder.create().texOffs(16, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Head = Flutterwing.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(16, 8)
						.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-2.0F, -9.0F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition Wings = Flutterwing.addOrReplaceChild("Wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition Wing1 = Wings.addOrReplaceChild("Wing1",
				CubeListBuilder.create().texOffs(0, 23).mirror()
						.addBox(0.0F, -9.5F, 0.0F, 16.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -8.5F, 0.0F));

		PartDefinition Wing2 = Wings.addOrReplaceChild("Wing2", CubeListBuilder.create().texOffs(0, 23).addBox(-16.0F,
				-9.5F, 0.0F, 16.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -8.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Flutterwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Wing2.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Wing1.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}