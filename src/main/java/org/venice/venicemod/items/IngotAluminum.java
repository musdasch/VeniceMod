package org.venice.venicemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotAluminum extends Item {
	
	public IngotAluminum(){
		this.setUnlocalizedName( "ingotAluminium" );
		this.setCreativeTab( CreativeTabs.tabMaterials );
		this.setTextureName( "venicemod:ingotAluminium" );
		this.setMaxStackSize( 64 );
	}

}
