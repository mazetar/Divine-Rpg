package xolova.divinerpg.entities.vethea.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntitySpinebackCannonShot extends EntityVetheanCannonShot
{
    public EntitySpinebackCannonShot(World par1)
    {
        super(par1);
    }

    public EntitySpinebackCannonShot(World par1, EntityLiving par2, int par3)
    {
        super(par1, par2, par3);
    }

    public EntitySpinebackCannonShot(World par1, double par2, double par4, double par6)
    {
        super(par1, par2, par4, par6);
    }
}