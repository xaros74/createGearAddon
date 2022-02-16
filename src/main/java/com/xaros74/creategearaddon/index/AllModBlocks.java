package com.xaros74.creategearaddon.index;

import com.simibubi.create.Create;
import com.simibubi.create.content.AllSections;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;
import com.simibubi.create.content.contraptions.relays.elementary.CogwheelBlockItem;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.blocks.CogWheel;
import com.xaros74.creategearaddon.groups.GearAddon;

import net.minecraft.world.level.block.SoundType;

public class AllModBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrate()
			.itemGroup(() -> GearAddon.GEAR_ADDON_GROUP);
	
	
	// **********************small cogwheels**********************

		public static final BlockEntry<CogWheel> OAK_COGWHEEL = REGISTRATE
				.block("oak_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();
		
		public static void register() {
			Create.registrate().addToSection(OAK_COGWHEEL, AllSections.KINETICS);
		}

}
