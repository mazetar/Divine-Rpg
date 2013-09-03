package net.divinerpg.entities.iceika.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.entities.iceika.projectile.EntityIce;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityHastreus extends EntityDivineMob implements IRangedAttackMob
{
	public EntityHastreus(World var1)
	{
		super(var1, 0.3F, 200, 20, 16.0F);
		this.setSize(1.0F, 1.9F);
		this.getNavigator().setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(2, new EntityAIArrowAttack(this, this.getMoveSpeed(), 60, 10.0F));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.getMoveSpeed(), false));
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.getMoveSpeed()));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.getMoveSpeed(), false));
		this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	
    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	protected boolean isAIEnabled()
	{
		return true;
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	public void onLivingUpdate()
	{
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
		{
			float var1 = this.getBrightness(1.0F);
		}

		super.onLivingUpdate();
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return "mob.RPG.Hastreus";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.RPG.HastreusHit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.RPG.HastreusHit";
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected int getDropItemId()
	{
		return OverworldItemHelper.iceShard.itemID;
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEFINED;
	}

	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean var1, int var2)
	{
		int var3 = this.rand.nextInt(2 + var2);
		int var4;

		for (var4 = 0; var4 < var3; ++var4)
		{
			this.dropItem(OverworldItemHelper.iceShard.itemID, 3);
		}
	}

	/**
	 * Attack the specified entity using a ranged attack.
	 */
	 public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLiving, float f)
	 {
		 EntityIce var2 = new EntityIce(this.worldObj, this);
		 var2.rotationPitch -= -20.0F;
		 double var3 = par1EntityLiving.posX + par1EntityLiving.motionX - this.posX;
		 double var5 = par1EntityLiving.posY + (double)par1EntityLiving.getEyeHeight() - 1.100000023841858D - this.posY;
		 double var7 = par1EntityLiving.posZ + par1EntityLiving.motionZ - this.posZ;
		 float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7);

		 if (var9 >= 8.0F && !par1EntityLiving.isPotionActive(Potion.moveSlowdown))
		 {
			 //var2.set(32698);
		 }

		 var2.setThrowableHeading(var3, var5 + (double)(var9 * 0.2F), var7, 0.75F, 8.0F);
		 this.worldObj.spawnEntityInWorld(var2);
	 }
}
