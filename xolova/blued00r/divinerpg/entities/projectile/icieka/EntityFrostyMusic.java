package xolova.blued00r.divinerpg.entities.projectile.icieka;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.client.particles.EntityGreenPortalFX;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFrostyMusic extends EntityThrowable
{
    public EntityFrostyMusic(World var1)
    {
        super(var1);
    }

    public EntityFrostyMusic(World var1, EntityLiving var2)
    {
        super(var1, var2);
    }

    public EntityFrostyMusic(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }
    
    @SideOnly(Side.CLIENT)
    public void onUpdate()
    {
        super.onUpdate();
        float var10 = 0.25F;
        this.worldObj.spawnParticle("note", this.posX - this.motionX * (double)var10 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * (double)var10 - 0.5D, this.posZ - this.motionZ * (double)var10 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 16;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 16;
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), var2))
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
