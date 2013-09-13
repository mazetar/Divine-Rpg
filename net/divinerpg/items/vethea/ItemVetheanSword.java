package net.divinerpg.items.vethea;

import java.util.List;

import net.divinerpg.items.core.DivineSword;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanSword extends DivineSword
{
    public ItemVetheanSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setMaxDamage(-1);
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        // TODO: Figure out the new getDmgVsEntity!
        par3List.add(((ItemSword) par1ItemStack.getItem()).func_82803_g() + " Melee Damage");
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
        	par3List.add("Infinite Uses");
        }
        if (this instanceof ItemVetheanClaw)
        {
        	par3List.add("Can not Block");
        }
        par3List.add("\u00a72Vethean");
    }
    
}