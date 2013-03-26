package xolova.divinerpg.items.arcana;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import xolova.divinerpg.entities.arcana.projectile.EntityStarfall;
import xolova.divinerpg.utils.helpers.ArcanaHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStarfall  extends Item
{
    public ItemStarfall(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        float var4 = par3EntityPlayer.rotationPitch;
        float var5 = par3EntityPlayer.rotationYaw;
        double var6 = par3EntityPlayer.posX;
        double var8 = par3EntityPlayer.posY + 1.62D - (double)par3EntityPlayer.yOffset;
        double var10 = par3EntityPlayer.posZ;
        Vec3 var12 = par2World.getWorldVec3Pool().getVecFromPool(var6, var8, var10);
        float var13 = MathHelper.cos(-var5 * 0.01745329F - (float)Math.PI);
        float var14 = MathHelper.sin(-var5 * 0.01745329F - (float)Math.PI);
        float var15 = -MathHelper.cos(-var4 * 0.01745329F);
        float var16 = MathHelper.sin(-var4 * 0.01745329F);
        float var17 = var14 * var15;
        float var18 = var13 * var15;
        double var19 = 30.0D;
        Vec3 var21 = var12.addVector((double)var17 * var19, (double)var16 * var19, (double)var18 * var19);
        MovingObjectPosition var22 = par2World.rayTraceBlocks_do(var12, var21, false);

        if (var22 == null)
        {
            return par1ItemStack;
        }
        else
        {
            if (var22.typeOfHit == EnumMovingObjectType.TILE)
            {
                int var23 = var22.blockX;
                int var24 = var22.blockY;
                int var25 = var22.blockZ;
                int var26 = var22.sideHit;

                if (var26 == 0)
                {
                    --var24;
                }

                if (var26 == 1)
                {
                    ++var24;
                }

                if (var26 == 2)
                {
                    --var25;
                }

                if (var26 == 3)
                {
                    ++var25;
                }

                if (var26 == 4)
                {
                    --var23;
                }

                if (var26 == 5)
                {
                    ++var23;
                }


                if (!par2World.isRemote && ArcanaHelper.useBar(par3EntityPlayer, 5))
                {
                    par2World.playSoundAtEntity(par3EntityPlayer, "xolovon.Starlight", 1.0F, 1.0F);
                    par3EntityPlayer.getLook(1);
                    par2World.spawnEntityInWorld(new EntityStarfall(par2World, (double)var23 + 0.5D, (double)var24 + 25D, (double)var25 + 0.5D));
                }
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
        par3List.add("5 Arcana");
        par3List.add("Drops a star from the sky");
        par3List.add("40 Ranged Damage");
        //par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
