package xolova.blued00r.divinerpg.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xolova.blued00r.divinerpg.*;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ItemChickenDinner extends ItemFood
{

	public ItemChickenDinner(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}
	
    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.addStat(AchievementPageDivineRPG.mealToRemember, 1);
    	return super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
    }
    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Replenishes " + ((ItemFood) par1ItemStack.getItem()).getHealAmount() + " Hunger");
        par3List.add(((ItemFood) par1ItemStack.getItem()).getSaturationModifier() + " Saturation");
        par3List.add("Pet Food: " + ((ItemFood) par1ItemStack.getItem()).isWolfsFavoriteMeat());
    }

}
