package com.xaros74.creategearaddon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.NonNullLazyValue;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(CreateGearAddon.MODID)
public class CreateGearAddon
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "creategearaddon";
    
    private static final NonNullLazyValue<CreateRegistrate> registrate = CreateRegistrate.lazy(CreateGearAddon.MODID);

    public CreateGearAddon() {
    	
    	// Register the doClientStuff method for modloading
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

	private void doClientStuff(final FMLClientSetupEvent event) {
		
	}

	public static CreateRegistrate registrate() {
		return registrate.get();
	}
}
