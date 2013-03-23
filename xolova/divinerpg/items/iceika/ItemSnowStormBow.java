package xolova.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSnowStormBow extends ItemBow 
{
    private int lastDamage = -1;
    private String[] texture = new String[] {"snowstormBow_0", "snowstormBow_1", "snowstormBow_2"};
    private Icon[] field_94600_b;
    
    public ItemSnowStormBow(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
    }
	
    /**
     * How long it takes to use or consume an item
     */
	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 144000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        ArrowNockEvent var4 = new ArrowNockEvent(var3, var1);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.isCanceled())
        {
            return var4.result;
        }
        else
        {
        	var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));

            return var1;
        }
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.lastDamage = -1;
        int var5 = this.getMaxItemUseDuration(var1) - var4;
        var5 = (int)((float)var5 / 0.5);
        float var6 = (float)var5 / 20.0F;
        var6 = (var6 * var6 + var6 * 2.0F) / 3.0F;

        if ((double)var6 >= 0.1D * (double)0.5)
        {
            boolean var7 = false;

            if (var6 > 1.0F)
            {
                if (var6 > 9.0F)
                {
                    var7 = true;
                }

                var6 = 1.0F;
            }

            EntityExplosiveArrow var8 = new EntityExplosiveArrow(var2, var3, var6 * 2.0F);
            var2.playSoundAtEntity(var3, "xolovon.BluefireBow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var6 * 0.5F);

            if (!var2.isRemote)
            {
                var2.spawnEntityInWorld(var8);
            }
        }
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
        par3List.add("2 Explosive" + " Ranged Damage");
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
