package net.divinerpg.items.iceika;

import java.util.List;

import net.divinerpg.entities.iceika.projectile.EntityIce;
import net.divinerpg.items.core.ItemDivineRPGRanged;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSerenadeOfIce extends ItemDivineRPGRanged {

	public ItemSerenadeOfIce(int id) {
		super(id, 100, 0);
	}

	@Override
	public Entity projectile(ItemStack stack, World world, EntityPlayer player) {
		return new EntityIce(world, player);
	}
	
	public String sound(ItemStack stack, World world, EntityPlayer player) {
		return "random.bow";
	};

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
    	par3List.add("Slows Target on Hit");
    }
}
