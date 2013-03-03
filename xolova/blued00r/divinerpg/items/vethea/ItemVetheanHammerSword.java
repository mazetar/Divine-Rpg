package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;

public class ItemVetheanHammerSword extends ItemSword
{
	private static int weaponDamage;
	public static EnumToolMaterial enumz = EnumHelper.addToolMaterial("enumz", 0, -1, 0, weaponDamage, 22);
	
	public ItemVetheanHammerSword(int i, int j, String name)
	{
		super(i, enumz);
		this.setIconIndex(j);
		this.setItemName(name);
		this.setTextureFile("/Xolovon4.png");
	}
	
	public Item setWeaponDamage(int i)
	{
		this.weaponDamage = i;
		return this;
	}
}
