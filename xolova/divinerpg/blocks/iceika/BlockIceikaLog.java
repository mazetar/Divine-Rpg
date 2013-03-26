package xolova.divinerpg.blocks.iceika;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.blocks.BlockDivineRPGLog;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;

public class BlockIceikaLog extends BlockDivineRPGLog {
	
    public BlockIceikaLog(int var1) {
        super(var1);
    }

	@Override
	public int sideIndex() {
		return (13 * 16) + 3;
	}

	@Override
	public int insideIndex() {
		return (13 * 16) + 4;
	}
    
}