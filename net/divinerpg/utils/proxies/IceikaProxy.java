package net.divinerpg.utils.proxies;

import net.divinerpg.utils.handlers.ExplosiveArrowHitHandler;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class IceikaProxy {

	
	public void init(FMLInitializationEvent event) {
		//IceikaEntityHelper.entityRegistry();
		
		MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
	}
	
}
