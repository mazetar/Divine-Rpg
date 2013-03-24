package xolova.divinerpg.entities.vethea.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityVetheanArrow;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;

public class EntityTwins extends EntityMob implements IRangedAttackMob
{
	
	private static final double spawnLayer = 2;
	public static int ability;
	private final int SLOW = 0;
	private final int FAST = 1;
	
	private int abilityCoolDown;
	
	private EntityAIBase rangedAI;
	private int rangedAttackCounter;
	
    public EntityTwins(World par1World)
    {
        super(par1World);
        this.texture = "/mob/Twins.png";
        this.moveSpeed = 0.25F;
        this.health = this.getMaxHealth();
        rangedAI = new EntityAIArrowAttack(this, 0.25F, 10, 64.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, rangedAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        ability = SLOW;
    }
    
	/**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }
    
    protected void updateAITasks()
    {
    	this.manageAbilities();
    	super.updateAITasks();
    }
    
    public void manageAbilities()
    {

        if (ability == SLOW && abilityCoolDown == 0)
        {
        	ability = FAST;
    		abilityCoolDown = 50;
    		this.rangedAttackCounter = 0;
    	}
        else if (ability == FAST && abilityCoolDown == 0)
        {
        	ability = SLOW;
    		abilityCoolDown = 60;
    		this.rangedAttackCounter = 0;
    	}
    	else if (abilityCoolDown > 0)
    	{
    		abilityCoolDown--;
    	}
    }

	public int getAttackStrength(Entity par1)
    {
    	int var1 = 1;
        return var1;
    }

    public int getMaxHealth()
    {
        return 1;
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
        return "mob.RPG.Twins";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.TwinsHit";
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
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLiving par1, float par2) 
	{
		switch(ability)
		{
		case FAST:
			EntityVetheanArrow var2 = new EntityVetheanArrow(this.worldObj, this, par1, 1.6F, 12.0F);
			var2.setDamage(2);
	        this.worldObj.spawnEntityInWorld(var2);
	        break;
		case SLOW:
	        this.rangedAttackCounter++;
	        if ((this.rangedAttackCounter & 4) == 0)
	        {
	        	EntityVetheanArrow var4 = new EntityVetheanArrow(this.worldObj, this, par1, 1.6F, 12.0F);
		        var4.setDamage(4);
		        this.worldObj.spawnEntityInWorld(var4);
	        }
	        break;
        default: break;
		}
	}


    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(VetheaItemHelper.cleanPearls.itemID, 1);
    }
}