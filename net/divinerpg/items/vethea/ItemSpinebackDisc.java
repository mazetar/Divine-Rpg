package net.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemSpinebackDisc extends ItemDivineDisk
{

	public ItemSpinebackDisc(int par1, int par2) {
		super(par1, par2);
		this.setMaxStackSize(5);
	}
    
    public void shoot(World par2, EntityPlayer par3)
    {
//    	par2.spawnEntityInWorld(new EntitySpinebackDisc(par2, par3, this.damage, this));
    }
}