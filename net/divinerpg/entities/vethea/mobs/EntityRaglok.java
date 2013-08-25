package net.divinerpg.entities.vethea.mobs;

import java.util.List;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.entities.vethea.projectile.EntityRaglokBomb;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityRaglok extends EntityDivineMob implements IRangedAttackMob, IBossDisplayData
{
	
	private static int ability;
	private final int DEFAULT = 0;
	private final int LIGHTNING = 1;
	private final int BLIND = 2;
	private final int BOMBS = 3;
	private final int SLOW = 4;
	
	private int abilityCoolDown;
	
	private EntityAIBase meleeAI;
	private EntityAIBase rangedAI = new EntityAIArrowAttack(this, 0.25F, 20, 64.0F);
	private int rangedAttackCounter;
	private int deathTicks;
	
    public EntityRaglok(World par1)
    {
        super(par1, 0.25F, 5000, 30, 128.0F );
        meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.getMoveSpeed(), false);
        meleeAI.setMutexBits(2);
        rangedAI.setMutexBits(2);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, meleeAI);
        this.tasks.addTask(2, rangedAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.isImmuneToFire = true;
        ability = DEFAULT;
        this.setSize(1.5F, 4.0F);
		this.playSound("mob.RPG.Raglok.RaglokAwaken", 1.0F, 1.0F);
    }
    
    protected void updateAITasks()
    {
        	this.manageAbilities();
        	super.updateAITasks();
    }
    
    public void manageAbilities()
    {
        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16,  getHealth());
        }
        
        EntityPlayer var1 = (EntityPlayer) this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);
    	
    	if (ability == DEFAULT && abilityCoolDown == 0)
    	{
    		abilityCoolDown = 40;
    		setMoveSpeed(0.25F);
    		switch(this.rand.nextInt(4))
    		{
    		case 0:
    			ability = LIGHTNING;
    			this.rangedAttackCounter = 100;
    			setMoveSpeed(0);
    			break;
    		case 1:
    			ability = BLIND;
    			this.rangedAttackCounter = -1;
    			break;
    		case 2:
    			ability = BOMBS;
    			this.rangedAttackCounter = 100;
    			break;
    		case 3:
    			ability = SLOW;
    			this.rangedAttackCounter = -1;
    			break;
    		default: break;
    		}
    		this.message();
    	}
    	else if (ability == DEFAULT && abilityCoolDown > 0)
    	{
    		abilityCoolDown--;
    	}
    	else if (ability != 0 && abilityCoolDown == 0)
    	{
    		abilityCoolDown = 40;
    	}
    	
    	if(ability == BLIND)
    	{
    		if (var1 != null)
    		{
        		var1.addPotionEffect(new PotionEffect(Potion.blindness.id, 1, 0));
        		this.rangedAttackCounter--;
    		}
    		
    		if (this.rangedAttackCounter == -200)
    		{
    			ability = DEFAULT;
    			this.rangedAttackCounter = -1;
    		}
    	}
    	if(ability == SLOW)
    	{
    		if (var1 != null)
    		{
        		var1.addPotionEffect(new PotionEffect(Potion.blindness.id, 1, 0));
        		this.rangedAttackCounter--;
    		}
    		
    		if (this.rangedAttackCounter == -100)
    		{
    			ability = DEFAULT;
    			this.rangedAttackCounter = -1;
    		}
    	}
    }

    private void message()
    {
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(64.0D, 64.0D, 64.0D));
        for (int var1 = 0; var1 < list.size(); ++var1)
        {
        	if (list.get(var1) instanceof EntityPlayer)
        	{
        		EntityPlayer var2 = (EntityPlayer) list.get(var1);
        		switch (ability)
        		{
        		case LIGHTNING:
        			this.playSound("mob.RPG.Raglok.RaglokHelio", 1.0F, 1.0F);
        	        var2.addChatMessage("You think you can fight me? I am the great guardian of Heliosis!");
        			break;
        		case BLIND:
        			this.playSound("mob.RPG.Raglok.RaglokDark", 1.0F, 1.0F);
        			break;
        		case BOMBS:
        			this.playSound("mob.RPG.Raglok.RaglokRain", 1.0F, 1.0F);
        			break;
        		case SLOW:
        			this.playSound("mob.RPG.Raglok.Raglok", 1.0F, 1.0F);
        			break;
        		default:
        			break;
        		}
        	}
        }

		
	}

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }
    
    public void onLivingUpdate()
    {
    	super.onLivingUpdate();
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
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
        return "";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "";
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
        return "mob.RPG.RaglokAvenge";
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
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
    	return super.attackEntityFrom(par1DamageSource, par2);
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int var2 = this.getAttackStrength(par1Entity);

        if (this.isPotionActive(Potion.damageBoost))
        {
            var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
        }

        if (this.isPotionActive(Potion.weakness))
        {
            var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
        }

        int var3 = 0;

        if (par1Entity instanceof EntityLiving)
        {
            var2 += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLiving)par1Entity);
            var3 += EnchantmentHelper.getKnockbackModifier(this, (EntityLiving)par1Entity);
            //((EntityLiving) par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 16 * 5, 1));
        }

        boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

        if (var4)
        {
        	if (ability == SLOW)
        	{
        		var3 = 5;
        	}
            if (var3 > 0)
            {
                par1Entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                par1Entity.setFire(var5 * 4);
            }
        }

        return var4;
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase par1, float par2) 
	{
		switch(ability)
		{
		case LIGHTNING:
			this.worldObj.spawnEntityInWorld(new EntityLightningBolt(this.worldObj, (double)par1.lastTickPosX, (double)par1.lastTickPosY, (double)par1.lastTickPosZ));
			this.rangedAttackCounter++;
			if (this.rangedAttackCounter == 10)
			{
				ability = DEFAULT;
			}
	        break;
		case BOMBS:
	        EntityRaglokBomb var2 = new EntityRaglokBomb(this.worldObj);
	        var2.setPosition(par1.posX, par1.posY + 5, par1.posZ);
	        var2.setVelocity(0, -2, 0);
	        this.worldObj.spawnEntityInWorld(var2);
	        ++this.rangedAttackCounter;
	        if (this.rangedAttackCounter == 5)
	        {
	        	ability = DEFAULT;
	        }
	        break;
        default: break;
		}
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
    	this.dropItem(VetheaItemHelper.heliosisLump.itemID, 25);
    }

    /**
     * handles entity death timer, experience orb and particle creation
     */
    protected void onDeathUpdate()
    {
        ++this.deathTicks;

        if (this.deathTicks >= 180 && this.deathTicks <= 200)
        {
            float var1 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            float var2 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            float var3 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            this.worldObj.spawnParticle("hugeexplosion", this.posX + (double)var1, this.posY + 2.0D + (double)var2, this.posZ + (double)var3, 0.0D, 0.0D, 0.0D);
        }

        int var4;
        int var5;

        if (!this.worldObj.isRemote)
        {
            if (this.deathTicks > 150 && this.deathTicks % 5 == 0)
            {
                var4 = 1000;

                while (var4 > 0)
                {
                    var5 = EntityXPOrb.getXPSplit(var4);
                    var4 -= var5;
                    this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
                }
            }

            if (this.deathTicks == 1)
            {
                this.worldObj.func_82739_e(1018, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
                this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D).attackEntityFrom(DamageSource.magic, 16);
            }
        }

        this.moveEntity(0.0D, 0.10000000149011612D, 0.0D);
        this.renderYawOffset = this.rotationYaw += 20.0F;

        if (this.deathTicks == 200 && !this.worldObj.isRemote)
        {
            var4 = 2000;

            while (var4 > 0)
            {
                var5 = EntityXPOrb.getXPSplit(var4);
                var4 -= var5;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
            };
            this.setDead();
        }
    }
}