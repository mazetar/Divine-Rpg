package net.divinerpg.blocks.twilight;

import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPG;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockAzuriteGrass extends BlockDivineRPG
{

	public BlockAzuriteGrass(int var1)
    {
        super(var1, 2, Material.grass);
        this.setUnlocalizedName("AzuriteGrass");
        this.setTickRandomly(true);
    }
	
	public int getSheet(int side, int metadata)
	{
		return 2;
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
