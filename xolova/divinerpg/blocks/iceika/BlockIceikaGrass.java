package xolova.divinerpg.blocks.iceika;

import java.util.Random;

import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.config.IceikaConfigHelper;

public class BlockIceikaGrass extends BlockDivineRPG {
    public BlockIceikaGrass(int var1) {
        super(var1, 0, Material.grass);
    }
    
    @Override
    public int getSheet(int side, int metadata) {
    	return 3;
    }

    @Override
    public int getIndex(int var1, int var2) {
        switch (var1)
        {
            case 0:
                return 209;

            case 1:
                return 208;

            default:
                return 210;
        }
    }

    @Override
    public int idDropped(int var1, Random var2, int var3) {
        return IceikaConfigHelper.FrostedDirtID;
    }
}
