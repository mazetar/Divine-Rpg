package xolova.blued00r.divinerpg.misc;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.item.ItemStack;

public class RecipesInfusionTable 
{
	public static HashMap<List<Integer>, ItemStack> recipes = new HashMap<List<Integer>, ItemStack>();
	public static HashMap<List<Integer>, Integer> numbero = new HashMap<List<Integer>, Integer>();
	
	public RecipesInfusionTable()
	{
		this.recipes();
	}
	
	public static void recipes()
	{
		addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 4, new ItemStack(DivineRPG.teakerBow));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 5, new ItemStack(DivineRPG.amthrimisBow));
		addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 6, new ItemStack(DivineRPG.darvenBow));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 8, new ItemStack(DivineRPG.cermileBow));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 11, new ItemStack(DivineRPG.pardimalBow));
		addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 13, new ItemStack(DivineRPG.quadroticBow));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 18, new ItemStack(DivineRPG.karosBow));
		addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 20, new ItemStack(DivineRPG.heliosisBow));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanBowTemplate.itemID, 24, new ItemStack(DivineRPG.arksianeBow));

		addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 2, new ItemStack(DivineRPG.teakerClaw));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 3, new ItemStack(DivineRPG.amthrimisClaw));
		addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 4, new ItemStack(DivineRPG.darvenClaw));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 6, new ItemStack(DivineRPG.cermileClaw));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 8, new ItemStack(DivineRPG.pardimalClaw));
		addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 10, new ItemStack(DivineRPG.quadroticClaw));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 16, new ItemStack(DivineRPG.karosClaw));
		addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 17, new ItemStack(DivineRPG.heliosisClaw));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanClawTemplate.itemID, 21, new ItemStack(DivineRPG.arksianeClaw));

		addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 4, new ItemStack(DivineRPG.teakerDisk));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 5, new ItemStack(DivineRPG.amthrimisDisk));
		addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 6, new ItemStack(DivineRPG.darvenDisk));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 8, new ItemStack(DivineRPG.cermileDisk));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 11, new ItemStack(DivineRPG.pardimalDisk));
		addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 13, new ItemStack(DivineRPG.quadroticDisk));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 18, new ItemStack(DivineRPG.karosDisk));
		addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 20, new ItemStack(DivineRPG.heliosisDisk));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanDiskTemplate.itemID, 24, new ItemStack(DivineRPG.arksianeDisk));

		addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 4, new ItemStack(DivineRPG.teakerSword));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 5, new ItemStack(DivineRPG.amthrimisSword));
		addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 6, new ItemStack(DivineRPG.darvenSword));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 8, new ItemStack(DivineRPG.cermileSword));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 11, new ItemStack(DivineRPG.pardimalSword));
		addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 13, new ItemStack(DivineRPG.quadroticSword));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 18, new ItemStack(DivineRPG.karosSword));
		addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 20, new ItemStack(DivineRPG.heliosisSword));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanBackswordTemplate.itemID, 24, new ItemStack(DivineRPG.arksianeSword));

		addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 7, new ItemStack(DivineRPG.teakerHammer));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 9, new ItemStack(DivineRPG.amthrimisHammer));
		addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 11, new ItemStack(DivineRPG.darvenHammer));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 14, new ItemStack(DivineRPG.cermileHammer));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 17, new ItemStack(DivineRPG.pardimalHammer));
		addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 19, new ItemStack(DivineRPG.quadroticHammer));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 22, new ItemStack(DivineRPG.karosHammer));
		addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 27, new ItemStack(DivineRPG.heliosisHammer));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanHammerTemplate.itemID, 31, new ItemStack(DivineRPG.arksianeHammer));

		addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 7, new ItemStack(DivineRPG.teakerCannon));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 9, new ItemStack(DivineRPG.amthrimisCannon));
		addRecipe(DivineRPG.darvenLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 11, new ItemStack(DivineRPG.darvenCannon));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 14, new ItemStack(DivineRPG.cermileCannon));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 17, new ItemStack(DivineRPG.pardimalCannon));
		addRecipe(DivineRPG.quadroticLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 19, new ItemStack(DivineRPG.quadroticCannon));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 22, new ItemStack(DivineRPG.karosCannon));
		addRecipe(DivineRPG.heliosisLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 27, new ItemStack(DivineRPG.heliosisCannon));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanCannonTemplate.itemID, 31, new ItemStack(DivineRPG.arksianeCannon));

		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 7, new ItemStack(DivineRPG.degradedHelmetMelee));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 9, new ItemStack(DivineRPG.degradedHelmetRanged));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 6, new ItemStack(DivineRPG.degradedHelmetArcana));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 5, new ItemStack(DivineRPG.degradedBoots));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 8, new ItemStack(DivineRPG.degradedLegs));
		addRecipe(DivineRPG.amthrimisLump.itemID, DivineRPG.vetheanDegradedTemplate.itemID, 10, new ItemStack(DivineRPG.degradedChest));

		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 9, new ItemStack(DivineRPG.finishedHelmetMelee));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 11, new ItemStack(DivineRPG.finishedHelmetRanged));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 6, new ItemStack(DivineRPG.finishedHelmetArcana));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 8, new ItemStack(DivineRPG.finishedBoots));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 10, new ItemStack(DivineRPG.finishedLegs));
		addRecipe(DivineRPG.cermileLump.itemID, DivineRPG.vetheanFinishedTemplate.itemID, 12, new ItemStack(DivineRPG.finishedChest));

		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 14, new ItemStack(DivineRPG.glisteningHelmetMelee));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 16, new ItemStack(DivineRPG.glisteningHelmetRanged));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 13, new ItemStack(DivineRPG.glisteningHelmetArcana));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 12, new ItemStack(DivineRPG.glisteningBoots));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 15, new ItemStack(DivineRPG.glisteningLegs));
		addRecipe(DivineRPG.pardimalLump.itemID, DivineRPG.vetheanGlisteningTemplate.itemID, 17, new ItemStack(DivineRPG.glisteningChest));

		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 22, new ItemStack(DivineRPG.demonizedHelmetMelee));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 26, new ItemStack(DivineRPG.demonizedHelmetRanged));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 20, new ItemStack(DivineRPG.demonizedHelmetArcana));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 18, new ItemStack(DivineRPG.demonizedBoots));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 24, new ItemStack(DivineRPG.demonizedLegs));
		addRecipe(DivineRPG.karosLump.itemID, DivineRPG.vetheanDemonizedTemplate.itemID, 28, new ItemStack(DivineRPG.demonizedChest));

		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 26, new ItemStack(DivineRPG.tormentedHelmetMelee));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 32, new ItemStack(DivineRPG.tormentedHelmetRanged));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 23, new ItemStack(DivineRPG.tormentedHelmetArcana));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 20, new ItemStack(DivineRPG.tormentedBoots));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 29, new ItemStack(DivineRPG.tormentedLegs));
		addRecipe(DivineRPG.arksianeLump.itemID, DivineRPG.vetheanTormentedTemplate.itemID, 35, new ItemStack(DivineRPG.tormentedChest));
	}
	
	public static void addRecipe(int Item1, int Item2, int i, ItemStack item)
	{
		if(Item1 != 0 && item != null)
		{
			recipes.put(Arrays.asList(Item1, Item2, numbero.put(Arrays.asList(Item1, Item2), i)), item);
		}
	}
	
	public static ItemStack getResult(int Item1, int Item2)
	{
		ItemStack item = (ItemStack)recipes.get(Arrays.asList(Item1, Item2, numbero.get(Arrays.asList(Item1, Item2))));
		if(item != null)
			return item;
		else
			return null;
	}
	
	public static int getStackSize(int Item1, int Item2)
	{
		int i = numbero.get(Arrays.asList(Item1, Item2));
		if(i != 0)
			return i;
		else
			return 0;
	}
}	