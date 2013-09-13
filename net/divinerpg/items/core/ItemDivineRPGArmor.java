package net.divinerpg.items.core;

import java.util.List;

import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineRPGArmor extends ItemArmor implements ISpecialArmor {
	
	private static final EnumArmorMaterial DUMMY_MATERIAL = EnumHelper.addArmorMaterial("DUMMY", 0, new int[] { 0, 0, 0, 0 }, 0);	
	
	String armorName;
	int armorType;
	double damageReduction;
	int durability;
	
	boolean unbrekable;
	
	int index;
	int sheet;
	
	public ItemDivineRPGArmor(int id, int armorType, String armorName, double damageReduction, int durability) {
		this(id, armorType, armorName, damageReduction, durability, false);
	}
	
	public ItemDivineRPGArmor(int id, int armorType, String armorName, double damageReduction, int durability, boolean unbreakable) {
		super(id, DUMMY_MATERIAL, armorType, armorType);
		this.armorName = armorName;
		this.unbrekable = unbreakable;
		this.armorType = armorType;
	}
	
	@Override
	public boolean isDamageable() {
		return !unbrekable;
	}
	
	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111208_A());
    }

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
		return new ArmorProperties(0, damageReduction, durability);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return 20;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
		if(isDamageable())
			stack.damageItem(1, entity);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack,	EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		addDamageReductionString(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add(!unbrekable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
	}
	
	public void addDamageReductionString(ItemStack par1ItemStack,	EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add((damageReduction * 100) + "% Damage Reduction");
	}
}
