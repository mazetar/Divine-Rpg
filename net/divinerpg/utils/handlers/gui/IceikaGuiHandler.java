package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.iceika.tileentities.TileEntityCoalStoneFurnace;
import net.divinerpg.client.gui.GuiDivineFurnace;
import net.divinerpg.client.gui.GuiTinkerer;
import net.divinerpg.client.gui.GuiWorkshopMerchant;
import net.divinerpg.containers.ContainerDivineFurnace;
import net.divinerpg.containers.ContainerDivineMerchant;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.DivineUtil;
import net.divinerpg.utils.unused.GuiStoneFurnace;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class IceikaGuiHandler  implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        if (id == GuiRef.TINKERER) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        else if (id == GuiRef.WORKSHOP_MERCHANT) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        
        else if (id == GuiRef.COALSTONE_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityCoalStoneFurnace) {
                return new ContainerDivineFurnace(player.inventory, (TileEntityCoalStoneFurnace)te);
            }
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        if (id == GuiRef.TINKERER) {
            return new GuiTinkerer((ContainerDivineMerchant)this.getServerGuiElement(id, player, world, var1, var2, var3));
            }
        else if (id == GuiRef.WORKSHOP_MERCHANT) {
            return new GuiWorkshopMerchant((ContainerDivineMerchant)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        else if (id == GuiRef.COALSTONE_FURNACE) {
            return new GuiDivineFurnace((ContainerDivineFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        
        return null;
    }

}