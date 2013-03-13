package xolova.blued00r.divinerpg.entities.mobs.vethea;

import java.util.List;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.vethea.EntityBouncingProjectile;
import xolova.blued00r.divinerpg.entities.vethea.EntityWreckExplosiveShot;
import xolova.blued00r.divinerpg.entities.vethea.EntityWreckStrengthShot;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public abstract class EntityDuo extends EntityMob
{
	
	public static int ability;
	private final int SLOW = 0;
	private final int FAST = 1;
	
	private int waitTick;
	private int abilityCoolDown;
	
	private EntityAIBase meleeAI;
	
    public EntityDuo(World par1)
    {
        super(par1);
        this.texture = "/mob/Duo.png";
        this.moveSpeed = 0.25F;
        meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, meleeAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.ability = SLOW;
    }
    
    protected void updateAITasks()
    {
    	this.manageAbilities();
    	super.updateAITasks();
    }
    
    public void manageAbilities()
    {
        
        EntityPlayerMP var1 = (EntityPlayerMP) this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

        if (this.ability == SLOW && this.abilityCoolDown == 0)
        {
        	this.ability = FAST;
    		this.abilityCoolDown = 350;
        	this.setAIMoveSpeed(this.moveSpeed * 3);
    	}
    	else if (this.ability == SLOW && this.abilityCoolDown > 0)
    	{
    		this.abilityCoolDown--;
    	}
    	else if (this.ability != 0 && this.abilityCoolDown == 0)
    	{
    		this.abilityCoolDown = 350;
    	}
    	else
    	{
    		this.ability = SLOW;
    	}
    }

	public int getAttackStrength(Entity par1)
    {
    	int var1 = 5;
    	if (this.ability == SLOW)
    	{
    		var1 = 7;
    	}
        return var1;
    }

    public int getMaxHealth()
    {
        return 20;
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
        return "mob.RPG.Duo";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.DuoHit";
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
     * Called by a player entity when they collide with an entity
     */
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) 
    {
    	this.attackEntityAsMob(par1EntityPlayer);
    }


    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(DivineRPG.dirtyPearls.itemID, 1);
    }
}