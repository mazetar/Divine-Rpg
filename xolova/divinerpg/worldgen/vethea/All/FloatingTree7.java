/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;
import xolova.divinerpg.worldgen.vethea.WorldAddition;

public class FloatingTree7 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	private WorldAddition world1;
	
	public FloatingTree7() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 0, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 3, k + 1, VetheaBlockHelper.mintwood.blockID);
		world1.setBlockWithMetadata(i + 1, j + 4, k + 1, VetheaBlockHelper.mintwood.blockID, 4);
		world.setBlock(i + 2, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world1.setBlockWithMetadata(i + 2, j + 4, k + 1, VetheaBlockHelper.mintwood.blockID, 4);
		world.setBlock(i + 3, j + 1, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 3, j + 4, k + 1, VetheaBlockHelper.mintwood.blockID, 4);
		world.setBlock(i + 4, j + 0, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 0, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 1, VetheaBlockHelper.mintwood.blockID);
		world.setBlock(i + 4, j + 1, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 1, VetheaBlockHelper.mintwood.blockID);
		world.setBlock(i + 4, j + 3, k + 1, VetheaBlockHelper.mintwood.blockID);
		world.setBlock(i + 4, j + 4, k + 1, VetheaBlockHelper.mintwood.blockID);
		world.setBlock(i + 5, j + 1, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);

		return true;
	}
}