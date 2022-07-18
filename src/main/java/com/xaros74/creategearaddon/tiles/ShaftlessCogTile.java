package com.xaros74.creategearaddon.tiles;

import java.util.List;

import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.simibubi.create.foundation.tileEntity.TileEntityBehaviour;

import net.minecraft.tileentity.TileEntityType;

public class ShaftlessCogTile extends SimpleKineticTileEntity {

	public ShaftlessCogTile(TileEntityType<? extends SimpleKineticTileEntity> type) {
		super(type);
	}
	
	@Override
	public void addBehaviours(List<TileEntityBehaviour> behaviours) {
		//don't add bracket behavior
	}

}
