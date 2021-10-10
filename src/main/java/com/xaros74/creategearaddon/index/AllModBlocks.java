package com.xaros74.creategearaddon.index;

import com.simibubi.create.Create;
import com.simibubi.create.content.AllSections;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;
import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.simibubi.create.content.contraptions.relays.elementary.CogwheelBlockItem;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.groups.GearAddon;

import net.minecraft.block.SoundType;

public class AllModBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrate()
			.itemGroup(() -> GearAddon.GEAR_ADDON_GROUP);

	public static final BlockEntry<CogWheelBlock> OAK_COGWHEEL = REGISTRATE.block("oak_cogwheel", CogWheelBlock::small)
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> BIRCH_COGWHEEL = REGISTRATE
			.block("birch_cogwheel", CogWheelBlock::small).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> JUNGLE_COGWHEEL = REGISTRATE
			.block("jungle_cogwheel", CogWheelBlock::small).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> ACACIA_COGWHEEL = REGISTRATE
			.block("acacia_cogwheel", CogWheelBlock::small).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> DARK_OAK_COGWHEEL = REGISTRATE
			.block("dark_oak_cogwheel", CogWheelBlock::small).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> CRIMSON_COGWHEEL = REGISTRATE
			.block("crimson_cogwheel", CogWheelBlock::small).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> WARPED_COGWHEEL = REGISTRATE
			.block("warped_cogwheel", CogWheelBlock::small).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_OAK_COGWHEEL = REGISTRATE
			.block("large_oak_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_BIRCH_COGWHEEL = REGISTRATE
			.block("large_birch_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_JUNGLE_COGWHEEL = REGISTRATE
			.block("large_jungle_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_ACACIA_COGWHEEL = REGISTRATE
			.block("large_acacia_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_DARK_OAK_COGWHEEL = REGISTRATE
			.block("large_dark_oak_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_CRIMSON_COGWHEEL = REGISTRATE
			.block("large_crimson_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheelBlock> LARGE_WARPED_COGWHEEL = REGISTRATE
			.block("large_warped_cogwheel", CogWheelBlock::large).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static void register() {
		Create.registrate().addToSection(OAK_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(BIRCH_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(JUNGLE_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(ACACIA_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(DARK_OAK_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(CRIMSON_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(WARPED_COGWHEEL, AllSections.KINETICS);

		Create.registrate().addToSection(LARGE_OAK_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(LARGE_BIRCH_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(LARGE_JUNGLE_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(LARGE_ACACIA_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(LARGE_DARK_OAK_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(LARGE_CRIMSON_COGWHEEL, AllSections.KINETICS);
		Create.registrate().addToSection(LARGE_WARPED_COGWHEEL, AllSections.KINETICS);
	}

}
