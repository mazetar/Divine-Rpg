package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityBouncingProjectile extends EntityThrowable
{
	public int damage;
    public EntityBouncingProjectile(World par1)
    {
        super(par1);
    }

    public EntityBouncingProjectile(World par1, EntityLiving par2, int par3)
    {
        super(par1, par2);
        this.damage = par3;
    }

    public EntityBouncingProjectile(World par1, double par2, double par4, double par6)
    {
        super(par1, par2, par4, par6);
        this.setVelocity(this.motionX * 0.01D, this.motionY * 0.01D, this.motionZ * 0.01D);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1)
    {
        if (par1.entityHit != null && par1.entityHit != this.thrower)
        {
            par1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), this.damage);

            if (!this.worldObj.isRemote)
            {
                this.setDead();
            }
            return;
        }
        //NORTH IS -Z SOUTH IS +Z EAST IS -X WEST IS +X
        if (par1.sideHit == 0 || par1.sideHit == 1)
        {
        	this.motionY *= -1.0D;
        }      
        else if (par1.sideHit == 2 || par1.sideHit == 3)
        {
        	this.motionZ *= -1.0D;
        }      
        else if (par1.sideHit == 4 || par1.sideHit == 5)
        {
        	this.motionX *= -1.0D;
        }
    }
}