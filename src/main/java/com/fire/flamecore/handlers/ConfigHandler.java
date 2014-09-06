package com.fire.flamecore.handlers;

import java.io.File;

import com.fire.flamecore.ModSettings;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler 
{
	
	public static Configuration configuration;
	public static boolean configVal = false;

	public static void init(File configFile) 
	{
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(ModSettings.MOD_ID))
		{
			// Resync
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() 
	{
		
		configVal = configuration.getBoolean("name", Configuration.CATEGORY_GENERAL, false, "comment");
		if (configuration.hasChanged())
		{
			configuration.save();
		}
		
	}

}
