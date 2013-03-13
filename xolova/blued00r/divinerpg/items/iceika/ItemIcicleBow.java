package xolova.blued00r.divinerpg.items.iceika;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemIcicleBow extends ItemBow
{

	public ItemIcicleBow(int par1)
	{
		super(par1);
		this.setMaxDamage(10000);
		this.setCreativeTab(DivineRPG.tabRanged);
	}
	
	@Override
    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            int var6 = var4.getMaxItemUseDuration() - var3.getItemInUseCount();

            if ((float)var6 >= 20.0F)
            {
                return this.iconIndex + 3;
            }

            if ((float)var6 >= 15.0F)
            {
                return this.iconIndex + 2;
            }

            if ((float)var6 > 10.0F)
            {
                return this.iconIndex + 1;
            }

            if (var6 > 0)
            {
                return this.iconIndex;
            }
        }

        return this.iconIndex;
    }
	
    /**
     * How long it takes to use or consume an item
     */
	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 24000;
    }

	
    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @Override
    public boolean isFull3D()
    {
        return true;
    }
    
	@Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("2" + " Ranged Damage");
        par3List.add("3" + " Times Faster");
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
        	par3List.add("Infinite Uses");
        }
    }

}
