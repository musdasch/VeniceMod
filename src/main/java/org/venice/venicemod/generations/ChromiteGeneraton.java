package org.venice.venicemod.generations;

import org.venice.venicemod.VeniceMod;

public class ChromiteGeneraton extends OreGeneration {
	public ChromiteGeneraton(){
		this.setInBlock( VeniceMod.oreChromite );
		this.setAppearInOverworld( true );
		this.setChans( 20 );
		this.setMinY( 50 );
		this.setMaxY( 120 );
		this.setMinVienSize( 6 );
		this.setMaxVienSize( 15 );
	}
}
