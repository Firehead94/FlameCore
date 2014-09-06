package com.fire.flamecore;

import com.fire.flamecore.handlers.ConfigHandler;
import com.fire.flamecore.utils.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ModSettings.MOD_ID, name=ModSettings.MOD_NAME, version=ModSettings.VERSION, guiFactory=ModSettings.GUI_FACTORY_CLASS)
public class FlameCore 
{
	
	@Mod.Instance(ModSettings.MOD_ID)
	public static FlameCore instance;
	
	/*@SidedProxy(clientSide = ModSettings.CLIENT_PROXY, serverSide = ModSettings.SERVER_PROXY, modId = ModSettings.MOD_ID)
	public static IProxy proxy;
	*/
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) 
	{ //NetworkHandlers, Configs, Items, Blocks
		ConfigHandler.init(e.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		LogHelper.info("PreInit Complete");

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) 
	{ //GUIs, TileEntities, Crafting
		
		LogHelper.info("Init Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{ //Things after other mods
		
		LogHelper.info("PostInit Complete");
	}

}