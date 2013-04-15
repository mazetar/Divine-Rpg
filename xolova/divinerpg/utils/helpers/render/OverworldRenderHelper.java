package xolova.divinerpg.utils.helpers.render;

import net.minecraft.client.model.*;
import xolova.divinerpg.entities.bosses.*;
import xolova.divinerpg.entities.overworld.mobs.*;
import xolova.divinerpg.entities.overworld.projectile.*;
import xolova.divinerpg.models.overworld.mobs.*;
import xolova.divinerpg.renders.RenderBasicArrow;
import xolova.divinerpg.renders.RenderBasicProjectile;
import xolova.divinerpg.renders.overworld.mob.*;
import xolova.divinerpg.renders.overworld.projectile.*;
import xolova.divinerpg.renders.twilight.projectile.RenderSlicer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class OverworldRenderHelper 
{
	public static void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityShuriken.class, new RenderShuiken(0));
        RenderingRegistry.registerEntityRenderingHandler(EntityVailStorm.class, new RenderVailStorm(10));
        RenderingRegistry.registerEntityRenderingHandler(EntityPoisonArrow.class, new RenderPoisonArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityFireArrow.class, new RenderFireArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveArrow.class, new RenderExplosiveArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityStromBall.class, new RenderStromBall(2));
        RenderingRegistry.registerEntityRenderingHandler(EntityMusicBall.class, new RenderMusicBall(8));
        RenderingRegistry.registerEntityRenderingHandler(EntityGhastTear.class, new RenderGhastTear(3));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostShard.class, new RenderFrostShard(37));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathSeranade.class, new RenderDeathSeranade(55));
        RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new RenderUndeadMiner(new ModelZombie(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderFrost(new ModelFrost(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleSpider.class, new RenderJungleSpider(new ModelJungleSpider(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderScorcher(new ModelScorcher(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderHellSpider(new ModelHellSpider(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlueFireBall.class, new RenderBlueFireBall(92));
        RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderNetherWatcher(new ModelWatcher(), 0.0F, 5.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderCyclops(new ModelBiped(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderEnderWatcher(new ModelWatcher(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderBolt.class, new RenderBasicArrow("/item/Enderbolt.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityPurpleFireball.class, new RenderPurpleFireball(91));
        RenderingRegistry.registerEntityRenderingHandler(EntityWatcherShot.class, new RenderPurpleFireball(91));
        RenderingRegistry.registerEntityRenderingHandler(EntityTripletProjectile.class, new RenderBasicProjectile(31, "/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveRock.class, new RenderCaveRock(156));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellPig.class, new RenderHellPig(new ModelPig(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAncient.class, new RenderAncient(new ModelAncientEntity(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrabCannon.class, new RenderSlicer(72));
        RenderingRegistry.registerEntityRenderingHandler(EntityBowCannon.class, new RenderSlicer(72));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnchor.class, new RenderSlicer(73));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderArrow.class, new RenderBasicArrow("/item/Enderbolt.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityCorruptShot.class, new RenderBasicProjectile(0, "/Xolovon.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeterShot.class, new RenderSlicer(71));
        

        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeter.class, new RenderMamormeter(new ModelMamormeter(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderCrab(new ModelCrab(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderShark(new ModelShark(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(new ModelWhale(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderKingCrab(new ModelCrab(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderIceMan(new ModelIceMan(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBatWing.class, new RenderBatWing(141));
        RenderingRegistry.registerEntityRenderingHandler(EntityJackOMan.class, new RenderJackOMan());
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderCaveCrawler(new ModelCrawler(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderAridWarrior(new ModelAridWarrior(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderJungleDramcryx(new ModelDramcryx(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnthralledDramcryx.class, new RenderEnthralledDramcryx(new ModelDramcryx(), 1.5F, 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderTheEye(new ModelEye(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDesertCrawler(new ModelCrawler(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderRotatick(new ModelRotatick(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleBat.class, new RenderJungleBat());
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderEnderTriplets(new ModelEnderTriplets(), 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveclops.class, new RenderCaveclops(new ModelBiped(), 1.5F, 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderRainbour(new ModelRainbour(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderEnderSpider(new ModelSpider(), 0.5F, 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderWilfFire(new ModelWildFire(), 0.0F, 3.0F));
	}
}
