package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityFlyingMount extends EntityMount
{

    public EntityFlyingMount(World par1World)
    {
        super(par1World);
    }

    public EntityFlyingMount(World par1World, double par2, double par4, double par6)
    {
    	super(par1World, par2, par4, par6);
    }

	public void onUpdate()
	{
        if (this.riddenByEntity != null)
        {
        	if ((this.riddenByEntity instanceof EntityLiving) && ((EntityLiving)this.riddenByEntity).isJumping)
        	{
        		this.motionY = 1.0D;
        	}
        	else if ((this.riddenByEntity instanceof EntityLiving) && ((EntityLiving)this.riddenByEntity).isSneaking() && !this.onGround)
        	{
        		this.motionY = -1.0D;
        	}
        }
        
        super.onUpdate();
	}
}
