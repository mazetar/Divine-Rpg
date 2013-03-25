package xolova.blued00r.divinerpg.entities.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityReflector extends EntityThrowable
{
    public EntityReflector(World var1)
    {
        super(var1);
    }

    public EntityReflector(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityReflector(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }
    
    public String getTexture (){return null;}

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 0;

            if (var1.entityHit instanceof EntityBlaze)
            {
            	var2 = 0;
            }
            var1.entityHit.addVelocity((double)(this.motionX * 3.0D), 0.1D, (double)(this.motionZ * 3.0D));
            boolean var3 = true;
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
