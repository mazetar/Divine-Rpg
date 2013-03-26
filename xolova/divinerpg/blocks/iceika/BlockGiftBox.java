package xolova.divinerpg.blocks.iceika;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPGContainer;
import xolova.divinerpg.blocks.core.tileentities.TileSingularChest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGiftBox extends BlockDivineRPGContainer {

	public BlockGiftBox(int var1) {
		super(var1, 198, Material.wood);
		setCreativeTab(CreativeTabs.tabDecorations);
	}

	@SideOnly(Side.CLIENT)
	public int getIndex(int side, int metadata) {
		return side == 1 || side == 0 ? 197 : 198;
	}

	
	@Override
	public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6) {
		Random random = var1.rand;
		TileSingularChest var7 = (TileSingularChest)var1.getBlockTileEntity(var2, var3, var4);

		if (var7 != null)
			for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8) {
				ItemStack var9 = var7.getStackInSlot(var8);

				if (var9 != null) {
					float var10 = random.nextFloat() * 0.8F + 0.1F;
					float var11 = random.nextFloat() * 0.8F + 0.1F;
					EntityItem var12;

					for (float var13 = random.nextFloat() * 0.8F + 0.1F; var9.stackSize > 0; var1.spawnEntityInWorld(var12)) {
						int var14 = random.nextInt(21) + 10;

						if (var14 > var9.stackSize)
							var14 = var9.stackSize;

						var9.stackSize -= var14;
						var12 = new EntityItem(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var13), new ItemStack(var9.itemID, var14, var9.getItemDamage()));
						float var15 = 0.05F;
						var12.motionX = (double)((float)random.nextGaussian() * var15);
						var12.motionY = (double)((float)random.nextGaussian() * var15 + 0.2F);
						var12.motionZ = (double)((float)random.nextGaussian() * var15);

						if (var9.hasTagCompound())
							var12.getEntityItem().setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
					}
				}
			}
			
		super.breakBlock(var1, var2, var3, var4, var5, var6);
	}
	 
	 public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9) {
		 if (var1.isRemote)
			 return true;
		 else {
			 var5.displayGUIChest((TileSingularChest)var1.getBlockTileEntity(var2, var3, var4));
			 return true;
		 }
	 }
	 
	 @Override
	 public TileEntity createNewTileEntity(World var1) {
		 return new TileSingularChest();
	 }
}
