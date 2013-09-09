package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.twilight.tileentities.TileEntityTwilightFurance;
import net.divinerpg.client.gui.GuiCaptainMerik;
import net.divinerpg.client.gui.GuiTwilightFurnace;
import net.divinerpg.containers.ContainerMerik;
import net.divinerpg.containers.ContainerTwilightFurnace;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.DivineUtil;
import net.minecraft.entity.IMerchant;
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
            return new ContainerTwilightFurnace(player.inventory, (TileEntityTwilightFurance)te);
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z) {

        if (id == GuiRef.TWILIGHT_FURNACE) {
            return new GuiTwilightFurnace((ContainerTwilightFurnace)this.getServerGuiElement(id, player, world, x, y, z));
        }
        
        return null;
    }

}
