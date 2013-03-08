package xolova.blued00r.divinerpg.entities.vethea;

import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityMandragora;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMandragoraProjectile extends EntityThrowable
{
	private EntityLiving thrower;
    public EntityMandragoraProjectile(World par1World)
    {
        super(par1World);
    }

    public EntityMandragoraProjectile(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
        this.thrower = par2EntityLiving;
    }

    public EntityMandragoraProjectile(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1)
    {
    	if (par1.entityHit != null && par1.entityHit instanceof EntityMandragora){}
    	else if (!this.worldObj.isRemote)
        {
    		par1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), 8);
            this.setDead();
        }
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0.2F;
    }
}