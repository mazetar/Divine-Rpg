package net.divinerpg.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

/**
 * Logs from the mod should extend this class.
 */
public abstract class BlockDivineRPGLog extends BlockDivineRPG {
	
    Icon insideIcon;
    
    public BlockDivineRPGLog(int var1) {
        super(var1, 0, Material.wood);
        this.setCreativeTab(CreativeTabHelper.tabBlocks);
    }

    @Override
    public int getRenderType(){
        return 31;
    }

    @Override
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
        int var10 = par9 & 3;
        byte var11 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;

            case 2:
            case 3:
                var11 = 8;
                break;

            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
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
    
    @Override
    public Icon getIcon(int side, int meta) {
        int var3 = meta & 12;

        return var3 == 0 && (side == 1 || side == 0) ? insideTexture() : (var3 == 4 && (side == 5 || side == 4) ? sideTexture() : (var3 == 8 && (side == 2 || side == 3) ? sideTexture() : insideTexture()));
    }
    
    public Icon sideTexture() {
        return this.blockIcon;
    }
    public Icon insideTexture() {
        return this.insideIcon;
    }
}