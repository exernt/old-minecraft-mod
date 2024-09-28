package com.alec.AlsMod;

import com.alec.AlsMod.item.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "AlsMod";
    public static final String MODNAME = "Al's Mod";
    public static final String VERSION = "1.0.0";
    
    public static final CreativeTabs unbeknownstTab = new CreativeTabs("myMod") {
	    @Override public Item getTabIconItem() {
	        return ModItems.unbeknownstSword;
	    }
	};
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.alec.AlsMod.ClientProxy", serverSide="com.alec.AlsMod.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
