package net.divinerpg.entities.bosses;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.entities.twilight.projectile.EntityFuryArrow;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityReyvor extends EntityDivineMob implements IBossDisplayData, IRangedAttackMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(TwilightItemHelper.HaliteBow, 1);

    public EntityReyvor(World var1)
    {
        super(var1, 0.3F, 5000, 30, 128.0F);
        this.tasks.addTask(7, new EntityAIArrowAttack(this, this.getMoveSpeed(), 60, 64.0F));  
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Reyvor";
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
    public boolean isAIEnabled()
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

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, func_110143_aJ());
        }

        super.onLivingUpdate();
    }

	 /**
	  * Returns the sound this mob makes while it's alive.
	  */
	 protected String getLivingSound()
	 {
		 return "mob.RPG.Reyvor";
	 }

	 /**
	  * Returns the sound this mob makes when it is hurt.
	  */
	 protected String getHurtSound()
	 {
		 return "mob.RPG.ReyvorHit";
	 }

	 /**
	  * Returns the sound this mob makes on death.
	  */
	 protected String getDeathSound()
	 {
		 return null;
	 }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    public void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(TwilightItemHelper.Halitelegs.itemID, 1);
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(TwilightBlockHelper.ReyvorStatue.blockID, 1);
		}
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase var1, float f)
    {
        EntityFuryArrow var2 = new EntityFuryArrow(this.worldObj, this, var1, 1.6F, 12.0F);
        var2.setDamage(24D);

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }
}
