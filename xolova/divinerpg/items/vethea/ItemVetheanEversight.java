package xolova.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityEversightProjectile;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;

public class ItemVetheanEversight extends ItemVetheanCannon
{
	public ItemVetheanEversight(int par1, int par2, String name) 
	{
		super(par1, par2, name);
	}
	
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && (par3.capabilities.isCreativeMode || par3.inventory.consumeInventoryItem(VetheaItemHelper.acidfire.itemID)))
        {
            par2.playSoundAtEntity(par3, "xolovon.blitz", 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityEversightProjectile(par2, par3, this.damage));
        }

        return par1;
    }
}
