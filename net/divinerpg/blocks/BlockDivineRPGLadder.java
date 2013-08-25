package net.divinerpg.blocks;

import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineRPGLadder extends BlockLadder
{
	int index;
	int sheet;

	public BlockDivineRPGLadder(int id)
	{
		super(id);
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
    public Block setUnlocalizedName(String name) {
        return super.setUnlocalizedName(name);
    }
    
    @Override
    public boolean isLadder(World world, int x, int y, int z,
            EntityLivingBase entity) {
        return true;
    }
}
