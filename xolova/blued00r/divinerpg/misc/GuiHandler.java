package xolova.blued00r.divinerpg.misc;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.client.gui.GuiCaptainMerik;
import xolova.blued00r.divinerpg.client.gui.GuiCondenser;
import xolova.blued00r.divinerpg.client.gui.GuiDatticon;
import xolova.blued00r.divinerpg.client.gui.GuiDemonFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiDreamLamp;
import xolova.blued00r.divinerpg.client.gui.GuiExtractinator;
import xolova.blued00r.divinerpg.client.gui.GuiGreenlightFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiHungerHungry;
import xolova.blued00r.divinerpg.client.gui.GuiInfusionTable;
import xolova.blued00r.divinerpg.client.gui.GuiJackOMan;
import xolova.blued00r.divinerpg.client.gui.GuiLeorna;
import xolova.blued00r.divinerpg.client.gui.GuiMoltenFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiMoonlightFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiOceanfireFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiStoneFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiSuperEnchant;
import xolova.blued00r.divinerpg.client.gui.GuiTinkerer;
import xolova.blued00r.divinerpg.client.gui.GuiVatticus;
import xolova.blued00r.divinerpg.client.gui.GuiWhitefireFurnace;
import xolova.blued00r.divinerpg.client.gui.GuiWorkshopMerchant;
import xolova.blued00r.divinerpg.client.gui.GuiZelus;
import xolova.blued00r.divinerpg.containers.ContainerCoalStoneFurnace;
import xolova.blued00r.divinerpg.containers.ContainerCondenser;
import xolova.blued00r.divinerpg.containers.ContainerDatticon;
import xolova.blued00r.divinerpg.containers.ContainerDemonFurnace;
import xolova.blued00r.divinerpg.containers.ContainerDreamLamp;
import xolova.blued00r.divinerpg.containers.ContainerExtractinator;
import xolova.blued00r.divinerpg.containers.ContainerGreenlightFurnace;
import xolova.blued00r.divinerpg.containers.ContainerHungerHungry;
import xolova.blued00r.divinerpg.containers.ContainerInfusionTable;
import xolova.blued00r.divinerpg.containers.ContainerLeorna;
import xolova.blued00r.divinerpg.containers.ContainerMerik;
import xolova.blued00r.divinerpg.containers.ContainerMoltenFurnace;
import xolova.blued00r.divinerpg.containers.ContainerMoonlightFurnace;
import xolova.blued00r.divinerpg.containers.ContainerOceanfireFurnace;
import xolova.blued00r.divinerpg.containers.ContainerSuperEnchant;
import xolova.blued00r.divinerpg.containers.ContainerTinkerer;
import xolova.blued00r.divinerpg.containers.ContainerVatticus;
import xolova.blued00r.divinerpg.containers.ContainerWhitefireFurnace;
import xolova.blued00r.divinerpg.containers.ContainerWorkshopMerchant;
import xolova.blued00r.divinerpg.containers.ContainerZelus;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopMerchant;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopTickerer;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityCaptianMerik;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityDatticon;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityHungerHungry;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityJackOMan;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityLeorna;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityVatticus;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityZelus;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityCoalStoneFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityCondenser;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDemonFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDreamLamp;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityExtractinator;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityGreenlightFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityMoltenFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityMoonlightFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityOceanfireFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityWhitefireFurnace;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    public IMerchant theMerchant;

    @Override
    public Object getServerGuiElement(int var1, EntityPlayer var2, World var3, int var4, int var5, int var6)
    {
        TileEntity var7 = var3.getBlockTileEntity(var4, var5, var6);

        switch (var1)
        {
            case 0:
                return new ContainerSuperEnchant(var2.inventory, var3, var4, var5, var6);

            case 1:
                return new ContainerMoltenFurnace(var2.inventory, (TileEntityMoltenFurnace) var7);

            case 2:
                return new ContainerGreenlightFurnace(var2.inventory, (TileEntityGreenlightFurnace) var7);

            case 3:
                return new ContainerLeorna(var2.inventory, ((EntityLeorna) var3.getEntityByID(var4)).leornaInv(), var3);

            case 4:
                return new ContainerDemonFurnace(var2.inventory, (TileEntityDemonFurnace) var7);

            case 5:
                return new ContainerMerik(var2.inventory, ((EntityCaptianMerik) var3.getEntityByID(var4)).leornaInv(), var3);

            case 6:
                return new ContainerDatticon(var2.inventory, ((EntityDatticon) var3.getEntityByID(var4)).leornaInv(), var3);

            case 7:
                return new ContainerVatticus(var2.inventory, ((EntityVatticus) var3.getEntityByID(var4)).leornaInv(), var3);

            case 8:
                return new ContainerZelus(var2.inventory, ((EntityZelus) var3.getEntityByID(var4)).leornaInv(), var3);
                
            case 9:
                return new ContainerZelus(var2.inventory, ((EntityJackOMan) var3.getEntityByID(var4)).leornaInv(), var3);
                
            case 10:
                return new ContainerMoonlightFurnace(var2.inventory, (TileEntityMoonlightFurnace) var7);

            case 11:
                return new ContainerWhitefireFurnace(var2.inventory, (TileEntityWhitefireFurnace) var7);
            case 12:
                return new ContainerOceanfireFurnace(var2.inventory, (TileEntityOceanfireFurnace) var7);
            case 13:
            	return new ContainerCondenser(var2.inventory, (TileEntityCondenser)var7);
            case 14:
            	return new ContainerTinkerer(var2.inventory, ((EntityWorkshopTickerer) var3.getEntityByID(var4)).leornaInv(), var3);
            case 15:
            	return new ContainerWorkshopMerchant(var2.inventory, ((EntityWorkshopMerchant) var3.getEntityByID(var4)).leornaInv(), var3);
            case 16:
            	return new ContainerExtractinator(var2.inventory, (TileEntityExtractinator)var7);
            case 17:
            	return new ContainerCoalStoneFurnace(var2.inventory, (TileEntityCoalStoneFurnace)var7);
            case 18:
            	return new ContainerInfusionTable(var2.inventory, (TileEntityInfusionTable)var7);
            case 19:
            	return new ContainerDreamLamp(var2.inventory, (TileEntityDreamLamp)var7);
            case 20:
                return new ContainerHungerHungry(var2.inventory, ((EntityHungerHungry) var3.getEntityByID(var4)).leornaInv(), var3);

        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int var1, EntityPlayer var2, World var3, int var4, int var5, int var6)
    {
        TileEntity var7 = var3.getBlockTileEntity(var4, var5, var6);

        switch (var1)
        {
            case 0:
                return new GuiSuperEnchant(var2.inventory, var3, var4, var5, var6);

            case 1:
                return new GuiMoltenFurnace(var2.inventory, (TileEntityMoltenFurnace) var7);

            case 2:
                return new GuiGreenlightFurnace(var2.inventory, (TileEntityGreenlightFurnace) var7);

            case 3:
                return new GuiLeorna(var2.inventory, ((EntityLeorna) var3.getEntityByID(var4)).leornaInv(), var3);

            case 4:
                return new GuiDemonFurnace(var2.inventory, (TileEntityDemonFurnace) var7);

            case 5:
                return new GuiCaptainMerik(var2.inventory, ((EntityCaptianMerik) var3.getEntityByID(var4)).leornaInv(), var3);

            case 6:
                return new GuiDatticon(var2.inventory, ((EntityDatticon) var3.getEntityByID(var4)).leornaInv(), var3);

            case 7:
                return new GuiVatticus(var2.inventory, ((EntityVatticus) var3.getEntityByID(var4)).leornaInv(), var3);

            case 8:
                return new GuiZelus(var2.inventory, ((EntityZelus) var3.getEntityByID(var4)).leornaInv(), var3);
                
            case 9:
                return new GuiJackOMan(var2.inventory, ((EntityJackOMan) var3.getEntityByID(var4)).leornaInv(), var3);
                
            case 10:
                return new GuiMoonlightFurnace(var2.inventory, (TileEntityMoonlightFurnace) var7);

            case 11:
                return new GuiWhitefireFurnace(var2.inventory, (TileEntityWhitefireFurnace) var7);
            case 12:
                return new GuiOceanfireFurnace(var2.inventory, (TileEntityOceanfireFurnace) var7);
            case 13:
            	return new GuiCondenser(var2.inventory, (TileEntityCondenser)var7);
            	
            case 14:
            	return new GuiTinkerer(var2.inventory, ((EntityWorkshopTickerer) var3.getEntityByID(var4)).leornaInv(), var3);
            case 15:
            	return new GuiWorkshopMerchant(var2.inventory, ((EntityWorkshopMerchant) var3.getEntityByID(var4)).leornaInv(), var3);
            case 16:
            	return new GuiExtractinator(var2.inventory, (TileEntityExtractinator)var7);
            case 17:
            	return new GuiStoneFurnace(var2.inventory, (TileEntityCoalStoneFurnace)var7);
            case 18:
            	return new GuiInfusionTable(var2.inventory, (TileEntityInfusionTable)var7);
            case 19:
            	return new GuiDreamLamp(var2.inventory, (TileEntityDreamLamp)var7);
            case 20:
                return new GuiHungerHungry(var2.inventory, ((EntityHungerHungry) var3.getEntityByID(var4)).leornaInv(), var3);

        }

        return null;
    }
}
