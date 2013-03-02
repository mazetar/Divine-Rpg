package xolova.blued00r.divinerpg.entities.mobs;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityKingCrab extends EntityMob
{
    private int angerLevel = 0;
    private int randomSoundDelay = 5;

    public EntityKingCrab(World var1)
    {
        super(var1);
        this.texture = "/mob/crab.png";
        this.moveSpeed = 0.4F;
        this.setSize(2.0F, 2.0F);
        this.experienceValue = 40;
    }

    public int getAttackStrength(Entity var1)
    {
        return 29;
    }

    public int getMaxHealth()
    {
        return 500;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return false;
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
        this.moveSpeed = this.entityToAttack != null ? 0.95F : 0.5F;
        super.onUpdate();
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.worldObj.difficultySetting > 0 && this.worldObj.checkIfAABBIsClear(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).size() == 0 && !this.worldObj.isAnyLiquid(this.boundingBox);
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

                if (var6 instanceof EntityCrab)
                {
                	EntityCrab var7 = (EntityCrab)var6;
                }else if (var6 instanceof EntityKingCrab)
                {
                	EntityKingCrab var7 = (EntityKingCrab)var6;
                }
            }

            this.becomeAngryAt(var3);
        }

        return super.attackEntityFrom(var1, var2);
    }

    private void becomeAngryAt(Entity var1)
    {
        this.entityToAttack = var1;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.crab";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.crabhurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.crabhurt";
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
            this.dropItem(DivineRPG.crabClaw.itemID, 1);
        }

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(DivineRPG.aquaticPellets.itemID, 3);
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.crabClaw.itemID;
    }
}
