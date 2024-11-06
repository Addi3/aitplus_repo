
package net.addie.aitplus.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.addie.aitplus.procedures.CandelStandLitUpdateTickProcedure;
import net.addie.aitplus.procedures.CandelStandLitOnBlockRightClickedProcedure;
import net.addie.aitplus.init.AitplusModBlocks;

import java.util.List;
import java.util.Collections;

public class CandelStandLitBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().requiresCorrectToolForDrops().sound(SoundType.CHAIN).strength(1f, 10f).lightLevel(s -> 6).requiresCorrectToolForDrops().noOcclusion()
			.isRedstoneConductor((bs, br, bp) -> false);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CandelStandLitBlock() {
		super(PROPERTIES);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return (switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6, 24, 6, 10, 26, 10), box(6, 0, 6, 10, 2, 10), box(7, 24, 7, 9, 29, 9), box(-4, 25, 6, 0, 27, 10), box(-3, 25, 7, -1, 30, 9), box(16, 25, 6, 20, 27, 10), box(17, 25, 7, 19, 30, 9), box(7, 2, 7, 9, 24, 9));
			case NORTH -> Shapes.or(box(6, 24, 6, 10, 26, 10), box(6, 0, 6, 10, 2, 10), box(7, 24, 7, 9, 29, 9), box(16, 25, 6, 20, 27, 10), box(17, 25, 7, 19, 30, 9), box(-4, 25, 6, 0, 27, 10), box(-3, 25, 7, -1, 30, 9), box(7, 2, 7, 9, 24, 9));
			case EAST -> Shapes.or(box(6, 24, 6, 10, 26, 10), box(6, 0, 6, 10, 2, 10), box(7, 24, 7, 9, 29, 9), box(6, 25, 16, 10, 27, 20), box(7, 25, 17, 9, 30, 19), box(6, 25, -4, 10, 27, 0), box(7, 25, -3, 9, 30, -1), box(7, 2, 7, 9, 24, 9));
			case WEST -> Shapes.or(box(6, 24, 6, 10, 26, 10), box(6, 0, 6, 10, 2, 10), box(7, 24, 7, 9, 29, 9), box(6, 25, -4, 10, 27, 0), box(7, 25, -3, 9, 30, -1), box(6, 25, 16, 10, 27, 20), box(7, 25, 17, 9, 30, 19), box(7, 2, 7, 9, 24, 9));
		}).move(offset.x, offset.y, offset.z);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(AitplusModBlocks.CANDLE_STAND));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 20);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CandelStandLitUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 20);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		CandelStandLitOnBlockRightClickedProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(AitplusModBlocks.CANDEL_STAND_LIT, RenderType.cutout());
	}
}
