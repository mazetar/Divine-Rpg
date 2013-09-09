package net.divinerpg.entities.overworld.projectile;

import net.divinerpg.entities.core.EntityDivineRPGArrow;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

/** @see net.divinerpg.utils.handlers.ExplosiveArrowHitHandler **/
public class EntityExplosiveArrow extends EntityDivineRPGArrow {
	
    public EntityExplosiveArrow(World var1, EntityLivingBase var2, float var3) {
        super(var1, var2, var3, 0);
        shootingEntity = null;
    }
	
	public EntityExplosiveArrow(World par1World) {
		super(par1World, 0);
	}
	

}
