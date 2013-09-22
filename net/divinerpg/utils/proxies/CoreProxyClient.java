package net.divinerpg.utils.proxies;

import net.divinerpg.blocks.core.tileentities.TileDivineStatue;
import net.divinerpg.client.renders.core.RenderDivineStatue;
import net.divinerpg.client.renders.core.RenderStatueItem;
import net.divinerpg.utils.handlers.ClientTickHandler;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.render.OverworldRenderHelper;
import net.minecraft.block.Block;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxyClient extends CoreProxy {
	
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileDivineStatue.class, new RenderDivineStatue());
    }
    
	@Override
	public void tickRegistry() {
		super.tickRegistry();
		//VersionHelper.checkVersion();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
		
	}
	
	@Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);

        MinecraftForgeClient.registerItemRenderer(OverworldBlockHelper.aeStatue.blockID, new RenderStatueItem(OverworldBlockHelper.aeStatue));
        MinecraftForgeClient.registerItemRenderer(OverworldBlockHelper.ayeracoStatue.blockID, new RenderStatueItem(OverworldBlockHelper.ayeracoStatue));
        MinecraftForgeClient.registerItemRenderer(OverworldBlockHelper.kosStatue.blockID, new RenderStatueItem(OverworldBlockHelper.kosStatue));
        MinecraftForgeClient.registerItemRenderer(OverworldBlockHelper.watcherStatue.blockID, new RenderStatueItem(OverworldBlockHelper.watcherStatue));
    }
	
	@Override
	public void entityInit() {
	    super.entityInit();
	    OverworldRenderHelper.init();
	}

}
