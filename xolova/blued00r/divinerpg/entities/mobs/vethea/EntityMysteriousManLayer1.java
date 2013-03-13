package xolova.blued00r.divinerpg.entities.mobs.vethea;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityMysteriousManLayer1 extends EntityGive
{

	public EntityMysteriousManLayer1(World par1) 
	{
		super(par1, DivineRPG.teakerLump, 3);
		this.texture = "/mob/MysteriousMan.png";
	}
}