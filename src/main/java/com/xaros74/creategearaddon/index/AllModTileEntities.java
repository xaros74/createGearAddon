package com.xaros74.creategearaddon.index;

import com.simibubi.create.content.contraptions.base.KineticTileEntityRenderer;
import com.simibubi.create.content.contraptions.base.SingleRotatingInstance;
import com.simibubi.create.repack.registrate.util.entry.TileEntityEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.tiles.CogTile;

public class AllModTileEntities {
	private static final TileEntityEntry<CogTile> COG_TILE = CreateGearAddon.registrate()
			.tileEntity("simple_kinetic", CogTile::new).instance(() -> SingleRotatingInstance::new)
			.validBlocks(AllModBlocks.OAK_COGWHEEL, AllModBlocks.ACACIA_COGWHEEL, AllModBlocks.BIRCH_COGWHEEL,
					AllModBlocks.CRIMSON_COGWHEEL, AllModBlocks.DARK_OAK_COGWHEEL, AllModBlocks.JUNGLE_COGWHEEL,
					AllModBlocks.WARPED_COGWHEEL, AllModBlocks.LARGE_OAK_COGWHEEL, AllModBlocks.LARGE_BIRCH_COGWHEEL,
					AllModBlocks.LARGE_ACACIA_COGWHEEL, AllModBlocks.LARGE_DARK_OAK_COGWHEEL,
					AllModBlocks.LARGE_CRIMSON_COGWHEEL, AllModBlocks.LARGE_WARPED_COGWHEEL)
			.renderer(() -> KineticTileEntityRenderer::new).register();

	public static void register() {
	}

}
