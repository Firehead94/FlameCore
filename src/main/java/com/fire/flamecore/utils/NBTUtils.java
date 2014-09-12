package com.fire.flamecore.utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class NBTUtils {
	
	/**
	 * Returns if passed itemStack has NBT Tag with passed key
	 * @param itemStack
	 * @param key
	 * @return
	 */
	public static boolean hasTag(ItemStack itemStack, String key)
	{
		return itemStack != null && itemStack.stackTagCompound != null && itemStack.stackTagCompound.hasKey(key);
	}
	
	/**
	 * Removes passed key NBT Tag from passed itemStack
	 * @param itemStack
	 * @param key
	 */
	public static void removeTag(ItemStack itemStack, String key)
	{
		if (itemStack.stackTagCompound != null)
		{
			itemStack.stackTagCompound.removeTag(key);
		}
	}
	
	/**
	 * If not NBTTagCompound found, creates one, else void
	 * @param itemStack
	 */
	protected static void initNBTTagCompound(ItemStack itemStack)
	{
		if (itemStack.stackTagCompound == null)
		{
			itemStack.setTagCompound(new NBTTagCompound());
		}
	}
	
	/* Setters */
	
	public static void setLong(ItemStack itemStack, String key, long val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setLong(key, val);
	}
	
	public static void setString(ItemStack itemStack, String key, String val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setString(key, val);
	}
	
	public static void setBoolean(ItemStack itemStack, String key, Boolean val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setBoolean(key, val);
	}
	
	public static void setShort(ItemStack itemStack, String key, Short val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setShort(key, val);
	}
	
	public static void setByte(ItemStack itemStack, String key, byte val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setByte(key, val);
	}
	
	public static void setByteArray(ItemStack itemStack, String key, byte[] val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setByteArray(key, val);
	}
	
	public static void setInt(ItemStack itemStack, String key, int val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setInteger(key, val);
	}
	
	public static void setIntArray(ItemStack itemStack, String key, int[] val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setIntArray(key, val);
	}
	
	public static void setFloat(ItemStack itemStack, String key, float val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setFloat(key, val);
	}
	
	public static void setDouble(ItemStack itemStack, String key, double val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setDouble(key, val);
	}
	
	public static void setTagList(ItemStack itemStack, String key, NBTTagList val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setTag(key, val);
	}
	
	public static void setTagCompound(ItemStack itemStack, String key, NBTTagCompound val)
	{
		initNBTTagCompound(itemStack);
		itemStack.stackTagCompound.setTag(key, val);
	}
	
	/* Getters */
	
	public static long getLong(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setFloat(itemStack, key, 0);
		}
		
		return itemStack.stackTagCompound.getLong(key);
	}
	
	public static String getString(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setString(itemStack, key, "");
		}
		
		return itemStack.stackTagCompound.getString(key);
	}
	
	public static Boolean getBoolean(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setBoolean(itemStack, key, false);
		}
		
		return itemStack.stackTagCompound.getBoolean(key);
	}
	
	public static Short getShort(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setShort(itemStack, key, (short)0);
		}
		
		return itemStack.stackTagCompound.getShort(key);
	}
	
	public static byte getByte(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setByte(itemStack, key, (byte)0);
		}
		
		return itemStack.stackTagCompound.getByte(key);
	}
	
	public static byte[] getByteArray(ItemStack itemStack, String key)
	{
		
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setByteArray(itemStack, key, new byte[] {0});
		}
		
		return itemStack.stackTagCompound.getByteArray(key);
	}
	
	public static Integer getInt(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setInt(itemStack, key, 0);
		}
		
		return itemStack.stackTagCompound.getInteger(key);
	}
	
	public static int[] getIntArray(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setIntArray(itemStack, key, new int[] {0});
		}
		
		return itemStack.stackTagCompound.getIntArray(key);
	}
	
	public static float getFloat(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setFloat(itemStack, key, (float)0);
		}
		
		return itemStack.stackTagCompound.getFloat(key);
	}
	
	public static double getDouble(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setDouble(itemStack, key, (double)0);
		}
		
		return itemStack.stackTagCompound.getDouble(key);
	}
	
	public static NBTTagList getTagList(ItemStack itemStack, String key, int baseType)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setTagList(itemStack, key, new NBTTagList());
		}
		
		return itemStack.stackTagCompound.getTagList(key, baseType);
	}
	
	public static NBTTagCompound getTagCompound(ItemStack itemStack, String key)
	{
		initNBTTagCompound(itemStack);
		if(!itemStack.stackTagCompound.hasKey(key))
		{
			setTagCompound(itemStack, key, new NBTTagCompound());
		}
		
		return itemStack.stackTagCompound.getCompoundTag(key);
	}

}
