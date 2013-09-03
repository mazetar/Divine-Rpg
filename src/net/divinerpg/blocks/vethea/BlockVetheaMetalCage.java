package net.divinerpg.blocks.vethea;

import net.minecraft.block.material.Material;

public class BlockVetheaMetalCage extends BlockVethea {

    public BlockVetheaMetalCage(int par1, int par2, Material par3) {
        super(par1, par2, par3);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}
