package net.divinerpg.utils.handlers;

import java.awt.Color;
import java.awt.Point;
import java.util.EnumSet;
import java.util.Random;

import net.divinerpg.client.misc.VersionHelper;
import net.divinerpg.lib.ResourceLocs;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;


import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientTickHandler implements ITickHandler
{
	protected float zLevel = 0.0F;
	private static boolean initialized = false;
	private static boolean playedMusic = false;
	private Random rand;

	public void tickStart(EnumSet var1, Object ... mc)
	{
		//onTickInGame();
	}

	public void tickEnd(EnumSet var1, Object ... mc)
	{
		if (!var1.equals(EnumSet.of(TickType.RENDER)) && var1.equals(EnumSet.of(TickType.CLIENT)) && FMLClientHandler.instance().getClient().currentScreen == null && !initialized)
		{
			initialized = true;
			FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("\u00a71[DivineRPG] " + VersionHelper.getVersionMessage());
		}
		else if (var1.equals(EnumSet.of(TickType.RENDER)))
		{
			//onRenderTick();
		}
	}

	public EnumSet ticks()
	{
		return EnumSet.of(TickType.RENDER, TickType.CLIENT, TickType.PLAYER);
	}

	public String getLabel()
	{
		return "DivineRPG Client Ticks";
	}

	public void onRenderTick()
	{
		Minecraft mc = Minecraft.getMinecraft();
		GuiIngame gig = mc.ingameGUI;
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		World world = FMLClientHandler.instance().getClient().theWorld;
		int var29;
		int var19;
		int var26;
		int var47;
		
		int xBoss;
		int zBoss;

		boolean useVazkiiBar = true;
		
		if (mc.currentScreen == null)
		{
			if(!useVazkiiBar) {
				ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
				int i = scaledresolution.getScaledWidth();
				int k = scaledresolution.getScaledHeight();
				GL11.glBindTexture(GL11.GL_TEXTURE_2D, mc.renderEngine.func_110581_b(ResourceLocs.GUI_ARCANA_BAR).func_110552_b());
		        	var26 = k - 18 /*+ DivineRPG.ArcanaBarYoffset*/;
					var29 = i - 110 /*+ DivineRPG.ArcanaBarXoffset*/;
					gig.drawTexturedModalRect(var29, var26, 0, 0, 100, 9);
					//gig.drawTexturedModalRect(var29, var26, 0, 9, (int)(12.5 * (ArcanaHelper.get(mc.thePlayer.username).getBarValue() / 25)), 18);
			} else {				
				ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
				int width = scaledresolution.getScaledWidth();
				int height = scaledresolution.getScaledHeight();
				
				// ================== CONSTANTS ======================== //
				final int tempArcana = 400; // Test value!! Will be weird if it's larger than the barWidth!
				final int startY = (height - 30) * 2;
				final int startX = (width - 250) * 2;
				final int barHeight = 40;
				final int barWidth = 400;
				final int lines = 6;
				final int vertexes = 14;
				final int vertexSpread = 30;
				final int colorOutline = 0x8EC7FF;
				final int colorInside = 0x46A3FF;
				final int colorGray = 0x888888;
				final float insideBarWidth = 1.5F;
				final float outlineBarWidth =  3F;
				final float grayBarWidth = 2F;
				// ====================================================== //

				GL11.glPushMatrix();
				GL11.glScalef(0.5F, 0.5F, 0.5F);
				startDrawingLines();
				int distancePerVertex = (tempArcana / vertexes);
				int distancePer = (barHeight / lines);
				int lastX = 0;
				
				for(int i = 0; i < lines; i++) {
					int[] vertexArray = new int[vertexes + 1];
					vertexArray[0] = vertexArray[vertexes] = startY + distancePer * i;
					for(int j = 0; j < (vertexes - 1); j++)
						vertexArray[j + 1] = (int) Math.round(((startY + distancePer * i) + (Math.random() - 0.5) * vertexSpread));
					
					for(int j = 0; j < vertexes; j++) {
						drawSimpleLine(new Point(startX + distancePerVertex * j, vertexArray[j]), new Point(startX + distancePerVertex * (j + 1), vertexArray[j + 1]), outlineBarWidth, colorOutline, 0.6F);
						drawSimpleLine(new Point(startX + distancePerVertex * j, vertexArray[j]), new Point(startX + distancePerVertex * (j + 1), vertexArray[j + 1]), insideBarWidth, colorInside, 1F);
						lastX = startX + distancePerVertex * (j + 1);
					}	
				}
				
				for(int i = 0; i < lines; i++)
					drawSimpleLine(new Point(lastX, startY + distancePer * i), new Point(startX + barWidth, startY + distancePer * i), grayBarWidth, colorGray, 1F);
				endDrawingLines();
				GL11.glPopMatrix();
			}
			
		}
		/*EntityAncient entity = new EntityAncient(world);
		if(mc.currentScreen == null && entity != null)
		{
			ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			xBoss = i / 2;
			zBoss = k / 2 - 20;			
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, mc.renderEngine.getTexture("/DivineRPG/bossBars/AncientEntity.png"));
			gig.drawTexturedModalRect(xBoss, zBoss, 0, 0, 91, 10);
			gig.drawTexturedModalRect(xBoss, zBoss, 0, 10, entity.getDragonHealth() / 18, 20);
		}*/
	}
	
	/** Sets the GL values to draw lines **/
	public static void startDrawingLines() {
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	}
	
	/** Draws a line in the plane from point A to point B **/
	public static void drawSimpleLine(Point pointA, Point pointB, float width, int color, float transparency) {
		GL11.glLineWidth(width);
		GL11.glBegin(GL11.GL_LINES);
		Color colorRGB = new Color(color);
		GL11.glColor4ub((byte) colorRGB.getRed(), (byte) colorRGB.getGreen(), (byte) colorRGB.getBlue(), (byte) (transparency * 255));
		GL11.glVertex2i(pointA.x, pointA.y);
		GL11.glVertex2i(pointB.x, pointB.y);
		GL11.glEnd();
	}

	/** Reverts the GL values for drawing lines **/
	public static void endDrawingLines() {
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glColor4f(1F, 1F, 1F, 1F);
	}

	public void onTickInGUI(GuiScreen var1) {}

	public void onTickInGame()
	{
		Minecraft mc = Minecraft.getMinecraft();
		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
		WorldClient world = mc.theWorld;

		if (player != null)
		{
			ItemStack boots = player.inventory.armorInventory[0];
			ItemStack legs = player.inventory.armorInventory[1];
			ItemStack chest = player.inventory.armorInventory[2];
			ItemStack helm = player.inventory.armorInventory[3];
			if ((boots == null || legs == null || chest == null || helm == null))
			{
				if (player.capabilities.isCreativeMode)
				{
					player.capabilities.allowFlying = true;
				}
				else
				{
					player.capabilities.allowFlying = false;
					player.capabilities.isFlying = false;
				}
				//player.capabilities.setFlySpeed(0.1F);
			}
			else if (boots.itemID == OverworldItemHelper.angelicBoots.itemID
					&& legs.itemID == OverworldItemHelper.angelicLegs.itemID
					&& chest.itemID == OverworldItemHelper.angelicBody.itemID
					&& helm.itemID == OverworldItemHelper.angelicHelmet.itemID)
			{
				player.capabilities.allowFlying = true;
				
				//minecraftInstance.thePlayer.isImmuneToFire = true; //<--That line will make the player immune to fire.
				//minecraftInstance.thePlayer.fallDistance = 0;
				//minecraftInstance.thePlayer.fireResistance(20);
				//minecraftInstance.thePlayer.capabilities.isFlying = true; //<-- That line may make the player fly, but I'm not entirely sure.
			}
			/*else if (boots.itemID == OverworldItemHelper.shadowBoots.itemID
					&& legs.itemID == OverworldItemHelper.shadowLegs.itemID
					&& chest.itemID == OverworldItemHelper.shadowBody.itemID
					&& helm.itemID == OverworldItemHelper.shadowHead.itemID)
			{
				var3.capabilities.func_82877_b(0.2F);
			}
			else if (boots.itemID == OverworldItemHelper.santaBoots.itemID
					&& legs.itemID == OverworldItemHelper.santaLegs.itemID
					&& chest.itemID == OverworldItemHelper.santaBody.itemID
					&& helm.itemID == OverworldItemHelper.santaHead.itemID)
			{
				var3.capabilities.func_82877_b(0.2F);
			}
			else if (boots.itemID == OverworldItemHelper.glisteningBoots.itemID
					&& legs.itemID == OverworldItemHelper.glisteningLegs.itemID
					&& chest.itemID == OverworldItemHelper.glisteningChest.itemID
					&& helm.itemID == OverworldItemHelper.glisteningHelmetRanged.itemID)
			{
				var3.capabilities.func_82877_b(0.14F);
			}
			else if (boots.itemID == OverworldItemHelper.demonizedBoots.itemID
					&& legs.itemID == OverworldItemHelper.demonizedLegs.itemID
					&& chest.itemID == OverworldItemHelper.demonizedChest.itemID
					&& helm.itemID == OverworldItemHelper.demonizedHelmetRanged.itemID)
			{
				var3.capabilities.func_82877_b(0.18F);
			}
			else if (boots.itemID == OverworldItemHelper.tormentedBoots.itemID
					&& legs.itemID == OverworldItemHelper.tormentedLegs.itemID
					&& chest.itemID == OverworldItemHelper.tormentedChest.itemID
					&& helm.itemID == OverworldItemHelper.tormentedHelmetRanged.itemID)
			{
				var3.capabilities.func_82877_b(0.2F);
			}
			else if (boots.itemID == OverworldItemHelper.aquastriveBoots.itemID
					&& legs.itemID == OverworldItemHelper.aquastriveLegs.itemID
					&& chest.itemID == OverworldItemHelper.aquastriveBody.itemID
					&& helm.itemID == OverworldItemHelper.aquastriveHead.itemID)
			{
				int var5 = MathHelper.floor_double(var3.posX);
				int var6 = MathHelper.floor_double(var3.posY - 2.0D);
				int var7 = MathHelper.floor_double(var3.posZ);

				if (var4.getBlockId(var5, var6, var7) != Block.ice.blockID)
				{
					if (var3.isInWater())
					{
						var3.motionX *= 1.045D;
						var3.motionZ *= 1.045D;
					}

					if (var3.motionX > 1.045D || var3.motionZ > 1.045D)
					{
						var3.motionX = 1.045D;
						var3.motionZ = 1.045D;
					}

					if (var3.motionX < -1.045D || var3.motionX < -1.045D)
					{
						var3.motionX = -1.045D;
						var3.motionZ = -1.045D;
					}
				}
			}
			else
			{
				var3.capabilities.func_82877_b(0.1F);
			}*/
		}
	}
}
