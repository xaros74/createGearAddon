package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.foundation.utility.VoxelShaper;
import com.xaros74.creategearaddon.util.ShapeUtil;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class ShaftlessCogWheel extends CogWheel implements ShapeUtil{
	private final VoxelShape SMALL_SHAFTLESS_COGWHEEL_SHAPE = cuboid(2, 6, 2, 14, 10, 14),
			LARGE_SHAFTLESS_COGWHEEL_SHAPE = cuboid(0, 6, 0, 16, 10, 16);
	private final VoxelShaper SMALL_SHAFTLESS_COGWHEEL = shape(SMALL_SHAFTLESS_COGWHEEL_SHAPE).forAxis(),
			LARGE_SHAFTLESS_COGWHEEL = shape(LARGE_SHAFTLESS_COGWHEEL_SHAPE).forAxis();

	public ShaftlessCogWheel(boolean large, Properties properties) {
		super(large, properties);
	}
	
	@Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return (isLargeCog() ? LARGE_SHAFTLESS_COGWHEEL : SMALL_SHAFTLESS_COGWHEEL).get(state.getValue(AXIS));
    }

    @Override
    public boolean hasShaftTowards(IWorldReader world, BlockPos pos, BlockState state, Direction face) {
        return false;
    }

}
