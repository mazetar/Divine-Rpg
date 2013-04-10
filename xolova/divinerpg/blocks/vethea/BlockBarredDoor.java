package xolova.divinerpg.blocks.vethea;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBarredDoor extends BlockDoor
{
    public BlockBarredDoor(int par1, Material par2Material)
    {
        super(par1, par2Material);
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }

        if (this.blockMaterial == Material.wood)
        {
            ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();

            if (itemstack == null)
            {
                return true;
            }
            else
            {
                    int var10 = this.getFullMetadata(par1World, par2, par3, par4);
                    int var11 = var10 & 7;
                    var11 ^= 4;

                    if ((var10 & 8) == 0)
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, var11, 3);
                        par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3 - 1, par4, var11, 3);
                        par1World.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
                    }

                    par1World.playAuxSFXAtEntity(par5EntityPlayer, 1003, par2, par3, par4, 0);
                    return true;
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * A function to open a door.
     */

    @Override
    public void onPoweredBlockChange(World par1World, int par2, int par3, int par4, boolean par5)
    {
        int var6 = this.getFullMetadata(par1World, par2, par3, par4);
        boolean var7 = (var6 & 4) != 0;

        if (var7 != par5)
        {
            ;
        }
    }
}
