package net.divinerpg.blocks;

import net.divinerpg.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineRPGGrass extends BlockDivineRPG {

    public Icon topIcon;
    public Icon bottomIcon;
    
    public BlockDivineRPGGrass(int id) {
        super(id, Material.grass);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Side");
        this.topIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Top");
        this.bottomIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Bottom");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (side == 0)
            return bottomIcon;
        if (side == 1)
            return topIcon;
        return blockIcon;
    }    
    
}
