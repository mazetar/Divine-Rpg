package net.divinerpg.blocks.iceika;

import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPG;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.minecraft.block.material.Material;

public class BlockIceikaGrass extends BlockDivineRPG {
    public BlockIceikaGrass(int var1) {
        super(var1, 0, Material.grass);
    }

    @Override
    public int idDropped(int var1, Random var2, int var3) {
        return IceikaConfigHelper.FrostedDirtID;
    }
}
