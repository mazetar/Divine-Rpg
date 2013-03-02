package xolova.blued00r.divinerpg.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.common.ISpecialArmor;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemRealmiteArmor extends ItemArmor implements IArmorTextureProvider, ISpecialArmor
{
    public ItemRealmiteArmor(int var1, EnumArmorMaterial var2, int var3, int var4)
    {
        super(var1, var2, var3, var4);
        this.setMaxDamage(5000);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }

    public String getArmorTextureFile(ItemStack var1)
    {
        return var1.itemID != DivineRPG.realmiteHead.itemID && var1.itemID != DivineRPG.realmiteBody.itemID && var1.itemID != DivineRPG.realmiteBoots.itemID ? (var1.itemID == DivineRPG.realmiteLegs.itemID ? "/armor/real_2.png" : "/armor/real_1.png") : "/armor/real_1.png";
    }

	@Override
	public ArmorProperties getProperties(EntityLiving player, ItemStack armor,
			DamageSource source, double damage, int slot) {
        return new ISpecialArmor.ArmorProperties(0, 0.0825D, 50000);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return 5;
	}

	@Override
	public void damageArmor(EntityLiving entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		stack.damageItem(1, entity);
	}

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("8.25% Damage Reduction");
        par3List.add("5000 Uses");
    }
}
