package net.divinerpg.entities.overworld.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWatcherShot extends EntityThrowable
{
    public EntityWatcherShot(World var1)
    {
        super(var1);
    }

    public EntityWatcherShot(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityWatcherShot(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 5.0F, true);

        if (var1.entityHit != null)
        {
            byte var2 = 14;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 14;
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this), var2))
            {
                boolean var3 = true;
            }
        }

        if (var1.entityHit instanceof EntityLiving)
        {
            ((EntityLiving)var1.entityHit).setFire(3);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
