package net.divinerpg.blocks.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockOreDoor extends BlockDoor
{
    Item key;
    public BlockOreDoor(int id, Item key)
    {
        super(id, Material.wood);
        this.key = key;
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
                if (itemstack.itemID == key.itemID)
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
                        par1World.setBlock(par2, par3, par4, var11);
                        par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
                    }
                    else
                    {
                        par1World.setBlock(par2, par3 - 1, par4, var11);
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
     * A function to open a door. - Don't open on power.
     */

    @Override
    public void onPoweredBlockChange(World par1World, int par2, int par3, int par4, boolean par5)
    {
        return;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E());
    }
}
