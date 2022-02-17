package com.xaros74.creategearaddon.index;

import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileInstance;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileRenderer;
import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.simibubi.create.repack.registrate.util.entry.TileEntityEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.blocks.EncasedCogWheelInstance;
import com.xaros74.creategearaddon.renderer.EncasedCogWheelRenderer;
import com.xaros74.creategearaddon.tiles.CogTile;

public class AllModTileEntities {
	private static TileEntityEntry<CogTile> COG_TILE;
	
	private static TileEntityEntry<SimpleKineticTileEntity> ENCASED_ADDON_COGWHEEL;
	private static TileEntityEntry<SimpleKineticTileEntity> ENCASED_LARGE_COGWHEEL;
	
	public static void register() {
		COG_TILE = CreateGearAddon.registrate().tileEntity("simple_kinetic", CogTile::new)
				.instance(() ->  BracketedKineticTileInstance::new)
				.validBlocks(AllModBlocks.OAK_COGWHEEL, AllModBlocks.ACACIA_COGWHEEL, AllModBlocks.BIRCH_COGWHEEL,
						AllModBlocks.CRIMSON_COGWHEEL, AllModBlocks.DARK_OAK_COGWHEEL, AllModBlocks.JUNGLE_COGWHEEL,
						AllModBlocks.WARPED_COGWHEEL, AllModBlocks.LARGE_OAK_COGWHEEL,
						AllModBlocks.LARGE_BIRCH_COGWHEEL, AllModBlocks.LARGE_JUNGLE_COGWHEEL,
						AllModBlocks.LARGE_ACACIA_COGWHEEL, AllModBlocks.LARGE_DARK_OAK_COGWHEEL,
						AllModBlocks.LARGE_CRIMSON_COGWHEEL, AllModBlocks.LARGE_WARPED_COGWHEEL,
						AllModBlocks.HALF_SHAFT_OAK_COGWHEEL, AllModBlocks.HALF_SHAFT_BIRCH_COGWHEEL,
						AllModBlocks.HALF_SHAFT_ACACIA_COGWHEEL, AllModBlocks.HALF_SHAFT_JUNGLE_COGWHEEL,
						AllModBlocks.HALF_SHAFT_DARK_OAK_COGWHEEL, AllModBlocks.HALF_SHAFT_CRIMSON_COGWHEEL,
						AllModBlocks.HALF_SHAFT_WARPED_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_OAK_COGWHEEL,
						AllModBlocks.LARGE_HALF_SHAFT_BIRCH_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_ACACIA_COGWHEEL,
						AllModBlocks.LARGE_HALF_SHAFT_JUNGLE_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_DARK_OAK_COGWHEEL,
						AllModBlocks.LARGE_HALF_SHAFT_CRIMSON_COGWHEEL, AllModBlocks.LARGE_HALF_SHAFT_WARPED_COGWHEEL,
						AllModBlocks.SHAFTLESS_OAK_COGWHEEL, AllModBlocks.SHAFTLESS_ACACIA_COGWHEEL,
						AllModBlocks.SHAFTLESS_BIRCH_COGWHEEL, AllModBlocks.SHAFTLESS_CRIMSON_COGWHEEL,
						AllModBlocks.SHAFTLESS_DARK_OAK_COGWHEEL, AllModBlocks.SHAFTLESS_JUNGLE_COGWHEEL,
						AllModBlocks.SHAFTLESS_WARPED_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_OAK_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_BIRCH_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_JUNGLE_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_ACACIA_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_DARK_OAK_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_CRIMSON_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_WARPED_COGWHEEL,
						AllModBlocks.CHERRY_COGWHEEL, AllModBlocks.DEAD_COGWHEEL, AllModBlocks.FIR_COGWHEEL,
						AllModBlocks.HELLBARK_COGWHEEL, AllModBlocks.JACARANDA_COGWHEEL, AllModBlocks.MAGIC_COGWHEEL,
						AllModBlocks.MAHOGANY_COGWHEEL, AllModBlocks.PALM_COGWHEEL, AllModBlocks.REDWOOD_COGWHEEL,
						AllModBlocks.UMBRAN_COGWHEEL, AllModBlocks.WILLOW_COGWHEEL, AllModBlocks.LARGE_CHERRY_COGWHEEL,
						AllModBlocks.LARGE_DEAD_COGWHEEL, AllModBlocks.LARGE_FIR_COGWHEEL,
						AllModBlocks.LARGE_HELLBARK_COGWHEEL, AllModBlocks.LARGE_JACARANDA_COGWHEEL,
						AllModBlocks.LARGE_MAGIC_COGWHEEL, AllModBlocks.LARGE_MAHOGANY_COGWHEEL,
						AllModBlocks.LARGE_PALM_COGWHEEL, AllModBlocks.LARGE_REDWOOD_COGWHEEL,
						AllModBlocks.LARGE_UMBRAN_COGWHEEL, AllModBlocks.LARGE_WILLOW_COGWHEEL,
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
						AllModBlocks.LARGE_HALF_SHAFT_WILLOW_COGWHEEL, AllModBlocks.SHAFTLESS_CHERRY_COGWHEEL,
						AllModBlocks.SHAFTLESS_DEAD_COGWHEEL, AllModBlocks.SHAFTLESS_FIR_COGWHEEL,
						AllModBlocks.SHAFTLESS_HELLBARK_COGWHEEL, AllModBlocks.SHAFTLESS_JACARANDA_COGWHEEL,
						AllModBlocks.SHAFTLESS_MAGIC_COGWHEEL, AllModBlocks.SHAFTLESS_MAHOGANY_COGWHEEL,
						AllModBlocks.SHAFTLESS_PALM_COGWHEEL, AllModBlocks.SHAFTLESS_REDWOOD_COGWHEEL,
						AllModBlocks.SHAFTLESS_UMBRAN_COGWHEEL, AllModBlocks.SHAFTLESS_WILLOW_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_CHERRY_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_DEAD_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_FIR_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_HELLBARK_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_JACARANDA_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_MAGIC_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_MAHOGANY_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_PALM_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_REDWOOD_COGWHEEL, AllModBlocks.LARGE_SHAFTLESS_UMBRAN_COGWHEEL,
						AllModBlocks.LARGE_SHAFTLESS_WILLOW_COGWHEEL)
				.renderer(() -> BracketedKineticTileRenderer::new).register();
		
		ENCASED_ADDON_COGWHEEL = CreateGearAddon.registrate()
				.tileEntity("encased_cogwheel", SimpleKineticTileEntity::new)
				.instance(() -> EncasedCogWheelInstance::small)
				.validBlocks(AllModBlocks.ANDESITE_ENCASED_COGWHEEL, AllModBlocks.MOD_BRASS_ENCASED_COGWHEEL)
				.renderer(() -> EncasedCogWheelRenderer::small)
				.register();
		
		ENCASED_LARGE_COGWHEEL = CreateGearAddon.registrate()
				.tileEntity("encased_large_cogwheel", SimpleKineticTileEntity::new)
				.instance(() -> EncasedCogWheelInstance::large)
				.validBlocks(AllModBlocks.ANDESITE_ENCASED_LARGE_COGWHEEL, AllModBlocks.BRASS_ENCASED_LARGE_COGWHEEL)
				.renderer(() -> EncasedCogWheelRenderer::large)
				.register();

	}

	public static TileEntityEntry<CogTile> getCOG_TILE() {
		return COG_TILE;
	}
	
	public static TileEntityEntry<SimpleKineticTileEntity> getENCASED_COGWHEEL() {
		return ENCASED_ADDON_COGWHEEL;
	}
	
	public static TileEntityEntry<SimpleKineticTileEntity> getENCASED_LARGE_COGWHEEL() {
		return ENCASED_LARGE_COGWHEEL;
	}
}
