package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;

public class ItemDeathBringer extends ItemSwordXolovon
{
    public int weaponDamage;

    public ItemDeathBringer(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.weaponDamage = 13;
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
