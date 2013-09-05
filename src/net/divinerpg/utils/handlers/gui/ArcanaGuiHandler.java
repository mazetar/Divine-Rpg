package net.divinerpg.utils.handlers.gui;

import net.divinerpg.client.gui.GuiCaptainMerik;
import net.divinerpg.containers.ContainerMerik;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.DivineUtil;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class ArcanaGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        
        
        if (id == GuiRef.MERIK) {
            return new ContainerMerik(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        if (id == GuiRef.MERIK) {
            return new GuiCaptainMerik((ContainerMerik)getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        
        return null;
    }

}
