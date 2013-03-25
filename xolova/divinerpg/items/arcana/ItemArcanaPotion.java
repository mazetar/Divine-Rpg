package xolova.divinerpg.items.arcana;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.utils.helpers.ArcanaHelper;
import xolova.divinerpg.utils.helpers.item.ArcanaItemHelper;

public class ItemArcanaPotion extends ItemDivineRPG
{

	public ItemArcanaPotion(int par1, int par2)
	{
		super(par1, par2);
	}
	
	
	
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	if(var1.itemID == ArcanaItemHelper.weakArcanaPotion.itemID)
    	{
    		ArcanaHelper.regen(var3.username, 100);
    		var3.addStat(AchievementPageDivineRPG.yuk, 1);
    		--var1.stackSize;
    	}
    	
    	if(var1.itemID == ArcanaItemHelper.strongArcanaPotion.itemID)
    	{
    		ArcanaHelper.regen(var3.username, 200);
    		var3.addStat(AchievementPageDivineRPG.yuk, 1);
    		--var1.stackSize;
    	}
    	
    	
		return var1;
    }
	
	public int getSheet(int meta, int pass) {
		return 4;
	}
}
