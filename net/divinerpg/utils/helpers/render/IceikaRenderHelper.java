package net.divinerpg.utils.helpers.render;

import net.divinerpg.entities.iceika.mobs.EntityAlicanto;
import net.divinerpg.entities.iceika.mobs.EntityFractite;
import net.divinerpg.entities.iceika.mobs.EntityFrostArcher;
import net.divinerpg.entities.iceika.mobs.EntityGlacide;
import net.divinerpg.entities.iceika.mobs.EntityHastreus;
import net.divinerpg.entities.iceika.mobs.EntityRollum;
import net.divinerpg.entities.iceika.mobs.EntityWorkshopMerchant;
import net.divinerpg.entities.iceika.mobs.EntityWorkshopTickerer;
import net.divinerpg.entities.iceika.projectile.EntityFractiteProjectile;
import net.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import net.divinerpg.entities.iceika.projectile.EntityIce;
import net.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import net.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.models.iceika.mobs.ModelAlicanto;
import net.divinerpg.models.iceika.mobs.ModelFractite;
import net.divinerpg.models.iceika.mobs.ModelGlacide;
import net.divinerpg.models.iceika.mobs.ModelHastreus;
import net.divinerpg.models.iceika.mobs.ModelRollum;
import net.divinerpg.models.iceika.mobs.ModelWorkshop;
import net.divinerpg.renders.RenderDivineEntity;
import net.divinerpg.renders.RenderEmpty;
import net.divinerpg.renders.RenderIconProjectile;
import net.divinerpg.renders.iceika.mob.RenderFrostArcher;
import net.divinerpg.renders.iceika.projectile.RenderFrostclawProjectile;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class IceikaRenderHelper 
{
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntityAlicanto.class, new RenderDivineEntity(new ModelAlicanto(), 0.0F, EntityResourceLocs.ALICANTO));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderDivineEntity(new ModelFractite(), 2.0F, 2.0F, EntityResourceLocs.FRACTITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlacide.class, new RenderDivineEntity(new ModelGlacide(), 0.0F, 1.0F, EntityResourceLocs.GLACON));
        RenderingRegistry.registerEntityRenderingHandler(EntityHastreus.class, new RenderDivineEntity(new ModelHastreus(), 0.0F, EntityResourceLocs.HASTERUS));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostArcher.class, new RenderFrostArcher(new ModelBiped(), 0.0F, EntityResourceLocs.FROZEN_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityRollum.class, new RenderDivineEntity(new ModelRollum(), 0.0F, EntityResourceLocs.ROLLUM));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopTickerer.class, new RenderDivineEntity(new ModelWorkshop(), 0.0F, EntityResourceLocs.WORKSHOP_TINKER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopMerchant.class, new RenderDivineEntity(new ModelWorkshop(), 0.0F, EntityResourceLocs.WORKSHOP_MERCHANT));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityFractiteProjectile.class, new RenderIconProjectile(EntityResourceLocs.FRACTITE_PROJECTILE));
        RenderingRegistry.registerEntityRenderingHandler(EntityCrabclawProjectile.class, new RenderIconProjectile(EntityResourceLocs.FRACTITE_PROJECTILE));
        RenderingRegistry.registerEntityRenderingHandler(EntityNoteProjectile.class, new RenderIconProjectile(EntityResourceLocs.MUSIC_BALL));

	}
}
