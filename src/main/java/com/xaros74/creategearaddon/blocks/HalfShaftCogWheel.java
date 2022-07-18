package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.foundation.utility.VoxelShaper;
import com.xaros74.creategearaddon.index.AllModTileEntities;
import com.xaros74.creategearaddon.util.ShapeUtil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class HalfShaftCogWheel extends CogWheel implements ShapeUtil{
	private final VoxelShape SMALL_HALF_SHAFT_COGWHEEL_SHAPE = cuboid(2, 6, 2, 14, 10, 14),
			LARGE_HALF_SHAFT_COGWHEEL_SHAPE = cuboid(0, 6, 0, 16, 10, 16);

	private final VoxelShaper SMALL_HALF_SHAFT_COGWHEEL = shape(SMALL_HALF_SHAFT_COGWHEEL_SHAPE).add(5, 6, 5, 11, 16, 11).forDirectional(),
			LARGE_HALF_SHAFT_COGWHEEL = shape(LARGE_HALF_SHAFT_COGWHEEL_SHAPE).add(5, 6, 5, 11, 16, 11).forDirectional();

	public static final BooleanProperty AXIS_DIRECTION = BooleanProperty.create("axis_direction");

	public HalfShaftCogWheel(boolean large, Properties properties) {
		super(large, properties);
		registerDefaultState(this.defaultBlockState().setValue(AXIS_DIRECTION,
				axisDirectionToBool(Direction.AxisDirection.POSITIVE)));
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return AllModTileEntities.getHALFSHAFT_COG_TILE().create();
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Direction dir = Direction.fromAxisAndDirection(state.getValue(AXIS),
				boolToAxisDirection(state.getValue(AXIS_DIRECTION)));
		return isLargeCog() ? LARGE_HALF_SHAFT_COGWHEEL.get(dir) : SMALL_HALF_SHAFT_COGWHEEL.get(dir);
	}

	public static boolean axisDirectionToBool(Direction.AxisDirection dir) {
		return dir == Direction.AxisDirection.POSITIVE;
	}

	public static Direction.AxisDirection boolToAxisDirection(boolean bool) {
		return bool ? Direction.AxisDirection.POSITIVE : Direction.AxisDirection.NEGATIVE;
	}

	@Override
	public boolean hasShaftTowards(IWorldReader world, BlockPos pos, BlockState state, Direction face) {
		return face.getAxis() == state.getValue(AXIS)
				&& face.getAxisDirection() == boolToAxisDirection(state.getValue(AXIS_DIRECTION));
	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(AXIS_DIRECTION);
		super.createBlockStateDefinition(builder);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		Direction dir = context.getClickedFace().getOpposite();
		boolean b = axisDirectionToBool(dir.getAxisDirection());
		Direction.Axis a = dir.getAxis();
		return super.getStateForPlacement(context).setValue(AXIS_DIRECTION, context.getPlayer().isShiftKeyDown() != b)
				.setValue(AXIS, a);
	}
}
