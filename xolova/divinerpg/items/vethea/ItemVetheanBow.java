package xolova.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanBow extends ItemBow
{

	private double damageModifier;
	private Item arrow;
    private int lastDamage = -1;
    private String name;
    public final String[] texture;
    @SideOnly(Side.CLIENT)
    private Icon[] field_94600_b;
    
	public ItemVetheanBow(int par1, double par2, Item par3, String par4) {
		super(par1);
		this.damageModifier = par2;
		this.arrow = par3;
		this.setMaxDamage(-1);
		this.name = par4;
		texture = new String[] {name + "_0", name + "_1", name + "_2"};
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

        if (var5 || par3EntityPlayer.inventory.hasItem(this.arrow.itemID))
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
            par2World.playSoundAtEntity(par3EntityPlayer, "xolovon.VetheaBow", 1.0F, 1.0F);
            EntityArrow var8 = null;
            if (this.arrow == VetheaItemHelper.vetheanArrow)
            {
            	var8 = new EntityVetheanArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else if (this.arrow == VetheaItemHelper.vetheanArrow2)
            {
            	var8 = new EntityVetheanArrow2(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else if (this.arrow == VetheaItemHelper.vetheanWarArrow)
            {
            	var8 = new EntityVetheanWarArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else if (this.arrow == VetheaItemHelper.vetheanWrathArrow)
            {
            	var8 = new EntityVetheanWrathArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else
            {
            	var8 = new EntityArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            
            if (var7 == 1.0F)
            {
                var8.setIsCritical(true);
            }

            int var9 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (var9 > 0)
            {
                var8.setDamage((var8.getDamage() + (double)var9 * 0.5D + 0.5D) * this.damageModifier);
            }
            else
            {
            	var8.setDamage(var8.getDamage() * this.damageModifier);
            }

            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (var10 > 0)
            {
                var8.setKnockbackStrength(var10);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
            {
                var8.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

            if (var5)
            {
                var8.canBePickedUp = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(var8);
            }
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

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return event.result;
        }

        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(this.arrow.itemID))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(Math.ceil(10 * this.damageModifier) + " Ranged Damage");
        par3List.add("Ammo: " + this.arrow.getItemDisplayName(new ItemStack(this.arrow)));
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
        	par3List.add("Infinite Uses");
        }
        par3List.add("\u00a72Vethean");
    }

    @SideOnly(Side.CLIENT)
    public void func_94581_a(IconRegister par1IconRegister)
    {
        super.func_94581_a(par1IconRegister);
        this.field_94600_b = new Icon[texture.length];

        for (int i = 0; i < this.field_94600_b.length; ++i)
        {
            this.field_94600_b[i] = par1IconRegister.func_94245_a(texture[i]);
        }
    }

    @SideOnly(Side.CLIENT)
    public Icon func_94599_c(int par1)
    {
        return this.field_94600_b[par1];
    }
}
