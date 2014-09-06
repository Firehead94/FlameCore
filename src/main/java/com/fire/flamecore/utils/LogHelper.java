package com.fire.flamecore.utils;

import org.apache.logging.log4j.Level;

import com.fire.flamecore.ModSettings;

import cpw.mods.fml.common.FMLLog;

public class LogHelper 
{
	public static void log(Level logLevel, Object object)
	{
		FMLLog.log(ModSettings.MOD_NAME, logLevel, String.valueOf(object));
	}
	
	public static void all (Object object) 
	{ 
		log(Level.ALL, object); 
	}
	
	//No events will be logged
	public static void off (Object object)
	{
		log(Level.OFF, object);
	}
	
	//Severe error that will prevent app from continuing
	public static void fatal (Object object) 
	{ 
		log(Level.FATAL, object); 
	}
	
	//Error in app, possibly recoverable
	public static void error (Object object) 
	{ 
		log(Level.ERROR, object); 
	}
	
	//Event might lead to error
	public static void warn (Object object) 
	{ 
		log(Level.WARN, object); 
	}
	
	//Informational purpose
	public static void info (Object object) 
	{ 
		log(Level.INFO, object); 
	}

	//General debug event
	public static void debug (Object object) 
	{ 
		log(Level.DEBUG, object); 
	}
	
	//fine grained debug message
	public static void trace (Object object)
	{
		log(Level.TRACE, object);
	}
	
}
