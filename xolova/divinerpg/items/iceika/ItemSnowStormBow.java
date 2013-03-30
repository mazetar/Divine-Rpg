package xolova.divinerpg.items.iceika;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.entities.overworld.projectile.EntityExplosiveArrow;
import xolova.divinerpg.items.core.ItemDivineRPGBow;

public class ItemSnowStormBow extends ItemDivineRPGBow {

    public ItemSnowStormBow(int var1) {
        super(var1, -1, 2, 144000, true);
		setIconIndex(3, 10, 14);
    }
    
    @Override
    public EntityArrow spawnArrow(ItemStack stack, World world, EntityPlayer player, float time) {
    	return new EntityExplosiveArrow(world, player, time);
    }
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
    	par3List.add("Shoots Explosive Arrows");
    }
    
	@Override
	public int getSheet(int meta, int pass) {
		return 3;
	}
	
	@Override
	public int getIndex(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useDuration) {
		return getIndex(0, 0) + getUseLevel(useDuration);
	}

}
