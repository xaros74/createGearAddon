package com.xaros74.creategearaddon.index;

import com.jozufozu.flywheel.core.PartialModel;
import com.xaros74.creategearaddon.CreateGearAddon;

public class AllModBlockPartials {

	public static final PartialModel PARTIAL_SHAFTLESS_OAK_COGWHEEL = block("shaftless_oak_cogwheel"),
			PARTIAL_LARGE_SHAFTLESS_OAK_COGWHEEL = block("large_shaftless_oak_cogwheel"),
			PARTIAL_SHAFTLESS_BIRCH_COGWHEEL = block("shaftless_birch_cogwheel"),
			PARTIAL_LARGE_SHAFTLESS_BIRCH_COGWHEEL = block("large_shaftless_birch_cogwheel");

	private static PartialModel block(String path) {
		return new PartialModel(CreateGearAddon.asResource("block/" + path));
	}

	public static void init() {
		// init static fields
	}
}
