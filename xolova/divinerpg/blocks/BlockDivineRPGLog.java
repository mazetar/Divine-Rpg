package xolova.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;

public abstract class BlockDivineRPGLog extends BlockDivineRPG {
	
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

    public int getIndex(int par1, int par2) {
        int var3 = par2 & 12;
        int var4 = par2 & 3;

        return var3 == 0 && (par1 == 1 || par1 == 0) ? insideIndex() : (var3 == 4 && (par1 == 5 || par1 == 4) ? sideIndex() : (var3 == 8 && (par1 == 2 || par1 == 3) ? sideIndex() : insideIndex()));
    }
    
    public abstract int sideIndex();
    public abstract int insideIndex();
}