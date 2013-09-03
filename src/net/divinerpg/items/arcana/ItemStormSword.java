package net.divinerpg.items.arcana;

import net.divinerpg.items.core.ItemDivineRPGSword;
import net.divinerpg.utils.helpers.ArcanaHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStormSword extends ItemDivineRPGSword
{
	public ItemStormSword(int par1, EnumToolMaterial par2)
	{
		super(par1, par2 ,true);
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if (ArcanaHelper.useBar(par3EntityPlayer, 20))
    	{
    		this.createLightning(par2World, par3EntityPlayer);
    	}
    	    	
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
    	if (ArcanaHelper.useBar(player, 20))
    	{
        	this.createLightning(player.worldObj, player);
    	}
    	    	
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
