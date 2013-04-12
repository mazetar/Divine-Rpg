package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.village.Village;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityAncient extends EntityMob
{
	private int field_48119_b = 0;
	Village villageObj = null;
	private int field_48120_c;
	private int field_48118_d;

	public EntityAncient(World var1)
	{
		super(var1);
		this.texture = "/mob/ancientEntity.png";
		this.setSize(4.0F, 9.0F);
		this.isImmuneToFire = true;
		this.moveSpeed = 0.5F;
	}

	/**
	 * Gets the username of the entity.
	 */
	public String getEntityName()
	{
		return "The Ancient Entity";
	}

	public int getDragonHealth()
	{
		return getHealth();
	}

	protected void entityInit()
	{
		super.entityInit();
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	public int getAttackStrength(Entity var1)
	{
		return 16;
	}
	
    /**
     * Called when the entity is attacked.
     */
    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
    	super.attackEntityAsMob(par1Entity);
    	
        if (this.entityToAttack != null)
        {
            this.entityToAttack.addVelocity((double)(this.motionX * 10.0D), 3.0D, (double)(this.motionZ * 10.0D));
            if(this.entityToAttack instanceof EntityLiving)
            {
            	((EntityLiving)this.entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5 * 20, 0));
            }
            return true;
        }
        
        return false;
    }

	public int getMaxHealth()
	{
		return 4000;
	}

	/**
	 * Decrements the entity's air supply when underwater
	 */
	protected int decreaseAirSupply(int var1)
	{
		return var1;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return "none";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.irongolem.hit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.irongolem.death";
	}

	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean var1, int var2)
	{
		int var4 = 1;
		int var5;

		for (var5 = 0; var5 < var4; ++var5)
		{
			this.dropItem(OverworldItemHelper.sandSlash.itemID, 1);
		}

		var4 = 3 + this.rand.nextInt(4);

		for (var5 = 0; var5 < var4; ++var5)
		{
			this.dropItem(OverworldItemHelper.divineShard.itemID, 1);
		}
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(OverworldBlockHelper.aeStatue.blockID, 1);
		}
	}

    /**
     * knocks back this entity
     */
    public void knockBack(Entity par1Entity, int par2, double par3, double par5)
    {
    }
}
