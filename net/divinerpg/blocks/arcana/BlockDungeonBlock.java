package net.divinerpg.blocks.arcana;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.material.Material;

public class BlockDungeonBlock extends BlockDivine
{
	
	public BlockDungeonBlock(int par1)
	{
		super (par1, 4, Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(999.0F);
		this.setCreativeTab(CreativeTabHelper.tabBlocks);
	}
}
