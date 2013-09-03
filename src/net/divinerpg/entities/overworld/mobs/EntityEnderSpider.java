package net.divinerpg.entities.overworld.mobs;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class EntityEnderSpider extends EntityEnderman
{
    public EntityEnderSpider(World var1)
    {
        super(var1);
        this.setSize(0.9F, 0.9F);
        this.experienceValue = 20;
    }
    
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(45);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(16);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.8F);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "mob.RPG.Enderspider";
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
