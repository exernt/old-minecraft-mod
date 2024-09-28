package com.alec.AlsMod.world;

import java.util.Random;

import com.alec.AlsMod.block.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	private WorldGenerator jaderiteGen;
	private WorldGenerator ruberiteGen;
	private WorldGenerator lavariteGen;
	private WorldGenerator sunneriteGen;
	private WorldGenerator enderiteGen;
	private WorldGenerator elementalOreGen;
	
	public ModWorldGen() {
	    this.jaderiteGen = new WorldGenMinable(ModBlocks.jaderiteOre, 8);
	    this.ruberiteGen = new WorldGenMinable(ModBlocks.ruberiteOre, 8);
	    this.lavariteGen = new WorldGenMinable(ModBlocks.lavariteOre, 8);
	    this.sunneriteGen = new WorldGenMinable(ModBlocks.sunneriteOre, 8);
	    this.enderiteGen = new WorldGenMinable(ModBlocks.enderiteOre, 8, Blocks.end_stone);
	    this.elementalOreGen = new WorldGenSingleMinable(ModBlocks.elementalOre);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			this.runGenerator(this.jaderiteGen, world, random, chunkX, chunkZ, 10, 0, 55);
			this.runGenerator(this.ruberiteGen, world, random, chunkX, chunkZ, 10, 0, 45);
			this.runGenerator(this.lavariteGen, world, random, chunkX, chunkZ, 8, 0, 35);
			this.runGenerator(this.sunneriteGen, world, random, chunkX, chunkZ, 7, 0, 70);
			this.runGenerator(this.elementalOreGen, world, random, chunkX, chunkZ, 3, 0, 20);
			break;
		case -1:
			
			break;
		case 1:
			this.runGenerator(this.enderiteGen, world, random, chunkX, chunkZ, 8, 0, 80);
			break;
		}
	}
	
}
