package net.divinerpg.items.arcana;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;

public class ItemLiviciaSword extends DivineSword
{
    public int weaponDamage;

    public ItemLiviciaSword(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.weaponDamage = 45;
        this.setMaxDamage(10000);
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return weaponDamage;
    }
}