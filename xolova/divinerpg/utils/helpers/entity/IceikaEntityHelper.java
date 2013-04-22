package xolova.divinerpg.utils.helpers.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.entities.iceika.mobs.EntityAlicanto;
import xolova.divinerpg.entities.iceika.mobs.EntityFractite;
import xolova.divinerpg.entities.iceika.mobs.EntityFrostArcher;
import xolova.divinerpg.entities.iceika.mobs.EntityGlacide;
import xolova.divinerpg.entities.iceika.mobs.EntityHastreus;
import xolova.divinerpg.entities.iceika.mobs.EntityRollum;
import xolova.divinerpg.entities.iceika.mobs.EntityWorkshopMerchant;
import xolova.divinerpg.entities.iceika.mobs.EntityWorkshopTickerer;
import xolova.divinerpg.entities.iceika.projectile.EntityFractiteCannonShot;
import xolova.divinerpg.entities.iceika.projectile.EntityFractiteProjectile;
import xolova.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import xolova.divinerpg.entities.iceika.projectile.EntityFrostyShuriken;
import xolova.divinerpg.entities.iceika.projectile.EntityIce;
import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.utils.helpers.DimensionRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
		ModMobRegistry.registerModEntity(EntityFrostclawProjectile.class, "frostClawProjectile", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFractiteCannonShot.class, "fractiteCannonShot", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFrostyShuriken.class, "frostyShuriken", START_EID++, 64, 10, true);
		ModMobRegistry.registerModEntity(EntityFractiteProjectile.class, "fractiteProjectile", START_EID++, 64, 10, true);
		
		addSpawns();
		addNames();
	}
	
	public static void addSpawns()
	{
        EntityRegistry.addSpawn(EntityAlicanto.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityFractite.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityGlacide.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityHastreus.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityFrostArcher.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityRollum.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
	}
	
	public static void addNames()
	{
        LanguageRegistry.instance().addStringLocalization("entity.alicanto.name",  "Alicanto");
        LanguageRegistry.instance().addStringLocalization("entity.fractite.name",  "Fractite");
        LanguageRegistry.instance().addStringLocalization("entity.glacide.name",  "Glacide");
        LanguageRegistry.instance().addStringLocalization("entity.hastreus.name",  "Hastreus");
        LanguageRegistry.instance().addStringLocalization("entity.frostarcher.name",  "Frost Archer");
        LanguageRegistry.instance().addStringLocalization("entity.rollum.name",  "Rollum");
        LanguageRegistry.instance().addStringLocalization("entity.workshoptickerer.name",  "Workshop Tickerer");
        LanguageRegistry.instance().addStringLocalization("entity.workshopmerchant.name",  "Workshop Merchant");

        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.noteProjectile.name",  "Note");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.ice.name",  "Ice");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.frostClawProjectile.name",  "Frost Claw");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.fractiteCannonShot.name",  "Fractite Cannon");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.frostyShuriken.name",  "Frosty Shuriken");
        LanguageRegistry.instance().addStringLocalization("entity.divinerpg.fractiteProjectile.name",  "Fractite");
	}
}
