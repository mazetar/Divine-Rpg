package xolova.divinerpg.items.overworld;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.entities.overworld.projectile.EntityBowCannon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBowCannon extends Item
{
    private int damage;
    private int reloadtick;
    private int reloadmax;
    private int clipid;
    private int firetick;
    private int firemax;
    private String firesound;
    private String reloadsound;

    public ItemBowCannon(int var1, int var2, int var3, int var4, int var5, String var6, String var7)
    {
        super(var1);
        this.damage = var2;
        this.firemax = var5;
        this.firetick = this.firemax;
        this.reloadmax = 5;
        this.reloadtick = 0;
        this.clipid = var4;
        this.firesound = var6;
        this.reloadsound = var7;
        this.setMaxStackSize(1);
        this.setMaxDamage(1000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote && var3.inventory.hasItem(this.clipid) || var3.capabilities.isCreativeMode)
        {
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                var2.spawnEntityInWorld(new EntityBowCannon(var2, var3));
                var2.playSoundAtEntity(var3, "xolovon.GhastCannon", 1.0F, 1.0F);
                var3.inventory.consumeInventoryItem(Block.cactus.blockID);
                var1.damageItem(1, var3);
                this.firetick = 0;
            }
            else
            {
                ++this.firetick;
            }

            if (this.firemax == 0 && var3.inventory.hasItem(this.clipid))
            {
                var2.spawnEntityInWorld(new EntityBowCannon(var2, var3));
                var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
                var1.damageItem(1, var3);
            }
        }
        else if (!var2.isRemote && var3.inventory.hasItem(this.clipid))
        {
            if (this.reloadtick == this.reloadmax)
            {
                this.reloadtick = 0;
                var2.playSoundAtEntity(var3, this.reloadsound, 1.0F, 1.0F);
                var3.inventory.consumeInventoryItem(this.clipid);
            }
            else
            {
                ++this.reloadtick;
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
        par3List.add("19 Ranged Damage");
        par3List.add("Ammo: Cactus Block");
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
