package xolova.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityDarvenDisk;

public class ItemDarvenDisk extends ItemVetheanDisk
{

	public ItemDarvenDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityDarvenDisk(par2, par3, this.damage, this));
    }
}
