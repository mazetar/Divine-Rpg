package xolova.blued00r.divinerpg.entities.vethea;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityTeakerDisk extends EntityDisk
{
	public EntityTeakerDisk(World par1World)
    {
        super(par1World);
    }

    public EntityTeakerDisk(World par1World, EntityLiving par2EntityLiving, int par3, Item i)
    {
        super(par1World, par2EntityLiving, par3, i);
    }

    public EntityTeakerDisk(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
}