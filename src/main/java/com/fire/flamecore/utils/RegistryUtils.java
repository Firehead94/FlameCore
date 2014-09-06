package com.fire.flamecore.utils;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegistryUtils {
	
	public void addStorageRecipe9(ItemStack input, ItemStack output, boolean reverse) {
		GameRegistry.addShapelessRecipe(output, new Object[] {"xxx", "xxx", "xxx", 'x', input});
		if (reverse)
			addReverseStorage(output, input, 9);
	}
	
	public void addStorageRecipe4(ItemStack input, ItemStack output, boolean reverse) {
		GameRegistry.addShapelessRecipe(output, new Object[] {"xx", "xx", 'x', input});
		if (reverse)
			addReverseStorage(output, input, 4);
	}
	
	public void addReverseStorage(ItemStack input, ItemStack output, int count) {
		GameRegistry.addShapelessRecipe(ItemUtils.cloneStack(output, count), new Object[] {"x", 'x', input});
	}
	
	public static void registerItems(String name, ItemStack stack) {
		OreDictionary.registerOre(name, stack);
		GameRegistry.registerCustomItemStack(name, stack);
	}
}
