package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityPardimalDisk;

public class ItemPardimalDisk extends ItemVetheanDisk
{

	public ItemPardimalDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityPardimalDisk(par2, par3, this.damage, this));
    }
}