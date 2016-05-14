package org.venice.venicemod;

import org.venice.venicemod.blocks.OreAluminumBauxite;
import org.venice.venicemod.blocks.OreScandium;
import org.venice.venicemod.generations.BauxiteGeneraton;
import org.venice.venicemod.generations.ScandiumGeneraton;
import org.venice.venicemod.items.IngotAluminum;
import org.venice.venicemod.items.IngotScandium;

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
import net.minecraft.item.ItemStack;

@Mod(modid = VeniceMod.MODID, version = VeniceMod.VERSION)
public class VeniceMod {
	
	public static final String MODID = "venicemod";
    public static final String VERSION = "0.1";
    public static final String MODNAME = "Generic Mod";
    
    /**
     * Init all items
     */
    public static Item ingotAluminum;
    public static Item ingotScandium;
    
    /**
     * Init all blocks
     */
    public static Block oreAluminumBauxite;
    public static Block oreScandium;
    
    @Instance(value = VeniceMod.MODID)
    public static VeniceMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	/**
    	 * Declared all items
    	 */
    	ingotAluminum = new IngotAluminum();
    	ingotScandium = new IngotScandium();
    	
    	/**
    	 * Declared all blocks
    	 */
    	oreAluminumBauxite = new OreAluminumBauxite( Material.rock );
    	oreScandium = new OreScandium( Material.rock );
    	
    	/**
    	 * Register all items
    	 */
    	GameRegistry.registerItem( 
    			ingotAluminum, 
    			ingotAluminum
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			ingotScandium, 
    			ingotScandium
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
    	GameRegistry.registerBlock(
    			oreScandium,
    			oreScandium
    				.getLocalizedName()
    				.substring( 5 )
    	);
    	
    	
    	/**
    	 * Register all smelting recipes
    	 */
    	GameRegistry.addSmelting(
    			this.oreAluminumBauxite,
    			new ItemStack(
    					this.ingotAluminum
    			),
    			0.1f
    	);
    	GameRegistry.addSmelting(
    			this.oreScandium,
    			new ItemStack(
    					this.ingotScandium
    			),
    			0.1f
    	);
    	
    	/**
    	 * Gegister all WorldGenerators
    	 */
    	GameRegistry.registerWorldGenerator(
    			new BauxiteGeneraton(),
    			0
    	);
    	GameRegistry.registerWorldGenerator(
    			new ScandiumGeneraton(),
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
