package net.divinerpg.utils.helpers.gui;

public class DivineTabs
{
    public static CreativeTabTwilight tabSword;
    public static CreativeTabDivineBlock tabBlocks;
    public static CreativeTabItem tabItems;
    public static CreativeTabMobSpawners tabSpawner;
    public static CreativeTabRangedWeapons tabRanged;
    public static CreativeTabLighting tabLighting;
    public static CreativeTabUtility tabUtility;
    public static CreativeTabHerbs tabHerb;
    public static CreativeTabArmor tabArmor;
    public static CreativeTabTool tabTool;
    public static CreativeTabUnsorted tabUnsorted;
    
    public static void init () {
        tabSword = new CreativeTabTwilight();
        tabBlocks = new CreativeTabDivineBlock();
        tabItems = new CreativeTabItem();
        tabSpawner = new CreativeTabMobSpawners();
        tabRanged = new CreativeTabRangedWeapons();
        tabLighting = new CreativeTabLighting();
        tabUtility = new CreativeTabUtility();
        tabHerb = new CreativeTabHerbs();
        tabArmor = new CreativeTabArmor();
        tabTool = new CreativeTabTool();
        tabUnsorted = new CreativeTabUnsorted();
    }
}
