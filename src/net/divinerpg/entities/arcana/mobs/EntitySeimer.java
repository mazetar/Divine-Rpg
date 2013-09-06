package net.divinerpg.entities.arcana.mobs;

import net.divinerpg.utils.helpers.ArcanaHelper;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntitySeimer extends EntityTameable
{
    private int regenTimer;

    public EntitySeimer(World par1World)
    {
        super(par1World);
        this.setSize(1.0F, 1.0F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(4, new EntityAIFollowOwner(this, this.getMoveSpeed(), 4.0F, 2.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.regenTimer = 0;
    }
    
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(150);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(1);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3F);
    }

    public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
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
        return "Golem of Rejuvination";
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

    public void onUpdate()
    {
        super.onUpdate();

        if (this.getOwner() != null)
        {
            if (this.regenTimer >= 2)
            {
            	ArcanaHelper.regen(this.getOwnerName(), 1);
                this.regenTimer = 0;
            }
            else
            {
                ++this.regenTimer;
            }
        }
    }

    public void updateAITasks()
    {
        super.updateAITasks();
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1)
    {
        return null;
    }
    
    
}