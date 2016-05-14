package org.venice.venicemod.generations;

import java.util.Random;

import org.venice.venicemod.VeniceMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator {
	
	private Block inBlock = Blocks.stone;
	private Block targetBlockNether = Blocks.netherrack;
	private Block targetBlockOverworld = Blocks.stone;
	private Block targetBlockEnd = Blocks.end_stone;
	private boolean appearInNether = false;
	private boolean appearInOverworld = false;
	private boolean appearInEnd = false;
	private int minVienSize = 2;
	private int maxVienSize = 10;
	private int minY = 0;
	private int maxY = 100;
	private int chans = 5;
	
	@Override
	public void generate(
			Random random,
			int chunkX,
			int chunkZ,
			World world,
			IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider
	) {
		switch( world.provider.dimensionId ){
		case -1:
			if( appearInNether ){
				this.generateNether(
						world,
						random,
						chunkX,
						chunkZ
				);
			}
			break;
		case 0:
			if( appearInOverworld ){
				this.generateOverworld(
						world,
						random,
						chunkX,
						chunkZ
				);
			}
			break;
		case 1:
			if( appearInEnd ){
				this.generateEnd(
						world,
						random,
						chunkX,
						chunkZ
				);
			}
			break;
		}
		
	}
	
	public void generateOre(
			Block block,
			World world,
			Random random,
			int chunkX,
			int chunkZ,
			int minVienSize,
			int maxVienSize,
			int chans,
			int minY,
			int maxY,
			Block inBlock
	){
		int vienSize = minVienSize + random.nextInt( maxVienSize - minVienSize );
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable( inBlock, vienSize, block );
		
		for( int i = 0; i < chans; i++ ){
			int xRand = chunkX * 16 + random.nextInt( 16 );
			int yRand = random.nextInt( heightRange ) + minY;
			int zRand = chunkZ * 16 + random.nextInt( 16 );
			gen.generate(
					world,
					random,
					xRand,
					yRand,
					zRand
			);
		}
	}
	
	public void generateNether( World world, Random random, int x, int z ){
		generateOre(
				this.targetBlockNether,
				world,
				random,
				x,
				z,
				this.minVienSize,
				this.maxVienSize,
				this.chans,
				this.minY,
				this.maxY,
				this.inBlock
		);
	}
	
	public void generateOverworld( World world, Random random, int x, int z ){
		generateOre(
				this.targetBlockOverworld,
				world,
				random,
				x,
				z,
				this.minVienSize,
				this.maxVienSize,
				this.chans,
				this.minY,
				this.maxY,
				this.inBlock
		);
	}
	
	public void generateEnd( World world, Random random, int x, int z ){
		generateOre(
				this.targetBlockEnd,
				world,
				random,
				x,
				z,
				this.minVienSize,
				this.maxVienSize,
				this.chans,
				this.minY,
				this.maxY,
				this.inBlock
		);
	}
	
	public void setInBlock( Block inBlock ){
		this.inBlock = inBlock;
	}
	
	public void setTargetBlockNether( Block targetBlockNether){
		this.targetBlockNether = targetBlockNether;
	}
	
	public void setTargetBlockOverworld( Block targetBlockOverworld ){
		this.targetBlockOverworld = targetBlockOverworld;
	}
	
	public void setTargetBlockEnd( Block targetBlockEnd ){
		this.targetBlockEnd = targetBlockEnd;
	}
	
	public void setAppearInNether( boolean appearInNether){
		this.appearInNether = appearInNether;
	}
	
	public void setAppearInOverworld( boolean appearInOverworld ){
		this.appearInOverworld = appearInOverworld;
	}
	
	public void setAppearInEnd( boolean appearInEnd ){
		this.appearInEnd = appearInEnd;
	}
	
	public void setMinVienSize( int minVienSize ){
		this.minVienSize = minVienSize;
	}
	
	public void setMaxVienSize( int maxVienSize ){
		this.maxVienSize = maxVienSize;
	}
	
	public void setMinY( int minY ){
		this.minY = minY;
	}
	
	public void setMaxY( int maxY ){
		this.maxY = maxY;
	}
	
	public void setChans( int chans ){
		this.chans = chans;
	}

}
