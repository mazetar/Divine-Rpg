package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityShuriken;
import xolova.blued00r.divinerpg.entities.vethea.EntityTeakerDisk;

public class ItemTeakerDisk extends ItemVetheanDisk
{

	public ItemTeakerDisk(int par1, int par2) {
		super(par1, par2);
	}

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par3.capabilities.isCreativeMode)
        {
            --par1.stackSize;
        }

        par2.playSoundAtEntity(par3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2.isRemote)
        {
            par2.spawnEntityInWorld(new EntityTeakerDisk(par2, par3, this.damage));
        }

        return par1;
    }
}
