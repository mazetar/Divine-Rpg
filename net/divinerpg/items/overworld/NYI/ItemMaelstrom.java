package net.divinerpg.items.overworld.NYI;

import java.util.List;

import net.divinerpg.entities.overworld.projectile.EntityStromBall;
import net.divinerpg.items.ItemDivine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaelstrom extends ItemDivine
{
    private int damage;
    private int firetick;
    private int firemax;
    private String firesound;
    private String reloadsound;

    // Seems like a ItemBowCannon with EntityStromBall for the projectile?
    // Create a new constructor in ItemBowCannon which allows us to specify a different projectile? 
    //TODO: Clean up Maelstrom item --MAZ.
    
    public ItemMaelstrom(int var1, int var2, int var3, int var4, String var5, String var6)
    {
        super(var1);
        this.damage = var2;
        this.firemax = var4;
        this.firetick = this.firemax;
        this.firesound = var5;
        this.reloadsound = var6;
        this.setMaxStackSize(1);
        this.setMaxDamage(100);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote)
        {
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                var2.spawnEntityInWorld(new EntityStromBall(var2, var3));
                var2.playSoundAtEntity(var3, "xolovon.maelstrom", 1.0F, 1.0F);
                var1.damageItem(1, var3);
                this.firetick = 0;
            }
            else
            {
                ++this.firetick;
            }

            if (this.firemax == 0)
            {
                var2.spawnEntityInWorld(new EntityStromBall(var2, var3));
                var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
                var1.damageItem(1, var3);
            }
        }

        return var1;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.firetick = this.firemax;
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
        par3List.add("14 Ranged Damage");
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
