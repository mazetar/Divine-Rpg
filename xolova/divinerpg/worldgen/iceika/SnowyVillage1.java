/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.iceika;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopMerchant;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopTickerer;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class SnowyVillage1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			DivineRPGTwilight.iceikaGrass.blockID
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

	public SnowyVillage1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 13, j, k) || !LocationIsValidSpawn(world, i + 13, j, k + 10) || !LocationIsValidSpawn(world, i, j, k + 10))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 1, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 2, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 4, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 4, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 1, j + 2, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 6, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 1, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 4, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 5, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 2, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 2, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 2, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 3, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 2, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 5, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 6, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 3, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 4, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 6, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 7, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 8, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 3, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 2, k + 0, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 3, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 2, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 3, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 3, k + 4, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 3, k + 6, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 3, k + 7, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 3, k + 8, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 4, k + 2, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 4, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 4, k + 7, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 3, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 5, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 6, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 7, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 10, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 11, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 3, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 4, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 0, k + 6, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 7, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 8, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 4, j + 1, k + 3, Block.wood.blockID);
		world.setBlock(i + 4, j + 1, k + 7, Block.wood.blockID);
		world.setBlock(i + 4, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 2, k + 0, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 4, j + 2, k + 3, Block.wood.blockID);
		world.setBlock(i + 4, j + 2, k + 7, Block.wood.blockID);
		world.setBlock(i + 4, j + 2, k + 10, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 4, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 3, k + 2, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 3, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 3, k + 4, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 3, k + 6, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 3, k + 7, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 3, k + 8, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 4, k + 4, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 4, k + 6, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 4, k + 7, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 4, k + 8, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 5, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 5, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 5, k + 7, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 4, j + 5, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 6, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 6, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 6, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 6, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 6, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 7, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 8, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 9, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 10, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 3, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 4, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 0, k + 6, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 7, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 8, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 5, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 2, k + 0, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 5, j + 2, k + 10, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 5, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 3, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 5, j + 3, k + 4, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 5, j + 3, k + 7, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 5, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 3, DivineRPGTwilight.lightLeaves.blockID);
		world.setBlock(i + 5, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 5, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 6, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 7, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 10, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 11, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 6, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 2, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 6, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 3, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 6, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 5, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 6, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 3, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 7, j + 2, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 4, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 5, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 1, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 2, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 3, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 4, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 8, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 8, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 0, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 0, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 9, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 9, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 9, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 9, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 0, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 0, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 10, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 10, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlockAndMetadata(i + 10, j + 1, k + 7, DivineRPGTwilight.iceikaDoor.blockID, 1);
		world.setBlock(i + 10, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlockAndMetadata(i + 10, j + 2, k + 7, DivineRPGTwilight.iceikaDoor.blockID, 9);
		world.setBlock(i + 10, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 10, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 0, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 0, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 11, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 11, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlockAndMetadata(i + 11, j + 1, k + 7, DivineRPGTwilight.iceikaDoor.blockID, 1);
		world.setBlock(i + 11, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlockAndMetadata(i + 11, j + 2, k + 7, DivineRPGTwilight.iceikaDoor.blockID, 8);
		world.setBlock(i + 11, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 11, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 0, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 0, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 12, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 12, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 12, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 1, k + 9, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 12, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 2, k + 9, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 12, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 3, k + 9, DivineRPGTwilight.workshopLamp.blockID);
		world.setBlock(i + 12, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 12, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 13, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 13, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 13, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 13, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 1, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 1, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 2, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 2, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 3, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 3, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 13, j + 3, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		
        EntityWorkshopTickerer tinkerer = new EntityWorkshopTickerer(world);
        tinkerer.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(tinkerer);
        
        EntityWorkshopMerchant merchant = new EntityWorkshopMerchant(world);
        merchant.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(merchant);

		return true;
	}
}