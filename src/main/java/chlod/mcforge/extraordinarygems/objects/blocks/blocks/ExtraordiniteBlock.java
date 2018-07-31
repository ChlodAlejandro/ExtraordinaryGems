package chlod.mcforge.extraordinarygems.objects.blocks.blocks;

import chlod.mcforge.extraordinarygems.objects.blocks.base.BlockBase;
import net.minecraft.block.material.Material;

public class ExtraordiniteBlock extends BlockBase {

	public ExtraordiniteBlock(String name, Material material) {
		super(name, material);
		setLightLevel(1.0F);
		setHarvestLevel("pickaxe", 2);
		setHardness(15.0F);
		setResistance(1000.0F);
	}

}
