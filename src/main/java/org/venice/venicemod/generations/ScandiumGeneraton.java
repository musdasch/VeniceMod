package org.venice.venicemod.generations;

import java.util.Random;

import org.venice.venicemod.VeniceMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class ScandiumGeneraton extends OreGeneration {

	public ScandiumGeneraton(){
		this.setInBlock( VeniceMod.oreScandium );
		this.setAppearInOverworld( true );
		this.setChans( 3 );
		this.setMinY( 55 );
		this.setMaxY( 100 );
		this.setMinVienSize( 5 );
		this.setMaxVienSize( 7 );
	}

}
