package net.divinerpg.items.vethea;

import net.divinerpg.entities.vethea.projectile.EntityCermileDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemCermileDisk extends ItemDivineDisk
{

	public ItemCermileDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityCermileDisk(par2, par3, this.damage, this));
    }
}
