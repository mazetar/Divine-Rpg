package xolova.divinerpg.utils.helpers.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import xolova.divinerpg.entities.arcana.mobs.*;
import xolova.divinerpg.entities.arcana.projectile.*;
import xolova.divinerpg.entities.arcana.traders.*;
import xolova.divinerpg.models.arcana.mobs.*;
import xolova.divinerpg.models.twilight.mobs.ModelSamek;
import xolova.divinerpg.models.twilight.mobs.ModelTwilightGolem;
import xolova.divinerpg.renders.RenderBasicProjectile;
import xolova.divinerpg.renders.RenderIconProjectile;
import xolova.divinerpg.renders.arcana.mob.*;
import xolova.divinerpg.renders.arcana.projectile.RenderStarfall;
import xolova.divinerpg.utils.helpers.item.ArcanaItemHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ArcanaRenderHelper 
{
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderBasicProjectile(2, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityReflector.class, new RenderBasicProjectile(255, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderIconProjectile(ArcanaItemHelper.grenade.getIconFromDamage(0), "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityMerikMissile.class, new RenderBasicProjectile(3, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityFirefly.class, new RenderBasicProjectile(0, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityStarfall.class, new RenderStarfall(1, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityLamona.class, new RenderIconProjectile(ArcanaItemHelper.lamonaItem.getIconFromDamage(0), "/Xolovon3.png"));

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

        RenderingRegistry.registerEntityRenderingHandler(EntityDramix.class, new RenderDramix(new ModelDramix(), 1.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityParasecta.class, new RenderParasecta(new ModelParasecta(), 1.0F, 1.0F));
	}
}
