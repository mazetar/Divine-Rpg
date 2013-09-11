package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.twilight.tileentities.TileEntityTwilightFurance;
import net.divinerpg.client.gui.GuiDivineFurnace;
import net.divinerpg.containers.ContainerDivineFurnace;
import net.divinerpg.lib.GuiRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class TwilightGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z) {
        if (id == GuiRef.TWILIGHT_FURNACE) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if (te instanceof TileEntityTwilightFurance)
            return new ContainerDivineFurnace(player.inventory, (TileEntityTwilightFurance)te);
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z) {

        if (id == GuiRef.TWILIGHT_FURNACE) {
            return new GuiDivineFurnace((ContainerDivineFurnace)this.getServerGuiElement(id, player, world, x, y, z));
        }
        
        return null;
    }

}
