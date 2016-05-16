package org.venice.venicemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CrystalChromite extends Item {
	public CrystalChromite(){
		this.setUnlocalizedName( "crystalChromite" );
		this.setCreativeTab( CreativeTabs.tabMaterials );
		this.setTextureName( "venicemod:crystalChromite" );
		this.setMaxStackSize( 64 );
	}
}
