package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.vethea.tileentities.TileEntityDreamLamp;
import net.divinerpg.blocks.vethea.tileentities.TileEntityInfusionTable;
import net.divinerpg.client.gui.GuiDreamLamp;
import net.divinerpg.client.gui.GuiHungerHungry;
import net.divinerpg.client.gui.GuiInfusionTable;
import net.divinerpg.containers.ContainerDivineMerchant;
import net.divinerpg.containers.ContainerDreamLamp;
import net.divinerpg.containers.ContainerInfusionTable;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.DivineUtil;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class VetheaGuiHandler  implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z) {
        if (id == GuiRef.HUNGER) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        else if (id == GuiRef.INFUSIONTABLE) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if (te instanceof TileEntityInfusionTable)
            return new ContainerInfusionTable(player.inventory, (TileEntityInfusionTable)te);
        }
        else if (id == GuiRef.DREAMLAMP) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if (te instanceof TileEntityDreamLamp)
            return new ContainerDreamLamp(player.inventory, (TileEntityDreamLamp)te);
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z) {
        if (id == GuiRef.HUNGER) {
            return new GuiHungerHungry((ContainerDivineMerchant)this.getServerGuiElement(id, player, world, x, y, z));
        }
        else if (id == GuiRef.INFUSIONTABLE) {
            return new GuiInfusionTable((ContainerInfusionTable)this.getServerGuiElement(id, player, world, x, y, z));
        }
        else if (id == GuiRef.DREAMLAMP) {
            return new GuiDreamLamp((ContainerDreamLamp)this.getServerGuiElement(id, player, world, x, y, z));
        }
        
        
        return null;
    }

}