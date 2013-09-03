package net.divinerpg.utils.helpers.recipe;

import net.divinerpg.DivineRPG;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldRecipeHelper {
	
	// Initialise all overworld recipes
	public static void init() {
		RecipeHelper.removeRecipes(Item.helmetDiamond);
        RecipeHelper.removeRecipes(Item.plateDiamond);
        RecipeHelper.removeRecipes(Item.legsDiamond);
        RecipeHelper.removeRecipes(Item.bootsDiamond);
        RecipeHelper.removeRecipes(Item.helmetIron);
        RecipeHelper.removeRecipes(Item.plateIron);
        RecipeHelper.removeRecipes(Item.legsIron);
        RecipeHelper.removeRecipes(Item.bootsIron);
		//initArmor();
		//initWeapons();
		//initFood();
		//initTools();
		//initBlocks();
		initItems();
	}
	
	public static void initSmelting() {
        GameRegistry.addSmelting(OverworldBlockHelper.realmiteOre.blockID, new ItemStack(OverworldItemHelper.realmiteIngot, 1), 0.7F);
        GameRegistry.addSmelting(OverworldBlockHelper.bloodGemOre.blockID, new ItemStack(OverworldItemHelper.glowingGem, 1), 1.0F);
        GameRegistry.addSmelting(OverworldBlockHelper.arlemiteOre.blockID, new ItemStack(OverworldItemHelper.arlemiteIngot, 1), 3.0F);
        GameRegistry.addSmelting(OverworldBlockHelper.rupeeOre.blockID, new ItemStack(OverworldItemHelper.rupeeIngot, 1), 3.0F);
        GameRegistry.addSmelting(OverworldBlockHelper.netheriteOre.blockID, new ItemStack(OverworldItemHelper.netheriteBar, 1), 1.0F);
        GameRegistry.addSmelting(Block.pumpkin.blockID, new ItemStack(OverworldItemHelper.pumpkinPie, 1), 0);
        GameRegistry.addSmelting(OverworldItemHelper.empoweredMeatRaw.itemID, new ItemStack(OverworldItemHelper.empoweredMeatCooked, 1), 0);
	}
	public static void initArmor() {
		GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.shadowHelmet, 1), new Object[] {"xxx", "x x", 'x', OverworldItemHelper.shadowStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.shadowBody, 1), new Object[] {"x x", "xxx", "xxx", 'x', OverworldItemHelper.shadowStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.shadowLegs, 1), new Object[] {"xxx", "x x", "x x", 'x', OverworldItemHelper.shadowStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.shadowBoots, 1), new Object[] {"x x", "x x", 'x', OverworldItemHelper.shadowStone});
	     
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineHelm, 1), new Object[] {"xxx", "x x", 'x', OverworldItemHelper.divineStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineBody, 1), new Object[] {"x x", "xxx", "xxx", 'x', OverworldItemHelper.divineStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineLegs, 1), new Object[] {"xxx", "x x", "x x", 'x', OverworldItemHelper.divineStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineBoots, 1), new Object[] {"x x", "x x", 'x', OverworldItemHelper.divineStone});
	     
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.angelicHelmet, 1), new Object[] {"yyy", "x x", 'x', OverworldItemHelper.iceStone, 'y', OverworldItemHelper.blueFireStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.angelicBody, 1), new Object[] {"y y", "yyy", "xxx", 'x', OverworldItemHelper.iceStone, 'y', OverworldItemHelper.blueFireStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.angelicLegs, 1), new Object[] {"yyy", "x x", "x x", 'x', OverworldItemHelper.iceStone, 'y', OverworldItemHelper.blueFireStone});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.angelicBoots, 1), new Object[] {"y y", "x x", 'x', OverworldItemHelper.iceStone, 'y', OverworldItemHelper.blueFireStone});
	    
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.diamondHelmet, 1), new Object[] {"xxx", "x x", 'x', Item.diamond});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.diamondChest, 1), new Object[] {"x x", "xxx", "xxx", 'x', Item.diamond});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.diamondLegs, 1), new Object[] {"xxx", "x x", "x x", 'x', Item.diamond});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.diamondBoots, 1), new Object[] {"x x", "x x", 'x', Item.diamond});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderHelmet, 1), new Object[] {"yyy", "y y", 'y', OverworldItemHelper.enderStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderBody, 1), new Object[] {"y y", "yyy", "yyy", 'y', OverworldItemHelper.enderStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderBoots, 1), new Object[] {"y y", "y y", 'y', OverworldItemHelper.enderStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderLegs, 1), new Object[] {"yyy", "y y", "y y", 'y', OverworldItemHelper.enderStone});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaticHelmet, 1), new Object[] {"yyy", "y y", 'y', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaticBody, 1), new Object[] {"y y", "yyy", "yyy", 'y', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaticBoots, 1), new Object[] {"y y", "y y", 'y', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaticLegs, 1), new Object[] {"yyy", "y y", "y y", 'y', OverworldItemHelper.aquaticStone});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.ironHelmet, 1), new Object[] {"xxx", "x x", 'x', Item.ingotIron});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.ironBody, 1), new Object[] {"x x", "xxx", "xxx", 'x', Item.ingotIron});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.ironLegs, 1), new Object[] {"xxx", "x x", "x x", 'x', Item.ingotIron});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.ironBoots, 1), new Object[] {"x x", "x x", 'x', Item.ingotIron});
	}
	
	public static void initItems() {
		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.krakenSkin, 1), new Object[] {OverworldItemHelper.krakenScale, OverworldItemHelper.krakenScale});
	    GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.healingStone, 1), new Object[] {Item.magmaCream, OverworldItemHelper.purpleBlaze, OverworldItemHelper.glowingGem});
	    GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.netheriteChunk, 1), new Object[] {" x ", "xxx", " x ", 'x', OverworldItemHelper.netheriteBar});
	    GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.shadowBar, 1), new Object[] {OverworldItemHelper.arlemiteIngot, OverworldItemHelper.rupeeIngot});
	    
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.hellStoneIngot, 1), new Object[] {OverworldItemHelper.shadowBar, OverworldItemHelper.netheriteChunk});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.jungleStone, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.jungleShard});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineStone, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.divineShard});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.moltenStone, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.moltenShard});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.shadowStone, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.callOfTheWatcher, 1), new Object[] {" x ", "zyz", " z ", 'y', OverworldItemHelper.watcherEye, 'x', OverworldItemHelper.hellStoneIngot, 'z', OverworldItemHelper.moltenStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.hordeHorn, 1), new Object[] {" x ", "zyz", " z ", 'y', Item.eyeOfEnder, 'x', OverworldItemHelper.hellStoneIngot, 'z', OverworldItemHelper.enderStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.mysteriousClock, 1), new Object[] {" x ", "zyz", " z ", 'x', OverworldItemHelper.hellStoneIngot, 'y', Item.pocketSundial, 'z', OverworldItemHelper.corruptedStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderStone, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.enderShard});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.twilightClock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Item.pocketSundial});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.homeTeleporter, 1), new Object[] {"zzz", "zyz", "zzz", 'z', Item.enderPearl, 'y', Item.diamond});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.corruptedStone, 1), new Object[] {"yyy", "yyy", "yyy", 'y', OverworldItemHelper.corruptedShard});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.legendaryEnderEye, 1), new Object[] {"yyy", "yyy", "yyy", 'y', OverworldItemHelper.enderStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.iceStone, 1), new Object[] {"yyy", "yyy", "yyy", 'y', OverworldItemHelper.iceShard});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.rupeeIngot, 9), new Object[]{OverworldBlockHelper.rupeeBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.netheriteBar, 9), new Object[]{OverworldBlockHelper.netheriteBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.arlemiteIngot, 9), new Object[]{OverworldBlockHelper.arlemiteBlock});

        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.realmiteIngot, 9), new Object[]{OverworldBlockHelper.realmiteBlock});
	}
	
	public static void initWeapons() {
		GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaticTrident, 1), new Object[] {" y ", "yyy", " x ", 'y', OverworldItemHelper.aquaticStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaton, 1), new Object[] {"yyy", "yyy", " x ", 'y', OverworldItemHelper.aquaticStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.aquaticMaul, 1), new Object[] {"yyy", "yyy", "yxy", 'y', OverworldItemHelper.aquaticStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.crabClawCannon, 1), new Object[] {" y ", " y ", " x ", 'y', OverworldItemHelper.crabClaw , 'x', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.sharkSword, 1), new Object[] {" y ", " y ", " x ", 'y', OverworldItemHelper.sharkFin , 'x', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bowheadCannon, 1), new Object[] {" y ", " y ", " x ", 'y', OverworldItemHelper.whaleFin , 'x', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.oceanKnife, 1), new Object[] {" y ", " y ", " x ", 'y', OverworldItemHelper.aquaticStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.dualClaw, 1), new Object[] {" y ", "xxx", " y ", 'y', OverworldItemHelper.crabClaw , 'x', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.crabAnchor, 1), new Object[] {"yyy", "yxy", " x ", 'y', OverworldItemHelper.crabClaw , 'x', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bowHeadAnchor, 1), new Object[] {"yyy", "yxy", " x ", 'y', OverworldItemHelper.whaleFin , 'x', OverworldItemHelper.aquaticStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.sharkAnchor, 1), new Object[] {"yyy", "yxy", " x ", 'y', OverworldItemHelper.sharkFin , 'x', OverworldItemHelper.aquaticStone});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderSword, 1), new Object[] {" x ", " x ", " y ", 'x', OverworldItemHelper.legendaryEnderEye, 'y', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.palavence, 1), new Object[] {"x x", "xxx", " x ", 'x', OverworldItemHelper.realmiteIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.massivence, 1), new Object[] {"x x", "yyy", " y ", 'x', OverworldItemHelper.glowingGem, 'y', OverworldItemHelper.netheriteBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.infernoSword, 1), new Object[] {"xyx", "xyx", "xzx", 'x', Item.blazePowder, 'y', Block.oreRedstone, 'z', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bedrockSword, 1), new Object[] {" y ", " y ", " x ", 'x', Item.stick, 'y', Block.bedrock});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.realmiteSword, 1), new Object[] {" y ", " y ", " x ", 'x', Item.stick, 'y', OverworldItemHelper.realmiteIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.arlemiteStabber, 1), new Object[] {" y ", " y ", " x ", 'x', Item.stick, 'y', OverworldItemHelper.arlemiteIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.rupeeSword, 1), new Object[] {" y ", " y ", " x ", 'x', Item.stick, 'y', OverworldItemHelper.rupeeIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.slimeSword, 1), new Object[] {"yxy", "yxy", "yxy", 'y', Item.slimeBall, 'x', Item.swordDiamond});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bedrockMaul, 1), new Object[] {" x ", "xyx", " x ", 'y', Block.bedrock, 'x', Block.bedrock});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.maelstrom, 1), new Object[] {"xxx", "xyx", "xxx", 'x', OverworldItemHelper.purpleBlaze, 'y', Item.book});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.shuriken, 4), new Object[] {Item.ingotIron});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.vileStorm, 4), new Object[] {OverworldItemHelper.shuriken, OverworldItemHelper.shuriken, OverworldItemHelper.shuriken, OverworldItemHelper.shuriken, OverworldItemHelper.jungleShard});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.shadowBow, 1), new Object[] {" xy", "x y", " xy", 'x', OverworldItemHelper.shadowBar, 'y', Item.silk});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.infernoBow, 1), new Object[] {" xy", "x y", " xy", 'x', OverworldItemHelper.moltenStone, 'y', Item.blazePowder});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.poisonBow, 1), new Object[] {" xy", "x y", " xy", 'x', OverworldItemHelper.jungleStone, 'y', Item.silk});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bluefirebow, 1), new Object[] {" xy", "x y", " xy", 'x', Item.silk, 'y', OverworldItemHelper.blueFireStone});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.serenadeStriker, 1), new Object[] {"y  ", "yyy", "  y", 'y', Item.diamond});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.serenadeHealth, 1), new Object[] {"y  ", "yyy", "  y", 'y', OverworldItemHelper.netheriteChunk});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.serenadeOfDeath, 1), new Object[] {"y  ", "yyy", "  y", 'y', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.seranadeGrowth, 1), new Object[] {"y  ", "yyy", "  y", 'y', OverworldItemHelper.arlemiteIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.frostCannon, 1), new Object[] {"x x", "x x", "yyy", 'y', OverworldItemHelper.iceStone, 'x', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.ghastCannon, 1), new Object[] {"x x", "x x", "yyy", 'y', OverworldItemHelper.hellStoneIngot, 'x', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.soundOfMusic, 1), new Object[] {"yyy", "yxy", "yyy", 'y', OverworldItemHelper.purpleBlaze, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineSword, 1), new Object[] {" y ", "yyy", " x ", 'y', OverworldItemHelper.divineStone, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.poisonSaber, 1), new Object[] {" y ", "zyz", "zxz", 'y', OverworldItemHelper.jungleStone, 'x', Item.stick, 'z', OverworldItemHelper.shadowBar});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.corruptedPickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', OverworldItemHelper.corruptedStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.corruptedShovel, 1), new Object[] {" y ", " x ", " x ", 'y', OverworldItemHelper.corruptedStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.corruptedAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', OverworldItemHelper.corruptedStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.corruptedMaul, 1), new Object[] {"yyy", "yxy", " x ", 'y', OverworldItemHelper.corruptedStone , 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.deathBringer, 1), new Object[] {" y ", "yxy", " x ", 'y', OverworldItemHelper.corruptedStone , 'x', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.moltenSword, 1), new Object[] {" y ", " y ", " x ", 'y', OverworldItemHelper.moltenStone, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.frostSword, 1), new Object[] {" y ", " y ", " x ", 'y', OverworldItemHelper.iceStone, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.enderBow, 1), new Object[] {" xz", "y z", " xz", 'x', OverworldItemHelper.enderStone, 'y', OverworldItemHelper.watcherEye, 'z', Item.silk});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.corruptCannon, 1), new Object[] {"yyy", "x x", 'y', OverworldItemHelper.corruptedStone, 'x', Item.stick});
        
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.corruptBullet, 16), new Object[] {OverworldItemHelper.corruptedShard});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.flamingFury, 1), new Object[] {"zxz", "zxz", "zyz", 'z', OverworldItemHelper.infernoSword, 'x', OverworldItemHelper.furyFire, 'y', OverworldItemHelper.shadowBar});
	}
	
	public static void initFood() {
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.donut, 1), new Object[] {"xxx", "x x", "xxx", 'x', Item.wheat});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.pizzaDough, 1), new Object[] {"x x", "xxx", 'x', Item.wheat});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.bacon, 6), new Object[] {Item.porkRaw});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.waterMelon, 1), new Object[] {"xxx", "xxx", 'x', Item.melon});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.cheese, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Item.bucketMilk});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.miniPizza, 4), new Object[] {OverworldItemHelper.whiteMushroom, OverworldItemHelper.tomato, OverworldItemHelper.pizzaDough, OverworldItemHelper.cheese});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.dinner, 4), new Object[] {Item.bread, Item.chickenRaw, Item.bowlSoup, OverworldItemHelper.whiteMushroom, OverworldItemHelper.whiteMushroom});
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(OverworldItemHelper.boiledEgg, 1), 0);
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.tomatoSeeds, 4), new Object[] {OverworldItemHelper.tomato});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.whiteMushroomSeeds, 4), new Object[] {OverworldItemHelper.whiteMushroom});

	}
	
	public static void initTools() {
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.realmitePickaxe, 1), new Object[] {"xxx", " y ", " y ", 'x', OverworldItemHelper.realmiteIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.realmiteAxe, 1), new Object[] {"xx ", "xy ", " y ", 'x', OverworldItemHelper.realmiteIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.realmiteShovel, 1), new Object[] {" x ", " y ", " y ", 'x', OverworldItemHelper.realmiteIngot, 'y', Item.stick});

        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bedrockPickaxe, 1), new Object[] {"xxx", " y ", " y ", 'x', Block.bedrock, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bedrockAxe, 1), new Object[] {"xx ", "xy ", " y ", 'x', Block.bedrock, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.bedrockShovel, 1), new Object[] {" x ", " y ", " y ", 'x', Block.bedrock, 'y', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.arlemitePickaxe, 1), new Object[] {"xxx", " y ", " y ", 'x', OverworldItemHelper.arlemiteIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.arlemiteAxe, 1), new Object[] {"xx ", "xy ", " y ", 'x', OverworldItemHelper.arlemiteIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.arlemiteShovel, 1), new Object[] {" x ", " y ", " y ", 'x', OverworldItemHelper.arlemiteIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.arlemiteHoe, 1), new Object[] {"xx ", " y ", " y ", 'x', OverworldItemHelper.arlemiteIngot, 'y', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.arlemiteShicaxe, 1), new Object[] {OverworldItemHelper.arlemiteHoe, OverworldItemHelper.arlemiteShovel, OverworldItemHelper.rupeePickaxe, OverworldItemHelper.rupeeAxe});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.rupeePickaxe, 1), new Object[] {"xxx", " y ", " y ", 'x', OverworldItemHelper.rupeeIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.rupeeAxe, 1), new Object[] {"xx ", "xy ", " y ", 'x', OverworldItemHelper.rupeeIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.rupeeShovel, 1), new Object[] {" x ", " y ", " y ", 'x', OverworldItemHelper.rupeeIngot, 'y', Item.stick});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.rupeeHoe, 1), new Object[] {"xx ", " y ", " y ", 'x', OverworldItemHelper.rupeeIngot, 'y', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.rupeeShicaxe, 1), new Object[] {OverworldItemHelper.rupeeHoe, OverworldItemHelper.rupeeShovel, OverworldItemHelper.rupeePickaxe, OverworldItemHelper.rupeeAxe});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divinePickaxe, 1), new Object[] {"xxx", " y ", " y ", 'x', OverworldItemHelper.divineStone, 'y', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineAxe, 1), new Object[] {"xx ", "xy ", " y ", 'x', OverworldItemHelper.divineStone, 'y', OverworldItemHelper.shadowBar});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.divineShovel, 1), new Object[] {" x ", " y ", " y ", 'x', OverworldItemHelper.divineStone, 'y', OverworldItemHelper.shadowBar});
	}
	
	public static void initBlocks() {
		GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.hotSpike, 1), new Object[] {"y y", " y ", "y y", 'y', OverworldItemHelper.netheriteBar });
		GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.obsidianBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Block.obsidian});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 0), new Object[] {"xxx", "xxx", "xxx", 'x', Block.ice});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Item.flint});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 2), new Object[] {"xxx", "xxx", "xxx", 'x', Block.gravel});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 3), new Object[] {"xxx", "xxx", "xxx", 'x', Item.coal});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 4), new Object[] {"xxx", "xxx", "xxx", 'x', Block.stone});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 5), new Object[] {"xxx", "xxx", "xxx", 'x', Block.sand});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 6), new Object[] {"xxx", "xxx", "xxx", 'x', Block.slowSand});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceblock, 1, 7), new Object[] {"xxx", "xxx", "xxx", 'x', Block.dirt});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.realmiteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.realmiteIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.bedrock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Block.bedrock});
        GameRegistry.addShapelessRecipe(new ItemStack(Block.obsidian, 9), new Object[] {OverworldBlockHelper.obsidianBlock});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 0), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 2), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 3), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 4), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 5), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 6), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 15)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 7), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 8), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 9), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 13)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 11), new Object[] {"xxx", "y y", "xxx", 'x', Block.planks, 'y', Block.wood});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 1, 12), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Block.planks, 1, 0), 'y', new ItemStack(Block.planks, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.milkStone, 4), new Object[] {Block.stone, Block.stone, Block.stone, Item.bucketMilk});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.darkStone, 10), new Object[] {Block.obsidian, Block.glowStone});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.netherrack, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Block.netherrack});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.redstoneBrick, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Item.redstone});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.lapisBrick, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, new ItemStack(Item.dyePowder, 1, 4)});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.netheriteBrick, 4), new Object[] {OverworldItemHelper.netheriteBar});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.realmiteBrick, 4), new Object[] {OverworldItemHelper.realmiteIngot, OverworldItemHelper.realmiteIngot, OverworldItemHelper.realmiteIngot, OverworldItemHelper.realmiteIngot, OverworldItemHelper.realmiteIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.goldBrick, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Item.ingotGold});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.ironBrick, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Item.ingotIron});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.darkBrick, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, new ItemStack(Item.dyePowder, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.milkStoneBrick, 4), new Object[] {OverworldBlockHelper.milkStone, OverworldBlockHelper.milkStone, OverworldBlockHelper.milkStone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.checker, 3, 0), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Block.cloth, 1, 0), 'y', new ItemStack(Block.cloth, 1, 15)});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.eucalyptusPlanks, 4), new Object[] {OverworldBlockHelper.eucalyptus});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stoneFence, 4), new Object[] {"xxx", "xxx", 'x', Block.cobblestone});
        //GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.woodFence, 4), new Object[] {"xxx", "xxx", 'x', Block.planks});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.lightFenceBlue, 4), new Object[] {"yyy", "yyy", 'y', new ItemStack(Item.dyePowder, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.lightFenceRed, 4), new Object[] {"yyy", "yyy", 'y', Item.redstone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 0), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 15)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 1), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 2), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 13)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 3), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 12)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 4), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 5), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 6), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 9)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 7), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 8)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 8), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 9), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 10), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 11), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 12), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 13), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.dyeBlocks, 1, 14), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 0)});GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.slimeLight, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', Item.slimeBall});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.rupeeLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', OverworldItemHelper.rupeeIngot, 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.aquaLamp, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', Item.bucketWater});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.blazicLamp, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', Item.blazeRod});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.drakenLamp, 1), new Object[] {"xxx", "zyz", "xxx", 'x', Item.ingotIron, 'y', Item.bucketLava, 'z', Block.blockGold});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.arlemiteLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', OverworldItemHelper.arlemiteIngot, 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.enderLamp, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', Item.eyeOfEnder});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.krakenLamp, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', OverworldItemHelper.krakenSkin});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.lavaLamp, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', Item.bucketLava});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.milkyLamp, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.ingotIron, 'y', Item.bucketMilk});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.moltenLamp, 1), new Object[] {Block.glowStone, OverworldItemHelper.moltenStone});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.blueFireLamp, 1), new Object[] {Block.glowStone, OverworldItemHelper.blueFireStone});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 4, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 1, 0), new Object[] {new ItemStack(OverworldBlockHelper.miniBricks, 1, 4), OverworldItemHelper.rupeeIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 1, 1), new Object[] {new ItemStack(OverworldBlockHelper.miniBricks, 1, 4), OverworldItemHelper.realmiteIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 1, 2), new Object[] {new ItemStack(OverworldBlockHelper.miniBricks, 1, 4), OverworldItemHelper.arlemiteIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 1, 5), new Object[] {new ItemStack(OverworldBlockHelper.miniBricks, 1, 4), OverworldItemHelper.glowingGem});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 1, 6), new Object[] {new ItemStack(OverworldBlockHelper.miniBricks, 1, 4), OverworldItemHelper.netheriteBar});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.miniBricks, 1, 8), new Object[] {new ItemStack(OverworldBlockHelper.miniBricks, 1, 4), Block.bedrock});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.spiderPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.silk, 'y', Block.pumpkin});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.enderPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.enderPearl, 'y', Block.pumpkin});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.creeperPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.gunpowder, 'y', Block.pumpkin});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.skeletonPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.bone, 'y', Block.pumpkin});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.blazePumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'x', Item.blazeRod, 'y', Block.pumpkin});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.rainbowWool, 1), new Object[] {new ItemStack(Block.cloth, 1, 1), new ItemStack(Block.cloth, 1, 14), new ItemStack(Block.cloth, 1, 4), new ItemStack(Block.cloth, 1, 5), new ItemStack(Block.cloth, 1, 9), new ItemStack(Block.cloth, 1, 11), new ItemStack(Block.cloth, 1, 10)});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.lavaBrick, 4), new Object[] {Block.stoneBrick, Block.stoneBrick, Block.stoneBrick, Item.bucketLava});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.darkStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.darkBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.arlemiteStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.arlemiteBrick,});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.ironStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.ironBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.goldStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.goldBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.sandStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', Block.sand});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.redstoneStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.redstoneBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.milkstoneStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.milkStone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.milkstoneBrickStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.milkStoneBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.lapisStairs, 4), new Object[] {"  x", " xx", "xxx", 'x', OverworldBlockHelper.lapisBrick});

        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.arlemiteBrick, 10), new Object[] {"xyx", "yxy", "xyx", 'x', OverworldItemHelper.arlemiteIngot, 'y', Block.stoneBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.darkPlate, 1), new Object[] {"xx", 'x', OverworldBlockHelper.darkBrick,});
        
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.spikes, 1), new Object[] {"x x", " x ", "x x", 'x', Item.ingotIron});
        
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.realmiteLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', OverworldItemHelper.realmiteIngot, 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.diamondLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', Item.diamond, 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.goldenLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', Item.ingotGold, 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.redstoneOreLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', Item.redstone, 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.lapisLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', new ItemStack(Item.dyePowder, 1, 4), 'z', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.netheriteLamp, 1), new Object[] {"xxx", "xyx", "xzx", 'x', Item.ingotIron, 'y', OverworldItemHelper.netheriteBar, 'z', Block.glowStone});
        
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.redWood, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 1), Block.wood});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.purpleWood, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 5), Block.wood});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.greenWood, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 2), Block.wood});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.yellowWood, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 11), Block.wood});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.whiteWood, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 15), Block.wood});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.blueWood, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 4), Block.wood});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stoneFence, 2), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.darkBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.woodFence, 2), new Object[] {"xxx", "xxx", 'x', Block.wood});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.lightStone, 1), new Object[] {"xxx", "xxx", "xxx", 'x', Block.glowStone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.purplestone, 1), new Object[] {"xxx", "xyx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 4), 'y', Block.blockRedstone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.steel, 5, 13), new Object[] {"xxx", "xyx", "xxx", 'x', new ItemStack(Block.cloth, 1, 14), 'y', new ItemStack(Block.cloth, 1, 4)});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.divineStoneLamp, 2), new Object[] {Block.glowStone, OverworldItemHelper.divineStone});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.jungleStoneLamp, 2), new Object[] {Block.glowStone, OverworldItemHelper.jungleStone});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.enderStoneLamp, 2), new Object[] {Block.glowStone, OverworldItemHelper.enderStone});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.diamondBrick, 4), new Object[] {Item.diamond, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.enderBrick, 4), new Object[] {Item.enderPearl, Block.stoneBrick, Block.stoneBrick, Block.stoneBrick});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.netheriteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.netheriteBar});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.arlemiteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.arlemiteIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.rupeeBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', OverworldItemHelper.rupeeIngot});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.zombiePumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', Item.rottenFlesh});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.iceManPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', OverworldItemHelper.iceShard});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.cyclopsPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', Item.ingotGold});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.ghastPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', Item.ghastTear});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.frostPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', OverworldItemHelper.iceStone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.enderWatcherPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', OverworldItemHelper.enderShard});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.jungleSpiderPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', OverworldItemHelper.jungleShard});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.hellSpiderPumpkin, 1), new Object[] {"xxx", "xyx", "xxx", 'y', Block.pumpkin, 'x', OverworldItemHelper.moltenShard});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassWhite, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 15), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassOrange, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 14), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassLightPurple, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 13), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassLightBlue, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 12), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassYellow, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 11), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassLimeGreen, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 10), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassPink, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 9), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassGray, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 8), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassLightGray, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 7), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassTeal, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 6), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassBlue, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 4), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassPurple, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 5), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassBrown, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 3), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassDirtyGreen, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 2), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassRed, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 1), Block.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.glassBlack, 2), new Object[] {new ItemStack(Item.dyePowder, 1, 0), Block.glass});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneBlack, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassBlack});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneRed, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassRed});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneDirtyGreen, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassDirtyGreen});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneBrown, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassBrown});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.panePurple, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassPurple});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneBlue, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassBlue});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneTeal, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassTeal});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneLightGray, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassLightGray});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneGray, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassGray});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.panePink, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassPink});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneLimeGreen, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassLimeGreen});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneYellow, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassYellow});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneLightBlue, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassLightBlue});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneLightPurple, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassLightPurple});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneOrange, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassOrange});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.paneWhite, 16), new Object[] {"xxx", "xxx", 'x', OverworldBlockHelper.glassWhite});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldBlockHelper.divineRock, 1), new Object[] {OverworldItemHelper.divineShard, Block.stone});
        GameRegistry.addRecipe(new ItemStack(Block.bedrock, 1), new Object[] {"yyy", "yxy ", "yyy", 'y', Block.obsidian, 'x', OverworldBlockHelper.rupeeBlock});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.krakenScale, 1), new Object[] {"y y", "y y", "yyy", 'y', new ItemStack(Item.dyePowder, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.skeletonChest, 1), new Object[] {"yyy", "y y", "yyy", 'y', Item.bone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.deadBridge, 5), new Object[] {"yyy", "y y", "yyy", 'y', Item.glowstone});
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.skullTorch, 4), new Object[] {"x", "y", 'y', Item.bone, 'x', Item.coal});
        
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.corruptedAlter, 1), new Object[] {"yyy", "xxx", "xxx", 'y', OverworldItemHelper.corruptedStone , 'x', OverworldBlockHelper.darkStone});
        
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass, 1), new Object[] { "y  ", " x ", "   ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass1, 1), new Object[] { " y ", " x ", "   ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass2, 1), new Object[] { "   y", " x ", "   ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass3, 1), new Object[] { "   ", "yx ", "   ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass4, 1), new Object[] { "   ", " xy", "   ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass5, 1), new Object[] { "   ", " x ", "y  ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass6, 1), new Object[] { "   ", " x ", " y ", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.stainedGlass7, 1), new Object[] { "   ", " x ", "  y", Character.valueOf('x'), Block.glass, Character.valueOf('y'), ArcanaItemHelper.marsineItem });
	}
}
