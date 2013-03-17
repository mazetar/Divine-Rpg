package xolova.divinerpg.utils;

import xolova.divinerpg.utils.Entity.*;

public class Entities 
{
	public static void init()
	{
		/*
		 * Mobs
		 */
		OverworldMobs.init();
		IceikaMobs.init();
		TwilightMobs.init();
		ArcanaMobs.init();
		VetheanMobs.init();
		
		/*
		 * Projectiles
		 */
		OverworldProjectiles.init();
		IceikaProjectiles.init();
		TwilightProjectiles.init();
		ArcanaProjectiles.init();
		VetheanProjectiles.init();
		
		/*
		 * TileEntities
		 */
		OverworldTileEntities.init();
		IceikaTileEntities.init();
		TwilightTileEntities.init();
		ArcanaTileEntities.init();
		VetheanTileEntities.init();
		
	}
}
