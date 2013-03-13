package xolova.blued00r.divinerpg.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCostumeSanta extends ItemCostume
{

    public ItemCostumeSanta(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Full set: Massive Buff in Iceika");
        par3List.add("Iceika: Speeds up player");
        par3List.add("Iceika: Adds 6 Melee Damage");
        par3List.add("Iceika: Refils Hunger");
        par3List.add("Iceika: 80% Damage Reduction");
    }
}