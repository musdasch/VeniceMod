package org.venice.venicemod.generations;

import org.venice.venicemod.VeniceMod;

public class BauxiteGeneraton extends OreGeneration {

	public BauxiteGeneraton() {
		this.setInBlock( VeniceMod.oreAluminumBauxite );
		this.setAppearInOverworld( true );
		this.setChans( 20 );
		this.setMinY( 40 );
		this.setMaxY( 100 );
		this.setMinVienSize( 6 );
		this.setMaxVienSize( 15 );
	}

}
