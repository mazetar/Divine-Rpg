package net.divinerpg.items.vethea;

import net.divinerpg.entities.vethea.projectile.EntityArksianeDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemArksianeDisk extends ItemDivineDisk
{

	public ItemArksianeDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityArksianeDisk(par2, par3, this.damage, this));
    }
}