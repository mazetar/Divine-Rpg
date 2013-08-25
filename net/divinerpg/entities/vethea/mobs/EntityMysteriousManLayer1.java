package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMysteriousManLayer1 extends EntityGive
{
	public EntityMysteriousManLayer1(World par1) 
	{
		super(par1, VetheaItemHelper.teakerLump, 3);
	}
	public int spawnLayer = 1;
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * this.spawnLayer  && this.posY > 64.0D * (this.spawnLayer - 1) && super.getCanSpawnHere();
    }
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);
                
                switch (this.rand.nextInt(3))
            	{
            	case 0:
            		var1.addChatMessage("Mysterious Man: You look new around here. Be careful.");
            		break;
            		case 1:
            		var1.addChatMessage("Mysterious Man: Take these, use them at an infusion table.");
            		break;
            		case 2:
            		var1.addChatMessage("Mysterious Man: Don't tell anybody you saw me.");
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