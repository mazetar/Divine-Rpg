package xolova.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.entities.iceika.projectile.EntityIce;
import xolova.divinerpg.items.core.ItemDivineRPGRanged;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSerenadeOfIce extends ItemDivineRPGRanged {

	public ItemSerenadeOfIce(int id) {
		super(id, 100, 0);
		setIconIndex(3, 8, 14);
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
