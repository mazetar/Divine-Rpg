package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import xolova.divinerpg.DivineRPG;
import cpw.mods.fml.client.registry.RenderingRegistry;
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
