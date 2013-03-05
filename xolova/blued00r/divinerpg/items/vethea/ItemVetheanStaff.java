package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityShuriken;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;
import xolova.blued00r.divinerpg.entities.vethea.EntityDisk;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanStaff extends Item
{
    protected int damage;
    protected int cost;

	public ItemVetheanStaff(int par1, int par2, int par3)
    {
        super(par1);
        this.maxStackSize = 1;
        this.damage = par2;
        this.cost = par3;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Consumes " + this.cost + " Arcana");
        par3List.add("\u00a72Vethean");
    }
    
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {


        if (!par2.isRemote && ArcanaList.get(par3.getEntityName()).arcanaUse(this.cost))
        {
            this.shoot(par2, par3);
        }

        return par1;
    }
    
    protected void shoot(World par2, EntityPlayer par3)
    {
    }
}