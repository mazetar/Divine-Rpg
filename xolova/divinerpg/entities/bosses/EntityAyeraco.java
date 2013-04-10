package xolova.divinerpg.entities.bosses;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.overworld.projectile.EntityTripletProjectile;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityAyeraco extends EntityMob implements IBossDisplayData
{
	private String colour;
	private int waitTick;
	private ChunkCoordinates currentFlightTarget;
	private boolean attacks;
	private double moveX;
	private double moveZ;
	private boolean halfHp;

	public EntityAyeraco(World var1, String par2, String par3)
	{
		super(var1);
		this.texture = par2;
		this.setSize(3.0F, 1.9F);
		this.colour = par3;
        this.moveSpeed = 0.25F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, this.moveSpeed, false));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 128.0F, 0, true));
        this.waitTick = 0;
        this.attacks = false;
		this.moveX = this.rand.nextGaussian() * 0.25  - 0.125;
		this.moveZ = this.rand.nextGaussian() * 0.25 - 0.125;
	}
    
	/**
	 * Gets the username of the entity.
	 */
	public String getEntityName()
	{
		return "Ayeraco " + this.colour;
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

	public int getAttackStrength(Entity var1)
	{
		return 28;
	}

	public int getMaxHealth()
	{
		return 1000;
	}
	
	public int getMaxArmor()
	{
		return 10;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	protected boolean isAIEnabled()
	{
		return true;
	}

	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (!this.worldObj.isRemote)
		{
			this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
		}
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return "mob.RPG.Ayeraco";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.RPG.AyeracoHit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.RPG.AyeracoHit";
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
		
		if (this.health * 2 < this.getMaxHealth())
		{
			this.tickAbility();
			if (this.halfHp = false)
			{
				this.worldObj.playSoundAtEntity(this, "mob.RPG.AyeracoHalfHealth", 20.0F,  0.4F / (this.rand.nextFloat() * 0.4F + 0.8F));
			}
		}
		
		if (this.waitTick == 0)
		{
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
					this.motionX = Math.signum(var1) * this.moveSpeed;
					this.motionY += (Math.signum(var3) * 5.699999988079071D - this.motionY) * 0.10000000149011612D;
					this.motionZ = Math.signum(var5) * this.moveSpeed;
					float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
					float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
					this.moveForward = 0.5F;
					this.rotationYaw += var8;
				}
			}
		}
		else
		{
			this.waitTick--;
			this.motionY = 0.3;
			this.motionX = this.moveX;
			this.motionZ = this.moveZ;
		}

		if (!this.attacks)
		{
			this.waitTick = 80;
			this.attacks = true;
			if (this.canTeleport())
			{
				this.waitTick = 0;
				this.teleportRandomUp(this.worldObj);
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
        else if (par1DamageSource.getSourceOfDamage() instanceof EntityTripletProjectile)
        {
        	return false;
        }
        else if (par1DamageSource.isProjectile() && this.canBlockProjectiles())
		{
			return false;
		}
		else
		{
			if (par1DamageSource.getSourceOfDamage() instanceof EntityPlayer)
			{
				this.attacks = false;
			}
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
		this.dropItem(OverworldItemHelper.yellowShard.itemID, 2 + this.rand.nextInt(2));
		if (this.rand.nextInt(100) < 2)
		{
			switch (this.rand.nextInt(2))
			{
			case 0:
				this.dropItem(OverworldItemHelper.divineBody.itemID, 1);
			case 1:
				this.dropItem(OverworldItemHelper.divineLegs.itemID, 1);
			}
		}
		
		if (this.rand.nextInt(100) < 5)
		{
			this.dropItem(OverworldItemHelper.divineBoots.itemID, 1);
		}

		
		if (this.rand.nextInt(100) < 3)
		{
			this.dropItem(OverworldItemHelper.divineBoots.itemID, 1);
		}
		
		if (this.rand.nextInt(12) == 0)
		{
			this.dropItem(OverworldBlockHelper.ayeracoStatue.blockID, 1);
		}
	}
	
	public boolean attackEntityAsMob(Entity par1Entity)
    {
		this.attacks = false;
		return super.attackEntityAsMob(par1Entity);
    }
	
	protected void tickAbility(){}
	
	protected boolean canBlockProjectiles()
	{
		return true;
	}
	
	protected boolean canTeleport()
	{
		return true;
	}
	
	public boolean abilityActive()
	{
		if (this.health * 2 <= this.getMaxHealth() && !this.isDead)
		{
			return true;
		}
		return false;
	}
	
	protected void teleportRandomUp(World par1)
	{
		par1.playSoundAtEntity(this, "mob.RPG.AyeracoTeleport", 2.0F, 0.4F / (this.rand.nextFloat() * 0.4F + 0.8F));
		this.motionY = 20;
		this.motionX = this.rand.nextInt(5);
		this.motionZ = this.rand.nextInt(5);
	}
}
