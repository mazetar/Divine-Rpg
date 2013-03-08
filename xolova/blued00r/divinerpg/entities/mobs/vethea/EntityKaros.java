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
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
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

public class EntityKaros extends EntityMob implements IBossDisplayData
{
	
	private static int ability;
	private final int DEFAULT = 0;
	private final int CEILING = 1;
	private final int CANNONS = 2;
	private final int FLOOR = 3;
	
	private int waitTick;
	private int abilityCoolDown;
	private int[][] cannonList = new int[36][3];
	private int[][] ceilingList = new int[47][3];
	private int targetY;
	
	private int rangedAttackCounter;
	
    public EntityKaros(World par1)
    {
        super(par1);
        this.texture = "/mob/Karos.png";
        this.moveSpeed = 0.25F;
        this.health = this.getMaxHealth();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
        this.isImmuneToFire = true;
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
    	
    	this.ceilingList[0] = new int[]{par2 + 13, par3 + 4, par4 + 4};
    	this.ceilingList[1] = new int[]{par2 + 13, par3 + 4, par4 + 5};
    	this.ceilingList[2] = new int[]{par2 + 13, par3 + 4, par4 + 6};
    	this.ceilingList[3] = new int[]{par2 + 14, par3 + 4, par4 + 4};
    	this.ceilingList[4] = new int[]{par2 + 14, par3 + 4, par4 + 5};
    	this.ceilingList[5] = new int[]{par2 + 14, par3 + 4, par4 + 6};
    	this.ceilingList[6] = new int[]{par2 + 15, par3 + 4, par4 + 4};
    	this.ceilingList[7] = new int[]{par2 + 15, par3 + 4, par4 + 5};
    	this.ceilingList[8] = new int[]{par2 + 15, par3 + 4, par4 + 6};
    	this.ceilingList[9] = new int[]{par2 + 13, par3 + 4, par4 + 14};
    	this.ceilingList[10] = new int[]{par2 + 13, par3 + 4, par4 + 15};
    	this.ceilingList[11] = new int[]{par2 + 13, par3 + 4, par4 + 16};
    	this.ceilingList[12] = new int[]{par2 + 14, par3 + 4, par4 + 14};
    	this.ceilingList[13] = new int[]{par2 + 14, par3 + 4, par4 + 15};
    	this.ceilingList[14] = new int[]{par2 + 14, par3 + 4, par4 + 16};
    	this.ceilingList[15] = new int[]{par2 + 15, par3 + 4, par4 + 14};
    	this.ceilingList[16] = new int[]{par2 + 15, par3 + 4, par4 + 15};
    	this.ceilingList[17] = new int[]{par2 + 15, par3 + 4, par4 + 16};
    	this.ceilingList[18] = new int[]{par2 + 18, par3 + 4, par4 + 9};
    	this.ceilingList[19] = new int[]{par2 + 18, par3 + 4, par4 + 10};
    	this.ceilingList[20] = new int[]{par2 + 18, par3 + 4, par4 + 11};
    	this.ceilingList[21] = new int[]{par2 + 19, par3 + 4, par4 + 9};
    	this.ceilingList[22] = new int[]{par2 + 19, par3 + 4, par4 + 10};
    	this.ceilingList[23] = new int[]{par2 + 19, par3 + 4, par4 + 11};
    	this.ceilingList[23] = new int[]{par2 + 20, par3 + 4, par4 + 9};
    	this.ceilingList[24] = new int[]{par2 + 20, par3 + 4, par4 + 10};
    	this.ceilingList[25] = new int[]{par2 + 20, par3 + 4, par4 + 11};
    	this.ceilingList[26] = new int[]{par2 + 22, par3 + 4, par4 + 12};
    	this.ceilingList[27] = new int[]{par2 + 22, par3 + 4, par4 + 13};
    	this.ceilingList[28] = new int[]{par2 + 22, par3 + 4, par4 + 14};
    	this.ceilingList[29] = new int[]{par2 + 23, par3 + 4, par4 + 12};
    	this.ceilingList[30] = new int[]{par2 + 23, par3 + 4, par4 + 13};
    	this.ceilingList[31] = new int[]{par2 + 23, par3 + 4, par4 + 14};
    	this.ceilingList[32] = new int[]{par2 + 24, par3 + 4, par4 + 12};
    	this.ceilingList[33] = new int[]{par2 + 24, par3 + 4, par4 + 13};
    	this.ceilingList[34] = new int[]{par2 + 24, par3 + 4, par4 + 14};
    	this.ceilingList[35] = new int[]{par2 + 23, par3 + 4, par4 + 4};
    	this.ceilingList[36] = new int[]{par2 + 23, par3 + 4, par4 + 5};
    	this.ceilingList[37] = new int[]{par2 + 23, par3 + 4, par4 + 6};
    	this.ceilingList[38] = new int[]{par2 + 24, par3 + 4, par4 + 4};
    	this.ceilingList[39] = new int[]{par2 + 24, par3 + 4, par4 + 5};
    	this.ceilingList[40] = new int[]{par2 + 24, par3 + 4, par4 + 6};
    	this.ceilingList[41] = new int[]{par2 + 25, par3 + 4, par4 + 4};
    	this.ceilingList[42] = new int[]{par2 + 25, par3 + 4, par4 + 5};
    	this.ceilingList[43] = new int[]{par2 + 25, par3 + 4, par4 + 6};
    	this.ceilingList[44] = new int[]{par2 + 24, par3 + 4, par4 + 12};
    	this.ceilingList[45] = new int[]{par2 + 24, par3 + 4, par4 + 13};
    	this.ceilingList[46] = new int[]{par2 + 24, par3 + 4, par4 + 14};
    	this.targetY = par3;
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
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }
        
