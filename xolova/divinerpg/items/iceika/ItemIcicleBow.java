package xolova.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIcicleBow extends ItemBow
{
	private String[] texture = new String[] {"icicleBow_0", "icicleBow_1", "icicleBow_2"};
    private Icon[] field_94600_b;
    
	public ItemIcicleBow(int par1)
	{
		super(par1);
		this.setMaxDamage(10000);
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

    @SideOnly(Side.CLIENT)
    public void func_94581_a(IconRegister par1IconRegister)
    {
        super.func_94581_a(par1IconRegister);
        this.field_94600_b = new Icon[texture.length];

        for (int i = 0; i < this.field_94600_b.length; ++i)
        {
            this.field_94600_b[i] = par1IconRegister.func_94245_a(texture[i]);
        }
    }

    @SideOnly(Side.CLIENT)
    public Icon func_94599_c(int par1)
    {
        return this.field_94600_b[par1];
    }
}
