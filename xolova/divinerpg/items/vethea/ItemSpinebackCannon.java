package xolova.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpinebackCannon extends ItemVetheanCannon
{

    private int counter;

	public ItemSpinebackCannon(int par1, int par2, String name)
    {
        super(par1, par2, name);
        this.counter = 20;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
    	if (this.counter == 0)
    	{
            if (!par2.isRemote && (par3.capabilities.isCreativeMode || par3.inventory.consumeInventoryItem(VetheaItemHelper.rockChunks.itemID)))
            {
                par2.playSoundAtEntity(par3, "xolovon.blitz", 1.0F, 1.0F);
                par2.spawnEntityInWorld(new EntitySpinebackCannonShot(par2, par3, this.damage));
                this.counter = 20;
            }
    	}
    	else if (this.counter > 0)
    	{
    		this.counter--;
    	}

        return par1;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) 
    {
    	super.onPlayerStoppedUsing(par1ItemStack, par2World, par3EntityPlayer, par4);
    	this.counter = 20;
    }


    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.damage + " Ranged Damage");
        par3List.add("Ammo: " + DivineRPG.rockChunks.getItemName());
        par3List.add("\u00a72Vethean");
    }
}