package com.xaros74.creategearaddon.groups;

import com.xaros74.creategearaddon.CreateGearAddon;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GearAddon extends CreativeModeTab {

	public static GearAddon GEAR_ADDON_GROUP;

	public GearAddon(String label) {
		super(CreateGearAddon.MODID + "." + label);
		GEAR_ADDON_GROUP = this;
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return null;
	}

}
