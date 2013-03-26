package xolova.divinerpg.renders.iceika;

import java.awt.Color;

import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.renders.RenderBlock;

public class RenderFrostclawProjectile extends RenderBlock {
	
	private static Color color = new Color(100, 229, 252);
	
	@Override
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
		GL11.glPushMatrix();
		GL11.glColor3ub((byte) color.getRed(), (byte) color.getGreen(), (byte) color.getBlue());
		super.doRender(var1, var2, var4, var6, var8, var9);
		GL11.glPopMatrix();
	}

}
