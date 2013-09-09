package net.divinerpg.blocks;

import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineFlower extends BlockFlower
{
	public BlockDivineFlower(int id, int sprite) {
		super(id, Material.plants);
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
