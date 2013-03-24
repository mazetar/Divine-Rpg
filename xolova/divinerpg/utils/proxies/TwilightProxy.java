package xolova.divinerpg.utils.proxies;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class TwilightProxy 
{
	public static int START_EID = 150;
	
	public void preInit(FMLPreInitializationEvent event) {
		// NO-OP
	}
	
	public void init(FMLInitializationEvent event) {
		initEntityRenderers();
	}
	
	public void initEntityRenderers() {
		// TODO Vazkii: code this
	}
}
