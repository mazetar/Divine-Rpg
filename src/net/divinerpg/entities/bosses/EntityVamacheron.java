package net.divinerpg.entities.bosses;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

@SuppressWarnings("unused")
public class EntityVamacheron extends EntityDivineMob implements IBossDisplayData
{
	private ChunkCoordinates chargeTarget;
	private int waitTick;

	public EntityVamacheron(World var1)
    {
        super(var1, 0.6F, 5000, 39, 128.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.getMoveSpeed(), false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.getMoveSpeed(), true));
        this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }
    
    public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
    }
	
    protected void updateAITasks()
    {
    	if (this.getAttackTarget() != null && Math.round(this.posX - this.getAttackTarget().posX) == 0 && Math.round(this.posY - this.getAttackTarget().posY) == 0 && Math.round(this.posZ - this.getAttackTarget().posZ) == 0)
    	{
    		this.waitTick = 30;
    	}
    	else if (this.waitTick == 0)
    	{
        	super.updateAITasks();
    	}
    	else
    	{
    		--this.waitTick;
    	}
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Vamacheron";
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
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, func_110143_aJ());
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.zombie";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.zombiehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.zombiedeath";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return TwilightItemHelper.HaliteBlade.itemID;
    }

    public void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(this.getDropItemId(), 1);
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(TwilightBlockHelper.VamacheronStatue.blockID, 1);
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
