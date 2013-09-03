package net.divinerpg.utils.helpers.entity;

import net.divinerpg.DivineRPG;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModMobRegistry 
{
    public static int NEXT_MOD_ENTITY_ID = 100;
    
	public static void registerModEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggColor1, int eggColor2) 
	{
		EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	public static int availableID() {
		return EntityRegistry.findGlobalUniqueEntityId();
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Class<? extends Entity> clazz, Render render)
	{
		RenderingRegistry.registerEntityRenderingHandler(clazz, render);
	}
	
	   public static void registerModEntity(Class<? extends Entity> clazz, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
	        EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	   }
	    
	    public static void registerEntity(Class<? extends Entity> clazz, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
	        EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	    }
	    
	    public static void registerEntity(Class<? extends Entity> clazz, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggColor1, int eggColor2) 
	    {
	        EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	    }
	
	
}

/* EntityRegistry.registerModEntity */
/** Register the mod entity type with FML

 * @param entityClass The entity class
 * @param entityName A unique name for the entity
 * @param id A mod specific ID for the entity
 * @param mod The mod
 * @param trackingRange The range at which MC will send tracking updates
 * @param updateFrequency The frequency of tracking updates
 * @param sendsVelocityUpdates Whether to send velocity information packets as well
 */


