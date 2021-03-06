package net.divinerpg.blocks.iceika;

import net.divinerpg.blocks.core.BlockDivineLog;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIceikaLog extends BlockDivineLog {
	
    public BlockIceikaLog(int var1) {
        super(var1);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E()); 
    }

    @Override
    public Block setUnlocalizedName(String name) {
        func_111022_d(name);
        return super.setUnlocalizedName(name);
    }
   
}