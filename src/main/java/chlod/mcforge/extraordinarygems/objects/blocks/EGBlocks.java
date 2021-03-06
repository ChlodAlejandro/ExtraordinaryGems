package chlod.mcforge.extraordinarygems.objects.blocks;

import java.util.ArrayList;
import java.util.List;

import chlod.mcforge.extraordinarygems.objects.blocks.base.OreBlockBase;
import chlod.mcforge.extraordinarygems.objects.blocks.base.TransparentBlockBase;
import chlod.mcforge.extraordinarygems.objects.blocks.blocks.ExtraordiniteBlock;
import chlod.mcforge.extraordinarygems.objects.blocks.blocks.ExtraordiniteOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EGBlocks {

	public static final List<Block> EG_BLOCKS = new ArrayList<Block>();
	
	public static final Block EXTRAORDINITE_BLOCK = new ExtraordiniteBlock("extraordinite_block");
	public static final Block EXTRAORDINITE_ORE = new ExtraordiniteOre("extraordinite_ore");
	
	public static final Block GEM_STABILIZER_BLOCK = new TransparentBlockBase("gem_stabilizer_block", Material.GLASS);
	
}
