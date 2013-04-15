package xolova.divinerpg.utils.helpers.render;

import net.minecraft.client.model.ModelBiped;
import xolova.divinerpg.entities.iceika.mobs.*;
import xolova.divinerpg.entities.iceika.projectile.EntityFractiteProjectile;
import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;
import xolova.divinerpg.models.iceika.mobs.*;
import xolova.divinerpg.renders.RenderBasicProjectile;
import xolova.divinerpg.renders.iceika.mob.*;
import xolova.divinerpg.renders.overworld.projectile.RenderMusicBall;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class IceikaRenderHelper 
{
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntityAlicanto.class, new RenderAlicanto(new ModelAlicanto(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderFractite(new ModelFractite(), 2.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlacide.class, new RenderGlacide(new ModelGlacide(), 0.0F, 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHastreus.class, new RenderHastreus(new ModelHastreus(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostArcher.class, new RenderFrostArcher(new ModelBiped(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRollum.class, new RenderRollum(new ModelRollum(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopTickerer.class, new RenderWorkshopTickerer(new ModelWorkshop(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopMerchant.class, new RenderWorkshopMerchant(new ModelWorkshop(), 0.0F));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityFractiteProjectile.class, new RenderBasicProjectile(187, "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrabclawProjectile.class, new RenderBasicProjectile(187, "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityNoteProjectile.class, new RenderMusicBall(8));
	}
}
