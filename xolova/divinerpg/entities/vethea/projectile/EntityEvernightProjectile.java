package xolova.divinerpg.entities.vethea.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityEvernightProjectile extends EntityVetheanCannonShot
{
    public EntityEvernightProjectile(World par1)
    {
        super(par1);
    }

    public EntityEvernightProjectile(World par1, EntityLiving par2, int par3)
    {
        super(par1, par2, par3);
    }

    public EntityEvernightProjectile(World par1, double par2, double par4, double par6)
    {
        super(par1, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1)
    {
        if (par1.entityHit != null)
        {
            par1.entityHit.attackEntityFrom(new EntityDamageSourceIndirect("arcana", this, this.getThrower()).setMagicDamage(), this.damage);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}