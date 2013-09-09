package net.divinerpg.items.overworld;

import java.util.List;

import net.divinerpg.entities.overworld.projectile.EntityAnchor;
import net.divinerpg.items.ItemDivineRPG;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ItemBaseAnchor extends ItemDivineRPG {
	private int dmg;

	public ItemBaseAnchor(int id, int damage) {
		super(id);
		this.dmg = damage;
		this.maxStackSize = 1;
		this.setCreativeTab(DivineTabs.tabRanged);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(OverworldItemHelper.sharkAnchor.itemID))
        {
            return var1;
        }
        else
        {
            var2.playSoundAtEntity(var3, "xolovon.blitz", 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityAnchor(var2, var3, this.dmg));
            return var1;
        }
    }
	
    public int getDamageVsEntity(Entity var1) {
        return this.dmg;
    }
    
	
	@Override
	public Icon getIconFromDamageForRenderPass(int par1, int par2) {
		return getIconFromDamage(par1);
	}

	
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.dmg + " Ranged Damage");
    }
}
