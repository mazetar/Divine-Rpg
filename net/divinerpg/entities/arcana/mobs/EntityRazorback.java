package net.divinerpg.entities.arcana.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityRazorback extends EntityDivineMob
{
    public EntityRazorback(World var1)
    {
        super(var1, 1.5F, 200, 28, 16.0F);
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.getMoveSpeed(), false));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.getMoveSpeed(), true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.getMoveSpeed()));
        this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.height = 0.5F;
    }

    public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
    }
    
    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Razorback";
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Razorback";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.RazorbackHit";
    }
    
	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean var1, int var2)
	{
		this.dropItem(ArcanaItemHelper.collectorFragments.itemID, 1);
	}


    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.RazorbackHit";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return ArcanaItemHelper.collectorFragments.itemID;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    @Override
    protected boolean isValidLightLevel()
    {        
        return true;
    }

    public void jump() {}
    
    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
}
