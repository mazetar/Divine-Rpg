package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityEnderSpider extends EntityEnderman
{
    public EntityEnderSpider(World var1)
    {
        super(var1);
        this.texture = "/mob/enderSpider.png";
        this.moveSpeed = 0.8F;
        this.setSize(0.9F, 0.9F);
        this.experienceValue = 20;
    }

    public int getAttackStrength(Entity var1)
    {
		if (!this.worldObj.isRemote && this.worldObj.difficultySetting > 0)
		{
			return 16;
		}
        return 16;
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "mob.RPG.Enderspider";
    }


    public int getMaxHealth()
    {
        return 45;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return OverworldItemHelper.enderShard.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {   
    	this.dropItem(OverworldItemHelper.enderShard.itemID, 1);
    }
}
