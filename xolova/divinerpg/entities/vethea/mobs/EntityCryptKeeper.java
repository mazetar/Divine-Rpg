package xolova.divinerpg.entities.vethea.mobs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;

public class EntityCryptKeeper extends EntityGive
{

	public EntityCryptKeeper(World par1) 
	{
		super(par1, VetheaItemHelper.amthrimisLump, 5);
		this.texture = "/mob/TempleGuardian.png";
	}
	
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);
                
                switch (this.rand.nextInt(5))
            	{
            	case 0:
            		var1.addChatMessage("Crypt Keeper: You are safer down here.");
            		break;
            		case 1:
            		var1.addChatMessage("Crypt Keeper: Beware of the higher layers.");
            		break;
            		case 2:
            		var1.addChatMessage("Crypt Keeper: Take this reward, use it wisely.");
            		break;
            		case 3:
            		var1.addChatMessage("Crypt Keeper: What the future holds is dark.");
            		break;
            		case 4:
            		var1.addChatMessage("Crypt Keeper: This isn't a nice world.");
            		break;
            	}
          }

            return true;
        }
        else
        {
            return super.interact(var1);
        }
    }
}