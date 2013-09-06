package net.divinerpg.utils.proxies;

import net.divinerpg.DivineRPGIceika;
import net.divinerpg.blocks.iceika.tileentities.*;
import net.divinerpg.blocks.overworld.tileentities.TileEntitySkeletonChest;
import net.divinerpg.utils.handlers.ExplosiveArrowHitHandler;
import net.divinerpg.utils.handlers.gui.IceikaGuiHandler;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.divinerpg.utils.helpers.entity.IceikaEntityHelper;
import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class IceikaProxy {
 
    public void preInit(FMLPreInitializationEvent event) {

        IceikaConfigHelper.initConfig(event);
        registerTileEntities();
    }
    
    public void init(FMLInitializationEvent event) {


        IceikaBlockHelper.init();
        IceikaItemHelper.init();
        NetworkRegistry.instance().registerGuiHandler(DivineRPGIceika.instance, new IceikaGuiHandler());

        // IceikaRecipeHelper call here (NYI). --MAZ
        
        MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
        
    }
    

    public void postInit(FMLPostInitializationEvent event) {
        initEntityRenderers();
    }
    public void initEntityRenderers() {
        IceikaEntityHelper.init();
    }
    
    void registerTileEntities() {

        GameRegistry.registerTileEntity(TileEntitySkeletonChest.class, "Skeleton Chest");
        GameRegistry.registerTileEntity(TileEntityIceikaChest.class, "Iceika Chest");
        GameRegistry.registerTileEntity(TileEntityCoalStoneFurnace.class, "Coal Stone Furnace");
    }

	
}
