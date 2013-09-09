package net.divinerpg.items.overworld;

import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasicArmor extends ItemArmor implements ISpecialArmor
{
	private int sheet;
	private int index;
	private String[] descriptors;
	private double damageReduction;
    public ItemBasicArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
    }

    public ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
        return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
    }
    public ItemBasicArmor setDamageReduction(double reduc) {
    	damageReduction = reduc;
    	return this;
    }
    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return var3 != 0 && var3 != 2 ? (var3 == 1 ? 4 : 2) : 3;
    }

	public ItemBasicArmor setDescriptors(String[] descs) {
		descriptors = descs;
		return this;
	}
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	for (String desc : descriptors)
    		par3List.add(desc);
    }

    //TODO: Fill out properties of armor.
    @Override
    public ArmorProperties getProperties(EntityLivingBase player,
            ItemStack armor, DamageSource source, double damage, int slot) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack,
            DamageSource source, int damage, int slot) {
        // TODO Auto-generated method stub
        
    }
}
