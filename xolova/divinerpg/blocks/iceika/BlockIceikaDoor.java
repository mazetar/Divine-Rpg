package xolova.divinerpg.blocks.iceika;

import xolova.divinerpg.utils.helpers.IconHelper;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIceikaDoor extends BlockDoor
{
    public BlockIceikaDoor(int par1, Material par2Material) {
        super(par1, par2Material);
    }

    @Override
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        if (par5 != 0 && par5 != 1) {
            int var6 = this.getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int var7 = (13 * 16) + 11;

            if ((var6 & 8) != 0)
            {
                var7 -= 1;
            }

            int var8 = var6 & 3;
            boolean var9 = (var6 & 4) != 0;

            if (var9)
            {
                if (var8 == 0 && par5 == 2)
                {
                    var7 = -var7;
                }
                else if (var8 == 1 && par5 == 5)
                {
                    var7 = -var7;
                }
                else if (var8 == 2 && par5 == 3)
                {
                    var7 = -var7;
                }
                else if (var8 == 3 && par5 == 4)
                {
                    var7 = -var7;
                }
            }
            else
            {
                if (var8 == 0 && par5 == 5)
                {
                    var7 = -var7;
                }
                else if (var8 == 1 && par5 == 3)
                {
                    var7 = -var7;
                }
                else if (var8 == 2 && par5 == 4)
                {
                    var7 = -var7;
                }
                else if (var8 == 3 && par5 == 2)
                {
                    var7 = -var7;
                }

                if ((var6 & 16) != 0)
                {
                    var7 = -var7;
                }
            }

            return IconHelper.icons[3][var7];
        }
        else
        {
            return IconHelper.icons[3][(13 * 16) + 10];
        }
    }
}
