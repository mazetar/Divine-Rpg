package net.divinerpg.entities.arcana.mobs;

import java.util.Calendar;

import net.divinerpg.entities.ai.EntityAIParatikuFollowOwner;
import net.divinerpg.entities.ai.EntityAIParatikuOwnerHurtByTarget;
import net.divinerpg.entities.ai.EntityAIParatikuOwnerHurtTarget;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityParatiku extends EntityTameable
{
    private ChunkCoordinates currentFlightTarget;
    public EntityParatiku(World par1World)
    {
        super(par1World);
        this.setSize(0.9F, 0.9F);
        this.setIsBatHanging(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIParatikuFollowOwner(this, (float) this.getMoveSpeed(), 10.0F, 2.0F));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.getMoveSpeed(), true));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIParatikuOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIParatikuOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
    }
    
    public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
    }
    
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(60);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(9);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(64.0F);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3F);
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    public void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(17, "");
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    /**
    * Gets the username of the entity.
    */
    public String getEntityName()
    {
        return "Paratiku";
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int var2 =  (int) this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();

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

            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                par1Entity.setFire(var5 * 4);
            }
        }

        return var4;
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (var2 != null)
            {
                if (Item.itemsList[var2.itemID] instanceof ItemFood)
                {
                    ItemFood var3 = (ItemFood)Item.itemsList[var2.itemID];

                    if (var3.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 20)
                    {
                        if (!par1EntityPlayer.capabilities.isCreativeMode)
                        {
                            --var2.stackSize;
                        }

                        this.heal(var3.getHealAmount());

                        if (var2.stackSize <= 0)
                        {
                            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                        }

                        return true;
                    }
                }
            }
        }
        else
        {
            this.setTamed(true);
            this.setOwner(par1EntityPlayer.getEntityName());
        }

        return super.interact(par1EntityPlayer);
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);

        if (this.getOwnerName() == null)
        {
            par1NBTTagCompound.setString("Owner", "");
        }
        else
        {
            par1NBTTagCompound.setString("Owner", this.getOwnerName());
        }

        par1NBTTagCompound.setBoolean("Sitting", this.isSitting());
        par1NBTTagCompound.setByte("BatFlags", this.dataWatcher.getWatchableObjectByte(16));
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        String var2 = par1NBTTagCompound.getString("Owner");

        if (var2.length() > 0)
        {
            this.setOwner(var2);
            this.setTamed(true);
        }

        this.dataWatcher.updateObject(16, Byte.valueOf(par1NBTTagCompound.getByte("BatFlags")));
    }

    /**
     * Play the taming effect, will either be hearts or smoke depending on status
     */
    protected void playTameEffect(boolean par1)
    {
        String var2 = "heart";

        if (!par1)
        {
            var2 = "smoke";
        }

        for (int var3 = 0; var3 < 7; ++var3)
        {
            double var4 = this.rand.nextGaussian() * 0.02D;
            double var6 = this.rand.nextGaussian() * 0.02D;
            double var8 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(var2, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, var4, var6, var8);
        }
    }

    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte par1)
    {
        if (par1 == 7)
        {
            this.playTameEffect(true);
        }
        else if (par1 == 6)
        {
            this.playTameEffect(false);
        }
        else
        {
            super.handleHealthUpdate(par1);
        }
    }

    public boolean isTamed()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 4) != 0;
    }

    public void setTamed(boolean par1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (par1)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 4)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -5)));
        }
    }

    public boolean isSitting()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void setSitting(boolean par1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (par1)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 1)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -2)));
        }
    }

    public String getOwnerName()
    {
        return this.dataWatcher.getWatchableObjectString(17);
    }

    public void setOwner(String par1Str)
    {
        this.dataWatcher.updateObject(17, par1Str);
    }

    @Override
    public EntityLivingBase getOwner()
    {
        return this.worldObj.getPlayerEntityByName(this.getOwnerName());
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
        return this.getIsBatHanging() && this.rand.nextInt(4) != 0 ? null : "mob.bat.idle";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.bat.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.bat.death";
    }

    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    public boolean canBePushed()
    {
        return false;
    }

    protected void collideWithEntity(Entity par1Entity) {}

    protected void func_85033_bc() {}

    public boolean getIsBatHanging()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void setIsBatHanging(boolean par1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (par1)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 1)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -2)));
        }
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

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float par1) {}

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    protected void updateFallState(double par1, boolean par3) {}

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
        {
            if (this.isEntityInvulnerable())
            {
                return false;
            }
            else if (!this.worldObj.isRemote && this.getIsBatHanging())
            {
                this.setIsBatHanging(false);
            }

            return super.attackEntityFrom(par1DamageSource, par2);
        }
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        int var1 = MathHelper.floor_double(this.boundingBox.minY);

        if (var1 >= 63)
        {
            return false;
        }
        else
        {
            int var2 = MathHelper.floor_double(this.posX);
            int var3 = MathHelper.floor_double(this.posZ);
            int var4 = this.worldObj.getBlockLightValue(var2, var1, var3);
            byte var5 = 4;
            Calendar var6 = this.worldObj.getCurrentDate();

            if ((var6.get(2) + 1 != 10 || var6.get(5) < 20) && (var6.get(2) + 1 != 11 || var6.get(5) > 3))
            {
                if (this.rand.nextBoolean())
                {
                    return false;
                }
            }
            else
            {
                var5 = 7;
            }

            return var4 > this.rand.nextInt(var5) ? false : super.getCanSpawnHere();
        }
    }

    /**
     * Initialize this creature.
     */
    public void initCreature() {}

    @Override
    public EntityAgeable createChild(EntityAgeable entityageable) {
        // TODO Auto-generated method stub
        return null;
    }
}
