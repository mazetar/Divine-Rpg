package xolova.divinerpg.blocks;

import xolova.divinerpg.api.IBlockDivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockDivineRPG extends Block implements IBlockDivineRPG
{
    public Icon[] texture;
	private String name;
	
	public int IconNumber;
	
	public BlockDivineRPG(int id, int IconNumber, Material par2Material) 
	{
		super(id, par2Material);
		this.IconNumber = IconNumber;
	}
	
    public Block setUnlocalizedName(String par1Str)
    {
        this.name = par1Str;
        return super.setUnlocalizedName(par1Str);
    }
	
    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister par1IconRegister)
    {
        this.texture = new Icon[IconNumber];

        for (int i = 0; i < this.texture.length; ++i)
        {
            this.texture[i] = par1IconRegister.func_94245_a(this.name + "_" + i);
        }
    }
}
