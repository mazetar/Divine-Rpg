package xolova.divinerpg.items.iceika;

import java.util.List;

import xolova.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;
import xolova.divinerpg.items.core.ItemDivineRPGRanged;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFrostClawCannon extends ItemDivineRPGRanged {

	public ItemFrostClawCannon(int par1) {
		super(par1, 10000, 21);
		setAmmoID(Block.cactus.blockID);
		setIconIndex(3, 14, 14);
    }

	@Override
	public Entity projectile(ItemStack stack, World world, EntityPlayer player) {
		return new EntityFrostclawProjectile(world, player, dmg);
	}
	
	@Override
	public String sound(ItemStack stack, World world, EntityPlayer player) {
		return "xolovon.FrostclawCannon";
	}
	
}
