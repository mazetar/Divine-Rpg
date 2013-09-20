package net.divinerpg.blocks;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineFlower extends BlockFlower
{
	public BlockDivineFlower(int id) {
		super(id, Material.plants);

        this.setCreativeTab(DivineTabs.tabHerb);
	}
	   
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E()); 
    }
    
    /**
     * Sets the bounds of the block.  minX, minY, minZ, maxX, maxY, maxZ
     */
    public Block setBlockBoundsWithBlock(float par1, float par2, float par3, float par4, float par5, float par6)
    {
        this.minX = (double)par1;
        this.minY = (double)par2;
        this.minZ = (double)par3;
        this.maxX = (double)par4;
        this.maxY = (double)par5;
        this.maxZ = (double)par6;
        
        return this;
    }
    
}
