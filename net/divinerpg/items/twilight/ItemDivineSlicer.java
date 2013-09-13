package net.divinerpg.items.twilight;

import java.util.List;

import net.divinerpg.entities.twilight.projectile.EntitySlicer;
import net.divinerpg.items.ItemDivine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineSlicer extends ItemDivine
{
    int dmg;
    public ItemDivineSlicer(int id, int dmg)
    {
        super(id);
        this.dmg = dmg;
        this.maxStackSize = 64;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --itemStack.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new EntitySlicer(world, player, dmg));
        }

        return itemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add( "" + dmg + " Ranged Damage");
        par3List.add("1 Use");
    }
}
