package xolova.divinerpg.utils;

import net.minecraftforge.common.Configuration;
import xolova.divinerpg.utils.config.*;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config 
{
	public static void init(FMLPreInitializationEvent par1)
	{
		Configuration var2 = new Configuration(par1.getSuggestedConfigurationFile());
    	var2.load();
    	//la la la config
    	GenConfig.load(var2);
    	BlockConfig.load(var2);
    	ItemConfig.load(var2);
    	VetheanConfig.load(var2);
    	EntityConfig.load(var2);
    	var2.save();
	}
}
