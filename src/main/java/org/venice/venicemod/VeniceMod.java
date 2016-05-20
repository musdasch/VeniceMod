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
import org.venice.venicemod.items.Nife;
import org.venice.venicemod.items.OpKiller;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = VeniceMod.MODID, version = VeniceMod.VERSION)
public class VeniceMod {
	
	/**
	 * TODO COINS
	 * TODO TRADING STATION
	 * 
	 * --------------------------
	 * TODO Longfolingbutes
	 * TODO Cola
	 * TODO Lunch Box
	 * TODO Bir
	 * TODO Kautabag
	 * TODO Kartong
	 * TODO Wax Paper
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
     * Init all ingot
     */
    public static Item ingotAluminum;
    public static Item ingotScandium;
    public static Item ingotTitanium;
    public static Item ingotVanadium;
    public static Item ingotChrome;
    
    /**
     * Init all crystal
     */
    public static Item crystalChromite;
    
    /**
     * Init all nife
     */
    public static Item nifeWood;
    public static Item nifeStone;
    public static Item nifeIron;
    public static Item nifeGold;
    public static Item nifeDiamond;
    public static Item nifeOpKiller;
    
    /**
     * Init all food
     */
    public static Item foodAppleAndBread;
    
    /**
     * Init all coins
     */
    public static Item coinVeniceCredit;
    
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
    	 * Declared all ingot
    	 */
    	ingotAluminum = new IngotAluminum();
    	ingotScandium = new IngotScandium();
    	ingotTitanium = new IngotTitanium();
    	ingotVanadium = new IngotVanadium();
    	ingotChrome = new IngotChrome();
    	
    	/**
    	 * Declared all crystal
    	 */
    	crystalChromite = new CrystalChromite();
    	
    	/**
    	 * Declared all nifes
    	 */
    	nifeWood = new Nife( 
    			Item.ToolMaterial.WOOD,
    			"nifeWood"
    	);
    	nifeStone = new Nife( 
    			Item.ToolMaterial.STONE,
    			"nifeStone"
    	);
        nifeIron = new Nife( 
    			Item.ToolMaterial.IRON,
    			"nifeIron"
    	);
        nifeGold = new Nife( 
    			Item.ToolMaterial.GOLD,
    			"nifeGold"
    	);
        nifeDiamond = new Nife( 
    			Item.ToolMaterial.EMERALD,
    			"nifeDiamond"
    	);
        nifeOpKiller = new OpKiller( 
    			Item.ToolMaterial.EMERALD,
    			"nifeOpKiller"
    	);
        
        /**
         * Declared all food
         */
        foodAppleAndBread = new ItemFood( 6, 0.9F, false )
        		.setUnlocalizedName( "foodAppleAndBread" )
        		.setTextureName( VeniceMod.MODID + ":foodAppleAndBread" );
        
        /**
         * Declared all coins
         */
        coinVeniceCredit = new Item()
        		.setUnlocalizedName( "coinVeniceCredit" )
        		.setTextureName( VeniceMod.MODID + ":coinVeniceCredit" );
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
    	 * Register all ingot
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
    	
    	/**
    	 * Register all crystal
    	 */
    	GameRegistry.registerItem( 
    			crystalChromite, 
    			crystalChromite
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	
    	/**
    	 * Register all nife
    	 */
    	GameRegistry.registerItem( 
    			nifeWood, 
    			nifeWood
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			nifeStone, 
    			nifeStone
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			nifeIron, 
    			nifeIron
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			nifeGold, 
    			nifeGold
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			nifeDiamond, 
    			nifeDiamond
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	GameRegistry.registerItem( 
    			nifeOpKiller, 
    			nifeOpKiller
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	
    	/**
    	 * Register all food
    	 */
    	GameRegistry.registerItem(
    			foodAppleAndBread,
    			foodAppleAndBread
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	
    	/**
    	 * Register all coins
    	 */
    	GameRegistry.registerItem(
    			coinVeniceCredit,
    			coinVeniceCredit
    				.getUnlocalizedName()
    				.substring( 5 )
    	);
    	
    	/**
    	 * Register all blocks
    	 */
    	GameRegistry.registerBlock(
    			oreAluminumBauxite,
    			oreAluminumBauxite
	    			.getUnlocalizedName()
					.substring( 5 )
    	);
    	GameRegistry.registerBlock(
    			oreScandium,
    			oreScandium
	    			.getUnlocalizedName()
					.substring( 5 )
    	);
    	GameRegistry.registerBlock(
    			oreTitanium,
    			oreTitanium
	    			.getUnlocalizedName()
					.substring( 5 )
    	);
    	GameRegistry.registerBlock(
    			oreVanadiumVanadinit,
    			oreVanadiumVanadinit
	    			.getUnlocalizedName()
					.substring( 5 )
    	);
    	GameRegistry.registerBlock(
    			oreChromite,
    			oreChromite
	    			.getUnlocalizedName()
					.substring( 5 )
    	);
    	GameRegistry.registerBlock(
    			oreCrocoite,
    			oreCrocoite
	    			.getUnlocalizedName()
					.substring( 5 )
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
    	 * Register all recipes
    	 */
    	GameRegistry.addRecipe(new ItemStack( nifeWood ),
    	    "A",
    	    "A",
    	    'A', new ItemStack( Item.getItemById( 280 ) )//Wooden Stick
    	);
    	GameRegistry.addRecipe( new ItemStack( nifeStone ),
        	    "A",
        	    "B",
        	    'A', new ItemStack( Blocks.cobblestone ),
        	    'B', new ItemStack( Item.getItemById( 280 ) )//Wooden Stick
    	);
    	GameRegistry.addRecipe( new ItemStack( nifeIron ),
        	    "A",
        	    "B",
        	    'A', new ItemStack( Item.getItemById( 265 ) ),//Iron Ingot
        	    'B', new ItemStack( Item.getItemById( 280 ) )//Wooden Stick
    	);
    	GameRegistry.addRecipe( new ItemStack( nifeGold ),
        	    "A",
        	    "B",
        	    'A', new ItemStack( Item.getItemById( 266 ) ),//Iron Ingot
        	    'B', new ItemStack( Item.getItemById( 280 ) )//Wooden Stick
    	);
    	GameRegistry.addRecipe( new ItemStack( nifeDiamond ),
        	    "A",
        	    "B",
        	    'A', new ItemStack( Item.getItemById( 264 ) ),//Iron Ingot
        	    'B', new ItemStack( Item.getItemById( 280 ) )//Wooden Stick
    	);
    	GameRegistry.addRecipe(new ItemStack( coinVeniceCredit, 4 ),
        	    "AA",
        	    "AA",
        	    'A', new ItemStack( 
        	    		(Item)Item.itemRegistry.getObject("iron_ingot")
        	    )
        	);
    	
    	/**
    	 * 
    	 */
    	GameRegistry.addShapelessRecipe(
    			new ItemStack( foodAppleAndBread ),
    			new ItemStack( 
    					(Item) Item.itemRegistry.getObject("apple")
    			),
    			new ItemStack(
    					(Item) Item.itemRegistry.getObject("bread")
    			)
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
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
