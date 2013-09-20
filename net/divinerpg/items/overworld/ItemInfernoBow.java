package net.divinerpg.items.overworld;

import java.util.List;

import net.divinerpg.entities.overworld.projectile.EntityFireArrow;
import net.divinerpg.items.core.DivineBow;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInfernoBow extends DivineBow
{
    public ItemInfernoBow(int id)
    {
        super(id, 10000, 1, true);
        this.maxStackSize = 1;
    }

    @Override
    public int getItemID() {
    
    	return OverworldItemHelper.infernoBow.itemID;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
    	int var6 = this.getMaxItemUseDuration(var1) - var4;
    	float var7 = (float)var6 / 20.0F;
    	var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

    	if ((double)var7 < 0.1D)
    	{
    		return;
    	}

    	boolean var8 = false;

    	if (var7 > 1.0F)
    	{
    		if (var7 > 9.0F)
    		{
    			var8 = true;
    		}

    		var7 = 1.0F;
    	}

    	EntityFireArrow var9 = new EntityFireArrow(var2, var3, var7 * 2.0F);

    	if (var7 >= 1.0F)
    	{
    		var9.arrowCritical = true;
    	}

    	int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

    	if (var10 > 0)
    	{
    		var9.setDamage(var9.getDamage() + (double)var10 * 0.5D + 0.5D);
    	}

    	int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

    	if (var11 > 0)
    	{
    		var9.setKnockbackStrength(var11);
    	}

    	if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
    	{
    		var9.setFire(100);
    	}

    	var1.damageItem(1, var3);
    	var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

    	if (!var2.isRemote)
    	{
    		var2.spawnEntityInWorld(var9);
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

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("2 Ranged Fire Damage");
        par3List.add(this.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
