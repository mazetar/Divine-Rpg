package xolova.divinerpg.blocks.iceika;

import xolova.divinerpg.blocks.BlockDivineRPGLog;

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