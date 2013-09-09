/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.worldgen.vethea.WorldAddition;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TreeFloating1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}
	
	private WorldAddition world1;

	public TreeFloating1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 1, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 0, j + 1, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 0, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 0, j + 2, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 3, VetheaBlockHelper.firewood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 4, VetheaBlockHelper.firewood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 5, VetheaBlockHelper.firewood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 6, VetheaBlockHelper.firewood.blockID, 8);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world1.setBlockWithMetadata(i + 2, j + 1, k + 6, VetheaBlockHelper.firewood.blockID, 4);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 1, VetheaBlockHelper.firewood.blockID, 4);
		world1.setBlockWithMetadata(i + 3, j + 1, k + 6, VetheaBlockHelper.firewood.blockID, 4);
		world1.setBlockWithMetadata(i + 3, j + 2, k + 1, VetheaBlockHelper.firewood.blockID, 4);
		world.setBlock(i + 4, j + 0, k + 6, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 1, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 5, VetheaBlockHelper.firewoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 4, j + 1, k + 6, VetheaBlockHelper.firewood.blockID, 4);
		world.setBlock(i + 4, j + 1, k + 7, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 0, VetheaBlockHelper.firewoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 4, j + 2, k + 1, VetheaBlockHelper.firewood.blockID, 4);
		world.setBlock(i + 4, j + 2, k + 2, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 6, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 5, j + 1, k + 6, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 5, j + 2, k + 1, VetheaBlockHelper.firewoodLeaves.blockID);

		return true;
	}
}