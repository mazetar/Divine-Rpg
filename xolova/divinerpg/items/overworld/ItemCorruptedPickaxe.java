package xolova.divinerpg.items.overworld;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.items.core.ItemDivineRPGPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCorruptedPickaxe extends ItemDivineRPGPickaxe
{
    private EnumToolMaterial field_40439_b;

    public ItemCorruptedPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.field_40439_b = par2EnumToolMaterial;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Efficiency: " + this.field_40439_b.getEfficiencyOnProperMaterial());
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
