package xolova.blued00r.divinerpg.misc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import xolova.blued00r.divinerpg.DivineRPG;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{
	private static final int var6 = 0;
	private int healTimer;

	public void tickStart(EnumSet var1, Object ... var2) {}

	public void tickEnd(EnumSet var1, Object ... var2)
	{
		onTickInGame();
		arcanaRegen();
	}

	public EnumSet ticks()
	{
		return EnumSet.of(TickType.SERVER);
	}

	public String getLabel()
	{
		return "DivineRPG Server Ticks";
	}

	public void onRenderTick() {}

	public void onTickInGUI(GuiScreen var1) {}

	public void arcanaRegen()
	{
		ArcanaList.updateAllBars(MinecraftServer.getServer().getConfigurationManager().playerEntityList);
	}

	public void onTickInGame()
	{
		ArrayList var3 = (ArrayList)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator var4 = var3.iterator();

		while (var4.hasNext())
		{
			EntityPlayerMP var5 = (EntityPlayerMP)var4.next();
			ItemStack boots = var5.inventory.armorInventory[0];
			ItemStack legs = var5.inventory.armorInventory[1];
			ItemStack chest = var5.inventory.armorInventory[2];
			ItemStack helm = var5.inventory.armorInventory[3];

			if (boots == null || legs == null || chest == null || helm == null)
			{
				if (var5.capabilities.isCreativeMode)
				{
					var5.capabilities.allowFlying = true;
				}
				else
				{
					var5.capabilities.allowFlying = false;
				}

			}
			else if (boots.itemID == DivineRPG.krakenBoots.itemID
					&& legs.itemID == DivineRPG.krakenLegs.itemID
					&& chest.itemID == DivineRPG.krakenBody.itemID
					&& helm.itemID == DivineRPG.krakenHead.itemID)
			{
				var5.setAir(300);
			}
			else if (boots.itemID == DivineRPG.aquastriveBoots.itemID
					&& legs.itemID == DivineRPG.aquastriveLegs.itemID
					&& chest.itemID == DivineRPG.aquastriveBody.itemID
					&& helm.itemID == DivineRPG.aquastriveHead.itemID)
			{
				var5.setAir(300);
			}
			else if (boots.itemID == DivineRPG.shadowBoots.itemID
					&& legs.itemID == DivineRPG.shadowLegs.itemID
					&& chest.itemID == DivineRPG.shadowBody.itemID
					&& helm.itemID == DivineRPG.shadowHead.itemID)
			{
			}

			else if (boots.itemID == DivineRPG.kormaBoots.itemID
					&& legs.itemID == DivineRPG.kormaLegs.itemID
					&& chest.itemID == DivineRPG.kormaBody.itemID
					&& helm.itemID == DivineRPG.kormaHead.itemID)
			{
				if(ArcanaList.get(var5.username).getBarValue() < 200)
				{
					ArcanaList.get(var5.username).arcanaAdd(1);
				}
			}

			else if (boots.itemID == DivineRPG.vemosBoots.itemID
					&& legs.itemID == DivineRPG.vemosLegs.itemID
					&& chest.itemID == DivineRPG.vemosBody.itemID
					&& helm.itemID == DivineRPG.vemosHead.itemID)
			{
	            if (this.healTimer == 4)
	            {
	                var5.heal(1);
	                this.healTimer = 0;
	            }
	            else
	            {
	                this.healTimer++;
	            }
			}
			else if (boots.itemID == DivineRPG.angelicBoots.itemID
					&& legs.itemID == DivineRPG.angelicLegs.itemID
					&& chest.itemID == DivineRPG.angelicBody.itemID
					&& helm.itemID == DivineRPG.angelicHead.itemID)
			{
				var5.fallDistance = 0.0F;
			}
			else if (boots.itemID == DivineRPG.bedrockBoots.itemID
					&& legs.itemID == DivineRPG.bedrockLegs.itemID
					&& chest.itemID == DivineRPG.bedrockBody.itemID
					&& helm.itemID == DivineRPG.bedrockHead.itemID)
			{
				var5.fallDistance = 0.0F;
			}
			else if (boots.itemID == DivineRPG.skeleManBoots.itemID
					&& legs.itemID == DivineRPG.skeleManLegs.itemID
					&& chest.itemID == DivineRPG.skeleManBody.itemID
					&& helm.itemID == DivineRPG.skeleManHead.itemID
					&& var5.getFoodStats().getFoodLevel() < 20)
			{
				var5.getFoodStats().addStats(1, 0);
			}
			else if (boots.itemID == DivineRPG.santaBoots.itemID
					&& legs.itemID == DivineRPG.santaLegs.itemID
					&& chest.itemID == DivineRPG.santaBody.itemID
					&& helm.itemID == DivineRPG.santaHead.itemID
					&& var5.worldObj.provider.dimensionId == DivineRPG.iceikaID)
			{
				var5.fallDistance = 0.0F;
				if (var5.getFoodStats().getFoodLevel() < 20)
				{
					var5.getFoodStats().addStats(1, 0);
				}
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
			}
			else if (boots.itemID == DivineRPG.denseBoots.itemID
					&& legs.itemID == DivineRPG.denseLegs.itemID
					&& chest.itemID == DivineRPG.denseBody.itemID
					&& helm.itemID == DivineRPG.denseHead.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 1));
			}
			else if (boots.itemID == DivineRPG.divineBoots.itemID
					&& legs.itemID == DivineRPG.divineLegs.itemID
					&& chest.itemID == DivineRPG.divineBody.itemID
					&& helm.itemID == DivineRPG.divineHead.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
			}
			else if (boots.itemID == DivineRPG.ultimaBoots.itemID
					&& legs.itemID == DivineRPG.ultimaLegs.itemID
					&& chest.itemID == DivineRPG.ultimaBody.itemID
					&& helm.itemID == DivineRPG.ultimaHead.itemID)
			{
				var5.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 3));
			}
			else if (boots.itemID == DivineRPG.azuriteBoots.itemID
					&& legs.itemID == DivineRPG.azuriteLegs.itemID
					&& chest.itemID == DivineRPG.azuriteBody.itemID
					&& helm.itemID == DivineRPG.azuriteHead.itemID
					&& var5.getAir() < 300
					&& var5.getHealth() < 20)
			{
				var5.heal(1);
			}
		}
	}
}
