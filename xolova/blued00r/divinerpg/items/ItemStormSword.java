package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.misc.ArcanaBar;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

public class ItemStormSword extends ItemSword
{
	public ItemStormSword(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, par2EnumToolMaterial);
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if (ArcanaList.get(par3EntityPlayer.username).arcanaUse(20))
    	{
    		this.createLightning(par2World, par3EntityPlayer);
    	}
    	
    	par3EntityPlayer.addStat(AchievementPageDivineRPG.allHellLoose, 1);
    	
        return super.onItemRightClick(par1ItemStack, par2World, par3EntityPlayer);
    }
    
    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity par1Entity)
    {
        return 5;
    }

    
    /**
     * Called when the player Left Clicks (attacks) an entity.
     * Processed before damage is done, if return value is true further processing is canceled
     * and the entity is not attacked.
     *
     * @param stack The Item being used
     * @param player The player that is attacking
     * @param entity The entity being attacked
     * @return True to cancel the rest of the interaction.
     */
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
    	if (ArcanaList.get(player.username).arcanaUse(20))
    	{
        	this.createLightning(player.worldObj, player);
    	}
    	
    	player.addStat(AchievementPageDivineRPG.allHellLoose, 1);
    	
        return false;
    }
	
	public void createLightning(World par2World, EntityPlayer par3EntityPlayer)
	{
		for (int i = 2; i < 5; i += 2)
		{
			double var4 = 0;
			while (var4 < 2 * Math.PI)
			{
				int var1 = (int) Math.round(Math.sin(var4)*i);
				int var3 = (int) Math.round(Math.cos(var4)*i);
				par2World.spawnEntityInWorld(new EntityLightningBolt(par2World, par3EntityPlayer.posX + var1, par3EntityPlayer.posY, par3EntityPlayer.posZ + var3));
				var4 += Math.PI / 8.0D;
			}
		}
		
	}
}
