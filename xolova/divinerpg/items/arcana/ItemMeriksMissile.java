package xolova.blued00r.divinerpg.items;

import java.util.List;
import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.entities.arcana.projectile.EntityMerikMissile;
import xolova.divinerpg.utils.ArcanaBar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMeriksMissile extends ItemBow
{
    private int lastDamage = -1;

    public ItemMeriksMissile(int var1)
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
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(DivineRPGTwilight.DivineRPGTwilight.itemID))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
        int var6 = this.getMaxItemUseDuration(par1ItemStack) - par4;
        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, var6);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.isCanceled())
        {
            return;
        }

        var6 = event.charge;
        boolean var5 = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (ArcanaBar.get(par3EntityPlayer.username).arcanaUse((5 * var6 / 25) * 10))
        {
            float var7 = (float)var6 / 20.0F;
            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

            if ((double)var7 < 0.1D)
            {
                return;
            }

            if (var7 > 1.0F)
            {
                var7 = 1.0F;
            }

            EntityMerikMissile var8 = new EntityMerikMissile(par2World, par3EntityPlayer, 0.6F, var6);

            int var9 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);
            
            if (var9 > 0)
            {
                var8.setDamage((int) ((var7 * (double)var9 * 0.5D + 0.5D) * 2));
            }
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);
            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(var8);
            }
        }
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.none;
    }

    public int getIconIndex(ItemStack var1, int var2, EntityPlayer var3, ItemStack var4, int var5)
    {
        if (var4 != null)
        {
            int var6 = var4.getMaxItemUseDuration() - var3.getItemInUseCount();

            if ((float)var6 >= 40.0F * DivineRPGTwilight.increaseBowTime)
            {
            	return this.iconIndex + 3;
            }

            if ((float)var6 >= 18.0F * DivineRPGTwilight.increaseBowTime)
            {
            	return this.iconIndex + 2;
            }

            if ((float)var6 > 13.0F * DivineRPGTwilight.increaseBowTime)
            {
            	return this.iconIndex + 1;
            }

            if (var6 > 0)
            {
            	return this.iconIndex;
            }
        }

    	return this.iconIndex;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
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

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("2 Arcana Minimum");
        par3List.add("Explosive homing projectile");
    }
}