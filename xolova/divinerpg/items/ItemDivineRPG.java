package xolova.divinerpg.items;

import xolova.divinerpg.utils.helpers.IconHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemDivineRPG extends Item
{
	int index;
	int sheet;
	
	public ItemDivineRPG(int par1)
	{
		super(par1);
		this.index = 0;
	}
	
	public ItemDivineRPG setIconIndex(int x, int y) 
	{
		index = (y * 16) + x;
		return this;
	}
	
    public void updateIcons(IconRegister par1IconRegister)
    {
        IconHelper.massLoadItemSprites(par1IconRegister);
    }
	
	public int getTextureIndexFromSideAndMetadata(int par1, int par2)
	{
		return index;
	}
}
