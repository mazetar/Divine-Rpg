package xolova.divinerpg.utils.proxies;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class TwilightProxy 
{
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
