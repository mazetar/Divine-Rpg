package xolova.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFrostClawCannon extends Item
{

	public ItemFrostClawCannon(int par1) {
		super(par1);
		this.setMaxDamage(10000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(Block.cactus.blockID))
        {
            return var1;
        }
        else
        {
            var2.playSoundAtEntity(var3, "xolovon.FrostclawCannon", 1.0F, 1.0F);
            var3.inventory.consumeInventoryItem(Block.cactus.blockID);
            var2.spawnEntityInWorld(new EntityFrostClaw(var2, var3));
            var1.damageItem(1, var3);
        }

        return var1;
    }
    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("21 Ranged Damage");
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
        	par3List.add("Infinite Uses");
        }
    }

}