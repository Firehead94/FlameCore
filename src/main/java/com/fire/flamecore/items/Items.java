package com.fire.flamecore.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items {

	public static final BaseItem TESTITEM = new BaseItem();
	
	public void init() {
		
		GameRegistry.registerItem(TESTITEM, "test");
	}
}
