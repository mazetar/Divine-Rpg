package xolova.blued00r.divinerpg.entities.mobs.projectile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.client.particles.EntityAzuritePortalFX;
import xolova.blued00r.divinerpg.client.particles.EntityTripletFX;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFractiteProjectile extends EntityFireball
{
    public EntityFractiteProjectile(World par1World)
    {
        super(par1World);
        this.isImmuneToFire = true;
    }

    @SideOnly(Side.CLIENT)
    public EntityFractiteProjectile(World par1World, double par2, double par4, double par6, double par8, double par10, double par12)
    {
        super(par1World, par2, par4, par6, par8, par10, par12);
    }

    public EntityFractiteProjectile(World par1World, EntityLiving par2EntityLiving, double par3, double par5, double par7)
    {
        super(par1World, par2EntityLiving, par3, par5, par7);
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (!this.worldObj.isRemote)
        {
            if (par1MovingObjectPosition.entityHit != null)
            {
                par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), 20);
            }

            float var10 = 0.25F;
            //this.worldObj.spawnParticle("portal", this.posX - this.motionX * (double)var10 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * (double)var10 - 0.5D, this.posZ - this.motionZ * (double)var10 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ);
            this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 3.0F, false);
            this.setDead();
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void onUpdate()
    {
        super.onUpdate();
        EntityAzuritePortalFX var20 = new EntityAzuritePortalFX(worldObj, this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
        FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20, var20);
    }
}
