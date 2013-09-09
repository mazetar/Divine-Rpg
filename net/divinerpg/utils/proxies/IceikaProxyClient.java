package net.divinerpg.utils.proxies;

import net.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import net.divinerpg.entities.iceika.projectile.EntityIce;
import net.divinerpg.renders.RenderBlock;
import net.divinerpg.renders.iceika.projectile.RenderFrostclawProjectile;
import net.divinerpg.utils.helpers.render.IceikaRenderHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaProxyClient extends IceikaProxy {

    @Override
	public void initEntityRenderers() {
        super.initEntityRenderers();
		IceikaRenderHelper.init();
		

		//TODO: This can't be working correctly? Needs testing.

        RenderBlock renderBlock = new RenderBlock();
        RenderingRegistry.registerEntityRenderingHandler(EntityIce.class, renderBlock);
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostclawProjectile.class, new RenderFrostclawProjectile());
		
	}

}
