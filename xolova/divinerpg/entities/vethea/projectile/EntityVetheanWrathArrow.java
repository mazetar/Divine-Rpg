package xolova.divinerpg.entities.vethea.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

public class EntityVetheanWrathArrow extends EntityArrow
{
	public EntityVetheanWrathArrow(World par1World)
    {
        super(par1World);
    }

    public EntityVetheanWrathArrow(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    public EntityVetheanWrathArrow(World par1World, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving, float par4, float par5)
    {
        super(par1World, par2EntityLiving, par3EntityLiving, par4, par5);
    }
    
    public EntityVetheanWrathArrow(World par1World, EntityLiving par2EntityLiving, float par3)
    {
        super(par1World, par2EntityLiving, par3);
    }
}