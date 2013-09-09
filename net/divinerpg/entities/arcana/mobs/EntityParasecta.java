package net.divinerpg.entities.arcana.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

@SuppressWarnings({"unused", "rawtypes"})
public class EntityParasecta extends EntityDivineMob implements IBossDisplayData
{
	private ChunkCoordinates currentFlightTarget;

	/** The entity we are attached to */
	private EntityCreature theEntity;
	private float farSpeed;
	private float nearSpeed;
	private Entity closestLivingEntity;
	private float distanceFromEntity;
	/** The PathEntity of our entity */
	private PathEntity entityPathEntity;

	/** The PathNavigate of our entity */
	private PathNavigate entityPathNavigate;

	/** The class of the entity we should avoid */
	private Class targetEntityClass;

	public EntityParasecta(World var1)
	{
		super(var1, 0.4F, 1900, 34, 128.0F);
		this.setSize(1.0F, 2.0F);
		targetEntityClass = EntityPlayerMP.class;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.getMoveSpeed(), true));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(1, new EntityAIAvoidEntity(this, EntityPlayer.class, 1.5F, 1.0F, 3.0F));
	}

	/**
	 * Gets the username of the entity.
	 */
	public String getEntityName()
	{
		return "Parasecta";
	}

	/**
	 * Returns the health points of the dragon.
	 */
	public int getDragonHealth()
	{
		return this.dataWatcher.getWatchableObjectInt(16);
	}

	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
	}
	
	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	protected boolean isAIEnabled()
	{
		return true;
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.1F;
	}

	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (!this.worldObj.isRemote)
		{
			this.dataWatcher.updateObject(16, func_110143_aJ());
		}
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
		return this.rand.nextInt(4) != 0 ? null : "mob.RPG.Parasecta";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.RPG.ParasectaHit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.RPG.ParasectaHit";
	}

	/**
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	public boolean canBePushed()
	{
		return false;
	}

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
		
		this.motionY = 0;

		if (this.currentFlightTarget != null)
		{
			double var1 = (double)this.currentFlightTarget.posX - this.posX;
			double var3 = (double)this.currentFlightTarget.posY - this.posY;
			double var5 = (double)this.currentFlightTarget.posZ - this.posZ;

			if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
			{
				this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.10000000149011612D;
				this.motionY += (Math.signum(var3) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
				this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.10000000149011612D;
				float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
				float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
				this.moveForward = 0.5F;
				this.rotationYaw += var8;
			}
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

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {

			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}

	/**
	 * Initialize this creature.
	 */
	public void initCreature() {}

	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean var1, int var2)
	{

		this.dropItem(ArcanaItemHelper.dungeonToken.itemID, 8);
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(ArcanaBlockHelper.ParasectaStatue.blockID, 1);
		}
	}
}
