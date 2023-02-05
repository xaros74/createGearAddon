package com.xaros74.creategearaddon.tiles;

import java.util.List;

import com.simibubi.create.content.contraptions.relays.elementary.AbstractShaftBlock;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedTileEntityBehaviour;
import com.simibubi.create.foundation.tileEntity.TileEntityBehaviour;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CogTile extends BracketedKineticTileEntity {

	public CogTile(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
	
	@Override
	public void addBehaviours(List<TileEntityBehaviour> behaviours) {
		behaviours.add(new BracketedTileEntityBehaviour(this, state -> state.getBlock() instanceof AbstractShaftBlock));
		super.addBehaviours(behaviours);
	}

}
