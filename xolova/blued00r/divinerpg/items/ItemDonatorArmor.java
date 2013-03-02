package xolova.blued00r.divinerpg.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemDonatorArmor extends ItemArmor implements IArmorTextureProvider
{
    public ItemDonatorArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.donatorHead.itemID && var1.itemID != DivineRPG.donatorBody.itemID && var1.itemID != DivineRPG.donatorBoots.itemID ? (var1.itemID == DivineRPG.donatorLegs.itemID ? "/armor/donator_2.png" : "/armor/donator_1.png") : "/armor/donator_1.png";
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("0% Damage Reduction");
        par3List.add("Infinite Uses");
    }
}
