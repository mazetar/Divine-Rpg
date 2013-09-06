package net.divinerpg.utils.handlers.gui;

import net.divinerpg.blocks.arcana.tileentities.TileEntityCondenser;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityExtractor;
import net.divinerpg.blocks.arcana.tileentities.TileEntityGreenlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoltenFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoonlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityOceanfireFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityWhitefireFurnace;
import net.divinerpg.client.gui.GuiCaptainMerik;
import net.divinerpg.client.gui.GuiCondenser;
import net.divinerpg.client.gui.GuiDemonFurnace;
import net.divinerpg.client.gui.GuiExtractor;
import net.divinerpg.client.gui.GuiGreenlightFurnace;
import net.divinerpg.client.gui.GuiMoltenFurnace;
import net.divinerpg.client.gui.GuiMoonlightFurnace;
import net.divinerpg.client.gui.GuiOceanfireFurnace;
import net.divinerpg.client.gui.GuiWhitefireFurnace;
import net.divinerpg.containers.ContainerCondenser;
import net.divinerpg.containers.ContainerDemonFurnace;
import net.divinerpg.containers.ContainerExtractor;
import net.divinerpg.containers.ContainerGreenlightFurnace;
import net.divinerpg.containers.ContainerMerik;
import net.divinerpg.containers.ContainerMoltenFurnace;
import net.divinerpg.containers.ContainerMoonlightFurnace;
import net.divinerpg.containers.ContainerOceanfireFurnace;
import net.divinerpg.containers.ContainerWhitefireFurnace;
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
        else if (id == GuiRef.DEMON_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityDemonFurnace)
                return new ContainerDemonFurnace(player.inventory, (TileEntityDemonFurnace)te);
        }
        else if (id == GuiRef.MOLTEN_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityMoltenFurnace)
                return new ContainerMoltenFurnace(player.inventory, (TileEntityMoltenFurnace)te);
        }
        else if (id == GuiRef.GREENLIGHT_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityGreenlightFurnace)
                return new ContainerGreenlightFurnace(player.inventory, (TileEntityGreenlightFurnace)te);
        }
        else if (id == GuiRef.WHITEFIRE_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityWhitefireFurnace)
                return new ContainerWhitefireFurnace(player.inventory, (TileEntityWhitefireFurnace)te);
        }
        else if (id == GuiRef.OCEANFIRE_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityOceanfireFurnace)
                return new ContainerOceanfireFurnace(player.inventory, (TileEntityOceanfireFurnace)te);
        }
        else if (id == GuiRef.MOONLIGHT_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityMoonlightFurnace)
                return new ContainerMoonlightFurnace(player.inventory, (TileEntityMoonlightFurnace)te);
        }
        else if (id == GuiRef.EXTRACTOR) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityExtractor)
                return new ContainerExtractor(player.inventory, (TileEntityExtractor)te);
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
        else if (id == GuiRef.DEMON_FURNACE) {
            return new GuiDemonFurnace((ContainerDemonFurnace) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.MOLTEN_FURNACE) {
            return new GuiMoltenFurnace((ContainerMoltenFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.GREENLIGHT_FURNACE) {
            return new GuiGreenlightFurnace((ContainerGreenlightFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.WHITEFIRE_FURNACE) {
            return new GuiWhitefireFurnace((ContainerWhitefireFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.OCEANFIRE_FURNACE) {
            return new GuiOceanfireFurnace((ContainerOceanfireFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.MOONLIGHT_FURNACE) {
            return new GuiMoonlightFurnace((ContainerMoonlightFurnace)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.EXTRACTOR) {
            return new GuiExtractor((ContainerExtractor)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        
        
        return null;
    }

}
