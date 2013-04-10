package xolova.divinerpg.items.overworld;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import xolova.divinerpg.items.core.ItemDivineRPGSword;

public class ItemCorruptedMaul extends ItemDivineRPGSword
{
    private int weaponDamage;

    public ItemCorruptedMaul(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.weaponDamage = 18;
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return weaponDamage;
    }
}
