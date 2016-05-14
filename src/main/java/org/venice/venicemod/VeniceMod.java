package org.venice.venicemod;

import org.venice.venicemod.blocks.OreAluminumBauxite;
import org.venice.venicemod.generations.BauxiteGeneraton;
import org.venice.venicemod.items.IngotAluminum;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

@Mod(modid = VeniceMod.MODID, version = VeniceMod.VERSION)
public class VeniceMod {
	
	public static final String MODID = "venicemod";
    public static final String VERSION = "0.1";
    public static final String MODNAME = "Generic Mod";
    
    /**
     * Init all items
     */
    public static Item ingotAluminum;
    
    /**
     * Init all blocks
     */
    public static Block oreAluminumBauxite;
    
    @Instance(value = VeniceMod.MODID)
    public static VeniceMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	/**
    	 * Declared all items
    	 */
    	ingotAluminum = new IngotAluminum();
    	
    	/**
    	 * Declared all blocks
    	 */
    	oreAluminumBauxite = new OreAluminumBauxite( Material.rock );
    	
    	/**
    	 * Register all items
    	 */
    	GameRegistry.registerItem( 
    			ingotAluminum, 
    			ingotAluminum
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	
    	/**
    	 * Register all blocks
    	 */
    	GameRegistry.registerBlock(
    			oreAluminumBauxite,
    			oreAluminumBauxite
    				.getLocalizedName()
    				.substring( 5 )
    	);
    	
    	GameRegistry.registerWorldGenerator(
    			new BauxiteGeneraton(),
    			0
    	);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	//TODO
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	//TODO
    }
}
