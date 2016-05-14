package org.venice.venicemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreScandium extends Block {

	public OreScandium( Material material ) {
		super( material );
		this.setBlockName( "oreScandium" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreScandium" );
		this.setHardness( 4.0F );
		this.setResistance( 6.0F );
	}

}
