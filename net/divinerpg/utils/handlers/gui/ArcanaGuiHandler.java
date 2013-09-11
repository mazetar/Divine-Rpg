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
import net.divinerpg.client.gui.GuiDatticon;
import net.divinerpg.client.gui.GuiDivineFurnace;
import net.divinerpg.client.gui.GuiExtractor;
import net.divinerpg.client.gui.GuiLeorna;
import net.divinerpg.client.gui.GuiVatticus;
import net.divinerpg.client.gui.GuiZelus;
import net.divinerpg.containers.ContainerCondenser;
import net.divinerpg.containers.ContainerDivineFurnace;
import net.divinerpg.containers.ContainerDivineMerchant;
import net.divinerpg.containers.ContainerExtractor;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.DivineUtil;
import net.divinerpg.utils.unused.GuiDemonFurnace;
import net.divinerpg.utils.unused.GuiGreenlightFurnace;
import net.divinerpg.utils.unused.GuiMoltenFurnace;
import net.divinerpg.utils.unused.GuiMoonlightFurnace;
import net.divinerpg.utils.unused.GuiOceanfireFurnace;
import net.divinerpg.utils.unused.GuiWhitefireFurnace;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class ArcanaGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int var1, int var2, int var3) {
        
        // Entity GUI's
        if (id == GuiRef.MERIK) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        else if (id == GuiRef.VATTICUS) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        else if (id == GuiRef.LEORNA) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        else if (id == GuiRef.ZELUS) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        else if (id == GuiRef.DATTICON) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(var1, world), world);
        }
        
        // Block GUI's
        else if (id == GuiRef.CONDENSER) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityCondenser)
                return new ContainerCondenser(player.inventory, (TileEntityCondenser)te);
        }
        else if (id == GuiRef.DEMON_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityDemonFurnace)
                return new ContainerDivineFurnace(player.inventory, (TileEntityDemonFurnace)te);
        }
        else if (id == GuiRef.MOLTEN_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityMoltenFurnace)
                return new ContainerDivineFurnace(player.inventory, (TileEntityMoltenFurnace)te);
        }
        else if (id == GuiRef.GREENLIGHT_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityGreenlightFurnace)
                return new ContainerDivineFurnace(player.inventory, (TileEntityGreenlightFurnace)te);
        }
        else if (id == GuiRef.WHITEFIRE_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityWhitefireFurnace)
                return new ContainerDivineFurnace(player.inventory, (TileEntityWhitefireFurnace)te);
        }
        else if (id == GuiRef.OCEANFIRE_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityOceanfireFurnace)
                return new ContainerDivineFurnace(player.inventory, (TileEntityOceanfireFurnace)te);
        }
        else if (id == GuiRef.MOONLIGHT_FURNACE) {
            TileEntity te = world.getBlockTileEntity(var1, var2, var3);
            if (te instanceof TileEntityMoonlightFurnace)
                return new ContainerDivineFurnace(player.inventory, (TileEntityMoonlightFurnace)te);
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
            return new GuiCaptainMerik((ContainerDivineMerchant)getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.VATTICUS) {
            return new GuiVatticus((ContainerDivineMerchant) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.LEORNA) {
            return new GuiLeorna((ContainerDivineMerchant)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.ZELUS) {
            return new GuiZelus((ContainerDivineMerchant) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.DATTICON) {
            return new GuiDatticon((ContainerDivineMerchant) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        else if (id == GuiRef.CONDENSER) {
            return new GuiCondenser((ContainerCondenser) this.getServerGuiElement(id, player, world, var1, var2, var3));
        }        
        
        else if (id == GuiRef.EXTRACTOR) {
            return new GuiExtractor((ContainerExtractor)this.getServerGuiElement(id, player, world, var1, var2, var3));
        }
        
        // IF ContainerDivineFurnace then return GuiDivineFurnace regardles of ID, so:
        Object obj = this.getServerGuiElement(id, player, world, var1, var2, var3);
        if (obj instanceof ContainerDivineFurnace)
            return new GuiDivineFurnace((ContainerDivineFurnace) obj);
        
        
        
        return null;
    }

}
