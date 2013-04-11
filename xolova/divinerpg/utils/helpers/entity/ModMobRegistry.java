package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.entity.Entity;
import xolova.divinerpg.DivineRPGIceika;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModMobRegistry 
{
	public static void registerModEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(clazz, name, modID, DivineRPGIceika.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerGlobalEntityID(clazz, name, availableID());
		EntityRegistry.registerModEntity(clazz, name, modID, DivineRPGIceika.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static int availableID() {
		return EntityRegistry.findGlobalUniqueEntityId();
	}
}
