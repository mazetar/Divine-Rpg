package net.divinerpg.utils.helpers.item;

import net.divinerpg.items.ItemDivine;
import net.divinerpg.items.core.DivineBow;
import net.divinerpg.items.core.ItemDivineRPGFood;
import net.divinerpg.items.iceika.ItemEggNog;
import net.divinerpg.items.iceika.ItemEnderice;
import net.divinerpg.items.iceika.ItemFractiteCannon;
import net.divinerpg.items.iceika.ItemFrostClawCannon;
import net.divinerpg.items.iceika.ItemFrostkingSword;
import net.divinerpg.items.iceika.ItemFrozenMaul;
import net.divinerpg.items.iceika.ItemGlacierSword;
import net.divinerpg.items.iceika.ItemIceicleBane;
import net.divinerpg.items.iceika.ItemIceineSword;
import net.divinerpg.items.iceika.ItemSantaArmor;
import net.divinerpg.items.iceika.ItemSerenadeOfIce;
import net.divinerpg.items.iceika.ItemSnowSlash;
import net.divinerpg.items.iceika.ItemSnowStormBow;
import net.divinerpg.items.iceika.ItemSnowflakeShuriken;
import net.divinerpg.items.iceika.ItemSoundOfCarols;
import net.divinerpg.items.overworld.ItemBlueBow;
import net.divinerpg.items.overworld.ItemMassivence;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.item.Item;
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
    public static Item santaHelmet;
    public static Item santaBody;
    public static Item santaLegs;
    public static Item santaBoots;
    public static Item bluefireBow;    
    public static IceikaConfigHelper x;
    
    public static void init()
    {
    	snowFlake = new ItemDivine(x.SnowflakeID).func_111206_d("SnowFlake").func_111206_d("TEXTURE_NAME_HERE").setUnlocalizedName("snowFlake").setCreativeTab(DivineTabs.tabItems);
        icicleBane = new ItemIceicleBane(x.IcicleBaneID).func_111206_d("IcicleBane").setUnlocalizedName("icicleBane").setCreativeTab(DivineTabs.tabSword);
        soundOfCarols = new ItemSoundOfCarols(x.SoundOfCarolsID).func_111206_d("SoundOfCarols").setUnlocalizedName("soundofCarols").setCreativeTab(DivineTabs.tabRanged);
        icineSword = new ItemIceineSword(x.IcineSwordID).func_111206_d("IcineSword").setUnlocalizedName("icineSword").setCreativeTab(DivineTabs.tabSword);
        frossivence = new ItemMassivence(x.FrossivenceID, 540).func_111206_d("Frossivence").setUnlocalizedName("frossivence").setCreativeTab(DivineTabs.tabSword);
        enderice = new ItemEnderice(x.EndericeID).func_111206_d("Enderice").setUnlocalizedName("enderice").setCreativeTab(DivineTabs.tabSword);
        snowSlash = new ItemSnowSlash(x.SnowslashID).func_111206_d("SnowSlash").setUnlocalizedName("snowSlash").setCreativeTab(DivineTabs.tabSword);
        serenadeOfIce = new ItemSerenadeOfIce(x.SerenadeOfIceID).func_111206_d("SerenadeOfIce").setUnlocalizedName("serenadeofIce").setCreativeTab(DivineTabs.tabRanged);
        glacierSword = new ItemGlacierSword(x.GlacierSwordID).func_111206_d("GlacierSword").setUnlocalizedName("glacierSword").setCreativeTab(DivineTabs.tabSword);
        frostKingSword = new ItemFrostkingSword(x.FrostkingSwordID).func_111206_d("FrostKingSword").setUnlocalizedName("frostKingSword").setCreativeTab(DivineTabs.tabSword);
        frozenMaul = new ItemFrozenMaul(x.FrozenMaulID).func_111206_d("FrozenMaul").setUnlocalizedName("frozenMaul").setCreativeTab(DivineTabs.tabSword);
        
        frostClawCannon = new ItemFrostClawCannon(x.FrostclawCannonID).func_111206_d("FrostClawCannon").setUnlocalizedName("frostClawCannon").setCreativeTab(DivineTabs.tabRanged);
        fractiteCannon = new ItemFractiteCannon(IceikaConfigHelper.fractiteCannonID).func_111206_d("FractiteCannon").setUnlocalizedName("fractiteCannon").setCreativeTab(DivineTabs.tabRanged);
        snowFlakeShuriken = new ItemSnowflakeShuriken(x.SnowflakeShurikenID).func_111206_d("SnowFlakeShuriken").setUnlocalizedName("snowFlakeShuriken").setCreativeTab(DivineTabs.tabRanged);
        icicleBow = new DivineBow(x.IcicleBowID, 10000, 2, 24000, false).func_111206_d("IcicleBow").setUnlocalizedName("icicleBow").setCreativeTab(DivineTabs.tabRanged);
        snowStormBow = new ItemSnowStormBow(x.SnowstormBowID).func_111206_d("SnowStormBow").setUnlocalizedName("frostStormBow").setCreativeTab(DivineTabs.tabRanged);
        pepperMints = new ItemDivineRPGFood(x.PeppermintsID, 1, 0.3F, false).func_111206_d("PepperMints").setUnlocalizedName("pepperMints").setCreativeTab(DivineTabs.tabHerb);
        eggNog = new ItemEggNog(x.EggNogID).func_111206_d("EggNog").setUnlocalizedName("eggNog").setCreativeTab(DivineTabs.tabHerb);
        chocolateLog = new ItemDivineRPGFood(x.ChocolateLogID, 4, 1.0F, false).func_111206_d("ChocolateLog").setUnlocalizedName("chocolateLog").setCreativeTab(DivineTabs.tabHerb);
        snowCones = new ItemDivineRPGFood(x.SnowconesID, 2, 0.3F, false).func_111206_d("SnowCones").setUnlocalizedName("snowCones").setCreativeTab(DivineTabs.tabHerb);
        fruitCake = new ItemDivineRPGFood(x.FruitCakeID, 16, 2.0F, false).func_111206_d("FruitCake").setUnlocalizedName("fruitCake").setCreativeTab(DivineTabs.tabHerb);
        
        bluefireBow = new ItemBlueBow(x.BlueFireBowID).func_111206_d("BluefireBow");
        
        santaHelmet = new ItemSantaArmor(x.SantaHeadID, 0).func_111206_d("SantaHelmet").setUnlocalizedName("santaHelmet").setCreativeTab(DivineTabs.tabArmor);
        santaBody = new ItemSantaArmor(x.SantaBodyID, 1).func_111206_d("SantaBody").setUnlocalizedName("santaChest").setCreativeTab(DivineTabs.tabArmor);
        santaLegs = new ItemSantaArmor(x.SantaLegsID, 2).func_111206_d("SantaLegs").setUnlocalizedName("santaLegs").setCreativeTab(DivineTabs.tabArmor);
        santaBoots = new ItemSantaArmor(x.SantaBootsID, 3).func_111206_d("SantaBoots").setUnlocalizedName("santaBoots").setCreativeTab(DivineTabs.tabArmor);
    
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
        LanguageRegistry.addName(fractiteCannon, "Fractite Cannon");
        LanguageRegistry.addName(snowFlakeShuriken, "Snowflake Shuriken");
        LanguageRegistry.addName(icicleBow, "Icicle Bow");
        LanguageRegistry.addName(snowStormBow, "Snowstorm Bow");
        LanguageRegistry.addName(pepperMints, "Peppermints");
        LanguageRegistry.addName(eggNog, "Egg Nog");
        LanguageRegistry.addName(chocolateLog, "Chocolate Log");
        LanguageRegistry.addName(snowCones, "Snow Cones");
        LanguageRegistry.addName(fruitCake, "Fruit Cake");
        LanguageRegistry.addName(santaHelmet, "Santa Head");        
        LanguageRegistry.addName(santaBody, "Santa Body");
        LanguageRegistry.addName(santaLegs, "Santa Legs");
        LanguageRegistry.addName(santaBoots, "Santa Boots");

    }
}
