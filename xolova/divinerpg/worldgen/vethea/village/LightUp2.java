/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.divinerpg.worldgen.vethea.village;
import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class LightUp2 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightUp2() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		EntityLiving entity = new EntityHungerHungry(world);
		entity.setLocationAndAngles(i + 0F, j + 1.0F, k + 0F, 0.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		
		world.setBlock(i + 0, j + 0, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 3, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 3, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 3, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 3, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 3, j + 3, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 4, j + 3, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 4, j + 4, k + 5, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 5, j + 3, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 5, j + 4, k + 4, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 5, j + 4, k + 5, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 5, j + 4, k + 6, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 5, j + 5, k + 5, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 6, j + 4, k + 5, VetheaBlockHelper.firelight.blockID);

		return true;
	}
}