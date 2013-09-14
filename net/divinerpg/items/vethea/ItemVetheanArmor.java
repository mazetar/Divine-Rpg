package net.divinerpg.items.vethea;

import java.util.List;

import net.divinerpg.items.core.DivineArmorSet;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanArmor extends DivineArmorSet implements ISpecialArmor
{
    private int type;
    private int reductionAmount;
    private String specialty;
	private String ability;
	public ItemVetheanArmor(int id, int var3render, String ArmorName, double var4, int par2, String special, String specialAbility)
    {
        super(1, null, 1, 1, false, null);//id, var3render, ArmorName, var4, par2);
        this.type = var3render;
        this.reductionAmount = par2;
        this.specialty = special;
        this.ability = specialAbility;
    }

    public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
    	double typeMod;
    	switch(var6)
    	{
    	case 0:
    		typeMod = 0.2D;
    		break;
    	case 1:
    		typeMod = 0.4D;
    		break;
    	case 2: 
    		typeMod = 0.3D;
    		break;
    	case 3:
    		typeMod = 0.1D;
    		break;
    	default:
    		typeMod = 0;
    	}
        return new ISpecialArmor.ArmorProperties(0, this.reductionAmount * typeMod, 50000);
    }

    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3)
    {
        return 2;
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {}

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	if (this.type == 0)
    	{
            par3List.add(this.reductionAmount * 0.2 + "% Damage Reduction");
            if (this.specialty != "")
            {
                par3List.add("Adds 15% " + this.specialty + " Damage Reduction");
                par3List.add("is split among each armor peice.");
            }
            if (this.ability != "")
            {
                par3List.add("Full set: " + this.ability);
            }
    	}
    	else if (this.type == 1)
    	{
            par3List.add(this.reductionAmount * 0.4 + "% Damage Reduction");
    	}
    	else if (this.type == 2)
    	{
            par3List.add(this.reductionAmount * 0.3 + "% Damage Reduction");
    	}
    	else if (this.type == 3)
    	{
            par3List.add(this.reductionAmount * 0.2 + "% Damage Reduction");
    	}
        par3List.add("Infinite Uses");
        par3List.add("\u00a72Vethean");
    }
}