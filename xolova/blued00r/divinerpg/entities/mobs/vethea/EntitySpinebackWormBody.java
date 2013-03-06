package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
import net.minecraft.potion.Potion;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySpinebackWormBody extends EntityMob
{

	public EntityLiving head;
	public int spawnTick;
	public int moveMod;
	public int peiceNum;
	public EntitySpinebackWormBody(World var1)
	{
		super(var1);
		this.texture = "/mob/vamacheron.png";
		this.moveSpeed = 0.15F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
		this.noClip = true;
	}
	
	public EntitySpinebackWormBody(World var1, EntityLiving par2, int par3)
	{
		this(var1);
		this.head = par2;
		System.out.print(this.entityId);
		System.out.println(par3);
		this.setAttackTarget(par2);
		this.peiceNum = par3;
		if (this.peiceNum < 2)
		{
			EntitySpinebackWormBody peice = new EntitySpinebackWormBody(this.worldObj, this, this.peiceNum + 1);
			peice.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
			this.worldObj.spawnEntityInWorld(peice);
		}
		this.spawnTick = 20;
	}

	public int getAttackStrength(Entity var1)
	{
		return 1;
	}

	public int getMaxHealth()
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

	/**
	 * Gets the pitch of living sounds in living entities.
	 */
	protected float getSoundPitch()
	{
		return super.getSoundPitch() * 0.95F;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return this.rand.nextInt(4) != 0 ? null : "mob.RPG.AlicantoHit";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.RPG.AlicantoHit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.RPG.AlicantoHit";
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
		if (this.head.isDead)
		{
			this.setDead();
		}
		this.motionY *= 0.2;
		if (this.spawnTick == 0)
		{
			this.moveMod = 1;
		}
		else if (this.spawnTick > 0)
		{
			--this.spawnTick;
			this.setVelocity(0, 0, 0);
			this.moveMod = 0;
		}
		this.moveFlying((float)this.motionX * this.moveMod, (float)this.motionY * this.moveMod, (float)this.motionZ * this.moveMod);
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	 protected boolean canTriggerWalking()
	{
		 return false;
	}

	/**
	 * Called when the mob is falling. Calculates and applies fall damage.
	 */
	 protected void fall(float par1) {}

	 /**
	  * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
	  * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
	  */
	 protected void updateFallState(double par1, boolean par3) {}

	 /**
	  * Return whether this entity should NOT trigger a pressure plate or a tripwire.
	  */
	 public boolean doesEntityNotTriggerPressurePlate()
	 {
		 return true;
	 }

	 public boolean attackEntityAsMob(Entity par1Entity)
	 {
		 if (par1Entity != this.head)
		 {
			 return this.head.attackEntityAsMob(par1Entity);
		 }
		 return false;
	 }
	    
	    /**
	     * Called when the entity is attacked.
	     */
	    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	    {
	    	if (par1DamageSource == DamageSource.cactus || par1DamageSource == DamageSource.inWall)
	    	{
	    		return false;
	    	}
	    	return this.head.attackEntityFrom(par1DamageSource, par2);
	    }
}