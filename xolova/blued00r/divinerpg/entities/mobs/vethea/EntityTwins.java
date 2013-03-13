package xolova.blued00r.divinerpg.entities.mobs.vethea;

import java.util.List;

import xolova.blued00r.divinerpg.entities.vethea.EntityBouncingProjectile;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanArrow;
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

public class EntityTwins extends EntityMob implements IRangedAttackMob
{
	
	public static int ability;
	private final int SLOW = 0;
	private final int FAST = 1;
	
	private int waitTick;
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
        this.ability = SLOW;
    }
    
    protected void updateAITasks()
    {
    	this.manageAbilities();
    	super.updateAITasks();
    }
    
    public void manageAbilities()
    {

        if (this.ability == SLOW && this.abilityCoolDown == 0)
        {
        	this.ability = FAST;
    		this.abilityCoolDown = 50;
    		this.rangedAttackCounter = 0;
    	}
        else if (this.ability == FAST && this.abilityCoolDown == 0)
        {
        	this.ability = SLOW;
    		this.abilityCoolDown = 60;
    		this.rangedAttackCounter = 0;
    	}
    	else if (this.abilityCoolDown > 0)
    	{
    		this.abilityCoolDown--;
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
        return "mob.RPG.Deathcryx";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.DeathCryxHit";
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
        return "mob.RPG.Deathcryx";
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
	public void attackEntityWithRangedAttack(EntityLiving par1) 
	{
		switch(this.ability)
		{
		case FAST:
			EntityVetheanArrow var2 = new EntityVetheanArrow(this.worldObj, this, par1, 1.6F, 12.0F);
			var2.setDamage(1);
	        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	        this.worldObj.spawnEntityInWorld(var2);
	        break;
		case SLOW:
	        this.rangedAttackCounter++;
	        if ((this.rangedAttackCounter % 4) == 0)
	        {
	        	EntityVetheanArrow var4 = new EntityVetheanArrow(this.worldObj, this, par1, 1.6F, 12.0F);
		        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
				var4.setDamage(2);
		        this.worldObj.spawnEntityInWorld(var4);
	        }
	        break;
        default: break;
		}
	}
}