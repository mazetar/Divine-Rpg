package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.overworld.projectile.EntityWatcherShot;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityNetherWatcher extends EntityFlying implements IMob, IBossDisplayData
{
    public int courseChangeCooldown = 0;
    public double waypointX;
    public double waypointY;
    public double waypointZ;
    private Entity targetedEntity = null;
    private int aggroCooldown = 0;
    public int prevAttackCounter = 0;
    public int attackCounter = 0;

    public EntityNetherWatcher(World var1)
    {
        super(var1);
        this.texture = "/mob/watcherTexture.png";
        this.setSize(4.0F, 4.0F);
        this.isImmuneToFire = true;
        this.experienceValue = 5000;
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "The Watcher";
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        return super.attackEntityFrom(var1, var2);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
    }

    public int getMaxHealth()
    {
        return 3400;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
    }

    protected void updateEntityActionState()
    {
        this.despawnEntity();
        this.prevAttackCounter = this.attackCounter;
        double var1 = this.waypointX - this.posX;
        double var3 = this.waypointY - this.posY;
        double var5 = this.waypointZ - this.posZ;
        double var7 = (double)MathHelper.sqrt_double(var1 * var1 + var3 * var3 + var5 * var5);

        if (var7 < 1.0D || var7 > 60.0D)
        {
            this.waypointX = this.posX + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
            this.waypointY = this.posY + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
            this.waypointZ = this.posZ + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
        }

        if (this.courseChangeCooldown-- <= 0)
        {
            this.courseChangeCooldown += this.rand.nextInt(5) + 2;

            if (this.isCourseTraversable(this.waypointX, this.waypointY, this.waypointZ, var7))
            {
                this.motionX += var1 / var7 * 0.1D;
                this.motionY += var3 / var7 * 0.1D;
                this.motionZ += var5 / var7 * 0.1D;
            }
            else
            {
                this.waypointX = this.posX;
                this.waypointY = this.posY;
                this.waypointZ = this.posZ;
            }
        }

        if (this.targetedEntity != null && this.targetedEntity.isDead)
        {
            this.targetedEntity = null;
        }

        if (this.targetedEntity == null || this.aggroCooldown-- <= 0)
        {
            this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0D);

            if (this.targetedEntity != null)
            {
                this.aggroCooldown = 20;
            }
        }

        double var9 = 100.0D;

        if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity(this) < var9 * var9)
        {
            double var11 = this.targetedEntity.posX - this.posX;
            double var13 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
            double var15 = this.targetedEntity.posZ - this.posZ;
            this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(var11, var15)) * 180.0F / (float)Math.PI;

            if (this.canEntityBeSeen(this.targetedEntity))
            {
                if (this.attackCounter == 20)
                {
                    this.worldObj.playSoundAtEntity(this, "mob.RPG.roar", 10.0F, 0.9F);
                }

                ++this.attackCounter;

                if (this.attackCounter == 20)
                {
                    EntityWatcherShot var17 = new EntityWatcherShot(this.worldObj, this);
                    this.worldObj.spawnEntityInWorld(var17);
                    this.attackCounter = -40;
                }
            }
            else if (this.attackCounter > 0)
            {
                --this.attackCounter;
            }
        }
        else
        {
            this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI;

            if (this.attackCounter > 0)
            {
                --this.attackCounter;
            }
        }
    }

    private boolean isCourseTraversable(double var1, double var3, double var5, double var7)
    {
        double var9 = (this.waypointX - this.posX) / var7;
        double var11 = (this.waypointY - this.posY) / var7;
        double var13 = (this.waypointZ - this.posZ) / var7;
        AxisAlignedBB var15 = this.boundingBox.copy();

        for (int var16 = 1; (double)var16 < var7; ++var16)
        {
            var15.offset(var9, var11, var13);

            if (this.worldObj.getCollidingBoundingBoxes(this, var15).size() > 0)
            {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.roar";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.roar";
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.rand.nextInt(20) == 0 && super.getCanSpawnHere() && this.worldObj.difficultySetting > 0;
    }

    /**
     * Will return how many at most can spawn in a chunk at once.
     */
    public int getMaxSpawnedInChunk()
    {
        return 1;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return OverworldItemHelper.netheriteBar.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(OverworldItemHelper.netheriteBar.itemID, 100);
        int var3 = this.rand.nextInt(4);
        this.dropItem(OverworldItemHelper.blueFireStone.itemID, 1);

        for (int var4 = 0; var4 < 3 + var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.divineShard.itemID, 1);
        }
		
		if (this.rand.nextInt(3) == 0)
		{
			this.dropItem(OverworldBlockHelper.watcherStatue.blockID, 1);
		}
    }

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }
}
