package net.divinerpg.items.overworld.NYI;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class ItemFlamingFury extends DivineSword
{
    public float weaponDamage;

    public ItemFlamingFury(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.weaponDamage = par2EnumToolMaterial.getDamageVsEntity();
        this.setMaxDamage(6000);
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
    	par2EntityLiving.setFire(30);
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
}