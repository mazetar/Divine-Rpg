/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.divinerpg.worldgen.iceika;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.IceikaBlockHelper;

public class LightPost1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			IceikaBlockHelper.frostedGrass.blockID
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public LightPost1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 3, j, k) || !LocationIsValidSpawn(world, i + 3, j, k + 3) || !LocationIsValidSpawn(world, i, j, k + 3))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 1, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 0, j + 0, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 0, k + 3, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 1, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, IceikaBlockHelper.workshopLamp.blockID);
		world.setBlock(i + 1, j + 2, k + 2, IceikaBlockHelper.workshopLamp.blockID);
		world.setBlock(i + 2, j + 0, k + 0, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 1, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 2, k + 1, IceikaBlockHelper.workshopLamp.blockID);
		world.setBlock(i + 2, j + 2, k + 2, IceikaBlockHelper.workshopLamp.blockID);
		world.setBlock(i + 3, j + 0, k + 1, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 0, k + 2, IceikaBlockHelper.coalstone.blockID);

		return true;
	}
}