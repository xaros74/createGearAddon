package com.xaros74.creategearaddon.index;

import com.simibubi.create.content.contraptions.base.SingleRotatingInstance;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.tiles.CogTile;
import com.xaros74.creategearaddon.tiles.HalfshaftCogTile;
import com.xaros74.creategearaddon.tiles.ShaftlessCogTile;
import com.xaros74.creategearaddon.tiles.TileInstance;
import com.xaros74.creategearaddon.tiles.TileRenderer;

public class AllModTileEntities {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrateTile();
	
	public static final BlockEntityEntry<CogTile> COG_TILE = REGISTRATE
			.tileEntity("simple_kinetic", CogTile::new)
			.instance(() -> TileInstance::new, false)
			.validBlocks(AllModBlocks.OAK_COGWHEEL, AllModBlocks.ACACIA_COGWHEEL, AllModBlocks.BIRCH_COGWHEEL,
					AllModBlocks.CRIMSON_COGWHEEL, AllModBlocks.DARK_OAK_COGWHEEL, AllModBlocks.JUNGLE_COGWHEEL,
					AllModBlocks.WARPED_COGWHEEL, AllModBlocks.LARGE_OAK_COGWHEEL,
					AllModBlocks.LARGE_BIRCH_COGWHEEL, AllModBlocks.LARGE_JUNGLE_COGWHEEL,
					AllModBlocks.LARGE_ACACIA_COGWHEEL, AllModBlocks.LARGE_DARK_OAK_COGWHEEL,
					AllModBlocks.LARGE_CRIMSON_COGWHEEL, AllModBlocks.LARGE_WARPED_COGWHEEL,
					AllModBlocks.CHERRY_COGWHEEL, AllModBlocks.DEAD_COGWHEEL, AllModBlocks.FIR_COGWHEEL,
					AllModBlocks.HELLBARK_COGWHEEL, AllModBlocks.JACARANDA_COGWHEEL, AllModBlocks.MAGIC_COGWHEEL,
					AllModBlocks.MAHOGANY_COGWHEEL, AllModBlocks.PALM_COGWHEEL, AllModBlocks.REDWOOD_COGWHEEL,
					AllModBlocks.UMBRAN_COGWHEEL, AllModBlocks.WILLOW_COGWHEEL, AllModBlocks.LARGE_CHERRY_COGWHEEL,
					AllModBlocks.LARGE_DEAD_COGWHEEL, AllModBlocks.LARGE_FIR_COGWHEEL,
					AllModBlocks.LARGE_HELLBARK_COGWHEEL, AllModBlocks.LARGE_JACARANDA_COGWHEEL,
					AllModBlocks.LARGE_MAGIC_COGWHEEL, AllModBlocks.LARGE_MAHOGANY_COGWHEEL,
					AllModBlocks.LARGE_PALM_COGWHEEL, AllModBlocks.LARGE_REDWOOD_COGWHEEL,
					AllModBlocks.LARGE_UMBRAN_COGWHEEL, AllModBlocks.LARGE_WILLOW_COGWHEEL)
			.renderer(() -> TileRenderer::new)
			.register();
	
