package net.divinerpg.blocks.iceika;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockIceikaDoor extends BlockDoor
{
    public Icon topIcon;

    public BlockIceikaDoor(int par1, Material par2Material) {
        super(par1, par2Material);
    }

    @Override
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        if (par5 != 0 && par5 != 1) {
            int meta = this.getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int var7 = (13 * 16) + 11;

            if ((meta & 8) != 0)
            {
                var7 -= 1;
            }

            int var8 = meta & 3;
            boolean var9 = (meta & 4) != 0;

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

                if ((meta & 16) != 0)
                {
                    var7 = -var7;
                }
            }

            return topIcon;
        }
        else
        {
            return blockIcon;
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Bottom");
        this.topIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Top"); 
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return blockIcon;
    }
}
