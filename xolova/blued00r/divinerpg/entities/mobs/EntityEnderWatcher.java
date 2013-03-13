package xolova.blued00r.divinerpg.entities.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityEnderWatcher extends EntityEnderman
{
    public EntityEnderWatcher(World var1)
    {
        super(var1);
        this.texture = "/mob/EderWatcherTexture.png";
        this.moveSpeed = 0.4F;
        this.setSize(1.0F, 2.0F);
        this.experienceValue = 20;
    }

    public int getAttackStrength(Entity var1)
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
        return false;
    }

    public int getMaxHealth()
    {
        return 60;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.purpleShard.itemID;
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
            this.dropItem(DivineRPG.purpleShard.itemID, 1);
        }

        var3 = this.rand.nextInt(10);

        if (var3 == 0)
        {
            this.dropItem(DivineRPG.watcherEye.itemID, 1);
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1) {}
}
