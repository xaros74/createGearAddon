package com.xaros74.creategearaddon.index;

import static com.simibubi.create.AllTags.axeOrPickaxe;

import com.simibubi.create.AllSpriteShifts;
import com.simibubi.create.content.AllSections;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;
import com.simibubi.create.content.contraptions.relays.elementary.CogwheelBlockItem;
import com.simibubi.create.content.contraptions.relays.encased.EncasedCogCTBehaviour;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.utility.Couple;
import com.simibubi.create.repack.registrate.providers.DataGenContext;
import com.simibubi.create.repack.registrate.providers.RegistrateBlockstateProvider;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.blocks.CogWheel;
import com.xaros74.creategearaddon.blocks.EncasedCogwheel;
import com.xaros74.creategearaddon.blocks.HalfShaftCogWheel;
import com.xaros74.creategearaddon.blocks.ShaftlessCogWheel;
import com.xaros74.creategearaddon.groups.GearAddon;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.ConfiguredModel;

public class AllModBlocks {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrate()
			.itemGroup(() -> GearAddon.GEAR_ADDON_GROUP);
	
	
	// **********************small cogwheels**********************

		public static final BlockEntry<CogWheel> OAK_COGWHEEL = REGISTRATE
				.block("oak_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();
		
		public static final BlockEntry<CogWheel> BIRCH_COGWHEEL = REGISTRATE
				.block("birch_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> JUNGLE_COGWHEEL = REGISTRATE
				.block("jungle_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> ACACIA_COGWHEEL = REGISTRATE
				.block("acacia_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> DARK_OAK_COGWHEEL = REGISTRATE
				.block("dark_oak_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> CRIMSON_COGWHEEL = REGISTRATE
				.block("crimson_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> WARPED_COGWHEEL = REGISTRATE
				.block("warped_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
				.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		// **********************large cogwheels**********************

		public static final BlockEntry<CogWheel> LARGE_OAK_COGWHEEL = REGISTRATE
				.block("large_oak_cogwheel", CogWheel::large).initialProperties(SharedProperties::stone)
				.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> LARGE_BIRCH_COGWHEEL = REGISTRATE
				.block("large_birch_cogwheel", CogWheel::large).initialProperties(SharedProperties::stone)
				.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> LARGE_JUNGLE_COGWHEEL = REGISTRATE
				.block("large_jungle_cogwheel", CogWheel::large)
				.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
				.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> LARGE_ACACIA_COGWHEEL = REGISTRATE
				.block("large_acacia_cogwheel", CogWheel::large)
				.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
				.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> LARGE_DARK_OAK_COGWHEEL = REGISTRATE
				.block("large_dark_oak_cogwheel", CogWheel::large)
				.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
				.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> LARGE_CRIMSON_COGWHEEL = REGISTRATE
				.block("large_crimson_cogwheel", CogWheel::large)
				.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
				.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<CogWheel> LARGE_WARPED_COGWHEEL = REGISTRATE
				.block("large_warped_cogwheel", CogWheel::large)
				.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
				.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		// **********************halfshaft cogwheels**********************

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_OAK_COGWHEEL = REGISTRATE
				.block("half_shaft_oak_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_BIRCH_COGWHEEL = REGISTRATE
				.block("half_shaft_birch_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_JUNGLE_COGWHEEL = REGISTRATE
				.block("half_shaft_jungle_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_ACACIA_COGWHEEL = REGISTRATE
				.block("half_shaft_acacia_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_DARK_OAK_COGWHEEL = REGISTRATE
				.block("half_shaft_dark_oak_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_CRIMSON_COGWHEEL = REGISTRATE
				.block("half_shaft_crimson_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();

		public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_WARPED_COGWHEEL = REGISTRATE
				.block("half_shaft_warped_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
				.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
				.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
				.build().register();
		
		// **********************large halfshaft cogwheels**********************

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_OAK_COGWHEEL = REGISTRATE
					.block("large_half_shaft_oak_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_BIRCH_COGWHEEL = REGISTRATE
					.block("large_half_shaft_birch_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_JUNGLE_COGWHEEL = REGISTRATE
					.block("large_half_shaft_jungle_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_ACACIA_COGWHEEL = REGISTRATE
					.block("large_half_shaft_acacia_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_DARK_OAK_COGWHEEL = REGISTRATE
					.block("large_half_shaft_dark_oak_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_CRIMSON_COGWHEEL = REGISTRATE
					.block("large_half_shaft_crimson_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_WARPED_COGWHEEL = REGISTRATE
					.block("large_half_shaft_warped_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			// **********************small shaftless_ cogwheels**********************

			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_OAK_COGWHEEL = REGISTRATE
					.block("shaftless_oak_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_BIRCH_COGWHEEL = REGISTRATE
					.block("shaftless_birch_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_JUNGLE_COGWHEEL = REGISTRATE
					.block("shaftless_jungle_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_ACACIA_COGWHEEL = REGISTRATE
					.block("shaftless_acacia_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_DARK_OAK_COGWHEEL = REGISTRATE
					.block("shaftless_dark_oak_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_CRIMSON_COGWHEEL = REGISTRATE
					.block("shaftless_crimson_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_WARPED_COGWHEEL = REGISTRATE
					.block("shaftless_warped_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// **********************large shaftless cogwheels**********************

			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_OAK_COGWHEEL = REGISTRATE
					.block("large_shaftless_oak_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_BIRCH_COGWHEEL = REGISTRATE
					.block("large_shaftless_birch_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_JUNGLE_COGWHEEL = REGISTRATE
					.block("large_shaftless_jungle_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_ACACIA_COGWHEEL = REGISTRATE
					.block("large_shaftless_acacia_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_DARK_OAK_COGWHEEL = REGISTRATE
					.block("large_shaftless_dark_oak_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_CRIMSON_COGWHEEL = REGISTRATE
					.block("large_shaftless_crimson_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_WARPED_COGWHEEL = REGISTRATE
					.block("large_shaftless_warped_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// ********************************************biome o' plenty********************************************
			// 						 **********************small cogwheels**********************
			public static final BlockEntry<CogWheel> CHERRY_COGWHEEL = REGISTRATE
					.block("cherry_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> DEAD_COGWHEEL = REGISTRATE
					.block("dead_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> FIR_COGWHEEL = REGISTRATE
					.block("fir_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> HELLBARK_COGWHEEL = REGISTRATE
					.block("hellbark_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> JACARANDA_COGWHEEL = REGISTRATE
					.block("jacaranda_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> MAGIC_COGWHEEL = REGISTRATE
					.block("magic_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> MAHOGANY_COGWHEEL = REGISTRATE
					.block("mahogany_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> PALM_COGWHEEL = REGISTRATE
					.block("palm_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> REDWOOD_COGWHEEL = REGISTRATE
					.block("redwood_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> UMBRAN_COGWHEEL = REGISTRATE
					.block("umbran_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> WILLOW_COGWHEEL = REGISTRATE
					.block("willow_cogwheel", CogWheel::small).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// **********************large cogwheels**********************
			
			public static final BlockEntry<CogWheel> LARGE_CHERRY_COGWHEEL = REGISTRATE
					.block("large_cherry_cogwheel", CogWheel::large).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<CogWheel> LARGE_DEAD_COGWHEEL = REGISTRATE
					.block("large_dead_cogwheel", CogWheel::large).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<CogWheel> LARGE_FIR_COGWHEEL = REGISTRATE
					.block("large_fir_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<CogWheel> LARGE_HELLBARK_COGWHEEL = REGISTRATE
					.block("large_hellbark_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<CogWheel> LARGE_JACARANDA_COGWHEEL = REGISTRATE
					.block("large_jacaranda_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<CogWheel> LARGE_MAGIC_COGWHEEL = REGISTRATE
					.block("large_magic_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<CogWheel> LARGE_MAHOGANY_COGWHEEL = REGISTRATE
					.block("large_mahogany_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> LARGE_PALM_COGWHEEL = REGISTRATE
					.block("large_palm_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> LARGE_REDWOOD_COGWHEEL = REGISTRATE
					.block("large_redwood_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> LARGE_UMBRAN_COGWHEEL = REGISTRATE
					.block("large_umbran_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<CogWheel> LARGE_WILLOW_COGWHEEL = REGISTRATE
					.block("large_willow_cogwheel", CogWheel::large)
					.initialProperties(SharedProperties::stone).properties(p -> p.sound(SoundType.WOOD))
					.transform(BlockStressDefaults.setNoImpact()).blockstate(BlockStateGen.axisBlockProvider(false))
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// **********************halfshaft cogwheels**********************
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_CHERRY_COGWHEEL = REGISTRATE
					.block("half_shaft_cherry_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_DEAD_COGWHEEL = REGISTRATE
					.block("half_shaft_dead_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_FIR_COGWHEEL = REGISTRATE
					.block("half_shaft_fir_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_HELLBARK_COGWHEEL = REGISTRATE
					.block("half_shaft_hellbark_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_JACARANDA_COGWHEEL = REGISTRATE
					.block("half_shaft_jacaranda_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_MAGIC_COGWHEEL = REGISTRATE
					.block("half_shaft_magic_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_MAHOGANY_COGWHEEL = REGISTRATE
					.block("half_shaft_mahogany_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_PALM_COGWHEEL = REGISTRATE
					.block("half_shaft_palm_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_REDWOOD_COGWHEEL = REGISTRATE
					.block("half_shaft_redwood_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_UMBRAN_COGWHEEL = REGISTRATE
					.block("half_shaft_umbran_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> HALF_SHAFT_WILLOW_COGWHEEL = REGISTRATE
					.block("half_shaft_willow_cogwheel", (p) -> new HalfShaftCogWheel(false, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// **********************large halfshaft cogwheels**********************
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_CHERRY_COGWHEEL = REGISTRATE
					.block("large_half_shaft_cherry_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_DEAD_COGWHEEL = REGISTRATE
					.block("large_half_shaft_dead_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_FIR_COGWHEEL = REGISTRATE
					.block("large_half_shaft_fir_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_HELLBARK_COGWHEEL = REGISTRATE
					.block("large_half_shaft_hellbark_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_JACARANDA_COGWHEEL = REGISTRATE
					.block("large_half_shaft_jacaranda_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_MAGIC_COGWHEEL = REGISTRATE
					.block("large_half_shaft_magic_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_MAHOGANY_COGWHEEL = REGISTRATE
					.block("large_half_shaft_mahogany_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_PALM_COGWHEEL = REGISTRATE
					.block("large_half_shaft_palm_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_REDWOOD_COGWHEEL = REGISTRATE
					.block("large_half_shaft_redwood_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_UMBRAN_COGWHEEL = REGISTRATE
					.block("large_half_shaft_umbran_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<HalfShaftCogWheel> LARGE_HALF_SHAFT_WILLOW_COGWHEEL = REGISTRATE
					.block("large_half_shaft_willow_cogwheel", (p) -> new HalfShaftCogWheel(true, p))
					.initialProperties(SharedProperties::stone).transform(BlockStressDefaults.setNoImpact())
					.properties(p -> p.sound(SoundType.WOOD)).blockstate(AllModBlocks::halfShaftGearState)
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// **********************small shaftless_ cogwheels**********************
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_CHERRY_COGWHEEL = REGISTRATE
					.block("shaftless_cherry_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();

			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_DEAD_COGWHEEL = REGISTRATE
					.block("shaftless_dead_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_FIR_COGWHEEL = REGISTRATE
					.block("shaftless_fir_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_HELLBARK_COGWHEEL = REGISTRATE
					.block("shaftless_hellbark_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_JACARANDA_COGWHEEL = REGISTRATE
					.block("shaftless_jacaranda_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_MAGIC_COGWHEEL = REGISTRATE
					.block("shaftless_magic_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_MAHOGANY_COGWHEEL = REGISTRATE
					.block("shaftless_mahogany_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_PALM_COGWHEEL = REGISTRATE
					.block("shaftless_palm_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_REDWOOD_COGWHEEL = REGISTRATE
					.block("shaftless_redwood_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_UMBRAN_COGWHEEL = REGISTRATE
					.block("shaftless_umbran_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> SHAFTLESS_WILLOW_COGWHEEL = REGISTRATE
					.block("shaftless_willow_cogwheel", (p) -> new ShaftlessCogWheel(false, p)).initialProperties(SharedProperties::stone)
					.transform(BlockStressDefaults.setNoImpact()).properties(p -> p.sound(SoundType.WOOD))
					.blockstate(($, $$) -> {}) 
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			// **********************large shaftless cogwheels**********************
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_CHERRY_COGWHEEL = REGISTRATE
					.block("large_shaftless_cherry_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_DEAD_COGWHEEL = REGISTRATE
					.block("large_shaftless_dead_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_FIR_COGWHEEL = REGISTRATE
					.block("large_shaftless_fir_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_HELLBARK_COGWHEEL = REGISTRATE
					.block("large_shaftless_hellbark_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_JACARANDA_COGWHEEL = REGISTRATE
					.block("large_shaftless_jacaranda_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_MAGIC_COGWHEEL = REGISTRATE
					.block("large_shaftless_magic_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_MAHOGANY_COGWHEEL = REGISTRATE
					.block("large_shaftless_mahogany_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_PALM_COGWHEEL = REGISTRATE
					.block("large_shaftless_palm_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_REDWOOD_COGWHEEL = REGISTRATE
					.block("large_shaftless_redwood_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_UMBRAN_COGWHEEL = REGISTRATE
					.block("large_shaftless_umbran_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
			
			public static final BlockEntry<ShaftlessCogWheel> LARGE_SHAFTLESS_WILLOW_COGWHEEL = REGISTRATE
					.block("large_shaftless_willow_cogwheel", (p) -> new ShaftlessCogWheel(true, p)).initialProperties(SharedProperties::stone)
					.properties(p -> p.sound(SoundType.WOOD)).transform(BlockStressDefaults.setNoImpact())
					.blockstate(($, $$) -> {})
					.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new)).item(CogwheelBlockItem::new)
					.build().register();
		

				public static final BlockEntry<EncasedCogwheel> ANDESITE_ENCASED_COGWHEEL =
					REGISTRATE.block("andesite_encased_cogwheel", p -> EncasedCogwheel.andesite(false, p, "Oak"))
						.transform(BuilderTransformers.encasedCogwheel("andesite", AllSpriteShifts.ANDESITE_CASING))
						.onRegister(CreateRegistrate.connectedTextures(new EncasedCogCTBehaviour(AllSpriteShifts.ANDESITE_CASING,
							Couple.create(AllSpriteShifts.ANDESITE_ENCASED_COGWHEEL_SIDE,
								AllSpriteShifts.ANDESITE_ENCASED_COGWHEEL_OTHERSIDE))))
						.transform(axeOrPickaxe())
						.register();

				public static final BlockEntry<EncasedCogwheel> BRASS_ENCASED_COGWHEEL =
					REGISTRATE.block("brass_encased_cogwheel", p -> EncasedCogwheel.brass(false, p, "Oak"))
						.transform(BuilderTransformers.encasedCogwheel("brass", AllSpriteShifts.BRASS_CASING))
						.onRegister(CreateRegistrate.connectedTextures(new EncasedCogCTBehaviour(AllSpriteShifts.BRASS_CASING,
							Couple.create(AllSpriteShifts.BRASS_ENCASED_COGWHEEL_SIDE,
								AllSpriteShifts.BRASS_ENCASED_COGWHEEL_OTHERSIDE))))
						.transform(axeOrPickaxe())
						.register();

				public static final BlockEntry<EncasedCogwheel> ANDESITE_ENCASED_LARGE_COGWHEEL =
					REGISTRATE.block("andesite_encased_large_cogwheel", p -> EncasedCogwheel.andesite(true, p, "Oak"))
						.transform(BuilderTransformers.encasedLargeCogwheel("andesite", AllSpriteShifts.ANDESITE_CASING))
						.transform(axeOrPickaxe())
						.register();

				public static final BlockEntry<EncasedCogwheel> BRASS_ENCASED_LARGE_COGWHEEL =
					REGISTRATE.block("brass_encased_large_cogwheel", p -> EncasedCogwheel.brass(true, p, "Oak"))
						.transform(BuilderTransformers.encasedLargeCogwheel("brass", AllSpriteShifts.BRASS_CASING))
						.transform(axeOrPickaxe())
						.register();
		
		public static void register() {
			CreateGearAddon.registrate().addToSection(OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(BIRCH_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(JUNGLE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(ACACIA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(DARK_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(CRIMSON_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(WARPED_COGWHEEL, AllSections.KINETICS);

			CreateGearAddon.registrate().addToSection(LARGE_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_BIRCH_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_JUNGLE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_ACACIA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_DARK_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_CRIMSON_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_WARPED_COGWHEEL, AllSections.KINETICS);

			CreateGearAddon.registrate().addToSection(HALF_SHAFT_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_BIRCH_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_JUNGLE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_ACACIA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_DARK_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_CRIMSON_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_WARPED_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_BIRCH_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_JUNGLE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_ACACIA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_DARK_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_CRIMSON_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_WARPED_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(SHAFTLESS_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_BIRCH_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_JUNGLE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_ACACIA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_DARK_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_CRIMSON_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_WARPED_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_BIRCH_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_JUNGLE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_ACACIA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_DARK_OAK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_CRIMSON_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_WARPED_COGWHEEL, AllSections.KINETICS);
			
			// **********************large cogwheels**********************
			CreateGearAddon.registrate().addToSection(CHERRY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(DEAD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(FIR_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HELLBARK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(JACARANDA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(MAGIC_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(MAHOGANY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(PALM_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(REDWOOD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(UMBRAN_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(WILLOW_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(LARGE_CHERRY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_DEAD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_FIR_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HELLBARK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_JACARANDA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_MAGIC_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_MAHOGANY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_PALM_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_REDWOOD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_UMBRAN_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_WILLOW_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_CHERRY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_DEAD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_FIR_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_HELLBARK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_JACARANDA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_MAGIC_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_MAHOGANY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_PALM_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_REDWOOD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_UMBRAN_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(HALF_SHAFT_WILLOW_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_CHERRY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_DEAD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_FIR_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_HELLBARK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_JACARANDA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_MAGIC_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_MAHOGANY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_PALM_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_REDWOOD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_UMBRAN_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_HALF_SHAFT_WILLOW_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(SHAFTLESS_CHERRY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_DEAD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_FIR_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_HELLBARK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_JACARANDA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_MAGIC_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_MAHOGANY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_PALM_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_REDWOOD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_UMBRAN_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(SHAFTLESS_WILLOW_COGWHEEL, AllSections.KINETICS);
			
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_CHERRY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_DEAD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_FIR_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_HELLBARK_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_JACARANDA_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_MAGIC_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_MAHOGANY_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_PALM_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_REDWOOD_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_UMBRAN_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(LARGE_SHAFTLESS_WILLOW_COGWHEEL, AllSections.KINETICS);
			
			
			CreateGearAddon.registrate().addToSection(ANDESITE_ENCASED_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(ANDESITE_ENCASED_LARGE_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(BRASS_ENCASED_COGWHEEL, AllSections.KINETICS);
			CreateGearAddon.registrate().addToSection(BRASS_ENCASED_LARGE_COGWHEEL, AllSections.KINETICS);
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
