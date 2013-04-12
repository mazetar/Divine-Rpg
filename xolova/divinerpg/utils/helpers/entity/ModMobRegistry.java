package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import xolova.divinerpg.DivineRPG;
import xolova.divinerpg.DivineRPGIceika;
<<<<<<< HEAD
=======
import xolova.divinerpg.entities.core.EntityDamageProjectile;
import xolova.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import xolova.divinerpg.entities.iceika.projectile.EntityIce;
import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;
import xolova.divinerpg.renders.RenderGenericProjectile;
import cpw.mods.fml.client.registry.RenderingRegistry;
>>>>>>> aab73a1... Update to forge 7.7.1.651, fixed about 100 erros due to that. Entity registry, spawns and names for all entities in the vanilla dimensions, arcana and veatha.
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModMobRegistry 
{
	public static void registerModEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(clazz, name, modID, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerGlobalEntityID(clazz, name, availableID());
		EntityRegistry.registerModEntity(clazz, name, modID, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static int availableID() {
		return EntityRegistry.findGlobalUniqueEntityId();
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Class<? extends Entity> clazz, Render render)
	{
		RenderingRegistry.registerEntityRenderingHandler(clazz, render);
	}
}
