package xolova.divinerpg.entities.vethea.mobs;

import java.util.List;

import net.minecraft.block.Block;
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
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityBouncingProjectile;
import xolova.divinerpg.entities.vethea.projectile.EntityWreckExplosiveShot;
import xolova.divinerpg.entities.vethea.projectile.EntityWreckStrengthShot;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWreck extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
	public static int stage;
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
	private EntityAIBase rangedAI = new EntityAIArrowAttack(this, 0.25F, 5, 64.0F);
	private int rangedAttackCounter;
	private int deathTicks;
	
    public EntityWreck(World par1)
    {
        super(par1);
        this.texture = "/mob/Wreck.png";
        this.moveSpeed = 0.25F;
        meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false);
        meleeAI.setMutexBits(2);
        rangedAI.setMutexBits(2);
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, meleeAI);
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.isImmuneToFire = true;
        ability = DEFAULT;
        this.playSound("mob.RPG.Wreck.Intro", 1.0F, 1.0F);
        stage = MELEE;
    }
    
    protected void updateAITasks()
    {
    	
    	if (ability == CHARGE || this.waitTick > 0)
    	{
    		if (this.getAttackTarget() != null && this.waitTick <= 0)
        	{
        		this.waitTick = 30;
        	}
        	else if (this.waitTick == 1)
        	{
        		--this.waitTick;
            	ability = DEFAULT;
        	}
        	else if (this.waitTick == 5)
        	{
        		this.setAIMoveSpeed(0);
        		--this.waitTick;        	
        	}
        	else
        	{
        		--this.waitTick;
        		this.moveEntityWithHeading(0F, this.getAIMoveSpeed());
        	}
        	
        	return;
    	}
    	
    	if (this.waitTick <= 0)
    	{
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
		return stage == MELEE ? "/mob/WreckForm1.png" : (stage == ARCANA ? "/mob/WreckForm2.png" : (stage == RANGED ? "/mob/WreckForm3.png" : super.getTexture()));
	}
    
    public void manageAbilities()
    {
        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }
        
        EntityPlayerMP var1 = (EntityPlayerMP) this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

    	if (this.health < this.getMaxHealth() / 3 && ability == DEFAULT)
    	{
    		stage = RANGED;
    		this.tasks.removeTask(meleeAI);
    	}
    	else if (this.health < this.getMaxHealth() * 2 / 3 && ability == DEFAULT)
    	{
    		stage = ARCANA;
			this.tasks.addTask(2, rangedAI);
			this.rangedAttackCounter = 1;
    	}
    	
    	if (ability == DEFAULT && abilityCoolDown == 0)
    	{
    		abilityCoolDown = 40;
    		switch (stage)
    		{
    		case MELEE:
    			switch(this.rand.nextInt(2))
    			{
    			case 0:
    				ability = PULL;
                	this.setAIMoveSpeed(0.0F);
                	this.moveSpeed = 0;
    				break;
    			case 1:
    				ability = CHARGE;
    				this.setAIMoveSpeed(1.4F);
    				break;
                default: break;
    			}
    			break;
    		case ARCANA:
    			switch(this.rand.nextInt(3))
    			{
    			case 0:
    				ability = FIRE;
    				break;
    			case 1:
    				ability = BOUNCE;
        			this.rangedAttackCounter = 0;
    				break;
    			case 2:
    				ability = FREEZE;
    				break;
                default: break;
    			}
    			break;
    		case RANGED:
    			this.rangedAttackCounter = 0;
    			switch(this.rand.nextInt(3))
    			{
    			case 0:
    				ability = SPEED;
    				break;
    			case 1:
    				ability = EXPLOSIONS;
    				break;
    			case 2:
    				ability = STRENGTH;
    				break;
                default: break;
    			}
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
    	
    	if(ability == FIRE)
    	{
    		if (var1 != null)
    		{
        		for (int i = 0; i < 5; ++i)
        		{
        			int var2 = (int) ((this.posX - var1.posX) / 5) * i;
        			int var3 = (int) ((this.posZ - var1.posZ) / 5) * i;
            		this.worldObj.setBlock((int)this.posX - var2, (int)this.posY, (int)this.posZ - var3, Block.fire.blockID);
        		}
        		ability = DEFAULT;
    		}
    	}
    	if(ability == FREEZE)
    	{
    		if (var1 != null)
    		{
        		var1.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 5));
        		this.rangedAttackCounter++;
    		}
    		
    		if (this.rangedAttackCounter == 100)
    		{
    			ability = DEFAULT;
    			this.rangedAttackCounter = 0;
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
        		case CHARGE:
        			var2.sendChatToPlayer("CHARRGEE!");
        			break;
        		case PULL:
        			this.playSound("mob.RPG.Wreck.FeelSoulArksiane", 1.0F, 1.0F);
        			var2.sendChatToPlayer("Come Feel the Soul of Arksiane.");
        			break;
        		case FIRE:
        			var2.sendChatToPlayer("Arksiane, give me fire!");
        			break;
        		case FREEZE:
        			this.playSound("mob.RPG.Wreck.StopAtOnce", 1.0F, 1.0F);
        			var2.sendChatToPlayer("Stop at once in the name of the great Arksiane!");
        			break;
        		case SPEED:
        			this.playSound("mob.RPG.Wreck.Speed", 1.0F, 1.0F);
        			var2.sendChatToPlayer("Speed!");
        			break;
        		case EXPLOSIONS:
        			this.playSound("mob.RPG.Wreck.Explosions", 1.0F, 1.0F);
        			var2.sendChatToPlayer("Explosions!");
        			break;
        		case STRENGTH:
        			this.playSound("mob.RPG.Wreck.Strength", 1.0F, 1.0F);
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
    	int var1 = 30;
    	if (ability == PULL)
    	{
    		var1 = 35;
    	}
        return var1;
    }

    public int getMaxHealth()
    {
        return 5000;
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
        
    	if (ability == PULL)
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
        	if (ability == PULL)
        	{
        		ability = DEFAULT;
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
	public void attackEntityWithRangedAttack(EntityLiving par1, float par2) 
	{
		switch(ability)
		{
		case BOUNCE:
			if (this.rangedAttackCounter == 0)
			{
				EntityBouncingProjectile var1 = new EntityBouncingProjectile(this.worldObj, this, 30);
		        this.worldObj.spawnEntityInWorld(var1);
		        ability = DEFAULT;
		        this.rangedAttackCounter++;
			}
	        break;
		case SPEED:
	        EntityWreckStrengthShot var2 = new EntityWreckStrengthShot(this.worldObj, this, 15);
	        this.worldObj.spawnEntityInWorld(var2);
	        ++this.rangedAttackCounter;
	        if (this.rangedAttackCounter == 20)
	        {
	        	ability = DEFAULT;
	        }
	        break;
		case EXPLOSIONS:
	        if ((this.rangedAttackCounter % 4) == 0)
	        {
		        EntityWreckExplosiveShot var3 = new EntityWreckExplosiveShot(this.worldObj, this);
		        this.worldObj.spawnEntityInWorld(var3);
		        ++this.rangedAttackCounter;
	        }
	        else if (this.rangedAttackCounter >= 24)
	        {
	        	ability = DEFAULT;
	        }
	        else
	        {
	        	this.rangedAttackCounter++;
	        }
	        break;
		case STRENGTH:
	        if ((this.rangedAttackCounter & 4) == 0)
	        {
		        EntityWreckStrengthShot var4 = new EntityWreckStrengthShot(this.worldObj, this, 40);
		        this.worldObj.spawnEntityInWorld(var4);
		        ++this.rangedAttackCounter;
	        }
	        else if (this.rangedAttackCounter >= 12)
	        {
	        	ability = DEFAULT;
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


    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(VetheaItemHelper.arksianeLump.itemID, 25);
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