package xolova.divinerpg.entities.arcana.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.arcana.projectile.EntityFyracryxFireball;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFyracryx extends EntityTameable implements IRangedAttackMob
{
    public EntityFyracryx(World par1World, EntityPlayer par2EntityPlayer)
    {
        this(par1World);
        this.setTamed(true);
        this.setOwner(par2EntityPlayer.username);
    }
    
    public EntityFyracryx(World par1World)
    {
        super(par1World);
        this.texture = "mob/Fyracryx.png";
        this.moveSpeed = 0.3F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(4, new EntityAIFollowOwner(this, this.moveSpeed, 10.0F, 2.0F));
        this.tasks.addTask(3, new EntityAIArrowAttack(this, this.moveSpeed, 1, 60));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.moveSpeed, true));
        this.tasks.addTask(6, new EntityAIFollowOwner(this, this.moveSpeed, 10.0F, 2.0F));
        this.tasks.addTask(7, new EntityAIMate(this, this.moveSpeed));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntitySheep.class, 16.0F, 200, false));
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    public void entityInit()
    {
        super.entityInit();
    }

    /**
    * Gets the username of the entity.
    */
    public String getEntityName()
    {
        return "Fyracryx";
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        return "/mob/Fyracryx.png";
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Deathcryx";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.DeathCryxHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.Deathcryx";
    }

    public int getAttackStrength(Entity var1)
    {
        return 0;
    }

    public int getMaxHealth()
    {
        return 60;
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
     * Initialize this creature.
     */
    public void initCreature() {}

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLiving entityliving, float f) 
	{
		double var3 = this.posX - this.posX;
        double var5 = this.boundingBox.minY + (double)(this.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
        double var7 = this.posZ - this.posZ;
        float var9 = MathHelper.sqrt_float(this.getDistanceToEntity(this)) * 0.5F;
        this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);

        for (int var10 = 0; var10 < 1; ++var10)
        {
            EntityFyracryxFireball var11 = new EntityFyracryxFireball(this.worldObj, this, var3 + this.rand.nextGaussian() * (double)var9, var5, var7 + this.rand.nextGaussian() * (double)var9);
            var11.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
            this.worldObj.spawnEntityInWorld(var11);
        }
	}
}
