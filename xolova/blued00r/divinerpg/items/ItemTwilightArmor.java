package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemTwilightArmor extends ItemArmor implements ISpecialArmor
{
    public ItemTwilightArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        return new ISpecialArmor.ArmorProperties(0, 0.2075D, 200);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return 20;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {}
}
