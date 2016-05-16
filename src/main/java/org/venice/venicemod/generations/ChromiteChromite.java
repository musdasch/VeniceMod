package org.venice.venicemod.generations;

import org.venice.venicemod.VeniceMod;

public class ChromiteChromite extends OreGeneration {

	public ChromiteChromite(){
		this.setInBlock( VeniceMod.oreChromite);
		this.setAppearInOverworld( true );
		this.setChans( 15 );
		this.setMinY( 50 );
		this.setMaxY( 100 );
		this.setMinVienSize( 6 );
		this.setMaxVienSize( 15 );
	}

}
