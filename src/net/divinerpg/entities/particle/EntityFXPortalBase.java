package net.divinerpg.entities.particle;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class EntityFXPortalBase extends EntityFX {

    public EntityFXPortalBase(World var1, double var2, double var4, double var6, double var8, double var10, double var12)
    {
        super(var1, var2, var4, var6, var8, var10, var12);
    }
    
    public EntityFXPortalBase getNewFX(World w, double var2, double var3, double var4, double var5, double var6, double var7) {
        return new EntityFXPortalBase(w, var2, var3, var4, var5, var6, var7);
    }
}
