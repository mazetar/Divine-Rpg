package net.divinerpg.items.vethea;

import net.divinerpg.entities.vethea.mobs.EntityKaros;
import net.divinerpg.entities.vethea.mobs.EntityQuadro;
import net.divinerpg.entities.vethea.mobs.EntityRaglok;
import net.divinerpg.entities.vethea.mobs.EntityWreck;
import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDreamflint extends ItemDivine
{

	public ItemDreamflint(int par1)
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

				if (var11 == VetheaBlockHelper.wreckAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.WreckSpawn", 1.0F, 1.0F);
					EntityWreck wreck = new EntityWreck(var3);
					wreck.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
					var3.spawnEntityInWorld(wreck);
					return true;
				}
				else if (var11 == VetheaBlockHelper.raglokAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.RaglokSpawn", 1.0F, 1.0F);
					EntityRaglok raglok = new EntityRaglok(var3);
					raglok.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
					var3.spawnEntityInWorld(raglok);
					return true;
				}
				else if (var11 == VetheaBlockHelper.karosAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.KarosSpawn", 1.0F, 1.0F);
					EntityKaros karos = new EntityKaros(var3, var4 - 27, var5 - 2, var6 - 9);
					karos.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
					var3.spawnEntityInWorld(karos);
					return true;
				}
				else if (var11 == VetheaBlockHelper.quadroticAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.QuadroSpawn", 1.0F, 1.0F);
					EntityQuadro quadro = new EntityQuadro(var3);
					quadro.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
					var3.spawnEntityInWorld(quadro);
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