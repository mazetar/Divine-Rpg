package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;
import xolova.divinerpg.entities.overworld.projectile.EntityCaveRock;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityCaveclops extends EntityMob implements IRangedAttackMob
{
    public EntityCaveclops(World par1World)
    {
        super(par1World);
        this.texture = "/mob/Caveclops.png";
        this.tasks.addTask(1, new EntityAIArrowAttack(this, 0.25F, 30, 10.0F));
        this.tasks.addTask(2, new EntityAIWander(this, 0.2F));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayerMP.class, 16.0F, 0, true, false));
        this.setSize(1.0F, 2.9F);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    public int getMaxHealth()
    {
        return 80;
    }

    @Override
    public int getAttackStrength(Entity entity)
    {
		if (!this.worldObj.isRemote && this.worldObj.difficultySetting > 0)
		{
        return 12;
		}
		return 12;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Cyclops";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.CyclopsHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.CyclopsHit";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Block.cobblestone.blockID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.realmiteIngot.itemID, 3);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Item.pickaxeGold.itemID, 1);
        }
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 20.0D && super.getCanSpawnHere();
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLiving var1, float f)
    {
        EntityCaveRock var2 = new EntityCaveRock(this.worldObj, this);
        double var3 = var1.posX - this.posX;
        double var5 = var1.posY + (double)var1.getEyeHeight() - 1.100000023841858D - var2.posY;
        double var7 = var1.posZ - this.posZ;
        float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
        var2.setThrowableHeading(var3, var5 + (double)var9, var7, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }
}
