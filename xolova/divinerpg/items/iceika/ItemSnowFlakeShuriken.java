package xolova.blued00r.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSnowFlakeShuriken extends Item
{

	public ItemSnowFlakeShuriken(int par1)
	{
		super(par1);
        this.maxStackSize = 64;
        this.setCreativeTab(DivineRPG.tabRanged);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var3.capabilities.isCreativeMode)
        {
            --var1.stackSize;
        }

        var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!var2.isRemote)
        {
            var2.spawnEntityInWorld(new EntityFrostyShuriken(var2, var3));
        }

        return var1;
    }
    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("7 Ranged Damage");
    }
}
