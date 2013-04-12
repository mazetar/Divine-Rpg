package xolova.divinerpg.utils.proxies;

import xolova.divinerpg.entities.core.EntityDamageProjectile;
import xolova.divinerpg.renders.RenderGenericProjectile;
import xolova.divinerpg.utils.helpers.client.misc.ClientTickHandler;
import xolova.divinerpg.utils.helpers.entity.OverworldEntityHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxyClient extends CoreProxy {
	
	@Override
	public void tickRegistry() {
		super.tickRegistry();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}

}
