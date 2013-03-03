package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.entities.projectile.EntityThrowable;

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