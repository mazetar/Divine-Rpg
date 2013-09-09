package net.divinerpg.entities.twilight.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySlicer extends EntityThrowable
{
    int baseDmg = 5;
    public EntitySlicer(World var1)
    {
        super(var1);
    }

    public EntitySlicer(World var1, EntityLivingBase var2, int dmg)
    {
        super(var1, var2);
        baseDmg = dmg;
    }

    public EntitySlicer(World var1, double var2, double var4, double var6, int dmg)
    {
        super(var1, var2, var4, var6);
        baseDmg = dmg;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), baseDmg);


        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
