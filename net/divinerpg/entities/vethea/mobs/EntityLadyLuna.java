package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityLadyLuna extends EntityDivineMob implements IBossDisplayData
{
    private int waitTick;
	private int protType;
	private int protTimer;
	private int deathTicks;
	

	public EntityLadyLuna(World var1)
    {
        super(var1, 0.5F, 8000, 20, 128.0F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.getMoveSpeed(), false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.getMoveSpeed()));
        this.tasks.addTask(6, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.protTimer = 500;
        this.protType = 0;
        this.setSize(1.25F, 3.9F);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
    protected void updateAITasks()
    {

    	if (this.getAttackTarget() != null && this.getDistanceToEntity(this.getAttackTarget()) < 0.5)
    	{
    		this.waitTick = 60;
    	}
    	else if (this.waitTick == 0)
    	{
        	super.updateAITasks();
    	}
    	else
    	{
    		--this.waitTick;
    	}
    }



    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Lady Luna";
    }

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.posZ);

        for (var1 = 0; var1 < 4; ++var1)
        {
            var2 = MathHelper.floor_double(this.posX + (double)((float)(var1 % 2 * 2 - 1) * 0.25F));
            int var3 = MathHelper.floor_double(this.posY);
            int var4 = MathHelper.floor_double(this.posZ + (double)((float)(var1 / 2 % 2 * 2 - 1) * 0.25F));

            if (this.worldObj.getBlockId(var2, var3, var4) == 0 && Block.snow.canPlaceBlockAt(this.worldObj, var2, var3, var4))
            {
                this.worldObj.setBlock(var2, var3, var4, VetheaBlockHelper.lunicAcid.blockID);
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, func_110143_aJ());
        }
        
        if (this.protTimer == 0)
        {
        	this.protType = this.rand.nextInt(3) + 1;
        	this.protTimer = 200 + this.rand.nextInt(200);
        }
        else if (this.protTimer > 0)
        {
        	this.protTimer--;
        }
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
    	switch(this.rand.nextInt(3))
    	{
    	case 0:
    		return "mob.RPG.LadyLuna1";
    	case 1:
    		return "mob.RPG.LadyLuna2";
    	case 2:
    		return "mob.RPG.LadyLuna3";
    	default:
    		return null;
    	}
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.LadyLunaHit";
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
    
    public int getProtectionType()
    {
    	return this.protType;
    }
    
    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
    	if (par1DamageSource.isMagicDamage() && this.getProtectionType() == 1)
    	{
    		return false;
    	}
    	else if ((par1DamageSource.isProjectile() || par1DamageSource.damageType.equals("thrown")) && this.getProtectionType() ==2)
    	{
    		return false;
    	}
    	else if (!par1DamageSource.isProjectile() && !par1DamageSource.isMagicDamage() && this.getProtectionType() == 3)
    	{
    		return false;
    	}
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
            ((EntityLiving) par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 16 * 5, 1));
        }

        boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

        if (var4)
        {
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
    	switch(this.rand.nextInt(5))
    	{
    	case 0:
        	this.dropItem(VetheaItemHelper.everbright.itemID, 1);
        	this.dropItem(VetheaItemHelper.everArrow.itemID, 128);
        	break;
    	case 1:
        	this.dropItem(VetheaItemHelper.everfight.itemID, 1);
        	break;
    	case 2:
        	this.dropItem(VetheaItemHelper.evernight.itemID, 1);
        	break;
    	case 3:
        	this.dropItem(VetheaItemHelper.everlight.itemID, 1);
        	break;
    	case 4:
        	this.dropItem(VetheaItemHelper.evernight.itemID, 1);
        	break;
    	}
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