package com.alec.AlsMod.crafting;

import com.alec.AlsMod.block.ModBlocks;
import com.alec.AlsMod.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {
	public static final void init(){
		    	GameRegistry.addRecipe(new ItemStack(ModItems.unbeknownstSword), new Object []
		    			{
		    					" x ",
		    					"yxy",
		    					"zaz",
		    					
		    					'x', Items.iron_ingot,
		    					'y', Items.diamond,
		    					'z', ModItems.elementalIngot,
		    					'a', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.jaderitePickaxe), new Object []
		    			{
		    					"xxx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.jaderiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.jaderiteShovel), new Object []
		    			{
		    					" x ",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.jaderiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.jaderiteHoe), new Object []
		    			{
		    					" xx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.jaderiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.lavaritePickaxe), new Object []
		    			{
		    					"xxx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.lavariteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.lavariteShovel), new Object []
		    			{
		    					" x ",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.lavariteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.lavariteHoe), new Object []
		    			{
		    					" xx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.lavariteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.sunneritePickaxe), new Object []
		    			{
		    					"xxx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.sunneriteShovel), new Object []
		    			{
		    					" x ",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.sunneriteHoe), new Object []
		    			{
		    					" xx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.ruberitePickaxe), new Object [] 
		    			{
		    					"xxx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.ruberiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.ruberiteShovel), new Object [] 
		    			{
		    					" x ",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.ruberiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.ruberiteHoe), new Object []
		    			{
		    					" xx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.ruberiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.enderitePickaxe), new Object []
		    			{
		    					"xxx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.enderiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.enderiteShovel), new Object [] 
		    			{
		    					" x ",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.enderiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.enderiteHoe), new Object []
		    			{
		    					" xx",
		    					" y ",
		    					" y ",
		    					
		    					'x', ModItems.enderiteIngot,
		    					'y', Items.stick,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.godlikeHelmet), new Object []
		    			{
		    					"xyx",
		    					"x x",
		    					"   ",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', ModItems.elementalIngot,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.godlikeChestplate), new Object [] 
		    			{
		    					"x x",
		    					"xyx",
		    					"xxx",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', ModItems.elementalIngot,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.godlikeLeggings), new Object []
		    			{
		    					"xyx",
		    					"x x",
		    					"x x",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', ModItems.elementalIngot,
		    			});
		    	GameRegistry.addRecipe(new ItemStack(ModItems.godlikeBoots), new Object []
		    			{
		    					"   ",
		    					"x x",
		    					"y y",
		    					
		    					'x', ModItems.sunneriteIngot,
		    					'y', ModItems.elementalIngot,
		    			});
		    	
		    	//Furnace recipes here
		    	GameRegistry.addSmelting(Items.ender_pearl, new ItemStack(Items.ender_eye, 1), 1600.0F);
		    	GameRegistry.addSmelting(ModBlocks.elementalOre, new ItemStack(ModItems.elementalIngot, 1), 1600.0F);
			}
		}
