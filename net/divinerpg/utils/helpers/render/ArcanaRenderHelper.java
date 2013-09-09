package net.divinerpg.utils.helpers.render;

import net.divinerpg.entities.arcana.mobs.*;
import net.divinerpg.entities.arcana.projectile.*;
import net.divinerpg.entities.arcana.traders.*;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.models.arcana.mobs.*;
import net.divinerpg.models.twilight.mobs.ModelSamek;
import net.divinerpg.models.twilight.mobs.ModelTwilightGolem;
import net.divinerpg.renders.RenderBasicProjectile;
import net.divinerpg.renders.RenderDivineEntity;
import net.divinerpg.renders.RenderIconProjectile;
import net.divinerpg.renders.arcana.mob.*;
import net.divinerpg.renders.arcana.projectile.RenderStarfall;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ArcanaRenderHelper 
{
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderBasicProjectile(EntityResourceLocs.SPARKLER));
        RenderingRegistry.registerEntityRenderingHandler(EntityReflector.class, new RenderBasicProjectile(EntityResourceLocs.REFLECTOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderIconProjectile(EntityResourceLocs.GRENADE));
        RenderingRegistry.registerEntityRenderingHandler(EntityMerikMissile.class, new RenderBasicProjectile(EntityResourceLocs.MERIK_MISSLE));
        RenderingRegistry.registerEntityRenderingHandler(EntityFirefly.class, new RenderBasicProjectile(EntityResourceLocs.FIREFLY));
        RenderingRegistry.registerEntityRenderingHandler(EntityStarfall.class, new RenderStarfall(EntityResourceLocs.STARFALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityLamona.class, new RenderIconProjectile(EntityResourceLocs.LAMONA));

        RenderingRegistry.registerEntityRenderingHandler(EntityLivingStatue.class, new RenderDivineEntity(new ModelBiped(), 0.0F, EntityResourceLocs.LIVING_STATUE_SLEEP)); //TODO: This RenderBiped fix must be tested, may not work.

        RenderingRegistry.registerEntityRenderingHandler(EntityRoamer.class, new RenderDivineEntity(new ModelRoamer(), 0.0F, EntityResourceLocs.ROAMER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathcryx.class, new RenderDivineEntity(new ModelDeathcryx(), 0.0F, EntityResourceLocs.DEATHCRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathHound.class, new RenderDivineEntity(new ModelDeathHound(), 0.0F, EntityResourceLocs.DEATH_HOUND));
        RenderingRegistry.registerEntityRenderingHandler(EntityLeorna.class, new RenderDivineEntity(new ModelLeorna(), 0.0F, EntityResourceLocs.LEORNA));
        RenderingRegistry.registerEntityRenderingHandler(EntityRazorback.class, new RenderDivineEntity(new ModelRazorback(), 0.0F, EntityResourceLocs.RAZORBACK));
        RenderingRegistry.registerEntityRenderingHandler(EntityConstructor.class, new RenderDivineEntity(new ModelDramix(), 0.0F, EntityResourceLocs.CONSTRUCTOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonPrisoner.class, new RenderDivineEntity(new ModelDungeonPrisoner(), 0.0F, EntityResourceLocs.DUNGEON_PRISONER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonDemon.class, new RenderDivineEntity(new ModelDungeonDemon(), 0.0F, EntityResourceLocs.DUNGEON_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaptianMerik.class, new RenderDivineEntity(new ModelSamek(), 0.0F, EntityResourceLocs.CAPTAIN_MERIK));
        RenderingRegistry.registerEntityRenderingHandler(EntityDatticon.class, new RenderDivineEntity(new ModelSamek(), 0.0F, EntityResourceLocs.DATTICON));
        RenderingRegistry.registerEntityRenderingHandler(EntityVatticus.class, new RenderDivineEntity(new ModelBiped(), 0.0F, EntityResourceLocs.LORD_VATTICUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityZelus.class, new RenderDivineEntity(new ModelBiped(), 0.0F, EntityResourceLocs.ZELUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFyracryx.class, new RenderDivineEntity(new ModelDeathcryx(), 0.0F, EntityResourceLocs.FYRACRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityParatiku.class, new RenderDivineEntity(new ModelParatiku(), 0.0F, EntityResourceLocs.PARATIKU));
        RenderingRegistry.registerEntityRenderingHandler(EntityGolemOfRejuv.class, new RenderDivineEntity(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.STONE_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeimer.class, new RenderDivineEntity(new ModelSeimer(), 0.0F, EntityResourceLocs.SEIMER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, new RenderDivineEntity(new ModelWraith(), 0.0F, EntityResourceLocs.WRAITH));

        RenderingRegistry.registerEntityRenderingHandler(EntityDramix.class, new RenderDramix(new ModelDramix(), 1.0F, 1.0F, EntityResourceLocs.DRAMIX)); // BOSS
        RenderingRegistry.registerEntityRenderingHandler(EntityParasecta.class, new RenderParasecta(new ModelParasecta(), 1.0F, 1.0F, EntityResourceLocs.PARASECTA));  // BOSS
	}
}
