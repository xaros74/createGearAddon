package com.xaros74.creategearaddon.tiles;

import java.util.List;

import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.simibubi.create.foundation.tileEntity.TileEntityBehaviour;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class HalfshaftCogTile extends SimpleKineticTileEntity {

	public HalfshaftCogTile(BlockEntityType<? extends SimpleKineticTileEntity> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}

	@Override
	public void addBehaviours(List<TileEntityBehaviour> behaviours) {
		// don't add bracket behavior
	}

}
