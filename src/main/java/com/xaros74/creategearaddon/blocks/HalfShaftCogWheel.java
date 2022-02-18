package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.foundation.utility.VoxelShaper;
import com.xaros74.creategearaddon.util.ShapeUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

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
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
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
	public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
		return face.getAxis() == state.getValue(AXIS)
				&& face.getAxisDirection() == boolToAxisDirection(state.getValue(AXIS_DIRECTION));
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(AXIS_DIRECTION);
		super.createBlockStateDefinition(builder);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction dir = context.getClickedFace().getOpposite();
		boolean b = axisDirectionToBool(dir.getAxisDirection());
		Direction.Axis a = dir.getAxis();
		return super.getStateForPlacement(context).setValue(AXIS_DIRECTION, context.getPlayer().isShiftKeyDown() != b)
				.setValue(AXIS, a);
	}
}
