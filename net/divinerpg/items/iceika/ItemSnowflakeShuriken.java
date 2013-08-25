package net.divinerpg.items.iceika;

import net.divinerpg.entities.core.EntityDamageProjectile;
import net.divinerpg.items.core.ItemDivineRPGRangedConsumable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSnowflakeShuriken extends ItemDivineRPGRangedConsumable {

	public ItemSnowflakeShuriken(int id) {
		super(id, 7);
		setIconIndex(3, 5, 14);
	}

	@Override
	public Entity projectile(ItemStack stack, World world, EntityPlayer player) {
		EntityDamageProjectile projectile = new EntityDamageProjectile(world, player, dmg);
		projectile.setIcon(itemID);
		return projectile;
	}

}