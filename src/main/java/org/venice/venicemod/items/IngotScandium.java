package org.venice.venicemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotScandium extends Item {
	public IngotScandium(){
		this.setUnlocalizedName( "ingotScandium" );
		this.setCreativeTab( CreativeTabs.tabMaterials );
		this.setTextureName( "venicemod:ingotScandium" );
		this.setMaxStackSize( 64 );
	}
}
