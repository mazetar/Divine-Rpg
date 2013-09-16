package net.divinerpg.core.arcana;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class ArcanaSystem {

    public static boolean UseArcana(EntityPlayer player, int amount) {
        
        return false;
    }
    
    
    @ForgeSubscribe
    public void onLivingDeathEvent(LivingDeathEvent event) {
        if (!event.entity.worldObj.isRemote
                && event.entity instanceof EntityPlayer) {
            
            
        }
    }

    @ForgeSubscribe
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (!event.entity.worldObj.isRemote
                && event.entity instanceof EntityPlayer) {
            
            
        }
    }
    
    private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();
    public static void storeEntityData(String name, NBTTagCompound compound)
    {
        extendedEntityData.put(name, compound);
    }

    /**
    * Removes the compound from the map and returns the NBT tag stored for name or null if none exists
    */
    public static NBTTagCompound getEntityData(String name)
    {
        return extendedEntityData.remove(name);
    }
}
