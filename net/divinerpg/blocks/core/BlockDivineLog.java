package net.divinerpg.blocks.core;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Logs from the mod should extend this class.
 */
public class BlockDivineLog extends BlockDivine {
	
    Icon insideIcon;
    
    public BlockDivineLog(int var1) {
        super(var1, 0, Material.wood);
        this.setCreativeTab(DivineTabs.tabBlocks);
    }

    @Override
    public int getRenderType(){
        return 31;
    }

    /** 
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    @Override
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    { // The vanilla log's rotation code!
        int j1 = par9 & 3;
        byte b0 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                b0 = 0;
                break;
            case 2:
            case 3:
                b0 = 8;
                break;
            case 4:
            case 5:
                b0 = 4;
        }

        return j1 | b0;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @SuppressWarnings("unused")
    public Icon getIcon(int par1, int par2)
    { // Modified vanilla method
        int k = par2 & 12;
		int l = par2 & 3;
        return k == 0 && (par1 == 1 || par1 == 0) ? this.insideTexture() : (k == 4 && (par1 == 5 || par1 == 4) ? this.insideTexture() : (k == 8 && (par1 == 2 || par1 == 3) ? this.insideTexture() : this.sideTexture()));
    }
    

    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z) {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {

        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Side"); 
        this.insideIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Top"); 
    }
    
    public Icon sideTexture() {
        return this.blockIcon;
    }
    public Icon insideTexture() {
        return this.insideIcon;
    }
}