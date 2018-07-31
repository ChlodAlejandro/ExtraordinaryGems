package chlod.mcforge.extraordinarygems.objects.items.base;

import chlod.mcforge.extraordinarygems.main.ExtraordinaryGems;
import chlod.mcforge.extraordinarygems.objects.items.EGItems;
import chlod.mcforge.extraordinarygems.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String itemName) {
		setUnlocalizedName(itemName);
		setRegistryName(itemName);
		setCreativeTab(CreativeTabs.MISC);
		
		EGItems.EG_ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		ExtraordinaryGems.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
