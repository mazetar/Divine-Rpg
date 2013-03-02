package xolova.blued00r.divinerpg.entities.ai;

import xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAIDivineLookAtTradePlayer extends EntityAIWatchClosest
{
    private final EntityJackOMan theMerchant;

    public EntityAIDivineLookAtTradePlayer(EntityJackOMan var1)
    {
        super(var1, EntityPlayer.class, 8.0F);
        this.theMerchant = var1;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.theMerchant.isTrading())
        {
            this.closestEntity = this.theMerchant.getCustomer();
            return true;
        }
        else
        {
            return false;
        }
    }
}
