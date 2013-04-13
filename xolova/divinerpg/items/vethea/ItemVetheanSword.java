package xolova.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.items.core.ItemDivineRPGSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanSword extends ItemDivineRPGSword
{
    public ItemVetheanSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setMaxDamage(-1);
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(par1ItemStack.getDamageVsEntity(par2EntityPlayer) + " Melee Damage");
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
        	par3List.add("Infinite Uses");
        }
        if (this instanceof ItemVetheanClaw)
        {
        	par3List.add("Can not Block");
        }
        par3List.add("\u00a72Vethean");
    }
}