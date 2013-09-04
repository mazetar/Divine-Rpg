package net.divinerpg.utils.helpers.entity;

import net.divinerpg.DivineRPG;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModMobRegistry 
{
    public static int NEXT_MOD_ENTITY_ID = 100;
    
	public static void registerModEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
        registerEgg(NEXT_MOD_ENTITY_ID, clazz);
	}
	
	public static void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
        registerEgg(NEXT_MOD_ENTITY_ID, clazz);
	}
	
	public static void registerEntity(Class<? extends Entity> clazz, String name, int modID, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggColor1, int eggColor2) 
	{
		EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
        registerEntityEgg(NEXT_MOD_ENTITY_ID, clazz, eggColor1, eggColor2);
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
        registerEgg(NEXT_MOD_ENTITY_ID, clazz);
   }
    
    public static void registerEntity(Class<? extends Entity> clazz, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
       registerEgg(NEXT_MOD_ENTITY_ID, clazz);
    }
    
    public static void registerEntity(Class<? extends Entity> clazz, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggColor1, int eggColor2) 
    {
        EntityRegistry.registerModEntity(clazz, name, NEXT_MOD_ENTITY_ID++, DivineRPG.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
        registerEntityEgg(NEXT_MOD_ENTITY_ID, clazz, eggColor1, eggColor2);
    }
    
    private static void registerEgg(int id, Class<? extends Entity> entity) {
        registerEntityEgg(id, entity, 0x333333, 0x990099);
    }
    
    public static void registerEntityEgg(int id, Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
    {
         EntityList.IDtoClassMapping.put(id, entity);
         EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
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


