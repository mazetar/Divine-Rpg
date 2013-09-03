package net.divinerpg.items.arcana;

import net.divinerpg.items.ItemDivineRPG;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaffOfEnrichment extends ItemDivineRPG
{

	public ItemStaffOfEnrichment(int par1)
	{
		super(par1);
		this.maxStackSize = 1;
		this.setMaxDamage(100);
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
		{
			return false;
		}
		else
		{
			int var11 = par3World.getBlockId(par4, par5, par6);
			int var12 = par3World.getBlockId(par4, par5 + 1, par6);

			if(var11 == ArcanaBlockHelper.arcaniteDirt.blockID)
			{
				Block var13 = ArcanaBlockHelper.arcaniteGrass;
				par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var13.stepSound.getStepSound(), (var13.stepSound.getVolume() + 1.0F) / 2.0F, var13.stepSound.getPitch() * 0.8F);

				if (par3World.isRemote)
				{
					return true;
				}
				else
				{
					par3World.setBlock(par4, par5, par6, var13.blockID);
					par1ItemStack.damageItem(1, par2EntityPlayer);
					return true;
				}
			}

			return false;

		}
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}

}
