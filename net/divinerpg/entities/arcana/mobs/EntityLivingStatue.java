package net.divinerpg.entities.arcana.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.entities.arcana.projectile.EntityLivingStatueArrow;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityLivingStatue extends EntityDivineMob implements IRangedAttackMob
{
    public EntityLivingStatue(World var1)
    {
        super(var1, 0.4F, 180, 0, 16.0F);
        this.tasks.addTask(4, new EntityAIArrowAttack(this, this.getMoveSpeed(), 1, 60));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }

    public void setAttackTarget(EntityLiving par1EntityLiving)
    {
        super.setAttackTarget(par1EntityLiving);
    }

    public EntityLivingBase getAttackTarget()
    {
        if (super.getAttackTarget() != null && this.getDistanceToEntity(super.getAttackTarget()) < 16)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)0));
        }

        return super.getAttackTarget();
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
    
    @Override
    protected boolean isValidLightLevel()
    {        
        return true;
    }
    
	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean var1, int var2)
	{
		this.dropItem(ArcanaItemHelper.collectorFragments.itemID, 1);
	}


    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        // TODO: Fix this into the renderer info.
//        byte var1 = this.dataWatcher.getWatchableObjectByte(16);
//        this.texture = var1 == 1 ? "/mob/LivingStatueAwake.png" : "/mob/LivingStatueSleep.png";
        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.highhit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.highhit";
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
        return EnumCreatureAttribute.UNDEAD;
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entityliving, float f) 
	{
		EntityLivingStatueArrow var1 = new EntityLivingStatueArrow(this.worldObj, this, 15F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var1);
	}
}
