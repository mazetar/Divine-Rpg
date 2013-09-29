package net.divinerpg.blocks.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOreDoor extends BlockDoor
{
    @SideOnly(Side.CLIENT)
    private Icon[] upperIcon;
    @SideOnly(Side.CLIENT)
    private Icon[] lowerIcon;
    
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

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 != 1 && par5 != 0)
        {
            int i1 = this.getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int j1 = i1 & 3;
            boolean flag = (i1 & 4) != 0;
            boolean flag1 = false;
            boolean flag2 = (i1 & 8) != 0;

            if (flag)
            {
                if (j1 == 0 && par5 == 2)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && par5 == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && par5 == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && par5 == 4)
                {
                    flag1 = !flag1;
                }
            }
            else
            {
                if (j1 == 0 && par5 == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && par5 == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && par5 == 4)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && par5 == 2)
                {
                    flag1 = !flag1;
                }

                if ((i1 & 16) != 0)
                {
                    flag1 = !flag1;
                }
            }

            return flag2 ? this.upperIcon[flag1 ? 1 : 0] : this.lowerIcon[flag1 ? 1 : 0];
        }
        else
        {
            return this.lowerIcon[0];
        }
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return this.lowerIcon[0];
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
        this.upperIcon = new Icon[2];
        this.lowerIcon = new Icon[2];
        this.upperIcon[0] = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + this.func_111023_E() + "_upper");
        this.lowerIcon[0] = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + this.func_111023_E() + "_lower");
        this.upperIcon[1] = new IconFlipped(this.upperIcon[0], true, false);
        this.lowerIcon[1] = new IconFlipped(this.lowerIcon[0], true, false);
        
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E());
        
    }
}
