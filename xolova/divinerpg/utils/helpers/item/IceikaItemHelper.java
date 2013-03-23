package xolova.divinerpg.utils.helpers.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;
import xolova.divinerpg.items.iceika.ItemEnderice;
import xolova.divinerpg.items.iceika.ItemFractiteCannon;
import xolova.divinerpg.items.iceika.ItemFrostClawCannon;
import xolova.divinerpg.items.iceika.ItemFrozenMaul;
import xolova.divinerpg.items.iceika.ItemGlacierSword;
import xolova.divinerpg.items.iceika.ItemIceicleBane;
import xolova.divinerpg.items.iceika.ItemIceineSword;
import xolova.divinerpg.items.iceika.ItemIcicleBow;
import xolova.divinerpg.items.iceika.ItemSerenadeOfIce;
import xolova.divinerpg.items.iceika.ItemSnowFlakeShuriken;
import xolova.divinerpg.items.iceika.ItemSnowSlash;
import xolova.divinerpg.items.iceika.ItemSnowStormBow;
import xolova.divinerpg.items.iceika.ItemSoundOfCarols;
import xolova.divinerpg.items.iceika.ItemSwordIceika;
import xolova.divinerpg.items.overworld.ItemNamkormira;
import xolova.divinerpg.utils.helpers.config.IceikaConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;

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
    
    public static void init()
    {
    	snowFlake = new Item(IceikaConfigHelper.snowFlakeID).setUnlocalizedName("snowFlake").setCreativeTab(CreativeTabHelper.tabItems);
        icicleBane = new ItemIceicleBane(IceikaConfigHelper.icicleBaneID).setUnlocalizedName("icicleBane").setCreativeTab(CreativeTabHelper.tabSword);
        soundOfCarols = new ItemSoundOfCarols(IceikaConfigHelper.soundOfCarolsID).setUnlocalizedName("soundofCarols").setCreativeTab(CreativeTabHelper.tabRanged);
        icineSword = new ItemIceineSword(IceikaConfigHelper.icineSwordID).setUnlocalizedName("icineSword").setCreativeTab(CreativeTabHelper.tabSword);
        frossivence = new ItemNamkormira(IceikaConfigHelper.frossivenceID).setUnlocalizedName("frossivence").setCreativeTab(CreativeTabHelper.tabSword);
        enderice = new ItemEnderice(IceikaConfigHelper.endericeID).setUnlocalizedName("enderice").setCreativeTab(CreativeTabHelper.tabSword);
        snowSlash = new ItemSnowSlash(IceikaConfigHelper.snowSlashID).setUnlocalizedName("snowSlash").setCreativeTab(CreativeTabHelper.tabSword);
        serenadeOfIce = new ItemSerenadeOfIce(IceikaConfigHelper.serenadeOfIceID).setUnlocalizedName("serenadeofIce").setCreativeTab(CreativeTabHelper.tabRanged);
        glacierSword = new ItemGlacierSword(IceikaConfigHelper.glacierSwordID).setUnlocalizedName("glacierSword").setCreativeTab(CreativeTabHelper.tabSword);
        frostKingSword = new ItemSwordIceika(IceikaConfigHelper.frostKingSwordID).setUnlocalizedName("frostKingSword").setCreativeTab(CreativeTabHelper.tabSword);
        frozenMaul = new ItemFrozenMaul(IceikaConfigHelper.frozenMaulID).setUnlocalizedName("frozenMaul").setCreativeTab(CreativeTabHelper.tabSword);
        
        
        frostClawCannon = new ItemFrostClawCannon(IceikaConfigHelper.frostClawCannonID).setUnlocalizedName("frostClawCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        fractiteCannon = new ItemFractiteCannon(IceikaConfigHelper.fractiteCannonID).setUnlocalizedName("fractiteCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        snowFlakeShuriken = new ItemSnowFlakeShuriken(IceikaConfigHelper.snowFlakeShurikenID).setUnlocalizedName("snowFlakeShuriken").setCreativeTab(CreativeTabHelper.tabRanged);
        icicleBow = new ItemIcicleBow(IceikaConfigHelper.icicleBowID).setUnlocalizedName("icicleBow").setCreativeTab(CreativeTabHelper.tabRanged);
        snowStormBow = new ItemSnowStormBow(IceikaConfigHelper.snowStormBowID).setUnlocalizedName("frostStormBow").setCreativeTab(CreativeTabHelper.tabRanged);
        pepperMints = new ItemFood(IceikaConfigHelper.pepperMintsID, 1, 0.3F, false).setUnlocalizedName("pepperMints").setCreativeTab(CreativeTabHelper.tabHerb);
        eggNog = new ItemBucketMilk(IceikaConfigHelper.eggNogID).setUnlocalizedName("eggNog").setCreativeTab(CreativeTabHelper.tabHerb);
        chocolateLog = new ItemFood(IceikaConfigHelper.chocolateLogID, 4, 1.0F, false).setUnlocalizedName("chocolateLog").setCreativeTab(CreativeTabHelper.tabHerb);
        snowCones = new ItemFood(IceikaConfigHelper.snowConesID, 2, 0.3F, false).setUnlocalizedName("snowCones").setCreativeTab(CreativeTabHelper.tabHerb);
        fruitCake = new ItemFood(IceikaConfigHelper.fruitCakeID, 16, 2.0F, false).setUnlocalizedName("fruitCake").setCreativeTab(CreativeTabHelper.tabHerb);
        
        int santaRender = RenderingRegistry.addNewArmourRendererPrefix("santa");
        santaHead = new ItemDivinerpgArmor(IceikaConfigHelper.santaHeadID, santaRender, 0, -1, 0.0D).setUnlocalizedName("santaHelmet").setCreativeTab(CreativeTabHelper.tabArmor);
        santaBody = new ItemDivinerpgArmor(IceikaConfigHelper.santaBodyID, santaRender, 1, -1, 0.0D).setUnlocalizedName("santaChest").setCreativeTab(CreativeTabHelper.tabArmor);
        santaLegs = new ItemDivinerpgArmor(IceikaConfigHelper.santaLegsID, santaRender, 2, -1, 0.0D).setUnlocalizedName("santaLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        santaBoots = new ItemDivinerpgArmor(IceikaConfigHelper.santaBootsID, santaRender, 3, -1, 0.0D).setUnlocalizedName("santaBoots").setCreativeTab(CreativeTabHelper.tabArmor);

    }
}
