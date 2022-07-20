package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.simibubi.create.foundation.utility.VoxelShaper;
import com.xaros74.creategearaddon.index.AllModTileEntities;
import com.xaros74.creategearaddon.util.ShapeUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShaftlessCogWheel extends CogWheel implements ShapeUtil {

	private final VoxelShape SMALL_SHAFTLESS_COGWHEEL_SHAPE = cuboid(2, 6, 2, 14, 10, 14),
			LARGE_SHAFTLESS_COGWHEEL_SHAPE = cuboid(0, 6, 0, 16, 10, 16);
	private final VoxelShaper SMALL_SHAFTLESS_COGWHEEL = shape(SMALL_SHAFTLESS_COGWHEEL_SHAPE).forAxis(),
			LARGE_SHAFTLESS_COGWHEEL = shape(LARGE_SHAFTLESS_COGWHEEL_SHAPE).forAxis();

	public ShaftlessCogWheel(boolean large, Properties properties) {
		super(large, properties);
	}

	@Override
	public BlockEntityType<? extends SimpleKineticTileEntity> getTileEntityType() {
		return AllModTileEntities.getSHAFTLESS_COG_TILE().get();
	}
	
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand,
			BlockHitResult ray) {
				return InteractionResult.PASS;
		
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return (isLargeCog() ? LARGE_SHAFTLESS_COGWHEEL : SMALL_SHAFTLESS_COGWHEEL).get(state.getValue(AXIS));
	}

	@Override
	public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
		return false;
	}

}
