
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.addie.aitplus.block.entity.RoundelTableBlockEntity;
import net.addie.aitplus.AitplusMod;

public class AitplusModBlockEntities {
	public static BlockEntityType<?> ROUNDEL_TABLE;

	public static void load() {
		ROUNDEL_TABLE = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(AitplusMod.MODID, "roundel_table"), FabricBlockEntityTypeBuilder.create(RoundelTableBlockEntity::new, AitplusModBlocks.ROUNDEL_TABLE).build(null));
	}
}
