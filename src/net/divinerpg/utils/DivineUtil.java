package net.divinerpg.utils;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class DivineUtil {
    public static Entity getEntityByID(int entityID, World world)
    {
            for(int i=0;i<world.getLoadedEntityList().size();i++)
            {
                    if(((Entity)world.getLoadedEntityList().get(i)).entityId == entityID)
                    {
                            return ((Entity)world.getLoadedEntityList().get(i));
                    }
            }
            
            return null;
    }
}
