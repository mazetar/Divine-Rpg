package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

public class EntityDissimentShot extends EntityThrowable
{
    public EntityDissimentShot(World var1)
    {
        super(var1);
    }

    public EntityDissimentShot(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityDissimentShot(World var1, double var2, double var4, double var6)
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
            byte var2 = 0;
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), var2);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}