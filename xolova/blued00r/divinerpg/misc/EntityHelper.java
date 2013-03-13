package xolova.blued00r.divinerpg.misc;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.*;
import xolova.blued00r.divinerpg.entities.mobs.arcana.*;
import xolova.blued00r.divinerpg.entities.mobs.bosses.*;
import xolova.blued00r.divinerpg.entities.mobs.iceika.*;
import xolova.blued00r.divinerpg.entities.mobs.traders.*;
import xolova.blued00r.divinerpg.entities.mobs.twilight.*;
import xolova.blued00r.divinerpg.entities.mobs.vethea.*;
import xolova.blued00r.divinerpg.entities.projectile.EntityVailStorm;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityFrostyMusic;
import xolova.blued00r.divinerpg.entities.vethea.*;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper {
	public static void defineEntities()
	{
		EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityShuriken.class, "Shuriken", 220, DivineRPG.instance, 250, 5, true);
        EntityRegistry.registerModEntity(EntityVailStorm.class, "VailStrom", 221, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityPoisonArrow.class, "PoisonArrow", 222, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityFireArrow.class, "FireArrow", 223, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityExplosiveArrow.class, "ExplosiveArrow", 224, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityStromBall.class, "Stromball", 225, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityMusicBall.class, "MusicBall", 226, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityGhastTear.class, "GhastTear", 227, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityFrostShard.class, "FrostShard", 228, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityDeathSeranade.class, "KillSerande", 229, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityBlueFireBall.class, "BlueFireball", 230, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityEnderBolt.class, "enderbolt", 231, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityPurpleFireball.class, "purplefireball", 232, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.mobs.projectile.EntityWatcherShot.class, "watchershot", 233, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntitySerenityArrow.class, "serenityarrow", 234, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityEnergyArrow.class, "energyarrow", 235, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityFuryArrow.class, "furyarrow", 236, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntitySerenitySlicer.class, "serenityslicer", 237, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityAzuriteSlicer.class, "azuriteslicer", 238, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityEnergySlicer.class, "energyslicer", 239, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityMythrilSlicer.class, "mythrilslicer", 240, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityDenseSlicer.class, "denseslicer", 241, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityUltimaSlicer.class, "ultimaslicer", 242, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityTwilightSlicer.class, "twilightslicer", 243, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntitySerenityPhaser.class, "serenityphaser", 244, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityAzuritePhaser.class, "azuritephaser", 245, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityEnergyPhaser.class, "energyphaser", 246, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityMythrilPhaser.class, "mythrilphaser", 247, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityDensePhaser.class, "densephaser", 248, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityUltimaPhaser.class, "ultimaphaser", 249, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityTwilightPhaser.class, "twilightphaser", 250, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityCoriShot.class, "corishot", 251, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.mobs.projectile.EntityMamormeterShot.class, "mamormeter", 252, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityBowCannon.class, "bowcannon", 253, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityCrabCannon.class, "crabcannon", 254, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.mobs.projectile.EntityTripletProjectile.class, "triplet", 255, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.mobs.projectile.EntityCaveRock.class, "caverock", 256, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityLamona.class, "lamonashot", 257, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.mobs.projectile.EntityLivingStatueArrow.class, "statuearrow", 258, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityFirefly.class, "firefly", 259, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityStarfall.class, "Star Light", 260, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityEnderArrow.class, "Ender Arrow", 261, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityCorruptShot.class, "Corrupted Shot", 262, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityReflector.class, "Reflector", 263, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntitySparkler.class, "Sparkler", 264, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityGrenade.class, "Grenade", 265, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(xolova.blued00r.divinerpg.entities.projectile.EntityMerikMissile.class, "Merik Missile", 266, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityFrostyMusic.class, "Caroling Sound", 267, DivineRPG.instance, 120, 5, true);
        
        /*
         * 1.3 Projectiles
         */
        
        EntityRegistry.registerModEntity(EntityKazroticShot.class, "Kazrotic Shot", 268, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityZoragonBomb.class, "Zoragon Bomb", 269, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDissimentShot.class, "Dissiment Shot", 270, DivineRPG.instance, 120, 5, true);
        
        int id = 270;
        EntityRegistry.registerModEntity(EntityTeakerDisk.class, "Teaker Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAmthirmisDisk.class, "Amthirmis Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDarvenDisk.class, "Darven Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityCermileDisk.class, "Cermile Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityPardimalDisk.class, "Pardimal Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityQuadroticDisk.class, "Quadrotic Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityKarosDisk.class, "Karos Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHeliosisDisk.class, "Heliosis Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityArksianeDisk.class, "Arksiane Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntitySpinebackDisc.class, "Spineback Disk", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityVetheanCannonShot.class, "Vethean Cannon Shot", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityVetheanArrow.class, "Teaker Arrow", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityVetheanArrow2.class, "Darven Arrow", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityVetheanWarArrow.class, "Pardimal Arrow", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityVetheanWrathArrow.class, "Karos Arrow", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityKarosCannonShot.class, "Karos Cannon", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntitySpinebackCannonShot.class, "Spinback Cannon Shot", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityEvernightProjectile.class, "Evernight Projectile", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityBouncingProjectile.class, "Bouncing Projectile", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityWreckExplosiveShot.class, "Wreck Explosive", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityWreckStrengthShot.class, "Wreck Strength", id++, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityMandragoraProjectile.class, "Mandragora Projectile", id++, DivineRPG.instance, 120, 5, true);
        
        /*
         * Mobs
         */
        
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityHellSpider.class, "HellSpider", 6, 0x830D0D, 0xC27373);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityJungleSpider.class, "JungleSpider", 23, 0x066F09, 0x19831A);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityCyclops.class, "Cyclops", 24, 0x766E3B, 0x575025);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityIceMan.class, "Ice Man", 25, 0x01F1FA, 0x00CBE8);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityFrost.class, "Frost", 26, 0xEEF7FE, 0x9DE9FE);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityScorcher.class, "Scorcher", 27, 0xC137FF, 0x7800FF);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityNetherWatcher.class, "Watcher", 77, 0x5B2B1D, 0x421C0F);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityEnderWatcher.class, "Ender Watcher", 28, 0x000000, 0xCC00FA);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityHellPig.class, "Hell Pig", 29,  0xFF6633, 0xFF3333);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityMiner.class, "Miner", 30, 0x3399cc, 0xcc6600);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityAncient.class, "Ancient", 67, 0xcc9933, 0xffcc66);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCadillion.class, "Cadillion", 31, 0xffffff, 0xcae1ff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityTomo.class, "serenitytomo", 32, 0xd9d919, 0xd4ed91);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityBunny.class, "bunny", 33, 0xffffff, 0xfff8dc);
        EntityRegistry.registerGlobalEntityID(EntityAngryBunny.class, "angrybunny", 34, 0x000000, 0x363636);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCori.class, "cori", 35, 0xffff7e, 0xfffff0);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMadivel.class, "madivel", 36, 0xffb90f, 0xff8c00);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityNesro.class, "nesro", 37, 0x00ff00, 0x93db70);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityAzuriteGolem.class, "azuritegolem", 38, 0x146f4, 0x05e9ff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityAzuriteTomo.class, "azuritetomo", 39, 0x000080, 0x00cdcd);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityVerek.class, "verek", 68, 0x000080, 0x00cdcd);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMoonWolf.class, "moonwolf", 69, 0x000080, 0x00cdcd);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyCadillion.class, "energycadillion", 70, 0x2E0854, 0x473c8b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyTomo.class, "energytomo", 71, 0x2E0854, 0x473c8b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyGolem.class, "energygolem", 72, 0x2E0854, 0x473c8b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEchantedWarrior.class, "enchantwarrior", 73, 0x2E0854, 0x473c8b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityTwilightArcher.class, "energyArcher", 74, 0x2E0854, 0x473c8b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilArcher.class, "mythrilarcher", 75, 0xffffff, 0x0f0f0f);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyArcher.class, "twilightarcher", 76, 0x1f1f1f, 0x2b2b2b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySamek.class, "samek", 78, 0xffffff, 0x0f0f0f);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilGolem.class, "mythrilgolem", 79, 0xffffff, 0x0f0f0f);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCori2.class, "cori2", 80, 0xffffff, 0x0f0f0f);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilFiend.class, "mythrilfiend", 81, 0xffffff, 0x0f0f0f);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityDenseCadillion.class, "densecadillion", 82, 0x1f1f1f, 0x2b2b2b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityDenseDemon.class, "densedemon", 83, 0x1f1f1f, 0x2b2b2b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityBaslisk.class, "baslisk", 84, 0x1f1f1f, 0x2b2b2b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySoulStealer.class, "soulstealer", 112, 0x1f1f1f, 0x2b2b2b);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityZichile.class, "zichile", 113, 0x6666FF, 0x242424);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityDex.class, "dex", 114, 0x668014, 0x242424);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityDensos.class, "densos", 115, 0xCC1100,  0xAADD00);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityReyvor.class, "reyvor", 116, 0xAADD00, 0xCC1100);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityTwilightDemon.class, "twilightdemon", 117, 0x69FF01, 0x0A0A0A);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntitySoulFiend.class, "soulfiend", 118, 0x8B2500, 0x69FF01);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityVamacheron.class, "vamacheron", 119, 0x0A0A0A, 0x660000);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityKarot.class, "karot", 121, 0x2b2b2b, 0x660000);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.bosses.EntityMamormeter.class, "mamormeter", 122, 0x8B2500, 0x8B7500);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityCrab.class, "crab", 100, 0x8B2500, 0x8B7500);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityShark.class, "shark", 101, 0x8B2500, 0x8B7500);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityWhale.class, "whale", 102, 0x8B2500, 0x8B7500);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityKingCrab.class, "kingcrab", 103, 0x8B2500, 0x8B7500);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan.class, "jackoman", 104, 0x000000, 0xffffff);
        //1.1 Final
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityDesertCrawler.class, "desertcrawler", 85, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityCaveCrawler.class, "cavecrawler", 86, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityAridWarrior.class, "aridwarrior", 87, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityRotatick.class, "rotatick", 88, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityJungleDramcryx.class, "jungledramcryx", 89, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityEnthralledDramcryx.class, "enthralleddramcryx", 7, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityTheEye.class, "theeye", 105, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityEnderTriplets.class, "endertriplets", 106, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityJungleBat.class, "junglebat", 107, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.EntityCaveclops.class, "caveclops", 108, 0x000000, 0xffffff);
        //Dungeon
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.traders.EntityLeorna.class, "leorna", 123, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.traders.EntityDatticon.class, "datticon", 44, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.traders.EntityVatticus.class, "vatticus", 45, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(EntityZelus.class, "Zelus", 46, 0x000000, 0xffffff);
        EntityRegistry.registerGlobalEntityID(EntityGorgosion.class, "TestMob", 124, 0x000000, 0xffffff);
        
        EntityRegistry.registerModEntity(EntityAlicanto.class, "alicanto", 1, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityFractite.class, "fractite", 2, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityGlacide.class, "glacide", 3, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHastreus.class, "hastreus", 4, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityFrostArcher.class, "frostarcher", 5, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityRollum.class, "rollum", 6, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityWorkshopTickerer.class, "workshoptickerer", 7, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityWorkshopMerchant.class, "workshopmerchant", 8, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDramix.class, "dramix", 9, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityParasecta.class, "parasecta", 10, DivineRPG.instance, 120, 5, true);
        
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.arcana.EntityFyracryx.class, "fyracryx", 47, 0x570D00, 0xB30800);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.arcana.EntityParatiku.class, "paratiku", 3, 0x002CFF, 0x452BCC);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.arcana.EntityGolemOfRejuv.class, "golemofrejuvination", 4, 0x490F09, 0xFF8515);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.arcana.EntitySeimer.class, "seimer", 5, 0xFA002C, 0x310600);
        EntityRegistry.registerGlobalEntityID(xolova.blued00r.divinerpg.entities.mobs.arcana.EntityWraith.class, "wraith", 8, 0x000000, 0xffffff);
        
        EntityRegistry.registerModEntity(EntityRainbour.class, "rainbour", 11, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityEnderSpider.class, "enderspider", 12, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAyeracoBlue.class, "Ayeraco Blue", 13 , DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAyeracoGreen.class, "Ayeraco Green", 14 , DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAyeracoRed.class, "Ayeraco Red", 15 , DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAyeracoYellow.class, "Ayeraco Yellow", 16 , DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAyeracoPurple.class, "Ayeraco Purple", 17 , DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityWildFire.class, "wildfire", 18 , DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHellSpider.class, "HellSpider", 19, DivineRPG.instance, 120, 5, true);

        EntityRegistry.registerModEntity(EntityRoamer.class, "roamer", 20, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDeathcryx.class, "deathcryx", 21, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDeathHound.class, "deathhound", 22, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityRazorback.class, "razorback", 23, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityConstructor.class, "constructor", 24, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityLivingStatue.class, "livingstatue", 25, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDungeonPrisoner.class, "dungeonprisoner", 26, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDungeonDemon.class, "dungeondemon", 27, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityCaptianMerik.class, "captainmerik", 28, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityGrue.class, "grue", 44, DivineRPG.instance, 120, 5, true);
        
        /*
         * 1.3 Mobs
         */
        
        EntityRegistry.registerModEntity(EntityVermenous.class, "vermenous", 29, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityEnt.class, "ent", 30, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityCymesoid.class, "cymesoid", 30, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDreamwrecker.class, "dreamwrecker", 31, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityTocaxin.class, "tocaxin", 32, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityShadahier.class, "shadahier", 33, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityAcidHag.class, "acidhag", 34, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityKazrotic.class, "kazrotic", 35, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHelio.class, "helio", 36, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityGorgosion.class, "gorgosion", 37, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHoverStinger.class, "hoverstinger", 38, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityZone.class, "zone", 39, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityZoragon.class, "zoragon", 40, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityDissiment.class, "dissiment", 41, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntitySpinebackWorm.class, "spinebackworm", 42, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityVhraak.class, "vhraak", 43, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityGalroid.class, "galroid", 45, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityLadyLuna.class, "ladyluna", 46, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityBohemite.class, "bohemite", 47, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityWreck.class, "wreck", 48, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityBiphron.class, "biphron", 49, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHiveQueen.class, "hivequeen", 50, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHiveSoldier.class, "hivesoldier", 51, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityLheiva.class, "lheiva", 52, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntitySpinebackWormBody.class, "spinebackWormBody", 53, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityMandragora.class, "mandragora", 54, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityTwins.class, "twins", 55, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerModEntity(EntityHungerHungry.class, "HungerHungry", 56, DivineRPG.instance, 120, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityHungerHungry.class, "HungerHungry", 56, 0x000000, 0xffffff);

        
	}
	public static void addEntities()
	{        
        EntityRegistry.addSpawn(EntityAlicanto.class, 2, 1, 10, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityAlicanto.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityFractite.class, 2, 1, 10, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityFractite.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityGlacide.class, 2, 1, 10, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityGlacide.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityHastreus.class, 2, 1, 10, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityHastreus.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityFrostArcher.class, 2, 1, 10, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityFrostArcher.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityRollum.class, 2, 1, 10, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        EntityRegistry.addSpawn(EntityRollum.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.IceikaMountains});
        
        
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.taiga});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.iceMountains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.taigaHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.taiga});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.iceMountains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.taigaHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityHellSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityScorcher.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityJungleSpider.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityJungleSpider.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.extremeHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.extremeHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.extremeHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityHellPig.class, 25, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityEnderWatcher.class, 10, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCadillion.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityBunny.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityTomo.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCori.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityNesro.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityNesro.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMadivel.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCori.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMadivel.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.serenityBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.azuriteBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityAzuriteTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.azuriteBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityAzuriteGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.azuriteBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityVerek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.azuriteBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMoonWolf.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.azuriteBiome});;
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyTomo.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEchantedWarrior.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEchantedWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityTwilightArcher.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityTwilightArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.energyBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilFiend.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilFiend.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilGolem.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilArcher.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityMythrilArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySamek.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySamek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCori2.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityCori2.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.mythilBiome});
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityDenseDemon.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityDenseDemon.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityBaslisk.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityBaslisk.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityDenseCadillion.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityDenseCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyArcher.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.twilight.EntityEnergyArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.denseBiome});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCrab.class, 15, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCrab.class, 15, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityKingCrab.class, 5, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityKingCrab.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityWhale.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityShark.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCaveCrawler.class, 20, 2, 3, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityDesertCrawler.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityAridWarrior.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityRotatick.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityJungleDramcryx.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityEnthralledDramcryx.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityTheEye.class, 7, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityEnderTriplets.class, 1, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityJungleBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(xolova.blued00r.divinerpg.entities.mobs.EntityCaveclops.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        
        EntityRegistry.addSpawn(EntityLivingStatue.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityDungeonPrisoner.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityRoamer.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityDeathcryx.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityDeathHound.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityRazorback.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityConstructor.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        
        EntityRegistry.addSpawn(EntityLeorna.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityDatticon.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityZelus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityVatticus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        EntityRegistry.addSpawn(EntityCaptianMerik.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DivineRPG.arcanaBiome});
        
        EntityRegistry.addSpawn(EntityEnderSpider.class, 2, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityEnderSpider.class, 2, 1, 4, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityRainbour.class, 2, 1, 1, EnumCreatureType.ambient, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});	
	}
}