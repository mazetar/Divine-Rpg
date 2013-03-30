package xolova.divinerpg.blocks.arcana;

import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;

public class BlockDungeonBlock extends BlockDivineRPG
{
	
	public BlockDungeonBlock(int par1)
	{
		super (par1, 4, Material.rock);
		this.setBlockUnbreakable();
		this.setResistance(999.0F);
		this.setCreativeTab(CreativeTabHelper.tabBlocks);
	}
}
