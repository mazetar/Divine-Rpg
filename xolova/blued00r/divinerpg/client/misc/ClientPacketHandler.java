package xolova.blued00r.divinerpg.client.misc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import xolova.blued00r.divinerpg.misc.ArcanaList;

import net.minecraft.client.Minecraft;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ClientPacketHandler implements IPacketHandler
{
    public void onPacketData(INetworkManager var1, Packet250CustomPayload packet, Player player)
    {
        new DataInputStream(new ByteArrayInputStream(packet.data));
        
        if (packet.channel.equals("Arcana")) 
        {
            handleArcana(packet);
        }
    }
    
    private void handleArcana(Packet250CustomPayload packet) {
        DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
        
        int arcanaValue;
        
        try {
                arcanaValue = inputStream.readInt();
        } catch (IOException e) {
                e.printStackTrace();
                return;
        }
        
        ArcanaList.get(Minecraft.getMinecraft().thePlayer.username).setArcana(arcanaValue);
}
}
