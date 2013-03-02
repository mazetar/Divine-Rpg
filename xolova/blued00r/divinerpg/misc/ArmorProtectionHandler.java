package xolova.blued00r.divinerpg.misc;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ArmorProtectionHandler 
{
	@ForgeSubscribe
    public void onLivingHurtEvent(LivingHurtEvent e)
    {
		if (e.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer var5 = (EntityPlayer)e.entityLiving;
			ItemStack boots = var5.inventory.armorInventory[0];
			ItemStack legs = var5.inventory.armorInventory[1];
			ItemStack chest = var5.inventory.armorInventory[2];
			ItemStack helm = var5.inventory.armorInventory[3];
			
			DamageSource s = e.source;
			if (boots != null && legs != null && chest != null && helm != null)
			{
				//Netherite
				if (boots.itemID == DivineRPG.netheriteBoots.itemID
						&& legs.itemID == DivineRPG.netheriteLegs.itemID
						&& chest.itemID == DivineRPG.netheriteBody.itemID
						&& helm.itemID == DivineRPG.netheriteHead.itemID)
				{
					if (s.equals(DamageSource.inFire) || s.equals(DamageSource.onFire))
					{
						e.setCanceled(true);
					}
				}
				
				//Inferno
				else if (boots.itemID == DivineRPG.infernoBoots.itemID
						&& legs.itemID == DivineRPG.infernoLegs.itemID
						&& chest.itemID == DivineRPG.infernoBody.itemID
						&& helm.itemID == DivineRPG.infernoHead.itemID)
				{
					if (s == DamageSource.inFire || s == DamageSource.onFire || s == DamageSource.lava)
					{
						e.setCanceled(true);
					}
				}
				
				//Wither Reaper
				else if (boots.itemID == DivineRPG.grimReaperBoots.itemID
						&& legs.itemID == DivineRPG.grimReaperLegs.itemID
						&& chest.itemID == DivineRPG.grimReaperBody.itemID
						&& helm.itemID == DivineRPG.grimReaperHead.itemID)
				{
					if (s == DamageSource.wither)
					{
						e.setCanceled(true);
					}
				}
				
				//Ender
				else if (boots.itemID == DivineRPG.enderBoots.itemID
						&& legs.itemID == DivineRPG.enderLegs.itemID
						&& chest.itemID == DivineRPG.enderBody.itemID
						&& helm.itemID == DivineRPG.enderHead.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2)
					{
						e.setCanceled(true);
					}
				}
				
				//Red Ender
				else if (boots.itemID == DivineRPG.enderBootsRed.itemID
						&& legs.itemID == DivineRPG.enderLegsRed.itemID
						&& chest.itemID == DivineRPG.enderBodyRed.itemID
						&& helm.itemID == DivineRPG.enderHeadRed.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2)
					{
						e.setCanceled(true);
					}
				}
				
				//Blue Ender
				else if (boots.itemID == DivineRPG.enderBootsBlue.itemID
						&& legs.itemID == DivineRPG.enderLegsBlue.itemID
						&& chest.itemID == DivineRPG.enderBodyBlue.itemID
						&& helm.itemID == DivineRPG.enderHeadBlue.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2)
					{
						e.setCanceled(true);
					}
				}
				
				//Green Ender
				else if (boots.itemID == DivineRPG.enderBootsGreen.itemID
						&& legs.itemID == DivineRPG.enderLegsGreen.itemID
						&& chest.itemID == DivineRPG.enderBodyGreen.itemID
						&& helm.itemID == DivineRPG.enderHeadGreen.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2)
					{
						e.setCanceled(true);
					}
				}
				
				//Yellow Ender
				else if (boots.itemID == DivineRPG.enderBootsYellow.itemID
						&& legs.itemID == DivineRPG.enderLegsYellow.itemID
						&& chest.itemID == DivineRPG.enderBodyYellow.itemID
						&& helm.itemID == DivineRPG.enderHeadYellow.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2)
					{
						e.setCanceled(true);
					}
				}
				
				//Black Ender
				else if (boots.itemID == DivineRPG.enderBootsBlack.itemID
						&& legs.itemID == DivineRPG.enderLegsBlack.itemID
						&& chest.itemID == DivineRPG.enderBodyBlack.itemID
						&& helm.itemID == DivineRPG.enderHeadBlack.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2)
					{
						e.setCanceled(true);
					}
				}
				
				//Bedrock
				else if (boots.itemID == DivineRPG.bedrockBoots.itemID
						&& legs.itemID == DivineRPG.bedrockLegs.itemID
						&& chest.itemID == DivineRPG.bedrockBody.itemID
						&& helm.itemID == DivineRPG.bedrockHead.itemID)
				{
					if (s == DamageSource.explosion || s == DamageSource.explosion2 ||
							s == DamageSource.lava || s == DamageSource.inFire || s == DamageSource.onFire)
					{
						e.setCanceled(true);
					}
				}
				
				//Elite Realmite
				else if (boots.itemID == DivineRPG.eliteRealmiteBoots.itemID
						&& legs.itemID == DivineRPG.eliteRealmiteLegs.itemID
						&& chest.itemID == DivineRPG.eliteRealmiteBody.itemID
						&& helm.itemID == DivineRPG.eliteRealmiteHead.itemID)
				{
					if (s == DamageSource.fall)
					{
						e.setCanceled(true);
					}
				}
				
				//Arlemite
				else if (boots.itemID == DivineRPG.crystonalBoots.itemID
						&& legs.itemID == DivineRPG.crystonalLegs.itemID
						&& chest.itemID == DivineRPG.crystonalBody.itemID
						&& helm.itemID == DivineRPG.crystonalHead.itemID)
				{
					if (s.isProjectile() || s.damageType.equals("thrown"))
					{
						e.ammount *= 0.2;
					}
				}
				
				//Rupee
				else if (boots.itemID == DivineRPG.plasmaBoots.itemID
						&& legs.itemID == DivineRPG.plasmaLegs.itemID
						&& chest.itemID == DivineRPG.plasmaBody.itemID
						&& helm.itemID == DivineRPG.plasmaHead.itemID)
				{
					if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
					{
						e.ammount *= 0.2;
					}
				}
				
				//Rupee Red
				else if (boots.itemID == DivineRPG.plasmaBootsRed.itemID
						&& legs.itemID == DivineRPG.plasmaLegsRed.itemID
						&& chest.itemID == DivineRPG.plasmaBodyRed.itemID
						&& helm.itemID == DivineRPG.plasmaHeadRed.itemID)
				{
					if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
					{
						e.ammount *= 0.2;
					}
				}
				
				//Rupee Green
				else if (boots.itemID == DivineRPG.plasmaBootsGreen.itemID
						&& legs.itemID == DivineRPG.plasmaLegsGreen.itemID
						&& chest.itemID == DivineRPG.plasmaBodyGreen.itemID
						&& helm.itemID == DivineRPG.plasmaHeadGreen.itemID)
				{
					if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
					{
						e.ammount *= 0.2;
					}
				}
				
				//Rupee Yellow
				else if (boots.itemID == DivineRPG.plasmaBootsYellow.itemID
						&& legs.itemID == DivineRPG.plasmaLegsYellow.itemID
						&& chest.itemID == DivineRPG.plasmaBodyYellow.itemID
						&& helm.itemID == DivineRPG.plasmaHeadYellow.itemID)
				{
					if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
					{
						e.ammount *= 0.2;
					}
				}
				
				//Rupee Blue
				else if (boots.itemID == DivineRPG.plasmaBootsBlue.itemID
						&& legs.itemID == DivineRPG.plasmaLegsBlue.itemID
						&& chest.itemID == DivineRPG.plasmaBodyBlue.itemID
						&& helm.itemID == DivineRPG.plasmaHeadBlue.itemID)
				{
					if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
					{
						e.ammount *= 0.2;
					}
				}
				
				//Rupee Black
				else if (boots.itemID == DivineRPG.plasmaBootsBlack.itemID
						&& legs.itemID == DivineRPG.plasmaLegsBlack.itemID
						&& chest.itemID == DivineRPG.plasmaBodyBlack.itemID
						&& helm.itemID == DivineRPG.plasmaHeadBlack.itemID)
				{
					if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
					{
						e.ammount *= 0.2;
					}
				}
				
				//santa
				else if (boots.itemID == DivineRPG.santaBoots.itemID
						&& legs.itemID == DivineRPG.santaLegs.itemID
						&& chest.itemID == DivineRPG.santaBody.itemID
						&& helm.itemID == DivineRPG.santaHead.itemID)
				{
					if (e.entityLiving.worldObj.provider.dimensionId == DivineRPG.iceikaID)
					{
						e.ammount *= 0.2;
					}
				}
				
				//Divine
				else if (boots.itemID == DivineRPG.divineBoots.itemID
						&& legs.itemID == DivineRPG.divineLegs.itemID
						&& chest.itemID == DivineRPG.divineBody.itemID
						&& helm.itemID == DivineRPG.divineHead.itemID)
				{
					if (s == DamageSource.fall)
					{
						e.setCanceled(true);
					}
				}
				
				//Divine
				else if (boots.itemID == DivineRPG.mythrilBoots.itemID
						&& legs.itemID == DivineRPG.mythrilLegs.itemID
						&& chest.itemID == DivineRPG.mythrilBody.itemID
						&& helm.itemID == DivineRPG.mythrilHead.itemID)
				{
					if (s == DamageSource.fall)
					{
						e.setCanceled(true);
					}
				}
				
				//Uvite
				else if (boots.itemID == DivineRPG.energyCrystalBoots.itemID
						&& legs.itemID == DivineRPG.energyCrystalLegs.itemID
						&& chest.itemID == DivineRPG.energyCrystalBody.itemID
						&& helm.itemID == DivineRPG.energyCrystalHead.itemID)
				{
					if (s == DamageSource.cactus || s == DamageSource.fallingBlock || s == DamageSource.anvil || s == DamageSource.inWall)
					{
						e.setCanceled(true);
					}
				}
			}
		}
    }
	
	@ForgeSubscribe
    public void onLivingJumpEvent(LivingJumpEvent e)
	{
		if (e.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer var5 = (EntityPlayer)e.entityLiving;
			ItemStack boots = var5.inventory.armorInventory[0];
			ItemStack legs = var5.inventory.armorInventory[1];
			ItemStack chest = var5.inventory.armorInventory[2];
			ItemStack helm = var5.inventory.armorInventory[3];

			if (boots != null && legs != null && chest != null && helm != null)
			{
				//Mythril
				if (boots.itemID == DivineRPG.mythrilBoots.itemID
						&& legs.itemID == DivineRPG.mythrilLegs.itemID
						&& chest.itemID == DivineRPG.mythrilBody.itemID
						&& helm.itemID == DivineRPG.mythrilHead.itemID)
				{
					var5.addVelocity(0, 0.5D, 0);
				}//Divine
				if (boots.itemID == DivineRPG.divineBoots.itemID
						&& legs.itemID == DivineRPG.divineLegs.itemID
						&& chest.itemID == DivineRPG.divineBody.itemID
						&& helm.itemID == DivineRPG.divineHead.itemID)
				{
					var5.addVelocity(0, 0.2D, 0);
				}

			}
		}
    }
}
