package chlod.mcforge.extraordinarygems.objects.blocks.blocks;

import chlod.mcforge.extraordinarygems.objects.blocks.base.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExtraordiniteBlock extends BlockBase {

	public ExtraordiniteBlock(String name) {
		super(name, Material.IRON);
		setLightLevel(1.0F);
		setHarvestLevel("pickaxe", 2);
		setHardness(15.0F);
		setResistance(1000.0F);
	}

}
