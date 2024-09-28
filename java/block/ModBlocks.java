package com.alec.AlsMod.block;

import com.alec.AlsMod.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {
	
	public static Block jaderiteOre;
	public static Block ruberiteOre;
	public static Block lavariteOre;
	public static Block sunneriteOre;
	public static Block enderiteOre;
	public static Block elementalOre;
	
	public static final void init() {
		GameRegistry.registerBlock(jaderiteOre = new JaderiteOre("jaderite_ore", Material.rock, ModItems.jaderiteIngot, 1, 2), "Jaderite Ore");
		GameRegistry.registerBlock(ruberiteOre = new RuberiteOre("ruberite_ore", Material.rock, ModItems.ruberiteIngot, 1, 2), "Ruberite Ore");
		GameRegistry.registerBlock(lavariteOre = new LavariteOre("lavarite_ore", Material.rock, ModItems.lavariteIngot, 1, 2), "Lavarite Ore");
		GameRegistry.registerBlock(sunneriteOre = new SunneriteOre("sunnerite_ore", Material.rock, ModItems.sunneriteIngot, 1, 2), "Sunnerite Ore");
		GameRegistry.registerBlock(enderiteOre = new EnderiteOre("enderite_ore", Material.rock, ModItems.enderiteIngot, 1, 2), "Enderite Ore");
		GameRegistry.registerBlock(elementalOre = new ElementalOre("elemental_ore", Material.rock, ModItems.elementalIngot, 1, 2), "Elemental Ore");
	}
}
