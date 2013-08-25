package net.divinerpg.entities.arcana.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends EntitySnowball
{
    public EntityGrenade(World var1)
    {
        super(var1);
    }

    public EntityGrenade(World var1, EntityLivingBase var2)
    {
        super(var1, var2);
    }

    public EntityGrenade(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (!this.worldObj.isRemote)
        {
        	this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 3.0F, false);
            this.setDead();
        }
    }
}