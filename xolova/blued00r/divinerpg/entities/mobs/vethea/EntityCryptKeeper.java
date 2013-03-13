package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityCryptKeeper extends EntityGive
{

	public EntityCryptKeeper(World par1) 
	{
		super(par1, DivineRPG.amthrimisLump, 5);
		this.texture = "/mob/TempleGuardian.png";
	}
}