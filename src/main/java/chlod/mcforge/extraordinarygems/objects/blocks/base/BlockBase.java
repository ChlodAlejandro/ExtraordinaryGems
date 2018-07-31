package chlod.mcforge.extraordinarygems.objects.blocks.base;

import chlod.mcforge.extraordinarygems.main.ExtraordinaryGems;
import chlod.mcforge.extraordinarygems.objects.blocks.EGBlocks;
import chlod.mcforge.extraordinarygems.objects.items.EGItems;
import chlod.mcforge.extraordinarygems.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setHardness(15.0F);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		EGBlocks.EG_BLOCKS.add(this);
		EGItems.EG_ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return true;
	}

	@Override
	public void registerModels() {
		ExtraordinaryGems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
