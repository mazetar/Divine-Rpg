package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemSpawners extends Item
{
    private World worldObj;

    public ItemSpawners(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var3.isRemote)
        {
            return true;
        }
        else
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            var4 += Facing.offsetsXForSide[var7];
            var5 += Facing.offsetsYForSide[var7];
            var6 += Facing.offsetsZForSide[var7];
            double var12 = 0.0D;

            if (var7 == 1 && var11 == Block.fence.blockID || var11 == Block.netherFence.blockID)
            {
                var12 = 0.5D;
            }

            if (var2 instanceof EntityPlayerMP)
            {
                EntityPlayerMP var14 = (EntityPlayerMP)var2;

                if (var2.ridingEntity == null && var2.riddenByEntity == null && var2 instanceof EntityPlayer && var14.dimension != 0 && spawnCreature(var3, var1.getItemDamage(), (double)var4 + 0.5D, (double)var5 + var12, (double)var6 + 0.5D) && !var2.capabilities.isCreativeMode)
                {
                    --var1.stackSize;
                }
            }

            return true;
        }
    }

    public static boolean spawnCreature(World var0, int var1, double var2, double var4, double var6)
    {
        Entity var8 = EntityList.createEntityByID(118, var0);

        if (var8 != null)
        {
            var8.setLocationAndAngles(var2, var4, var6, var0.rand.nextFloat() * 360.0F, 0.0F);
            var0.spawnEntityInWorld(var8);
            var0.playSoundAtEntity(var8, "mob.RPG.SoulFiendSpawn", 25.0F, 1.0F);
        }

        return var8 != null;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
