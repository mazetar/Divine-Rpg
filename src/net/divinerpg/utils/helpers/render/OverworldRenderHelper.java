package net.divinerpg.utils.helpers.render;

import net.divinerpg.entities.bosses.EntityAyeracoBlue;
import net.divinerpg.entities.bosses.EntityAyeracoGreen;
import net.divinerpg.entities.bosses.EntityAyeracoPurple;
import net.divinerpg.entities.bosses.EntityAyeracoRed;
import net.divinerpg.entities.bosses.EntityAyeracoYellow;
import net.divinerpg.entities.overworld.mobs.EntityAncient;
import net.divinerpg.entities.overworld.mobs.EntityAridWarrior;
import net.divinerpg.entities.overworld.mobs.EntityCaveCrawler;
import net.divinerpg.entities.overworld.mobs.EntityCaveclops;
import net.divinerpg.entities.overworld.mobs.EntityCrab;
import net.divinerpg.entities.overworld.mobs.EntityCyclops;
import net.divinerpg.entities.overworld.mobs.EntityDesertCrawler;
import net.divinerpg.entities.overworld.mobs.EntityEnderSpider;
import net.divinerpg.entities.overworld.mobs.EntityEnderTriplets;
import net.divinerpg.entities.overworld.mobs.EntityEnderWatcher;
import net.divinerpg.entities.overworld.mobs.EntityEnthralledDramcryx;
import net.divinerpg.entities.overworld.mobs.EntityFrost;
import net.divinerpg.entities.overworld.mobs.EntityHellPig;
import net.divinerpg.entities.overworld.mobs.EntityHellSpider;
import net.divinerpg.entities.overworld.mobs.EntityIceMan;
import net.divinerpg.entities.overworld.mobs.EntityJackOMan;
import net.divinerpg.entities.overworld.mobs.EntityJungleBat;
import net.divinerpg.entities.overworld.mobs.EntityJungleDramcryx;
import net.divinerpg.entities.overworld.mobs.EntityJungleSpider;
import net.divinerpg.entities.overworld.mobs.EntityKingCrab;
import net.divinerpg.entities.overworld.mobs.EntityMamormeter;
import net.divinerpg.entities.overworld.mobs.EntityMiner;
import net.divinerpg.entities.overworld.mobs.EntityNetherWatcher;
import net.divinerpg.entities.overworld.mobs.EntityRainbour;
import net.divinerpg.entities.overworld.mobs.EntityRotatick;
import net.divinerpg.entities.overworld.mobs.EntityScorcher;
import net.divinerpg.entities.overworld.mobs.EntityShark;
import net.divinerpg.entities.overworld.mobs.EntityTheEye;
import net.divinerpg.entities.overworld.mobs.EntityWhale;
import net.divinerpg.entities.overworld.mobs.EntityWildFire;
import net.divinerpg.entities.overworld.projectile.EntityAnchor;
import net.divinerpg.entities.overworld.projectile.EntityBatWing;
import net.divinerpg.entities.overworld.projectile.EntityBlueFireBall;
import net.divinerpg.entities.overworld.projectile.EntityBowCannon;
import net.divinerpg.entities.overworld.projectile.EntityCaveRock;
import net.divinerpg.entities.overworld.projectile.EntityCorruptShot;
import net.divinerpg.entities.overworld.projectile.EntityCrabCannon;
import net.divinerpg.entities.overworld.projectile.EntityDeathSeranade;
import net.divinerpg.entities.overworld.projectile.EntityEnderArrow;
import net.divinerpg.entities.overworld.projectile.EntityEnderBolt;
import net.divinerpg.entities.overworld.projectile.EntityExplosiveArrow;
import net.divinerpg.entities.overworld.projectile.EntityFireArrow;
import net.divinerpg.entities.overworld.projectile.EntityFrostShard;
import net.divinerpg.entities.overworld.projectile.EntityGhastTear;
import net.divinerpg.entities.overworld.projectile.EntityMamormeterShot;
import net.divinerpg.entities.overworld.projectile.EntityMusicBall;
import net.divinerpg.entities.overworld.projectile.EntityPoisonArrow;
import net.divinerpg.entities.overworld.projectile.EntityPurpleFireball;
import net.divinerpg.entities.overworld.projectile.EntityShuriken;
import net.divinerpg.entities.overworld.projectile.EntityStromBall;
import net.divinerpg.entities.overworld.projectile.EntityTripletProjectile;
import net.divinerpg.entities.overworld.projectile.EntityVailStorm;
import net.divinerpg.entities.overworld.projectile.EntityWatcherShot;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.models.overworld.mobs.ModelAncientEntity;
import net.divinerpg.models.overworld.mobs.ModelAridWarrior;
import net.divinerpg.models.overworld.mobs.ModelAyeraco;
import net.divinerpg.models.overworld.mobs.ModelCrab;
import net.divinerpg.models.overworld.mobs.ModelCrawler;
import net.divinerpg.models.overworld.mobs.ModelDramcryx;
import net.divinerpg.models.overworld.mobs.ModelEnderTriplets;
import net.divinerpg.models.overworld.mobs.ModelEye;
import net.divinerpg.models.overworld.mobs.ModelFrost;
import net.divinerpg.models.overworld.mobs.ModelHellSpider;
import net.divinerpg.models.overworld.mobs.ModelIceMan;
import net.divinerpg.models.overworld.mobs.ModelJungleSpider;
import net.divinerpg.models.overworld.mobs.ModelMamormeter;
import net.divinerpg.models.overworld.mobs.ModelRainbour;
import net.divinerpg.models.overworld.mobs.ModelRotatick;
import net.divinerpg.models.overworld.mobs.ModelScorcher;
import net.divinerpg.models.overworld.mobs.ModelShark;
import net.divinerpg.models.overworld.mobs.ModelWatcher;
import net.divinerpg.models.overworld.mobs.ModelWhale;
import net.divinerpg.models.overworld.mobs.ModelWildFire;
import net.divinerpg.renders.RenderBasicArrow;
import net.divinerpg.renders.RenderBasicProjectile;
import net.divinerpg.renders.RenderDivineDisc;
import net.divinerpg.renders.RenderDivineEntity;
import net.divinerpg.renders.RenderIconProjectile;
import net.divinerpg.renders.overworld.mob.RenderAridWarrior;
import net.divinerpg.renders.overworld.mob.RenderAyeraco;
import net.divinerpg.renders.overworld.mob.RenderJackOMan;
import net.divinerpg.renders.overworld.mob.RenderJungleBat;
import net.divinerpg.renders.overworld.mob.RenderMamormeter;
import net.divinerpg.renders.overworld.mob.RenderNetherWatcher;
import net.divinerpg.renders.overworld.mob.RenderUndeadMiner;
import net.divinerpg.renders.overworld.mob.RenderWilfFire;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.model.ModelZombie;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class OverworldRenderHelper 
{
	public static void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityShuriken.class, new RenderIconProjectile(EntityResourceLocs.SHURIKEN)); 
        RenderingRegistry.registerEntityRenderingHandler(EntityStromBall.class, new RenderIconProjectile(EntityResourceLocs.STROM_BALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityMusicBall.class, new RenderIconProjectile(EntityResourceLocs.MUSIC_BALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityGhastTear.class, new RenderIconProjectile(EntityResourceLocs.GHAST_TEAR));
        RenderingRegistry.registerEntityRenderingHandler(EntityVailStorm.class, new RenderIconProjectile(EntityResourceLocs.VAIL_STORM));
        RenderingRegistry.registerEntityRenderingHandler(EntityStromBall.class, new RenderIconProjectile(EntityResourceLocs.STROMBALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityMusicBall.class, new RenderIconProjectile(EntityResourceLocs.MUSIC_BALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityGhastTear.class, new RenderIconProjectile(EntityResourceLocs.GHAST_TEAR));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostShard.class, new RenderIconProjectile(EntityResourceLocs.FROST_SHARD));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlueFireBall.class, new RenderIconProjectile(EntityResourceLocs.BLUE_FIREBALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveRock.class, new RenderIconProjectile(EntityResourceLocs.CAVE_ROCK));
        RenderingRegistry.registerEntityRenderingHandler(EntityPurpleFireball.class, new RenderIconProjectile(EntityResourceLocs.PURPLE_FIREBALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityWatcherShot.class, new RenderIconProjectile(EntityResourceLocs.PURPLE_FIREBALL));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityPoisonArrow.class, new RenderBasicArrow(EntityResourceLocs.ARROWS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFireArrow.class, new RenderBasicArrow(EntityResourceLocs.FIRE_ARROW));
        RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveArrow.class, new RenderBasicArrow(EntityResourceLocs.BLUE_FIRE_ARROW));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderArrow.class, new RenderBasicArrow(EntityResourceLocs.ENDER_BOLT));
        RenderingRegistry.registerEntityRenderingHandler(EntityCorruptShot.class, new RenderBasicProjectile(EntityResourceLocs.CORRUPT_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderBolt.class, new RenderBasicArrow(EntityResourceLocs.ENDER_BOLT));
        RenderingRegistry.registerEntityRenderingHandler(EntityTripletProjectile.class, new RenderBasicProjectile(EntityResourceLocs.TIRPLET_PROJECTILE));
        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeterShot.class, new RenderBasicArrow(EntityResourceLocs.MAMORMETER_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathSeranade.class, new RenderBasicProjectile(EntityResourceLocs.DEATH_SERENADE));

        RenderingRegistry.registerEntityRenderingHandler(EntityCrabCannon.class, new RenderDivineDisc(OverworldItemHelper.crabClawCannon));
        RenderingRegistry.registerEntityRenderingHandler(EntityBowCannon.class, new RenderDivineDisc(OverworldItemHelper.bowheadCannon));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnchor.class, new RenderDivineDisc(OverworldItemHelper.bowHeadAnchor));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderDivineEntity(new ModelFrost(), 0.0F, EntityResourceLocs.FROST));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleSpider.class, new RenderDivineEntity(new ModelJungleSpider(), 0.0F, EntityResourceLocs.JUNGLE_SPIDER));
        RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderDivineEntity(new ModelScorcher(), 0.0F, 2.0F, EntityResourceLocs.SCORCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderDivineEntity(new ModelHellSpider(), 0.0F, EntityResourceLocs.HELL_SPIDER));
        RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderDivineEntity(new ModelBiped(), 0.0F, 2.0F, EntityResourceLocs.CYCLOPS));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderDivineEntity(new ModelWatcher(), 0.0F, EntityResourceLocs.ENDER_WATCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellPig.class, new RenderDivineEntity(new ModelPig(), 0.0F, EntityResourceLocs.HELL_PIG));
        RenderingRegistry.registerEntityRenderingHandler(EntityAncient.class, new RenderDivineEntity(new ModelAncientEntity(), 0.0F, 3.0F, EntityResourceLocs.ANCIENT_ENTITY));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderDivineEntity(new ModelCrab(), 0.0F, EntityResourceLocs.CRAB));
        RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderDivineEntity(new ModelShark(), 0.0F, EntityResourceLocs.SHARK));
        RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderDivineEntity(new ModelWhale(), 0.0F, 3.0F, EntityResourceLocs.WHALE));
        RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderDivineEntity(new ModelCrab(), 0.0F, 2.0F, EntityResourceLocs.KING_CRAB));
        RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderDivineEntity(new ModelIceMan(), 0.0F, EntityResourceLocs.ICE_MAN));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderDivineEntity(new ModelCrawler(), 0.0F, EntityResourceLocs.CAVE_CRAWLER));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderDivineEntity(new ModelDramcryx(), 0.0F, EntityResourceLocs.DRAMCRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnthralledDramcryx.class, new RenderDivineEntity(new ModelDramcryx(), 1.5F, 1.5F, EntityResourceLocs.DRAMCRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderDivineEntity(new ModelEye(), 0.0F, EntityResourceLocs.THE_EYE));
        RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDivineEntity(new ModelCrawler(), 0.0F, EntityResourceLocs.DESERT_CRAWLER));
        RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderDivineEntity(new ModelRotatick(), 0.0F, EntityResourceLocs.ROTATICK));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderDivineEntity(new ModelEnderTriplets(), 1.5F, EntityResourceLocs.ENDER_TRIPLETS));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveclops.class, new RenderDivineEntity(new ModelBiped(), 1.5F, 1.5F, EntityResourceLocs.CAVE_CLOPS));
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderDivineEntity(new ModelRainbour(), 0.0F, EntityResourceLocs.RAINBOUR));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderDivineEntity(new ModelSpider(), 0.5F, 0.5F, EntityResourceLocs.ENDER_SPIDER));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityBatWing.class, new RenderIconProjectile(EntityResourceLocs.BAT_WING));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new RenderUndeadMiner(new ModelZombie(), 0.0F, EntityResourceLocs.UNDEAD_MINER));

        RenderingRegistry.registerEntityRenderingHandler(EntityJungleBat.class, new RenderJungleBat(EntityResourceLocs.JUNGLE_BAT));
        RenderingRegistry.registerEntityRenderingHandler(EntityJackOMan.class, new RenderJackOMan()); 
        RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderAridWarrior(new ModelAridWarrior(), 0.0F, EntityResourceLocs.ARID_WARRIOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderWilfFire(new ModelWildFire(), 0.0F, 3.0F, EntityResourceLocs.WILDFIRE));

        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_YELLOW));  // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_GREEN));   // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_BLUE));    // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_RED));     // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_PURPLE));  // BOSS
        
        RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderNetherWatcher(new ModelWatcher(), 0.0F, 5.0F, EntityResourceLocs.NETHER_WATCHER)); // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeter.class, new RenderMamormeter(new ModelMamormeter(), 0.0F, 2.0F, EntityResourceLocs.MAMORMETER)); // BOSS
	
	}
}
