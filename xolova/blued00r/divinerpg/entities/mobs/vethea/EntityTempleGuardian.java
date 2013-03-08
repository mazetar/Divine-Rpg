package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityTempleGuardian extends EntityGive
{

	public EntityTempleGuardian(World par1) 
	{
		super(par1, DivineRPG.cermileLump, 10);
		this.texture = "/mob/TempleGuardian.png";
	}
}