package xolova.divinerpg.utils.proxies;

import xolova.divinerpg.utils.handlers.ClientTickHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxyClient extends CoreProxy {
	
	@Override
	public void tickRegistry() {
		super.tickRegistry();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}

}
