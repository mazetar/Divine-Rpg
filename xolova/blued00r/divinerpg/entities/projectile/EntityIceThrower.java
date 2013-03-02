package xolova.blued00r.divinerpg.entities.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityIceThrower extends EntityThrowable
{
    public EntityIceThrower(World var1)
    {
        super(var1);
    }

    public EntityIceThrower(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityIceThrower(World var1, double var2, double var4, double var6)
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
                ((EntityLiving)var1.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, var2 * 5, 2));
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), var2))
            {
                var2 = 27;
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
