package com.xaros74.creategearaddon.ponder;

import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderRegistry;
import com.simibubi.create.foundation.ponder.content.KineticsScenes;
import com.simibubi.create.foundation.ponder.content.PonderTag;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.index.AllModBlocks;

public class Ponder {
	static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateGearAddon.MODID);

	public static void register() {
		HELPER.addStoryBoard(AllModBlocks.OAK_COGWHEEL, "small_oak", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.OAK_COGWHEEL, "speedup_oak", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.BIRCH_COGWHEEL, "small_birch", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.BIRCH_COGWHEEL, "speedup_birch", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.JUNGLE_COGWHEEL, "small_jungle", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.JUNGLE_COGWHEEL, "speedup_jungle", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.ACACIA_COGWHEEL, "small_acacia", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.ACACIA_COGWHEEL, "speedup_acacia", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.DARK_OAK_COGWHEEL, "small_dark_oak", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.DARK_OAK_COGWHEEL, "speedup_dark_oak", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.CRIMSON_COGWHEEL, "small_crimson", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.CRIMSON_COGWHEEL, "speedup_crimson", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.WARPED_COGWHEEL, "small_warped", KineticsScenes::cogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.WARPED_COGWHEEL, "speedup_warped", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_OAK_COGWHEEL, "large_oak", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_OAK_COGWHEEL, "speedup_oak", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_BIRCH_COGWHEEL, "large_birch", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_BIRCH_COGWHEEL, "speedup_birch", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_JUNGLE_COGWHEEL, "large_jungle", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_JUNGLE_COGWHEEL, "speedup_jungle", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_ACACIA_COGWHEEL, "large_acacia", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_ACACIA_COGWHEEL, "speedup_acacia", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_DARK_OAK_COGWHEEL, "large_dark_oak", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_DARK_OAK_COGWHEEL, "speedup_dark_oak", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_CRIMSON_COGWHEEL, "large_crimson", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_CRIMSON_COGWHEEL, "speedup_crimson", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		HELPER.addStoryBoard(AllModBlocks.LARGE_WARPED_COGWHEEL, "large_warped", KineticsScenes::largeCogAsRelay,
				PonderTag.KINETIC_RELAYS);
		HELPER.addStoryBoard(AllModBlocks.LARGE_WARPED_COGWHEEL, "speedup_warped", KineticsScenes::cogsSpeedUp,
				PonderTag.KINETIC_RELAYS);

		PonderRegistry.TAGS.forTag(PonderTag.KINETIC_RELAYS).add(AllModBlocks.OAK_COGWHEEL)
				.add(AllModBlocks.BIRCH_COGWHEEL).add(AllModBlocks.JUNGLE_COGWHEEL).add(AllModBlocks.ACACIA_COGWHEEL)
				.add(AllModBlocks.DARK_OAK_COGWHEEL).add(AllModBlocks.CRIMSON_COGWHEEL)
				.add(AllModBlocks.WARPED_COGWHEEL).add(AllModBlocks.LARGE_OAK_COGWHEEL)
				.add(AllModBlocks.LARGE_BIRCH_COGWHEEL).add(AllModBlocks.LARGE_JUNGLE_COGWHEEL)
				.add(AllModBlocks.LARGE_ACACIA_COGWHEEL).add(AllModBlocks.LARGE_DARK_OAK_COGWHEEL)
				.add(AllModBlocks.LARGE_CRIMSON_COGWHEEL).add(AllModBlocks.LARGE_WARPED_COGWHEEL);
	}

}
