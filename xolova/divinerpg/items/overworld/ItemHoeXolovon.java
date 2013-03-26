package xolova.blued00r.divinerpg.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.DivineRPGTwilight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHoeXolovon extends ItemHoe
{
    private EnumToolMaterial field_40439_b;
    public ItemHoeXolovon(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.maxStackSize = 1;
        this.field_40439_b = var2;
        this.setMaxDamage(var2.getMaxUses());
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        //par3List.add("Efficiency: " + this.field_40439_b.getEfficiencyOnProperMaterial());
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
