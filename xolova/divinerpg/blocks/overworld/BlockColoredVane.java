package xolova.divinerpg.blocks.overworld;

import java.util.List;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredVane extends BlockDivineRPG
{
    public static final String[] blockStepTypes = new String[0];
    private boolean blockType;

    public BlockColoredVane(int var1, int var2, Material var3)
    {
        super(var1, var1, Material.rock);
        this.setLightOpacity(255);
    }

    public int idDropped(int var1, Random var2, int var3)
    {
        switch (var1)
        {
            case 0:
                return TwilightBlockHelper.ColoredVane.blockID;

            case 1:
                return TwilightBlockHelper.ColoredVane.blockID;

            case 2:
                return TwilightBlockHelper.ColoredVane.blockID;

            case 3:
                return TwilightBlockHelper.ColoredVane.blockID;

            case 4:
                return TwilightBlockHelper.ColoredVane.blockID;

            default:
                return TwilightBlockHelper.ColoredVane.blockID;
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

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int var1, CreativeTabs var2, List var3)
    {
        var3.add(new ItemStack(var1, 1, 0));
        var3.add(new ItemStack(var1, 1, 1));
        var3.add(new ItemStack(var1, 1, 2));
        var3.add(new ItemStack(var1, 1, 3));
        var3.add(new ItemStack(var1, 1, 4));
    }
}
