package net.divinerpg.items.arcana;

import java.util.List;

import net.divinerpg.entities.arcana.projectile.EntityGrenade;
import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrenadeLauncher extends ItemDivine
{
	private int damage;
	private int firetick;
	private int firemax;
	private String firesound;
	private String reloadsound;

	public ItemGrenadeLauncher(int var1, int var4)
	{
		super(var1);
		this.firemax = var4;
		this.firetick = 0;
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{ 
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(ArcanaItemHelper.grenade.itemID))
        {
            return var1;
        }
        else
        {
        	var3.inventory.consumeInventoryItem(ArcanaItemHelper.grenade.itemID);
        	var2.playSoundAtEntity(var3, "xolovon.LaVekor", 2.0F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			var2.spawnEntityInWorld(new EntityGrenade(var2, var3));
			return var1;
		}
	}

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.none;
    }

	/**
	 * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	 */
	public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
	{
		this.firetick = 0;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Launches explosive projectiles");
		par3List.add("Ammo: Grenade");
		par3List.add("Infinite Uses");
	}
}