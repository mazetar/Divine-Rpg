package net.divinerpg.blocks.overworld;

import java.util.List;
import java.util.Random;

import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SuppressWarnings("unused")
public class BlockMiniBricks extends BlockDivine
{
    public static final String[] blockStepTypes = new String[0];
    private boolean blockType;

    public BlockMiniBricks(int var1, Material var3)
    {
        super(var1, Material.rock);
        this.setLightOpacity(255);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        switch (var1)
        {
            case 0:
                return OverworldBlockHelper.miniBricks.blockID;

            case 1:
                return OverworldBlockHelper.miniBricks.blockID;

            case 2:
                return OverworldBlockHelper.miniBricks.blockID;

            case 3:
                return OverworldBlockHelper.miniBricks.blockID;

            case 4:
                return OverworldBlockHelper.miniBricks.blockID;

            case 5:
                return OverworldBlockHelper.miniBricks.blockID;

            case 6:
                return OverworldBlockHelper.miniBricks.blockID;

            case 7:
                return OverworldBlockHelper.miniBricks.blockID;

            case 8:
                return OverworldBlockHelper.miniBricks.blockID;

            default:
                return OverworldBlockHelper.miniBricks.blockID;
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

            default:
                return 0;
        }
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubBlocks(int var1, CreativeTabs var2, List var3)
    {
        var3.add(new ItemStack(var1, 1, 0));
        var3.add(new ItemStack(var1, 1, 1));
        var3.add(new ItemStack(var1, 1, 2));
        var3.add(new ItemStack(var1, 1, 4));
        var3.add(new ItemStack(var1, 1, 5));
        var3.add(new ItemStack(var1, 1, 6));
        var3.add(new ItemStack(var1, 1, 8));
    }
}
