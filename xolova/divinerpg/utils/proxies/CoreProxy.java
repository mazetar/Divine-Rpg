package xolova.divinerpg.utils.proxies;

import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import xolova.divinerpg.DivineRPGIceika;
import xolova.divinerpg.entities.core.EntityDamageProjectile;
import xolova.divinerpg.utils.helpers.misc.core.ArmorEffectHandler;
import xolova.divinerpg.utils.helpers.misc.core.ServerTickHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxy {
	
	public static int START_EID = 0;

	public void init(FMLInitializationEvent event) {
		entityRegistry();
		tickRegistry();
		eventRegistry();
	}
	
	public void tickRegistry() {
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);	
	}
	
	public void eventRegistry() {
		MinecraftForge.EVENT_BUS.register(new ArmorEffectHandler());
	}
	
	public void entityRegistry() {
		registerEntity(EntityDamageProjectile.class, "DivineRPG_projectile", START_EID++, 64, 10, true);
	}
	
	public void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerGlobalEntityID(clazz, name, availableID());
		EntityRegistry.registerModEntity(clazz, name, modID, DivineRPGIceika.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public int availableID() {
		return EntityRegistry.findGlobalUniqueEntityId();
	}

}
