package com.xaros74.creategearaddon.index;

import com.jozufozu.flywheel.core.PartialModel;
import com.xaros74.creategearaddon.CreateGearAddon;

public class ECPartials {

	public static final PartialModel LARGE_ACACIA_COGWHEEL = block("large_acacia_cogwheel"),
			LARGE_OAK_COGWHEEL = block("large_oak_cogwheel"), 
			LARGE_BIRCH_COGWHEEL = block("large_birch_cogwheel"), 
			LARGE_JUNGLE_COGWHEEL = block("large_jungle_cogwheel"),
			LARGE_DARK_OAK_COGWHEEL = block("large_dark_oak_cogwheel"),
			LARGE_CRIMSON_COGWHEEL = block("large_crimson_cogwheel"),
			LARGE_WARPED_COGWHEEL = block("large_warped_cogwheel"),
			LARGE_CHERRY_COGWHEEL = block("large_cherry_cogwheel"),
			LARGE_DEAD_COGWHEEL = block("large_dead_cogwheel"),
			LARGE_FIR_COGWHEEL = block("large_fir_cogwheel"),
			LARGE_HELLBARK_COGWHEEL = block("large_hellbark_cogwheel"),
			LARGE_JACARANDA_COGWHEEL = block("large_jacaranda_cogwheel"),
			LARGE_MAGIC_COGWHEEL = block("large_magic_cogwheel"),
			LARGE_MAHOGANY_COGWHEEL = block("large_mahogany_cogwheel"),
			LARGE_PALM_COGWHEEL = block("large_palm_cogwheel"),
			LARGE_REDWOOD_COGWHEEL = block("large_redwood_cogwheel"),
			LARGE_UMBRAN_COGWHEEL = block("large_umbran_cogwheel"),
			LARGE_WILLOW_COGWHEEL = block("large_willow_cogwheel");

	private static PartialModel block(String path) {
		return new PartialModel(CreateGearAddon.asResource("block/" + path));
	}
	
	public static void init() {
        // init static fields
    }
}
