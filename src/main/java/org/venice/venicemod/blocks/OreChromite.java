package org.venice.venicemod.blocks;

import java.util.Random;

import org.venice.venicemod.VeniceMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreChromite extends Block {
	public OreChromite( Material material ){
		super( material );
		this.setBlockName( "oreChromite" );
		this.setCreativeTab( CreativeTabs.tabBlock );
		this.setBlockTextureName( "venicemod:oreChromite" );
		this.setHardness( 7.0F );
		this.setResistance( 10.0F );
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public Item getItemDropped( int metadata, Random rand, int fortune ){
		return VeniceMod.crystalChromite;
	}
	
	@Override
	public int quantityDropped( Random rand ){
		return 2 + rand.nextInt( 5 );
	}
}
