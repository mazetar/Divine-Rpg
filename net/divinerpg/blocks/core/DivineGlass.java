package net.divinerpg.blocks.core;

import net.divinerpg.api.IBlockDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DivineGlass extends BlockGlass implements IBlockDivineRPG {

	public DivineGlass(int par1) {
		super(par1, Material.glass, false);
	}
	
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E()); 
    }
    
    public void setTextureName(String name) {
        func_111022_d(name);
    }
	@Override
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5) {
        return super.shouldSideBeRendered(var1, var2, var3, var4, 1 - var5);
    }
	
	@Override
	public int getRenderBlockPass() {
		return 1;
	}

}
