package xolova.divinerpg.items.arcana;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.utils.AchievementPageDivineRPG;
import xolova.divinerpg.utils.helpers.block.ArcanaBlockHelper;

public class ItemWizardBook extends Item
{

	public ItemWizardBook(int par1)
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

				if (var11 == ArcanaBlockHelper.dramixAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.DramixSpawn", 1.0F, 1.0F);
					EntityDramix tinkerer = new EntityDramix(var3);
					tinkerer.setLocationAndAngles((double)var4 + 0.0D, (double)var5 + 1.0D, (double)var6 + 0.0D, 0.0F, 0.0F);
					var3.spawnEntityInWorld(tinkerer);
					var2.addStat(AchievementPageDivineRPG.dungeonMaster, 1);
					return true;
				}
				else if (var11 == ArcanaBlockHelper.parasectaAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					var3.playSoundAtEntity(var2, "xolovon.ParasectaSpawn", 1.0F, 1.0F);
					EntityParasecta tinkerer = new EntityParasecta(var3);
					tinkerer.setLocationAndAngles((double)var4 + 0.0D, (double)var5 + 1.0D, (double)var6 + 0.0D, 0.0F, 0.0F);
					var3.spawnEntityInWorld(tinkerer);
					var2.addStat(AchievementPageDivineRPG.greatBirdFire, 1);
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
