package xolova.divinerpg.entities.overworld.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFireThrower extends EntityThrowable
{
    public EntityFireThrower(World var1)
    {
        super(var1);
    }

    public EntityFireThrower(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityFireThrower(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 27;

            if (var1.entityHit instanceof EntityLiving)
            {
                var2 = 27;
                ((EntityLiving)var1.entityHit).setFire(20);
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2))
            {
                boolean var3 = true;
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
