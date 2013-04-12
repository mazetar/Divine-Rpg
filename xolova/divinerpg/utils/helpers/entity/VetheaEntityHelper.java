package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import xolova.divinerpg.entities.vethea.mobs.*;
import xolova.divinerpg.entities.vethea.projectile.*;
import xolova.divinerpg.utils.helpers.DimensionRegistry;

public class VetheaEntityHelper 
{
	public static int START_EID;
	public static void init()
	{
        ModMobRegistry.registerEntity(EntityVermenous.class, "DivineRPG_vermenous", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityEnt.class, "DivineRPG_ent", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityCymesoid.class, "DivineRPG_cymesoid", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityDreamwrecker.class, "DivineRPG_dreamwrecker", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityTocaxin.class, "DivineRPG_tocaxin", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityShadahier.class, "DivineRPG_shadahier", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityAcidHag.class, "DivineRPG_acidhag", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityKazrotic.class, "DivineRPG_kazrotic", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityHelio.class, "DivineRPG_helio", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityGorgosion.class, "DivineRPG_gorgosion", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityHoverStinger.class, "DivineRPG_hoverstinger", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityZone.class, "DivineRPG_zone", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityZoragon.class, "DivineRPG_zoragon", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityDissiment.class, "DivineRPG_dissiment", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntitySpinebackWorm.class, "DivineRPG_spinebackworm", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityVhraak.class, "DivineRPG_vhraak", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityGalroid.class, "DivineRPG_galroid", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityLadyLuna.class, "DivineRPG_ladyluna", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityBohemite.class, "DivineRPG_bohemite", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityWreck.class, "DivineRPG_wreck", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityBiphron.class, "DivineRPG_biphron", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityHiveQueen.class, "DivineRPG_hivequeen", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityHiveSoldier.class, "DivineRPG_hivesoldier", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityLheiva.class, "DivineRPG_lheiva", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntitySpinebackWormBody.class, "DivineRPG_spinebackWormBody", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityMandragora.class, "DivineRPG_mandragora", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityTwins.class, "DivineRPG_twins", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityKaros.class, "DivineRPG_Karos", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityRaglok.class, "DivineRPG_Raglok", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityQuadro.class, "DivineRPG_Quadro", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityDuo.class, "DivineRPG_Duo", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityEndiku.class, "DivineRPG_Endiku", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityLorga.class, "DivineRPG_Lorga", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityLorgaFlight.class, "DivineRPG_LorgaFligt", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityMysteriousManLayer1.class, "DivineRPG_MMLayer1", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityMysteriousManLayer2.class, "DivineRPG_MMLayer2", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityMysteriousManLayer3.class, "DivineRPG_MMLayer3", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityHungerHungry.class, "DivineRPG_HungerHungry", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityCryptKeeper.class, "DivineRPG_CryptKeeper", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityTempleGuardian.class, "DivineRPG_TempleGuardian", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityEhu.class, "DivineRPG_ehu", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityStoneGolem.class, "DivineRPG_StoneGolem", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityHusk.class, "DivineRPG_husk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerEntity(EntityVermsillion.class, "DivineRPG_Vermsillion", START_EID++ , 64, 10, true);
        
        ModMobRegistry.registerModEntity(EntityTeakerDisk.class, "DivineRPG_Teaker Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityAmthirmisDisk.class, "DivineRPG_Amthirmis Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityDarvenDisk.class, "DivineRPG_Darven Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityCermileDisk.class, "DivineRPG_Cermile Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityPardimalDisk.class, "DivineRPG_Pardimal Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityQuadroticDisk.class, "DivineRPG_Quadrotic Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityKarosDisk.class, "DivineRPG_Karos Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityHeliosisDisk.class, "DivineRPG_Heliosis Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityArksianeDisk.class, "DivineRPG_Arksiane Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntitySpinebackDisc.class, "DivineRPG_Spineback Disk", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityVetheanCannonShot.class, "DivineRPG_Vethean Cannon Shot", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityVetheanArrow.class, "DivineRPG_Teaker Arrow", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityVetheanArrow2.class, "DivineRPG_Darven Arrow", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityVetheanWarArrow.class, "DivineRPG_Pardimal Arrow", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityVetheanWrathArrow.class, "DivineRPG_Karos Arrow", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityKarosCannonShot.class, "DivineRPG_Karos Cannon", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntitySpinebackCannonShot.class, "DivineRPG_Spinback Cannon Shot", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityEvernightProjectile.class, "DivineRPG_Evernight Projectile", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityBouncingProjectile.class, "DivineRPG_Bouncing Projectile", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityWreckExplosiveShot.class, "DivineRPG_Wreck Explosive", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityWreckStrengthShot.class, "DivineRPG_Wreck Strength", START_EID++ , 64, 10, true);
        ModMobRegistry.registerModEntity(EntityMandragoraProjectile.class, "DivineRPG_Mandragora Projectile", START_EID++ , 64, 10, true);
        addNames();
        addSpawns();
	}
	
	public static void addSpawns()
	{
        EntityRegistry.addSpawn(EntityVermenous.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityCymesoid.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityDreamwrecker.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityDuo.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityTwins.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityBohemite.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityTocaxin.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityMandragora.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityShadahier.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityLheiva.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityHoverStinger.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityAcidHag.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityKazrotic.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityVhraak.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityEndiku.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityHelio.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityBiphron.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityZoragon.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityGorgosion.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityDissiment.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityZone.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityLorga.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityLorgaFlight.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityGalroid.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityMysteriousManLayer1.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityMysteriousManLayer2.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityMysteriousManLayer3.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        
        EntityRegistry.addSpawn(EntityEhu.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityVermsillion.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityHusk.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityStoneGolem.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
	}
	
	public static void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_cymesoid.name","Cymesoid");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_ent.name","Ent");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_vermenous.name","Vermenous");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_dreamwrecker.name","Dreamwrecker");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_duo.name","Duo");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_twins.name","Twins");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_quadro.name","Quadro");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_boheimite.name","Boheimite");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_cymesoid.name","Tocaxin");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_hiveSoldier.name","Hive Soldier");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_shadahier.name","Shadahier");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_mandragora.name","Mandragora");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_lheiva.name","L'heiva");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_hoverStinger.name","Hover Stinger");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_acidHag.name","Acid Hag");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_kazrotic.name","Kazrotic");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_vhraak.name","Vhraak");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_endiku.name","Endiku");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_helio.name","Helio");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_bipron.name","Biphron");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_zoragon.name","Zoragon");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_gorgosion.name","Gorgosion");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_dissiment.name","Dissiment");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_zone.name","Zone");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_lorga.name","Lorga");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_loraflight.name","Lorgaflight");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_herbomancer.name","Herbomancer");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_galroid.name","Galroid");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_wreck.name","Wreck");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_hiveQueen.name","Hive Queen");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_drkaros.name","Dr Karos");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_raglok.name","Raglok Gog'dure");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_ladyluna.name","Lady Luna");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_vermsillion.name","Vermsillion");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_ehu.name","Ehu");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_husk.name","Husk");
		LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_stonegolem.name","Stone Golem");

		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Teaker Disk.name", "Teaker Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Amthrimis Disk.name", "Amthrimis Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Darven Disk.name", "Darven Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Cermile Disk.name", "Cermile Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Pardimal Disk.name", "Pardimal Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Quadrotic Disk.name", "Quadrotic Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Karos Disk.name", "Karos Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Heliosis Disk.name", "Heliosis Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Arksiane Disk.name", "Arksiane Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Spineback Disk.name", "Spineback Disk");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Vethean Cannon Shot.name", "Vethean Cannon");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Teaker Arrow.name", "Teaker Arrow");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Darven Arrow.name", "Darven Arrow");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Pardimal Arrow.name", "Pardimal Arrow");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Karos Arrow.name", "Karos Arrow");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Spineback Cannon Shot.name", "Spineback Canon");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Evernight Projectile.name", "Evernight");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Bouncing Projectile.name", "Bouncing Projectile");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Wreck Explosive.name", "Wreck Explosive");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Wreck Strength.name", "Wreck Strength Shot");
		LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Mandragora Projectile.name", "Mandragora");
	}
}
