package net.divinerpg.entities.overworld.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFrostShard extends EntitySnowball
{
    public EntityFrostShard(World var1)
    {
        super(var1);
    }

    public EntityFrostShard(World var1, EntityLivingBase var2)
    {
        super(var1, var2);
    }

    public EntityFrostShard(World var1, double var2, double var4, double var6)
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
            byte var2 = 8;

            if (var1.entityHit instanceof EntityLivingBase)
            {
                var2 = 8;
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this), var2))
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
