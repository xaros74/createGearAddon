package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.xaros74.creategearaddon.index.AllModTileEntities;

import net.minecraft.world.level.block.entity.BlockEntityType;

public class CogWheel extends CogWheelBlock {

	public CogWheel(boolean large, Properties properties) {
		super(large, properties);
	}

	@Override
	public BlockEntityType<? extends SimpleKineticTileEntity> getTileEntityType() {
		return AllModTileEntities.getCOG_TILE().get();
	}

}
