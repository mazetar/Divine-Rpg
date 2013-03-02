package xolova.blued00r.divinerpg.misc;

import net.minecraft.stats.Achievement;
import xolova.blued00r.divinerpg.client.misc.LanguageHelper;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDemonFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDramixAlter;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityGreenlightFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityMoltenFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityMoonlightFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityOceanfireFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityPheonixAltar;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntitySerenityChest;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntitySkeletonChest;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntitySuperEnchantmentTable;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityTwilightFurance;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityWhitefireFurnace;
import xolova.blued00r.divinerpg.items.ItemVanillaCombination;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import xolova.blued00r.divinerpg.DivineRPG;

public class CommonProxy
{
    public void renderRegistry() {}

    public void soundRegistry() {}

    public int addArmor(String var1)
    {
        return 0;
    }

    public void registerTickHandlers()
    {
        TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
    }

    public int getRenderID()
    {
        return 0;
    }

    public void addNames() 
    {
        LanguageHelper.addNames();
    }

	public void addAchievements(){}
	
	public void addBlocks()
	{
		ModBlocks.init();
	}

	public void addCraftingMaterials()
	{
		CraftingMaterial.setMaterials();
	}
	
	public void defineEntities()
	{
		EntityHelper.defineEntities();
	}

	public void addEntities() 
	{
		EntityHelper.addEntities();
	}
	
	public void addRecipes()
	{
		RecipeHelper.addRecipes();
	}
}
