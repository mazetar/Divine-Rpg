package net.divinerpg.blocks.vethea;

import net.divinerpg.blocks.BlockDivine;
import net.minecraft.block.material.Material;

public class BlockVethea extends BlockDivine
{
	public BlockVethea(int par1, int par2, Material par3)
	{
		super(par1, par2, par3);
	}
	
	// Meant to be overrided
	public int getSheet(int side, int metadata) {
		return 4;
	}
}
