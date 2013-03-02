package xolova.blued00r.divinerpg.entities.mobs.vethea;

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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityKazroticShot;

public class EntityKazrotic extends EntityMob implements IRangedAttackMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(Item.bow, 1);

    public EntityKazrotic(World par1World)
    {
        super(par1World);
        this.texture = "/mob/aridwarrior.png";
        this.moveSpeed = 0.25F;
        this.tasks.addTask(7, new EntityAIArrowAttack(this, this.moveSpeed, 60, 64.0F));        
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIRestrictSun(this));
        this.tasks.addTask(3, new EntityAIFleeSun(this, this.moveSpeed));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.AridWarrior";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.AridWarriorHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.AridWarriorHit";
    }

    public int getAttackStrength(Entity entity)
    {
        return 0;
    }
    
    public int getMaxHealth()
    {
        return 100;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLiving par1)
    {
    	EntityKazroticShot var1 = new EntityKazroticShot(this.worldObj, this);
    	var1.setThrowableHeading(var1.motionX, var1.motionY, var1.motionZ, 0.3F, 0.3F);

        this.playSound("xolova.kazroticShot", 1.0F, 1.0F);
        this.worldObj.spawnEntityInWorld(var1);
    }
}