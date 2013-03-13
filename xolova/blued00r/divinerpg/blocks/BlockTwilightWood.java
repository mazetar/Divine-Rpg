package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockTwilightWood extends Block
{
    public BlockTwilightWood(int var1)
    {
        super(var1, 4, Material.wood);
        this.setCreativeTab(DivineRPG.tabBlocks);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 31;
    }

    public int func_85104_a(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        int var10 = par9 & 3;
        byte var11 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;

            case 2:
            case 3:
                var11 = 8;
                break;

            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
    }

    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        int var3 = par2 & 12;
        int var4 = par2 & 3;

        if (this.blockID == DivineRPG.yellowWood.blockID)
        {
            return var3 == 0 && (par1 == 1 || par1 == 0) ? 166 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 166 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 166 : 165));
        }

        if (this.blockID == DivineRPG.redWood.blockID)
        {
            return var3 == 0 && (par1 == 1 || par1 == 0) ? 168 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 168 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 168 : 167));
        }

        if (this.blockID == DivineRPG.purpleWood.blockID)
        {
            return var3 == 0 && (par1 == 1 || par1 == 0) ? 182 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 182 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 182 : 181));
        }

        if (this.blockID == DivineRPG.blueWood.blockID)
        {
            return var3 == 0 && (par1 == 1 || par1 == 0) ? 184 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 184 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 184 : 183));
        }

        if (this.blockID == DivineRPG.greenWood.blockID)
        {
            return var3 == 0 && (par1 == 1 || par1 == 0) ? 186 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 186 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 186 : 185));
        }

        if (this.blockID == DivineRPG.whiteWood.blockID)
        {
            return var3 == 0 && (par1 == 1 || par1 == 0) ? 188 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 188 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 188 : 187));
        }

        return var3 == 0 && (par1 == 1 || par1 == 0) ? 21 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 21 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 21 : (var4 == 1 ? 116 : (var4 == 2 ? 117 : (var4 == 3 ? 153 : 20)))));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
