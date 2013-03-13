package xolova.blued00r.divinerpg.entities.mobs.vethea;

import java.util.List;

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

public class EntityWreck extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
	private static int stage;
	private final int MELEE = 0;
	private final int ARCANA = 1;
	private final int RANGED = 2;
	
	private static int ability;
	private final int DEFAULT = 0;
	private final int CHARGE = 1;
	private final int PULL = 2;
	private final int FIRE = 3;
	private final int BOUNCE = 4;
	private final int FREEZE = 5;
	private final int SPEED = 6;
	private final int EXPLOSIONS = 7;
	private final int STRENGTH = 8;
	
	private int waitTick;
	private int abilityCoolDown;
	
	private EntityAIBase meleeAI;
	private EntityAIBase rangedAISpeed = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
	private EntityAIBase rangedAI = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
	private EntityAIBase rangedAIOnce = new EntityAIArrowAttack(this, 0.25F, 1, 64.0F);
	private int rangedAttackCounter;
	
    public EntityWreck(World par1)
    {
        super(par1);
        this.texture = "/mob/Wreck.png";
        this.moveSpeed = 0.25F;
        meleeAI.setMutexBits(2);
        rangedAI.setMutexBits(2);
        meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, meleeAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.isImmuneToFire = true;
        System.out.println("constructor");
        this.ability = DEFAULT;
        this.stage = MELEE;
    }
    
    protected void updateAITasks()
    {
    	
    	if (this.ability == CHARGE || this.waitTick > 0)
    	{
    		System.out.println("charging");
        	if (this.getAttackTarget() != null && this.waitTick <= 0)
        	{
        		System.out.println("charge start");
        		this.waitTick = 50;
        	}
        	else if (this.waitTick <= 1)
        	{
        		this.setAIMoveSpeed(this.moveSpeed);
        		--this.waitTick;
        		this.ability = DEFAULT;
        		System.out.println("Charge Defaulting");
        	}
        	else if (this.waitTick == 10)
        	{
        		this.setAIMoveSpeed(0);
        		--this.waitTick;
        		System.out.println("Stopping");
        	}
        	else
        	{
        		--this.waitTick;
        		System.out.println(this.waitTick);
        		this.moveEntityWithHeading(0F, 0.25F);
        	}
        	
        	return;
    	}
    	
    	if (this.waitTick <= 0)
    	{
        	System.out.println("Managing Abilities");
        	this.manageAbilities();
        	super.updateAITasks();
    	}
    }

	@SideOnly(Side.CLIENT)

	/**
	 * Returns the texture's file path as a String.
	 */
	public String getTexture()
	{
		return this.stage == MELEE ? "/mob/Dramix.png" : (this.stage == ARCANA ? "/mob/vamacheron.png" : (this.stage == RANGED ? "/mob/Alicanto.png" : super.getTexture()));
	}
    
    public void manageAbilities()
    {
    	System.out.println("1" + "," + this.ability + "," + this.abilityCoolDown + "," + this.entityId);


        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }
        
        EntityPlayerMP var1 = (EntityPlayerMP) this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

    	if (this.health < this.getMaxHealth() / 3 && this.ability == DEFAULT)
    	{
    		this.stage = RANGED;
    		this.tasks.func_85156_a(meleeAI);
    	}
    	else if (this.health < this.getMaxHealth() * 2 / 3 && this.ability == DEFAULT)
    	{
    		this.stage = ARCANA;
			this.tasks.addTask(2, rangedAI);
			this.rangedAttackCounter = 1;
    	}
    	
    	if (this.ability == DEFAULT && this.abilityCoolDown == 0)
    	{
    		this.abilityCoolDown = 40;
    		switch (this.stage)
    		{
    		case MELEE:
    			System.out.println("Setting");
    			switch(this.rand.nextInt(2))
    			{
    			case 0:
    				this.ability = PULL;
            		System.out.println("Pull Setting");
                	this.setAIMoveSpeed(0.0F);
                	this.moveSpeed = 0;
    				break;
    			case 1:
    				this.ability = CHARGE;
            		System.out.println("Charge Setting");
    				this.setAIMoveSpeed(1.4F);
    				break;
                default: break;
    			}
    			break;
    		case ARCANA:
    			switch(this.rand.nextInt(3))
    			{
    			case 0:
    				this.ability = FIRE;
            		System.out.println("Fire Setting");
    				break;
    			case 1:
    				this.ability = BOUNCE;
        			this.rangedAttackCounter = 0;
            		System.out.println("Bounce Setting");
    				break;
    			case 2:
    				this.ability = FREEZE;
            		System.out.println("Freeze Setting");
    				break;
                default: break;
    			}
    			break;
    		case RANGED:
    			this.rangedAttackCounter = 0;
    			switch(this.rand.nextInt(3))
    			{
    			case 0:
    				this.ability = SPEED;
            		System.out.println("Charge Speed");
    				break;
    			case 1:
    				this.ability = EXPLOSIONS;
            		System.out.println("Explosions Setting");
    				break;
    			case 2:
    				this.ability = STRENGTH;
            		System.out.println("Strength Setting");
    				break;
                default: break;
    			}
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
    	
    	if(this.ability == FIRE)
    	{
    		if (var1 != null)
    		{
        		for (int i = 0; i < 5; ++i)
        		{
        			int var2 = (int) ((this.posX - var1.posX) / 5) * i;
        			int var3 = (int) ((this.posZ - var1.posZ) / 5) * i;
            		this.worldObj.setBlockWithNotify((int)this.posX - var2, (int)this.posY, (int)this.posZ - var3, Block.fire.blockID);
        		}
        		this.ability = DEFAULT;
        		System.out.println("Fire Defaulting");
    		}
    	}
    	if(this.ability == FREEZE)
    	{
    		if (var1 != null)
    		{
        		System.out.println("Slowing Player");
        		var1.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 5));
        		this.rangedAttackCounter++;
    		}
    		
    		if (this.rangedAttackCounter == 100)
    		{
    			this.ability = DEFAULT;
        		System.out.println("Freeze Defaulting");
    			this.rangedAttackCounter = 0;
    		}
    	}
    	
    	System.out.println("2" + "," + this.ability + "," + this.abilityCoolDown + "," + this.entityId);
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
        		case CHARGE:
        			var2.sendChatToPlayer("CHARRGEE!");
        			break;
        		case PULL:
        			var2.sendChatToPlayer("Come Feel the Soul of Arksiane.");
        			break;
        		case FIRE:
        			var2.sendChatToPlayer("Arksiane, give me fire!");
        			break;
        		case FREEZE:
        			var2.sendChatToPlayer("Stop at once in the name of the great Arksiane!");
        			break;
        		case SPEED:
        			var2.sendChatToPlayer("Speed!");
        			break;
        		case EXPLOSIONS:
        			var2.sendChatToPlayer("Explosions!");
        			break;
        		case STRENGTH:
        			var2.sendChatToPlayer( "Strength!");
        			break;
        		default:
        			break;
        		}
        	}
        }

		
	}

	public int getAttackStrength(Entity par1)
    {
    	int var1 = 1;
    	if (this.ability == PULL)
    	{
    		var1 = 3;
    	}
        return var1;
    }

    public int getMaxHealth()
    {
        return 30;
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
        
    	if (this.ability == PULL)
    	{
        	
    		EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

            if (var1 == null || var1.getDistanceToEntity(this) > 64)
            {
                return;
            }
            else
            {
                var1.addVelocity(Math.signum(this.posX - var1.posX) * 0.069,0, Math.signum(this.posZ - var1.posZ) * 0.069);
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
        	if (this.ability == PULL)
        	{
        		this.ability = DEFAULT;
        		System.out.println("Pull Defaulting");
        		this.moveSpeed = 0.25F;
        		this.setAIMoveSpeed(this.moveSpeed);
        		var3 = 2;
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
		case BOUNCE:
			if (this.rangedAttackCounter == 0)
			{
				EntityBouncingProjectile var1 = new EntityBouncingProjectile(this.worldObj, this, 5);
		        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		        this.worldObj.spawnEntityInWorld(var1);
		        this.ability = DEFAULT;
		        this.rangedAttackCounter++;
	    		System.out.println("Bounce Defaulting");
			}
	        break;
		case SPEED:
	        EntityArrow var2 = new EntityArrow(this.worldObj, this, par1, 1.6F, 12.0F);
	        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	        this.worldObj.spawnEntityInWorld(var2);
	        ++this.rangedAttackCounter;
    		System.out.println("Speed Shot" + this.rangedAttackCounter);
	        if (this.rangedAttackCounter == 20)
	        {
	        	this.ability = DEFAULT;
        		System.out.println("Speed Defaulting");
	        }
	        break;
		case EXPLOSIONS:
	        if ((this.rangedAttackCounter % 4) == 0)
	        {
		        EntityArrow var3 = new EntityArrow(this.worldObj, this, par1, 1.6F, 12.0F);
		        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		        this.worldObj.spawnEntityInWorld(var3);
		        ++this.rangedAttackCounter;
        		System.out.println("Explosions Shot" + this.rangedAttackCounter);
	        }
	        else if (this.rangedAttackCounter >= 24)
	        {
	        	this.ability = DEFAULT;
        		System.out.println("Explosions Defaulting");
	        }
	        else
	        {
	        	this.rangedAttackCounter++;
	        }
	        break;
		case STRENGTH:
	        if ((this.rangedAttackCounter % 4) == 0)
	        {
		        EntityArrow var4 = new EntityArrow(this.worldObj, this, par1, 1.6F, 12.0F);
		        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		        this.worldObj.spawnEntityInWorld(var4);
		        ++this.rangedAttackCounter;
        		System.out.println("Strength Shot" + this.rangedAttackCounter);
	        }
	        else if (this.rangedAttackCounter >= 12)
	        {
	        	this.ability = DEFAULT;
        		System.out.println("Strength Defaulting");
	        }
	        else
	        {
	        	this.rangedAttackCounter++;
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