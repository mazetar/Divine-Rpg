package xolova.divinerpg.utils.helpers.entity;

import xolova.divinerpg.entities.iceika.mobs.*;
import xolova.divinerpg.entities.iceika.projectile.*;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;

public class IceikaEntityHelper 
{
	public static int START_EID = 275;
	
	public static void entityRegistry()
	{
		ModMobRegistry.registerEntity(EntityAlicanto.class, "alicanto", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityFractite.class, "fractite", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityGlacide.class, "glacide", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityHastreus.class, "hastreus", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityFrostArcher.class, "frostarcher", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityRollum.class, "rollum", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityWorkshopTickerer.class, "workshoptickerer", START_EID++, 120, 5, true);
        ModMobRegistry.registerEntity(EntityWorkshopMerchant.class, "workshopmerchant", START_EID++, 120, 5, true);
		
		ModMobRegistry.registerModEntity(EntityNoteProjectile.class, "noteProjectile", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityIce.class, "ice", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFrostclawProjectile.class, "frostClaw", START_EID++, 64, 10, true);
	}
}
