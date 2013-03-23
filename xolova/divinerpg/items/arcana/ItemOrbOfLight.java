package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;

public class ItemOrbOfLight extends Item
{

	public ItemOrbOfLight(int par1) {
		super(par1);
	}
	
    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    	if(par3Entity instanceof EntityPlayerMP)
    	{
    		
    		if(par2World.getBlockMaterial((int)par3Entity.posX, (int)par3Entity.posY, (int)par3Entity.posZ) == Material.air || par2World.getBlockId((int)par3Entity.posX, (int)par3Entity.posY, (int)par3Entity.posZ) == DivineRPG.blockOfLight.blockID)
    		{	
    			par2World.setBlock((int)par3Entity.posX, (int)par3Entity.posY, (int)par3Entity.posZ, DivineRPG.blockOfLight.blockID);
    		}
    	}
    }

}
