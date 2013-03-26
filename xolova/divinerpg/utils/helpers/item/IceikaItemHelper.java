package xolova.divinerpg.utils.helpers.item;

import net.minecraft.item.Item;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.items.core.ItemDivineRPGRangedConsumable;
import xolova.divinerpg.items.iceika.ItemEnderice;
import xolova.divinerpg.items.iceika.ItemFrostClawCannon;
import xolova.divinerpg.items.iceika.ItemFrostkingSword;
import xolova.divinerpg.items.iceika.ItemFrozenMaul;
import xolova.divinerpg.items.iceika.ItemGlacierSword;
import xolova.divinerpg.items.iceika.ItemIceicleBane;
import xolova.divinerpg.items.iceika.ItemIceineSword;
import xolova.divinerpg.items.iceika.ItemIcicleBow;
import xolova.divinerpg.items.iceika.ItemSerenadeOfIce;
import xolova.divinerpg.items.iceika.ItemSnowSlash;
import xolova.divinerpg.items.iceika.ItemSnowStormBow;
import xolova.divinerpg.items.iceika.ItemSnowflakeShuriken;
import xolova.divinerpg.items.iceika.ItemSoundOfCarols;
import xolova.divinerpg.items.vanilla.ItemMassivence;
import xolova.divinerpg.utils.helpers.config.IceikaConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IceikaItemHelper 
{
    public static Item iceikaDoorItem;
    public static Item snowFlake;
    public static Item icicleBane;
    public static Item soundOfCarols;
    public static Item icineSword;
    public static Item frossivence;
    public static Item enderice;
    public static Item snowSlash;
    public static Item serenadeOfIce;
    public static Item glacierSword;
    public static Item frostKingSword;
    public static Item frozenMaul;
    public static Item frostClawCannon;
    public static Item fractiteCannon;
    public static Item snowFlakeShuriken;
    public static Item icicleBow;
    public static Item snowStormBow;
    public static Item pepperMints;
    public static Item eggNog;
    public static Item chocolateLog;
    public static Item snowCones;
    public static Item fruitCake;
    public static Item santaHead;
    public static Item santaBody;
    public static Item santaLegs;
    public static Item santaBoots;
    
    public static IceikaConfigHelper x;
    
    public static void init()
    {
    	snowFlake = new ItemDivineRPG(x.SnowflakeID).setIconIndex(3, 15, 10).setUnlocalizedName("snowFlake").setCreativeTab(CreativeTabHelper.tabItems);
        icicleBane = new ItemIceicleBane(x.IcicleBaneID).setUnlocalizedName("icicleBane").setCreativeTab(CreativeTabHelper.tabSword);
        soundOfCarols = new ItemSoundOfCarols(x.SoundOfCarolsID).setUnlocalizedName("soundofCarols").setCreativeTab(CreativeTabHelper.tabRanged);
        icineSword = new ItemIceineSword(x.IcineSwordID).setUnlocalizedName("icineSword").setCreativeTab(CreativeTabHelper.tabSword);
        frossivence = new ItemMassivence(x.FrossivenceID, 540).setIconIndex(3, 14, 15).setUnlocalizedName("frossivence").setCreativeTab(CreativeTabHelper.tabSword);
        enderice = new ItemEnderice(x.EndericeID).setUnlocalizedName("enderice").setCreativeTab(CreativeTabHelper.tabSword);
        snowSlash = new ItemSnowSlash(x.SnowslashID).setUnlocalizedName("snowSlash").setCreativeTab(CreativeTabHelper.tabSword);
        serenadeOfIce = new ItemSerenadeOfIce(x.SerenadeOfIceID).setUnlocalizedName("serenadeofIce").setCreativeTab(CreativeTabHelper.tabRanged);
        glacierSword = new ItemGlacierSword(x.GlacierSwordID).setUnlocalizedName("glacierSword").setCreativeTab(CreativeTabHelper.tabSword);
        frostKingSword = new ItemFrostkingSword(x.FrostkingSwordID).setUnlocalizedName("frostKingSword").setCreativeTab(CreativeTabHelper.tabSword);
        frozenMaul = new ItemFrozenMaul(x.FrozenMaulID).setUnlocalizedName("frozenMaul").setCreativeTab(CreativeTabHelper.tabSword);
        
        frostClawCannon = new ItemFrostClawCannon(x.FrostclawCannonID).setUnlocalizedName("frostClawCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        //fractiteCannon = new ItemFractiteCannon(IceikaConfigHelper.fractiteCannonID).setUnlocalizedName("fractiteCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        snowFlakeShuriken = new ItemSnowflakeShuriken(x.SnowflakeShurikenID).setUnlocalizedName("snowFlakeShuriken").setCreativeTab(CreativeTabHelper.tabRanged);
        icicleBow = new ItemIcicleBow(x.IcicleBowID).setUnlocalizedName("icicleBow").setCreativeTab(CreativeTabHelper.tabRanged);
        snowStormBow = new ItemSnowStormBow(x.SnowstormBowID).setUnlocalizedName("frostStormBow").setCreativeTab(CreativeTabHelper.tabRanged);
        /*pepperMints = new ItemFood(IceikaConfigHelper.pepperMintsID, 1, 0.3F, false).setUnlocalizedName("pepperMints").setCreativeTab(CreativeTabHelper.tabHerb);
        eggNog = new ItemBucketMilk(IceikaConfigHelper.eggNogID).setUnlocalizedName("eggNog").setCreativeTab(CreativeTabHelper.tabHerb);
        chocolateLog = new ItemFood(IceikaConfigHelper.chocolateLogID, 4, 1.0F, false).setUnlocalizedName("chocolateLog").setCreativeTab(CreativeTabHelper.tabHerb);
        snowCones = new ItemFood(IceikaConfigHelper.snowConesID, 2, 0.3F, false).setUnlocalizedName("snowCones").setCreativeTab(CreativeTabHelper.tabHerb);
        fruitCake = new ItemFood(IceikaConfigHelper.fruitCakeID, 16, 2.0F, false).setUnlocalizedName("fruitCake").setCreativeTab(CreativeTabHelper.tabHerb);
        
        int santaRender = RenderingRegistry.addNewArmourRendererPrefix("santa");
        santaHead = new ItemDivinerpgArmor(IceikaConfigHelper.santaHeadID, santaRender, 0, -1, 0.0D).setUnlocalizedName("santaHelmet").setCreativeTab(CreativeTabHelper.tabArmor);
        santaBody = new ItemDivinerpgArmor(IceikaConfigHelper.santaBodyID, santaRender, 1, -1, 0.0D).setUnlocalizedName("santaChest").setCreativeTab(CreativeTabHelper.tabArmor);
        santaLegs = new ItemDivinerpgArmor(IceikaConfigHelper.santaLegsID, santaRender, 2, -1, 0.0D).setUnlocalizedName("santaLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        santaBoots = new ItemDivinerpgArmor(IceikaConfigHelper.santaBootsID, santaRender, 3, -1, 0.0D).setUnlocalizedName("santaBoots").setCreativeTab(CreativeTabHelper.tabArmor);
         */	
    
        LanguageRegistry.addName(snowFlake, "Snowflake");
        LanguageRegistry.addName(icicleBane, "Icicle Bane");
        LanguageRegistry.addName(soundOfCarols, "Sound of Carols");
        LanguageRegistry.addName(icineSword, "Icine Sword");
        LanguageRegistry.addName(frossivence, "Frossivence");
        LanguageRegistry.addName(enderice, "Enderice");
        LanguageRegistry.addName(snowSlash, "Snowslash");
        LanguageRegistry.addName(serenadeOfIce, "Serenade of Ice");
        LanguageRegistry.addName(glacierSword, "Glacier Sword");
        LanguageRegistry.addName(frostKingSword, "Frostking Sword");
        LanguageRegistry.addName(frozenMaul, "Frozen Maul");
        LanguageRegistry.addName(frostClawCannon, "Frostclaw Cannon");
        //LanguageRegistry.addName(fractiteCannon, "Fractite Cannon");
        LanguageRegistry.addName(snowFlakeShuriken, "Snowflake Shuriken");
        LanguageRegistry.addName(icicleBow, "Icicle Bow");
        LanguageRegistry.addName(snowStormBow, "Snowstorm Bow");
    }
}
