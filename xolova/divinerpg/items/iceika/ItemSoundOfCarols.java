package xolova.divinerpg.items.iceika;

import java.util.List;

import xolova.divinerpg.items.core.ItemDivineRPGRanged;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSoundOfCarols extends ItemDivineRPGRanged {

	public ItemSoundOfCarols(int par1)
	{
		super(par1);
		this.setMaxDamage(4000);
        this.maxStackSize = 1;
    }

}
