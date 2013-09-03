package net.divinerpg.entities.vethea.mobs;

import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMysteriousManLayer3 extends EntityGive
{
	public EntityMysteriousManLayer3(World par1) 
	{
		super(par1, VetheaItemHelper.pardimalLump, 10);
	}
	public int spawnLayer = 3;
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
            		var1.addChatMessage("Mysterious Man: Infuse this, I can feel the stength when you do.");
            		break;
            		case 1:
            		var1.addChatMessage("Mysterious Man: Thank you for aiding me in my plan.");
            		break;
            		case 2:
            		var1.addChatMessage("Mysterious Man: The surface is just above us.");
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