package chlod.mcforge.extraordinarygems.objects.blocks.blocks;

import java.util.Random;

import chlod.mcforge.extraordinarygems.objects.blocks.base.OreBlockBase;
import chlod.mcforge.extraordinarygems.objects.items.EGItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExtraordiniteOre extends OreBlockBase {

	public ExtraordiniteOre(String name) {
		super(name, Material.ROCK);
		this.setHardness(30.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.5F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random chance, int fortune) {
		return EGItems.EXTRAORDINITE_SHARD;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		Random random = new Random();
		float explosionFactor = 1.25F;
		if ((random.nextInt() % 1) == 0) {
			explosionFactor += 100F - 1.25F;
		} else {
			explosionFactor += ((random.nextFloat() % 100) + 1) * 0.01;
		}
		// Note to self: NEVER SET isSmoking TO TRUE
		worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), explosionFactor, false);
	}
	
	
}
