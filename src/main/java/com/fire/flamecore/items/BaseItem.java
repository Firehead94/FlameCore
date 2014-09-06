package com.fire.flamecore.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.fire.flamecore.ModSettings;

public class BaseItem extends Item 
{

	public BaseItem() 
	{
		super();
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", ModSettings.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return String.format("item.%s%s", ModSettings.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalName)
	{
		return unlocalName.substring(unlocalName.indexOf(".") + 1);
	}
}
