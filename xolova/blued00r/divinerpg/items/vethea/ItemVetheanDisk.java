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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanDisk extends Item
{
    protected int damage;
    private Item item;

	public ItemVetheanDisk(int par1, int par2, Item item)
    {
        super(par1);
        this.maxStackSize = 1;
        this.damage = par2;
        this.item = item;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.damage + " Ranged Damage");
        par3List.add("Returns to sender");
        par3List.add("§2Vethean");
    }
    
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par3.capabilities.isCreativeMode)
        {
            --par1.stackSize;
        }

        par2.playSoundAtEntity(par3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2.isRemote)
        {
            par2.spawnEntityInWorld(new EntityDisk(par2, par3, this.damage, item));
        }

        return par1;
    }
}