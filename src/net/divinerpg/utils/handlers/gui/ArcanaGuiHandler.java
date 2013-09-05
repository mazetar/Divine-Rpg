package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.arcana.tileentities.TileEntityCondenser;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import net.divinerpg.client.gui.GuiCaptainMerik;
import net.divinerpg.client.gui.GuiCondenser;
import net.divinerpg.client.gui.GuiDemonFurnace;
import net.divinerpg.containers.ContainerCondenser;
import net.divinerpg.containers.ContainerDemonFurnace;
import net.divinerpg.containers.ContainerMerik;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.DivineUtil;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class ArcanaGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        
        
        if (id == GuiRef.MERIK) {
            return new ContainerMerik(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        else if (id == GuiRef.CONDENSER) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityCondenser)
                return new ContainerCondenser(player.inventory, (TileEntityCondenser)te);
        }
        else if (id == GuiRef.DEMONFURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityDemonFurnace)
                return new ContainerDemonFurnace(player.inventory, (TileEntityDemonFurnace)te);
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        if (id == GuiRef.MERIK) {
            return new GuiCaptainMerik((ContainerMerik)getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.CONDENSER) {
            return new GuiCondenser((ContainerCondenser) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }        
        else if (id == GuiRef.DEMONFURNACE) {
            return new GuiDemonFurnace((ContainerDemonFurnace) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        
        
        return null;
    }

}
