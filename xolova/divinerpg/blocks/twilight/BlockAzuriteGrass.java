package xolova.divinerpg.blocks.twilight;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BlockAzuriteGrass extends BlockDivineRPG
{

	public BlockAzuriteGrass(int var1)
    {
        super(var1, 2, Material.grass);
        this.setUnlocalizedName("AzuriteGrass");
        this.setTickRandomly(true);
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        switch (par1)
        {
            case 0:
                return TwilightBlockHelper.AzuriteDirt.getBlockTextureFromSide(0);

            case 1:
                return this.texture[0];

            default:
                return this.texture[1];
        }
    }

    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote)
        {
            if (var1.getBlockLightValue(var2, var3 + 1, var4) < 4 && Block.lightOpacity[var1.getBlockId(var2, var3 + 1, var4)] > 2)
            {
                var1.setBlock(var2, var3, var4, TwilightBlockHelper.AzuriteDirt.blockID);
            }
            else if (var1.getBlockLightValue(var2, var3 + 1, var4) >= 9)
            {
                for (int var6 = 0; var6 < 4; ++var6)
                {
                    int var7 = var2 + var5.nextInt(3) - 1;
                    int var8 = var3 + var5.nextInt(5) - 3;
                    int var9 = var4 + var5.nextInt(3) - 1;
                    int var10 = var1.getBlockId(var7, var8 + 1, var9);

                    if (var1.getBlockId(var7, var8, var9) == TwilightBlockHelper.AzuriteDirt.blockID && var1.getBlockLightValue(var7, var8 + 1, var9) >= 4 && Block.lightOpacity[var10] <= 2)
                    {
                        var1.setBlock(var7, var8, var9, TwilightBlockHelper.AzuriteGrass.blockID);
                    }
                }
            }
        }
    }
    
    @Override
    public int idDropped(int var1, Random var2, int var3)
    {
        return TwilightBlockHelper.AzuriteDirt.blockID;
    }
}
