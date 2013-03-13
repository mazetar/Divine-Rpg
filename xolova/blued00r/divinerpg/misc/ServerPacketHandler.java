package xolova.blued00r.divinerpg.misc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class ServerPacketHandler implements IPacketHandler
{
    public void onPacketData(INetworkManager var1, Packet250CustomPayload var2, Player var3)
    {
        new DataInputStream(new ByteArrayInputStream(var2.data));
        EntityPlayer var5 = (EntityPlayer)var3;
    }
    
    public static void sendArcanaPacket(int par1, EntityPlayer player)
    {
    	int arcanaValue = par1;

    	ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
    	DataOutputStream outputStream = new DataOutputStream(bos);
    	try {
    	        outputStream.writeInt(arcanaValue);
    	} catch (Exception ex) {
    	        ex.printStackTrace();
    	}

    	Packet250CustomPayload packet = new Packet250CustomPayload();
    	packet.channel = "Arcana";
    	packet.data = bos.toByteArray();
    	packet.length = bos.size();
    	
    	PacketDispatcher.sendPacketToPlayer(packet, (Player)player);
    }
}
