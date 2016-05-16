package org.venice.venicemod;

import org.venice.venicemod.blocks.OreAluminumBauxite;
import org.venice.venicemod.blocks.OreChromite;
import org.venice.venicemod.blocks.OreCrocoite;
import org.venice.venicemod.blocks.OreScandium;
import org.venice.venicemod.blocks.OreTitanium;
import org.venice.venicemod.blocks.OreVanadiumVanadinit;
import org.venice.venicemod.generations.BauxiteGeneraton;
import org.venice.venicemod.generations.ChromiteChromite;
import org.venice.venicemod.generations.ChromiteGeneraton;
import org.venice.venicemod.generations.ScandiumGeneraton;
import org.venice.venicemod.generations.TitaniumGeneraton;
import org.venice.venicemod.generations.VanadiumGeneraton;
import org.venice.venicemod.items.CrystalChromite;
import org.venice.venicemod.items.IngotAluminum;
import org.venice.venicemod.items.IngotChrome;
import org.venice.venicemod.items.IngotScandium;
import org.venice.venicemod.items.IngotTitanium;
import org.venice.venicemod.items.IngotVanadium;

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
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = VeniceMod.MODID, version = VeniceMod.VERSION)
public class VeniceMod {
	
	/**
	 * TODO Longfolingbutes
	 * TODO Cola
	 * TODO Lunch Box
	 * TODO Bir
	 * TODO Kautabag
	 * TODO Kartong
	 * TODO Wax Paper
	 * TODO Apple and Bread
	 * TODO Bier Glass
	 * 
	 * ------------------
	 * TODO Palmen
	 * TODO Trauven
	 * TODO Hopfen
	 * 
	 * ------------------
	 * TODO U-Boot
	 * TODO minien
	 * 
	 * 
	 * ------------------
	 * TODO Elefante
	 */
	
	public static final String MODID = "venicemod";
    public static final String VERSION = "0.2";
    public static final String MODNAME = "Generic Mod";
    
    @Instance(value = VeniceMod.MODID)
    public static VeniceMod instance;
    
    /**
     * Init all items
     */
    public static Item ingotAluminum;
    public static Item ingotScandium;
    public static Item ingotTitanium;
    public static Item ingotVanadium;
    public static Item ingotChrome;
    public static Item crystalChromite;
    
    /**
     * Init all blocks
     */
    public static Block oreAluminumBauxite;
    public static Block oreScandium;
    public static Block oreTitanium;
    public static Block oreVanadiumVanadinit;
    public static Block oreChromite;
    public static Block oreCrocoite;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	/**
    	 * Declared all items
    	 */
    	ingotAluminum = new IngotAluminum();
    	ingotScandium = new IngotScandium();
    	ingotTitanium = new IngotTitanium();
    	ingotVanadium = new IngotVanadium();
    	ingotChrome = new IngotChrome();
    	crystalChromite = new CrystalChromite();
    	
    	/**
    	 * Declared all blocks
    	 */
    	oreAluminumBauxite = new OreAluminumBauxite( Material.rock );
    	oreScandium = new OreScandium( Material.rock );
    	oreTitanium = new OreTitanium( Material.rock );
    	oreVanadiumVanadinit = new OreVanadiumVanadinit( Material.rock );
    	oreChromite = new OreChromite( Material.rock );
    	oreCrocoite = new OreCrocoite( Material.rock );
    	
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
    	GameRegistry.registerItem( 
    			ingotTitanium, 
    			ingotTitanium
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			ingotVanadium, 
    			ingotVanadium
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			ingotChrome, 
    			ingotChrome
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			crystalChromite, 
    			crystalChromite
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
    	);
    	GameRegistry.registerBlock(
    			oreScandium,
    			oreScandium
    				.getLocalizedName()
    	);
    	GameRegistry.registerBlock(
    			oreTitanium,
    			oreTitanium
    				.getLocalizedName()
    	);
    	GameRegistry.registerBlock(
    			oreVanadiumVanadinit,
    			oreVanadiumVanadinit
    				.getLocalizedName()
    	);
    	GameRegistry.registerBlock(
    			oreChromite,
    			oreChromite
    				.getLocalizedName()
    	);
    	GameRegistry.registerBlock(
    			oreCrocoite,
    			oreCrocoite
    				.getLocalizedName()
    	);
    	
    	/**
    	 * Register OreDictionary ingots
    	 */
    	OreDictionary.registerOre( "ingotAluminum", ingotAluminum );
    	OreDictionary.registerOre( "ingotAdamantium", ingotAluminum );
    	OreDictionary.registerOre( "ingotScandium", ingotScandium );
    	OreDictionary.registerOre( "ingotTitanium", ingotTitanium );
    	OreDictionary.registerOre( "ingotVanadium", ingotVanadium );
    	OreDictionary.registerOre( "ingotChrome", ingotChrome );
    	
    	/**
    	 * Register OreDictionary ores
    	 */
    	OreDictionary.registerOre( "oreAluminum", oreAluminumBauxite );
    	OreDictionary.registerOre( "oreAdamantium", oreAluminumBauxite );
    	OreDictionary.registerOre( "oreScandium", oreScandium );
    	OreDictionary.registerOre( "oreTitanium", oreTitanium );
    	OreDictionary.registerOre( "oreVanadium", oreVanadiumVanadinit );
    	OreDictionary.registerOre( "oreVanadium", oreVanadiumVanadinit );
    	OreDictionary.registerOre( "oreChrome", oreChromite );
    	OreDictionary.registerOre( "oreChrome", oreCrocoite );
    	
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
    	GameRegistry.addSmelting(
    			this.oreTitanium,
    			new ItemStack(
    					this.ingotTitanium
    			),
    			0.1f
    	);
    	GameRegistry.addSmelting(
    			this.oreVanadiumVanadinit,
    			new ItemStack(
    					this.ingotVanadium
    			),
    			0.1f
    	);
    	GameRegistry.addSmelting(
    			this.crystalChromite,
    			new ItemStack(
    					this.ingotChrome
    			),
    			0.1f
    	);
    	GameRegistry.addSmelting(
    			this.oreCrocoite,
    			new ItemStack(
    					this.ingotChrome
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
    	GameRegistry.registerWorldGenerator(
    			new TitaniumGeneraton(),
    			0
    	);
    	GameRegistry.registerWorldGenerator(
    			new VanadiumGeneraton(),
    			0
    	);
    	GameRegistry.registerWorldGenerator(
    			new ChromiteGeneraton(),
    			0
    	);
    	GameRegistry.registerWorldGenerator(
    			new ChromiteChromite(),
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
