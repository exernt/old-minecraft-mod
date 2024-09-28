package com.alec.AlsMod.block;

import java.util.Random;

import com.alec.AlsMod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class ElementalOre extends Block {
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	public IIcon[] icons = new IIcon[6];

	protected ElementalOre(String unlocalizedName, Material material, Item drop, int meta, int least_quantity, int most_quantity) {
		super(material);
		this.drop = drop;
	    this.meta = meta;
	    this.least_quantity = least_quantity;
	    this.most_quantity = most_quantity;
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
		this.setHardness(3.0F);
	}
	
	protected ElementalOre(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
	    this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected ElementalOre(String unlocalizedName, Material mat, Item drop) {
	    this(unlocalizedName, mat, drop, 1, 1);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return (1+fortune);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 3; i ++) {
	        if (i == 0)
	        	this.icons[0] = reg.registerIcon(Main.MODID + ":sunnerite_ore");
	        	this.icons[1] = reg.registerIcon(Main.MODID + ":sunnerite_ore");
	        if (i == 1)
	        	this.icons[2] = reg.registerIcon(Main.MODID + ":enderite_ore");
	        	this.icons[3] = reg.registerIcon(Main.MODID + ":enderite_ore");
	        if (i == 2)
	        	this.icons[4] = reg.registerIcon(Main.MODID + ":lavarite_ore");
	        	this.icons[5] = reg.registerIcon(Main.MODID + ":lavarite_ore");
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}

}
