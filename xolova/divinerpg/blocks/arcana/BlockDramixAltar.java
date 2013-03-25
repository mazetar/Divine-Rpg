package xolova.divinerpg.blocks.arcana;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPGContainer;

public class BlockDramixAltar extends BlockDivineRPGContainer
{
    public BlockDramixAltar(int id)
    {
        super(id, 4, Material.rock);
    }

    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityDramixAltar();
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
