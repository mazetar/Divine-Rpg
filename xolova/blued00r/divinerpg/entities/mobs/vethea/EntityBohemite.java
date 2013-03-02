package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class EntityBohemite extends EntityMob
{
    private ChunkCoordinates chargeTarget;
	private int waitTick;

	public EntityBohemite(World var1)
    {
        super(var1);
        this.texture = "/mob/Bohemite.png";
        this.moveSpeed = 0.4F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
    }
    
    protected void updateAITasks()
    {
    	if (this.getAttackTarget() != null && this.waitTick == 0 && (this.getDistanceToEntity(this.getAttackTarget()) <= 0.75 || this.hasAttacked))
    	{
    		this.waitTick = 50;
    	}
    	else if (this.waitTick == 0)
    	{
        	super.updateAITasks();
    	}
    	else if (this.waitTick == 20)
    	{
    		this.setAIMoveSpeed(0);
    		--this.waitTick;
    	}
    	else if (this.waitTick == 1)
    	{
    		this.setAIMoveSpeed(this.moveSpeed);
    		--this.waitTick;
    	}
    	else
    	{
    		--this.waitTick;
    	}
    }

    public int getAttackStrength(Entity var1)
    {
        return 1;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
    	return 1;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.zombie";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.zombiehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.zombiedeath";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
}