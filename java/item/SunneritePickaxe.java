package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import net.minecraft.item.ItemPickaxe;

public class SunneritePickaxe extends ItemPickaxe {

	protected SunneritePickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
	}

}
