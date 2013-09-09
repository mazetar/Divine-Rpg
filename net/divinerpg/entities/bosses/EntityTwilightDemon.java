package net.divinerpg.entities.bosses;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityTwilightDemon extends EntityZombie implements IBossDisplayData
{
    public EntityTwilightDemon(World var1)
    {
        super(var1);
        this.setSize(2.0F, 4.0F);
    }
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(6000);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(45);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.8F);
    }
    
    public int getMaxHealth()
    {
        return (int) this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111126_e();
    }
    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Twilight Demon";
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
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    { 
        return 10; //TODO fix armor
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, func_110143_aJ());
        }

        super.onLivingUpdate();
    }

    public boolean attackEntityAsMob(Entity var1)
    {
        if (super.attackEntityAsMob(var1))
        {
            if (var1 instanceof EntityLiving)
            {
                byte var2 = 0;

                if (this.worldObj.difficultySetting > 1)
                {
                    if (this.worldObj.difficultySetting == 2)
                    {
                        var2 = 12;
                    }
                    else if (this.worldObj.difficultySetting == 3)
                    {
                        var2 = 21;
                    }
                }

                if (var2 > 0)
                {
                    ((EntityLiving)var1).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 50));
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Insect";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.zombiehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.zombiedeath";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        switch(this.rand.nextInt(2))
        {
        case 0:
        	return TwilightItemHelper.HaliteBow.itemID;
        case 1:
        	return TwilightItemHelper.HaliteBlitz.itemID;
        }
        return 0;
    }

    public void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(this.getDropItemId(), 1);
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(TwilightBlockHelper.TDStatue.blockID, 1);
		}
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
}
