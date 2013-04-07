package xolova.divinerpg.utils.helpers.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.items.overworld.ItemTwilightClock;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;

public class TwilightItemHelper 
{
	public static Item DraviteGem;
	public static Item DraviteChunk;
	public static Item DraviteFragments;
	public static Item DraviteDust;
	public static Item DraviteBlade;
	public static Item DravitePhaser;
	public static Item DraviteBlitz;
	public static Item DraviteBow;
	public static Item DraviteHelmet;
	public static Item DraviteBoots;
	public static Item Dravitelegs;
	public static Item DraviteChest;
	public static Item DraviteSlicer;
	public static Item DraviteSoul;
	
	public static Item AzuriteGem;
	public static Item AzuriteChunk;
	public static Item AzuriteFragments;
	public static Item AzuriteDust;
	public static Item AzuriteBlade;
	public static Item AzuritePhaser;
	public static Item AzuriteBlitz;
	public static Item AzuriteBow;
	public static Item AzuriteHelmet;
	public static Item AzuriteBoots;
	public static Item Azuritelegs;
	public static Item AzuriteChest;
	public static Item AzuriteSlicer;
	public static Item AzuriteSoul;
	public static Item AzuriteArrow;

	public static Item UviteGem;
	public static Item UviteChunk;
	public static Item UviteFragments;
	public static Item UviteDust;
	public static Item UviteBlade;
	public static Item UvitePhaser;
	public static Item UviteBlitz;
	public static Item UviteBow;
	public static Item UviteHelmet;
	public static Item UviteBoots;
	public static Item Uvitelegs;
	public static Item UviteChest;
	public static Item UviteSlicer;
	public static Item UviteSoul;

	public static Item MythrilGem;
	public static Item MythrilChunk;
	public static Item MythrilFragments;
	public static Item MythrilDust;
	public static Item MythrilBlade;
	public static Item MythrilPhaser;
	public static Item MythrilBlitz;
	public static Item MythrilBow;
	public static Item MythrilHelmet;
	public static Item MythrilBoots;
	public static Item Mythrillegs;
	public static Item MythrilChest;
	public static Item MythrilSlicer;
	public static Item MythrilSoul;

	public static Item AugiteGem;
	public static Item AugiteChunk;
	public static Item AugiteFragments;
	public static Item AugiteDust;
	public static Item AugiteBlade;
	public static Item AugitePhaser;
	public static Item AugiteBlitz;
	public static Item AugiteBow;
	public static Item AugiteHelmet;
	public static Item AugiteBoots;
	public static Item Augitelegs;
	public static Item AugiteChest;
	public static Item AugiteSlicer;
	public static Item AugiteSoul;
	
	public static Item FuryArrow;
	public static Item TwilightBow;
	public static Item TwilightClock;
	public static Item blueSeeds;
	public static Item magicMeat;
	
	public static TwilightConfigHelper x;

	public static void init()
	{
		DraviteGem = new ItemDivineRPG(x.DraviteGemID, 2).setIconIndex(2, 11, 6).setCreativeTab(CreativeTabs.tabMisc);
		DraviteChunk = new ItemDivineRPG(x.DraviteChunkID, 2).setIconIndex(2, 2, 6).setCreativeTab(CreativeTabs.tabMisc);
		DraviteFragments = new ItemDivineRPG(x.DraviteFragmentsID, 2).setIconIndex(2, 15, 9).setCreativeTab(CreativeTabs.tabMisc);
		DraviteDust = new ItemDivineRPG(x.DraviteDustID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteBlade = new ItemDivineRPG(x.DraviteBladeID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DravitePhaser = new ItemDivineRPG(x.DravitePhaserID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteBlitz = new ItemDivineRPG(x.DraviteBlitzID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteBow = new ItemDivineRPG(x.DraviteBowID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteHelmet = new ItemDivineRPG(x.DraviteHelmetID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteBoots = new ItemDivineRPG(x.DraviteBootsID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		Dravitelegs = new ItemDivineRPG(x.DravitelegsID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteChest = new ItemDivineRPG(x.DraviteChestID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteSlicer = new ItemDivineRPG(x.DraviteSlicerID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		DraviteSoul = new ItemDivineRPG(x.DraviteSoulID, 2).setIconIndex(2, 3).setCreativeTab(CreativeTabs.tabMisc);
		
		TwilightClock = new ItemTwilightClock(5330).setCreativeTab(CreativeTabs.tabTools);
	}
}
