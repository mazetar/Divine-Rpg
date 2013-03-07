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
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityKaros extends EntityMob implements IRangedAttackMob, IBossDisplayData
{
	
	private static int ability;
	private final int DEFAULT = 0;
	private final int CEILING = 1;
	private final int CANNONS = 2;
	private final int FLOOR = 3;
	
	private int waitTick;
	private int abilityCoolDown;
	private int[][] cannonList = new int[36][3];
	private int[][] ceilingList = new int[36][3];
	
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
    
    public EntityKaros(World par1, int par2, int par3, int par4)
    {
    	this(par1);
    	this.cannonList[0] = new int[]{par2 + 10, par3 + 2, par4 + 3};
    	this.cannonList[1] = new int[]{par2 + 10, par3 + 2, par4 + 5};
    	this.cannonList[2] = new int[]{par2 + 10, par3 + 2, par4 + 7};
    	this.cannonList[3] = new int[]{par2 + 10, par3 + 2, par4 + 12};
    	this.cannonList[4] = new int[]{par2 + 10, par3 + 2, par4 + 14};
    	this.cannonList[5] = new int[]{par2 + 10, par3 + 2, par4 + 16};
    	this.cannonList[6] = new int[]{par2 + 12, par3 + 2, par4 + 1};
    	this.cannonList[7] = new int[]{par2 + 12, par3 + 2, par4 + 18};
    	this.cannonList[8] = new int[]{par2 + 14, par3 + 2, par4 + 1};
    	this.cannonList[9] = new int[]{par2 + 14, par3 + 2, par4 + 18};
    	this.cannonList[10] = new int[]{par2 + 16, par3 + 2, par4 + 1};
    	this.cannonList[11] = new int[]{par2 + 16, par3 + 2, par4 + 18};
    	this.cannonList[12] = new int[]{par2 + 18, par3 + 2, par4 + 1};
    	this.cannonList[13] = new int[]{par2 + 18, par3 + 2, par4 + 18};
    	this.cannonList[14] = new int[]{par2 + 20, par3 + 2, par4 + 1};
    	this.cannonList[15] = new int[]{par2 + 20, par3 + 2, par4 + 18};
    	this.cannonList[16] = new int[]{par2 + 20, par3 + 2, par4 + 1};
    	this.cannonList[17] = new int[]{par2 + 20, par3 + 2, par4 + 18};
    	this.cannonList[18] = new int[]{par2 + 24, par3 + 2, par4 + 1};
    	this.cannonList[19] = new int[]{par2 + 24, par3 + 2, par4 + 18};
    	this.cannonList[20] = new int[]{par2 + 26, par3 + 2, par4 + 1};
    	this.cannonList[21] = new int[]{par2 + 26, par3 + 2, par4 + 18};
    	this.cannonList[22] = new int[]{par2 + 28, par3 + 2, par4 + 1};
    	this.cannonList[23] = new int[]{par2 + 28, par3 + 2, par4 + 18};
    	this.cannonList[24] = new int[]{par2 + 28, par3 + 3, par4 + 9};
    	this.cannonList[25] = new int[]{par2 + 28, par3 + 3, par4 + 10};
    	this.cannonList[26] = new int[]{par2 + 29, par3 + 2, par4 + 2};
    	this.cannonList[27] = new int[]{par2 + 29, par3 + 2, par4 + 4};
    	this.cannonList[28] = new int[]{par2 + 29, par3 + 2, par4 + 6};
    	this.cannonList[29] = new int[]{par2 + 29, par3 + 2, par4 + 8};
    	this.cannonList[30] = new int[]{par2 + 29, par3 + 2, par4 + 9};
    	this.cannonList[31] = new int[]{par2 + 29, par3 + 2, par4 + 10};
    	this.cannonList[32] = new int[]{par2 + 29, par3 + 2, par4 + 11};
    	this.cannonList[33] = new int[]{par2 + 29, par3 + 2, par4 + 13};
    	this.cannonList[34] = new int[]{par2 + 29, par3 + 2, par4 + 15};
    	this.cannonList[35] = new int[]{par2 + 29, par3 + 2, par4 + 17};
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
    		if (this.rangedAttackCounter == 100)
    		{
    			this.ability = DEFAULT;
    			this.rangedAttackCounter = 0;
    		}
    	}
    	else if(this.ability == CANNONS)
    	{
    		for (int i = 0; i < cannonList.length; i++)
    		{
    			DivineRPG.karosCannon.dispense(this.worldObj, cannonList[i][0], cannonList[i][1], cannonList[i][2]);
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


	@Override
	public void attackEntityWithRangedAttack(EntityLiving par1) 
	{
		switch(this.ability)
		{
		case CANNONS:
			this.worldObj.spawnEntityInWorld(new EntityLightningBolt(this.worldObj, (double)par1.lastTickPosX, (double)par1.lastTickPosY, (double)par1.lastTickPosZ));
			this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
			this.rangedAttackCounter++;
			if (this.rangedAttackCounter == 10)
			{
				this.ability = DEFAULT;
			}
	        break;
		case CEILING:
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