package com.xaros74.creategearaddon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import com.xaros74.creategearaddon.groups.GearAddon;
import com.xaros74.creategearaddon.index.AllModBlocks;
import com.xaros74.creategearaddon.index.AllModItems;
import com.xaros74.creategearaddon.index.AllModTileEntities;
import com.xaros74.creategearaddon.ponder.Ponder;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateGearAddon.MODID)
public class CreateGearAddon {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "creategearaddon";

	public static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MODID);
	private static final NonNullSupplier<CreateRegistrate> no_bop_registrate = CreateRegistrate.lazy(MODID);

	public CreateGearAddon() {
		
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
		
		new GearAddon("gear_addon_group");
		
		AllModBlocks.register();
		AllModItems.register();
		AllModTileEntities.register();
		
		// Register the doClientStuff method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		event.enqueueWork(Ponder::register);
	}

	public static CreateRegistrate registrate(String type) {
		if (type == "bop" && ModList.get().isLoaded("biomesoplenty")) {
			return REGISTRATE.get().creativeModeTab(() -> GearAddon.GEAR_ADDON_GROUP);
		}else
		return no_bop_registrate.get();
	}
	
	public static CreateRegistrate registrate() {
		return REGISTRATE.get().creativeModeTab(() -> GearAddon.GEAR_ADDON_GROUP);
	}
	
	public static CreateRegistrate registrateTile() {
		return REGISTRATE.get();
	}

}
