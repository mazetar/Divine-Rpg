package xolova.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityTeakerDisk;

public class ItemTeakerDisk extends ItemVetheanDisk
{
	public ItemTeakerDisk(int par1, int par2) 
	{
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityTeakerDisk(par2, par3, this.damage, this));
    }
}