/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.worldgen.iceika;
import java.util.Random;

import net.divinerpg.entities.iceika.mobs.EntityWorkshopMerchant;
import net.divinerpg.entities.iceika.mobs.EntityWorkshopTickerer;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.worldgen.vethea.WorldAddition;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class SnowyVillage2 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			IceikaBlockHelper.frostedGrass.blockID
		};
	}

	private WorldAddition world1;
	
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

	public SnowyVillage2() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 10, j, k) || !LocationIsValidSpawn(world, i + 10, j, k + 10) || !LocationIsValidSpawn(world, i, j, k + 10))
		{
			return false;
		}

		world.setBlock(i + 2, j + 0, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 0, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 0, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 0, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 0, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 0, k + 8, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 1, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 1, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 1, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 1, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 1, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 1, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 1, k + 8, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 2, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 2, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 2, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 2, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 2, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 2, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 2, k + 8, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 3, k + 2, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 3, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 3, k + 4, IceikaBlockHelper.frostedGlass.blockID);
		world.setBlock(i + 2, j + 3, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 3, k + 6, IceikaBlockHelper.frostedGlass.blockID);
		world.setBlock(i + 2, j + 3, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 3, k + 8, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 2, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 5, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 5, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 2, j + 5, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 0, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 1, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 1, k + 3, IceikaBlockHelper.workshopBookcase.blockID);
		world.setBlock(i + 3, j + 1, k + 4, IceikaBlockHelper.coalstone.blockID);
		world1.setBlockWithMetadata(i + 3, j + 1, k + 5, IceikaBlockHelper.coalstoneFurnace.blockID, 5);
		world.setBlock(i + 3, j + 1, k + 6, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 1, k + 7, IceikaBlockHelper.workshopBookcase.blockID);
		world.setBlock(i + 3, j + 1, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 2, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 2, k + 4, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 2, k + 5, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 2, k + 6, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 2, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 3, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 3, k + 5, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 3, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 4, k + 5, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 5, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 5, k + 5, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 5, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 3, j + 6, k + 5, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 3, j + 7, k + 5, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 4, j + 0, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 1, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 1, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 2, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 2, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 3, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 3, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 5, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 5, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 4, j + 5, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 0, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 1, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 1, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 2, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 2, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 3, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 3, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 5, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 0, k + 0, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 0, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 0, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 0, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 0, k + 10, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 1, k + 0, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 1, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 1, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 1, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 1, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 1, k + 10, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 2, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 2, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 2, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 2, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 3, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 3, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 3, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 3, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 6, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 0, k + 0, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 7, j + 0, k + 1, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 2, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 8, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 9, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 7, j + 0, k + 10, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 7, j + 1, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 1, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 2, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 2, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 3, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 3, k + 2, IceikaBlockHelper.workshopLamp.blockID);
		world.setBlock(i + 7, j + 3, k + 8, IceikaBlockHelper.workshopLamp.blockID);
		world.setBlock(i + 7, j + 3, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 7, j + 4, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 0, k + 0, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 8, j + 0, k + 1, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 2, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 8, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 9, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 8, j + 0, k + 10, IceikaBlockHelper.coalstone.blockID);
		world1.setBlockWithMetadata(i + 8, j + 1, k + 1, IceikaBlockHelper.steelDoor.blockID, 1);
		world1.setBlockWithMetadata(i + 8, j + 1, k + 9, IceikaBlockHelper.steelDoor.blockID, 3);
		world1.setBlockWithMetadata(i + 8, j + 2, k + 1, IceikaBlockHelper.steelDoor.blockID, 8);
		world1.setBlockWithMetadata(i + 8, j + 2, k + 9, IceikaBlockHelper.steelDoor.blockID, 8);
		world.setBlock(i + 8, j + 3, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 3, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 8, j + 4, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 0, k + 0, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 9, j + 0, k + 1, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 2, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 3, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 4, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 5, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 6, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 7, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 8, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 9, IceikaBlockHelper.workshopCarpet.blockID);
		world.setBlock(i + 9, j + 0, k + 10, IceikaBlockHelper.coalstone.blockID);
		world.setBlock(i + 9, j + 1, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 1, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 2, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 2, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 3, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 3, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 9, j + 4, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 0, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 0, k + 10, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 0, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 1, k + 10, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 2, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 2, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 2, k + 3, IceikaBlockHelper.frostedGlass.blockID);
		world.setBlock(i + 10, j + 2, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 2, k + 5, IceikaBlockHelper.frostedGlass.blockID);
		world.setBlock(i + 10, j + 2, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 2, k + 7, IceikaBlockHelper.frostedGlass.blockID);
		world.setBlock(i + 10, j + 2, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 2, k + 9, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 1, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 2, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 3, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 4, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 5, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 6, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 7, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 8, IceikaBlockHelper.snowyBricks.blockID);
		world.setBlock(i + 10, j + 3, k + 9, IceikaBlockHelper.snowyBricks.blockID);
        EntityWorkshopTickerer tinkerer = new EntityWorkshopTickerer(world);
        tinkerer.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(tinkerer);
        
        EntityWorkshopMerchant merchant = new EntityWorkshopMerchant(world);
        merchant.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(merchant);

		return true;
	}
}