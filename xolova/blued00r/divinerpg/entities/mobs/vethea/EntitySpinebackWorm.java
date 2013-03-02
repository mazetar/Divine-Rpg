package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.entity.Entity;
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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySpinebackWorm extends EntityMob
{
	private ChunkCoordinates currentFlightTarget;
	private int flyTimer;

	public EntitySpinebackWorm(World var1)
	{
		super(var1);
		this.texture = "/mob/Alicanto.png";
		this.moveSpeed = 0.15F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 32.0F, 0, true));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		this.flyTimer = 0;
	}

	public int getAttackStrength(Entity var1)
	{
		return 0;
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
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	public boolean canBePushed()
	{
		return false;
	}

	protected void collideWithEntity(Entity par1Entity) {}

	protected void func_85033_bc() {}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate()
	{
		super.onUpdate();
		this.motionY *= 0.6000000238418579D;
	}

	protected void updateAITasks()
	{
		super.updateAITasks();

		if (this.getAttackTarget() != null)
		{
			int var1 = (int) this.getAttackTarget().posX;
			int var2 = (int) this.getAttackTarget().posY;
			int var3 = (int) this.getAttackTarget().posZ;
			this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
		}
		else
		{
		}
		
		if (this.getAttackTarget() != null)
		{
			double var1 = this.posX - (double)this.getAttackTarget().posX;
			double var3 = this.posY - (double)this.getAttackTarget().posY;
			double var5 = this.posZ - (double)this.getAttackTarget().posZ;

			if (var1 > 0  && var5 > 0)
			{
				this.motionX += 0.05D;
				this.motionZ -= 0.05D;
			}
			else if (var1 < 0  && var5 > 0)
			{
				this.motionX -= 0.05D;
				this.motionZ -= 0.05D;
			}
			else if (var1 < 0  && var5 < 0)
			{
				this.motionX -= 0.05D;
				this.motionZ += 0.05D;
			}
			else if (var1 > 0  && var5 < 0)
			{
				this.motionX += 0.05D;
				this.motionZ += 0.05D;
			}
			
			float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
			float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
			this.moveForward = 0.5F;
			this.rotationYaw += var8;
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
}