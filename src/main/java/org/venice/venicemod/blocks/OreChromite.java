package org.venice.venicemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreChromite extends Block {
	public OreChromite( Material material ){
		super( material );
		this.setBlockName( "oreChromite" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreChromite" );
		this.setHardness( 7.0F );
		this.setResistance( 10.0F );
	}
}
