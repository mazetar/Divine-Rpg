package xolova.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityHeliosisDisk;

public class ItemHeliosisDisk extends ItemVetheanDisk
{

	public ItemHeliosisDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityHeliosisDisk(par2, par3, this.damage, this));
    }
}