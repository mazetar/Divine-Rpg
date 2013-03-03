package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemVetheanHealingFood extends ItemFood
{
	
	private int healthGain;

	public ItemVetheanHealingFood(int par1, int par2, float par3, boolean par4, int par5) {
		super(par1, par2, par3, par4);
		this.healthGain = par5;
		this.setAlwaysEdible();
	}

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 16;
    }
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Replenishes " + this.healthGain + " Health");
		par3List.add(((ItemFood) par1ItemStack.getItem()).getSaturationModifier() + " Saturation");
		par3List.add("Pet Food: " + ((ItemFood) par1ItemStack.getItem()).isWolfsFavoriteMeat());
        par3List.add("§2Vethean");
	}
}
