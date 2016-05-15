package org.venice.venicemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreVanadiumVanadinit extends Block {
	public OreVanadiumVanadinit( Material material ) {
		super( material );
		this.setBlockName( "oreVanadiumVanadinit" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreVanadiumVanadinit" );
		this.setHardness( 2.0F );
		this.setResistance( 4.0F );
	}
}
