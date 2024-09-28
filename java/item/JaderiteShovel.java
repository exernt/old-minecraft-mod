package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import net.minecraft.item.ItemSpade;

public class JaderiteShovel extends ItemSpade {

	public JaderiteShovel(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
	}

}
