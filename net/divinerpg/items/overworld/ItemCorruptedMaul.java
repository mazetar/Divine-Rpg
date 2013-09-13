package net.divinerpg.items.overworld;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;

public class ItemCorruptedMaul extends DivineSword
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
