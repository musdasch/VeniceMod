package org.venice.venicemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotTitanium extends Item {
	public IngotTitanium(){
		this.setUnlocalizedName( "ingotTitanium" );
		this.setCreativeTab( CreativeTabs.tabMaterials );
		this.setTextureName( "venicemod:ingotTitanium" );
		this.setMaxStackSize( 64 );
	}
}
