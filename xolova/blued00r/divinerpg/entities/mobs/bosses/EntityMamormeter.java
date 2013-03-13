package xolova.blued00r.divinerpg.entities.mobs.bosses;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.ai.EntityAIEnergyArrowAttack;
import xolova.blued00r.divinerpg.entities.mobs.projectile.EntityMamormeterShot;
import xolova.blued00r.divinerpg.entities.projectile.EntityStarfall;

public class EntityMamormeter extends EntityMob implements IBossDisplayData
{
    private int special;

	public EntityMamormeter(World var1)
    {
        super(var1);
        this.texture = "/mob/kingScorcher.png";
        this.moveSpeed = 0.25F;
        this.setSize(2.0F, 3.9F);
        this.tasks.addTask(4, new EntityAIEnergyArrowAttack(this, this.moveSpeed, 3, 10));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 128.0F, 0, true));
        this.special = 0;
    }
    
    protected void updateAITasks()
    {
    	if (this.rand.nextInt(250) == 0 && this.special == 0)
    	{
    		this.special = 25;
    	}
    	
    	if (this.special > 0 && this.getAttackTarget() != null)
    	{
    		this.special--;
    		if (this.special % 5 == 0)
    		{
    			EntityMamormeterShot var1 = new EntityMamormeterShot(this.worldObj, (double)this.getAttackTarget().posX, (double)this.getAttackTarget().posY + 10, (double)this.getAttackTarget().posZ, true);
    			var1.setVelocity(0, -0.5, 0);
                this.worldObj.spawnEntityInWorld(var1);
    		}
    	}
    	else
    	{
        	super.updateAITasks();
    	}
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "King of Scorchers";
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
        return 30;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 6000;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 10;
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
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }
        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.kingScorcher";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.kingScorcherHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.furyFire.itemID;
    }

    public void dropFewItems(boolean par1, int par2)
    {
        int var1 = this.rand.nextInt(4);
        this.dropItem(this.getDropItemId(), 1);
        this.dropItem(DivineRPG.blueFireStone.itemID, 6);
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(DivineRPG.KOSStatue.blockID, 1);
		}
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
}
