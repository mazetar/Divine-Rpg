package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityTeakerDisk extends EntityThrowable
{
    private int damage;
	private int counter;
	private boolean rebound;

	public EntityTeakerDisk(World par1World)
    {
        super(par1World);
    }

    public EntityTeakerDisk(World par1World, EntityLiving par2EntityLiving, int par3)
    {
        super(par1World, par2EntityLiving);
        this.damage = par3;
        this.counter = 15;
        this.rebound = false;
    }

    public EntityTeakerDisk(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
    	super.onUpdate();
    	if (this.counter == 0 && !this.rebound && this.thrower != null)
    	{
    		this.setVelocity(-this.motionX, -this.motionY, -this.motionZ);
    		this.rebound = true;
    	}
    	else if (this.counter > 0)
    	{
    		this.counter--;
    	}
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
    	if (this.thrower != null)
    	{
            if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit != this.thrower)
            {
                par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), this.damage);
            }
            else if (par1MovingObjectPosition.entityHit == this.thrower && this.thrower instanceof EntityPlayer && this.rebound)
            {
            	((EntityPlayer)this.thrower).inventory.addItemStackToInventory(new ItemStack(DivineRPG.teakerDisk));
            	if (!this.worldObj.isRemote)
                {
                    this.setDead();
                }
            }
            this.rebound = false;
    	}
    	else if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0F;
    }
}