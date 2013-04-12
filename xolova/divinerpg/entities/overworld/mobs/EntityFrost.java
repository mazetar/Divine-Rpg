package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.overworld.projectile.EntityBlueFireBall;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityFrost extends EntityMob
{
    /** Random offset used in floating behaviour */
    private float heightOffset = 0.5F;

    /** ticks until heightOffset is randomized */
    private int heightOffsetUpdateTime;
    private int field_70846_g;

    public EntityFrost(World var1)
    {
        super(var1);
        this.texture = "/mob/frost.png";
        this.experienceValue = 20;
    }

    public int getAttackStrength(Entity var1)
    {
        return 10;
    }

    public int getMaxHealth()
    {
        return 80;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Frost";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.blaze.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.blaze.death";
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (!this.worldObj.isRemote)
        {
            if (this.isWet())
            {
                this.attackEntityFrom(DamageSource.drown, 1);
            }

            --this.heightOffsetUpdateTime;

            if (this.heightOffsetUpdateTime <= 0)
            {
                this.heightOffsetUpdateTime = 100;
                this.heightOffset = 0.5F + (float)this.rand.nextGaussian() * 3.0F;
            }

            if (this.getEntityToAttack() != null && this.getEntityToAttack().posY + (double)this.getEntityToAttack().getEyeHeight() > this.posY + (double)this.getEyeHeight() + (double)this.heightOffset)
            {
                this.motionY += (0.30000001192092896D - this.motionY) * 0.30000001192092896D;
            }
        }

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        super.onLivingUpdate();
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity par1Entity, float par2)
    {
        if (this.attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY)
        {
            this.attackTime = 20;
            this.attackEntityAsMob(par1Entity);
        }
        else if (par2 < 30.0F)
        {
            double var3 = par1Entity.posX - this.posX;
            double var5 = par1Entity.boundingBox.minY + (double)(par1Entity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
            double var7 = par1Entity.posZ - this.posZ;

            if (this.attackTime == 0)
            {
                ++this.field_70846_g;

                if (this.field_70846_g == 1)
                {
                    this.attackTime = 60;
                }
                else if (this.field_70846_g <= 4)
                {
                    this.attackTime = 6;
                }
                else
                {
                    this.attackTime = 100;
                    this.field_70846_g = 0;
                    this.func_70844_e(false);
                }

                if (this.field_70846_g > 1)
                {
                    float var9 = MathHelper.sqrt_float(par2) * 0.5F;
                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);

                    for (int var10 = 0; var10 < 1; ++var10)
                    {
                        EntityBlueFireBall var11 = new EntityBlueFireBall(this.worldObj, this, var3 + this.rand.nextGaussian() * (double)var9, var5, var7 + this.rand.nextGaussian() * (double)var9);
                        var11.posY = this.posY + (double)(this.height / 2.0F) + 1.5D;
                        this.worldObj.spawnEntityInWorld(var11);
                    }
                }
            }

            this.rotationYaw = (float)(Math.atan2(var7, var3) * 180.0D / Math.PI) - 90.0F;
            this.hasAttacked = true;
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float par1) {}


    /**
     * Returns true if the entity is on fire. Used by render to add the fire effect on rendering.
     */
    public boolean isBurning()
    {
        return this.func_70845_n();
    }
    
    protected int getDropItemId()
    {
        return Block.ice.blockID;
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
            this.dropItem(OverworldItemHelper.tomato.itemID, 2);
        }

        var3 = this.rand.nextInt(2 + var2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.iceShard.itemID, 5);
        }

        var3 = this.rand.nextInt(2 + var2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.iceStone.itemID, 1);
        }
    }

    public boolean func_70845_n()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void func_70844_e(boolean par1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (par1)
        {
            var2 = (byte)(var2 | 1);
        }
        else
        {
            var2 &= -2;
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(var2));
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }
}