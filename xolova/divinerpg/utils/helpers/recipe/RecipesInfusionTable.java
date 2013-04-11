package xolova.divinerpg.utils.helpers.recipe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;

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
		addRecipe(VetheaItemHelper.teakerLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 4, new ItemStack(VetheaItemHelper.teakerBow));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 5, new ItemStack(VetheaItemHelper.amthrimisBow));
		addRecipe(VetheaItemHelper.darvenLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 6, new ItemStack(VetheaItemHelper.darvenBow));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 8, new ItemStack(VetheaItemHelper.cermileBow));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 11, new ItemStack(VetheaItemHelper.pardimalBow));
		addRecipe(VetheaItemHelper.quadroticLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 13, new ItemStack(VetheaItemHelper.quadroticBow));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 18, new ItemStack(VetheaItemHelper.karosBow));
		addRecipe(VetheaItemHelper.heliosisLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 20, new ItemStack(VetheaItemHelper.heliosisBow));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanBowTemplate.itemID, 24, new ItemStack(VetheaItemHelper.arksianeBow));

		addRecipe(VetheaItemHelper.teakerLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 2, new ItemStack(VetheaItemHelper.teakerClaw));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 3, new ItemStack(VetheaItemHelper.amthrimisClaw));
		addRecipe(VetheaItemHelper.darvenLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 4, new ItemStack(VetheaItemHelper.darvenClaw));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 6, new ItemStack(VetheaItemHelper.cermileClaw));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 8, new ItemStack(VetheaItemHelper.pardimalClaw));
		addRecipe(VetheaItemHelper.quadroticLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 10, new ItemStack(VetheaItemHelper.quadroticClaw));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 16, new ItemStack(VetheaItemHelper.karosClaw));
		addRecipe(VetheaItemHelper.heliosisLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 17, new ItemStack(VetheaItemHelper.heliosisClaw));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanClawTemplate.itemID, 21, new ItemStack(VetheaItemHelper.arksianeClaw));

		addRecipe(VetheaItemHelper.teakerLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 4, new ItemStack(VetheaItemHelper.teakerDisk));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 5, new ItemStack(VetheaItemHelper.amthrimisDisk));
		addRecipe(VetheaItemHelper.darvenLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 6, new ItemStack(VetheaItemHelper.darvenDisk));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 8, new ItemStack(VetheaItemHelper.cermileDisk));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 11, new ItemStack(VetheaItemHelper.pardimalDisk));
		addRecipe(VetheaItemHelper.quadroticLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 13, new ItemStack(VetheaItemHelper.quadroticDisk));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 18, new ItemStack(VetheaItemHelper.karosDisk));
		addRecipe(VetheaItemHelper.heliosisLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 20, new ItemStack(VetheaItemHelper.heliosisDisk));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanDiskTemplate.itemID, 24, new ItemStack(VetheaItemHelper.arksianeDisk));

		addRecipe(VetheaItemHelper.teakerLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 4, new ItemStack(VetheaItemHelper.teakerSword));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 5, new ItemStack(VetheaItemHelper.amthrimisSword));
		addRecipe(VetheaItemHelper.darvenLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 6, new ItemStack(VetheaItemHelper.darvenSword));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 8, new ItemStack(VetheaItemHelper.cermileSword));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 11, new ItemStack(VetheaItemHelper.pardimalSword));
		addRecipe(VetheaItemHelper.quadroticLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 13, new ItemStack(VetheaItemHelper.quadroticSword));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 18, new ItemStack(VetheaItemHelper.karosSword));
		addRecipe(VetheaItemHelper.heliosisLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 20, new ItemStack(VetheaItemHelper.heliosisSword));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanBackswordTemplate.itemID, 24, new ItemStack(VetheaItemHelper.arksianeSword));

		addRecipe(VetheaItemHelper.teakerLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 7, new ItemStack(VetheaItemHelper.teakerHammer));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 9, new ItemStack(VetheaItemHelper.amthrimisHammer));
		addRecipe(VetheaItemHelper.darvenLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 11, new ItemStack(VetheaItemHelper.darvenHammer));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 14, new ItemStack(VetheaItemHelper.cermileHammer));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 17, new ItemStack(VetheaItemHelper.pardimalHammer));
		addRecipe(VetheaItemHelper.quadroticLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 19, new ItemStack(VetheaItemHelper.quadroticHammer));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 22, new ItemStack(VetheaItemHelper.karosHammer));
		addRecipe(VetheaItemHelper.heliosisLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 27, new ItemStack(VetheaItemHelper.heliosisHammer));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanHammerTemplate.itemID, 31, new ItemStack(VetheaItemHelper.arksianeHammer));

		addRecipe(VetheaItemHelper.teakerLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 7, new ItemStack(VetheaItemHelper.teakerCannon));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 9, new ItemStack(VetheaItemHelper.amthrimisCannon));
		addRecipe(VetheaItemHelper.darvenLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 11, new ItemStack(VetheaItemHelper.darvenCannon));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 14, new ItemStack(VetheaItemHelper.cermileCannon));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 17, new ItemStack(VetheaItemHelper.pardimalCannon));
		addRecipe(VetheaItemHelper.quadroticLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 19, new ItemStack(VetheaItemHelper.quadroticCannon));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 22, new ItemStack(VetheaItemHelper.karosCannonItem));
		addRecipe(VetheaItemHelper.heliosisLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 27, new ItemStack(VetheaItemHelper.heliosisCannon));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanCannonTemplate.itemID, 31, new ItemStack(VetheaItemHelper.arksianeCannon));

		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDegradedTemplate.itemID, 8, new ItemStack(VetheaItemHelper.degradedHelmetMelee));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDegradedTemplate.itemID, 6, new ItemStack(VetheaItemHelper.degradedHelmetArcana));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDegradedTemplate.itemID, 9, new ItemStack(VetheaItemHelper.degradedHelmetRanged));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDegradedTemplate.itemID, 5, new ItemStack(VetheaItemHelper.degradedBoots));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDegradedTemplate.itemID, 8, new ItemStack(VetheaItemHelper.degradedLegs));
		addRecipe(VetheaItemHelper.amthrimisLump.itemID, VetheaItemHelper.vetheanDegradedTemplate.itemID, 10, new ItemStack(VetheaItemHelper.degradedChest));

		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanFinishedTemplate.itemID, 12, new ItemStack(VetheaItemHelper.finishedHelmetMelee));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanFinishedTemplate.itemID, 9, new ItemStack(VetheaItemHelper.finishedHelmetArcana));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanFinishedTemplate.itemID, 13, new ItemStack(VetheaItemHelper.finishedHelmetRanged));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanFinishedTemplate.itemID, 8, new ItemStack(VetheaItemHelper.finishedBoots));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanFinishedTemplate.itemID, 12, new ItemStack(VetheaItemHelper.finishedLegs));
		addRecipe(VetheaItemHelper.cermileLump.itemID, VetheaItemHelper.vetheanFinishedTemplate.itemID, 14, new ItemStack(VetheaItemHelper.finishedChest));

		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanGlisteningTemplate.itemID, 16, new ItemStack(VetheaItemHelper.glisteningHelmetMelee));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanGlisteningTemplate.itemID, 14, new ItemStack(VetheaItemHelper.glisteningHelmetArcana));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanGlisteningTemplate.itemID, 18, new ItemStack(VetheaItemHelper.glisteningHelmetRanged));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanGlisteningTemplate.itemID, 12, new ItemStack(VetheaItemHelper.glisteningBoots));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanGlisteningTemplate.itemID, 16, new ItemStack(VetheaItemHelper.glisteningLegs));
		addRecipe(VetheaItemHelper.pardimalLump.itemID, VetheaItemHelper.vetheanGlisteningTemplate.itemID, 20, new ItemStack(VetheaItemHelper.glisteningChest));

		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDemonizedTemplate.itemID, 20, new ItemStack(VetheaItemHelper.demonizedHelmetMelee));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDemonizedTemplate.itemID, 16, new ItemStack(VetheaItemHelper.demonizedHelmetArcana));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDemonizedTemplate.itemID, 22, new ItemStack(VetheaItemHelper.demonizedHelmetRanged));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDemonizedTemplate.itemID, 14, new ItemStack(VetheaItemHelper.demonizedBoots));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDemonizedTemplate.itemID, 20, new ItemStack(VetheaItemHelper.demonizedLegs));
		addRecipe(VetheaItemHelper.karosLump.itemID, VetheaItemHelper.vetheanDemonizedTemplate.itemID, 26, new ItemStack(VetheaItemHelper.demonizedChest));

		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanTormentedTemplate.itemID, 24, new ItemStack(VetheaItemHelper.tormentedHelmetMelee));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanTormentedTemplate.itemID, 22, new ItemStack(VetheaItemHelper.tormentedHelmetArcana));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanTormentedTemplate.itemID, 26, new ItemStack(VetheaItemHelper.tormentedHelmetRanged));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanTormentedTemplate.itemID, 20, new ItemStack(VetheaItemHelper.tormentedBoots));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanTormentedTemplate.itemID, 24, new ItemStack(VetheaItemHelper.tormentedLegs));
		addRecipe(VetheaItemHelper.arksianeLump.itemID, VetheaItemHelper.vetheanTormentedTemplate.itemID, 35, new ItemStack(VetheaItemHelper.tormentedChest));
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
