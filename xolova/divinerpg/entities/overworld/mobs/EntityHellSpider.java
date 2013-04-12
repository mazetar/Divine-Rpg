package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityHellSpider extends EntityMob
{
    public EntityHellSpider(World var1)
    {
        super(var1);
        this.texture = "/mob/hellspider.png";
        this.setSize(1.4F, 0.9F);
        this.moveSpeed = 0.8F;
        this.isImmuneToFire = true;
    }

    public int getAttackStrength(Entity var1)
    {
        return 16;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (!this.worldObj.isRemote)
        {
            this.setBesideClimbableBlock(this.isCollidedHorizontally);
        }

        if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.drown, 1);
        }
    }

    public int getMaxHealth()
    {
        return 120;
    }

    /**
     * Returns the Y offset from the entity's position for any entity riding this one.
     */
    public double getMountedYOffset()
    {
        return (double)this.height * 0.75D - 0.5D;
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
     * (Animals, Spiders at day, peaceful PigZombies).
     */
    protected Entity findPlayerToAttack()
    {
        float var1 = this.getBrightness(1.0F);

        if (var1 < 1.0F)
        {
            double var2 = 16.0D;
            return this.worldObj.getClosestVulnerablePlayerToEntity(this, var2);
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Hellspider";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.spider";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.spiderdeath";
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity var1, float var2)
    {
        if (var2 > 2.0F && var2 < 6.0F && this.rand.nextInt(10) == 0)
        {
            if (this.onGround)
            {
                double var3 = var1.posX - this.posX;
                double var5 = var1.posZ - this.posZ;
                float var7 = MathHelper.sqrt_double(var3 * var3 + var5 * var5);
                this.motionX = var3 / (double)var7 * 0.5D * 0.800000011920929D + this.motionX * 0.20000000298023224D;
                this.motionZ = var5 / (double)var7 * 0.5D * 0.800000011920929D + this.motionZ * 0.20000000298023224D;
                this.motionY = 0.4000000059604645D;
            }
        }
        else
        {
            super.attackEntity(var1, var2);
        }
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
            
            par1Entity.setFire(3);

            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                par1Entity.setFire(var5 * 4);
            }
        }

        return var4;
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Block.netherrack.blockID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(2 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Block.netherrack.blockID, 10);
        }

        var3 = this.rand.nextInt(2 + var2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.moltenShard.itemID, 1);
        }
    }

    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    public boolean isOnLadder()
    {
        return this.isBesideClimbableBlock();
    }

    /**
     * Sets the Entity inside a web block.
     */
    public void setInWeb() {}

    public float spiderScaleAmount()
    {
        return 1.0F;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }

    public boolean isBesideClimbableBlock()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean var1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (var1)
        {
            var2 = (byte)(var2 | 1);
        }
        else
        {
            var2 &= -2;
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(var2));
    }
}
