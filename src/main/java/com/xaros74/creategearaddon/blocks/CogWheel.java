package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.simibubi.create.content.contraptions.relays.elementary.ICogWheel;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.index.AllModTileEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CogWheel extends CogWheelBlock implements ICogWheel {
	
//	private final VoxelShape SMALL_COGWHEEL_SHAPE = cuboid(2, 6, 2, 14, 10, 14),
//			LARGE_COGWHEEL_SHAPE = cuboid(0, 6, 0, 16, 10, 16);
//
//	private final VoxelShaper SMALL_COGWHEEL = shape(SMALL_COGWHEEL_SHAPE).add(5, 6, 5, 11, 16, 11).forDirectional(),
//			LARGE_COGWHEEL = shape(LARGE_COGWHEEL_SHAPE).add(5, 6, 5, 11, 16, 11).forDirectional();

	public CogWheel(boolean large, Properties properties) {
		super(large, properties);
		
		CreateGearAddon.LOGGER.info("Type");
		CreateGearAddon.LOGGER.info(isLargeCog());
		
		
	}

	@Override
	public BlockEntityType<? extends KineticTileEntity> getTileEntityType() {
		return AllModTileEntities.COG_TILE.get();
	}
	
//	@Override
//	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
//		return isLargeCog() ? LARGE_COGWHEEL.get(state.getValue(AXIS)) : SMALL_COGWHEEL.get(state.getValue(AXIS));
//	}
	
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand,
		BlockHitResult ray) {
		return InteractionResult.PASS;
	}

}
