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
import com.xaros74.creategearaddon.blocks.AddonCogWheel;
import com.xaros74.creategearaddon.groups.GearAddon;

import net.minecraft.block.SoundType;

public class AllModBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrate()
			.itemGroup(() -> GearAddon.GEAR_ADDON_GROUP);

	public static final BlockEntry<AddonCogWheel> OAK_COGWHEEL = REGISTRATE
			.block("oak_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> BIRCH_COGWHEEL = REGISTRATE
			.block("birch_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> JUNGLE_COGWHEEL = REGISTRATE
			.block("jungle_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> ACACIA_COGWHEEL = REGISTRATE
			.block("acacia_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> DARK_OAK_COGWHEEL = REGISTRATE
			.block("dark_oak_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> CRIMSON_COGWHEEL = REGISTRATE
			.block("crimson_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> WARPED_COGWHEEL = REGISTRATE
			.block("warped_cogwheel", (p) -> new AddonCogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_OAK_COGWHEEL = REGISTRATE
			.block("large_oak_cogwheel", (p) -> new AddonCogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_BIRCH_COGWHEEL = REGISTRATE
			.block("large_birch_cogwheel", (p) -> new AddonCogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_JUNGLE_COGWHEEL = REGISTRATE
			.block("large_jungle_cogwheel", (p) -> new AddonCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_ACACIA_COGWHEEL = REGISTRATE
			.block("large_acacia_cogwheel", (p) -> new AddonCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_DARK_OAK_COGWHEEL = REGISTRATE
			.block("large_dark_oak_cogwheel", (p) -> new AddonCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_CRIMSON_COGWHEEL = REGISTRATE
			.block("large_crimson_cogwheel", (p) -> new AddonCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<AddonCogWheel> LARGE_WARPED_COGWHEEL = REGISTRATE
			.block("large_warped_cogwheel", (p) -> new AddonCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
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
