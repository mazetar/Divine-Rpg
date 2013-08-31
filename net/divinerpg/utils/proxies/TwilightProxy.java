package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.config.TwilightConfigHelper;
import net.divinerpg.utils.helpers.entity.TwilightEntityHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.divinerpg.utils.helpers.recipe.TwilightRecipeHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class TwilightProxy 
{
	
	public void preInit(FMLPreInitializationEvent event) {

        TwilightConfigHelper.initConfig(event);
	}
	
	public void init(FMLInitializationEvent event) {
	    
        TwilightBlockHelper.init();
        TwilightItemHelper.init();

    //    TwilightRecipeHelper.init();

	}
	
	   public void postInit(FMLPostInitializationEvent event) {
	       initEntities();
	    }
	
	public void initEntities() {
	    TwilightEntityHelper.init();
	}
}
