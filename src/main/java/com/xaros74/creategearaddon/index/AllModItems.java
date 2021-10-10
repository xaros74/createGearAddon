package com.xaros74.creategearaddon.index;

import com.simibubi.create.content.AllSections;
import com.simibubi.create.content.contraptions.itemAssembly.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import com.xaros74.creategearaddon.CreateGearAddon;

public class AllModItems {
	private static final CreateRegistrate REGISTRATE = CreateGearAddon.registrate();

	// **************************cogwheels**************************
	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_OAK_COGWHEEL = REGISTRATE
			.item("incomplete_oak_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_BIRCH_COGWHEEL = REGISTRATE
			.item("incomplete_birch_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_JUNGLE_COGWHEEL = REGISTRATE
			.item("incomplete_jungle_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_ACACIA_COGWHEEL = REGISTRATE
			.item("incomplete_acacia_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_DARK_OAK_COGWHEEL = REGISTRATE
			.item("incomplete_dark_oak_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_CRIMSON_COGWHEEL = REGISTRATE
			.item("incomplete_crimson_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_WARPED_COGWHEEL = REGISTRATE
			.item("incomplete_warped_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	// **************************large cogwheels**************************
	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_OAK_COGWHEEL = REGISTRATE
			.item("incomplete_large_oak_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_BIRCH_COGWHEEL = REGISTRATE
			.item("incomplete_large_birch_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_JUNGLE_COGWHEEL = REGISTRATE
			.item("incomplete_large_jungle_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_ACACIA_COGWHEEL = REGISTRATE
			.item("incomplete_large_acacia_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_DARK_OAK_COGWHEEL = REGISTRATE
			.item("incomplete_large_dark_oak_cogwheel", SequencedAssemblyItem::new)
			.model(AssetLookup.existingItemModel()).register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_CRIMSON_COGWHEEL = REGISTRATE
			.item("incomplete_large_crimson_cogwheel", SequencedAssemblyItem::new)
			.model(AssetLookup.existingItemModel()).register();

	public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_LARGE_WARPED_COGWHEEL = REGISTRATE
			.item("incomplete_large_warped_cogwheel", SequencedAssemblyItem::new).model(AssetLookup.existingItemModel())
			.register();

	public static void register() {
		REGISTRATE.addToSection(INCOMPLETE_OAK_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_BIRCH_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_JUNGLE_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_ACACIA_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_DARK_OAK_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_CRIMSON_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_WARPED_COGWHEEL, AllSections.MATERIALS);

		REGISTRATE.addToSection(INCOMPLETE_LARGE_OAK_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_LARGE_BIRCH_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_LARGE_JUNGLE_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_LARGE_ACACIA_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_LARGE_DARK_OAK_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_LARGE_CRIMSON_COGWHEEL, AllSections.MATERIALS);
		REGISTRATE.addToSection(INCOMPLETE_LARGE_WARPED_COGWHEEL, AllSections.MATERIALS);
	}

}
