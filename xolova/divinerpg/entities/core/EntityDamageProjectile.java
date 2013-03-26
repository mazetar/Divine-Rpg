package xolova.divinerpg.entities.core;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDamageProjectile extends EntityThrowable {

	int damage;
	
	public EntityDamageProjectile(World world) {
		super(world);
	}
	
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

    @Override
    protected void entityInit() {
    	super.entityInit();
    	dataWatcher.addObject(12, 0);
    	dataWatcher.setObjectWatched(12);
    }
    
    public void setIcon(int i) {
    	dataWatcher.updateObject(12, i);
    }
    
    public int getIcon() {
    	return dataWatcher.getWatchableObjectInt(12);
    }
    
    @Override
    public void writeToNBT(NBTTagCompound par1nbtTagCompound) {
    	super.writeToNBT(par1nbtTagCompound);
    	par1nbtTagCompound.setInteger("damage", damage);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound par1nbtTagCompound) {
    	super.readFromNBT(par1nbtTagCompound);
    	damage = par1nbtTagCompound.getInteger("damage");
    }

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if(pos.entityHit != null && pos.entityHit != getThrower())
			pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage);
		
		if(!worldObj.isRemote)
			setDead();
	}

}
