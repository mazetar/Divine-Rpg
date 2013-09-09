package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTempleGuardian extends EntityGive
{

	public EntityTempleGuardian(World par1) 
	{
		super(par1, VetheaItemHelper.cermileLump, 10);
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
            		var1.addChatMessage("Temple Guardian: You are moving upwards, beware of the imminent danger.");
            		break;
            		case 1:
            		var1.addChatMessage("Temple Guardian: These places aren't for you.");
            		break;
            		case 2:
            		var1.addChatMessage("Temple Guardian: This is dangerous, what are you doing here?");
            		break;
            		case 3:
            		var1.addChatMessage("Temple Guardian: Temples are suited for humans.");
            		break;
            		case 4:
            		var1.addChatMessage("Temple Guardian: They are getting closer to killing you.");
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