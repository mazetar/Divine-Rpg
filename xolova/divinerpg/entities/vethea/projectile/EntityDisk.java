package xolova.divinerpg.entities.vethea.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDisk extends EntityThrowable
{
	public int damage;
    public int counter;
	public boolean rebound;
	public Item item;
	public int icon;
	public int collideCounter;

	public EntityDisk(World par1World)
    {
        super(par1World);
    }

    public EntityDisk(World par1World, EntityLiving par2EntityLiving, int par3, Item i)
    {
        super(par1World, par2EntityLiving);
        this.damage = par3;
        this.counter = 30;
        this.collideCounter = 0;
        this.rebound = false;
        this.item = i;
    }

    public EntityDisk(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
    	super.onUpdate();
    	this.setVelocity(this.motionX / 0.99D, this.motionY / 0.99D, this.motionZ / 0.99D);
    	if (this.counter == 0 && !this.rebound && this.getThrower() != null && this.collideCounter == 0)
    	{
    		this.motionX *= -1;
    		this.motionY *= -1;
    		this.motionZ *= -1;
    		this.rebound = true;
    		this.collideCounter = 5;
    	}
    	else if (this.counter > 0)
    	{
    		this.counter--;
    	}
    	else if (this.collideCounter > 0)
    	{
    		this.collideCounter--;
    	}
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    public void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
    	if (this.getThrower() != null)
    	{
            if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit != this.getThrower())
            {
                par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.damage);
            }
            else if (par1MovingObjectPosition.entityHit == this.getThrower() && this.getThrower() instanceof EntityPlayer && this.rebound)
            {
            	if (!((EntityPlayer)this.getThrower()).capabilities.isCreativeMode)
            	{
                	((EntityPlayer)this.getThrower()).inventory.addItemStackToInventory(new ItemStack(this.item));
            	}
            	if (!this.worldObj.isRemote)
                {
                    this.setDead();
                }
            }
            
            if (this.collideCounter == 0)
            {
                this.rebound = false;
                this.counter = 0;
            }
    	}
    	else if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    public float getGravityVelocity()
    {
        return 0F;
    }
}