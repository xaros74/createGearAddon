package com.xaros74.creategearaddon.index;

import com.simibubi.create.content.AllSections;
import com.simibubi.create.content.contraptions.fluids.pipes.BracketBlock;
import com.simibubi.create.content.contraptions.fluids.pipes.BracketBlockItem;
import com.simibubi.create.content.contraptions.fluids.pipes.BracketGenerator;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;
import com.simibubi.create.content.contraptions.relays.elementary.CogwheelBlockItem;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.blocks.CogWheel;
import com.xaros74.creategearaddon.blocks.HalfShaftCogWheel;
import com.xaros74.creategearaddon.blocks.ShaftlessCogWheel;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.ConfiguredModel;

import static com.simibubi.create.AllTags.axeOrPickaxe;

public class AllModBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrate();
	private static final CreateRegistrate BOP_REGISTRATE = CreateGearAddon.registrate("bop");

	// **********************small cogwheels**********************

	public static final BlockEntry<CogWheel> OAK_COGWHEEL = REGISTRATE
			.block("oak_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> BIRCH_COGWHEEL = REGISTRATE
			.block("birch_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> JUNGLE_COGWHEEL = REGISTRATE
			.block("jungle_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> ACACIA_COGWHEEL = REGISTRATE
			.block("acacia_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> DARK_OAK_COGWHEEL = REGISTRATE
			.block("dark_oak_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> CRIMSON_COGWHEEL = REGISTRATE
			.block("crimson_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> WARPED_COGWHEEL = REGISTRATE
			.block("warped_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************large cogwheels**********************

	public static final BlockEntry<CogWheel> LARGE_OAK_COGWHEEL = REGISTRATE
			.block("large_oak_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_BIRCH_COGWHEEL = REGISTRATE
			.block("large_birch_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_JUNGLE_COGWHEEL = REGISTRATE
			.block("large_jungle_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_ACACIA_COGWHEEL = REGISTRATE
			.block("large_acacia_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_DARK_OAK_COGWHEEL = REGISTRATE
			.block("large_dark_oak_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_CRIMSON_COGWHEEL = REGISTRATE
			.block("large_crimson_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_WARPED_COGWHEEL = REGISTRATE
			.block("large_warped_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************halfshaft cogwheels**********************

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_SPRUCE_COGWHEEL = REGISTRATE
			.block("half_shaft_spruce_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_OAK_COGWHEEL = REGISTRATE
			.block("half_shaft_oak_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_BIRCH_COGWHEEL = REGISTRATE
			.block("half_shaft_birch_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_JUNGLE_COGWHEEL = REGISTRATE
			.block("half_shaft_jungle_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_ACACIA_COGWHEEL = REGISTRATE
			.block("half_shaft_acacia_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_DARK_OAK_COGWHEEL = REGISTRATE
			.block("half_shaft_dark_oak_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_CRIMSON_COGWHEEL = REGISTRATE
			.block("half_shaft_crimson_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_WARPED_COGWHEEL = REGISTRATE
			.block("half_shaft_warped_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************large halfshaft cogwheels**********************

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_SPRUCE_COGWHEEL = REGISTRATE
			.block("large_half_shaft_spruce_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_OAK_COGWHEEL = REGISTRATE
			.block("large_half_shaft_oak_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_BIRCH_COGWHEEL = REGISTRATE
			.block("large_half_shaft_birch_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_JUNGLE_COGWHEEL = REGISTRATE
			.block("large_half_shaft_jungle_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_ACACIA_COGWHEEL = REGISTRATE
			.block("large_half_shaft_acacia_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_DARK_OAK_COGWHEEL = REGISTRATE
			.block("large_half_shaft_dark_oak_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_CRIMSON_COGWHEEL = REGISTRATE
			.block("large_half_shaft_crimson_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_WARPED_COGWHEEL = REGISTRATE
			.block("large_half_shaft_warped_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************small shaftless_ cogwheels**********************

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_SPRUCE_COGWHEEL = REGISTRATE
			.block("shaftless_spruce_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_OAK_COGWHEEL = REGISTRATE
			.block("shaftless_oak_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_BIRCH_COGWHEEL = REGISTRATE
			.block("shaftless_birch_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_JUNGLE_COGWHEEL = REGISTRATE
			.block("shaftless_jungle_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_ACACIA_COGWHEEL = REGISTRATE
			.block("shaftless_acacia_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_DARK_OAK_COGWHEEL = REGISTRATE
			.block("shaftless_dark_oak_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_CRIMSON_COGWHEEL = REGISTRATE
			.block("shaftless_crimson_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_WARPED_COGWHEEL = REGISTRATE
			.block("shaftless_warped_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	// **********************large shaftless cogwheels**********************

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_SPRUCE_COGWHEEL = REGISTRATE
			.block("large_shaftless_spruce_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_OAK_COGWHEEL = REGISTRATE
			.block("large_shaftless_oak_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_BIRCH_COGWHEEL = REGISTRATE
			.block("large_shaftless_birch_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_JUNGLE_COGWHEEL = REGISTRATE
			.block("large_shaftless_jungle_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_ACACIA_COGWHEEL = REGISTRATE
			.block("large_shaftless_acacia_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_DARK_OAK_COGWHEEL = REGISTRATE
			.block("large_shaftless_dark_oak_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_CRIMSON_COGWHEEL = REGISTRATE
			.block("large_shaftless_crimson_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_WARPED_COGWHEEL = REGISTRATE
			.block("large_shaftless_warped_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<BracketBlock> OAK_BRACKET = REGISTRATE.block("oak_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("oak")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("oak")).register();

	public static final BlockEntry<BracketBlock> SPRUCE_BRACKET = REGISTRATE.block("spruce_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("spruce")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("spruce")).register();

	public static final BlockEntry<BracketBlock> JUNGLE_BRACKET = REGISTRATE.block("jungle_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("jungle")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("jungle")).register();

	public static final BlockEntry<BracketBlock> ACACIA_BRACKET = REGISTRATE.block("acacia_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("acacia")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("acacia")).register();

	public static final BlockEntry<BracketBlock> DARK_OAK_BRACKET = REGISTRATE
			.block("dark_oak_bracket", BracketBlock::new).blockstate(new BracketGenerator("dark_oak")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("dark_oak")).register();

	public static final BlockEntry<BracketBlock> CRIMSON_BRACKET = REGISTRATE
			.block("crimson_bracket", BracketBlock::new).blockstate(new BracketGenerator("crimson")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("crimson")).register();

	public static final BlockEntry<BracketBlock> WARPED_BRACKET = REGISTRATE.block("warped_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("warped")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("warped")).register();
	// ********************************************biome
	// o'plenty********************************************
	// **********************small cogwheels**********************
	public static final BlockEntry<CogWheel> CHERRY_COGWHEEL = BOP_REGISTRATE
			.block("cherry_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> DEAD_COGWHEEL = BOP_REGISTRATE
			.block("dead_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> FIR_COGWHEEL = BOP_REGISTRATE
			.block("fir_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> HELLBARK_COGWHEEL = BOP_REGISTRATE
			.block("hellbark_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> JACARANDA_COGWHEEL = BOP_REGISTRATE
			.block("jacaranda_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> MAGIC_COGWHEEL = BOP_REGISTRATE
			.block("magic_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> MAHOGANY_COGWHEEL = BOP_REGISTRATE
			.block("mahogany_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> PALM_COGWHEEL = BOP_REGISTRATE
			.block("palm_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> REDWOOD_COGWHEEL = BOP_REGISTRATE
			.block("redwood_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> UMBRAN_COGWHEEL = BOP_REGISTRATE
			.block("umbran_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> WILLOW_COGWHEEL = BOP_REGISTRATE
			.block("willow_cogwheel", (p) -> new CogWheel(false, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************large cogwheels**********************

	public static final BlockEntry<CogWheel> LARGE_CHERRY_COGWHEEL = BOP_REGISTRATE
			.block("large_cherry_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe())
			.properties(p -> p.sound(SoundType.WOOD)).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_DEAD_COGWHEEL = BOP_REGISTRATE
			.block("large_dead_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_FIR_COGWHEEL = BOP_REGISTRATE
			.block("large_fir_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_HELLBARK_COGWHEEL = BOP_REGISTRATE
			.block("large_hellbark_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_JACARANDA_COGWHEEL = BOP_REGISTRATE
			.block("large_jacaranda_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_MAGIC_COGWHEEL = BOP_REGISTRATE
			.block("large_magic_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_MAHOGANY_COGWHEEL = BOP_REGISTRATE
			.block("large_mahogany_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_PALM_COGWHEEL = BOP_REGISTRATE
			.block("large_palm_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_REDWOOD_COGWHEEL = BOP_REGISTRATE
			.block("large_redwood_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_UMBRAN_COGWHEEL = BOP_REGISTRATE
			.block("large_umbran_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<CogWheel> LARGE_WILLOW_COGWHEEL = BOP_REGISTRATE
			.block("large_willow_cogwheel", (p) -> new CogWheel(true, p)).initialProperties(SharedProperties::stone)
			.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).blockstate(BlockStateGen.axisBlockProvider(false))
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************halfshaft cogwheels**********************

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_CHERRY_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_cherry_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_DEAD_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_dead_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_FIR_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_fir_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_HELLBARK_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_hellbark_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_JACARANDA_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_jacaranda_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_MAGIC_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_magic_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_MAHOGANY_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_mahogany_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_PALM_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_palm_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_REDWOOD_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_redwood_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_UMBRAN_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_umbran_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_WILLOW_COGWHEEL = BOP_REGISTRATE
			.block("half_shaft_willow_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************large halfshaft cogwheels**********************

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_CHERRY_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_cherry_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_DEAD_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_dead_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_FIR_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_fir_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_HELLBARK_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_hellbark_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_JACARANDA_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_jacaranda_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_MAGIC_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_magic_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_MAHOGANY_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_mahogany_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_PALM_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_palm_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_REDWOOD_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_redwood_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_UMBRAN_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_umbran_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_WILLOW_COGWHEEL = BOP_REGISTRATE
			.block("large_half_shaft_willow_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD))
			.blockstate(AllModBlocks::halfShaftGearState)
			.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
			.build().register();

	// **********************small shaftless_ cogwheels**********************

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_CHERRY_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_cherry_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_DEAD_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_dead_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_FIR_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_fir_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_HELLBARK_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_hellbark_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_JACARANDA_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_jacaranda_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_MAGIC_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_magic_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_MAHOGANY_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_mahogany_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_PALM_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_palm_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_REDWOOD_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_redwood_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_UMBRAN_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_umbran_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_WILLOW_COGWHEEL = BOP_REGISTRATE
			.block("shaftless_willow_cogwheel", (p) -> new ShaftlessCogWheel(false, p))
			.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
			.transform(axeOrPickaxe()).properties(p -> p.sound(SoundType.WOOD)).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	// **********************large shaftless cogwheels**********************

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_CHERRY_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_cherry_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_DEAD_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_dead_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_FIR_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_fir_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_HELLBARK_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_hellbark_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_JACARANDA_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_jacaranda_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_MAGIC_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_magic_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_MAHOGANY_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_mahogany_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_PALM_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_palm_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_REDWOOD_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_redwood_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_UMBRAN_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_umbran_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_WILLOW_COGWHEEL = BOP_REGISTRATE
			.block("large_shaftless_willow_cogwheel", (p) -> new ShaftlessCogWheel(true, p))
			.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
			.transform(BlockStressDefaults.setNoImpact()).transform(axeOrPickaxe()).blockstate(($, $$) -> {
			}).onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
			.item(CogwheelBlockItem::new).build().register();

	// ***********************bracket******************************

	public static final BlockEntry<BracketBlock> CHERRY_BRACKET = BOP_REGISTRATE
			.block("cherry_bracket", BracketBlock::new).blockstate(new BracketGenerator("cherry")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("cherry")).register();

	public static final BlockEntry<BracketBlock> DEAD_BRACKET = BOP_REGISTRATE.block("dead_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("dead")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("dead")).register();

	public static final BlockEntry<BracketBlock> FIR_BRACKET = BOP_REGISTRATE.block("fir_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("fir")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("fir")).register();

	public static final BlockEntry<BracketBlock> HELLBARK_BRACKET = BOP_REGISTRATE
			.block("hellbark_bracket", BracketBlock::new).blockstate(new BracketGenerator("hellbark")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("hellbark")).register();

	public static final BlockEntry<BracketBlock> JACARANDA_BRACKET = BOP_REGISTRATE
			.block("jacaranda_bracket", BracketBlock::new).blockstate(new BracketGenerator("jacaranda")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("jacaranda")).register();

	public static final BlockEntry<BracketBlock> MAGIC_BRACKET = BOP_REGISTRATE
			.block("magic_bracket", BracketBlock::new).blockstate(new BracketGenerator("magic")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("magic")).register();

	public static final BlockEntry<BracketBlock> MAHOGANY_BRACKET = BOP_REGISTRATE
			.block("mahogany_bracket", BracketBlock::new).blockstate(new BracketGenerator("mahogany")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("mahogany")).register();

	public static final BlockEntry<BracketBlock> PALM_BRACKET = BOP_REGISTRATE.block("palm_bracket", BracketBlock::new)
			.blockstate(new BracketGenerator("palm")::generate).item(BracketBlockItem::new)
			.transform(BracketGenerator.itemModel("palm")).register();

	public static final BlockEntry<BracketBlock> REDWOOD_BRACKET = BOP_REGISTRATE
			.block("redwood_bracket", BracketBlock::new).blockstate(new BracketGenerator("redwood")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("redwood")).register();

	public static final BlockEntry<BracketBlock> UMBRAN_BRACKET = BOP_REGISTRATE
			.block("umbran_bracket", BracketBlock::new).blockstate(new BracketGenerator("umbran")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("umbran")).register();

	public static final BlockEntry<BracketBlock> WILLOW_BRACKET = BOP_REGISTRATE
			.block("willow_bracket", BracketBlock::new).blockstate(new BracketGenerator("willow")::generate)
			.item(BracketBlockItem::new).transform(BracketGenerator.itemModel("willow")).register();

	public static void register() {

		REGISTRATE.addToSection(OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(BIRCH_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(JUNGLE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(ACACIA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(DARK_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(CRIMSON_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(WARPED_COGWHEEL, AllSections.KINETICS);

//		REGISTRATE.addToSection(LARGE_OAK_COGWHEEL, AllSections.KINETICS);
//		REGISTRATE.addToSection(LARGE_BIRCH_COGWHEEL, AllSections.KINETICS);
//		REGISTRATE.addToSection(LARGE_JUNGLE_COGWHEEL, AllSections.KINETICS);
//		REGISTRATE.addToSection(LARGE_ACACIA_COGWHEEL, AllSections.KINETICS);
//		REGISTRATE.addToSection(LARGE_DARK_OAK_COGWHEEL, AllSections.KINETICS);
//		REGISTRATE.addToSection(LARGE_CRIMSON_COGWHEEL, AllSections.KINETICS);
//		REGISTRATE.addToSection(LARGE_WARPED_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(HALF_SHAFT_SPRUCE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_BIRCH_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_JUNGLE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_ACACIA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_DARK_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_CRIMSON_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_WARPED_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(LARGE_HALF_SHAFT_SPRUCE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_BIRCH_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_JUNGLE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_ACACIA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_DARK_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_CRIMSON_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_WARPED_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(SHAFTLESS_SPRUCE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_BIRCH_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_JUNGLE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_ACACIA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_DARK_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_CRIMSON_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_WARPED_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(LARGE_SHAFTLESS_SPRUCE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_BIRCH_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_JUNGLE_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_ACACIA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_DARK_OAK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_CRIMSON_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_WARPED_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(OAK_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(SPRUCE_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(JUNGLE_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(ACACIA_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(DARK_OAK_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(CRIMSON_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(WARPED_BRACKET, AllSections.KINETICS);

		REGISTRATE.addToSection(CHERRY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(DEAD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(FIR_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HELLBARK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(JACARANDA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(MAGIC_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(MAHOGANY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(PALM_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(REDWOOD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(UMBRAN_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(WILLOW_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(LARGE_CHERRY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_DEAD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_FIR_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HELLBARK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_JACARANDA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_MAGIC_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_MAHOGANY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_PALM_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_REDWOOD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_UMBRAN_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_WILLOW_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(HALF_SHAFT_CHERRY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_DEAD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_FIR_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_HELLBARK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_JACARANDA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_MAGIC_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_MAHOGANY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_PALM_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_REDWOOD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_UMBRAN_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(HALF_SHAFT_WILLOW_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(LARGE_HALF_SHAFT_CHERRY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_DEAD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_FIR_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_HELLBARK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_JACARANDA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_MAGIC_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_MAHOGANY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_PALM_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_REDWOOD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_UMBRAN_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_HALF_SHAFT_WILLOW_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(SHAFTLESS_CHERRY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_DEAD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_FIR_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_HELLBARK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_JACARANDA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_MAGIC_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_MAHOGANY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_PALM_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_REDWOOD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_UMBRAN_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(SHAFTLESS_WILLOW_COGWHEEL, AllSections.KINETICS);

		REGISTRATE.addToSection(LARGE_SHAFTLESS_CHERRY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_DEAD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_FIR_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_HELLBARK_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_JACARANDA_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_MAGIC_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_MAHOGANY_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_PALM_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_REDWOOD_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_UMBRAN_COGWHEEL, AllSections.KINETICS);
		REGISTRATE.addToSection(LARGE_SHAFTLESS_WILLOW_COGWHEEL, AllSections.KINETICS);

		// ***********************bracket******************************
		REGISTRATE.addToSection(CHERRY_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(DEAD_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(FIR_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(HELLBARK_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(JACARANDA_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(MAGIC_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(MAHOGANY_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(PALM_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(REDWOOD_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(UMBRAN_BRACKET, AllSections.KINETICS);
		REGISTRATE.addToSection(WILLOW_BRACKET, AllSections.KINETICS);

	}

	public static void halfShaftGearState(DataGenContext<Block, HalfShaftCogWheel> ctx,
			RegistrateBlockstateProvider prov) {
		prov.getVariantBuilder(ctx.getEntry()).forAllStatesExcept((state) -> {
			Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
			Direction.AxisDirection dir = HalfShaftCogWheel
					.boolToAxisDirection(state.getValue(HalfShaftCogWheel.AXIS_DIRECTION));
			return ConfiguredModel.builder().modelFile(AssetLookup.standardModel(ctx, prov))
					.rotationX((axis == Direction.Axis.Y ? 0 : 90)
							+ (axis.isVertical() && dir == Direction.AxisDirection.NEGATIVE ? 180 : 0))
					.rotationY((axis == Direction.Axis.X ? 90 : (axis == Direction.Axis.Z ? 180 : 0))
							+ (axis.isHorizontal() && dir == Direction.AxisDirection.NEGATIVE ? 180 : 0))
					.build();
		}, BlockStateProperties.WATERLOGGED);
	}

}
