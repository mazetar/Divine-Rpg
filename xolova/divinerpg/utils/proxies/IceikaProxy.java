package xolova.divinerpg.utils.proxies;

import net.minecraftforge.common.MinecraftForge;
import xolova.divinerpg.utils.helpers.entity.IceikaEntityHelper;
import xolova.divinerpg.utils.helpers.misc.iceika.ExplosiveArrowHitHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class IceikaProxy {

	
	public void init(FMLInitializationEvent event) {
		IceikaEntityHelper.entityRegistry();
		
		MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
	}
	
}
