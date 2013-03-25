package xolova.divinerpg.items.iceika;

import java.util.List;

import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.items.core.ItemDivineRPGRanged;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSoundOfCarols extends ItemDivineRPGRanged {

	public ItemSoundOfCarols(int par1) {
		super(par1, 4000, 16);
		setIconIndex(3, 15, 9);
    }

	@Override
	public Entity projectile(ItemStack stack, World world, EntityPlayer player) {
		return new EntityNoteProjectile(world, player);
	}
	
	@Override
	public String sound(ItemStack stack, World world, EntityPlayer player) {
		return "xolovon.SoundOfCarols";
	}

}
