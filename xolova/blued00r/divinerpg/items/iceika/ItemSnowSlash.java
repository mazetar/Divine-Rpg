package xolova.blued00r.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSnowSlash extends ItemSword
{
    private int weaponDamage;
    private final EnumToolMaterial field_40439_b;	
	
    public ItemSnowSlash(int par1, EnumToolMaterial var2)
    {
		super(par1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(150);
        this.weaponDamage = 38;
	}
    
    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2.blockID != Block.web.blockID ? 1.5F : 15.0F;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLiving var3)
    {
    	var2.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 1));
        var1.damageItem(1, var3);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack var1, int var2, int var3, int var4, int var5, EntityLiving var6)
    {
        var1.damageItem(2, var6);
        return true;
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return weaponDamage;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block var1)
    {
        return var1.blockID == Block.web.blockID;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return this.field_40439_b.getEnchantability();
    }

	@Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(par1ItemStack.getDamageVsEntity(par2EntityPlayer) + " Melee Damage");
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