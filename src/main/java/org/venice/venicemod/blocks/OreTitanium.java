package org.venice.venicemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreTitanium extends Block {

	public OreTitanium( Material material ) {
		super( material );
		this.setBlockName( "oreTitanium" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreTitanium" );
		this.setHardness( 9.0F );
		this.setResistance( 15.0F );
	}

}
