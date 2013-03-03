package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xolova.blued00r.divinerpg.entities.vethea.EntityDisk;
import xolova.blued00r.divinerpg.entities.vethea.EntitySpinebackStaffShot;
import xolova.blued00r.divinerpg.misc.ArcanaList;

public class ItemSpinebackStaff extends ItemVetheanStaff
{

	public ItemSpinebackStaff(int par1, int par2, int par3)
    {
        super(par1, par2, par3);
    }

    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("Large explosive shot");
    	super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
    }
    
    protected void shoot(World par2, EntityPlayer par3)
    {
    	par2.playSoundAtEntity(par3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
    	par2.spawnEntityInWorld(new EntitySpinebackStaffShot(par2, par3));
    }
}