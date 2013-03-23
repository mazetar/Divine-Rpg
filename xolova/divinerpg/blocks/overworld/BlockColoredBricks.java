package xolova.blued00r.divinerpg.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredBricks extends Block
{
    public static final String[] blockStepTypes = new String[0];
    private boolean blockType;

    public BlockColoredBricks(int var1, int var2, Material var3)
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
                return 81;

            case 1:
                return 82;

            case 2:
                return 83;

            case 3:
                return 89;

            case 4:
                return 160;

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
                return DivineRPG.clrdbricks.blockID;

            case 1:
                return DivineRPG.clrdbricks.blockID;

            case 2:
                return DivineRPG.clrdbricks.blockID;

            case 3:
                return DivineRPG.clrdbricks.blockID;

            case 4:
                return DivineRPG.clrdbricks.blockID;

            default:
                return DivineRPG.clrdbricks.blockID;
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

            default:
                return 0;
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
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
    }
}
