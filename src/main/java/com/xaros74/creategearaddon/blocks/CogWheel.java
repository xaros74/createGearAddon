package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.xaros74.creategearaddon.index.AllModTileEntities;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class CogWheel extends CogWheelBlock {

	public CogWheel(boolean large, Properties properties) {
		super(large, properties);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return AllModTileEntities.getCOG_TILE().create();
	}

}
