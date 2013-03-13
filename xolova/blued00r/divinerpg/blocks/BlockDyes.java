package xolova.blued00r.divinerpg.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDyes extends Block
{
    public static final String[] blockStepTypes = new String[0];
    private boolean blockType;

    public BlockDyes(int var1, int var2, Material var3)
    {
        super(var1, var2, Material.rock);
        this.blockIndexInTexture = var2;
        this.setLightOpacity(255);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        switch (var2)
        {
            case 0:
                return 73;

            case 1:
                return 111;

            case 2:
                return 75;

            case 3:
                return 88;

            case 4:
                return 87;

            case 5:
                return 86;

            case 6:
                return 74;

            case 7:
                return 50;

            case 8:
                return 110;

            case 9:
                return 84;

            case 10:
                return 83;

            case 11:
                return 132;

            case 12:
                return 133;

            case 13:
                return 85;

            case 14:
                return 79;

            default:
                return var2;
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        switch (var1)
        {
            case 0:
                return DivineRPG.dyeblocks.blockID;

            case 1:
                return DivineRPG.dyeblocks.blockID;

            case 2:
                return DivineRPG.dyeblocks.blockID;

            case 3:
                return DivineRPG.dyeblocks.blockID;

            case 4:
                return DivineRPG.dyeblocks.blockID;

            case 5:
                return DivineRPG.dyeblocks.blockID;

            case 6:
                return DivineRPG.dyeblocks.blockID;

            case 7:
                return DivineRPG.dyeblocks.blockID;

            case 8:
                return DivineRPG.dyeblocks.blockID;

            case 9:
                return DivineRPG.dyeblocks.blockID;

            case 10:
                return DivineRPG.dyeblocks.blockID;

            case 11:
                return DivineRPG.dyeblocks.blockID;

            case 12:
                return DivineRPG.dyeblocks.blockID;

            case 13:
                return DivineRPG.dyeblocks.blockID;

            case 14:
                return DivineRPG.dyeblocks.blockID;

            default:
                return DivineRPG.dyeblocks.blockID;
        }
    }

    public int quantityDropped(int var1, int var2, Random var3)
    {
        switch (var1)
        {
            case 0:
                return 1;

            case 1:
                return 1;

            case 2:
                return 1;

            case 3:
                return 1;

            case 4:
                return 1;

            case 5:
                return 1;

            case 6:
                return 1;

            case 7:
                return 1;

            case 8:
                return 1;

            case 9:
                return 1;

            case 10:
                return 1;

            case 11:
                return 1;

            case 12:
                return 1;

            case 13:
                return 1;

            case 14:
                return 1;

            default:
                return 0;
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        switch (var1)
        {
            case 0:
                return 0;

            case 1:
                return 1;

            case 2:
                return 2;

            case 3:
                return 3;

            case 4:
                return 4;

            case 5:
                return 5;

            case 6:
                return 6;

            case 7:
                return 7;

            case 8:
                return 8;

            case 9:
                return 9;

            case 10:
                return 10;

            case 11:
                return 11;

            case 12:
                return 12;

            case 13:
                return 13;

            case 14:
                return 14;

            default:
                return 0;
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int var1, CreativeTabs var2, List var3)
    {
        var3.add(new ItemStack(var1, 1, 0));
        var3.add(new ItemStack(var1, 1, 1));
        var3.add(new ItemStack(var1, 1, 2));
        var3.add(new ItemStack(var1, 1, 3));
        var3.add(new ItemStack(var1, 1, 4));
        var3.add(new ItemStack(var1, 1, 5));
        var3.add(new ItemStack(var1, 1, 6));
        var3.add(new ItemStack(var1, 1, 7));
        var3.add(new ItemStack(var1, 1, 8));
        var3.add(new ItemStack(var1, 1, 9));
        var3.add(new ItemStack(var1, 1, 10));
        var3.add(new ItemStack(var1, 1, 11));
        var3.add(new ItemStack(var1, 1, 12));
        var3.add(new ItemStack(var1, 1, 13));
        var3.add(new ItemStack(var1, 1, 14));
    }
}
