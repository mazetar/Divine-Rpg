package xolova.blued00r.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityLadyLuna;

public class ItemMoonclock extends Item
{

	public ItemMoonclock(int par1)
	{
		super(par1);
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
	{
		if(!var3.isRemote)
		{
			if (var7 != 1)
			{
				return false;
			}
			else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
			{
				int var11 = var3.getBlockId(var4, var5, var6);

				if (var11 == DivineRPG.lunicAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.LadyLunaSpawn", 1.0F, 1.0F);
					EntityLadyLuna ladyLuna = new EntityLadyLuna(var3);
					ladyLuna.setLocationAndAngles((double)var4 + 0.0D, (double)var5 + 1.0D, (double)var6 + 0.0D, 0.0F, 0.0F);
					var3.spawnEntityInWorld(ladyLuna);
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}

}