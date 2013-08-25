package net.divinerpg.items.arcana;

import java.util.List;

import net.divinerpg.items.core.ItemDivineRPGArmor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemArmorVemos extends ItemDivineRPGArmor implements ISpecialArmor
{
	private static EnumArmorMaterial enumz = EnumHelper.addArmorMaterial("korma", -1, new int[]{0,0,0,0}, 20);
	
    public ItemArmorVemos(int id, int damageReduction, int armorType) {
        super(id, armorType, "Korma", damageReduction, Integer.MAX_VALUE, true);
    }

    public ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        return new ArmorProperties(0, 0.1125D, 50000);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return 11;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {}

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("11.25% Damage Reduction");
        par3List.add("Infinite Uses");
        par3List.add("Full Set: Health Regen");
    }
}
