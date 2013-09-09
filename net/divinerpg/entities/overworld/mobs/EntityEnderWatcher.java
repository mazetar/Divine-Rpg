package net.divinerpg.entities.overworld.mobs;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class EntityEnderWatcher extends EntityEnderman
{
    public EntityEnderWatcher(World var1)
    {
        super(var1);
        this.setSize(1.0F, 2.0F);
        this.experienceValue = 20;
    }

    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(60);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(13);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.4F);
    }


    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return false;
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
        int var3 = this.rand.nextInt(3 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.enderShard.itemID, 1);
        }

        var3 = this.rand.nextInt(10);

        if (var3 == 0)
        {
            this.dropItem(OverworldItemHelper.watcherEye.itemID, 1);
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1) {}
}
