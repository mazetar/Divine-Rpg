package net.divinerpg.items.core;

import net.minecraft.item.ItemBucket;

public class ItemDivineRPGBucket extends ItemBucket{

	public ItemDivineRPGBucket(int id, int isFull) {
		super(id - 256, isFull);
	}
}
