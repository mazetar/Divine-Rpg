package xolova.divinerpg.blocks.arcana;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityPheonixAltar;

public class BlockPheonixAltar extends BlockContainer
{
    public BlockPheonixAltar(int id)
    {
        super(id, Material.rock);
    }

    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityPheonixAltar();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }
}
