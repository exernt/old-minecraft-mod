package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import net.minecraft.item.ItemHoe;

public class LavariteHoe extends ItemHoe{

	public LavariteHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
	}

}
