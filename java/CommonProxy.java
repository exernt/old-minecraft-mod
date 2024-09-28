package com.alec.AlsMod;

import com.alec.AlsMod.block.ModBlocks;
import com.alec.AlsMod.crafting.ModCrafting;
import com.alec.AlsMod.item.ModItems;
import com.alec.AlsMod.world.ModWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
		ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		ModCrafting.init();
    }

    public void postInit(FMLPostInitializationEvent e) {
    	
    }
}
