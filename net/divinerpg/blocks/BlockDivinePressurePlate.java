package net.divinerpg.blocks;

import net.divinerpg.api.IBlockDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BlockDivinePressurePlate extends BlockBasePressurePlate implements IBlockDivineRPG {
	
	public BlockDivinePressurePlate(int id, int sprite, Material mat, String par4) {
		super(id, par4, mat);
	}
	
	public BlockDivinePressurePlate(int id, Material mat, String par4)
	{
		this(id, 0, mat, par4);
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E()); 
    }
    
    public void setTextureName(String name) {
        func_111022_d(name);
    }
	
}