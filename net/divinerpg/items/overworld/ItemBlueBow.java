package net.divinerpg.items.overworld;

import java.util.List;
import java.util.Random;

import net.divinerpg.entities.overworld.projectile.EntityExplosiveArrow;
import net.divinerpg.items.core.DivineBow;
import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlueBow extends DivineBow
{
    private int lastDamage = -1;

    public ItemBlueBow(int var1)
    {
        super(var1, -1, var1, true);
        this.setMaxStackSize(1);
    }

    @Override
    public int getItemID() {
    	
    	return IceikaItemHelper.bluefireBow.itemID;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.lastDamage = -1;
        int var5 = this.getMaxItemUseDuration(var1) - var4;
        var5 = (int)((float)var5 / 1.0F);
        float var6 = (float)var5 / 20.0F;
        var6 = (var6 * var6 + var6 * 2.0F) / 3.0F;

        if ((double)var6 >= 0.1D * (double)1.0F)
        {
            boolean var7 = false;

            if (var6 > 1.0F)
            {
                if (var6 > 9.0F)
                {
                    var7 = true;
                }

                var6 = 1.0F;
            }

            EntityExplosiveArrow var8 = new EntityExplosiveArrow(var2, var3, var6 * 2.0F);
            var2.playSoundAtEntity(var3, "xolovon.BluefireBow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var6 * 0.5F);

            if (!var2.isRemote)
            {
                var2.spawnEntityInWorld(var8);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void onUsingItemTick(ItemStack var1, EntityPlayer var2, int var3)
    {
        super.onUsingItemTick(var1, var2, var3);
        int var4 = var1.getMaxItemUseDuration() - var2.getItemInUseCount();

        if (var4 > 100 && (new Random()).nextInt(100) == 0)
        {
            var1.damageItem(var4 / 100, var2);
        }

        if (var1.getItemDamage() < this.lastDamage)
        {
            this.onPlayerStoppedUsing(var1, ModLoader.getMinecraftInstance().theWorld, var2, var2.getItemInUseCount());
            var2.setItemInUse((ItemStack)null, 0);
            var2.inventory.setInventorySlotContents(var2.inventory.currentItem, (ItemStack)null);
        }
        else
        {
            this.lastDamage = var1.getItemDamage();
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
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("2 Ranged Damage");
        par3List.add("Explosion on Entity Impact");
        par3List.add("Infinite Uses");
    }
}
