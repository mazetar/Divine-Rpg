package xolova.divinerpg.entities.twilight.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCoriShot extends EntityThrowable
{
    private int damage;

	public EntityCoriShot(World var1)
    {
        super(var1);
    }

    public EntityCoriShot(World var1, EntityLiving var2, int dam)
    {
        super(var1, var2);
        damage = dam;
    }

    public EntityCoriShot(World var1, double var2, double var4, double var6)
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

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), this.damage))
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
