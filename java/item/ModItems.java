package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {
	
	//ToolMaterial
	public static ToolMaterial jaderiteMat = EnumHelper.addToolMaterial("JaderiteMat", 2, 1000, 8.3F, 3.25F, 17);
    public static ToolMaterial ruberiteMat = EnumHelper.addToolMaterial("RuberiteMat", 2, 1150, 8.5F, 3.55F, 17);
    public static ToolMaterial lavariteMat = EnumHelper.addToolMaterial("LavariteMat", 3, 1300, 9.0F, 4.0F, 18);
    public static ToolMaterial sunneriteMat = EnumHelper.addToolMaterial("SunneriteMat", 3, 1350, 9.25F, 3.4F, 18);
    public static ToolMaterial enderiteMat = EnumHelper.addToolMaterial("EnderiteMat", 3, 1600, 9.75F, 3.75F, 20);
    public static ToolMaterial unbeknownstMat = EnumHelper.addToolMaterial("UnbeknownstMat", 3, 2000, 10.0F, 20.0F, 22);
	public static ArmorMaterial godlikeMat = EnumHelper.addArmorMaterial("godlikeMat", 550, new int[]{6, 16, 12, 6}, 25);
    
    //Declare
    public static Item unbeknownstSword;    
    public static Item godlikeHelmet;
    public static Item godlikeChestplate;
    public static Item godlikeLeggings;
    public static Item godlikeBoots;    
    public static Item jaderiteIngot;
    public static Item lavariteIngot;
    public static Item sunneriteIngot;
    public static Item ruberiteIngot;
    public static Item enderiteIngot;
    public static Item elementalIngot;   
    public static Item jaderitePickaxe;
    public static Item jaderiteShovel;
    public static Item jaderiteHoe;    
    public static Item lavaritePickaxe;
    public static Item lavariteShovel;
    public static Item lavariteHoe;    
    public static Item ruberitePickaxe;
    public static Item ruberiteShovel;
    public static Item ruberiteHoe;    
    public static Item sunneritePickaxe;
    public static Item sunneriteShovel;
    public static Item sunneriteHoe;
    public static Item enderitePickaxe;
    public static Item enderiteShovel;
    public static Item enderiteHoe;
    public static Item unbeknownstPotion;
    
	public static final void init(){
		GameRegistry.registerItem(unbeknownstSword = new UnbeknownstSword("theunbeknownstitem", unbeknownstMat), "Unbeknownst Sword");
		GameRegistry.registerItem(godlikeHelmet = new GodlikeArmor("godlikeHelmet", godlikeMat, "godlikearmor", 0), "Godlike Helmet");
		GameRegistry.registerItem(godlikeChestplate = new GodlikeArmor("godlikeChestplate", godlikeMat, "godlikearmor", 1), "Godlike Chestplate");
		GameRegistry.registerItem(godlikeLeggings = new GodlikeArmor("godlikeLeggings", godlikeMat, "godlikearmor", 2), "Godlike Leggings"); 
		GameRegistry.registerItem(godlikeBoots = new GodlikeArmor("godlikeBoots", godlikeMat, "godlikearmor", 3), "Godlike Boots"); 
		GameRegistry.registerItem(jaderiteIngot = new Item().setUnlocalizedName("jaderite_ingot").setTextureName(Main.MODID + ":" + "jaderite_ingot").setCreativeTab(Main.unbeknownstTab), "Jaderite Ingot");
		GameRegistry.registerItem(lavariteIngot = new Item().setUnlocalizedName("lavarite_ingot").setTextureName(Main.MODID + ":" + "lavarite_ingot").setCreativeTab(Main.unbeknownstTab), "Lavarite Ingot");
		GameRegistry.registerItem(sunneriteIngot = new Item().setUnlocalizedName("sunnerite_ingot").setTextureName(Main.MODID + ":" + "sunnerite_ingot").setCreativeTab(Main.unbeknownstTab), "Sunnerite Ingot");
		GameRegistry.registerItem(ruberiteIngot = new Item().setUnlocalizedName("ruberite_ingot").setTextureName(Main.MODID + ":" + "ruberite_ingot").setCreativeTab(Main.unbeknownstTab), "Ruberite Ingot");
		GameRegistry.registerItem(sunneriteIngot = new Item().setUnlocalizedName("enderite_ingot").setTextureName(Main.MODID + ":" + "enderite_ingot").setCreativeTab(Main.unbeknownstTab), "Enderite Ingot");
		GameRegistry.registerItem(elementalIngot = new Item().setUnlocalizedName("elemental_ingot").setTextureName(Main.MODID + ":" + "elemental_ingot").setCreativeTab(Main.unbeknownstTab), "Elemental Ingot");		
		GameRegistry.registerItem(jaderitePickaxe = new JaderitePickaxe("jaderite_pickaxe", jaderiteMat), "Jaderite Pickaxe");
		GameRegistry.registerItem(jaderiteShovel = new JaderiteShovel("jaderite_shovel", jaderiteMat), "Jaderite Shovel");
		GameRegistry.registerItem(jaderiteHoe = new JaderiteHoe("jaderite_hoe", jaderiteMat), "Jaderite Hoe");		
		GameRegistry.registerItem(lavaritePickaxe = new LavaritePickaxe("lavarite_pickaxe", lavariteMat), "Lavarite Pickaxe");
		GameRegistry.registerItem(lavariteShovel = new LavariteShovel("lavartie_shovel", lavariteMat), "Lavarite Shovel");
		GameRegistry.registerItem(lavariteHoe = new LavariteHoe("lavarite_hoe", lavariteMat), "Lavarite Hoe");		
		GameRegistry.registerItem(ruberitePickaxe = new RuberitePickaxe("ruberite_pickaxe", ruberiteMat), "Ruberite Pickaxe");
		GameRegistry.registerItem(ruberiteShovel = new RuberiteShovel("ruberite_shovel", ruberiteMat), "Ruberite Shovel");
		GameRegistry.registerItem(ruberiteHoe = new RuberiteHoe("ruberite_hoe", ruberiteMat), "Ruberite Hoe");		
		GameRegistry.registerItem(sunneritePickaxe = new SunneritePickaxe("sunnerite_pickaxe", sunneriteMat), "Sunnerite Pickaxe");
		GameRegistry.registerItem(sunneriteShovel = new SunneriteShovel("sunnerite_shovel", sunneriteMat), "Sunnerite Shovel");
		GameRegistry.registerItem(sunneriteHoe = new SunneriteHoe("sunnerite_hoe", sunneriteMat), "Sunnerite Hoe");
		GameRegistry.registerItem(enderitePickaxe = new EnderitePickaxe("enderite_pickaxe", enderiteMat), "Enderite Pickaxe");
		GameRegistry.registerItem(enderiteShovel = new EnderiteShovel("enderite_shovel", enderiteMat), "Enderite Shovel");
		GameRegistry.registerItem(enderiteHoe = new EnderiteHoe("enderite_hoe", enderiteMat), "Enderite Hoe");
		GameRegistry.registerItem(unbeknownstPotion = new UnbeknownstPotion(20, 20.0F, false, "unbeknownst_potion"), "Unbeknownst Potion");
	}
}
