package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityMysteriousManLayer3 extends EntityGive
{

	public EntityMysteriousManLayer3(World par1) 
	{
		super(par1, DivineRPG.pardimalLump, 10);
		this.texture = "/mob/MysteriousMan3.png";
	}
}