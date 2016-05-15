package org.venice.venicemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotVanadium extends Item {
	public IngotVanadium(){
		this.setUnlocalizedName( "ingotVanadium" );
		this.setCreativeTab( CreativeTabs.tabMaterials );
		this.setTextureName( "venicemod:ingotVanadium" );
		this.setMaxStackSize( 64 );
	}
}
