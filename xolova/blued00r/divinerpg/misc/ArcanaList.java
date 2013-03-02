package xolova.blued00r.divinerpg.misc;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;

public class ArcanaList 
{
	private static ArrayList arcanaList = new ArrayList(0);
	
	public static void add (String username)
	{
		arcanaList.ensureCapacity(arcanaList.size() + 1);
		arcanaList.add(new ArcanaBar(200, username));
	}
	
	public static ArcanaBar get (String par1)
	{
		for (int i = 0; i < arcanaList.size();i++)
		{
			if (((ArcanaBar)arcanaList.get(i)).playerID == par1)
			{
				return (ArcanaBar) arcanaList.get(i);
			}
		}
		
		add(par1);
		return get(par1);
	}
	
	public static void remove (String par1)
	{
		ArrayList var1 = arcanaList;
		for (int i = 0; i < var1.size();i++)
		{
			if (((ArcanaBar)var1.get(i)).playerID == par1)
			{
				var1.remove(i);
				var1.trimToSize();
			}
		}
	}
	
	public static void updateAllBars(List playerEntityList)
	{
		ArrayList var1 = arcanaList;
		for (int l = 0; l < playerEntityList.size(); l++)
		{
			for (int i = 0; i < var1.size();i++)
			{
				for (int n = 0; n < 2; ++n)
				{
					if (((ArcanaBar) var1.get(i)).playerID == ((EntityPlayer)playerEntityList.get(l)).username && ((ArcanaBar)var1.get(i)).getBarValue() < 200)
					{
						((ArcanaBar)var1.get(i)).arcanaRegen(1);
						ServerPacketHandler.sendArcanaPacket((int)(((ArcanaBar) var1.get(i)).getBarValue()), ((EntityPlayer)playerEntityList.get(l)));
					}
				}
			}
		}
	}
}
