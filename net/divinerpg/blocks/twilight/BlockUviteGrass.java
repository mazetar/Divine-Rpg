package net.divinerpg.blocks.twilight;

import java.util.Random;

import net.divinerpg.blocks.BlockDivineGrass;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class BlockUviteGrass extends BlockDivineGrass
{
    public BlockUviteGrass(int var1)
    {
        super(var1);
        this.setTickRandomly(true);
    }
    
    public int getSheet(int side, int metadata)
    {
    	return 2;
    }
    
    public int getIndex(int side, int metadata)
    {
    	if(side == 1)
    		return 118;
    	else if (side == 0)
    		return 134;
    	else
    		return 135;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote)
        {
            if (var1.getBlockLightValue(var2, var3 + 1, var4) < 4 && Block.lightOpacity[var1.getBlockId(var2, var3 + 1, var4)] > 2)
            {
                var1.setBlock(var2, var3, var4, TwilightBlockHelper.UviteDirt.blockID);
            }
            else if (var1.getBlockLightValue(var2, var3 + 1, var4) >= 9)
            {
                for (int var6 = 0; var6 < 4; ++var6)
                {
                    int var7 = var2 + var5.nextInt(3) - 1;
                    int var8 = var3 + var5.nextInt(5) - 3;
                    int var9 = var4 + var5.nextInt(3) - 1;
                    int var10 = var1.getBlockId(var7, var8 + 1, var9);

                    if (var1.getBlockId(var7, var8, var9) == TwilightBlockHelper.UviteDirt.blockID && var1.getBlockLightValue(var7, var8 + 1, var9) >= 4 && Block.lightOpacity[var10] <= 2)
                    {
                        var1.setBlock(var7, var8, var9, TwilightBlockHelper.UviteGrass.blockID);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int var1, Random var2, int var3)
    {
        return TwilightBlockHelper.UviteDirt.blockID;
    }
}
