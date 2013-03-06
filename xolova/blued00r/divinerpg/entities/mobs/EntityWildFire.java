package xolova.blued00r.divinerpg.entities.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityWildFire extends EntityMob implements IRangedAttackMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(DivineRPG.infernoBow, 1);

    public EntityWildFire(World par1World)
    {
        super(par1World);
        this.texture = "/mob/wildfire.png";
        this.moveSpeed = 0.25F;
        this.tasks.addTask(7, new EntityAIArrowAttack(this, 0.25F, 15, 10.0F));        
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIRestrictSun(this));
        this.tasks.addTask(3, new EntityAIFleeSun(this, this.moveSpeed));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
        this.isImmuneToFire = true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Wildfire";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.WildfireHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    @Override
    public int getMaxHealth()
    {
        return 100;
    }

    @Override
    public int getAttackStrength(Entity entity)
    {
		if (!this.worldObj.isRemote && this.worldObj.difficultySetting > 0)
		{
			return 13;
		}
        return 13;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.redShard.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(DivineRPG.redShard.itemID, 4);
    }

    protected void dropRareDrop(int var1)
    {
        if (this.rand.nextInt(5) == 0)
        {
            this.dropItem(DivineRPG.netheriteBar.itemID, 1);
        }
        else
        {
        	this.dropItem(DivineRPG.netheriteBar.itemID, 40);
        }
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLiving var1)
    {
        EntityArrow var2 = new EntityArrow(this.worldObj, this, var1, 1.6F, 12.0F);
        
        var2.setDamage(8);
        var2.setFire(100);

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }
}