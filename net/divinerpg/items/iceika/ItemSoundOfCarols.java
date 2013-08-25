package net.divinerpg.items.iceika;

import net.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import net.divinerpg.items.core.ItemDivineRPGRanged;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
