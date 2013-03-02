package xolova.blued00r.divinerpg.entities.mobs.arcana;

import java.util.Calendar;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.ai.EntityAIParatikuFollowOwner;
import xolova.blued00r.divinerpg.entities.ai.EntityAIParatikuOwnerHurtByTarget;
import xolova.blued00r.divinerpg.entities.ai.EntityAIParatikuOwnerHurtTarget;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWraith extends EntityParatiku
{
	private int age;
    private ChunkCoordinates currentFlightTarget;
    
    public EntityWraith(World par1World, EntityPlayer owner)
    {
        super(par1World);
        this.age = 120;
        this.setTamed(true);
        this.setOwner(owner.username);
    }
    
    public EntityWraith(World par1World)
    {
        super(par1World);
        this.age = 120;
    }

    /**
    * Gets the username of the entity.
    */
    public String getEntityName()
    {
        return "Wraith Minion";
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        return "/mob/wraith.png";
    }

    public int getAttackStrength(Entity var1)
    {
        return 13;
    }

    public int getMaxHealth()
    {
        return 20;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.1F;
    }

    /**
     * Gets the pitch of living sounds in living entities.
     */
    protected float getSoundPitch()
    {
        return super.getSoundPitch() * 0.95F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return this.getIsBatHanging() && this.rand.nextInt(4) != 0 ? null : "mob.RPG.Wraith";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.WraithHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.WraithHit";
    }

    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    public boolean canBePushed()
    {
        return false;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (this.getIsBatHanging())
        {
            this.motionX = this.motionY = this.motionZ = 0.0D;
            this.posY = (double)MathHelper.floor_double(this.posY) + 1.0D - (double)this.height;
        }
        else
        {
            this.motionY *= 0.6000000238418579D;
        }
        
        this.age--;
        if (this.age == 0)
        {
        	this.setDead();
        }
    }

    protected void updateAITasks()
    {
        super.updateAITasks();

        if (this.getAttackTarget() != null)
        {
            int var1 = (int) this.getAttackTarget().posX;
            int var2 = (int) this.getAttackTarget().posY;
            int var3 = (int) this.getAttackTarget().posZ;
            this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
        }
        else if (this.getOwner() != null)
        {
            this.currentFlightTarget = this.worldObj.getPlayerEntityByName(this.getOwnerName()).getPlayerCoordinates();
        }

        if (this.getIsBatHanging())
        {
            if (!this.worldObj.isBlockNormalCube(MathHelper.floor_double(this.posX), (int)this.posY + 1, MathHelper.floor_double(this.posZ)))
            {
                this.setIsBatHanging(false);
                this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
            }
            else
            {
                if (this.rand.nextInt(200) == 0)
                {
                    this.rotationYawHead = (float)this.rand.nextInt(360);
                }

                if (this.worldObj.getClosestPlayerToEntity(this, 4.0D) != null)
                {
                    this.setIsBatHanging(false);
                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
                }
            }
        }
        else
        {
            if (this.currentFlightTarget != null)
            {
                double var1 = (double)this.currentFlightTarget.posX - this.posX;
                double var3 = (double)this.currentFlightTarget.posY - this.posY;
                double var5 = (double)this.currentFlightTarget.posZ - this.posZ;

                if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
                {
                    this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.10000000149011612D;
                    this.motionY += (Math.signum(var3) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
                    this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.10000000149011612D;
                    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
                    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
                    this.moveForward = 0.5F;
                    this.rotationYaw += var8;
                }
            }
        }
    }
}