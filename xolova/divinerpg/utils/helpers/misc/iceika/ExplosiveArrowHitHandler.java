package xolova.divinerpg.utils.helpers.misc.iceika;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import xolova.divinerpg.entities.overworld.projectile.EntityExplosiveArrow;

public class ExplosiveArrowHitHandler {
	
	@ForgeSubscribe
	public void onEntityDamage(LivingHurtEvent event) {
		if(event.source != null && event.source.getEntity() != null && event.source.getEntity() instanceof EntityExplosiveArrow) {
			Entity arrow = event.source.getEntity();
			event.entity.worldObj.createExplosion(event.source.getEntity(), arrow.posX, arrow.posY, arrow.posZ, 3F, false);
		}
	}	

}
