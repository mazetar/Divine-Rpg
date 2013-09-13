package net.divinerpg.utils.helpers.render;

import net.divinerpg.client.models.twilight.mobs.ModelAngryBunny;
import net.divinerpg.client.models.twilight.mobs.ModelBasalisk;
import net.divinerpg.client.models.twilight.mobs.ModelBunny;
import net.divinerpg.client.models.twilight.mobs.ModelCadillion;
import net.divinerpg.client.models.twilight.mobs.ModelCori;
import net.divinerpg.client.models.twilight.mobs.ModelDenseDemon;
import net.divinerpg.client.models.twilight.mobs.ModelDensos;
import net.divinerpg.client.models.twilight.mobs.ModelEnchantedArcher;
import net.divinerpg.client.models.twilight.mobs.ModelEnchantedWarrior;
import net.divinerpg.client.models.twilight.mobs.ModelKarot;
import net.divinerpg.client.models.twilight.mobs.ModelMadivel;
import net.divinerpg.client.models.twilight.mobs.ModelMoonWolf;
import net.divinerpg.client.models.twilight.mobs.ModelMytrilFiend;
import net.divinerpg.client.models.twilight.mobs.ModelNesro;
import net.divinerpg.client.models.twilight.mobs.ModelSamek;
import net.divinerpg.client.models.twilight.mobs.ModelSoulFiend;
import net.divinerpg.client.models.twilight.mobs.ModelSoulStealer;
import net.divinerpg.client.models.twilight.mobs.ModelTomo;
import net.divinerpg.client.models.twilight.mobs.ModelTwilightArcher;
import net.divinerpg.client.models.twilight.mobs.ModelTwilightDemon;
import net.divinerpg.client.models.twilight.mobs.ModelTwilightGolem;
import net.divinerpg.client.models.twilight.mobs.ModelVamacheron;
import net.divinerpg.client.renders.RenderBasicArrow;
import net.divinerpg.client.renders.RenderBasicProjectile;
import net.divinerpg.client.renders.RenderDivineDisc;
import net.divinerpg.client.renders.RenderDivineEntity;
import net.divinerpg.client.renders.twilight.mob.RenderDensos;
import net.divinerpg.client.renders.twilight.mob.RenderEnchantedArcher;
import net.divinerpg.client.renders.twilight.mob.RenderEnchantedWarrior;
import net.divinerpg.client.renders.twilight.mob.RenderKarot;
import net.divinerpg.client.renders.twilight.mob.RenderReyvor;
import net.divinerpg.client.renders.twilight.mob.RenderSoulFiend;
import net.divinerpg.client.renders.twilight.mob.RenderTwilightArcher;
import net.divinerpg.client.renders.twilight.mob.RenderTwilightDemon;
import net.divinerpg.client.renders.twilight.mob.RenderVamacheron;
import net.divinerpg.entities.bosses.EntityDensos;
import net.divinerpg.entities.bosses.EntityKarot;
import net.divinerpg.entities.bosses.EntityReyvor;
import net.divinerpg.entities.bosses.EntitySoulFiend;
import net.divinerpg.entities.bosses.EntityTwilightDemon;
import net.divinerpg.entities.bosses.EntityVamacheron;
import net.divinerpg.entities.twilight.mobs.EntityAngryBunny;
import net.divinerpg.entities.twilight.mobs.EntityAzuriteGolem;
import net.divinerpg.entities.twilight.mobs.EntityAzuriteTomo;
import net.divinerpg.entities.twilight.mobs.EntityBaslisk;
import net.divinerpg.entities.twilight.mobs.EntityCadillion;
import net.divinerpg.entities.twilight.mobs.EntityCori;
import net.divinerpg.entities.twilight.mobs.EntityCori2;
import net.divinerpg.entities.twilight.mobs.EntityDenseCadillion;
import net.divinerpg.entities.twilight.mobs.EntityDenseDemon;
import net.divinerpg.entities.twilight.mobs.EntityEchantedWarrior;
import net.divinerpg.entities.twilight.mobs.EntityEnergyArcher;
import net.divinerpg.entities.twilight.mobs.EntityEnergyCadillion;
import net.divinerpg.entities.twilight.mobs.EntityEnergyGolem;
import net.divinerpg.entities.twilight.mobs.EntityEnergyTomo;
import net.divinerpg.entities.twilight.mobs.EntityMadivel;
import net.divinerpg.entities.twilight.mobs.EntityMoonWolf;
import net.divinerpg.entities.twilight.mobs.EntityMythrilArcher;
import net.divinerpg.entities.twilight.mobs.EntityMythrilFiend;
import net.divinerpg.entities.twilight.mobs.EntityMythrilGolem;
import net.divinerpg.entities.twilight.mobs.EntityNesro;
import net.divinerpg.entities.twilight.mobs.EntitySamek;
import net.divinerpg.entities.twilight.mobs.EntitySerenityBunny;
import net.divinerpg.entities.twilight.mobs.EntitySerenityTomo;
import net.divinerpg.entities.twilight.mobs.EntitySoulStealer;
import net.divinerpg.entities.twilight.mobs.EntityTwilightArcher;
import net.divinerpg.entities.twilight.mobs.EntityVerek;
import net.divinerpg.entities.twilight.projectile.EntityBlitzAugite;
import net.divinerpg.entities.twilight.projectile.EntityBlitzAzurite;
import net.divinerpg.entities.twilight.projectile.EntityBlitzDravite;
import net.divinerpg.entities.twilight.projectile.EntityBlitz;
import net.divinerpg.entities.twilight.projectile.EntityBlitzMythril;
import net.divinerpg.entities.twilight.projectile.EntityBlitzUvite;
import net.divinerpg.entities.twilight.projectile.EntityCoriShot;
import net.divinerpg.entities.twilight.projectile.EntityEnergyArrow;
import net.divinerpg.entities.twilight.projectile.EntityFuryArrow;
import net.divinerpg.entities.twilight.projectile.EntityPhaserAugite;
import net.divinerpg.entities.twilight.projectile.EntityPhaserAzurite;
import net.divinerpg.entities.twilight.projectile.EntityPhaserDravite;
import net.divinerpg.entities.twilight.projectile.EntityPhaserHalite;
import net.divinerpg.entities.twilight.projectile.EntityPhaserMythril;
import net.divinerpg.entities.twilight.projectile.EntityPhaserUvite;
import net.divinerpg.entities.twilight.projectile.EntitySerenityArrow;
import net.divinerpg.entities.twilight.projectile.EntitySlicer;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TwilightRenderHelper 
{
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityArrow.class, new RenderBasicArrow(new ResourceLocation("DivineRPG:azuriteArrow")));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArrow.class, new RenderBasicArrow(new ResourceLocation("DivineRPG:mythrilArrow.png")));
        RenderingRegistry.registerEntityRenderingHandler(EntityFuryArrow.class, new RenderBasicArrow(new ResourceLocation("DivineRPG:furyArrow.png")));
        

        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderDivineDisc(TwilightItemHelper.DraviteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderDivineDisc(TwilightItemHelper.AzuriteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderDivineDisc(TwilightItemHelper.UviteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderDivineDisc(TwilightItemHelper.MythrilSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderDivineDisc(TwilightItemHelper.AugiteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderDivineDisc(TwilightItemHelper.HaliteSlicer));

        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzDravite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_DRAVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAzurite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_AZURITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzUvite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_UVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMythril.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_MYTHRIL));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAugite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_AUGITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitz.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_HALITE));

        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserDravite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_DRAVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAugite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_AUGITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserUvite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_UVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMythril.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_MYTHRIL));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAzurite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_AZURITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_HALITE));
        
        //RenderingRegistry.registerEntityRenderingHandler(EntityBlitzFury.class, new RenderSlicer(124)); TODO: Fix Blitz Fury

        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderDivineEntity(new ModelCadillion(), 0.0F, EntityResourceLocs.CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityTomo.class, new RenderDivineEntity(new ModelTomo(), 0.0F, EntityResourceLocs.DRAVITE_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityBunny.class, new RenderDivineEntity(new ModelBunny(), 0.0F, EntityResourceLocs.BUNNY));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderDivineEntity(new ModelAngryBunny(), 0.0F, 2.0F, EntityResourceLocs.ANGRY_BUNNY));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderDivineEntity(new ModelCori(), 0.0F, EntityResourceLocs.WEAK_CORI));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderDivineDisc(TwilightItemHelper.DraviteChunk));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderDivineEntity(new ModelMadivel(), 0.0F, EntityResourceLocs.MADIVEL));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderDivineEntity(new ModelNesro(), 0.0F, EntityResourceLocs.NESRO));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteGolem.class, new RenderDivineEntity(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.AZURITE_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteTomo.class, new RenderDivineEntity(new ModelTomo(), 0.0F, EntityResourceLocs.AZURITE_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderDivineEntity(new ModelSamek(), 0.0F, EntityResourceLocs.VAREK));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderDivineEntity(new ModelMoonWolf(), 0.0F, EntityResourceLocs.TWILIGHT_WOLF));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyCadillion.class, new RenderDivineEntity(new ModelCadillion(), 0.0F, EntityResourceLocs.ENERGY_CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyTomo.class, new RenderDivineEntity(new ModelTomo(), 0.0F, EntityResourceLocs.ENERGY_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyGolem.class, new RenderDivineEntity(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.ENERGY_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderDivineEntity(new ModelSamek(), 0.0F, EntityResourceLocs.SAMEK));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilGolem.class, new RenderDivineEntity(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.MYTHRIL_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori2.class, new RenderDivineEntity(new ModelCori(), 0.0F, EntityResourceLocs.ADVANCED_CORI));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilFiend.class, new RenderDivineEntity(new ModelMytrilFiend(), 0.0F, EntityResourceLocs.MYTHRIL_FIEND));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseCadillion.class, new RenderDivineEntity(new ModelCadillion(), 0.0F, EntityResourceLocs.DENSE_CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseDemon.class, new RenderDivineEntity(new ModelDenseDemon(), 0.0F, EntityResourceLocs.DENSE_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderDivineEntity(new ModelBasalisk(), 0.0F, EntityResourceLocs.BASALISK));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderDivineEntity(new ModelSoulStealer(), 0.0F, EntityResourceLocs.SOUL_STEALER));
        
        
        
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDensos(new ModelDensos(), 0.0F, EntityResourceLocs.DENSOS)); // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderReyvor(new ModelDensos(), 0.0F, EntityResourceLocs.TWILIGHT_DEMON)); // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderTwilightDemon(new ModelTwilightDemon(), 0.0F, 2.0F, EntityResourceLocs.TWILIGHT_DEMON)); //BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSoulFiend(new ModelSoulFiend(), 0.0F, 1.0F, EntityResourceLocs.SOUL_FIEND)); //BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderVamacheron(new ModelVamacheron(), 0.0F, EntityResourceLocs.VAMACHERON)); //BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderKarot(new ModelKarot(), 0.0F, 5.0F, EntityResourceLocs.KAROT)); //BOSS
        

        RenderingRegistry.registerEntityRenderingHandler(EntityEchantedWarrior.class, new RenderEnchantedWarrior(new ModelEnchantedWarrior(), 0.0F, EntityResourceLocs.ENCHANTED_WARRIOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), 0.0F, EntityResourceLocs.ENCHANTED_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilArcher.class, new RenderTwilightArcher(new ModelTwilightArcher(), 0.0F, EntityResourceLocs.MYTHRIL_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArcher.class, new RenderTwilightArcher(new ModelTwilightArcher(), 0.0F, EntityResourceLocs.TWILIGHT_ARCHER));
	}
}
