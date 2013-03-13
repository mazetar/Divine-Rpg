package xolova.blued00r.divinerpg.items;

import net.minecraft.item.EnumArmorMaterial;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemEnderArmorColored extends ItemEnderArmor
{
    public ItemEnderArmorColored(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
