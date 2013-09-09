package net.divinerpg.blocks.iceika;

import java.util.Random;

import net.divinerpg.blocks.BlockDivineGrass;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;

public class BlockIceikaGrass extends BlockDivineGrass {
    public BlockIceikaGrass(int id) {
        super(id);
    }

    @Override
    public int idDropped(int var1, Random var2, int var3) {
        return IceikaConfigHelper.FrostedDirtID;
    }
}
