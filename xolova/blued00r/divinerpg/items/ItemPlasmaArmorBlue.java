package xolova.blued00r.divinerpg.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemPlasmaArmorBlue extends ItemPlasmaArmor implements IArmorTextureProvider
{
    public ItemPlasmaArmorBlue(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.plasmaHeadBlack.itemID && var1.itemID != DivineRPG.plasmaBodyBlack.itemID && var1.itemID != DivineRPG.plasmaBootsBlack.itemID ? (var1.itemID == DivineRPG.plasmaLegsBlack.itemID ? "/armor/plasmab_2.png" : "/armor/plasma_1.png") : "/armor/plasmab_1.png";
    }
}
