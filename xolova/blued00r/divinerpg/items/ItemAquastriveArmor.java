package xolova.blued00r.divinerpg.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.ISpecialArmor;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemAquastriveArmor extends ItemArmor implements IArmorTextureProvider, ISpecialArmor
{
    public ItemAquastriveArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        return new ISpecialArmor.ArmorProperties(0, 0.1375D, 50000);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return var3 != 0 && var3 != 2 ? (var3 == 1 ? 7 : 6) : 6;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {}

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.aquastriveHead.itemID && var1.itemID != DivineRPG.aquastriveBody.itemID && var1.itemID != DivineRPG.aquastriveBoots.itemID ? (var1.itemID == DivineRPG.aquastriveLegs.itemID ? "/armor/aquastrive_2.png" : "/armor/aquastrive_1.png") : "/armor/aquastrive_1.png";
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("13.75% Damage Reduction");
        par3List.add("Infinite Uses");
        par3List.add("Full set: Breathe Underwater");
        par3List.add("Full set: Swim Speed Increase");
    }
}
