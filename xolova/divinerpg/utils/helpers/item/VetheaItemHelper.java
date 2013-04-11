package xolova.divinerpg.utils.helpers.item;

import net.minecraft.item.Item;
import xolova.divinerpg.items.vethea.ItemAmthirmisDisk;
import xolova.divinerpg.items.vethea.ItemArksianeDisk;
import xolova.divinerpg.items.vethea.ItemCermileDisk;
import xolova.divinerpg.items.vethea.ItemDarvenDisk;
import xolova.divinerpg.items.vethea.ItemDreamPowder;
import xolova.divinerpg.items.vethea.ItemDreamflint;
import xolova.divinerpg.items.vethea.ItemEvernight;
import xolova.divinerpg.items.vethea.ItemHeliosisDisk;
import xolova.divinerpg.items.vethea.ItemKarosDisk;
import xolova.divinerpg.items.vethea.ItemMoonclock;
import xolova.divinerpg.items.vethea.ItemPardimalDisk;
import xolova.divinerpg.items.vethea.ItemQuadroticDisk;
import xolova.divinerpg.items.vethea.ItemSpinebackChunk;
import xolova.divinerpg.items.vethea.ItemTeakerDisk;
import xolova.divinerpg.items.vethea.ItemVetheanArmor;
import xolova.divinerpg.items.vethea.ItemVetheanBow;
import xolova.divinerpg.items.vethea.ItemVetheanCannon;
import xolova.divinerpg.items.vethea.ItemVetheanClaw;
import xolova.divinerpg.items.vethea.ItemVetheanEversight;
import xolova.divinerpg.items.vethea.ItemVetheanFood;
import xolova.divinerpg.items.vethea.ItemVetheanHammerSword;
import xolova.divinerpg.items.vethea.ItemVetheanHealingFood;
import xolova.divinerpg.items.vethea.ItemVetheanStaff;
import xolova.divinerpg.utils.helpers.config.VetheaConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class VetheaItemHelper 
{
    public static Item teakerSword;
    public static Item amthrimisSword;
    public static Item darvenSword;
    public static Item cermileSword;
    public static Item pardimalSword;
    public static Item quadroticSword;
    public static Item karosSword;
    public static Item heliosisSword;
    public static Item arksianeSword;
    
    public static Item teakerHammer;
    public static Item amthrimisHammer;
    public static Item darvenHammer;
    public static Item cermileHammer;
    public static Item pardimalHammer;
    public static Item quadroticHammer;
    public static Item karosHammer;
    public static Item heliosisHammer;
    public static Item arksianeHammer;
    
    public static Item teakerBow;
    public static Item amthrimisBow;
    public static Item darvenBow;
    public static Item cermileBow;
    public static Item pardimalBow;
    public static Item quadroticBow;
    public static Item karosBow;
    public static Item heliosisBow;
    public static Item arksianeBow;
    
    public static Item teakerCannon;
    public static Item amthrimisCannon;
    public static Item darvenCannon;
    public static Item cermileCannon;
    public static Item pardimalCannon;
    public static Item quadroticCannon;
    public static Item karosCannonItem;
    public static Item heliosisCannon;
    public static Item arksianeCannon;
    
    public static Item teakerClaw;
    public static Item amthrimisClaw;
    public static Item darvenClaw;
    public static Item cermileClaw;
    public static Item pardimalClaw;
    public static Item quadroticClaw;
    public static Item karosClaw;
    public static Item heliosisClaw;
    public static Item arksianeClaw;
    
    public static Item teakerDisk;
    public static Item amthrimisDisk;
    public static Item darvenDisk;
    public static Item cermileDisk;
    public static Item pardimalDisk;
    public static Item quadroticDisk;
    public static Item karosDisk;
    public static Item heliosisDisk;
    public static Item arksianeDisk;

    public static Item acidfire;
    public static Item vetheanArrow;
    public static Item vetheanArrow2;
    public static Item vetheanWarArrow;
    public static Item vetheanWrathArrow;
    

    public static Item vetheanHammerTemplate;
    public static Item vetheanBackswordTemplate;
    public static Item vetheanBowTemplate;
    public static Item vetheanCannonTemplate;
    public static Item vetheanClawTemplate;
    public static Item vetheanDiskTemplate;
    public static Item vetheanStaffTemplate;

    public static Item vetheanDegradedTemplate;
    public static Item vetheanFinishedTemplate;
    public static Item vetheanGlisteningTemplate;
    public static Item vetheanDemonizedTemplate;
    public static Item vetheanTormentedTemplate;
    
    public static Item honeysuckle;
    public static Item dreamCarrot;
    public static Item dreamMelon;
    public static Item dreamPie;
    public static Item dreamCake;
    
    public static Item teakerLump;
    public static Item amthrimisLump;
    public static Item darvenLump;
    public static Item cermileLump;
    public static Item pardimalLump;
    public static Item quadroticLump;
    public static Item karosLump;
    public static Item heliosisLump;
    public static Item arksianeLump;

    public static Item dreamSweets;
    public static Item dreamSours;
    

    public static Item degradedHelmetMelee;
    public static Item degradedHelmetRanged;
    public static Item degradedHelmetArcana;
    public static Item degradedChest;
    public static Item degradedLegs;
    public static Item degradedBoots;

    public static Item finishedHelmetMelee;
    public static Item finishedHelmetRanged;
    public static Item finishedHelmetArcana;
    public static Item finishedChest;
    public static Item finishedLegs;
    public static Item finishedBoots;

    public static Item glisteningHelmetMelee;
    public static Item glisteningHelmetRanged;
    public static Item glisteningHelmetArcana;
    public static Item glisteningChest;
    public static Item glisteningLegs;
    public static Item glisteningBoots;

    public static Item demonizedHelmetMelee;
    public static Item demonizedHelmetRanged;
    public static Item demonizedHelmetArcana;
    public static Item demonizedChest;
    public static Item demonizedLegs;
    public static Item demonizedBoots;

    public static Item tormentedHelmetMelee;
    public static Item tormentedHelmetRanged;
    public static Item tormentedHelmetArcana;
    public static Item tormentedChest;
    public static Item tormentedLegs;
    public static Item tormentedBoots;
    
    public static Item dirtyPearls;
    public static Item cleanPearls;
    public static Item polishedPearls;
    public static Item shinyPearls;
    
    public static Item honeychunk;
    public static Item rockChunks;
    public static Item fyrossom;
    public static Item heivaBelt;
    public static Item mooncloud;
    public static Item wormChunks;
    public static Item vhraakTeeth;
    
    public static Item dreamflint;
    public static Item moonclock;
    public static Item spinebackChunk;

    public static Item spinebackCannon;
    public static Item spinebackDisc;
    public static Item spinebackHammer;
    public static Item spinebackStaff;

    public static Item everlight;
    public static Item everbright;
    public static Item evernight;
    public static Item eversight;
    public static Item everfight;

    public static Item everArrow;
    
    public static Item teakerStaff;
    public static Item amthrimisStaff;
    public static Item darvenStaff;
    public static Item cermileStaff;
    public static Item pardimalStaff;
    public static Item quadroticStaff;
    public static Item karosStaff;
    public static Item heliosisStaff;
    public static Item arksianeStaff;
    
    public static Item dreamPowder;
    public static Item blueSeeds;
    
	public static void init()
	{
        teakerDisk = new ItemTeakerDisk(VetheaConfigHelper.teakerDiskID, 4).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Teaker Disk");
        amthrimisDisk = new ItemAmthirmisDisk(VetheaConfigHelper.amthirmisDiskID, 6).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Amthirmis Disk");
        darvenDisk = new ItemDarvenDisk(VetheaConfigHelper.darvenDiskID, 9).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Darven Disk");
        cermileDisk = new ItemCermileDisk(VetheaConfigHelper.cermileDiskID, 13).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Cermile Disk");
        pardimalDisk = new ItemPardimalDisk(VetheaConfigHelper.pardimalDiskID, 16).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Pardimal Disk");
        quadroticDisk = new ItemQuadroticDisk(VetheaConfigHelper.quadroticDiskID, 20).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Quadrotic Disk");
        karosDisk = new ItemKarosDisk(VetheaConfigHelper.karosDiskID, 22).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Karos Disk");
        heliosisDisk = new ItemHeliosisDisk(VetheaConfigHelper.heliosisDiskID, 29).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Heliosis Disk");
        arksianeDisk = new ItemArksianeDisk(VetheaConfigHelper.arksianeDiskID, 37).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Arksiane Disk");       
        
        teakerHammer = new ItemVetheanHammerSword(VetheaConfigHelper.teakerHammerID, "teakerHammer", 6).setCreativeTab(CreativeTabHelper.tabSword);
        amthrimisHammer = new ItemVetheanHammerSword(VetheaConfigHelper.amthirmisHammerID, "amthirmisHammer", 8).setCreativeTab(CreativeTabHelper.tabSword);
        darvenHammer = new ItemVetheanHammerSword(VetheaConfigHelper.darvenHammerID, "darvenHammer", 12).setCreativeTab(CreativeTabHelper.tabSword);
        cermileHammer = new ItemVetheanHammerSword(VetheaConfigHelper.cermileHammerID, "cermileHammer", 15).setCreativeTab(CreativeTabHelper.tabSword);
        pardimalHammer = new ItemVetheanHammerSword(VetheaConfigHelper.pardimalHammerID, "pardimalHammer", 19).setCreativeTab(CreativeTabHelper.tabSword);
        quadroticHammer = new ItemVetheanHammerSword(VetheaConfigHelper.quadroticHammerID, "quadroticHammer", 24).setCreativeTab(CreativeTabHelper.tabSword);
        karosHammer = new ItemVetheanHammerSword(VetheaConfigHelper.karosHammerID, "karosHammer", 26).setCreativeTab(CreativeTabHelper.tabSword);
        heliosisHammer = new ItemVetheanHammerSword(VetheaConfigHelper.heliosisHammerID, "heliosisHammer", 33).setCreativeTab(CreativeTabHelper.tabSword);
        arksianeHammer = new ItemVetheanHammerSword(VetheaConfigHelper.arksianeHammerID, "arksianeHammer", 39).setCreativeTab(CreativeTabHelper.tabSword);

        teakerSword = new ItemVetheanHammerSword(VetheaConfigHelper.teakerSwordID, "teakerSword", 4).setCreativeTab(CreativeTabHelper.tabSword);
        amthrimisSword = new ItemVetheanHammerSword(VetheaConfigHelper.amthirmisSwordID, "amthirmisSword", 6).setCreativeTab(CreativeTabHelper.tabSword);
        darvenSword = new ItemVetheanHammerSword(VetheaConfigHelper.darvenSwordID, "darvenSword",9).setCreativeTab(CreativeTabHelper.tabSword);
        cermileSword = new ItemVetheanHammerSword(VetheaConfigHelper.cermileSwordID, "cermileSword",13).setCreativeTab(CreativeTabHelper.tabSword);
        pardimalSword = new ItemVetheanHammerSword(VetheaConfigHelper.pardimalSwordID, "pardimalSword",16).setCreativeTab(CreativeTabHelper.tabSword);
        quadroticSword = new ItemVetheanHammerSword(VetheaConfigHelper.quadroticSwordID, "quadroticSword",20).setCreativeTab(CreativeTabHelper.tabSword);
        karosSword = new ItemVetheanHammerSword(VetheaConfigHelper.karosSwordID, "karosSword",22).setCreativeTab(CreativeTabHelper.tabSword);
        heliosisSword = new ItemVetheanHammerSword(VetheaConfigHelper.heliosisSwordID, "heliosisSword",29).setCreativeTab(CreativeTabHelper.tabSword);
        arksianeSword = new ItemVetheanHammerSword(VetheaConfigHelper.arksianeSwordID, "arksianeSword",37).setCreativeTab(CreativeTabHelper.tabSword);
        
        teakerClaw = new ItemVetheanClaw(VetheaConfigHelper.teakerClawID, "teakerClaw", 3).setCreativeTab(CreativeTabHelper.tabSword);
        amthrimisClaw = new ItemVetheanClaw(VetheaConfigHelper.amthirmisClawID, "amthirmisClaw", 5).setCreativeTab(CreativeTabHelper.tabSword);
        darvenClaw = new ItemVetheanClaw(VetheaConfigHelper.darvenClawID, "darvenClaw", 7).setCreativeTab(CreativeTabHelper.tabSword);
        cermileClaw = new ItemVetheanClaw(VetheaConfigHelper.cermileClawID, "cermileClaw", 8).setCreativeTab(CreativeTabHelper.tabSword);
        pardimalClaw = new ItemVetheanClaw(VetheaConfigHelper.pardimalClawID, "pardimalClaw", 12).setCreativeTab(CreativeTabHelper.tabSword);
        quadroticClaw = new ItemVetheanClaw(VetheaConfigHelper.quadroticClawID, "quadroticClaw", 14).setCreativeTab(CreativeTabHelper.tabSword);
        karosClaw = new ItemVetheanClaw(VetheaConfigHelper.karosClawID, "karosClaw", 19).setCreativeTab(CreativeTabHelper.tabSword);
        heliosisClaw = new ItemVetheanClaw(VetheaConfigHelper.heliosisClawID, "heliosisClaw", 26).setCreativeTab(CreativeTabHelper.tabSword);
        arksianeClaw = new ItemVetheanClaw(VetheaConfigHelper.arksianeClawID, "arksianeClaw", 35).setCreativeTab(CreativeTabHelper.tabSword);
        
        acidfire = new Item(VetheaConfigHelper.acidfireID).setUnlocalizedName("Acidfire").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanArrow = new Item(VetheaConfigHelper.vetheanArrowID).setUnlocalizedName("Teaker Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanArrow2 = new Item(VetheaConfigHelper.vetheanArrow2ID).setUnlocalizedName("Darven Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanWarArrow = new Item(VetheaConfigHelper.vetheanWarArrowID).setUnlocalizedName("Pardimal Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanWrathArrow = new Item(VetheaConfigHelper.vetheanWrathArrowID).setUnlocalizedName("Karos Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        everArrow = new Item(VetheaConfigHelper.everArrowID).setUnlocalizedName("Ever Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        
        teakerBow = new ItemVetheanBow(VetheaConfigHelper.teakerBowID, 0.5D, vetheanArrow, "teakerBow").setUnlocalizedName("teakerBow").setCreativeTab(CreativeTabHelper.tabRanged);
        amthrimisBow = new ItemVetheanBow(VetheaConfigHelper.amthirmisBowID, 0.7D, vetheanArrow, "amthrimisBow").setUnlocalizedName("amthrimisBow").setCreativeTab(CreativeTabHelper.tabRanged);
        darvenBow = new ItemVetheanBow(VetheaConfigHelper.darvenBowID, 1.1D, vetheanArrow2, "darvenBow").setUnlocalizedName("teakerBow").setCreativeTab(CreativeTabHelper.tabRanged);
        cermileBow = new ItemVetheanBow(VetheaConfigHelper.cermileBowID, 1.4D, vetheanArrow2, "cermileBow").setUnlocalizedName("darvenBow").setCreativeTab(CreativeTabHelper.tabRanged);
        pardimalBow = new ItemVetheanBow(VetheaConfigHelper.pardimalBowID, 1.8D, vetheanWarArrow, "pardimalBow").setUnlocalizedName("pardimalBow").setCreativeTab(CreativeTabHelper.tabRanged);
        quadroticBow = new ItemVetheanBow(VetheaConfigHelper.quadroticBowID, 2.1D, vetheanWarArrow, "quadroticBow").setUnlocalizedName("quadroticBow").setCreativeTab(CreativeTabHelper.tabRanged);
        karosBow = new ItemVetheanBow(VetheaConfigHelper.karosBowID, 2.3D, vetheanWrathArrow, "karosBow").setUnlocalizedName("karosBow").setCreativeTab(CreativeTabHelper.tabRanged);
        heliosisBow = new ItemVetheanBow(VetheaConfigHelper.heliosisBowID, 2.8D, vetheanWrathArrow, "heliosisBow").setUnlocalizedName("heliosisBow").setCreativeTab(CreativeTabHelper.tabRanged);
        arksianeBow = new ItemVetheanBow(VetheaConfigHelper.arksianeBowID, 3.6D, vetheanWrathArrow, "arksianeBow").setUnlocalizedName("arksianeBow").setCreativeTab(CreativeTabHelper.tabRanged);
        
        dreamPowder = new ItemDreamPowder(VetheaConfigHelper.dreamPowderID).setUnlocalizedName("DreamPowder").setCreativeTab(CreativeTabHelper.tabItems);
        
        vetheanHammerTemplate = new Item(VetheaConfigHelper.vetheanHammerTemplateID).setUnlocalizedName("vetheanHammerTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanBackswordTemplate = new Item(VetheaConfigHelper.vetheanBackswordTemplateID).setUnlocalizedName("vetheanBackswordTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanBowTemplate = new Item(VetheaConfigHelper.vetheanBowTemplateID).setUnlocalizedName("vetheanBowTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanCannonTemplate = new Item(VetheaConfigHelper.vetheanCannonTemplateID).setUnlocalizedName("vetheanCannonTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanClawTemplate = new Item(VetheaConfigHelper.vetheanClawTemplateID).setUnlocalizedName("vetheanClawTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanDiskTemplate = new Item(VetheaConfigHelper.vetheanDiskTemplateID).setUnlocalizedName("vetheanDiskTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanStaffTemplate = new Item(VetheaConfigHelper.vetheanStaffTemplateID).setUnlocalizedName("vetheanStaffTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanDegradedTemplate = new Item(VetheaConfigHelper.vetheanDegradedTemplateID).setUnlocalizedName("vetheanDegradedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanFinishedTemplate = new Item(VetheaConfigHelper.vetheanFinishedTemplateID).setUnlocalizedName("vetheanFinishedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanGlisteningTemplate = new Item(VetheaConfigHelper.vetheanGlisteningTemplateID).setUnlocalizedName("vetheanGlisteningTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanDemonizedTemplate = new Item(VetheaConfigHelper.vetheanDemonizedTemplateID).setUnlocalizedName("vetheanDemonizedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanTormentedTemplate = new Item(VetheaConfigHelper.vetheanTormentedTemplateID).setUnlocalizedName("vetheanTormentedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        
        teakerLump = new Item(VetheaConfigHelper.teakerLumpID).setUnlocalizedName("TeakerLump").setCreativeTab(CreativeTabHelper.tabItems);
        amthrimisLump = new Item(VetheaConfigHelper.amthirmisLumpID).setUnlocalizedName("AmthrimisLump").setCreativeTab(CreativeTabHelper.tabItems);
        darvenLump = new Item(VetheaConfigHelper.darvenLumpID).setUnlocalizedName("DarvenLump").setCreativeTab(CreativeTabHelper.tabItems);
        cermileLump = new Item(VetheaConfigHelper.cermileLumpID).setUnlocalizedName("CermileLump").setCreativeTab(CreativeTabHelper.tabItems);
        pardimalLump = new Item(VetheaConfigHelper.pardimalLumpID).setUnlocalizedName("pardimalLump").setCreativeTab(CreativeTabHelper.tabItems);
        quadroticLump = new Item(VetheaConfigHelper.quadroticLumpID).setUnlocalizedName("quadroticLump").setCreativeTab(CreativeTabHelper.tabItems);
        karosLump = new Item(VetheaConfigHelper.karosLumpID).setUnlocalizedName("karosLump").setCreativeTab(CreativeTabHelper.tabItems);
        heliosisLump = new Item(VetheaConfigHelper.heliosisLumpID).setUnlocalizedName("heliosisLump").setCreativeTab(CreativeTabHelper.tabItems);
        arksianeLump = new Item(VetheaConfigHelper.arksianeLumpID).setUnlocalizedName("arksaineLump").setCreativeTab(CreativeTabHelper.tabItems);

        honeysuckle = new ItemVetheanFood(VetheaConfigHelper.honeysuckleID, 1, 0.2F, true).setUnlocalizedName("honeysuckle").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamCarrot = new ItemVetheanFood(VetheaConfigHelper.dreamCarrotID, 3, 0.4F, true).setUnlocalizedName("dreamCarrot").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamMelon = new ItemVetheanFood(VetheaConfigHelper.dreamMelonID, 6, 0.6F, true).setUnlocalizedName("dreamMelon").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamPie = new ItemVetheanFood(VetheaConfigHelper.dreamPieID, 4, 0.8F, true).setUnlocalizedName("dreamPie").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamCake = new ItemVetheanFood(VetheaConfigHelper.dreamCakeID, 8, 0.8F, true).setUnlocalizedName("dreamCake").setCreativeTab(CreativeTabHelper.tabHerb);
        
        dreamSweets = new ItemVetheanHealingFood(VetheaConfigHelper.dreamSweetsID, 0, 0F, false, 2).setUnlocalizedName("dreamSweets").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamSours = new ItemVetheanHealingFood(VetheaConfigHelper.dreamSoursID, 0, 0F, false, 8).setUnlocalizedName("dreamSours").setCreativeTab(CreativeTabHelper.tabHerb);
        
        int degradedRender = RenderingRegistry.addNewArmourRendererPrefix("degraded");
        degradedHelmetMelee = new ItemVetheanArmor(VetheaConfigHelper.degradedHelmetMeleeID, degradedRender, 0, 15, "Melee", "").setUnlocalizedName("degradedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedHelmetRanged = new ItemVetheanArmor(VetheaConfigHelper.degradedHelmetRangedID, degradedRender, 0, 15, "Ranged", "").setUnlocalizedName("degradedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedHelmetArcana = new ItemVetheanArmor(VetheaConfigHelper.degradedHelmetArcanaID, degradedRender, 0, 15, "Arcana", "").setUnlocalizedName("degradedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedChest = new ItemVetheanArmor(VetheaConfigHelper.degradedChestID, degradedRender, 1, 15, "", "").setUnlocalizedName("degradedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedLegs = new ItemVetheanArmor(VetheaConfigHelper.degradedLegsID, degradedRender, 2, 15, "", "").setUnlocalizedName("degradedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedBoots = new ItemVetheanArmor(VetheaConfigHelper.degradedBootsID, degradedRender, 3, 15, "", "").setUnlocalizedName("degradedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int finishedRender = RenderingRegistry.addNewArmourRendererPrefix("finished");
        finishedHelmetMelee = new ItemVetheanArmor(VetheaConfigHelper.finishedHelmetMeleeID, finishedRender, 0, 30, "Melee", "").setUnlocalizedName("finishedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedHelmetRanged = new ItemVetheanArmor(VetheaConfigHelper.finishedHelmetRangedID, finishedRender, 0, 30, "Ranged", "").setUnlocalizedName("finishedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedHelmetArcana = new ItemVetheanArmor(VetheaConfigHelper.finishedHelmetArcanaID, finishedRender, 0, 30, "Arcana", "").setUnlocalizedName("finishedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedChest = new ItemVetheanArmor(VetheaConfigHelper.finishedChestID, finishedRender, 1, 30, "", "").setUnlocalizedName("finishedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedLegs = new ItemVetheanArmor(VetheaConfigHelper.finishedLegsID, finishedRender, 2, 30, "", "").setUnlocalizedName("finishedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedBoots = new ItemVetheanArmor(VetheaConfigHelper.finishedBootsID, finishedRender, 3, 30, "", "").setUnlocalizedName("finishedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int glisteningRender = RenderingRegistry.addNewArmourRendererPrefix("glistening");
        glisteningHelmetMelee = new ItemVetheanArmor(VetheaConfigHelper.glisteningHelmetMeleeID, glisteningRender, 0, 45, "Melee", "+3 Melee Damage3").setUnlocalizedName("glisteningHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningHelmetRanged = new ItemVetheanArmor(VetheaConfigHelper.glisteningHelmetRangedID, glisteningRender, 0, 45, "Ranged", "1.4x Movement Speed").setUnlocalizedName("glisteningHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningHelmetArcana = new ItemVetheanArmor(VetheaConfigHelper.glisteningHelmetArcanaID, glisteningRender, 0, 45, "Arcana", "2x Jump Height").setUnlocalizedName("glisteningHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningChest = new ItemVetheanArmor(VetheaConfigHelper.glisteningChestID, glisteningRender, 1, 45, "", "").setUnlocalizedName("glisteningChest").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningLegs = new ItemVetheanArmor(VetheaConfigHelper.glisteningLegsID, glisteningRender, 2, 45, "", "").setUnlocalizedName("glisteningLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningBoots = new ItemVetheanArmor(VetheaConfigHelper.glisteningBootsID, glisteningRender, 3, 45, "", "").setUnlocalizedName("glisteningBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int demonizedRender = RenderingRegistry.addNewArmourRendererPrefix("demonized");
        demonizedHelmetMelee = new ItemVetheanArmor(VetheaConfigHelper.demonizedHelmetMeleeID, demonizedRender, 0, 55, "Melee", "+6 Melee Damage").setUnlocalizedName("demonizedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedHelmetRanged = new ItemVetheanArmor(VetheaConfigHelper.demonizedHelmetRangedID, demonizedRender, 0, 55, "Ranged", "1.8X Movement Speed").setUnlocalizedName("demonizedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedHelmetArcana = new ItemVetheanArmor(VetheaConfigHelper.demonizedHelmetArcanaID, demonizedRender, 0, 55, "Arcana", "3x Jump Height").setUnlocalizedName("demonizedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedChest = new ItemVetheanArmor(VetheaConfigHelper.demonizedChestID, demonizedRender, 1, 55, "", "").setUnlocalizedName("demonizedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedLegs = new ItemVetheanArmor(VetheaConfigHelper.demonizedLegsID, demonizedRender, 2, 55, "", "").setUnlocalizedName("demonizedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedBoots = new ItemVetheanArmor(VetheaConfigHelper.demonizedBootsID, demonizedRender, 3, 55, "", "").setUnlocalizedName("demonizedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int tormentedRender = RenderingRegistry.addNewArmourRendererPrefix("tormented");
        tormentedHelmetMelee = new ItemVetheanArmor(VetheaConfigHelper.tormentedHelmetMeleeID, tormentedRender, 0, 70, "Melee", "+9 Melee Damage").setUnlocalizedName("tormentedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedHelmetRanged = new ItemVetheanArmor(VetheaConfigHelper.tormentedHelmetRangedID, tormentedRender, 0, 70, "Ranged", "2x Movement Speed").setUnlocalizedName("tormentedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedHelmetArcana = new ItemVetheanArmor(VetheaConfigHelper.tormentedHelmetArcanaID, tormentedRender, 0, 70, "Arcana", "4x Jump Height").setUnlocalizedName("tormentedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedChest = new ItemVetheanArmor(VetheaConfigHelper.tormentedChestID, tormentedRender, 1, 70, "", "").setUnlocalizedName("tormentedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedLegs = new ItemVetheanArmor(VetheaConfigHelper.tormentedLegsID, tormentedRender, 2, 70, "", "").setUnlocalizedName("tormentedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedBoots = new ItemVetheanArmor(VetheaConfigHelper.tormentedBootsID, tormentedRender, 3, 70, "", "").setUnlocalizedName("tormentedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        dirtyPearls = new Item(VetheaConfigHelper.dirtyPearlsID).setUnlocalizedName("dirtyPearls").setCreativeTab(CreativeTabHelper.tabItems);
        cleanPearls = new Item(VetheaConfigHelper.cleanPearlsID).setUnlocalizedName("cleanPearls").setCreativeTab(CreativeTabHelper.tabItems);
        polishedPearls = new Item(VetheaConfigHelper.polishedPearlsID).setUnlocalizedName("polishedPearls").setCreativeTab(CreativeTabHelper.tabItems);
        shinyPearls = new Item(VetheaConfigHelper.shinyPearlsID).setUnlocalizedName("shinyPearls").setCreativeTab(CreativeTabHelper.tabItems);
        
        honeychunk = new Item(VetheaConfigHelper.honeychunkID).setUnlocalizedName("honeychunk").setCreativeTab(CreativeTabHelper.tabItems);
        rockChunks = new Item(VetheaConfigHelper.rockChunksID).setUnlocalizedName("rockChunks").setCreativeTab(CreativeTabHelper.tabItems);
        fyrossom = new Item(VetheaConfigHelper.fyrossomID).setUnlocalizedName("fyrossom").setCreativeTab(CreativeTabHelper.tabItems);
        heivaBelt = new Item(VetheaConfigHelper.heivaBeltID).setUnlocalizedName("heivaBelt").setCreativeTab(CreativeTabHelper.tabItems);
        mooncloud = new Item(VetheaConfigHelper.mooncloudID).setUnlocalizedName("mooncloud").setCreativeTab(CreativeTabHelper.tabItems);
        wormChunks = new Item(VetheaConfigHelper.wormChunksID).setUnlocalizedName("wormChunk").setCreativeTab(CreativeTabHelper.tabItems);
        vhraakTeeth = new Item(VetheaConfigHelper.vhraakTeethID).setUnlocalizedName("vhraakTeeth").setCreativeTab(CreativeTabHelper.tabItems);
        
        dreamflint = new ItemDreamflint(VetheaConfigHelper.dreamflintID).setUnlocalizedName("dreamflint").setCreativeTab(CreativeTabHelper.tabSpawner);
        moonclock = new ItemMoonclock(VetheaConfigHelper.moonclockID).setUnlocalizedName("moonclock").setCreativeTab(CreativeTabHelper.tabSpawner);
        spinebackChunk = new ItemSpinebackChunk(VetheaConfigHelper.spinebackChunkID).setUnlocalizedName("spinebackChunk").setCreativeTab(CreativeTabHelper.tabSpawner);
        
        teakerCannon = new ItemVetheanCannon(VetheaConfigHelper.teakerCannonID, 3, "TeakerCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        amthrimisCannon = new ItemVetheanCannon(VetheaConfigHelper.amthirmisCannonID, 5, "amthirmisCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        darvenCannon = new ItemVetheanCannon(VetheaConfigHelper.darvenCannonID, 8, "darvenCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        cermileCannon = new ItemVetheanCannon(VetheaConfigHelper.cermileCannonID, 12, "cermileCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        pardimalCannon = new ItemVetheanCannon(VetheaConfigHelper.pardimalCannonID, 15, "pardimalCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        quadroticCannon = new ItemVetheanCannon(VetheaConfigHelper.quadroticCannonID, 19, "quadroticCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        karosCannonItem = new ItemVetheanCannon(VetheaConfigHelper.karosCannonItemID, 21, "karosCannonItem").setCreativeTab(CreativeTabHelper.tabRanged);
        heliosisCannon = new ItemVetheanCannon(VetheaConfigHelper.heliosisCannonID, 28, "heliosisCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        arksianeCannon = new ItemVetheanCannon(VetheaConfigHelper.arksianeCannonID, 36, "arksianeCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        
        eversight = new ItemVetheanEversight(VetheaConfigHelper.eversightID, 42, "eversight").setCreativeTab(CreativeTabHelper.tabRanged);
        everlight = new ItemVetheanHammerSword(VetheaConfigHelper.everlightID, "everlight", 44).setCreativeTab(CreativeTabHelper.tabSword);
        everbright = new ItemVetheanClaw(VetheaConfigHelper.everbrightID, "everbright", 42).setCreativeTab(CreativeTabHelper.tabSword);
        everfight = new ItemVetheanBow(VetheaConfigHelper.everfightID, 4.6D, everArrow, "everfight").setUnlocalizedName("everfight").setCreativeTab(CreativeTabHelper.tabRanged);
        evernight = new ItemEvernight(VetheaConfigHelper.evernightID, 115, 200).setUnlocalizedName("evernight").setCreativeTab(CreativeTabHelper.tabRanged);
        
        teakerStaff = new ItemVetheanStaff(VetheaConfigHelper.teakerStaffID, 3, 10).setUnlocalizedName("TeakerStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        amthrimisStaff = new ItemVetheanStaff(VetheaConfigHelper.amthirmisStaffID, 5, 10).setUnlocalizedName("amthirmisStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        darvenStaff = new ItemVetheanStaff(VetheaConfigHelper.darvenStaffID, 8, 10).setUnlocalizedName("darvenStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        cermileStaff = new ItemVetheanStaff(VetheaConfigHelper.cermileStaffID, 12, 10).setUnlocalizedName("cermileStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        pardimalStaff = new ItemVetheanStaff(VetheaConfigHelper.pardimalStaffID, 15, 10).setUnlocalizedName("pardimalStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        quadroticStaff = new ItemVetheanStaff(VetheaConfigHelper.quadroticStaffID, 19, 10).setUnlocalizedName("quadroticStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        karosStaff = new ItemVetheanStaff(VetheaConfigHelper.karosStaffID, 21, 10).setUnlocalizedName("karosStaffItem").setCreativeTab(CreativeTabHelper.tabRanged);
        heliosisStaff = new ItemVetheanStaff(VetheaConfigHelper.heliosisStaffID, 28, 10).setUnlocalizedName("heliosisStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        arksianeStaff = new ItemVetheanStaff(VetheaConfigHelper.arksianeStaffID, 36, 10).setUnlocalizedName("arksianeStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        addNames();
	}
	
	public static void addNames()
	{
	    LanguageRegistry.addName(teakerSword, "");
	    LanguageRegistry.addName(amthrimisSword, "");
	    LanguageRegistry.addName(darvenSword, "");
	    LanguageRegistry.addName(cermileSword, "");
	    LanguageRegistry.addName(pardimalSword, "");
	    LanguageRegistry.addName(quadroticSword, "");
	    LanguageRegistry.addName(karosSword, "");
	    LanguageRegistry.addName(heliosisSword, "");
	    LanguageRegistry.addName(arksianeSword, "");
	    
	    LanguageRegistry.addName(teakerHammer, "");
	    LanguageRegistry.addName(amthrimisHammer, "");
	    LanguageRegistry.addName(darvenHammer, "");
	    LanguageRegistry.addName(cermileHammer, "");
	    LanguageRegistry.addName(pardimalHammer, "");
	    LanguageRegistry.addName(quadroticHammer, "");
	    LanguageRegistry.addName(karosHammer, "");
	    LanguageRegistry.addName(heliosisHammer, "");
	    LanguageRegistry.addName(arksianeHammer, "");
	    
	    LanguageRegistry.addName(teakerBow, "");
	    LanguageRegistry.addName(amthrimisBow, "");
	    LanguageRegistry.addName(darvenBow, "");
	    LanguageRegistry.addName(cermileBow, "");
	    LanguageRegistry.addName(pardimalBow, "");
	    LanguageRegistry.addName(quadroticBow, "");
	    LanguageRegistry.addName(karosBow, "");
	    LanguageRegistry.addName(heliosisBow, "");
	    LanguageRegistry.addName(arksianeBow, "");
	    
	    LanguageRegistry.addName(teakerCannon, "");
	    LanguageRegistry.addName(amthrimisCannon, "");
	    LanguageRegistry.addName(darvenCannon, "");
	    LanguageRegistry.addName(cermileCannon, "");
	    LanguageRegistry.addName(pardimalCannon, "");
	    LanguageRegistry.addName(quadroticCannon, "");
	    LanguageRegistry.addName(karosCannonItem, "");
	    LanguageRegistry.addName(heliosisCannon, "");
	    LanguageRegistry.addName(arksianeCannon, "");
	    
	    LanguageRegistry.addName(teakerClaw, "");
	    LanguageRegistry.addName(amthrimisClaw, "");
	    LanguageRegistry.addName(darvenClaw, "");
	    LanguageRegistry.addName(cermileClaw, "");
	    LanguageRegistry.addName(pardimalClaw, "");
	    LanguageRegistry.addName(quadroticClaw, "");
	    LanguageRegistry.addName(karosClaw, "");
	    LanguageRegistry.addName(heliosisClaw, "");
	    LanguageRegistry.addName(arksianeClaw, "");
	    
	    LanguageRegistry.addName(teakerDisk, "");
	    LanguageRegistry.addName(amthrimisDisk, "");
	    LanguageRegistry.addName(darvenDisk, "");
	    LanguageRegistry.addName(cermileDisk, "");
	    LanguageRegistry.addName(pardimalDisk, "");
	    LanguageRegistry.addName(quadroticDisk, "");
	    LanguageRegistry.addName(karosDisk, "");
	    LanguageRegistry.addName(heliosisDisk, "");
	    LanguageRegistry.addName(arksianeDisk, "");

	    LanguageRegistry.addName(acidfire, "");
	    LanguageRegistry.addName(vetheanArrow, "");
	    LanguageRegistry.addName(vetheanArrow2, "");
	    LanguageRegistry.addName(vetheanWarArrow, "");
	    LanguageRegistry.addName(vetheanWrathArrow, "");
	    

	    LanguageRegistry.addName(vetheanHammerTemplate, "");
	    LanguageRegistry.addName(vetheanBackswordTemplate, "");
	    LanguageRegistry.addName(vetheanBowTemplate, "");
	    LanguageRegistry.addName(vetheanCannonTemplate, "");
	    LanguageRegistry.addName(vetheanClawTemplate, "");
	    LanguageRegistry.addName(vetheanDiskTemplate, "");
	    LanguageRegistry.addName(vetheanStaffTemplate, "");

	    LanguageRegistry.addName(vetheanDegradedTemplate, "");
	    LanguageRegistry.addName(vetheanFinishedTemplate, "");
	    LanguageRegistry.addName(vetheanGlisteningTemplate, "");
	    LanguageRegistry.addName(vetheanDemonizedTemplate, "");
	    LanguageRegistry.addName(vetheanTormentedTemplate, "");
	    
	    LanguageRegistry.addName(honeysuckle, "");
	    LanguageRegistry.addName(dreamCarrot, "");
	    LanguageRegistry.addName(dreamMelon, "");
	    LanguageRegistry.addName(dreamPie, "");
	    LanguageRegistry.addName(dreamCake, "");
	    
	    LanguageRegistry.addName(teakerLump, "");
	    LanguageRegistry.addName(amthrimisLump, "");
	    LanguageRegistry.addName(darvenLump, "");
	    LanguageRegistry.addName(cermileLump, "");
	    LanguageRegistry.addName(pardimalLump, "");
	    LanguageRegistry.addName(quadroticLump, "");
	    LanguageRegistry.addName(karosLump, "");
	    LanguageRegistry.addName(heliosisLump, "");
	    LanguageRegistry.addName(arksianeLump, "");

	    LanguageRegistry.addName(dreamSweets, "");
	    LanguageRegistry.addName(dreamSours, "");
	    

	    LanguageRegistry.addName(degradedHelmetMelee, "");
	    LanguageRegistry.addName(degradedHelmetRanged, "");
	    LanguageRegistry.addName(degradedHelmetArcana, "");
	    LanguageRegistry.addName(degradedChest, "");
	    LanguageRegistry.addName(degradedLegs, "");
	    LanguageRegistry.addName(degradedBoots, "");

	    LanguageRegistry.addName(finishedHelmetMelee, "");
	    LanguageRegistry.addName(finishedHelmetRanged, "");
	    LanguageRegistry.addName(finishedHelmetArcana, "");
	    LanguageRegistry.addName(finishedChest, "");
	    LanguageRegistry.addName(finishedLegs, "");
	    LanguageRegistry.addName(finishedBoots, "");

	    LanguageRegistry.addName(glisteningHelmetMelee, "");
	    LanguageRegistry.addName(glisteningHelmetRanged, "");
	    LanguageRegistry.addName(glisteningHelmetArcana, "");
	    LanguageRegistry.addName(glisteningChest, "");
	    LanguageRegistry.addName(glisteningLegs, "");
	    LanguageRegistry.addName(glisteningBoots, "");

	    LanguageRegistry.addName(demonizedHelmetMelee, "");
	    LanguageRegistry.addName(demonizedHelmetRanged, "");
	    LanguageRegistry.addName(demonizedHelmetArcana, "");
	    LanguageRegistry.addName(demonizedChest, "");
	    LanguageRegistry.addName(demonizedLegs, "");
	    LanguageRegistry.addName(demonizedBoots, "");

	    LanguageRegistry.addName(tormentedHelmetMelee, "");
	    LanguageRegistry.addName(tormentedHelmetRanged, "");
	    LanguageRegistry.addName(tormentedHelmetArcana, "");
	    LanguageRegistry.addName(tormentedChest, "");
	    LanguageRegistry.addName(tormentedLegs, "");
	    LanguageRegistry.addName(tormentedBoots, "");
	    
	    LanguageRegistry.addName(dirtyPearls, "");
	    LanguageRegistry.addName(cleanPearls, "");
	    LanguageRegistry.addName(polishedPearls, "");
	    LanguageRegistry.addName(shinyPearls, "");
	    
	    LanguageRegistry.addName(honeychunk, "");
	    LanguageRegistry.addName(rockChunks, "");
	    LanguageRegistry.addName(fyrossom, "");
	    LanguageRegistry.addName(heivaBelt, "");
	    LanguageRegistry.addName(mooncloud, "");
	    LanguageRegistry.addName(wormChunks, "");
	    LanguageRegistry.addName(vhraakTeeth, "");
	    
	    LanguageRegistry.addName(dreamflint, "");
	    LanguageRegistry.addName(moonclock, "");
	    LanguageRegistry.addName(spinebackChunk, "");

	    LanguageRegistry.addName(spinebackCannon, "");
	    LanguageRegistry.addName(spinebackDisc, "");
	    LanguageRegistry.addName(spinebackHammer, "");
	    LanguageRegistry.addName(spinebackStaff, "");

	    LanguageRegistry.addName(everlight, "");
	    LanguageRegistry.addName(everbright, "");
	    LanguageRegistry.addName(evernight, "");
	    LanguageRegistry.addName(eversight, "");
	    LanguageRegistry.addName(everfight, "");

	    LanguageRegistry.addName(everArrow, "");
	    
	    LanguageRegistry.addName(teakerStaff, "");
	    LanguageRegistry.addName(amthrimisStaff, "");
	    LanguageRegistry.addName(darvenStaff, "");
	    LanguageRegistry.addName(cermileStaff, "");
	    LanguageRegistry.addName(pardimalStaff, "");
	    LanguageRegistry.addName(quadroticStaff, "");
	    LanguageRegistry.addName(karosStaff, "");
	    LanguageRegistry.addName(heliosisStaff, "");
	    LanguageRegistry.addName(arksianeStaff, "");
	    
	    LanguageRegistry.addName(dreamPowder, "");
	    LanguageRegistry.addName(blueSeeds, "");
	}
}
