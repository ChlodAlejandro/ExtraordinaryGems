package chlod.mcforge.extraordinarygems.world.gen;

import java.util.Random;

import chlod.mcforge.extraordinarygems.objects.blocks.EGBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class EGWorldOres implements IWorldGenerator{

	private WorldGenerator EGORE_EXTRAORDINITE_ORE;
	
	public EGWorldOres() {
		EGORE_EXTRAORDINITE_ORE = new WorldGenMinable(EGBlocks.EXTRAORDINITE_ORE.getDefaultState(), 3);
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore height out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
			case 0:
				int chance = 8;
				int minHeight = 3;
				int maxHeight = 18;
				this.runGenerator(EGORE_EXTRAORDINITE_ORE, world, random, chunkX, chunkZ, chance, minHeight, maxHeight);
				break;
		}
	}

	
	
}
