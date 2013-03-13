package xolova.blued00r.divinerpg.misc;

import net.minecraft.client.gui.GuiScreen;

public class BossBar extends GuiScreen
{
	public int health;
	public BossBar(int health)
	{
		this.health = health;
	}
}
