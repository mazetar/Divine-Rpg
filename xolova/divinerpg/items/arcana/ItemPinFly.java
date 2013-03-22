package xolova.divinerpg.items.arcana;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemPinFly extends ItemFood
{

	public ItemPinFly(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par3, par4);
		this.setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F);
	}

}
