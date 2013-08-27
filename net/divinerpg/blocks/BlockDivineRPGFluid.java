package net.divinerpg.blocks;

import net.divinerpg.api.IBlockDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineRPGFluid extends BlockFluid implements IBlockDivineRPG {
	
	int index;
	int sheet;

	public BlockDivineRPGFluid(int id, int sprite, Material mat) {
		super(id, mat);
		this.index = sprite;
	}
	
	public BlockDivineRPGFluid(int id, Material mat)
	{
		this(id, 0, mat);
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