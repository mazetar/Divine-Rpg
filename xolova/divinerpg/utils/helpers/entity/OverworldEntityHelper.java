package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.entities.core.EntityDamageProjectile;
import xolova.divinerpg.entities.overworld.mobs.EntityAncient;
import xolova.divinerpg.entities.overworld.mobs.EntityAridWarrior;
import xolova.divinerpg.entities.overworld.mobs.EntityCaveCrawler;
import xolova.divinerpg.entities.overworld.mobs.EntityCaveclops;
import xolova.divinerpg.entities.overworld.mobs.EntityCrab;
import xolova.divinerpg.entities.overworld.mobs.EntityCyclops;
import xolova.divinerpg.entities.overworld.mobs.EntityDesertCrawler;
import xolova.divinerpg.entities.overworld.mobs.EntityEnderSpider;
import xolova.divinerpg.entities.overworld.mobs.EntityEnderTriplets;
import xolova.divinerpg.entities.overworld.mobs.EntityEnderWatcher;
import xolova.divinerpg.entities.overworld.mobs.EntityEnthralledDramcryx;
import xolova.divinerpg.entities.overworld.mobs.EntityFrost;
import xolova.divinerpg.entities.overworld.mobs.EntityHellPig;
import xolova.divinerpg.entities.overworld.mobs.EntityHellSpider;
import xolova.divinerpg.entities.overworld.mobs.EntityIceMan;
import xolova.divinerpg.entities.overworld.mobs.EntityJackOMan;
import xolova.divinerpg.entities.overworld.mobs.EntityJungleBat;
import xolova.divinerpg.entities.overworld.mobs.EntityJungleDramcryx;
import xolova.divinerpg.entities.overworld.mobs.EntityJungleSpider;
import xolova.divinerpg.entities.overworld.mobs.EntityKingCrab;
import xolova.divinerpg.entities.overworld.mobs.EntityMamormeter;
import xolova.divinerpg.entities.overworld.mobs.EntityMiner;
import xolova.divinerpg.entities.overworld.mobs.EntityNetherWatcher;
import xolova.divinerpg.entities.overworld.mobs.EntityRainbour;
import xolova.divinerpg.entities.overworld.mobs.EntityRotatick;
import xolova.divinerpg.entities.overworld.mobs.EntityScorcher;
import xolova.divinerpg.entities.overworld.mobs.EntityShark;
import xolova.divinerpg.entities.overworld.mobs.EntityTheEye;
import xolova.divinerpg.entities.overworld.mobs.EntityWhale;
import xolova.divinerpg.entities.overworld.mobs.EntityWildFire;
import xolova.divinerpg.entities.overworld.projectile.EntityBlueFireBall;
import xolova.divinerpg.entities.overworld.projectile.EntityBowCannon;
import xolova.divinerpg.entities.overworld.projectile.EntityCaveRock;
import xolova.divinerpg.entities.overworld.projectile.EntityCorruptShot;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabCannon;
import xolova.divinerpg.entities.overworld.projectile.EntityDeathSeranade;
import xolova.divinerpg.entities.overworld.projectile.EntityEnderArrow;
import xolova.divinerpg.entities.overworld.projectile.EntityEnderBolt;
import xolova.divinerpg.entities.overworld.projectile.EntityExplosiveArrow;
import xolova.divinerpg.entities.overworld.projectile.EntityFireArrow;
import xolova.divinerpg.entities.overworld.projectile.EntityFrostShard;
import xolova.divinerpg.entities.overworld.projectile.EntityGhastTear;
import xolova.divinerpg.entities.overworld.projectile.EntityMamormeterShot;
import xolova.divinerpg.entities.overworld.projectile.EntityMusicBall;
import xolova.divinerpg.entities.overworld.projectile.EntityPoisonArrow;
import xolova.divinerpg.entities.overworld.projectile.EntityPurpleFireball;
import xolova.divinerpg.entities.overworld.projectile.EntityShuriken;
import xolova.divinerpg.entities.overworld.projectile.EntityStromBall;
import xolova.divinerpg.entities.overworld.projectile.EntityTripletProjectile;
import xolova.divinerpg.entities.overworld.projectile.EntityVailStorm;
import xolova.divinerpg.entities.overworld.projectile.EntityWatcherShot;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OverworldEntityHelper 
{
	public static int START_EID = 0;
	public static BiomeGenBase[] iceBiomes = new BiomeGenBase[]{BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills};
	public static BiomeGenBase[] overworldBiomes = new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river};
	
	
	public static void init()
	{
		ModMobRegistry.registerEntity(EntityDamageProjectile.class, "DivineRPG_projectile", START_EID++, 64, 10, true);
		
		
        ModMobRegistry.registerEntity(EntityHellSpider.class, "HellSpider", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityJungleSpider.class, "JungleSpider", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityCyclops.class, "Cyclops", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityIceMan.class, "Ice Man", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityFrost.class, "Frost", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityNetherWatcher.class, "Watcher", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityEnderWatcher.class, "Ender Watcher", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityHellPig.class, "Hell Pig", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityMiner.class, "Miner", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityAncient.class, "Ancient", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityMamormeter.class, "mamormeter", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityCrab.class, "crab", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityShark.class, "shark", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityWhale.class, "whale", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityKingCrab.class, "kingcrab", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityJackOMan.class, "jackoman", START_EID++, 64, 10, true);
        
        ModMobRegistry.registerEntity(EntityDesertCrawler.class, "desertcrawler", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityCaveCrawler.class, "cavecrawler", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityAridWarrior.class, "aridwarrior", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityRotatick.class, "rotatick", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityJungleDramcryx.class, "jungledramcryx", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityEnthralledDramcryx.class, "enthralleddramcryx", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityTheEye.class, "theeye", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityEnderTriplets.class, "endertriplets", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityJungleBat.class, "junglebat", START_EID++, 64, 10, true);
        ModMobRegistry.registerEntity(EntityCaveclops.class, "caveclops", START_EID++, 64, 10, true);
        
        ModMobRegistry.registerModEntity(EntityShuriken.class, "Shuriken", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityVailStorm.class, "VailStrom", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityPoisonArrow.class, "PoisonArrow", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityFireArrow.class, "FireArrow", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityExplosiveArrow.class, "ExplosiveArrow", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityStromBall.class, "Stromball", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityMusicBall.class, "MusicNote", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityGhastTear.class, "GhastTear", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityFrostShard.class, "FrostShard", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityDeathSeranade.class, "KillSerande", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityBlueFireBall.class, "BlueFireball", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityEnderBolt.class, "enderbolt", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityPurpleFireball.class, "purplefireball", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityWatcherShot.class, "watchershot", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityMamormeterShot.class, "mamormeter", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityBowCannon.class, "bowcannon", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityCrabCannon.class, "crabcannon", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityTripletProjectile.class, "triplet", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityCaveRock.class, "caverock", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityEnderArrow.class, "Ender Arrow", START_EID++, 64, 10, true);
        ModMobRegistry.registerModEntity(EntityCorruptShot.class, "Corrupted Shot", START_EID++, 64, 10, true);
        
        addNames();
        addSpawns();
	}
	
	public static void addSpawns()
	{
		EntityRegistry.addSpawn(EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, iceBiomes);
        EntityRegistry.addSpawn(EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, iceBiomes);
        EntityRegistry.addSpawn(EntityHellSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityScorcher.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityJungleSpider.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityJackOMan.class, 1, 1, 1, EnumCreatureType.creature, overworldBiomes);
        EntityRegistry.addSpawn(EntityHellPig.class, 25, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityEnderWatcher.class, 10, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityCrab.class, 15, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityCrab.class, 15, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityKingCrab.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityWhale.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityShark.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityCaveCrawler.class, 20, 2, 3, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityDesertCrawler.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(EntityAridWarrior.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(EntityRotatick.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityJungleDramcryx.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityEnthralledDramcryx.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityTheEye.class, 7, 1, 4, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityEnderTriplets.class, 1, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityJungleBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCaveclops.class, 20, 1, 4, EnumCreatureType.monster, overworldBiomes);
        
		EntityRegistry.addSpawn(EntityEnderSpider.class, 2, 1, 4, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityRainbour.class, 2, 1, 1, EnumCreatureType.creature, overworldBiomes);
        EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
	}
	
	public static void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("entity.jackoman.name",  "Jack'O Man");
        LanguageRegistry.instance().addStringLocalization("entity.HellSpider.name",  "Hell Spider");
        LanguageRegistry.instance().addStringLocalization("entity.JungleSpider.name",  "Jungle Spider");
        LanguageRegistry.instance().addStringLocalization("entity.Cyclops.name",  "Cyclops");
        LanguageRegistry.instance().addStringLocalization("entity.Ice Man.name",  "Glacon");
        LanguageRegistry.instance().addStringLocalization("entity.Frost.name",  "Frost");
        LanguageRegistry.instance().addStringLocalization("entity.Scorcher.name",  "Scorcher");
        LanguageRegistry.instance().addStringLocalization("entity.Watcher.name",  "Watcher");
        LanguageRegistry.instance().addStringLocalization("entity.Ender Watcher.name",  "Ender Watcher");
        LanguageRegistry.instance().addStringLocalization("entity.Hell Pig.name",  "Hell Pig");
        LanguageRegistry.instance().addStringLocalization("entity.Miner.name",  "Undead Miner");
        LanguageRegistry.instance().addStringLocalization("entity.Ancient.name",  "Ancient Boss");
        LanguageRegistry.instance().addStringLocalization("entity.mamormeter.name", "King of Scorchers");
        LanguageRegistry.instance().addStringLocalization("entity.crab.name", "Crab");
        LanguageRegistry.instance().addStringLocalization("entity.shark.name", "Shark");
        LanguageRegistry.instance().addStringLocalization("entity.whale.name", "Whale");
        LanguageRegistry.instance().addStringLocalization("entity.kingcrab.name", "King Crab");
        LanguageRegistry.instance().addStringLocalization("entity.desertcrawler.name",  "Desert Crawler");
        LanguageRegistry.instance().addStringLocalization("entity.cavecrawler.name",  "Cave Crawler");
        LanguageRegistry.instance().addStringLocalization("entity.aridwarrior.name",  "Arid Warrior");
        LanguageRegistry.instance().addStringLocalization("entity.rotatick.name",  "Rotatick");
        LanguageRegistry.instance().addStringLocalization("entity.jungledramcryx.name",  "Jungle Dramcryx");
        LanguageRegistry.instance().addStringLocalization("entity.enthralleddramcryx.name",  "Enthralled Dramcryx");
        LanguageRegistry.instance().addStringLocalization("entity.theeye.name",  "The Eye");
        LanguageRegistry.instance().addStringLocalization("entity.endertriplets.name",  "Ender Triplets");
        LanguageRegistry.instance().addStringLocalization("entity.junglebat.name",  "Jungle Bat");
        LanguageRegistry.instance().addStringLocalization("entity.caveclops.name",  "Caveclops");
        
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.Shuriken.name",  "Shuriken");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.VailStorm.name",  "Vile Storm");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.FireArrow.name",  "Flaming Bolt");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.PoisonArrow.name",  "Poison Arrow");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.ExplodingArrow.name",  "Bluefire Bolt");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.StromBall.name",  "Maelstrom");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.MusicNote.name",  "Musical Pain");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.GhastTear.name",  "Ghast Tear");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.FrostShard.name",  "Frozen Bullet");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.KillSerenade.name",  "A Power Above");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.BlueFireball.name",  "Frost");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.enderbolt.name",  "Ender Watcher");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.purplefireball.name",  "Scorcher");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.watchershot.name",  "Watcher");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.bowcannon.name",  "Bowhead Cannon");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.crabcannon.name",  "Crabclaw Cannon");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.GhastTear.name",  "Ghast Cannon");
        
	}
}
