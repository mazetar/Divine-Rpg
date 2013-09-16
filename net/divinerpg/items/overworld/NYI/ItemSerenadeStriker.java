package net.divinerpg.items.overworld.NYI;

import java.util.List;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSerenadeStriker extends Item
{
    public ItemSerenadeStriker(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(100);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        float var4 = var3.rotationPitch;
        float var5 = var3.rotationYaw;
        double var6 = var3.posX;
        double var8 = var3.posY + 1.62D - (double)var3.yOffset;
        double var10 = var3.posZ;
        Vec3 var12 = var2.getWorldVec3Pool().getVecFromPool(var6, var8, var10);
        float var13 = MathHelper.cos(-var5 * 0.01745329F - (float)Math.PI);
        float var14 = MathHelper.sin(-var5 * 0.01745329F - (float)Math.PI);
        float var15 = -MathHelper.cos(-var4 * 0.01745329F);
        float var16 = MathHelper.sin(-var4 * 0.01745329F);
        float var17 = var14 * var15;
        float var18 = var13 * var15;
        double var19 = 30.0D;
        Vec3 var21 = var12.addVector((double)var17 * var19, (double)var16 * var19, (double)var18 * var19);
        MovingObjectPosition var22 = var2.clip(var12, var21, false);

        if (var22 == null)
        {
            return var1;
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

                var2.playSoundAtEntity(var3,  "xolovon.serenade", 1.0F, 1.0F);
                var2.spawnEntityInWorld(new EntityLightningBolt(var2, (double)var23 + 0.5D, (double)var24 + 0.5D, (double)var25 + 0.5D));
                var3.swingItem();
                var1.damageItem(1, var3);
            }

            return var1;
        }
    }

    public boolean hasEffect(ItemStack var1)
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
        par3List.add("Lightning Damage");
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}