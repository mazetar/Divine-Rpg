package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityBiphron extends EntityDivineMob
{
    private static final int spawnLayer = 2;
	private boolean gravMove;

	public EntityBiphron(World world)
    {
        super(world, 0.25F, 40, 14, 100.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, this.getMoveSpeed(), true));
        this.tasks.addTask(5, new EntityAIMoveTowardsTarget(this, this.getMoveSpeed(), 128.0F));
        this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.gravMove = true;
        this.setSize(0.4F, 2.8F);
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
    	if (this.rand.nextInt(50) == 0)
    	{
    		if (!this.gravMove)
    		{
        		this.gravMove = true;
    		}
    		else
    		{
    			this.gravMove = false;
    		}
    	}
    	
    	if (this.gravMove)
    	{
    		this.motionY = 0.4;
    	}
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
        return "mob.RPG.Biphron";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.Biphron";
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


    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(VetheaItemHelper.cleanPearls.itemID, 1);
    }
    
    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }
}