package xolova.divinerpg.utils.helpers.entity;

import xolova.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import xolova.divinerpg.entities.iceika.projectile.EntityIce;
import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;

public class IceikaEntityHelper 
{
	public static int START_EID = 275;
	
	public static void entityRegistry()
	{
		ModMobRegistry.registerModEntity(EntityNoteProjectile.class, "DivineRPG_noteProjectile", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityIce.class, "DivineRPG_ice", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityCrabclawProjectile.class, "DivineRPG_crabClaw", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFrostclawProjectile.class, "DivineRPG_frostClaw", START_EID++, 64, 10, true);
	}
}
