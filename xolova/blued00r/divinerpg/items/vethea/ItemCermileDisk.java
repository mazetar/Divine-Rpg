package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityCermileDisk;
import xolova.blued00r.divinerpg.entities.vethea.EntityTeakerDisk;

public class ItemCermileDisk extends ItemVetheanDisk
{

	public ItemCermileDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityCermileDisk(par2, par3, this.damage, this));
    }
}
