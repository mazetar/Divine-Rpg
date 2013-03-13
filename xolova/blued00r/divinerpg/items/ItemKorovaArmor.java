package xolova.blued00r.divinerpg.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemKorovaArmor extends ItemArmor implements IArmorTextureProvider
{
    public ItemKorovaArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.realmiteHead.itemID && var1.itemID != DivineRPG.realmiteBody.itemID && var1.itemID != DivineRPG.realmiteBoots.itemID ? (var1.itemID == DivineRPG.realmiteLegs.itemID ? "/armor/dk_2.png" : "/armor/dk_1.png") : "/armor/dk_1.png";
    }
}
