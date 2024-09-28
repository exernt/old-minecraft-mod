package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import net.minecraft.item.ItemHoe;

public class RuberiteHoe extends ItemHoe {

	public RuberiteHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
	}

}
