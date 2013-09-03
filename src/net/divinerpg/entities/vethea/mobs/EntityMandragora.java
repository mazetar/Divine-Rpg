package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.entities.vethea.projectile.EntityMandragoraProjectile;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityMandragora extends EntityDivineMob implements IRangedAttackMob
{
    private static final double spawnLayer = 2;

	public EntityMandragora(World var1)
    {
        super(var1, 0.25F, 35, 8, 128.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIArrowAttack(this, this.getMoveSpeed(), 30, 64.0F));
        this.tasks.addTask(5, new EntityAIMoveTowardsTarget(this, this.getMoveSpeed(), 128.0F));
        this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }
    
	/**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }
    
    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float par1)
    {
    }
    
    public void onLivingUpdate()
    {
    	super.onLivingUpdate();
    	this.motionY = 0.4;
    }
    

    

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.7F;
	}

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "";
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }
    
    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
    	if (par1DamageSource.isExplosion())
    	{
    		return false;
    	}
    	return super.attackEntityFrom(par1DamageSource, par2);
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase par1, float par2) 
	{
			EntityMandragoraProjectile var1 = new EntityMandragoraProjectile(this.worldObj, this);
			this.playSound("mob.RPG.Madragora", 1.0F, 2.0F);
			var1.setVelocity(0, var1.motionY, 0);
			this.worldObj.spawnEntityInWorld(var1);
			System.out.println("Bounce Defaulting");
	}


    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(VetheaItemHelper.cleanPearls.itemID, 1);
    }
}