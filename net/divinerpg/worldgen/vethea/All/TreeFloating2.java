/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.worldgen.vethea.WorldAddition;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TreeFloating2 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}
	
	private WorldAddition world1;

	public TreeFloating2() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 1, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 0, j + 1, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 0, j + 1, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 0, j + 2, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 0, j + 2, k + 3, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 0, j + 2, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 1, j + 0, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 0, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 2, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 3, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 4, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 5, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 6, VetheaBlockHelper.mintwood.blockID, 8);
		world.setBlock(i + 1, j + 1, k + 7, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 1, j + 2, k + 2, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 2, k + 3, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 2, k + 4, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 2, k + 5, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 2, k + 6, VetheaBlockHelper.mintwood.blockID, 8);
		world.setBlock(i + 1, j + 2, k + 7, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 3, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 1, j + 3, k + 3, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 1, j + 3, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 2, j + 0, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 2, j + 1, k + 2, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 1, k + 3, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 1, k + 4, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 1, k + 5, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 1, k + 6, VetheaBlockHelper.mintwood.blockID, 8);
		world.setBlock(i + 2, j + 1, k + 7, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 2, k + 1, VetheaBlockHelper.mintwoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 2, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 3, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 4, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 5, VetheaBlockHelper.mintwood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 6, VetheaBlockHelper.mintwood.blockID, 8);
		world.setBlock(i + 2, j + 2, k + 7, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 2, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 3, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 2, j + 3, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 0, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 3, j + 1, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 3, j + 1, k + 8, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 2, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 3, j + 2, k + 3, VetheaBlockHelper.mintwoodLeaves.blockID);
		world.setBlock(i + 3, j + 2, k + 8, VetheaBlockHelper.dreamstone.blockID);

		return true;
	}
}