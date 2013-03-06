package xolova.blued00r.divinerpg.entities.mobs.vethea;

import java.util.List;

import xolova.blued00r.divinerpg.entities.vethea.EntityRaglokBomb;

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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityKaros extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
	
	private static int ability;
	private final int DEFAULT = 0;
	private final int CEILING = 1;
	private final int CANNONS = 2;
	private final int FLOOR = 3;
	
	private int waitTick;
	private int abilityCoolDown;
	
	private EntityAIBase meleeAI;
	private EntityAIBase rangedAISpeed = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
	private EntityAIBase rangedAI = new EntityAIArrowAttack(this, 0.25F, 20, 64.0F);
	private EntityAIBase rangedAIOnce = new EntityAIArrowAttack(this, 0.25F, 1, 64.0F);
	private int rangedAttackCounter;
	
    public EntityKaros(World par1)
    {
        super(par1);
        this.texture = "/mob/Raglok.png";
        this.moveSpeed = 0.25F;
        meleeAI.setMutexBits(2);
        rangedAI.setMutexBits(2);
        meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, meleeAI);
        this.tasks.addTask(2, rangedAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.isImmuneToFire = true;
        System.out.println("constructor");
        this.ability = DEFAULT;
    }
    
    protected void updateAITasks()
    {
        	this.manageAbilities();
        	super.updateAITasks();
    }
    
    public void manageAbilities()
    {
    	System.out.println("1" + "," + this.ability + "," + this.abilityCoolDown + "," + this.entityId);


        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }
        
        EntityPlayer var1 = (EntityPlayer) this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);
    	
    	if (this.ability == DEFAULT && this.abilityCoolDown == 0)
    	{
    		this.abilityCoolDown = 40;
    		switch(this.rand.nextInt(4))
    		{
    		case 0:
    			this.ability = CEILING;
    			this.rangedAttackCounter = 100;
    			this.moveSpeed = 0;
    			break;
    		case 1:
    			this.ability = CANNONS;
    			this.rangedAttackCounter = -1;
    			break;
    		case 2:
    			this.ability = FLOOR;
    			this.rangedAttackCounter = 100;
    			break;
    		default: break;
    		}
    		this.message();
    	}
    	else if (this.ability == DEFAULT && this.abilityCoolDown > 0)
    	{
    		this.abilityCoolDown--;
    	}
    	else if (this.ability != 0 && this.abilityCoolDown == 0)
    	{
    		this.abilityCoolDown = 40;
    	}
    	
    }

    private void message()
    {
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(64.0D, 64.0D, 64.0D));
        System.out.println("Messaging");
        for (int var1 = 0; var1 < list.size(); ++var1)
        {
        	if (list.get(var1) instanceof EntityPlayer)
        	{
        		EntityPlayer var2 = (EntityPlayer) list.get(var1);
        		switch (this.ability)
        		{
        		case CEILING:
        			var2.sendChatToPlayer("CHARRGEE!");
        			break;
        		case CANNONS:
        			var2.sendChatToPlayer("Come Feel the Soul of Arksiane.");
        			break;
        		case FLOOR:
        			var2.sendChatToPlayer("Arksiane, give me fire!");
        			break;
        		default:
        			break;
        		}
        	}
        }

		
	}

	public int getAttackStrength(Entity par1)
    {
        return 1;
    }

    public int getMaxHealth()
    {
        return 1;
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
    	if(this.ability == CEILING)
    	{
    		this.worldObj.
    		if (this.rangedAttackCounter == 100)
    		{
    			this.ability = DEFAULT;
    			this.rangedAttackCounter = 0;
    		}
    	}
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
        System.out.println("init");
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
        	if (this.ability == SLOW)
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
	public void attackEntityWithRangedAttack(EntityLiving par1) 
	{
		switch(this.ability)
		{
		case LIGHTNING:
			this.worldObj.spawnEntityInWorld(new EntityLightningBolt(this.worldObj, (double)par1.lastTickPosX, (double)par1.lastTickPosY, (double)par1.lastTickPosZ));
			this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
			this.rangedAttackCounter++;
			if (this.rangedAttackCounter == 10)
			{
				this.ability = DEFAULT;
			}
	        break;
		case BOMBS:
	        EntityRaglokBomb var2 = new EntityRaglokBomb(this.worldObj);
	        var2.setPosition(par1.posX, par1.posY + 5, par1.posZ);
	        var2.setVelocity(0, -2, 0);
	        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	        this.worldObj.spawnEntityInWorld(var2);
	        ++this.rangedAttackCounter;
	        if (this.rangedAttackCounter == 5)
	        {
	        	this.ability = DEFAULT;
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
}