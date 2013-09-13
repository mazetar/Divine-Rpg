package net.divinerpg.items.vethea;

import net.divinerpg.entities.vethea.projectile.EntityQuadroticDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemQuadroticDisk extends ItemDivineDisk
{

	public ItemQuadroticDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityQuadroticDisk(par2, par3, this.damage, this));
    }
}