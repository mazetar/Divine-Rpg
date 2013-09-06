package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.overworld.tileentities.TileEntitySuperEnchantmentTable;
import net.divinerpg.blocks.twilight.tileentities.TileEntityTwilightFurance;
import net.divinerpg.client.gui.GuiCaptainMerik;
import net.divinerpg.client.gui.GuiSuperEnchant;
import net.divinerpg.client.gui.GuiTwilightFurnace;
import net.divinerpg.containers.ContainerSuperEnchant;
import net.divinerpg.containers.ContainerTwilightFurnace;
import net.divinerpg.lib.GuiRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class OverworldGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {

        if (id == GuiRef.SUPER_ENCHANTMENT_TABLE) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if (te instanceof TileEntitySuperEnchantmentTable)
            return new ContainerSuperEnchant(player.inventory, world, x, y, z);
        }
            
            return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {

        if (id == GuiRef.SUPER_ENCHANTMENT_TABLE) {
            return new GuiSuperEnchant((ContainerSuperEnchant)this.getServerGuiElement(id, player, world, x, y, z));
        }
        
        return null;

    }
}
