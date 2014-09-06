package com.fire.flamecore.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.fire.flamecore.ModSettings;
import com.fire.flamecore.handlers.ConfigHandler;

import cpw.mods.fml.client.config.GuiConfig;

public class ConfigGuiConfig extends GuiConfig
{
	public ConfigGuiConfig(GuiScreen guiScreen)
	{
        super(guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ModSettings.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
	}

}
