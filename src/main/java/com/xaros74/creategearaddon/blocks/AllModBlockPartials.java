package com.xaros74.creategearaddon.blocks;
import com.jozufozu.flywheel.core.PartialModel;
import com.xaros74.creategearaddon.CreateGearAddon;

public class AllModBlockPartials {
	
	public static final PartialModel PARTIAL_SHAFTLESS_OAK_COGWHEEL = block("shaftless_oak_cogwheel"),
			LARGE_SHAFTLESS_OAK_COGWHEEL = block("large_shaftless_oak_cogwheel");
	
	
	private static PartialModel block(String path) {
		CreateGearAddon.LOGGER.info(path);
		return new PartialModel(CreateGearAddon.asResource("block/" + path));
	}
	
	public static void init() {
		// init static fields
	}
}
