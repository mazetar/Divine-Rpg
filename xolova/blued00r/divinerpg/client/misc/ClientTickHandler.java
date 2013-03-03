package xolova.blued00r.divinerpg.client.misc;

import java.util.EnumSet;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraft.util.MathHelper;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.misc.ArcanaBar;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;
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
		onTickInGame();
	}

	public void tickEnd(EnumSet var1, Object ... mc)
	{
		if (!var1.equals(EnumSet.of(TickType.RENDER)) && var1.equals(EnumSet.of(TickType.CLIENT)) && FMLClientHandler.instance().getClient().currentScreen == null && !initialized)
		{
			initialized = true;
			FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage("\u00a71[DivineRPG] " + VersionHelper.getResultMessage());
		}
		else if (var1.equals(EnumSet.of(TickType.RENDER)))
		{
			onRenderTick();
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
		int var29;
		int var19;
		int var26;
		int var47;

		if (mc.currentScreen == null)
		{
			ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			var19 = i / 2 + 15;
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, mc.renderEngine.getTexture("/DivineRPG/arcanabartexturesheet.png"));


				var26 = k - 49;
				var29 = var19 - 17;
				gig.drawTexturedModalRect(var29, var26, 0, 0, 82, 5);
				gig.drawTexturedModalRect(var29, var26, 0, 5, (int)(10.25 * (ArcanaList.get(mc.thePlayer.username).getBarValue() / 25)), 5);


		}
	}

	public void onTickInGUI(GuiScreen var1) {}

	public void onTickInGame()
	{
		Minecraft mc = Minecraft.getMinecraft();
		EntityClientPlayerMP var3 = Minecraft.getMinecraft().thePlayer;
		WorldClient var4 = mc.theWorld;

		if (var3 != null)
		{
			ItemStack boots = var3.inventory.armorInventory[0];
			ItemStack legs = var3.inventory.armorInventory[1];
			ItemStack chest = var3.inventory.armorInventory[2];
			ItemStack helm = var3.inventory.armorInventory[3];

			if (boots == null || legs == null || chest == null || helm == null)
			{
				if (var3.capabilities.isCreativeMode)
				{
					var3.capabilities.allowFlying = true;
				}
				else
				{
					var3.capabilities.allowFlying = false;
				}
				
				var3.capabilities.func_82877_b(0.1F);
			}
			else if (boots.itemID == DivineRPG.angelicBoots.itemID
					&& legs.itemID == DivineRPG.angelicLegs.itemID
					&& chest.itemID == DivineRPG.angelicBody.itemID
					&& helm.itemID == DivineRPG.angelicHead.itemID)
			{
				var3.capabilities.allowFlying = true;
				
				var3.addStat(AchievementPageDivineRPG.whenPigsFly, 1);
				//minecraftInstance.thePlayer.isImmuneToFire = true; //<--That line will make the player immune to fire.
				//minecraftInstance.thePlayer.fallDistance = 0;
				//minecraftInstance.thePlayer.fireResistance(20);
				//minecraftInstance.thePlayer.capabilities.isFlying = true; //<-- That line may make the player fly, but I'm not entirely sure.
			}
			else if (boots.itemID == DivineRPG.shadowBoots.itemID
					&& legs.itemID == DivineRPG.shadowLegs.itemID
					&& chest.itemID == DivineRPG.shadowBody.itemID
					&& helm.itemID == DivineRPG.shadowHead.itemID)
			{
				var3.capabilities.func_82877_b(0.2F);
			}
			else if (boots.itemID == DivineRPG.santaBoots.itemID
					&& legs.itemID == DivineRPG.santaLegs.itemID
					&& chest.itemID == DivineRPG.santaBody.itemID
					&& helm.itemID == DivineRPG.santaHead.itemID)
			{
				var3.capabilities.func_82877_b(0.2F);
			}
			else if (boots.itemID == DivineRPG.glisteningBoots.itemID
					&& legs.itemID == DivineRPG.glisteningLegs.itemID
					&& chest.itemID == DivineRPG.glisteningChest.itemID
					&& helm.itemID == DivineRPG.glisteningHelmetRanged.itemID)
			{
				var3.capabilities.func_82877_b(0.14F);
			}
			else if (boots.itemID == DivineRPG.demonizedBoots.itemID
					&& legs.itemID == DivineRPG.demonizedLegs.itemID
					&& chest.itemID == DivineRPG.demonizedChest.itemID
					&& helm.itemID == DivineRPG.demonizedHelmetRanged.itemID)
			{
				var3.capabilities.func_82877_b(0.18F);
			}
			else if (boots.itemID == DivineRPG.tormentedBoots.itemID
					&& legs.itemID == DivineRPG.tormentedLegs.itemID
					&& chest.itemID == DivineRPG.tormentedChest.itemID
					&& helm.itemID == DivineRPG.tormentedHelmetRanged.itemID)
			{
				var3.capabilities.func_82877_b(0.2F);
			}
			else if (boots.itemID == DivineRPG.aquastriveBoots.itemID
					&& legs.itemID == DivineRPG.aquastriveLegs.itemID
					&& chest.itemID == DivineRPG.aquastriveBody.itemID
					&& helm.itemID == DivineRPG.aquastriveHead.itemID)
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
			}
		}
	}
}
