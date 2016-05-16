package org.venice.venicemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreCrocoite extends Block {
	public OreCrocoite( Material material ){
		super( material );
		this.setBlockName( "oreCrocoite" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreCrocoite" );
		this.setHardness( 7.0F );
		this.setResistance( 10.0F );
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}

}
