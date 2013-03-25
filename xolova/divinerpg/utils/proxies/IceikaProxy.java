package xolova.divinerpg.utils.proxies;

import net.minecraft.entity.Entity;
import xolova.divinerpg.DivineRPGIceika;
import xolova.divinerpg.entities.iceika.projectile.EntityIce;
import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class IceikaProxy {

	public static int START_EID = 275;
	
	public void init(FMLInitializationEvent event) {
		entityRegistry();
	}
	
	public void entityRegistry() {
		registerEntity(EntityNoteProjectile.class, "DivineRPG_noteProjectile", START_EID++, 64, 10, true);
		registerEntity(EntityIce.class, "DivineRPG_ice", START_EID++, 64, 10, true);
	}
	
	public void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerGlobalEntityID(clazz, name, availableID());
		EntityRegistry.registerModEntity(clazz, name, modID, DivineRPGIceika.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public int availableID() {
		return EntityRegistry.findGlobalUniqueEntityId();
	}
	
}
