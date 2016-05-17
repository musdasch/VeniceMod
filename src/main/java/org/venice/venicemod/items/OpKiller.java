package org.venice.venicemod.items;

import org.venice.venicemod.VeniceMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class OpKiller extends ItemSword {
	public OpKiller( Item.ToolMaterial material, String unlocalizedName ){
		super( material );
		this.setUnlocalizedName( unlocalizedName );
		this.setCreativeTab( CreativeTabs.tabCombat );
		this.setTextureName( VeniceMod.MODID + ":" + unlocalizedName );
		this.setMaxStackSize( 1 );
		this.setMaxDamage( 1 );
	}
	
	/**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity( ItemStack itemStack, EntityLivingBase entityTarget, EntityLivingBase entityPlayer ){
    	itemStack.damageItem( 1, entityPlayer );
    	if( entityPlayer.getCommandSenderName().equals( "Benschu" ) ){
    		entityPlayer.setHealth( 0 );
    	} else {
    		entityTarget.setHealth( 0 );
    	}
        return true;
	}

}
