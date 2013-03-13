package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockStationaryTar extends BlockFluid
{
    public BlockStationaryTar(int var1, Material var2)
    {
        super(var1, var2);
        this.setTickRandomly(false);

        if (var2 == Material.lava)
        {
            this.setTickRandomly(true);
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (this.blockMaterial == Material.lava)
        {
            int var6 = var5.nextInt(3);

            for (int var7 = 0; var7 < var6; ++var7)
            {
                var2 += var5.nextInt(3) - 1;
                ++var3;
                var4 += var5.nextInt(3) - 1;
                int var8 = var1.getBlockId(var2, var3, var4);

                if (var8 == 0)
                {
                    if (this.func_301_k(var1, var2 - 1, var3, var4) || this.func_301_k(var1, var2 + 1, var3, var4) || this.func_301_k(var1, var2, var3, var4 - 1) || this.func_301_k(var1, var2, var3, var4 + 1) || this.func_301_k(var1, var2, var3 - 1, var4) || this.func_301_k(var1, var2, var3 + 1, var4))
                    {
                        var1.setBlockWithNotify(var2, var3, var4, Block.fire.blockID);
                        return;
                    }
                }
                else if (Block.blocksList[var8].blockMaterial.isSolid())
                {
                    return;
                }
            }
        }
    }

    private boolean func_301_k(World var1, int var2, int var3, int var4)
    {
        return var1.getBlockMaterial(var2, var3, var4).getCanBurn();
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
