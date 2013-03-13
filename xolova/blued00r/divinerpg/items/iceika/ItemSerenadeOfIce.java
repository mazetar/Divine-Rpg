package xolova.blued00r.divinerpg.items.iceika;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityFractite;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityIce;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemSerenadeOfIce extends Item
{

	public ItemSerenadeOfIce(int par1)
	{
		super(par1);
		this.setMaxDamage(100);
		this.setCreativeTab(DivineRPG.tabRanged);
	}
	
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!var2.isRemote)
        {
            var2.spawnEntityInWorld(new EntityIce(var2, var3, new ItemStack(Item.potion.itemID, 1, 16458)));
            var1.damageItem(1, var3);
        }

        return var1;
    }
    
	@Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Slow" + " Ranged Damage");
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
