package xolova.blued00r.divinerpg.entities.mobs.vethea;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.Village;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityGive extends EntityVillager
{
    private int randomTickDivider;
    Village villageObj;
    private EntityPlayer buyingPlayer;
	private Item giveItem;
	private int amount;

    public EntityGive(World var1)
    {
        this(var1, 0);
    }

    public EntityGive(World par1, int par2)
    {
        super(par1);
        this.randomTickDivider = 0;
        this.moveSpeed = 0.3F;
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.3F, 0.35F));
        this.tasks.addTask(1, new EntityAITradePlayer(this));
        this.tasks.addTask(1, new EntityAILookAtTradePlayer(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTwardsRestriction(this, 0.3F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(9, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }
    
    public EntityGive(World par1, Item par3, int par4)
    {
        this(par1);
        this.giveItem = par3;
        this.amount = par4;
    }
	
	@SideOnly(Side.CLIENT) 
	public String getTexture()
	{
		return this.texture;
	}

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive())
        {
            if (!this.worldObj.isRemote)
            {
                var1.inventory.addItemStackToInventory(new ItemStack(this.giveItem, this.amount));
                this.setDead();
            }

            return true;
        }
        else
        {
            return super.interact(var1);
        }
    }

    protected void entityInit()
    {
        super.entityInit();
    }

    public int getMaxHealth()
    {
        return 1000;
    }
}