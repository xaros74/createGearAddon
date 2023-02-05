package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.xaros74.creategearaddon.index.AllModTileEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CogWheel extends CogWheelBlock {

	public CogWheel(boolean large, Properties properties) {
		super(large, properties);
	}

	@Override
	public BlockEntityType<? extends KineticTileEntity> getTileEntityType() {
		return AllModTileEntities.COG_TILE.get();
	}
	
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand,
		BlockHitResult ray) {
		return InteractionResult.PASS;
	}

}
