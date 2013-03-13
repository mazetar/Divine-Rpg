package xolova.blued00r.divinerpg.items;

import java.util.List;
import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityStarfall;
import xolova.blued00r.divinerpg.misc.ArcanaBar;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaffOfStarlight extends Item
{
	private Random rand;
    public ItemStaffOfStarlight(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.rand = new Random();
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	double var6 = par3EntityPlayer.posX;
    	double var8 = par3EntityPlayer.posY + 1.62D - (double)par3EntityPlayer.yOffset;
    	double var10 = par3EntityPlayer.posZ;
    	if (!par2World.isRemote && ArcanaList.get(par3EntityPlayer.username).arcanaUse(40))
    	{
    		par2World.playSoundAtEntity(par3EntityPlayer,  "xolovon.Starlight", 1.0F, 1.0F);
    		par2World.playSoundAtEntity(par3EntityPlayer,  "xolovon.Starlight", -1.0F, 1.0F);
    		par2World.playSoundAtEntity(par3EntityPlayer,  "xolovon.Starlight", 1.0F, -1.0F);
    		par2World.playSoundAtEntity(par3EntityPlayer,  "xolovon.Starlight", -1.0F, -1.0F);
    		par3EntityPlayer.getLook(1);
    		for (int i = 0; i < 10 + rand.nextInt(6); i++)
    		{
    			par2World.spawnEntityInWorld(new EntityStarfall(par2World, (double)var6, (double)var8 + 25D, (double)var10));
    		}
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
        par3List.add("40 Arcana");
        par3List.add("Drops several stars from the sky");
        par3List.add("40 Ranged Damage Each");
        //par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
