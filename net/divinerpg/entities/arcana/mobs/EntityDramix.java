package net.divinerpg.entities.arcana.mobs;

import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
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
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDramix extends EntityZombie implements IBossDisplayData
{

	private int firetick;
	private int firemax = 300;
	private int firemax2 = 200;

	private boolean isInvi;

	public EntityDramix(World var1)
	{
		super(var1);

		if(isInvi == true)
		{
			setMoveSpeed(0.6F);
		}
		else
		{
		    setMoveSpeed(1.0F);
		}
		
        this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this. getMoveSpeed(), false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this. getMoveSpeed()));
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this. getMoveSpeed(), false));
        this.tasks.addTask(6, new EntityAIWander(this, this. getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        if(isInvi == false)
        {
        	this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        }
        
		this.isImmuneToFire = true;
	}  
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(5000);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(39);
    }
	
	
	public void setMoveSpeed(float speed) {
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(speed); // SET attribute Movespeed
    }
	public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
    }
    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

	/**
	 * Gets the username of the entity.
	 */
	public String getEntityName()
	{
		return "Dramix";
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
		this.dataWatcher.addObject(16, this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111126_e());
	}
	
	public boolean isInv()
	{
		return isInvi;
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
			}
		}

		if(firemax == firetick && firetick !=0)
		{
			this.isInvi = true;
			this.firetick = 0;
		}
		else
		{
			++firetick;
		}

		if(firemax2 == firetick && firetick !=0)
		{
			this.isInvi = false;
			this.firetick = 0;
		}
		else
		{
			++firetick;
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
		return "mob.RPG.Dramix";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.RPG.DramixHurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.RPG.DramixHurt";
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
		this.dropItem(ArcanaItemHelper.dungeonToken.itemID, 5);
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(ArcanaBlockHelper.DramixStatue.blockID, 1);
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
