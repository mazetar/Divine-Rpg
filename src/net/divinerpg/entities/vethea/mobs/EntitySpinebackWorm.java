package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySpinebackWorm extends EntityDivineMob
{
	public boolean attack;

	public EntitySpinebackWorm(World var1)
	{
		super(var1, 0.25F, 1, 1, 128.0F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.getMoveSpeed(), true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
		this.noClip = true;
		this.attack = false;
		System.out.println(this.entityId);
		EntitySpinebackWormBody peice = new EntitySpinebackWormBody(this.worldObj, this, 0);
		peice.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
		this.worldObj.spawnEntityInWorld(peice);
	}

    /**
     * Checks if this entity is inside of an opaque block
     */
    public boolean isEntityInsideOpaqueBlock()
    {
        return false;
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
	public void onUpdate()
	{
		System.out.println(this.posX + " " + this.posY + " " + this.posZ + " Head");
		super.onUpdate();
		this.motionY *= 0.2;
	}

	protected void updateAITasks()
	{
		super.updateAITasks();
		
		if (this.getAttackTarget() != null)
		{
			if (!this.attack)
			{
				this.defaultMovement();
				if (this.rand.nextInt(250) == 0)
				{
					this.attack = true;
				}
			}
			else
			{
				this.moveTwrdTarget();
			}
			
			float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
			float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
			float var9 = (float)(Math.asin(this.motionY) * 180.0D / Math.PI) - 90.0F;
			float var10 = MathHelper.wrapAngleTo180_float(var9 - this.rotationPitch);
			this.moveForward = 0.5F;
			this.rotationYaw += var8;
			this.rotationPitch += var10;
		}

	}
	
	private void defaultMovement()
	{
		double var1 = this.posX - (double)this.getAttackTarget().posX;
		double var3 = this.posY - (double)this.getAttackTarget().posY;
		double var5 = this.posZ - (double)this.getAttackTarget().posZ;
		if (Math.sqrt(var1*var1 + var5*var5) > 15)
		{
			if (var1 > 0  && var5 > 0)
			{
				this.motionX = -0.35D;
				this.motionZ = 0.35D;
			}
			else if (var1 < 0  && var5 > 0)
			{
				this.motionX = -0.35D;
				this.motionZ = -0.35D;
			}
			else if (var1 < 0  && var5 < 0)
			{
				this.motionX = 0.35D;
				this.motionZ = -0.35D;
			}
			else if (var1 > 0  && var5 < 0)
			{
				this.motionX = 0.35D;
				this.motionZ = 0.35D;
			}
		}
		else if (Math.sqrt(var1*var1 + var5*var5) < 13)
		{
			if (var1 > 0  && var5 > 0)
			{
				this.motionX = 0.35D;
				this.motionZ = 0.35D;
			}
			else if (var1 < 0  && var5 > 0)
			{
				this.motionX = -0.35D;
				this.motionZ = 0.35D;
			}
			else if (var1 < 0  && var5 < 0)
			{
				this.motionX = -0.35D;
				this.motionZ = -0.35D;
			}
			else if (var1 > 0  && var5 < 0)
			{
				this.motionX = 0.35D;
				this.motionZ = -0.35D;
			}
		}
		if (var3 < 5 && this.motionY > 0)
		{
			this.motionY = 0.3;
		}
		else if (var3 > -5 && this.motionY < 0)
		{
			this.motionY = -0.3;
		}
		else if (var3 < -5 && this.motionY < 0)
		{
			this.motionY = 0.3;
		}
		else if (var3 > 5 && this.motionY > 0)
		{
			this.motionY = -0.3;
		}
	}
	
	private void moveTwrdTarget()
	{
		double var1 = this.posX - (double)this.getAttackTarget().posX;
		double var3 = this.posY - (double)this.getAttackTarget().posY;
		double var5 = this.posZ - (double)this.getAttackTarget().posZ;
		
		if (Math.sqrt(var1*var1 + var5*var5) > 5)
		{
			if (var1 > 0  && var5 > 0)
			{
				if (this.motionX > -0.25)
				{
					this.motionX -= 0.1D;
				}
				if (this.motionZ > -0.25)
				{
					this.motionZ -= 0.1D;
				}
			}
			else if (var1 < 0  && var5 > 0)
			{
				if (this.motionX < 0.25)
				{
					this.motionX += 0.1D;
				}
				if (this.motionZ > -0.25)
				{
					this.motionZ -= 0.1D;
				}
			}
			else if (var1 < 0  && var5 < 0)
			{
				if (this.motionX < 0.25)
				{
					this.motionX += 0.1D;
				}
				if (this.motionZ < 0.25)
				{
					this.motionZ += 0.1D;
				}
			}
			else if (var1 > 0  && var5 < 0)
			{
				if (this.motionX > -0.25)
				{
					this.motionX -= 0.1D;
				}
				if (this.motionZ < 0.25)
				{
					this.motionZ += 0.1D;
				}
			}
			
			if (this.motionY < 0 && this.motionY > -0.40)
			{
				this.motionY -= 0.1;
			}
			else if (this.motionY > 0 && this.motionY < 0.40)
			{
				this.motionY += 0.1;
			}
		}
		else
		{
			this.motionX = -0.25 * Math.signum(var1);
			this.motionZ = -0.25 * Math.signum(var5);
			
			if (Math.abs(var1) < 0.25)
			{
				this.motionX = 0;
			}
			if (Math.abs(var5) < 0.25)
			{
				this.motionZ = 0;
			}
			
			if (var3 < 0)
			{
				this.motionY = 1.25;
			}
			else if (var3 > 0)
			{
				this.motionY = -1.25;
			}
		}
		
		if (this.getDistanceToEntity(this.getAttackTarget()) < 1)
		{
			this.attackEntityAsMob(this.getAttackTarget());
		}
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
		 this.attack = false;
		 return super.attackEntityAsMob(par1Entity);
	 }
}