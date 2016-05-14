package org.venice.venicemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAluminumOre extends Block {

	public BlockAluminumOre( Material material ) {
		super( material );
		this.setBlockName( "oreAluminumBauxite" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreAluminumBauxite" );
		this.setHardness( 3.0F );
		this.setResistance( 5.0F );
	}

}
