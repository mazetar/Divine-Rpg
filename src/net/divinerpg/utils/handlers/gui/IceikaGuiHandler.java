package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.iceika.tileentities.TileEntityCoalStoneFurnace;
import net.divinerpg.client.gui.GuiStoneFurnace;
import net.divinerpg.containers.ContainerCoalStoneFurnace;
import net.divinerpg.lib.GuiRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class IceikaGuiHandler  implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        if (id == GuiRef.COALSTONE_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityCoalStoneFurnace) {
                return new ContainerCoalStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace)te);
            }
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        if (id == GuiRef.COALSTONE_FURNACE) {
            return new GuiStoneFurnace((ContainerCoalStoneFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        
        return null;
    }

}