package org.venice.venicemod;

import org.venice.venicemod.blocks.BlockAluminumOre;
import org.venice.venicemod.items.ItemAluminumIngot;

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
    public static Item itemAluminumIngot;
    
    /**
     * Init all blocks
     */
    public static Block blockAluminumOre;
    
    @Instance(value = VeniceMod.MODID)
    public static VeniceMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	/**
    	 * Declared all items
    	 */
    	itemAluminumIngot = new ItemAluminumIngot();
    	
    	/**
    	 * Declared all blocks
    	 */
    	blockAluminumOre = new BlockAluminumOre( Material.rock );
    	
    	/**
    	 * Register all items
    	 */
    	GameRegistry.registerItem( 
    			itemAluminumIngot, 
    			itemAluminumIngot
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	
    	/**
    	 * Register all blocks
    	 */
    	GameRegistry.registerBlock(
    			blockAluminumOre,
    			blockAluminumOre
    				.getLocalizedName()
    				.substring( 5 )
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