        EntityPlayer var1 = (EntityPlayer) this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);
    	
    	if (this.ability == DEFAULT && this.abilityCoolDown == 0)
    	{
    		this.abilityCoolDown = 10;
    		switch(this.rand.nextInt(3))
    		{
    		case 0:
    			this.ability = CEILING;
    			this.rangedAttackCounter = 600;
    			this.moveSpeed = 0;
    			break;
    		case 1:
    			this.ability = CANNONS;
    			this.rangedAttackCounter = 600;
    			break;
    		case 2:
    			if (this.rand.nextInt(8) == 0)
    			{
        			this.ability = FLOOR;
        			this.rangedAttackCounter = 600;
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
    		this.abilityCoolDown = 10;
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
    	int var2;
    	if (this.rangedAttackCounter == 0)
    	{
    		this.ability = DEFAULT;
    	}
    	else if(this.ability == CEILING)
    	{
    		var2 = this.rand.nextInt(46);
    		if ((this.rangedAttackCounter % 4) == 0)
    		{
    			DivineRPG.helioticBeam.dispense(this.worldObj, ceilingList[var2][0], ceilingList[var2][1], ceilingList[var2][2]);
    		}
    		this.rangedAttackCounter--;
    	}
    	else if(this.ability == CANNONS)
    	{
    		var2 = this.rand.nextInt(36);
    		if ((this.rangedAttackCounter % 4) == 0)
    		{
        		DivineRPG.karosCannon.dispense(this.worldObj, cannonList[var2][0], cannonList[var2][1], cannonList[var2][2]);
    		}
    		this.rangedAttackCounter--;
    	}
    	else if(this.ability == FLOOR)
    	{
			for (int i = 0; i < 10; i++)
			{
				double var4 = 0;
				while (var4 < 2 * Math.PI)
				{
					int var1 = (int) Math.round(Math.sin(var4)*i);
					int var3 = (int) Math.round(Math.cos(var4)*i);
					if (this.worldObj.getBlockId((int)this.posX + var1, this.targetY, (int)this.posZ + var3) == DivineRPG.karosHeatTileGreen.blockID)
					{
						this.worldObj.setBlock((int)this.posX + var1, this.targetY, (int)this.posZ + var3, DivineRPG.karosHeatTileRed.blockID);
					}
					var4 += Math.PI / 8.0D;
				}
			}
			this.ability = DEFAULT;
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
    public boolean attackEntityFrom(DamageSource par1, int par2)
    {
    	if (par1 == DamageSource.explosion || par1 == DamageSource.explosion2)
    	{
    		return false;
    	}
    	return super.attackEntityFrom(par1, par2);
    }
}