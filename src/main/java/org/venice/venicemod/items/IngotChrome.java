package org.venice.venicemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotChrome extends Item {
	public IngotChrome(){
		this.setUnlocalizedName( "ingotChrome" );
		this.setCreativeTab( CreativeTabs.tabMaterials );
		this.setTextureName( "venicemod:ingotChrome" );
		this.setMaxStackSize( 64 );
	}
}
