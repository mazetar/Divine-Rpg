package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.ISpecialArmor;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemVetheanArmor extends ItemArmor implements ISpecialArmor
{
    private int type;
    private int reductionAmount;
    private String specialty;
	private String ability;
	private static EnumArmorMaterial vethea = EnumHelper.addArmorMaterial("vethea", -1, new int[]{0, 0, 0, 0}, 0);

	public ItemVetheanArmor(int var1, int var3, int var4, int par2, String special, String specialAbility)
    {
        super(var1, vethea, var3, var4);
        this.type = var4;
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
        return new ISpecialArmor.ArmorProperties(0, this.reductionAmount / 100 * typeMod, 50000);
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
    }
}