package net.divinerpg.utils.handlers;

import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ArmorEffectHandler  {
	
	@ForgeSubscribe
    public void onLivingHurtEvent(LivingHurtEvent e) {
		if (!(e.entityLiving instanceof EntityPlayer))
			return;
		
		EntityPlayer var5 = (EntityPlayer)e.entityLiving;
		ItemStack boots = var5.inventory.armorInventory[0];
		ItemStack legs = var5.inventory.armorInventory[1];
		ItemStack chest = var5.inventory.armorInventory[2];
		ItemStack helm = var5.inventory.armorInventory[3];

		int bootID = 0;
		int chestID = 0;
		int legID = 0;
		int helmID = 0;
		if (boots != null)
		{
			bootID = boots.itemID;
		}
		if (chest != null)
		{
			chestID = chest.itemID;
		}
		if (legs != null)
		{
			legID = legs.itemID;
		}
		if (helm != null)
		{
			helmID = helm.itemID;
		}
		DamageSource s = e.source;

		//Netherite
		/*if (bootID == DivineRPG.netheriteBoots.itemID
					&& legID == DivineRPG.netheriteLegs.itemID
					&& chestID == DivineRPG.netheriteBody.itemID
					&& helmID == DivineRPG.netheriteHead.itemID)
			{
				if (s.equals(DamageSource.inFire) || s.equals(DamageSource.onFire))
				{
					e.setCanceled(true);
				}
			}*/

		//Inferno
		/*else if (bootID == DivineRPG.infernoBoots.itemID
					&& legID == DivineRPG.infernoLegs.itemID
					&& chestID == DivineRPG.infernoBody.itemID
					&& helmID == DivineRPG.infernoHead.itemID)
			{
				if (s == DamageSource.inFire || s == DamageSource.onFire || s == DamageSource.lava)
				{
					e.setCanceled(true);
				}
			}

			//Wither Reaper
			else if (bootID == DivineRPG.grimReaperBoots.itemID
					&& legID == DivineRPG.grimReaperLegs.itemID
					&& chestID == DivineRPG.grimReaperBody.itemID
					&& helmID == DivineRPG.grimReaperHead.itemID)
			{
				if (s == DamageSource.wither)
				{
					e.setCanceled(true);
				}
			}*/

		//Ender
		/*else if (bootID == DivineRPG.enderBoots.itemID
					&& legID == DivineRPG.enderLegs.itemID
					&& chestID == DivineRPG.enderBody.itemID
					&& helmID == DivineRPG.enderHead.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}*/

		//Red Ender
		/*else if (bootID == DivineRPG.enderBootsRed.itemID
					&& legID == DivineRPG.enderLegsRed.itemID
					&& chestID == DivineRPG.enderBodyRed.itemID
					&& helmID == DivineRPG.enderHeadRed.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}*/

		//Blue Ender
		/*else if (bootID == DivineRPG.enderBootsBlue.itemID
					&& legID == DivineRPG.enderLegsBlue.itemID
					&& chestID == DivineRPG.enderBodyBlue.itemID
					&& helmID == DivineRPG.enderHeadBlue.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}

			//Green Ender
			else if (bootID == DivineRPG.enderBootsGreen.itemID
					&& legID == DivineRPG.enderLegsGreen.itemID
					&& chestID == DivineRPG.enderBodyGreen.itemID
					&& helmID == DivineRPG.enderHeadGreen.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}*/

		//Yellow Ender
		/*else if (bootID == DivineRPG.enderBootsYellow.itemID
					&& legID == DivineRPG.enderLegsYellow.itemID
					&& chestID == DivineRPG.enderBodyYellow.itemID
					&& helmID == DivineRPG.enderHeadYellow.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}*/

		//Black Ender
		/*else if (bootID == DivineRPG.enderBootsBlack.itemID
					&& legID == DivineRPG.enderLegsBlack.itemID
					&& chestID == DivineRPG.enderBodyBlack.itemID
					&& helmID == DivineRPG.enderHeadBlack.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}*/

		//Bedrock
		/*else if (bootID == DivineRPG.bedrockBoots.itemID
					&& legID == DivineRPG.bedrockLegs.itemID
					&& chestID == DivineRPG.bedrockBody.itemID
					&& helmID == DivineRPG.bedrockHead.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2 ||
						s == DamageSource.lava || s == DamageSource.inFire || s == DamageSource.onFire)
				{
					e.setCanceled(true);
				}
			}*/

		//Elite Realmite
		/*else if (bootID == DivineRPG.eliteRealmiteBoots.itemID
					&& legID == DivineRPG.eliteRealmiteLegs.itemID
					&& chestID == DivineRPG.eliteRealmiteBody.itemID
					&& helmID == DivineRPG.eliteRealmiteHead.itemID)
			{
				if (s == DamageSource.fall)
				{
					e.setCanceled(true);
				}
			}*/

		//Arlemite
		/*else if (bootID == DivineRPG.crystonalBoots.itemID
					&& legID == DivineRPG.crystonalLegs.itemID
					&& chestID == DivineRPG.crystonalBody.itemID
					&& helmID == DivineRPG.crystonalHead.itemID)
			{
				if (s.isProjectile() || s.damageType.equals("thrown"))
				{
					e.ammount *= 0.2;
				}
			}*/

		//Rupee
		/*else if (bootID == DivineRPG.plasmaBoots.itemID
					&& legID == DivineRPG.plasmaLegs.itemID
					&& chestID == DivineRPG.plasmaBody.itemID
					&& helmID == DivineRPG.plasmaHead.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//Rupee Red
		/*else if (bootID == DivineRPG.plasmaBootsRed.itemID
					&& legID == DivineRPG.plasmaLegsRed.itemID
					&& chestID == DivineRPG.plasmaBodyRed.itemID
					&& helmID == DivineRPG.plasmaHeadRed.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//Rupee Green
		/*else if (bootID == DivineRPG.plasmaBootsGreen.itemID
					&& legID == DivineRPG.plasmaLegsGreen.itemID
					&& chestID == DivineRPG.plasmaBodyGreen.itemID
					&& helmID == DivineRPG.plasmaHeadGreen.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//Rupee Yellow
		/*else if (bootID == DivineRPG.plasmaBootsYellow.itemID
					&& legID == DivineRPG.plasmaLegsYellow.itemID
					&& chestID == DivineRPG.plasmaBodyYellow.itemID
					&& helmID == DivineRPG.plasmaHeadYellow.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//Rupee Blue
		/*else if (bootID == DivineRPG.plasmaBootsBlue.itemID
					&& legID == DivineRPG.plasmaLegsBlue.itemID
					&& chestID == DivineRPG.plasmaBodyBlue.itemID
					&& helmID == DivineRPG.plasmaHeadBlue.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//Rupee Black
		/*else if (bootID == DivineRPG.plasmaBootsBlack.itemID
					&& legID == DivineRPG.plasmaLegsBlack.itemID
					&& chestID == DivineRPG.plasmaBodyBlack.itemID
					&& helmID == DivineRPG.plasmaHeadBlack.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//santa TODO Change to elseif
		if (bootID == IceikaItemHelper.santaBoots.itemID
				&& legID == IceikaItemHelper.santaLegs.itemID
				&& chestID == IceikaItemHelper.santaBody.itemID
				&& helmID == IceikaItemHelper.santaHelmet.itemID)
		{
			/*if (e.entityLiving.worldObj.provider.dimensionId == DivineRPG.iceikaID)
			{
				e.ammount *= 0.2;
			}*/
		}

		//Divine
		/*else if (bootID == DivineRPG.divineBoots.itemID
					&& legID == DivineRPG.divineLegs.itemID
					&& chestID == DivineRPG.divineBody.itemID
					&& helmID == DivineRPG.divineHead.itemID)
			{
				if (s == DamageSource.fall)
				{
					e.setCanceled(true);
				}
			}*/

		//Divine
		/*else if (bootID == DivineRPG.mythrilBoots.itemID
					&& legID == DivineRPG.mythrilLegs.itemID
					&& chestID == DivineRPG.mythrilBody.itemID
					&& helmID == DivineRPG.mythrilHead.itemID)
			{
				if (s == DamageSource.fall)
				{
					e.setCanceled(true);
				}
			}*/

		//Uvite
		/*else if (bootID == DivineRPG.energyCrystalBoots.itemID
					&& legID == DivineRPG.energyCrystalLegs.itemID
					&& chestID == DivineRPG.energyCrystalBody.itemID
					&& helmID == DivineRPG.energyCrystalHead.itemID)
			{
				if (s == DamageSource.cactus || s == DamageSource.fallingBlock || s == DamageSource.anvil || s == DamageSource.inWall)
				{
					e.setCanceled(true);
				}
			}*/

		//Degraded Melee
		/*else if (helmID == DivineRPG.degradedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.degradedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.degradedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.degradedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//Degraded Ranged
		/*else if (helmID == DivineRPG.degradedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.degradedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.degradedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.degradedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//Degraded Arcana
		/*else if (helmID == DivineRPG.degradedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.degradedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.degradedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.degradedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//glistening Melee
		/*else if (helmID == DivineRPG.glisteningHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.glisteningChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.glisteningLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.glisteningBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//glistening Ranged
		/*else if (helmID == DivineRPG.glisteningHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.glisteningChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.glisteningLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.glisteningBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//glistening Arcana
		/*else if (helmID == DivineRPG.glisteningHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.glisteningChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.glisteningLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.glisteningBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//finished Melee
		/*else if (helmID == DivineRPG.finishedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.finishedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.finishedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.finishedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//finished Ranged
		/*else if (helmID == DivineRPG.finishedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.finishedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.finishedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.finishedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//finished Arcana
		/*else if (helmID == DivineRPG.finishedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.finishedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.finishedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.finishedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//demonized Melee
		/*else if (helmID == DivineRPG.demonizedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.demonizedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.demonizedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.demonizedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//demonized Ranged
		/*else if (helmID == DivineRPG.demonizedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.demonizedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.demonizedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.demonizedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//demonized Arcana
		/*else if (helmID == DivineRPG.demonizedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.demonizedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.demonizedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.demonizedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//tormented Melee
		/*else if (helmID == DivineRPG.tormentedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.tormentedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.tormentedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.tormentedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//tormented Ranged
		/*else if (helmID == DivineRPG.tormentedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.tormentedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.tormentedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.tormentedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/

		//tormented Arcana
		/*else if (helmID == DivineRPG.tormentedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.tormentedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.tormentedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.tormentedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/
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
			int bootID = 0;
			int chestID = 0;
			int legID = 0;
			int helmID = 0;
			if (boots != null)
			{
				bootID = boots.itemID;
			}
			if (chest != null)
			{
				chestID = chest.itemID;
			}
			if (legs != null)
			{
				legID = legs.itemID;
			}
			if (helm != null)
			{
				helmID = helm.itemID;
			}
			//Mythril
			/*if (bootID == DivineRPG.mythrilBoots.itemID
						&& legID == DivineRPG.mythrilLegs.itemID
						&& chestID == DivineRPG.mythrilBody.itemID
						&& helmID == DivineRPG.mythrilHead.itemID)
				{
					var5.addVelocity(0, 0.5D, 0);
				}*/
	
			//Divine
			/*else if (bootID == DivineRPG.divineBoots.itemID
						&& legID == DivineRPG.divineLegs.itemID
						&& chestID == DivineRPG.divineBody.itemID
						&& helmID == DivineRPG.divineHead.itemID)
				{
					var5.addVelocity(0, 0.2D, 0);
				}
			 */
			//glistening
			/*else if (helmID == DivineRPG.glisteningHelmetArcana.itemID
						&& legID == DivineRPG.glisteningLegs.itemID
						&& chestID == DivineRPG.glisteningChest.itemID
						&& bootID == DivineRPG.glisteningBoots.itemID)
				{
					var5.addVelocity(0, 0.2D, 0);
				}*/
	
			//demonized
			/*else if (helmID == DivineRPG.demonizedHelmetArcana.itemID
						&& legID == DivineRPG.demonizedLegs.itemID
						&& chestID == DivineRPG.demonizedChest.itemID
						&& bootID == DivineRPG.demonizedBoots.itemID)
				{
					var5.addVelocity(0, 0.3D, 0);
				}*/
	
			//tormented
			/*else if (helmID == DivineRPG.tormentedHelmetArcana.itemID
						&& legID == DivineRPG.tormentedLegs.itemID
						&& chestID == DivineRPG.tormentedChest.itemID
						&& bootID == DivineRPG.tormentedBoots.itemID)
				{
					var5.addVelocity(0, 0.4D, 0);
				}*/
		}
    }
	
	private boolean isRanged(DamageSource s)
	{
		if (s.isProjectile() || s.damageType.equals("thrown"))
		{
			return true;
		}
		return false;
	}
	
	private boolean isArcana(DamageSource s)
	{
		if (s.isMagicDamage())
		{
			return true;
		}
		return false;
	}
	
	private boolean isMelee(DamageSource s)
	{
		if (!s.isProjectile() && !s.isFireDamage() && !s.isMagicDamage() 
				&& !this.isExplosion(s) && s != DamageSource.fall && s != DamageSource.cactus
				&& s != DamageSource.wither && s != DamageSource.starve)
		{
			return true;
		}
		return false;
	}
	
	private boolean isExplosion(DamageSource s)
	{
		return s.damageType.contains("explosion");
	}
}
