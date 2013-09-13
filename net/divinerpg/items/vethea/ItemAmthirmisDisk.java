package net.divinerpg.items.vethea;

import net.divinerpg.entities.vethea.projectile.EntityAmthirmisDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemAmthirmisDisk extends ItemDivineDisk
{

	public ItemAmthirmisDisk(int id, int dmg) {
		super(id, dmg);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityAmthirmisDisk(par2, par3, this.damage, this));
    }
}
