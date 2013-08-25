package net.divinerpg.items.vethea;

import net.divinerpg.items.ItemDivineRPG;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSpinebackChunk extends ItemDivineRPG
{

	public ItemSpinebackChunk(int par1)
	{
		super(par1);
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
	{
//		if(!var3.isRemote)
//		{
//			var3.playSoundAtEntity(var2, "xolovon.SpinarusSpawn", 1.0F, 1.0F);
//			EntitySpinarus spinarus = new EntitySpinarus(var3);
//			spinarus.setLocationAndAngles((double)var4 + 0.0D, (double)var5 + 1.0D, (double)var6 + 0.0D, 0.0F, 0.0F);
//			var3.spawnEntityInWorld(spinarus);
//			return true;
//		}
		return false;
	}

}