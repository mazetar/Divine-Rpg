package xolova.divinerpg.entities.iceika.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFractiteCannonShot extends EntityThrowable
{
	public EntityFractiteCannonShot(World var1)
    {
        super(var1);
    }

    public EntityFractiteCannonShot(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityFractiteCannonShot(World var1, double var2, double var4, double var6)
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
            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 15))
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
