package xolova.divinerpg.entities.overworld.projectile;

import xolova.divinerpg.entities.core.EntityDivineRPGArrow;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

/** @see xolova.divinerpg.utils.helpers.misc.iceika.ExplosiveArrowHitHandler **/
public class EntityExplosiveArrow extends EntityDivineRPGArrow {
	
    public EntityExplosiveArrow(World var1, EntityLiving var2, float var3) {
        super(var1, var2, var3, 0);
        shootingEntity = null;
    }
	
	public EntityExplosiveArrow(World par1World) {
		super(par1World, 0);
	}
	

}
