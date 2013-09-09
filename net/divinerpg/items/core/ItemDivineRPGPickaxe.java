package net.divinerpg.items.core;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemDivineRPGPickaxe extends ItemPickaxe
{
	
	public ItemDivineRPGPickaxe(int id, EnumToolMaterial enumz) {
		this(id, 0, enumz);
	}
	
	public ItemDivineRPGPickaxe(int id, int sprite, EnumToolMaterial enumz) {
		super(id - 256, enumz);
	}
}
