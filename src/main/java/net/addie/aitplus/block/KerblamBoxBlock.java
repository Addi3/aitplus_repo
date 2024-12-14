
package net.addie.aitplus.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.init.AitplusModSounds;
import net.addie.aitplus.init.AitplusModBlocks;

public class KerblamBoxBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS)
			.sound(new SoundType(1.0f, 1.0f, AitplusModSounds.KERBLAM_BOX_BREAK, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.scaffolding.step")), AitplusModSounds.KERBLAM_BOX_PLACE,
					BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.scaffolding.hit")), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.scaffolding.fall"))))
			.strength(0.2f, 0.5f);

	public KerblamBoxBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(AitplusModBlocks.KERBLAM_BOX, RenderType.solid());
	}
}
