package xolova.divinerpg.utils.helpers.render;

import xolova.divinerpg.entities.bosses.*;
import xolova.divinerpg.entities.twilight.mobs.*;
import xolova.divinerpg.entities.twilight.projectile.*;
import xolova.divinerpg.models.twilight.mobs.*;
import xolova.divinerpg.renders.RenderBasicArrow;
import xolova.divinerpg.renders.twilight.mob.*;
import xolova.divinerpg.renders.twilight.projectile.RenderSlicer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TwilightRenderHelper 
{
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityArrow.class, new RenderBasicArrow("/item/azuriteArrow"));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArrow.class, new RenderBasicArrow("/item/mythrilArrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityFuryArrow.class, new RenderBasicArrow("/item/furyArrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerDravite.class, new RenderSlicer(202));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAzurite.class, new RenderSlicer(203));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerUvite.class, new RenderSlicer(204));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMythril.class, new RenderSlicer(205));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAugite.class, new RenderSlicer(206));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderSlicer(252));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzDravite.class, new RenderSlicer(154));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAzurite.class, new RenderSlicer(155));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzUvite.class, new RenderSlicer(156));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMythril.class, new RenderSlicer(157));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAugite.class, new RenderSlicer(158));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderSlicer(253));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserDravite.class, new RenderSlicer(213));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAzurite.class, new RenderSlicer(214));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserUvite.class, new RenderSlicer(215));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMythril.class, new RenderSlicer(216));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAugite.class, new RenderSlicer(217));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderSlicer(254));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzFury.class, new RenderSlicer(124));

        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderCadillion(new ModelCadillion(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityTomo.class, new RenderSerenityTomo(new ModelTomo(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityBunny.class, new RenderSerenityBunny(new ModelBunny(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderAngryBunny(new ModelAngryBunny(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderCori(new ModelCori(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderSlicer(73));
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
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDensos(new ModelDensos(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderReyvor(new ModelDensos(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderTwilightDemon(new ModelTwilightDemon(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSoulFiend(new ModelSoulFiend(), 0.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderVamacheron(new ModelVamacheron(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderKarot(new ModelKarot(), 0.0F, 5.0F));
	}
}
