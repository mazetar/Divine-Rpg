package xolova.divinerpg.main.proxy;

import xolova.divinerpg.utils.Blocks;
import xolova.divinerpg.utils.Items;
import xolova.divinerpg.utils.Naming;

public class MainProxy 
{
	public static void init()
	{
		Blocks.init();
		Items.init();
		Naming.init();
	}
}
