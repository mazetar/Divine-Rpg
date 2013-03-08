package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityMysteriousManLayer2 extends EntityGive
{

	public EntityMysteriousManLayer2(World par1) 
	{
		super(par1, DivineRPG.darvenLump, 6);
		this.texture = "/mob/MysteriousMan2.png";
	}
}