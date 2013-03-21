package xolova.divinerpg.utils.helpers;

import java.util.HashMap;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;

public class ArcanaHelper {
	public static HashMap<String, Integer> bars = new HashMap<String, Integer>();
	public static HashMap<String, Integer> delays = new HashMap<String, Integer>();

	public static void add (String username)
	{
		bars.put(username, 200);
		delays.put(username, 0);
	}

	public static void remove (String par1)
	{
		bars.remove(par1);
		delays.remove(par1);
	}

	public static void updateAllBars(List<EntityPlayer> players)
	{
		for (int l = 0; l < players.size(); l++)
		{
			String user = players.get(l).username;
			if (delays.get(user) == 0)
			{
				bars.put(user, bars.get(user) + 1);
			}
			else if (delays.containsKey(user))
				delays.put(user, delays.get(user) - 1);
			else
				add(user);
			
		}
	}
	
	public static boolean useBar(EntityPlayer user, int amount)
	{
		String name = user.username;
		if (!bars.containsKey(name))
		{
			add(name);
			return false;
		}
		
		if (bars.get(name) > amount)
		{
			bars.put(name, bars.get(name) - amount);
			delays.put(name, 30);
			return true;
		}
		else
			return false;
	}
}
