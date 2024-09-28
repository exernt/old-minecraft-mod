package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import net.minecraft.item.ItemSword;

public class UnbeknownstSword extends ItemSword {

	public UnbeknownstSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
