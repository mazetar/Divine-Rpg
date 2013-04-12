package xolova.divinerpg.entities.overworld.mobs;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityWhale extends EntityWaterMob
{
    private int angerLevel = 0;
    private int randomSoundDelay = 5;
    public float field_70861_d = 0.0F;
    public float field_70862_e = 0.0F;
    public float field_70859_f = 0.0F;
    public float field_70860_g = 0.0F;
    public float field_70867_h = 0.0F;
    public float field_70868_i = 0.0F;
    public float tentacleAngle = 0.0F;
    public float lastTentacleAngle = 0.0F;
    private float randomMotionSpeed = 0.0F;
    private float field_70864_bA = 0.0F;
    private float field_70871_bB = 0.0F;
    private float randomMotionVecX = 0.0F;
    private float randomMotionVecY = 0.0F;
    private float randomMotionVecZ = 0.0F;

    public EntityWhale(World var1)
    {
        super(var1);
        this.texture = "/mob/whale.png";
        this.moveSpeed = 0.3F;
        this.setSize(2.0F, 3.0F);
        this.field_70864_bA = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
    }

    public int getAttackStrength(Entity var1)
    {
        return 20;
    }

    public int getMaxHealth()
    {
        return 800;
    }

    public boolean canBreatheUnderwater()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.whale";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.whalehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.whalehurt";
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(3 + var2) + 1;

        for (int var4 = 0; var4 < var3; ++var4)
        {
            this.entityDropItem(new ItemStack(OverworldItemHelper.whaleFin), 0.0F);
        }
    }

    /**
     * Gets called every tick from main Entity class
     */
    public void onEntityUpdate()
    {
    	super.onEntityUpdate();
    	this.setAir(300);
    }

    /**
     * Checks if this entity is inside water (if inWater field is true as a result of handleWaterMovement() returning
     * true)
     */
    public boolean isInWater()
    {
        return this.worldObj.handleMaterialAcceleration(this.boundingBox.expand(0.0D, -0.6000000238418579D, 0.0D), Material.water, this);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setShort("Anger", (short)this.angerLevel);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.angerLevel = var1.getShort("Anger");
    }

    /**
     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
     * (Animals, Spiders at day, peaceful PigZombies).
     */
    protected Entity findPlayerToAttack()
    {
        return this.angerLevel == 0 ? null : super.findPlayerToAttack();
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1) {}

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        Entity var3 = var1.getEntity();

        if (var3 instanceof EntityPlayer)
        {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

            for (int var5 = 0; var5 < var4.size(); ++var5)
            {
                Entity var6 = (Entity)var4.get(var5);

                if (var6 instanceof EntityWhale)
                {
                	((EntityWhale) var6).becomeAngryAt(var3);
                }
            }

            this.becomeAngryAt(var3);
        }

        return super.attackEntityFrom(var1, var2);
    }

    private void becomeAngryAt(Entity var1)
    {
        this.entityToAttack = var1;
        this.angerLevel = 1;
        this.randomSoundDelay = this.rand.nextInt(40);
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.boundingBox.minY);
        int var3 = MathHelper.floor_double(this.posZ);
        return this.worldObj.getBlockId(var1, var2 - 1, var3) == Block.waterStill.blockID && this.worldObj.getFullBlockLightValue(var1, var2, var3) > 8 && super.getCanSpawnHere();
    }
    
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
    {
    	par1EntityPlayer.attackEntityFrom(DamageSource.causeMobDamage(par1EntityPlayer), this.getAttackStrength(par1EntityPlayer));
    }
}
