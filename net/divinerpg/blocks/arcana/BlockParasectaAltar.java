package net.divinerpg.blocks.arcana;

import net.divinerpg.blocks.BlockDivineRPGContainer;
import net.divinerpg.blocks.arcana.tileentities.TileEntityParasectaAltar;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockParasectaAltar extends BlockDivineRPGContainer
{
    public BlockParasectaAltar(int id)
    {
        super(id, 4, Material.rock);
    }

    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityParasectaAltar();
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
