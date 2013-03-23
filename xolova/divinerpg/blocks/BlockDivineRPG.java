package xolova.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import xolova.divinerpg.utils.helpers.IconHelper;
 
public class BlockDivineRPG extends Block 
{
	int index;
	int sheet;
	
	public BlockDivineRPG(int id, int sprite, Material mat) 
	{
		super(id, mat);
		this.index = sprite;
	}
 
	public BlockDivineRPG setIconIndex(int x, int y) 
	{
		index = (y * 16) + x;
		return this;
	}
	
	public BlockDivineRPG setTextureFile(String file) 
	{
		if(file.equals("/Xolovon.png"))
			file = "/Xolovon0.png"; //TODO Remove bandaid
		
		sheet = Integer.parseInt(file.replaceAll("/Xolovon", "").replaceAll(".png", ""));
		return this;
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister) 
	{
		IconHelper.massLoadBlockSprites(par1IconRegister);
	}
	
	@Override
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) 
	{
		return IconHelper.icons[sheet][index];
	}
	
	public int getTextureIndexFromSideAndMetadata(int par1, int par2)
	{
		return index;
	}	
}