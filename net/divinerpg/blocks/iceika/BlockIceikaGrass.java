package net.divinerpg.blocks.iceika;

import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPG;
import net.divinerpg.blocks.BlockDivineRPGGrass;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.minecraft.block.material.Material;

public class BlockIceikaGrass extends BlockDivineRPGGrass {
    public BlockIceikaGrass(int id) {
        super(id);
    }

    @Override
    public int idDropped(int var1, Random var2, int var3) {
        return IceikaConfigHelper.FrostedDirtID;
    }
}
