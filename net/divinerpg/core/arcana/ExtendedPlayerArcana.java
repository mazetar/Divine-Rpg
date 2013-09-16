package net.divinerpg.core.arcana;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.divinerpg.core.PacketHandler;
import net.divinerpg.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;

public class ExtendedPlayerArcana implements IExtendedEntityProperties{

    public final static String PropertiesName = "Arcana";
    public static int MaxArcana = 200;
    private final EntityPlayer player;
    
    private int arcanaValue;
    
    public ExtendedPlayerArcana(EntityPlayer player) {
        this.player = player;
        this.arcanaValue = 0;
    }
    
    @Override
    public void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = new NBTTagCompound();
        properties.setInteger("CurrentArcana", this.arcanaValue);
        compound.setTag(PropertiesName, properties);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(PropertiesName);
        this.arcanaValue = properties.getInteger("CurrentArcana");
    }

    @Override
    public void init(Entity entity, World world) {
        
        
    }
    public static ExtendedPlayerArcana get(EntityPlayer player)
    {
    return (ExtendedPlayerArcana) player.getExtendedProperties(PropertiesName);
    }
    
    private static String getSaveKey(EntityPlayer player) {
        return player.username + ":" + PropertiesName;
        }
    
    public static void saveProxyData(EntityPlayer player) {
        ExtendedPlayerArcana playerData = ExtendedPlayerArcana.get(player);
        NBTTagCompound savedData = new NBTTagCompound();

        playerData.saveNBTData(savedData);
        ArcanaSystem.storeEntityData(getSaveKey(player), savedData);
        }
    public static void loadProxyData(EntityPlayer player) {
        ExtendedPlayerArcana playerData = ExtendedPlayerArcana.get(player);
        NBTTagCompound savedData = ArcanaSystem.getEntityData(getSaveKey(player));

        if(savedData != null) {
            playerData.loadNBTData(savedData);
        }
        // note we renamed 'syncExtendedProperties' to 'syncProperties' because yay, it's shorter
        playerData.syncExtendedProperties();
    }
    
    public final void syncExtendedProperties()
    {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side != Side.SERVER) {
            return; // This will only be sent from server to client.
        }
            
        ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
        DataOutputStream outputStream = new DataOutputStream(bos);

        try {
            outputStream.writeInt(PacketHandler.ArcanaClientUpdate); // Packet ID first.
            // Then write the values in order
            outputStream.writeInt(this.arcanaValue);
            //TODO: Add regen and such info here as well.
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Packet250CustomPayload packet = new Packet250CustomPayload();
        packet.channel = Reference.MAIN_MOD_CHANNEL;
        packet.data = bos.toByteArray();
        packet.length = bos.size();
        
        PacketDispatcher.sendPacketToPlayer(packet, (Player) player);
        
    }
}
