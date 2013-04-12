package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.entities.arcana.mobs.EntityConstructor;
import xolova.divinerpg.entities.arcana.mobs.EntityDeathHound;
import xolova.divinerpg.entities.arcana.mobs.EntityDeathcryx;
import xolova.divinerpg.entities.arcana.mobs.EntityDungeonDemon;
import xolova.divinerpg.entities.arcana.mobs.EntityDungeonPrisoner;
import xolova.divinerpg.entities.arcana.mobs.EntityFyracryx;
import xolova.divinerpg.entities.arcana.mobs.EntityGolemOfRejuv;
import xolova.divinerpg.entities.arcana.mobs.EntityLivingStatue;
import xolova.divinerpg.entities.arcana.mobs.EntityParatiku;
import xolova.divinerpg.entities.arcana.mobs.EntityRazorback;
import xolova.divinerpg.entities.arcana.mobs.EntityRoamer;
import xolova.divinerpg.entities.arcana.mobs.EntitySeimer;
import xolova.divinerpg.entities.arcana.mobs.EntityWraith;
import xolova.divinerpg.entities.arcana.projectile.EntityFirefly;
import xolova.divinerpg.entities.arcana.projectile.EntityFyracryxFireball;
import xolova.divinerpg.entities.arcana.projectile.EntityGrenade;
import xolova.divinerpg.entities.arcana.projectile.EntityLamona;
import xolova.divinerpg.entities.arcana.projectile.EntityLivingStatueArrow;
import xolova.divinerpg.entities.arcana.projectile.EntityMerikMissile;
import xolova.divinerpg.entities.arcana.projectile.EntityReflector;
import xolova.divinerpg.entities.arcana.projectile.EntitySparkler;
import xolova.divinerpg.entities.arcana.projectile.EntityStarfall;
import xolova.divinerpg.entities.arcana.traders.EntityCaptianMerik;
import xolova.divinerpg.entities.arcana.traders.EntityDatticon;
import xolova.divinerpg.entities.arcana.traders.EntityLeorna;
import xolova.divinerpg.entities.arcana.traders.EntityVatticus;
import xolova.divinerpg.entities.arcana.traders.EntityZelus;
import xolova.divinerpg.utils.helpers.DimensionRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArcanaEntityHelper 
{
	public static int START_EID;
	public static void init()
	{
		ModMobRegistry.registerEntity(EntityRazorback.class, "DivineRPG_Razorback", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityLivingStatue.class, "DivineRPG_LivingStatue", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityDeathcryx.class, "DivineRPG_Deathcryx", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityDungeonPrisoner.class, "DivineRPG_DungeonPrisoner", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityDungeonDemon.class, "DivineRPG_DungeonDemon", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityRoamer.class, "DivineRPG_Roamer", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityConstructor.class, "DivineRPG_Constructor", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityDeathHound.class, "DivineRPG_DeathHound", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityLeorna.class, "DivineRPG_Leorna", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityCaptianMerik.class, "DivineRPG_CaptianMerik", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityDatticon.class, "DivineRPG_Datticon", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityZelus.class, "DivineRPG_Zelus", START_EID++, 64, 10, true);
		ModMobRegistry.registerEntity(EntityVatticus.class, "DivineRPG_LordVatticus", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFyracryx.class, "DivineRPG_Fyracryx", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityParatiku.class, "DivineRPG_Paratiku", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntitySeimer.class, "DivineRPG_Seimer", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityGolemOfRejuv.class, "DivineRPG_GolemOfRejuv", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityWraith.class, "DivineRPG_Wraith", START_EID++, 64, 10, true);
		
		ModMobRegistry.registerModEntity(EntityFirefly.class, "DivineRPG_Firefly", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFyracryxFireball.class, "DivineRPG_FyracryxFireball", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityGrenade.class, "DivineRPG_Grenade", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityLamona.class, "DivineRPG_Lamona", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityLivingStatueArrow.class, "DivineRPG_LivingStatueArrow", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityMerikMissile.class, "DivineRPG_MericMissile", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityReflector.class, "DivineRPG_Reflector", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntitySparkler.class, "DivineRPG_Sparkler", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityStarfall.class, "DivineRPG_Starlight", START_EID++, 64, 10, true);
		addSpawns();
		addNames();
	}
	
	public static void addSpawns()
	{
        EntityRegistry.addSpawn(EntityLeorna.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityDatticon.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityZelus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityVatticus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityCaptianMerik.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
	}
	
	public static void addNames()
	{
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Roamer.name",  "Roamer");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Deathcryx.name",  "Deathcryx");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Deathhound.name",  "Death Hound");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Razorback.name",  "Razorback");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Constructor.name",  "Dungeon Constructor");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_LivingStatue.name",  "Living Statue");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_DungeonPrisoner.name",  "Dungeon Prisoner");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_DungeonDemon.name",  "Dungeon Demon");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Leorna.name",  "Leorna");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Captainmerik.name",  "Captain Merik");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Datticon.name",  "Datticon");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_LordVatticus.name",  "Lord Vatticus");
        LanguageRegistry.instance().addStringLocalization("entity.DivineRPG_Zelus.name",  "Zelus");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Fyracryx.name",  "Fyracryx");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Paratiku.name",  "Paratiku");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_GolemOfRejuv.name",  "Golem of Rejuvination");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Seimer.name",  "Seimer");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Wraith.name",  "Wraith");

        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Lamona.name",  "Lamona");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_LivingStatueArrow.name",  "Living Statue Arrow");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Reflector.name",  "Reflector Wave");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Sparkler.name",  "Sparkler");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Grenade.name",  "Grenade");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_MerikMissile.name",  "Marik Missile");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Starlight.name",  "Star Light");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.DivineRPG_Firefly.name",  "Firefly");
	}
}
