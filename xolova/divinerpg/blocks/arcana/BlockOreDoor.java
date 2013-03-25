package xolova.divinerpg.blocks.arcana;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOreDoor extends BlockDoor
{
    public BlockOreDoor(int par1)
    {
        super(par1, Material.wood);
        this.blockIndexInTexture = 145;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    @Override
    public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 != 0 && par5 != 1)
        {
            int var6 = this.getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int var7 = this.blockIndexInTexture;

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

            return var7;
        }
        else
        {
            return this.blockIndexInTexture;
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
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
                if (itemstack.itemID == DivineRPG.key2.itemID)
                {
                    if (!par5EntityPlayer.capabilities.isCreativeMode && --itemstack.stackSize <= 0)
                    {
                        par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);
                    }

                    int var10 = this.getFullMetadata(par1World, par2, par3, par4);
                    int var11 = var10 & 7;
                    var11 ^= 4;

                    if ((var10 & 8) == 0)
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, var11);
                        par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
                    }
                    else
                    {
                        par1World.setBlockMetadataWithNotify(par2, par3 - 1, par4, var11);
                        par1World.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
                    }

                    par1World.playAuxSFXAtEntity(par5EntityPlayer, 1003, par2, par3, par4, 0);
                    return true;
                }
            }
        }
        else
        {
            return false;
        }

        return true;
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

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
