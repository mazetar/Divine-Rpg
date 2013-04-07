package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import xolova.divinerpg.blocks.overworld.BlockBlueFire;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;

public class OverworldBlockHelper 
{
	public static Block blueFire;
	public static Block TarStill;
	public static Block Steel;
	public static Block divineRock;
	public static Block dyeblocks;
	public static Block miniBricks;
	
	public static void init()
	{

        blueFire = new BlockBlueFire(578).setUnlocalizedName("fire").setCreativeTab(CreativeTabHelper.tabBlocks);
	}
}
