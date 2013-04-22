package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.entities.bosses.EntityDensos;
import xolova.divinerpg.entities.bosses.EntityKarot;
import xolova.divinerpg.entities.bosses.EntityReyvor;
import xolova.divinerpg.entities.bosses.EntitySoulFiend;
import xolova.divinerpg.entities.bosses.EntityTwilightDemon;
import xolova.divinerpg.entities.bosses.EntityVamacheron;
import xolova.divinerpg.entities.twilight.mobs.EntityAngryBunny;
import xolova.divinerpg.entities.twilight.mobs.EntityAzuriteGolem;
import xolova.divinerpg.entities.twilight.mobs.EntityAzuriteTomo;
import xolova.divinerpg.entities.twilight.mobs.EntityBaslisk;
import xolova.divinerpg.entities.twilight.mobs.EntityCadillion;
import xolova.divinerpg.entities.twilight.mobs.EntityCori;
import xolova.divinerpg.entities.twilight.mobs.EntityCori2;
import xolova.divinerpg.entities.twilight.mobs.EntityDenseCadillion;
import xolova.divinerpg.entities.twilight.mobs.EntityDenseDemon;
import xolova.divinerpg.entities.twilight.mobs.EntityEchantedWarrior;
import xolova.divinerpg.entities.twilight.mobs.EntityEnergyArcher;
import xolova.divinerpg.entities.twilight.mobs.EntityEnergyCadillion;
import xolova.divinerpg.entities.twilight.mobs.EntityEnergyGolem;
import xolova.divinerpg.entities.twilight.mobs.EntityEnergyTomo;
import xolova.divinerpg.entities.twilight.mobs.EntityMadivel;
import xolova.divinerpg.entities.twilight.mobs.EntityMoonWolf;
import xolova.divinerpg.entities.twilight.mobs.EntityMythrilArcher;
import xolova.divinerpg.entities.twilight.mobs.EntityMythrilFiend;
import xolova.divinerpg.entities.twilight.mobs.EntityMythrilGolem;
import xolova.divinerpg.entities.twilight.mobs.EntityNesro;
import xolova.divinerpg.entities.twilight.mobs.EntitySamek;
import xolova.divinerpg.entities.twilight.mobs.EntitySerenityBunny;
import xolova.divinerpg.entities.twilight.mobs.EntitySerenityTomo;
import xolova.divinerpg.entities.twilight.mobs.EntitySoulStealer;
import xolova.divinerpg.entities.twilight.mobs.EntityTwilightArcher;
import xolova.divinerpg.entities.twilight.mobs.EntityVerek;
import xolova.divinerpg.entities.twilight.projectile.EntityCoriShot;
import xolova.divinerpg.entities.twilight.projectile.EntityEnergyArrow;
import xolova.divinerpg.entities.twilight.projectile.EntityFuryArrow;
import xolova.divinerpg.entities.twilight.projectile.EntityPhaserAugite;
import xolova.divinerpg.entities.twilight.projectile.EntityPhaserAzurite;
import xolova.divinerpg.entities.twilight.projectile.EntityPhaserDravite;
import xolova.divinerpg.entities.twilight.projectile.EntityPhaserHalite;
import xolova.divinerpg.entities.twilight.projectile.EntityPhaserMythril;
import xolova.divinerpg.entities.twilight.projectile.EntityPhaserUvite;
import xolova.divinerpg.entities.twilight.projectile.EntitySerenityArrow;
import xolova.divinerpg.entities.twilight.projectile.EntitySlicerAugite;
import xolova.divinerpg.entities.twilight.projectile.EntitySlicerAzurite;
import xolova.divinerpg.entities.twilight.projectile.EntitySlicerDravite;
import xolova.divinerpg.entities.twilight.projectile.EntitySlicerHalite;
import xolova.divinerpg.entities.twilight.projectile.EntitySlicerMythril;
import xolova.divinerpg.entities.twilight.projectile.EntitySlicerUvite;
import xolova.divinerpg.utils.helpers.DimensionRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightEntityHelper 
{
	public static int START_EID = 150;
	
	public static void init()
	{
		ModMobRegistry.registerEntity(EntityCadillion.class, "Cadillion", START_EID++, 64, 10, true, 0xffffff, 0xcae1ff);
        ModMobRegistry.registerEntity(EntitySerenityTomo.class, "serenitytomo", START_EID++, 64, 10, true, 0xd9d919, 0xd4ed91);
        ModMobRegistry.registerEntity(EntitySerenityBunny.class, "bunny", START_EID++, 64, 10, true, 0xffffff, 0xfff8dc);
        ModMobRegistry.registerEntity(EntityAngryBunny.class, "angrybunny", START_EID++, 64, 10, true, 0x000000, 0x363636);
        ModMobRegistry.registerEntity(EntityCori.class, "cori", START_EID++, 64, 10, true, 0xffff7e, 0xfffff0);
        ModMobRegistry.registerEntity(EntityMadivel.class, "madivel", START_EID++, 64, 10, true, 0xffb90f, 0xff8c00);
        ModMobRegistry.registerEntity(EntityNesro.class, "nesro", START_EID++, 64, 10, true, 0x00ff00, 0x93db70);
        ModMobRegistry.registerEntity(EntityAzuriteGolem.class, "azuritegolem", START_EID++, 64, 10, true, 0x146f4, 0x05e9ff);
        ModMobRegistry.registerEntity(EntityAzuriteTomo.class, "azuritetomo", START_EID++, 64, 10, true, 0x000080, 0x00cdcd);
        ModMobRegistry.registerEntity(EntityVerek.class, "verek", START_EID++, 64, 10, true, 0x000080, 0x00cdcd);
        ModMobRegistry.registerEntity(EntityMoonWolf.class, "moonwolf", START_EID++, 64, 10, true, 0x000080, 0x00cdcd);
        ModMobRegistry.registerEntity(EntityEnergyCadillion.class, "energycadillion", START_EID++, 64, 10, true, 0x2E0854, 0x473c8b);
        ModMobRegistry.registerEntity(EntityEnergyTomo.class, "energytomo", START_EID++, 64, 10, true, 0x2E0854, 0x473c8b);
        ModMobRegistry.registerEntity(EntityEnergyGolem.class, "energygolem", START_EID++, 64, 10, true, 0x2E0854, 0x473c8b);
        ModMobRegistry.registerEntity(EntityEchantedWarrior.class, "enchantwarrior", START_EID++, 64, 10, true, 0x2E0854, 0x473c8b);
        ModMobRegistry.registerEntity(EntityTwilightArcher.class, "energyArcher", START_EID++, 64, 10, true, 0x2E0854, 0x473c8b);
        ModMobRegistry.registerEntity(EntityMythrilArcher.class, "mythrilarcher", START_EID++, 64, 10, true, 0xffffff, 0x0f0f0f);
        ModMobRegistry.registerEntity(EntityEnergyArcher.class, "twilightarcher", START_EID++, 64, 10, true, 0x1f1f1f, 0x2b2b2b);
        ModMobRegistry.registerEntity(EntitySamek.class, "samek", START_EID++, 64, 10, true, 0xffffff, 0x0f0f0f);
        ModMobRegistry.registerEntity(EntityMythrilGolem.class, "mythrilgolem", START_EID++, 64, 10, true, 0xffffff, 0x0f0f0f);
        ModMobRegistry.registerEntity(EntityCori2.class, "cori2", START_EID++, 64, 10, true, 0xffffff, 0x0f0f0f);
        ModMobRegistry.registerEntity(EntityMythrilFiend.class, "mythrilfiend", START_EID++, 64, 10, true, 0xffffff, 0x0f0f0f);
        ModMobRegistry.registerEntity(EntityDenseCadillion.class, "densecadillion", START_EID++, 64, 10, true, 0x1f1f1f, 0x2b2b2b);
        ModMobRegistry.registerEntity(EntityDenseDemon.class, "densedemon", START_EID++, 64, 10, true, 0x1f1f1f, 0x2b2b2b);
        ModMobRegistry.registerEntity(EntityBaslisk.class, "baslisk", START_EID++, 64, 10, true, 0x1f1f1f, 0x2b2b2b);
        ModMobRegistry.registerEntity(EntitySoulStealer.class, "soulstealer", START_EID++, 64, 10, true, 0x1f1f1f, 0x2b2b2b);
        ModMobRegistry.registerEntity(EntityDensos.class, "densos", START_EID++, 64, 10, true, 0xCC1100,  0xAADD00);
        ModMobRegistry.registerEntity(EntityReyvor.class, "reyvor", START_EID++, 64, 10, true, 0xAADD00, 0xCC1100);
        ModMobRegistry.registerEntity(EntityTwilightDemon.class, "twilightdemon", START_EID++, 64, 10, true, 0x69FF01, 0x0A0A0A);
        ModMobRegistry.registerEntity(EntitySoulFiend.class, "soulfiend", START_EID++, 64, 10, true, 0x8B2500, 0x69FF01);
        ModMobRegistry.registerEntity(EntityVamacheron.class, "vamacheron", START_EID++, 64, 10, true, 0x0A0A0A, 0x660000);
        ModMobRegistry.registerEntity(EntityKarot.class, "karot", START_EID++, 64, 10, true, 0x2b2b2b, 0x660000);
        

        ModMobRegistry.registerModEntity(EntitySerenityArrow.class, "serenityarrow", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityEnergyArrow.class, "energyarrow", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityFuryArrow.class, "furyarrow", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntitySlicerDravite.class, "serenityslicer", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntitySlicerAzurite.class, "azuriteslicer", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntitySlicerUvite.class, "energyslicer", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntitySlicerMythril.class, "mythrilslicer", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntitySlicerAugite.class, "denseslicer", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntitySlicerHalite.class, "ultimaslicer", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityPhaserDravite.class, "serenityphaser", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityPhaserAzurite.class, "azuritephaser", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityPhaserUvite.class, "energyphaser", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityPhaserMythril.class, "mythrilphaser", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityPhaserAugite.class, "densephaser", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityPhaserHalite.class, "ultimaphaser", START_EID++,  64, 10, true);
        ModMobRegistry.registerModEntity(EntityCoriShot.class, "corishot", START_EID++,  64, 10, true);
		addSpawns();
		addNames();
	}

	public static void addSpawns() 
	{
		EntityRegistry.addSpawn(EntitySerenityTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.serenityBiome});
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.serenityBiome});
		EntityRegistry.addSpawn(EntitySerenityBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.serenityBiome});
		EntityRegistry.addSpawn(EntityCori.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.serenityBiome});
        EntityRegistry.addSpawn(EntityNesro.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.serenityBiome});
		EntityRegistry.addSpawn(EntityMadivel.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.serenityBiome});
        
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.azuriteBiome});
        EntityRegistry.addSpawn(EntityAzuriteTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.azuriteBiome});
        EntityRegistry.addSpawn(EntityAzuriteGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.azuriteBiome});
        EntityRegistry.addSpawn(EntityVerek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.azuriteBiome});
        EntityRegistry.addSpawn(EntityMoonWolf.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.azuriteBiome});;
        
        EntityRegistry.addSpawn(EntityEnergyCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.energyBiome});
        EntityRegistry.addSpawn(EntityEnergyGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.energyBiome});
        EntityRegistry.addSpawn(EntityEnergyTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.energyBiome});
        EntityRegistry.addSpawn(EntityEchantedWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.energyBiome});
        EntityRegistry.addSpawn(EntityTwilightArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.energyBiome});
        
        EntityRegistry.addSpawn(EntityMythrilFiend.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityMythrilGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityMythrilArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntitySamek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityCori2.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.denseBiome});
        EntityRegistry.addSpawn(EntityDenseDemon.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.denseBiome});
        EntityRegistry.addSpawn(EntityBaslisk.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.denseBiome});
        EntityRegistry.addSpawn(EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.denseBiome});
        EntityRegistry.addSpawn(EntityDenseCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.denseBiome});
        EntityRegistry.addSpawn(EntityEnergyArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.denseBiome});
	}

	public static void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("entity.Cadillion.name", "Dravite Cadillion");
        LanguageRegistry.instance().addStringLocalization("entity.serenitytomo.name", "Dravite Tomo");
        LanguageRegistry.instance().addStringLocalization("entity.bunny.name", "Bunny");
        LanguageRegistry.instance().addStringLocalization("entity.angrybunny.name", "Angry Bunny");
        LanguageRegistry.instance().addStringLocalization("entity.cori.name", "Cori");
        LanguageRegistry.instance().addStringLocalization("entity.madivel.name", "Madivel");
        LanguageRegistry.instance().addStringLocalization("entity.nesro.name", "Nesro");
        LanguageRegistry.instance().addStringLocalization("entity.azuritegolem.name", "Azurite Golem");
        LanguageRegistry.instance().addStringLocalization("entity.azuritetomo.name", "Azurite Tomo");
        LanguageRegistry.instance().addStringLocalization("entity.verek.name", "Verek");
        LanguageRegistry.instance().addStringLocalization("entity.moonwolf.name", "Moon Wolf");
        LanguageRegistry.instance().addStringLocalization("entity.energycadillion.name", "Uvite Cadillion");
        LanguageRegistry.instance().addStringLocalization("entity.energytomo.name", "Uvite Tomo");
        LanguageRegistry.instance().addStringLocalization("entity.energygolem.name", "Uvite Golem");
        LanguageRegistry.instance().addStringLocalization("entity.enchantwarrior.name", "Enchanted Warrior");
        LanguageRegistry.instance().addStringLocalization("entity.energyArcher.name", "Uvite Archer");
        LanguageRegistry.instance().addStringLocalization("entity.mythrilarcher.name", "Mythril Archer");
        LanguageRegistry.instance().addStringLocalization("entity.twilightarcher.name", "Twilight Archer");
        LanguageRegistry.instance().addStringLocalization("entity.samek.name", "Samek");
        LanguageRegistry.instance().addStringLocalization("entity.mythrilgolem.name", "Mythril Golem");
        LanguageRegistry.instance().addStringLocalization("entity.cori2.name", "Advanced Cori");
        LanguageRegistry.instance().addStringLocalization("entity.mythrilfiend.name", "Mythril Fiend");
        LanguageRegistry.instance().addStringLocalization("entity.densecadillion.name", "Augite Cadillion");
        LanguageRegistry.instance().addStringLocalization("entity.densedemon.name", "Demon of Darkness");
        LanguageRegistry.instance().addStringLocalization("entity.baslisk.name", "Baslisk");
        LanguageRegistry.instance().addStringLocalization("entity.soulstealer.name", "Soul Stealer");
        LanguageRegistry.instance().addStringLocalization("entity.densos.name", "Densos");
        LanguageRegistry.instance().addStringLocalization("entity.reyvor.name", "Reyvor");
        LanguageRegistry.instance().addStringLocalization("entity.twilightdemon.name", "Twilight Demon");
        LanguageRegistry.instance().addStringLocalization("entity.soulfiend.name", "Soul Fiend");
        LanguageRegistry.instance().addStringLocalization("entity.vamacheron.name", "Vamacheron");
        LanguageRegistry.instance().addStringLocalization("entity.karot.name", "Kar-OT");

        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.serenityarrow.name",  "Azurite Arrow");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.energyarrow.name",  "Azurite Arrow");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.furyarrow.name",  "Fury Arrow");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.serenityslicer.name",  "Dravite Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.azuriteslicer.name",  "Azurite Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.energyslicer.name",  "Uvite Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.mythrilslicer.name",  "Mythril Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.denseslicer.name",  "Augite Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.ultimaslicer.name",  "Ultima Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.twilightslicer.name",  "Twilight Slicer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.energyphaser.name",  "Uvite Phaser");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.azuritephaser.name",  "Azurite Phaser");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.serenityphaser.name",  "Dravite Phaser");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.densephaser.name",  "Augite Phaser");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.mythrilphaser.name",  "Mythril Phaser");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.ultimaphaser.name",  "Halite Phaser");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.corishot.name",  "Cori");
	}
}
