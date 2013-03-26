package xolova.divinerpg.utils.proxies;

import xolova.divinerpg.entities.core.EntityDamageProjectile;
import xolova.divinerpg.renders.RenderGenericProjectile;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class CoreProxyClient extends CoreProxy {
	
	@Override
	public void entityRegistry() {
		super.entityRegistry();
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDamageProjectile.class, new RenderGenericProjectile());
	}

}
