package xolova.divinerpg.entities.core;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDamageProjectile extends EntityThrowable {

	int damage;
	
	public EntityDamageProjectile(World par1World, int damage) {
		super(par1World);
		this.damage = damage;
	}
	
    public EntityDamageProjectile(World var1, EntityLiving var2, int damage) {
        super(var1, var2);
        this.damage = damage;
    }

    public EntityDamageProjectile(World var1, double var2, double var4, double var6, int damage) {
        super(var1, var2, var4, var6);
        this.damage = damage;
    }
    
    public void setIcon(int i) {
    	dataWatcher.updateObject(0, i);
    }
    
    public int getIcon(int i) {
    	return dataWatcher.getWatchableObjectInt(0);
    }

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if(pos.entityHit != null)
			pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage);
		
		if(!worldObj.isRemote)
			setDead();
	}

}
