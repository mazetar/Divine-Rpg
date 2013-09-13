package net.divinerpg.items.vethea;

import net.divinerpg.entities.vethea.projectile.EntityDarvenDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemDarvenDisk extends ItemDivineDisk
{

	public ItemDarvenDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityDarvenDisk(par2, par3, this.damage, this));
    }
}
