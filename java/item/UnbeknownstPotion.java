package com.alec.AlsMod.item;

import com.alec.AlsMod.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class UnbeknownstPotion extends ItemFood {

	public UnbeknownstPotion(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_, String unlocalizedName) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setAlwaysEdible();
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(Main.unbeknownstTab);
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 500, 2));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 500, 2));
		return par1ItemStack;
	}

}