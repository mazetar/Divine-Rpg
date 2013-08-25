package net.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.worldgen.vethea.WorldAddition;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FloatingTree5 extends WorldGenerator
{
	private WorldAddition world1;
	
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public FloatingTree5() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 1, k + 8, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 0, k + 8, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 6, VetheaBlockHelper.hyrewood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 7, VetheaBlockHelper.hyrewood.blockID, 8);
		world1.setBlockWithMetadata(i + 1, j + 1, k + 8, VetheaBlockHelper.hyrewood.blockID, 8);
		world.setBlock(i + 1, j + 1, k + 9, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 2, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 8, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 0, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 1, k + 4, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 6, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 8, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 2, k + 0, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 2, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 2, VetheaBlockHelper.hyrewood.blockID, 8);
		world1.setBlockWithMetadata(i + 2, j + 2, k + 3, VetheaBlockHelper.hyrewood.blockID, 8);
		world.setBlock(i + 2, j + 2, k + 4, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 2, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 2, k + 6, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 3, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 3, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 5, k + 6, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 0, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 1, k + 4, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 1, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 1, k + 6, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 2, k + 4, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 6, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 3, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 3, k + 6, VetheaBlockHelper.hyrewood.blockID);
		world.setBlock(i + 3, j + 4, k + 6, VetheaBlockHelper.hyrewood.blockID);
		world.setBlock(i + 3, j + 5, k + 5, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 5, k + 6, VetheaBlockHelper.dreamdirt.blockID);
		world.setBlock(i + 3, j + 5, k + 7, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 6, k + 6, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 4, j + 2, k + 5, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 4, j + 5, k + 6, VetheaBlockHelper.hyrewoodLeaves.blockID);

		return true;
	}
}