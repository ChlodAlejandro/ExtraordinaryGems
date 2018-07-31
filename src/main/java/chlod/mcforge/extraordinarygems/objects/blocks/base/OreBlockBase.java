package chlod.mcforge.extraordinarygems.objects.blocks.base;

import java.util.Random;

import chlod.mcforge.extraordinarygems.objects.items.EGItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreBlockBase extends BlockBase {

	public OreBlockBase(String name) {
		super(name, Material.ROCK);
		this.setHardness(15.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.5F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random chance, int fortune) {
		return EGItems.EXTRAORDINITE_SHARD;
	}

}
