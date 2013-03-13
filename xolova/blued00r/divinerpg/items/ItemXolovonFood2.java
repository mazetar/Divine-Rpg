package xolova.blued00r.divinerpg.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemXolovonFood2 extends ItemFood
{
    public ItemXolovonFood2(int var1, int var2, float var3, boolean var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }
    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Replenishes " + ((ItemFood) par1ItemStack.getItem()).getHealAmount() + " Hunger");
        par3List.add(((ItemFood) par1ItemStack.getItem()).getSaturationModifier() + " Saturation");
        par3List.add("Pet Food: " + ((ItemFood) par1ItemStack.getItem()).isWolfsFavoriteMeat());
    }
}
