package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.vethea.EntityAmthirmisDisk;
import xolova.blued00r.divinerpg.entities.vethea.EntityTeakerDisk;

public class ItemAmthirmisDisk extends ItemVetheanDisk
{

	public ItemAmthirmisDisk(int par1, int par2) {
		super(par1, par2);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
    	par2.spawnEntityInWorld(new EntityAmthirmisDisk(par2, par3, this.damage, this));
    }
}
