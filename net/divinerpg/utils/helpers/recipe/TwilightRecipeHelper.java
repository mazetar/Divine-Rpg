package net.divinerpg.utils.helpers.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.DivineRPG;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
public class TwilightRecipeHelper {
	public static void init() {
		initBlocks();
		initWeapons();
		initTools();
		initArmor();
		initItems();
		initSmelting();
	}
	
	public static void initBlocks() {
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.draviteChest, 1), new Object[] {"xxx", "x x", "xxx", 'x', TwilightItemHelper.DraviteFragments});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.uviteRail, 4), new Object[] {"x x", "xxx", "x x", 'x', TwilightItemHelper.UviteFragments});

        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.DraviteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.DraviteFragments});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.AzuriteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.AzuriteFragments});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.UviteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.UviteFragments});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.MythrilBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.MythrilFragments});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.AugiteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.AugiteFragments});
	}
	public static void initWeapons() {
		GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.DraviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.DraviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.DraviteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DravitePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.DraviteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.DraviteSlicer, 40), new Object[] {TwilightItemHelper.DraviteGem});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.AzuriteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.AzuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.AzuriteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuritePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.AzuriteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AzuriteSlicer, 40), new Object[] {TwilightItemHelper.AzuriteGem});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.UviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.UviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.UviteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UvitePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.UviteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.UviteSlicer, 40), new Object[] {TwilightItemHelper.UviteGem});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.MythrilChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.MythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.MythrilChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilPhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.MythrilChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.MythrilSlicer, 40), new Object[] {TwilightItemHelper.MythrilGem});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.AugiteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.AugiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.AugiteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugitePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.AugiteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AugiteSlicer, 40), new Object[] {TwilightItemHelper.AugiteGem});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteArrow, 4), new Object[]{" y ", " x ", " z ", 'y', TwilightItemHelper.AzuriteFragments, 'x', Item.stick, 'z', Item.feather });
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.FuryArrow, 4), new Object[]{" y ", " x ", " z ", 'y', TwilightItemHelper.AugiteFragments, 'x', Item.stick, 'z', Item.feather });
	}
	
	public static void initTools() {
		GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DravitePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.DraviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.DraviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.DraviteChunk, 'x', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuritePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.AzuriteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.AzuriteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.AzuriteChunk, 'x', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UvitePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.UviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.UviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.UviteChunk, 'x', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilPickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.MythrilChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.MythrilChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.MythrilChunk, 'x', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugitePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.AugiteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.AugiteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.AugiteChunk, 'x', Item.stick});
	}

	public static void initArmor() {
		GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.DraviteChunk});
	    GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.DraviteChunk});
	    GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Dravitelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.DraviteChunk});
	    GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.DraviteChunk});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.AzuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.AzuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Azuritelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.AzuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.AzuriteChunk});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.UviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.UviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Uvitelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.UviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.UviteChunk});
    
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.MythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.MythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Mythrillegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.MythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.MythrilChunk});

        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.AugiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.AugiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Augitelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.AugiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.AugiteChunk});

	}
	
	public static void initItems() {
		GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.DraviteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.DraviteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.DraviteFragments, 1), new Object[]{TwilightItemHelper.DraviteSoul});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.AzuriteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.AzuriteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AzuriteFragments, 1), new Object[]{TwilightItemHelper.AzuriteSoul});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.UviteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.UviteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.UviteFragments, 1), new Object[]{TwilightItemHelper.UviteSoul});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.MythrilGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.MythrilFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.MythrilFragments, 1), new Object[]{TwilightItemHelper.MythrilSoul});
        
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.AugiteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.AugiteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.MythrilFragments, 1), new Object[]{TwilightItemHelper.MythrilSoul});
        
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnBase, 1), new Object[] {TwilightItemHelper.MythrilSoul, TwilightItemHelper.MythrilSoul, TwilightItemHelper.MythrilSoul, TwilightItemHelper.MythrilSoul, TwilightItemHelper.MythrilSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnVamacheron, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AugiteSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnKAROT, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.UviteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.MythrilSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnReyvor, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.DraviteSoul, TwilightItemHelper.AzuriteSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnDensos, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.UviteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AzuriteSoul, TwilightItemHelper.MythrilSoul});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.spawnMamormeter, 1), new Object[] {"xxx", "xyx", "xxx", 'x', OverworldItemHelper.purpleBlaze, 'y', OverworldItemHelper.infernoSword});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnZichile, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.DraviteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.DraviteSoul, TwilightItemHelper.AzuriteSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnTwilightDemon, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AugiteSoul, TwilightItemHelper.AzuriteSoul, TwilightItemHelper.MythrilSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnSoulFiend, 1), new Object[] {TwilightItemHelper.spawnBase, TwilightItemHelper.UviteSoul, TwilightItemHelper.MythrilSoul, TwilightItemHelper.AzuriteSoul, TwilightItemHelper.DraviteSoul});
        
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.DraviteDust, 9), new Object[] {TwilightItemHelper.DraviteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AzuriteDust, 9), new Object[] {TwilightItemHelper.AzuriteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.MythrilDust, 9), new Object[] {TwilightItemHelper.MythrilFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.UviteDust, 9), new Object[] {TwilightItemHelper.UviteFragments});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AugiteDust, 9), new Object[] {TwilightItemHelper.AugiteFragments});
        
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.DraviteLamp, 1), new Object[] { "xxx", "xyx", "xxx", 'y', TwilightItemHelper.DraviteFragments, 'x', Item.ingotIron });
	}
	
	public static void initSmelting() {
		GameRegistry.addSmelting(TwilightBlockHelper.DraviteOre.blockID, new ItemStack(TwilightItemHelper.DraviteFragments, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.AzuriteOre.blockID, new ItemStack(TwilightItemHelper.AzuriteFragments, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.UviteOre.blockID, new ItemStack(TwilightItemHelper.UviteFragments, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.MythrilOre.blockID, new ItemStack(TwilightItemHelper.MythrilFragments, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.AugiteOre.blockID, new ItemStack(TwilightItemHelper.AugiteFragments, 1), 1.0F);
        GameRegistry.addSmelting(TwilightItemHelper.DraviteFragments.itemID, new ItemStack(TwilightItemHelper.DraviteSparkles, 1), 1.0F);
	}
}
