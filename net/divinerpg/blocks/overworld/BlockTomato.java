package net.divinerpg.blocks.overworld;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPGFlower;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockTomato extends BlockDivineRPGFlower
{
    public BlockTomato(int var1, int var2)
    {
        super(var1, var2);
        this.setTickRandomly(true);
        float var3 = 0.5F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(int var1)
    {
        return var1 == Block.tilledField.blockID;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        super.checkFlowerChange(var1, var2, var3, var4);

        if (var1.getBlockLightValue(var2, var3 + 1, var4) >= 9)
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);

            if (var6 < 6)
            {
                float var7 = this.getGrowthRate(var1, var2, var3, var4);

                if (var5.nextInt((int)(25.0F / var7) + 1) == 0)
                {
                    ++var6;
                    var1.setBlockMetadataWithNotify(var2, var3, var4, var6, 3);
                }
            }
        }
    }

    public void fertilize(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        ItemStack var6 = var5.inventory.getCurrentItem();

        if (var6 != null && var6.itemID == Item.dyePowder.itemID && var6.getItemDamage() == 15)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 6, 3);
            --var6.stackSize;
            var1.notifyBlockChange(var2, var3, var4, 0);
        }
    }

    private float getGrowthRate(World var1, int var2, int var3, int var4)
    {
        float var5 = 1.0F;
        int var6 = var1.getBlockId(var2, var3, var4 - 1);
        int var7 = var1.getBlockId(var2, var3, var4 + 1);
        int var8 = var1.getBlockId(var2 - 1, var3, var4);
        int var9 = var1.getBlockId(var2 + 1, var3, var4);
        int var10 = var1.getBlockId(var2 - 1, var3, var4 - 1);
        int var11 = var1.getBlockId(var2 + 1, var3, var4 - 1);
        int var12 = var1.getBlockId(var2 + 1, var3, var4 + 1);
        int var13 = var1.getBlockId(var2 - 1, var3, var4 + 1);
        boolean var14 = var8 == this.blockID || var9 == this.blockID;
        boolean var15 = var6 == this.blockID || var7 == this.blockID;
        boolean var16 = var10 == this.blockID || var11 == this.blockID || var12 == this.blockID || var13 == this.blockID;

        for (int var17 = var2 - 1; var17 <= var2 + 1; ++var17)
        {
            for (int var18 = var4 - 1; var18 <= var4 + 1; ++var18)
            {
                int var19 = var1.getBlockId(var17, var3 - 1, var18);
                float var20 = 0.0F;

                if (var19 == Block.tilledField.blockID)
                {
                    var20 = 1.0F;

                    if (var1.getBlockMetadata(var17, var3 - 1, var18) > 0)
                    {
                        var20 = 3.0F;
                    }
                }

                if (var17 != var2 || var18 != var4)
                {
                    var20 /= 4.0F;
                }

                var5 += var20;
            }
        }

        if (var16 || var14 && var15)
        {
            var5 /= 2.0F;
        }

        return var5;
    }

    public boolean blockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        this.fertilize(var1, var2, var3, var4, var5);
        return false;
    }

    public int getRenderType()
    {
        return 6;
    }

    public ArrayList getBlockDropped(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        ArrayList var7 = new ArrayList();

        if (var5 == 6)
        {
            var7.add(new ItemStack(OverworldItemHelper.tomato));
        }

        for (int var8 = 0; var8 < 3 + var6; ++var8)
        {
            if (var1.rand.nextInt(15) <= var5)
            {
                var7.add(new ItemStack(OverworldItemHelper.tomatoSeeds));
            }
        }

        return var7;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return var1 == 6 ? OverworldItemHelper.tomato.itemID : -1;
    }

    public int setBlockBounds(Random var1)
    {
        return 2;
    }
}