	public static final BlockEntityEntry<HalfshaftCogTile> HALFSHAFT_COG_TILE = REGISTRATE.tileEntity("simple_halfshaft_kinetic", HalfshaftCogTile::new)
			.instance(() -> SingleRotatingInstance::new)
			.validBlocks(AllModBlocks.HALF_SHAFT_OAK_COGWHEEL, AllModBlocks.HALF_SHAFT_BIRCH_COGWHEEL,
					AllModBlocks.HALF_SHAFT_ACACIA_COGWHEEL, AllModBlocks.HALF_SHAFT_JUNGLE_COGWHEEL,
					AllModBlocks.HALF_SHAFT_DARK_OAK_COGWHEEL, AllModBlocks.HALF_SHAFT_CRIMSON_COGWHEEL,
					AllModBlocks.HALF_SHAFT_WARPED_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_OAK_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_BIRCH_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_ACACIA_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_JUNGLE_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_DARK_OAK_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_CRIMSON_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_WARPED_COGWHEEL,
					AllModBlocks.HALF_SHAFT_CHERRY_COGWHEEL, AllModBlocks.HALF_SHAFT_DEAD_COGWHEEL,
					AllModBlocks.HALF_SHAFT_FIR_COGWHEEL, AllModBlocks.HALF_SHAFT_HELLBARK_COGWHEEL,
					AllModBlocks.HALF_SHAFT_JACARANDA_COGWHEEL, AllModBlocks.HALF_SHAFT_MAGIC_COGWHEEL,
					AllModBlocks.HALF_SHAFT_MAHOGANY_COGWHEEL, AllModBlocks.HALF_SHAFT_PALM_COGWHEEL,
					AllModBlocks.HALF_SHAFT_REDWOOD_COGWHEEL, AllModBlocks.HALF_SHAFT_UMBRAN_COGWHEEL,
					AllModBlocks.HALF_SHAFT_WILLOW_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_CHERRY_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_DEAD_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_FIR_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_HELLBARK_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_JACARANDA_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_MAGIC_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_MAHOGANY_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_PALM_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_REDWOOD_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_UMBRAN_COGWHEEL,
					AllModBlocks.LARGE_HALF_SHAFT_WILLOW_COGWHEEL)
			.renderer(() -> BracketedKineticTileRenderer::new).register();
	
	public static final BlockEntityEntry<ShaftlessCogTile> SHAFTLESS_COG_TILE = REGISTRATE.tileEntity("simple_shaftless_kinetic", ShaftlessCogTile::new)
			.instance(() -> SingleRotatingInstance::new)
			.validBlocks(AllModBlocks.SHAFTLESS_OAK_COGWHEEL, AllModBlocks.SHAFTLESS_ACACIA_COGWHEEL,
					AllModBlocks.SHAFTLESS_BIRCH_COGWHEEL, AllModBlocks.SHAFTLESS_CRIMSON_COGWHEEL,
					AllModBlocks.SHAFTLESS_DARK_OAK_COGWHEEL, AllModBlocks.SHAFTLESS_JUNGLE_COGWHEEL,
					AllModBlocks.SHAFTLESS_WARPED_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_OAK_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_BIRCH_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_JUNGLE_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_ACACIA_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_DARK_OAK_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_CRIMSON_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_WARPED_COGWHEEL,
					AllModBlocks.SHAFTLESS_CHERRY_COGWHEEL, AllModBlocks.SHAFTLESS_DEAD_COGWHEEL,
					AllModBlocks.SHAFTLESS_FIR_COGWHEEL, AllModBlocks.SHAFTLESS_HELLBARK_COGWHEEL,
					AllModBlocks.SHAFTLESS_JACARANDA_COGWHEEL, AllModBlocks.SHAFTLESS_MAGIC_COGWHEEL,
					AllModBlocks.SHAFTLESS_MAHOGANY_COGWHEEL, AllModBlocks.SHAFTLESS_PALM_COGWHEEL,
					AllModBlocks.SHAFTLESS_REDWOOD_COGWHEEL, AllModBlocks.SHAFTLESS_UMBRAN_COGWHEEL,
					AllModBlocks.SHAFTLESS_WILLOW_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_CHERRY_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_DEAD_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_FIR_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_HELLBARK_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_JACARANDA_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_MAGIC_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_MAHOGANY_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_PALM_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_REDWOOD_COGWHEEL,
					AllModBlocks.LARGE_SHAFTLESS_UMBRAN_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_WILLOW_COGWHEEL)
			.renderer(() -> BracketedKineticTileRenderer::new).register();

	public static void register() {}

//	public static BlockEntityEntry<HalfshaftCogTile> getHALFSHAFT_COG_TILE() {
//		return HALFSHAFT_COG_TILE;
//	}
//
//	public static BlockEntityEntry<ShaftlessCogTile> getSHAFTLESS_COG_TILE() {
//		return SHAFTLESS_COG_TILE;
//	}
//
//	public static BlockEntityEntry<CogTile> getCOG_TILE() {
//		return COG_TILE;
//	}

}
