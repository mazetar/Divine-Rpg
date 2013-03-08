package xolova.blued00r.divinerpg.entities.mobs.vethea;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityBouncingProjectile;
import xolova.blued00r.divinerpg.entities.vethea.EntityMandragoraProjectile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityMandragora extends EntityMob implements IRangedAttackMob
{
    private boolean gravMove;

	public EntityMandragora(World var1)
    {
        super(var1);
        this.texture = "/mob/Mandragora.png";
        this.moveSpeed = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIArrowAttack(this, this.moveSpeed, 30, 64.0F));
        this.tasks.addTask(5, new EntityAIMoveTowardsTarget(this, this.moveSpeed, 128.0F));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 128.0F, 0, true));
        this.gravMove = true;
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
    	this.setVelocity(this.motionX, 0.4, this.motionZ);
    }
    
    public int getAttackStrength(Entity var1)
    {
        return 8;
    }

    public int getMaxHealth()
    {
        return 35;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
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
    	if (par1DamageSource == DamageSource.explosion || par1DamageSource == DamageSource.explosion2)
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
	public void attackEntityWithRangedAttack(EntityLiving par1) 
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
    	this.dropItem(DivineRPG.cleanPearls.itemID, 1);
    }
}