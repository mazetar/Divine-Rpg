package net.divinerpg.utils.helpers.item;

import net.divinerpg.items.ItemDivineRPG;
import net.divinerpg.items.vethea.ItemAmthirmisDisk;
import net.divinerpg.items.vethea.ItemArksianeDisk;
import net.divinerpg.items.vethea.ItemCermileDisk;
import net.divinerpg.items.vethea.ItemDarvenDisk;
import net.divinerpg.items.vethea.ItemDreamPowder;
import net.divinerpg.items.vethea.ItemDreamflint;
import net.divinerpg.items.vethea.ItemEvernight;
import net.divinerpg.items.vethea.ItemHeliosisDisk;
import net.divinerpg.items.vethea.ItemKarosDisk;
import net.divinerpg.items.vethea.ItemMoonclock;
import net.divinerpg.items.vethea.ItemPardimalDisk;
import net.divinerpg.items.vethea.ItemQuadroticDisk;
import net.divinerpg.items.vethea.ItemSpinebackChunk;
import net.divinerpg.items.vethea.ItemTeakerDisk;
import net.divinerpg.items.vethea.ItemVetheanArmor;
import net.divinerpg.items.vethea.ItemVetheanBow;
import net.divinerpg.items.vethea.ItemVetheanCannon;
import net.divinerpg.items.vethea.ItemVetheanClaw;
import net.divinerpg.items.vethea.ItemVetheanEversight;
import net.divinerpg.items.vethea.ItemVetheanFood;
import net.divinerpg.items.vethea.ItemVetheanHammerSword;
import net.divinerpg.items.vethea.ItemVetheanHealingFood;
import net.divinerpg.items.vethea.ItemVetheanStaff;
import net.divinerpg.utils.helpers.config.VetheaConfigHelper;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.item.Item;
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
    
    public static VetheaConfigHelper x;
    
	public static void init()
	{
        teakerDisk = new ItemTeakerDisk(x.teakerDiskID, 4).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Teaker Disk");
        amthrimisDisk = new ItemAmthirmisDisk(x.amthirmisDiskID, 6).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Amthirmis Disk");
        darvenDisk = new ItemDarvenDisk(x.darvenDiskID, 9).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Darven Disk");
        cermileDisk = new ItemCermileDisk(x.cermileDiskID, 13).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Cermile Disk");
        pardimalDisk = new ItemPardimalDisk(x.pardimalDiskID, 16).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Pardimal Disk");
        quadroticDisk = new ItemQuadroticDisk(x.quadroticDiskID, 20).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Quadrotic Disk");
        karosDisk = new ItemKarosDisk(x.karosDiskID, 22).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Karos Disk");
        heliosisDisk = new ItemHeliosisDisk(x.heliosisDiskID, 29).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Heliosis Disk");
        arksianeDisk = new ItemArksianeDisk(x.arksianeDiskID, 37).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("Arksiane Disk");       
        
        teakerHammer = new ItemVetheanHammerSword(x.teakerHammerID, "teakerHammer", 6).setIconIndex(4, 16).setCreativeTab(CreativeTabHelper.tabSword);
        amthrimisHammer = new ItemVetheanHammerSword(x.amthirmisHammerID, "amthirmisHammer", 8).setIconIndex(4, 17).setCreativeTab(CreativeTabHelper.tabSword);
        darvenHammer = new ItemVetheanHammerSword(x.darvenHammerID, "darvenHammer", 12).setIconIndex(4, 18).setCreativeTab(CreativeTabHelper.tabSword);
        cermileHammer = new ItemVetheanHammerSword(x.cermileHammerID, "cermileHammer", 15).setIconIndex(4, 19).setCreativeTab(CreativeTabHelper.tabSword);
        pardimalHammer = new ItemVetheanHammerSword(x.pardimalHammerID, "pardimalHammer", 19).setIconIndex(4, 20).setCreativeTab(CreativeTabHelper.tabSword);
        quadroticHammer = new ItemVetheanHammerSword(x.quadroticHammerID, "quadroticHammer", 24).setIconIndex(4, 21).setCreativeTab(CreativeTabHelper.tabSword);
        karosHammer = new ItemVetheanHammerSword(x.karosHammerID, "karosHammer", 26).setIconIndex(4, 22).setCreativeTab(CreativeTabHelper.tabSword);
        heliosisHammer = new ItemVetheanHammerSword(x.heliosisHammerID, "heliosisHammer", 33).setIconIndex(4, 23).setCreativeTab(CreativeTabHelper.tabSword);
        arksianeHammer = new ItemVetheanHammerSword(x.arksianeHammerID, "arksianeHammer", 39).setIconIndex(4, 24).setCreativeTab(CreativeTabHelper.tabSword);

        teakerSword = new ItemVetheanHammerSword(x.teakerSwordID, "teakerSword", 4).setIconIndex(4, 0).setCreativeTab(CreativeTabHelper.tabSword);
        amthrimisSword = new ItemVetheanHammerSword(x.amthirmisSwordID, "amthirmisSword", 6).setIconIndex(4, 1).setCreativeTab(CreativeTabHelper.tabSword);
        darvenSword = new ItemVetheanHammerSword(x.darvenSwordID, "darvenSword", 9).setIconIndex(4, 2).setCreativeTab(CreativeTabHelper.tabSword);
        cermileSword = new ItemVetheanHammerSword(x.cermileSwordID, "cermileSword", 13).setIconIndex(4, 3).setCreativeTab(CreativeTabHelper.tabSword);
        pardimalSword = new ItemVetheanHammerSword(x.pardimalSwordID, "pardimalSword", 16).setIconIndex(4, 4).setCreativeTab(CreativeTabHelper.tabSword);
        quadroticSword = new ItemVetheanHammerSword(x.quadroticSwordID, "quadroticSword", 20).setIconIndex(4, 5).setCreativeTab(CreativeTabHelper.tabSword);
        karosSword = new ItemVetheanHammerSword(x.karosSwordID, "karosSword", 22).setIconIndex(4, 6).setCreativeTab(CreativeTabHelper.tabSword);
        heliosisSword = new ItemVetheanHammerSword(x.heliosisSwordID, "heliosisSword", 29).setIconIndex(4, 7).setCreativeTab(CreativeTabHelper.tabSword);
        arksianeSword = new ItemVetheanHammerSword(x.arksianeSwordID, "arksianeSword", 37).setIconIndex(4, 8).setCreativeTab(CreativeTabHelper.tabSword);
        
        teakerClaw = new ItemVetheanClaw(x.teakerClawID, "teakerClaw", 3).setIconIndex(4, 144).setCreativeTab(CreativeTabHelper.tabSword);
        amthrimisClaw = new ItemVetheanClaw(x.amthirmisClawID, "amthirmisClaw", 5).setIconIndex(4, 145).setCreativeTab(CreativeTabHelper.tabSword);
        darvenClaw = new ItemVetheanClaw(x.darvenClawID, "darvenClaw", 7).setIconIndex(4, 146).setCreativeTab(CreativeTabHelper.tabSword);
        cermileClaw = new ItemVetheanClaw(x.cermileClawID, "cermileClaw", 8).setIconIndex(4, 147).setCreativeTab(CreativeTabHelper.tabSword);
        pardimalClaw = new ItemVetheanClaw(x.pardimalClawID, "pardimalClaw", 12).setIconIndex(4, 148).setCreativeTab(CreativeTabHelper.tabSword);
        quadroticClaw = new ItemVetheanClaw(x.quadroticClawID, "quadroticClaw", 14).setIconIndex(4, 149).setCreativeTab(CreativeTabHelper.tabSword);
        karosClaw = new ItemVetheanClaw(x.karosClawID, "karosClaw", 19).setIconIndex(4, 150).setCreativeTab(CreativeTabHelper.tabSword);
        heliosisClaw = new ItemVetheanClaw(x.heliosisClawID, "heliosisClaw", 26).setIconIndex(4, 151).setCreativeTab(CreativeTabHelper.tabSword);
        arksianeClaw = new ItemVetheanClaw(x.arksianeClawID, "arksianeClaw", 35).setIconIndex(4, 152).setCreativeTab(CreativeTabHelper.tabSword);
        
        acidfire = new ItemDivineRPG(x.acidfireID).setUnlocalizedName("Acidfire").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanArrow = new ItemDivineRPG(x.vetheanArrowID).setUnlocalizedName("Teaker Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanArrow2 = new ItemDivineRPG(x.vetheanArrow2ID).setUnlocalizedName("Darven Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanWarArrow = new ItemDivineRPG(x.vetheanWarArrowID).setUnlocalizedName("Pardimal Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanWrathArrow = new ItemDivineRPG(x.vetheanWrathArrowID).setUnlocalizedName("Karos Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        everArrow = new ItemDivineRPG(x.everArrowID).setUnlocalizedName("Ever Arrow").setCreativeTab(CreativeTabHelper.tabItems);
        
        teakerBow = new ItemVetheanBow(x.teakerBowID, 0.5D, vetheanArrow, "teakerBow", false, 0, 0).setIconIndex(4, 0, 2).setCreativeTab(CreativeTabHelper.tabRanged);
        amthrimisBow = new ItemVetheanBow(x.amthirmisBowID, 0.7D, vetheanArrow, "amthrimisBow", false, 0, 0).setIconIndex(4, 5, 2).setCreativeTab(CreativeTabHelper.tabRanged);
        darvenBow = new ItemVetheanBow(x.darvenBowID, 1.1D, vetheanArrow2, "darvenBow", false, 0, 0).setIconIndex(4, 0, 3).setCreativeTab(CreativeTabHelper.tabRanged);
        cermileBow = new ItemVetheanBow(x.cermileBowID, 1.4D, vetheanArrow2, "cermileBow", false, 0, 0).setIconIndex(4, 5, 3).setCreativeTab(CreativeTabHelper.tabRanged);
        pardimalBow = new ItemVetheanBow(x.pardimalBowID, 1.8D, vetheanWarArrow, "pardimalBow", false, 0, 0).setIconIndex(4, 0, 4).setCreativeTab(CreativeTabHelper.tabRanged);
        quadroticBow = new ItemVetheanBow(x.quadroticBowID, 2.1D, vetheanWarArrow, "quadroticBow", false, 0, 0).setIconIndex(4, 5, 4).setCreativeTab(CreativeTabHelper.tabRanged);
        karosBow = new ItemVetheanBow(x.karosBowID, 2.3D, vetheanWrathArrow, "karosBow", false, 0, 0).setIconIndex(4, 0, 5).setCreativeTab(CreativeTabHelper.tabRanged);
        heliosisBow = new ItemVetheanBow(x.heliosisBowID, 2.8D, vetheanWrathArrow, "heliosisBow", false, 0, 0).setIconIndex(4, 5, 5).setCreativeTab(CreativeTabHelper.tabRanged);
        arksianeBow = new ItemVetheanBow(x.arksianeBowID, 3.6D, vetheanWrathArrow, "arksianeBow", false, 0, 0).setIconIndex(4, 0, 6).setCreativeTab(CreativeTabHelper.tabRanged);
        
        dreamPowder = new ItemDreamPowder(x.dreamPowderID).setUnlocalizedName("DreamPowder").setCreativeTab(CreativeTabHelper.tabItems);
        
        vetheanHammerTemplate = new ItemDivineRPG(x.vetheanHammerTemplateID).setUnlocalizedName("vetheanHammerTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanBackswordTemplate = new ItemDivineRPG(x.vetheanBackswordTemplateID).setUnlocalizedName("vetheanBackswordTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanBowTemplate = new ItemDivineRPG(x.vetheanBowTemplateID).setUnlocalizedName("vetheanBowTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanCannonTemplate = new ItemDivineRPG(x.vetheanCannonTemplateID).setUnlocalizedName("vetheanCannonTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanClawTemplate = new ItemDivineRPG(x.vetheanClawTemplateID).setUnlocalizedName("vetheanClawTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanDiskTemplate = new ItemDivineRPG(x.vetheanDiskTemplateID).setUnlocalizedName("vetheanDiskTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanStaffTemplate = new ItemDivineRPG(x.vetheanStaffTemplateID).setUnlocalizedName("vetheanStaffTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanDegradedTemplate = new ItemDivineRPG(x.vetheanDegradedTemplateID).setUnlocalizedName("vetheanDegradedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanFinishedTemplate = new ItemDivineRPG(x.vetheanFinishedTemplateID).setUnlocalizedName("vetheanFinishedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanGlisteningTemplate = new ItemDivineRPG(x.vetheanGlisteningTemplateID).setUnlocalizedName("vetheanGlisteningTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanDemonizedTemplate = new ItemDivineRPG(x.vetheanDemonizedTemplateID).setUnlocalizedName("vetheanDemonizedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        vetheanTormentedTemplate = new ItemDivineRPG(x.vetheanTormentedTemplateID).setUnlocalizedName("vetheanTormentedTemplate").setCreativeTab(CreativeTabHelper.tabItems);
        
        teakerLump = new ItemDivineRPG(x.teakerLumpID).setUnlocalizedName("TeakerLump").setCreativeTab(CreativeTabHelper.tabItems);
        amthrimisLump = new ItemDivineRPG(x.amthirmisLumpID).setUnlocalizedName("AmthrimisLump").setCreativeTab(CreativeTabHelper.tabItems);
        darvenLump = new ItemDivineRPG(x.darvenLumpID).setUnlocalizedName("DarvenLump").setCreativeTab(CreativeTabHelper.tabItems);
        cermileLump = new ItemDivineRPG(x.cermileLumpID).setUnlocalizedName("CermileLump").setCreativeTab(CreativeTabHelper.tabItems);
        pardimalLump = new ItemDivineRPG(x.pardimalLumpID).setUnlocalizedName("pardimalLump").setCreativeTab(CreativeTabHelper.tabItems);
        quadroticLump = new ItemDivineRPG(x.quadroticLumpID).setUnlocalizedName("quadroticLump").setCreativeTab(CreativeTabHelper.tabItems);
        karosLump = new ItemDivineRPG(x.karosLumpID).setUnlocalizedName("karosLump").setCreativeTab(CreativeTabHelper.tabItems);
        heliosisLump = new ItemDivineRPG(x.heliosisLumpID).setUnlocalizedName("heliosisLump").setCreativeTab(CreativeTabHelper.tabItems);
        arksianeLump = new ItemDivineRPG(x.arksianeLumpID).setUnlocalizedName("arksaineLump").setCreativeTab(CreativeTabHelper.tabItems);

        honeysuckle = new ItemVetheanFood(x.honeysuckleID, 1, 0.2F, true).setUnlocalizedName("honeysuckle").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamCarrot = new ItemVetheanFood(x.dreamCarrotID, 3, 0.4F, true).setUnlocalizedName("dreamCarrot").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamMelon = new ItemVetheanFood(x.dreamMelonID, 6, 0.6F, true).setUnlocalizedName("dreamMelon").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamPie = new ItemVetheanFood(x.dreamPieID, 4, 0.8F, true).setUnlocalizedName("dreamPie").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamCake = new ItemVetheanFood(x.dreamCakeID, 8, 0.8F, true).setUnlocalizedName("dreamCake").setCreativeTab(CreativeTabHelper.tabHerb);
        
        dreamSweets = new ItemVetheanHealingFood(x.dreamSweetsID, 0, 0F, false, 2).setUnlocalizedName("dreamSweets").setCreativeTab(CreativeTabHelper.tabHerb);
        dreamSours = new ItemVetheanHealingFood(x.dreamSoursID, 0, 0F, false, 8).setUnlocalizedName("dreamSours").setCreativeTab(CreativeTabHelper.tabHerb);
        
        dirtyPearls = new ItemDivineRPG(x.dirtyPearlsID).setUnlocalizedName("dirtyPearls").setCreativeTab(CreativeTabHelper.tabItems);
        cleanPearls = new ItemDivineRPG(x.cleanPearlsID).setUnlocalizedName("cleanPearls").setCreativeTab(CreativeTabHelper.tabItems);
        polishedPearls = new ItemDivineRPG(x.polishedPearlsID).setUnlocalizedName("polishedPearls").setCreativeTab(CreativeTabHelper.tabItems);
        shinyPearls = new ItemDivineRPG(x.shinyPearlsID).setUnlocalizedName("shinyPearls").setCreativeTab(CreativeTabHelper.tabItems);
        
        honeychunk = new ItemDivineRPG(x.honeychunkID).setUnlocalizedName("honeychunk").setCreativeTab(CreativeTabHelper.tabItems);
        rockChunks = new ItemDivineRPG(x.rockChunksID).setUnlocalizedName("rockChunks").setCreativeTab(CreativeTabHelper.tabItems);
        fyrossom = new ItemDivineRPG(x.fyrossomID).setUnlocalizedName("fyrossom").setCreativeTab(CreativeTabHelper.tabItems);
        heivaBelt = new ItemDivineRPG(x.heivaBeltID).setUnlocalizedName("heivaBelt").setCreativeTab(CreativeTabHelper.tabItems);
        mooncloud = new ItemDivineRPG(x.mooncloudID).setUnlocalizedName("mooncloud").setCreativeTab(CreativeTabHelper.tabItems);
        wormChunks = new ItemDivineRPG(x.wormChunksID).setUnlocalizedName("wormChunk").setCreativeTab(CreativeTabHelper.tabItems);
        vhraakTeeth = new ItemDivineRPG(x.vhraakTeethID).setUnlocalizedName("vhraakTeeth").setCreativeTab(CreativeTabHelper.tabItems);
        
        dreamflint = new ItemDreamflint(x.dreamflintID).setUnlocalizedName("dreamflint").setCreativeTab(CreativeTabHelper.tabSpawner);
        moonclock = new ItemMoonclock(x.moonclockID).setUnlocalizedName("moonclock").setCreativeTab(CreativeTabHelper.tabSpawner);
        spinebackChunk = new ItemSpinebackChunk(x.spinebackChunkID).setUnlocalizedName("spinebackChunk").setCreativeTab(CreativeTabHelper.tabSpawner);
        
        teakerCannon = new ItemVetheanCannon(x.teakerCannonID, 3, "TeakerCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        amthrimisCannon = new ItemVetheanCannon(x.amthirmisCannonID, 5, "amthirmisCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        darvenCannon = new ItemVetheanCannon(x.darvenCannonID, 8, "darvenCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        cermileCannon = new ItemVetheanCannon(x.cermileCannonID, 12, "cermileCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        pardimalCannon = new ItemVetheanCannon(x.pardimalCannonID, 15, "pardimalCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        quadroticCannon = new ItemVetheanCannon(x.quadroticCannonID, 19, "quadroticCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        karosCannonItem = new ItemVetheanCannon(x.karosCannonItemID, 21, "karosCannonItem").setCreativeTab(CreativeTabHelper.tabRanged);
        heliosisCannon = new ItemVetheanCannon(x.heliosisCannonID, 28, "heliosisCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        arksianeCannon = new ItemVetheanCannon(x.arksianeCannonID, 36, "arksianeCannon").setCreativeTab(CreativeTabHelper.tabRanged);
        
        eversight = new ItemVetheanEversight(x.eversightID, 42, "eversight").setCreativeTab(CreativeTabHelper.tabRanged);
        everlight = new ItemVetheanHammerSword(x.everlightID, "everlight", 44).setCreativeTab(CreativeTabHelper.tabSword);
        everbright = new ItemVetheanClaw(x.everbrightID, "everbright", 42).setCreativeTab(CreativeTabHelper.tabSword);
        everfight = new ItemVetheanBow(x.everfightID, 4.6D, everArrow, "everfight", false, 25, 25).setIconIndex(4, 5, 6).setUnlocalizedName("everfight").setCreativeTab(CreativeTabHelper.tabRanged);
        evernight = new ItemEvernight(x.evernightID, 115, 200).setUnlocalizedName("evernight").setCreativeTab(CreativeTabHelper.tabRanged);
        
        teakerStaff = new ItemVetheanStaff(x.teakerStaffID, 3, 10).setUnlocalizedName("TeakerStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        amthrimisStaff = new ItemVetheanStaff(x.amthirmisStaffID, 5, 10).setUnlocalizedName("amthirmisStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        darvenStaff = new ItemVetheanStaff(x.darvenStaffID, 8, 10).setUnlocalizedName("darvenStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        cermileStaff = new ItemVetheanStaff(x.cermileStaffID, 12, 10).setUnlocalizedName("cermileStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        pardimalStaff = new ItemVetheanStaff(x.pardimalStaffID, 15, 10).setUnlocalizedName("pardimalStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        quadroticStaff = new ItemVetheanStaff(x.quadroticStaffID, 19, 10).setUnlocalizedName("quadroticStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        karosStaff = new ItemVetheanStaff(x.karosStaffID, 21, 10).setUnlocalizedName("karosStaffItem").setCreativeTab(CreativeTabHelper.tabRanged);
        heliosisStaff = new ItemVetheanStaff(x.heliosisStaffID, 28, 10).setUnlocalizedName("heliosisStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        arksianeStaff = new ItemVetheanStaff(x.arksianeStaffID, 36, 10).setUnlocalizedName("arksianeStaff").setCreativeTab(CreativeTabHelper.tabRanged);
        
        //AddArmors();
        
        addNames();
	}
	
	public static void AddArmors()
	{
        int degradedRender = RenderingRegistry.addNewArmourRendererPrefix("degraded");
        degradedHelmetMelee = new ItemVetheanArmor(x.degradedHelmetMeleeID, degradedRender, "DHM", 0, 15, "Melee", "").setIconIndex(4, 185).setUnlocalizedName("degradedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedHelmetRanged = new ItemVetheanArmor(x.degradedHelmetRangedID, degradedRender, "DMR", 0, 15, "Ranged", "").setIconIndex(4, 190).setUnlocalizedName("degradedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedHelmetArcana = new ItemVetheanArmor(x.degradedHelmetArcanaID, degradedRender, "DHA", 0, 15, "Arcana", "").setIconIndex(4, 248).setUnlocalizedName("degradedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedChest = new ItemVetheanArmor(x.degradedChestID, degradedRender, "DC", 1, 15, "", "").setIconIndex(4, 186).setUnlocalizedName("degradedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedLegs = new ItemVetheanArmor(x.degradedLegsID, degradedRender, "DL", 2, 15, "", "").setIconIndex(4, 187).setUnlocalizedName("degradedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        degradedBoots = new ItemVetheanArmor(x.degradedBootsID, degradedRender, "DB", 3, 15, "", "").setIconIndex(4, 188).setUnlocalizedName("degradedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int finishedRender = RenderingRegistry.addNewArmourRendererPrefix("finished");
        finishedHelmetMelee = new ItemVetheanArmor(x.finishedHelmetMeleeID, finishedRender, "", 0, 30, "Melee", "").setUnlocalizedName("finishedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedHelmetRanged = new ItemVetheanArmor(x.finishedHelmetRangedID, finishedRender, "", 0, 30, "Ranged", "").setUnlocalizedName("finishedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedHelmetArcana = new ItemVetheanArmor(x.finishedHelmetArcanaID, finishedRender, "", 0, 30, "Arcana", "").setUnlocalizedName("finishedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedChest = new ItemVetheanArmor(x.finishedChestID, finishedRender, "", 1, 30, "", "").setUnlocalizedName("finishedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedLegs = new ItemVetheanArmor(x.finishedLegsID, finishedRender, "", 2, 30, "", "").setUnlocalizedName("finishedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        finishedBoots = new ItemVetheanArmor(x.finishedBootsID, finishedRender, "", 3, 30, "", "").setUnlocalizedName("finishedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int glisteningRender = RenderingRegistry.addNewArmourRendererPrefix("glistening");
        glisteningHelmetMelee = new ItemVetheanArmor(x.glisteningHelmetMeleeID, glisteningRender, "", 0, 45, "Melee", "+3 Melee Damage3").setUnlocalizedName("glisteningHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningHelmetRanged = new ItemVetheanArmor(x.glisteningHelmetRangedID, glisteningRender, "", 0, 45, "Ranged", "1.4x Movement Speed").setUnlocalizedName("glisteningHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningHelmetArcana = new ItemVetheanArmor(x.glisteningHelmetArcanaID, glisteningRender, "", 0, 45, "Arcana", "2x Jump Height").setUnlocalizedName("glisteningHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningChest = new ItemVetheanArmor(x.glisteningChestID, glisteningRender, "", 1, 45, "", "").setUnlocalizedName("glisteningChest").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningLegs = new ItemVetheanArmor(x.glisteningLegsID, glisteningRender, "", 2, 45, "", "").setUnlocalizedName("glisteningLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        glisteningBoots = new ItemVetheanArmor(x.glisteningBootsID, glisteningRender, "", 3, 45, "", "").setUnlocalizedName("glisteningBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int demonizedRender = RenderingRegistry.addNewArmourRendererPrefix("demonized");
        demonizedHelmetMelee = new ItemVetheanArmor(x.demonizedHelmetMeleeID, demonizedRender, "", 0, 55, "Melee", "+6 Melee Damage").setUnlocalizedName("demonizedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedHelmetRanged = new ItemVetheanArmor(x.demonizedHelmetRangedID, demonizedRender, "", 0, 55, "Ranged", "1.8X Movement Speed").setUnlocalizedName("demonizedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedHelmetArcana = new ItemVetheanArmor(x.demonizedHelmetArcanaID, demonizedRender, "", 0, 55, "Arcana", "3x Jump Height").setUnlocalizedName("demonizedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedChest = new ItemVetheanArmor(x.demonizedChestID, demonizedRender, "", 1, 55, "", "").setUnlocalizedName("demonizedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedLegs = new ItemVetheanArmor(x.demonizedLegsID, demonizedRender, "", 2, 55, "", "").setUnlocalizedName("demonizedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        demonizedBoots = new ItemVetheanArmor(x.demonizedBootsID, demonizedRender, "", 3, 55, "", "").setUnlocalizedName("demonizedBoots").setCreativeTab(CreativeTabHelper.tabArmor);

        int tormentedRender = RenderingRegistry.addNewArmourRendererPrefix("tormented");
        tormentedHelmetMelee = new ItemVetheanArmor(x.tormentedHelmetMeleeID, tormentedRender, "", 0, 70, "Melee", "+9 Melee Damage").setUnlocalizedName("tormentedHelmetMelee").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedHelmetRanged = new ItemVetheanArmor(x.tormentedHelmetRangedID, tormentedRender, "", 0, 70, "Ranged", "2x Movement Speed").setUnlocalizedName("tormentedHelmetRanged").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedHelmetArcana = new ItemVetheanArmor(x.tormentedHelmetArcanaID, tormentedRender, "", 0, 70, "Arcana", "4x Jump Height").setUnlocalizedName("tormentedHelmetArcana").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedChest = new ItemVetheanArmor(x.tormentedChestID, tormentedRender, "", 1, 70, "", "").setUnlocalizedName("tormentedChest").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedLegs = new ItemVetheanArmor(x.tormentedLegsID, tormentedRender, "", 2, 70, "", "").setUnlocalizedName("tormentedLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        tormentedBoots = new ItemVetheanArmor(x.tormentedBootsID, tormentedRender, "", 3, 70, "", "").setUnlocalizedName("tormentedBoots").setCreativeTab(CreativeTabHelper.tabArmor);
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(teakerBow, "Teaker Bow");
		LanguageRegistry.addName(amthrimisBow, "Amthirmis Bow"); 
		LanguageRegistry.addName(darvenBow, "Darven Bow");
		LanguageRegistry.addName(cermileBow, "Cermile Bow");
		LanguageRegistry.addName(pardimalBow, "Pardimal WarBow");
		LanguageRegistry.addName(quadroticBow, "Quadrotic WarBow");
		LanguageRegistry.addName(karosBow, "Karos WarBow");
		LanguageRegistry.addName(heliosisBow, "Heliosis WrathBow");
		LanguageRegistry.addName(arksianeBow, "Arksiane  WrathBow");

		LanguageRegistry.addName(teakerHammer, "Teaker Hammer");
		LanguageRegistry.addName(amthrimisHammer, "Amthirmis Hammer");
		LanguageRegistry.addName(darvenHammer, "Darven Hammer");
		LanguageRegistry.addName(cermileHammer, "Cermile Hammer");
		LanguageRegistry.addName(pardimalHammer, "Pardimal WarHammer");
		LanguageRegistry.addName(quadroticHammer, "Quadrotic WarHammer");
		LanguageRegistry.addName(karosHammer, "Karos WarHammer");
		LanguageRegistry.addName(heliosisHammer, "Heliosis WrathHammer");
		LanguageRegistry.addName(arksianeHammer, "Arksiane  WrathHammer");


		LanguageRegistry.addName(teakerSword, "Teaker Backsword");
		LanguageRegistry.addName(amthrimisSword, "Amthirmis Backsword");
		LanguageRegistry.addName(darvenSword, "Darven Backsword");
		LanguageRegistry.addName(cermileSword, "Cermile Backsword");
		LanguageRegistry.addName(pardimalSword, "Pardimal WarBacksword");
		LanguageRegistry.addName(quadroticSword, "Quadrotic WarBacksword");
		LanguageRegistry.addName(karosSword, "Karos WarBacksword");
		LanguageRegistry.addName(heliosisSword, "Heliosis WrathBacksword");
		LanguageRegistry.addName(arksianeSword, "Arksiane  WrathBacksword");

		LanguageRegistry.addName(teakerSword, "Teaker Backsword");
		LanguageRegistry.addName(amthrimisSword, "Amthirmis Backsword");
		LanguageRegistry.addName(darvenSword, "Darven Backsword");
		LanguageRegistry.addName(cermileSword, "Cermile Backsword");
		LanguageRegistry.addName(pardimalSword, "Pardimal Warsword");
		LanguageRegistry.addName(quadroticSword, "Quadrotic Warsword");
		LanguageRegistry.addName(karosSword, "Karos Warsword");
		LanguageRegistry.addName(heliosisSword, "Heliosis Wrathsword");
		LanguageRegistry.addName(arksianeSword, "Arksiane  Wrathsword");

		LanguageRegistry.addName(teakerDisk, "Teaker Disc");
		LanguageRegistry.addName(amthrimisDisk, "Amthirmis Disc");
		LanguageRegistry.addName(darvenDisk, "Darven Disc");
		LanguageRegistry.addName(cermileDisk, "Cermile Disc");
		LanguageRegistry.addName(pardimalDisk, "Pardimal WarDisc");
		LanguageRegistry.addName(quadroticDisk, "Quadrotic WarDisc");
		LanguageRegistry.addName(karosDisk, "Karos WarDisc");
		LanguageRegistry.addName(heliosisDisk, "Heliosis WrathDisc");
		LanguageRegistry.addName(arksianeDisk, "Arksiane  WrathDisc");


		LanguageRegistry.addName(teakerStaff, "Teaker Staff");
		LanguageRegistry.addName(amthrimisStaff, "Amthirmis Staff");
		LanguageRegistry.addName(darvenStaff, "Darven Staff");
		LanguageRegistry.addName(cermileStaff, "Cermile Staff");
		LanguageRegistry.addName(pardimalStaff, "Pardimal WarStaff");
		LanguageRegistry.addName(quadroticStaff, "Quadrotic WarStaff");
		LanguageRegistry.addName(karosStaff, "Karos WarStaff");
		LanguageRegistry.addName(heliosisStaff, "Heliosis WrathStaff");
		LanguageRegistry.addName(arksianeStaff, "Arksiane WrathStaff");


		LanguageRegistry.addName(teakerCannon, "Teaker Cannon");
		LanguageRegistry.addName(amthrimisCannon, "Amthirmis Cannon");
		LanguageRegistry.addName(darvenCannon, "Darven Cannon");
		LanguageRegistry.addName(cermileCannon, "Cermile Cannon");
		LanguageRegistry.addName(pardimalCannon, "Pardimal WarCannon");
		LanguageRegistry.addName(quadroticCannon, "Quadrotic WarCannon");
		LanguageRegistry.addName(karosCannonItem, "Karos WarCannon");
		LanguageRegistry.addName(heliosisCannon, "Heliosis WrathCannon");
		LanguageRegistry.addName(arksianeCannon, "Arksiane  WrathCannon");


		LanguageRegistry.addName(teakerClaw, "Teaker Claw");
		LanguageRegistry.addName(amthrimisClaw, "Amthirmis Claw");
		LanguageRegistry.addName(darvenClaw, "Darven Claw");
		LanguageRegistry.addName(cermileClaw, "Cermile Claw");
		LanguageRegistry.addName(pardimalClaw, "Pardimal WarClaw");
		LanguageRegistry.addName(quadroticClaw, "Quadrotic WarClaw");
		LanguageRegistry.addName(karosClaw, "Karos WarClaw");
		LanguageRegistry.addName(heliosisClaw, "Heliosis WrathClaw");
		LanguageRegistry.addName(arksianeClaw, "Arksiane  WrathClaw");

		LanguageRegistry.addName(teakerLump, "Teaker Lump");
		LanguageRegistry.addName(amthrimisLump, "Amthirmis Lump");
		LanguageRegistry.addName(darvenLump, "Darven Lump");
		LanguageRegistry.addName(cermileLump, "Cermile Lump");
		LanguageRegistry.addName(pardimalLump, "Pardimal Lump");
		LanguageRegistry.addName(quadroticLump, "Quadrotic Lump");
		LanguageRegistry.addName(karosLump, "Karos Lump");
		LanguageRegistry.addName(heliosisLump, "Heliosis Lump");
		LanguageRegistry.addName(arksianeLump, "Arksiane  Lump");

		LanguageRegistry.addName(acidfire, "Acid");
		/*LanguageRegistry.addName(degradedHelmetArcana, "Degraded Hood");
		LanguageRegistry.addName(degradedHelmetRanged, "Degraded Mask");
		LanguageRegistry.addName(degradedHelmetMelee, "Degraded Helmet");
		LanguageRegistry.addName(degradedChest, "Degraded Body");
		LanguageRegistry.addName(degradedLegs, "Degraded Legs");
		LanguageRegistry.addName(degradedBoots, "Degraded Boots");

		LanguageRegistry.addName(finishedHelmetArcana, "Finished Hood");
		LanguageRegistry.addName(finishedHelmetRanged, "Finished Mask");
		LanguageRegistry.addName(finishedHelmetMelee, "Finished Helmet");
		LanguageRegistry.addName(finishedChest, "Finished Body");
		LanguageRegistry.addName(finishedLegs, "Finished Legs");
		LanguageRegistry.addName(finishedBoots, "Finished Boots");

		LanguageRegistry.addName(glisteningHelmetArcana, "Glistening Hood");
		LanguageRegistry.addName(glisteningHelmetRanged, "Glistening Mask");
		LanguageRegistry.addName(glisteningHelmetMelee, "Glistening Helmet");
		LanguageRegistry.addName(glisteningChest, "Glistening Body");
		LanguageRegistry.addName(glisteningLegs, "Glistening Legs");
		LanguageRegistry.addName(glisteningBoots, "Glistening Boots");

		LanguageRegistry.addName(demonizedHelmetArcana, "Demonized Hood");
		LanguageRegistry.addName(demonizedHelmetRanged, "Demonized Mask");
		LanguageRegistry.addName(demonizedHelmetMelee, "Demonized Helmet");
		LanguageRegistry.addName(demonizedChest, "Demonized Body");
		LanguageRegistry.addName(demonizedLegs, "Demonized Legs");
		LanguageRegistry.addName(demonizedBoots, "Demonized Boots");

		LanguageRegistry.addName(tormentedHelmetArcana, "Tormented Hood");
		LanguageRegistry.addName(tormentedHelmetRanged, "Tormented Mask");
		LanguageRegistry.addName(tormentedHelmetMelee, "Tormented Helmet");
		LanguageRegistry.addName(tormentedChest, "Tormented Body");
		LanguageRegistry.addName(tormentedLegs, "Tormented Legs");
		LanguageRegistry.addName(tormentedBoots, "Tormented Boots");*/


		LanguageRegistry.addName(dreamCarrot, "Dream Carrot");
		LanguageRegistry.addName(dreamPie, "Dream Pie");
		LanguageRegistry.addName(dreamCake, "Dream Cake");
		LanguageRegistry.addName(dreamMelon, "Dream Melon");
		LanguageRegistry.addName(dreamSweets, "Dream Sweets");
		LanguageRegistry.addName(dreamSours, "Dream Sours");
		LanguageRegistry.addName(dirtyPearls, "Dirty Pearls");
		LanguageRegistry.addName(cleanPearls, "Clean Pearls");
		LanguageRegistry.addName(polishedPearls, "Polished Pearls");
		LanguageRegistry.addName(shinyPearls, "Shiny Pearls");
		LanguageRegistry.addName(everlight, "Everlight");
		LanguageRegistry.addName(eversight, "Eversight");
		LanguageRegistry.addName(evernight, "Evernight");
		LanguageRegistry.addName(everfight, "Everfright");
		LanguageRegistry.addName(everbright, "Everbright");
		LanguageRegistry.addName(vetheanBowTemplate, "Bow Template");
		LanguageRegistry.addName(vetheanBackswordTemplate, "Backsword Template");
		LanguageRegistry.addName(vetheanDiskTemplate, "Disc Template");
		LanguageRegistry.addName(vetheanCannonTemplate, "Cannon Template");
		LanguageRegistry.addName(vetheanClawTemplate, "Claw Template");
		LanguageRegistry.addName(vetheanDegradedTemplate, "Degraded Template");
		LanguageRegistry.addName(vetheanTormentedTemplate, "Tormented Template");
		LanguageRegistry.addName(vetheanDemonizedTemplate, "Demonized Template");
		LanguageRegistry.addName(vetheanGlisteningTemplate, "Glistening Template");
		LanguageRegistry.addName(vetheanFinishedTemplate, "Finished Template");
		LanguageRegistry.addName(vetheanHammerTemplate, "Hammer Template");
		LanguageRegistry.addName(vetheanStaffTemplate, "Staff Template");

		LanguageRegistry.addName(honeysuckle, "Honeysuckle");
		LanguageRegistry.addName(honeychunk, "Honey Chunk");
		LanguageRegistry.addName(fyrossom, "Fyrossom");
		LanguageRegistry.addName(mooncloud, "Mooncloud");
		LanguageRegistry.addName(rockChunks, "Rock Chunks");

		LanguageRegistry.addName(dreamflint, "Dream Flint");
		LanguageRegistry.addName(moonclock, "Moon Clock");
		LanguageRegistry.addName(dreamPowder, "Dream Powder");
		LanguageRegistry.addName(heivaBelt, "Band of Heiva Hunting");

		LanguageRegistry.addName(vetheanArrow, "Teaker Arrows");
		LanguageRegistry.addName(vetheanArrow2, "Darven Arrows");
		LanguageRegistry.addName(vetheanWarArrow, "Pardimal Arrows");
		LanguageRegistry.addName(vetheanWrathArrow, "Karos Arrows");
		LanguageRegistry.addName(everArrow, "Ever Arrows");
	}
}
