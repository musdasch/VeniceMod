package org.venice.venicemod.items;

import org.venice.venicemod.VeniceMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class Nife extends ItemSword {
	
	public Nife( Item.ToolMaterial material, String unlocalizedName ){
		super( material );
		this.setUnlocalizedName( unlocalizedName );
		this.setCreativeTab( CreativeTabs.tabCombat );
		this.setTextureName( VeniceMod.MODID + ":" + unlocalizedName );
		this.setMaxStackSize( 1 );
		this.setMaxDamage( material.getMaxUses() - 1 );
	}
	
	/**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity( ItemStack itemStack, EntityLivingBase entityTarget, EntityLivingBase entityPlayer ){
    	itemStack.damageItem( 1, entityPlayer );
        return true;
	}
}
