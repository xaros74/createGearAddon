package com.xaros74.creategearaddon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.NonNullLazyValue;
import com.xaros74.creategearaddon.groups.GearAddon;
import com.xaros74.creategearaddon.index.AllModBlockPartials;
import com.xaros74.creategearaddon.index.AllModBlocks;
import com.xaros74.creategearaddon.index.AllModItems;
import com.xaros74.creategearaddon.index.AllModTileEntities;
import com.xaros74.creategearaddon.ponder.Ponder;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(CreateGearAddon.MODID)
public class CreateGearAddon
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "creategearaddon";
    
    private static final NonNullLazyValue<CreateRegistrate> registrate = CreateRegistrate.lazy(CreateGearAddon.MODID);

    public CreateGearAddon() {
    	
    	IEventBus modEventBus = FMLJavaModLoadingContext.get()
    			.getModEventBus();
    		IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
    	
    	
    		modEventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        forgeEventBus.register(this);
        
        new GearAddon("gear_addon_group");
        
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> clientInit());
		AllModBlocks.register();
		AllModTileEntities.register();
		AllModItems.register();
    }
    
    private void clientInit() {
    	LOGGER.info("init block partial");
    	AllModBlockPartials.init();
    	LOGGER.info(AllModBlockPartials.PARTIAL_SHAFTLESS_BIRCH_COGWHEEL.getLocation());
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
		event.enqueueWork(Ponder::register);
	}
    
	public static CreateRegistrate registrate() {
		return registrate.get();
	}
	
	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(MODID, path);
	}
}
