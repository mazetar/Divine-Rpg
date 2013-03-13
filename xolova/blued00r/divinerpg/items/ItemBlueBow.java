package xolova.blued00r.divinerpg.items;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityExplosiveArrow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlueBow extends ItemBow
{
    private int lastDamage = -1;

    public ItemBlueBow(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        ArrowNockEvent var4 = new ArrowNockEvent(var3, var1);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.isCanceled())
        {
            return var4.result;
        }
        else
        {
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(DivineRPG.bluefirebow.itemID))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.lastDamage = -1;
        int var5 = this.getMaxItemUseDuration(var1) - var4;
        var5 = (int)((float)var5 / DivineRPG.increaseBowTime);
        float var6 = (float)var5 / 20.0F;
        var6 = (var6 * var6 + var6 * 2.0F) / 3.0F;

        if ((double)var6 >= 0.1D * (double)DivineRPG.increaseBowTime)
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

    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            int var6 = var4.getMaxItemUseDuration() - var3.getItemInUseCount();

            if ((float)var6 >= 40.0F * DivineRPG.increaseBowTime)
            {
                return this.iconIndex + 4;
            }

            if ((float)var6 >= 18.0F * DivineRPG.increaseBowTime)
            {
                return this.iconIndex + 3;
            }

            if ((float)var6 > 13.0F * DivineRPG.increaseBowTime)
            {
                return this.iconIndex + 2;
            }

            if (var6 > 0)
            {
                return this.iconIndex + 1;
            }
        }

        return this.iconIndex;
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

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("2 Ranged Damage");
        par3List.add("Explosion on Entity Impact");
        par3List.add("Infinite Uses");
    }
}
