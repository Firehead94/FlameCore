package com.fire.flamecore.utils;

import com.fire.flamecore.ModSettings;

import io.netty.handler.logging.LogLevel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemUtils 
{
	
	public static ItemStack cloneStack(Item item, int size)
	{
		if (item == null)
		{
			LogHelper.error("Item passed was null.");
			return null;
		}
		ItemStack stack = new ItemStack(item, size);
		return stack;
	}
	
	public static ItemStack cloneStack(ItemStack itemstack, int size) 
	{
		if (itemstack == null)
		{
			LogHelper.error("Itemstack passed was null.");
			return null;
		}
		ItemStack stack = itemstack.copy();
		stack.stackSize = size;
		return stack;
	}
	
	public static ItemStack addStacks(ItemStack itemstack, ItemStack itemstack2)
	{
		
		if (itemstack.getItem().equals(itemstack2.getItem()))
			return new ItemStack(itemstack.getItem(), (itemstack.stackSize + itemstack2.stackSize));
		else
			LogHelper.error("These two itemstacks are not of the same type.");
		return null;
	}

}
