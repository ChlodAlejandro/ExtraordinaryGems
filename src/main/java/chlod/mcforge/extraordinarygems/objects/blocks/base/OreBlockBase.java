package chlod.mcforge.extraordinarygems.objects.blocks.base;

import java.util.Random;

import chlod.mcforge.extraordinarygems.objects.items.EGItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OreBlockBase extends BlockBase {

	public OreBlockBase(String name, Material material) {
		super(name, material);
		this.setHardness(15.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.5F);
	}

}
