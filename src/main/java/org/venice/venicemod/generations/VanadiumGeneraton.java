package org.venice.venicemod.generations;

import org.venice.venicemod.VeniceMod;

public class VanadiumGeneraton extends OreGeneration {
	public VanadiumGeneraton(){
		this.setInBlock( VeniceMod.oreVanadiumVanadinit );
		this.setAppearInOverworld( true );
		this.setChans( 20 );
		this.setMinY( 50 );
		this.setMaxY( 120 );
		this.setMinVienSize( 6 );
		this.setMaxVienSize( 15 );
	}
}
