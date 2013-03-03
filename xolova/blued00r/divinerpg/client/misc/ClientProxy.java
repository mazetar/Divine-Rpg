package xolova.blued00r.divinerpg.client.misc;

import java.io.IOException;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.client.models.*;
import xolova.blued00r.divinerpg.client.models.entites.mobs.boss.ModelParasecta;
import xolova.blued00r.divinerpg.client.models.entities.community.ModelRainbour;
import xolova.blued00r.divinerpg.client.models.entities.mobs.iceika.*;
import xolova.blued00r.divinerpg.client.render.blocks.*;
import xolova.blued00r.divinerpg.client.render.bosses.*;
import xolova.blued00r.divinerpg.client.render.entities.mobs.*;
import xolova.blued00r.divinerpg.client.render.entities.mobs.arcana.*;
import xolova.blued00r.divinerpg.client.render.entities.mobs.iceika.*;
import xolova.blued00r.divinerpg.client.render.entities.mobs.traders.*;
import xolova.blued00r.divinerpg.client.render.entities.mobs.twilight.*;
import xolova.blued00r.divinerpg.client.render.entities.projectiles.*;
import xolova.blued00r.divinerpg.client.render.entitites.mobs.RenderRainbour;
import xolova.blued00r.divinerpg.client.render.vethea.*;
import xolova.blued00r.divinerpg.entities.mobs.*;
import xolova.blued00r.divinerpg.entities.mobs.arcana.*;
import xolova.blued00r.divinerpg.entities.mobs.bosses.*;
import xolova.blued00r.divinerpg.entities.mobs.iceika.*;
import xolova.blued00r.divinerpg.entities.mobs.projectile.*;
import xolova.blued00r.divinerpg.entities.mobs.traders.*;
import xolova.blued00r.divinerpg.entities.mobs.twilight.*;
import xolova.blued00r.divinerpg.entities.mobs.vethea.*;
import xolova.blued00r.divinerpg.entities.projectile.*;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityFrostClaw;
import xolova.blued00r.divinerpg.entities.projectile.icieka.EntityFrostyMusic;
import xolova.blued00r.divinerpg.entities.tileentities.*;
import xolova.blued00r.divinerpg.entities.vethea.*;
import xolova.blued00r.divinerpg.misc.CommonProxy;
import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
    
    public void addAchievements()
    {    	
    }
    
    public int addArmor(String var1)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(var1);
    }

    public void registerTickHandlers()
    {
        super.registerTickHandlers();
        TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
    }

    public void renderRegistry()
    {
        MinecraftForgeClient.preloadTexture(DivineRPG.textureFile);
        MinecraftForgeClient.preloadTexture(DivineRPG.textureFile1);
        MinecraftForgeClient.preloadTexture(DivineRPG.textureFile2);
        MinecraftForgeClient.preloadTexture("/Xolovon4.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/augite_portal.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/azurite_portal.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/dravite_portal.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/mythril_portal.png");
        MinecraftForgeClient.preloadTexture("/DiviveRPG/tar_flowing.png");
        MinecraftForgeClient.preloadTexture("/DivinveRPG/uvite_portal.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/RainbowLight.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/ArcanaLamp.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/ArcaniumPower.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/LiviciaSword.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/ArcaniteTubes.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/DramixSpawn.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/CorruptedAxe.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/CorruptedPickaxe.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/CorruptedShovel.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/CorruptedMaul.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/DoomsBringer.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/LeafXmasLights.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/LiviciaSword.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/iceika_portal.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/RedXmasLights.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/GreenXmasLights.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/BlueXmasLights.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/YellowXmasLights.png");
        MinecraftForgeClient.preloadTexture("/DivineRPG/PurpleXmasLights.png");
        System.out.println("Trying to Load Animations");

        try
        {
            System.out.println("Animations did Load");
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/RedXmasLights.png", DivineRPG.redLights.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/GreenXmasLights.png", DivineRPG.greenLights.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/BlueXmasLights.png", DivineRPG.blueLights.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/YellowXmasLights.png", DivineRPG.yellowLights.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/PurpleXmasLights.png", DivineRPG.pinkLights.blockIndexInTexture));
            
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/iceika_portal.png", DivineRPG.iceikaPortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/dravite_portal.png", DivineRPG.twilightPortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/azurite_portal.png", DivineRPG.azuritePortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/uvite_portal.png", DivineRPG.energyPortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/mythril_portal.png", DivineRPG.mythrilPortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/augite_portal.png", DivineRPG.densePortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/RainbowLight.png", DivineRPG.draviteLamp.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX1("/DivineRPG/tar_flowing.png", 255));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX1("/DivineRPG/tar_flowing.png", 254));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX1("/DivineRPG/tar_flowing.png", 239));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX1("/DivineRPG/tar_flowing.png", 238));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX1("/DivineRPG/tar_flowing.png", 237));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/CorruptedAxe.png", 162));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/CorruptedPickaxe.png", 161));
            //TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/uvite_portal.png", DivineRPG.energyPortal.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/CorruptedShovel.png", 160));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/CorruptedMaul.png", 164));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/DoomsBringer.png", 163));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/ArcanaLamp.png", DivineRPG.dungeonLight.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/ArcaniumPower.png", DivineRPG.arcanaPower.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/ArcaniteTubes.png", DivineRPG.arcaniteTubes.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/LeafXmasLights.png", DivineRPG.lightLeaves.blockIndexInTexture));
            TextureFXManager.instance().addAnimation(new TextureAnimatedFX("/DivineRPG/LiviciaSword.png", 142));
        }
        catch (IOException var2)
        {
            System.err.println("Animations DIDN'T LOAD");
        }

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
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderBolt.class, new RenderEnderBolt());
        RenderingRegistry.registerEntityRenderingHandler(EntityPurpleFireball.class, new RenderPurpleFireball(91));
        RenderingRegistry.registerEntityRenderingHandler(EntityWatcherShot.class, new RenderPurpleFireball(91));
        RenderingRegistry.registerEntityRenderingHandler(EntityTripletProjectile.class, new RenderProjectile(31));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveRock.class, new RenderCaveRock(156));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellPig.class, new RenderHellPig(new ModelPig(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAncient.class, new RenderAncient(new ModelAncientEntity(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityArrow.class, new RenderSerenityArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArrow.class, new RenderEnergyArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityFuryArrow.class, new RenderFuryArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenitySlicer.class, new RenderSlicer(202));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteSlicer.class, new RenderSlicer(203));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergySlicer.class, new RenderSlicer(204));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilSlicer.class, new RenderSlicer(205));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseSlicer.class, new RenderSlicer(206));
        RenderingRegistry.registerEntityRenderingHandler(EntityUltimaSlicer.class, new RenderSlicer(252));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightSlicer.class, new RenderSlicer(144));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzSerenity.class, new RenderSlicer(154));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAzurite.class, new RenderSlicer(155));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzEnergy.class, new RenderSlicer(156));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMythril.class, new RenderSlicer(157));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzDense.class, new RenderSlicer(158));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzUltima.class, new RenderSlicer(253));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzTwilight.class, new RenderSlicer(145));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityPhaser.class, new RenderSlicer(213));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuritePhaser.class, new RenderSlicer(214));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyPhaser.class, new RenderSlicer(215));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilPhaser.class, new RenderSlicer(216));
        RenderingRegistry.registerEntityRenderingHandler(EntityDensePhaser.class, new RenderSlicer(217));
        RenderingRegistry.registerEntityRenderingHandler(EntityUltimaPhaser.class, new RenderSlicer(254));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightPhaser.class, new RenderSlicer(102));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzFury.class, new RenderSlicer(124));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnchorClaw.class, new RenderSlicer(72));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnchorBowHead.class, new RenderSlicer(72));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnchor.class, new RenderSlicer(73));
        RenderingRegistry.registerEntityRenderingHandler(EntityFirefly.class, new RenderBasicProjectile(0, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityStarfall.class, new RenderStarfall(1, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityFireThrower.class, new RenderBasicProjectile(31, "/terrain.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderArrow.class, new RenderEnderBolt());
        RenderingRegistry.registerEntityRenderingHandler(EntityCorruptShot.class, new RenderBasicProjectile(0, "/Xolovon.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderBasicProjectile(2, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityReflector.class, new RenderBasicProjectile(255, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderBasicProjectile(97, "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityMerikMissile.class, new RenderBasicProjectile(3, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderBasicProjectile(187, "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostClaw.class, new RenderBasicProjectile(187, "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostyMusic.class, new RenderMusicBall(8));
        RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveArrow.class, new RenderExplosiveArrow());
        
        RenderingRegistry.registerEntityRenderingHandler(xolova.blued00r.divinerpg.entities.projectile.EntityLamona.class, new RenderBasicProjectile(90, "/Xolovon3.png"));
        
        
        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderCadillion(new ModelCadillion(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityTomo.class, new RenderSerenityTomo(new ModelTomo(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityBunny.class, new RenderSerenityBunny(new ModelBunny(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderAngryBunny(new ModelAngryBunny(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderCori(new ModelCori(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderSlicer(73));
        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeterShot.class, new RenderSlicer(71));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrabCannon.class, new RenderSlicer(72));
        RenderingRegistry.registerEntityRenderingHandler(EntityBowCannon.class, new RenderSlicer(73));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderMadivel(new ModelMadivel(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderNesro(new ModelNesro(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteGolem.class, new RenderAzuriteGolem(new ModelTwilightGolem(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteTomo.class, new RenderAzuriteTomo(new ModelTomo(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderVerek(new ModelSamek(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderMoonWolf(new ModelMoonWolf(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyCadillion.class, new RenderEneregyCadillion(new ModelCadillion(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyTomo.class, new RenderEneregyTomo(new ModelTomo(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyGolem.class, new RenderEneregyGolem(new ModelTwilightGolem(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEchantedWarrior.class, new RenderEnchantedWarrior(new ModelEnchantedWarrior(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilArcher.class, new RenderTwilightArcher(new ModelTwilightArcher(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArcher.class, new RenderTwilightArcher(new ModelTwilightArcher(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderSamek(new ModelSamek(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilGolem.class, new RenderMythrilGolem(new ModelTwilightGolem(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori2.class, new RenderCori2(new ModelCori(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilFiend.class, new RenderMythrilFiend(new ModelMytrilFiend(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseCadillion.class, new RenderDenseCadillion(new ModelCadillion(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseDemon.class, new RenderDenseDemon(new ModelDenseDemon(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderBasalisk(new ModelBasalisk(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderSoulStealer(new ModelSoulStealer(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZichile.class, new RenderZichile(new ModelZichile(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDex.class, new RenderDex(new ModelZichile(), 0.0F, 4.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDensos(new ModelDensos(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderReyvor(new ModelDensos(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderTwilightDemon(new ModelTwilightDemon(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSoulFiend(new ModelSoulFiend(), 0.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderVamacheron(new ModelVamacheron(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderKarot(new ModelKarot(), 0.0F, 5.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeter.class, new RenderMamormeter(new ModelMamormeter(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderCrab(new ModelCrab(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderShark(new ModelShark(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(new ModelWhale(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderKingCrab(new ModelCrab(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderIceMan(new ModelIceMan(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBatWing.class, new RenderBatWing(141));
        RenderingRegistry.registerEntityRenderingHandler(EntityJackOMan.class, new RenderJackOMan());
        RenderingRegistry.registerEntityRenderingHandler(EntityRoamer.class, new RenderRoamer(new ModelRoamer(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathcryx.class, new RenderDeathcryx(new ModelDeathcryx(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathHound.class, new RenderDeathHound(new ModelDeathHound(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLeorna.class, new RenderLeorna(new ModelLeorna(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRazorback.class, new RenderRazorback(new ModelRazorback(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityConstructor.class, new RenderConstructor(new ModelDramix(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLivingStatue.class, new RenderBiped(new ModelBiped(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonPrisoner.class, new RenderDungeonPrisoner(new ModelDungeonPrisoner(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonDemon.class, new RenderDungeonDemon(new ModelDungeonDemon(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaptianMerik.class, new RenderMerik(new ModelSamek(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDatticon.class, new RenderDatticon(new ModelSamek(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVatticus.class, new RenderVatticus(new ModelBiped(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZelus.class, new RenderZelus(new ModelBiped(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFyracryx.class, new RenderFyracryx(new ModelDeathcryx(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityParatiku.class, new RenderParatiku(new ModelParatiku(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGolemOfRejuv.class, new RenderGolemOfRejuv(new ModelTwilightGolem(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeimer.class, new RenderSeimer(new ModelSeimer(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, new RenderWraith(new ModelWraith(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderCaveCrawler(new ModelCrawler(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderAridWarrior(new ModelAridWarrior(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderJungleDramcryx(new ModelDramcryx(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnthralledDramcryx.class, new RenderEnthralledDramcryx(new ModelDramcryx(), 1.5F, 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderTheEye(new ModelEye(), 0.0F));
        //RenderingRegistry.registerEntityRenderingHandler(EntityEnderWelplings.class, new RenderEnderWelplings());
        RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDesertCrawler(new ModelCrawler(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderRotatick(new ModelRotatick(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleBat.class, new RenderJungleBat());
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderEnderTriplets(new ModelEnderTriplets(), 1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveclops.class, new RenderCaveclops(new ModelBiped(), 1.5F, 1.5F));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityDramix.class, new RenderDramix(new ModelDramix(), 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityParasecta.class, new RenderParasecta(new ModelParasecta(), 1.0F, 1.0F));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityAlicanto.class, new RenderAlicanto(new ModelAlicanto(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderFractite(new ModelFractite(), 2.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlacide.class, new RenderGlacide(new ModelGlacide(), 0.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHastreus.class, new RenderHastreus(new ModelHastreus(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostArcher.class, new RenderFrostArcher(new ModelBiped(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRollum.class, new RenderRollum(new ModelRollum(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopTickerer.class, new RenderWorkshopTickerer(new ModelWorkshop(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopMerchant.class, new RenderWorkshopMerchant(new ModelWorkshop(), 0.0F));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderRainbour(new ModelRainbour(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderEnderSpider(new ModelSpider(), 0.5F, 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderWilfFire(new ModelWildFire(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGrue.class, new RenderGrue(new ModelWildFire(), 0.0F));
        
        /*
         * 1.3 Mobs
         */
        
        RenderingRegistry.registerEntityRenderingHandler(EntityVermenous.class, new RenderVermenous(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnt.class, new RenderEnt(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCymesoid.class, new RenderCymesoid(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDreamwrecker.class, new RenderDreamwrecker(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderTocaxin(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityShadahier.class, new RenderShadahier(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAcidHag.class, new RenderAcidHag(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKazrotic.class, new RenderKazrotic(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHelio.class, new RenderHelio(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgosion.class, new RenderGorgosion(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHoverStinger.class, new RenderHoverStinger(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZone.class, new RenderZone(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZoragon.class, new RenderZoragon(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDissiment.class, new RenderDissiment(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinebackWorm.class, new RenderSpinebackWorm(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVhraak.class, new RenderVhraak(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGalroid.class, new RenderGalroid(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLadyLuna.class, new RenderLadyLuna(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBohemite.class, new RenderBohemite(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreck.class, new RenderWreck(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBiphron.class, new RenderBiphron(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHiveQueen.class, new RenderHiveQueen(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHiveSoldier.class, new RenderHiveSoldier(new ModelWildFire(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderLheiva(new ModelWildFire(), 0.0F));
        
        /*
         * 1.3 Projectiles
         */
        
        RenderingRegistry.registerEntityRenderingHandler(EntityKazroticShot.class, new RenderBasicProjectile(5, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityZoragonBomb.class, new RenderBasicProjectile(6, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityDissimentShot.class, new RenderBasicProjectile(7, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityTeakerDisk.class, new RenderBasicProjectile(DivineRPG.teakerDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityAmthirmisDisk.class, new RenderBasicProjectile(DivineRPG.amthrimisDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityDarvenDisk.class, new RenderBasicProjectile(DivineRPG.darvenDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityCermileDisk.class, new RenderBasicProjectile(DivineRPG.cermileDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityPardimalDisk.class, new RenderBasicProjectile(DivineRPG.pardimalDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuadroticDisk.class, new RenderBasicProjectile(DivineRPG.quadroticDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarosDisk.class, new RenderBasicProjectile(DivineRPG.karosDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityHeliosisDisk.class, new RenderBasicProjectile(DivineRPG.heliosisDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityArksianeDisk.class, new RenderBasicProjectile(DivineRPG.arksianeDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanCannonShot.class, new RenderBasicProjectile(4, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanArrow.class, new RenderBasicArrow("/item/TeakerArrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanArrow2.class, new RenderBasicArrow("/item/darvenArrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanWarArrow.class, new RenderBasicArrow("/item/pardimalArrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanWrathArrow.class, new RenderBasicArrow("/item/karosArrow.png"));
        
        /*
         * Render Block info
         */
        //DivineRPG.dramixAltarrenderId = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.registerTileEntity(TileEntityDramixAlter.class, "DramixAltar", new RenderDramixAlter());
        ClientRegistry.registerTileEntity(TileEntityExtractinator.class, "Extractin", new RenderExtractor());
        ClientRegistry.registerTileEntity(TileEntityPheonixAltar.class, "Pheonix Altar", new RenderPheonixAltar());
        ClientRegistry.registerTileEntity(TileEntityAyeracoBeamBlue.class, "Ayeraco Beam Blue", new RenderAyeracoBeamBlue());
        ClientRegistry.registerTileEntity(TileEntityAyeracoBeamGreen.class, "Ayeraco Beam Green", new RenderAyeracoBeamGreen());
        ClientRegistry.registerTileEntity(TileEntityAyeracoBeamRed.class, "Ayeraco Beam Red", new RenderAyeracoBeamRed());
        ClientRegistry.registerTileEntity(TileEntityAyeracoBeamYellow.class, "Ayeraco Beam Yellow", new RenderAyeracoBeamYellow());
        ClientRegistry.registerTileEntity(TileEntityAyeracoBeamPurple.class, "Ayeraco Beam Purple", new RenderAyeracoBeamPurple());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.dramixAlter.blockID, new RenderItemDramixAltar());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.pheonixAlter.blockID, new RenderItemPheonixAltar());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.extractinator.blockID, new RenderItemExtractor());
        ClientRegistry.registerTileEntity(TileEntityDemonFurnace.class, "demonFurnace", new RenderDemonFurnace());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.demonFurnace.blockID, new RenderItemDemonFurnace());
        ClientRegistry.registerTileEntity(TileEntityAEStatue.class, "AE Statue", new RenderAEStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.AEStatue.blockID, new RenderItemAEStatue());
        ClientRegistry.registerTileEntity(TileEntityAyeracoStatue.class, "Ayeraco Statue", new RenderAyeracoStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.AyeracoStatue.blockID, new RenderItemAyeracoStatue());
        ClientRegistry.registerTileEntity(TileEntityKOSStatue.class, "KOS Statue", new RenderKOSStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.KOSStatue.blockID, new RenderItemKOSStatue());
        ClientRegistry.registerTileEntity(TileEntityDAZStatue.class, "DAZ Statue", new RenderDAZStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.DAZStatue.blockID, new RenderItemDAZStatue());
        ClientRegistry.registerTileEntity(TileEntityDensosStatue.class, "Densos Statue", new RenderDensosStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.DensosStatue.blockID, new RenderItemDensosStatue());
        ClientRegistry.registerTileEntity(TileEntityReyvorStatue.class, "Reyvor Statue", new RenderReyvorStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.ReyvorStatue.blockID, new RenderItemReyvorStatue());
        ClientRegistry.registerTileEntity(TileEntitySFStatue.class, "SF Statue", new RenderSFStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.SFStatue.blockID, new RenderItemSFStatue());
        ClientRegistry.registerTileEntity(TileEntityTDStatue.class, "TD Statue", new RenderTDStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.TDStatue.blockID, new RenderItemTDStatue());
        ClientRegistry.registerTileEntity(TileEntityVamacheronStatue.class, "Vamacheron Statue", new RenderVamacheronStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.VamacheronStatue.blockID, new RenderItemVamacheronStatue());
        ClientRegistry.registerTileEntity(TileEntityWatcherStatue.class, "Watcher Statue", new RenderWatcherStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.WatcherStatue.blockID, new RenderItemWatcherStatue());
        ClientRegistry.registerTileEntity(TileEntityParasectaStatue.class, "Parasecta Statue", new RenderParasectaStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.ParasectaStatue.blockID, new RenderItemParasectaStatue());
        ClientRegistry.registerTileEntity(TileEntityDramixStatue.class, "Dramix Statue", new RenderDramixStatue());
        MinecraftForgeClient.registerItemRenderer(DivineRPG.DramixStatue.blockID, new RenderItemDramixStatue());
    }

    @Override
    public void soundRegistry()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
        //MinecraftForge.EVENT_BUS.register(new BiomeSoundHandler());
    }
}
