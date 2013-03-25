package xolova.blued00r.divinerpg.entities.projectile;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityLamona extends EntityThrowable
{
	private boolean glowing = false;
	private int blockX;
	private int blockY;
	private int blockZ;

	public EntityLamona(World var1)
	{
		super(var1);
	}

	public EntityLamona(World var1, EntityLiving var2)
	{
		super(var1, var2);
	}

	public EntityLamona(World var1, double var2, double var4, double var6)
	{
		super(var1, var2, var4, var6);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if(this.worldObj.getBlockMaterial((int)this.posX, (int)this.posY, (int)this.posZ) == Material.air)
		{	
			this.worldObj.setBlock((int)this.posX, (int)this.posY, (int)this.posZ, DivineRPG.blockOfLight.blockID);
		}
	}

	@Override
	protected void onImpact(MovingObjectPosition var1)
	{
		if(!this.worldObj.isRemote)
		{
			this.setDead();
		}
	}
}
